package typings.webgme.Gme

import typings.webgme.Core.Node
import typings.webgme.GmeCommon.Dictionary
import typings.webgme.GmeCommon.NodeId
import typings.webgme.GmeCommon.Pointer
import typings.webgme.GmeCommon.ResultCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * https://github.com/webgme/webgme/wiki/GME-Client-API
  * 
  * https://github.com/webgme/webgme/blob/master/src/client/js/client.js
  */
@js.native
trait Client extends StObject {
  
  /**
    * assign a node to a set
    * The source and target should already be loaded.
    */
  def addMember(sourceNodeId: NodeId, targetNodeId: NodeId, setName: String, message: String): Pointer = js.native
  
  /**
    * Add a user associated with the pattern and an event-handler.
    * The eventHandler is invoked whenever there are changes 
    * to the nodes matching any of the patterns.
    * There are three cases when it is triggered:
    * - **updateTerritory** was invoked by us.
    * - Another client made changes to nodes within the territory.
    * - We made changes to any of the nodes (via the setters).
    * 
    * Returns the user-id.
    */
  def addUI(pattern: js.Any, eventHandler: TerritoryEventHandler): String = js.native
  def addUI(pattern: js.Any, eventHandler: TerritoryEventHandler, guid: TerritoryId): String = js.native
  
  def completeTransaction(message: String, callback: ResultCallback[TransactionResult]): Unit = js.native
  
  /**
    * Connecting to the webGME database.
    */
  def connectToDatabase(callback: ResultCallback[Connection]): Unit = js.native
  
  def createChild(params: ChildCreationParams, message: String): Unit = js.native
  
  def delMoreNodes(nodeIds: js.Array[NodeId], message: String): Unit = js.native
  
  /**
    * Get an array of all the META nodes as nodeObjs.
    * Since these may change it is a good idea to invoke 
    * this each time the territory of the root changes.
    */
  def getAllMetaNodes(): js.Array[Node] = js.native
  
  /**
    * Typically called from within the event-handler.
    */
  def getNode(nodeId: NodeId): Node = js.native
  
  /**
    * asIndexed true to get an object indexed by project ids.
    */
  def getProjectsAndBranches(asIndexed: Boolean, callback: ResultCallback[ProjectResult]): Unit = js.native
  
  /**
    * make a new pointer object.
    * The source and target should already be loaded.
    */
  def makePointer(sourceNodeId: NodeId, pointerName: String, targetNodeId: NodeId, message: String): Pointer = js.native
  
  /**
    * When we are no longer interested in the the 
    * nodes for the userId so we remove the user. 
    * This will prevent further invocations of
    * our eventHandler and it will be cleaned up.
    */
  def removeUI(userId: String): Unit = js.native
  
  /**
    * The client opens a project and a branch and 
    * from there we can start registering for node events.
    */
  def selectProject(projectId: String, branchName: String, callback: ResultCallback[js.Any]): Unit = js.native
  
  def setAttributeSchema(nodeId: String, name: String, schema: AttributeSchema): Unit = js.native
  
  def setAttributes(nodeId: NodeId, name: String, newName: String, message: String): Unit = js.native
  
  def setPointerMeta(metaNodeId: NodeId, newPointerName: String, meta: PointerMeta): Unit = js.native
  
  def setRegistry(nodeId: NodeId, attr: String, property: js.Any, message: String): Unit = js.native
  
  /**
    * Transactions
    */
  def startTransaction(message: String): Unit = js.native
  
  /**
    * Initiate the initial load of nodes matching the patterns.
    */
  def updateTerritory(userId: String, patterns: Dictionary[TerritoryPattern]): Unit = js.native
  
  def updateValidChildrenItem(nodeId: NodeId, `type`: ChildType): Unit = js.native
}
