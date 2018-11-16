package typings
package webgmeLib.GmeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * https://github.com/webgme/webgme/wiki/GME-Client-API
     * 
     * https://github.com/webgme/webgme/blob/master/src/client/js/client.js
     */
@JSGlobal("Gme.Client")
@js.native
class Client () extends js.Object {
  /**
          * assign a node to a set
          * The source and target should already be loaded.
          */
  def addMember(
    sourceNodeId: webgmeLib.GmeCommonNs.NodeId,
    targetNodeId: webgmeLib.GmeCommonNs.NodeId,
    setName: java.lang.String,
    message: java.lang.String
  ): webgmeLib.GmeCommonNs.Pointer = js.native
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
  def addUI(pattern: js.Any, eventHandler: TerritoryEventHandler): java.lang.String = js.native
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
  def addUI(pattern: js.Any, eventHandler: TerritoryEventHandler, guid: TerritoryId): java.lang.String = js.native
  def completeTransaction(message: java.lang.String, callback: webgmeLib.GmeCommonNs.ResultCallback[TransactionResult]): scala.Unit = js.native
  /**
           * Connecting to the webGME database.
           */
  def connectToDatabase(callback: webgmeLib.GmeCommonNs.ResultCallback[Connection]): scala.Unit = js.native
  def createChild(params: ChildCreationParams, message: java.lang.String): scala.Unit = js.native
  def delMoreNodes(nodeIds: js.Array[webgmeLib.GmeCommonNs.NodeId], message: java.lang.String): scala.Unit = js.native
  /**
           * Get an array of all the META nodes as nodeObjs.
           * Since these may change it is a good idea to invoke 
           * this each time the territory of the root changes.
           */
  def getAllMetaNodes(): js.Array[webgmeLib.CoreNs.Node] = js.native
  /**
           * Typically called from within the event-handler.
           */
  def getNode(nodeId: webgmeLib.GmeCommonNs.NodeId): webgmeLib.CoreNs.Node = js.native
  /**
           * asIndexed true to get an object indexed by project ids.
           */
  def getProjectsAndBranches(asIndexed: scala.Boolean, callback: webgmeLib.GmeCommonNs.ResultCallback[ProjectResult]): scala.Unit = js.native
  /**
           * make a new pointer object.
           * The source and target should already be loaded.
           */
  def makePointer(
    sourceNodeId: webgmeLib.GmeCommonNs.NodeId,
    pointerName: java.lang.String,
    targetNodeId: webgmeLib.GmeCommonNs.NodeId,
    message: java.lang.String
  ): webgmeLib.GmeCommonNs.Pointer = js.native
  /**
           * When we are no longer interested in the the 
           * nodes for the userId so we remove the user. 
           * This will prevent further invocations of
           * our eventHandler and it will be cleaned up.
           */
  def removeUI(userId: java.lang.String): scala.Unit = js.native
  /**
           * The client opens a project and a branch and 
           * from there we can start registering for node events.
           */
  def selectProject(
    projectId: java.lang.String,
    branchName: java.lang.String,
    callback: webgmeLib.GmeCommonNs.ResultCallback[_]
  ): scala.Unit = js.native
  def setAttributeSchema(nodeId: java.lang.String, name: java.lang.String, schema: AttributeSchema): scala.Unit = js.native
  def setAttributes(
    nodeId: webgmeLib.GmeCommonNs.NodeId,
    name: java.lang.String,
    newName: java.lang.String,
    message: java.lang.String
  ): scala.Unit = js.native
  def setPointerMeta(metaNodeId: webgmeLib.GmeCommonNs.NodeId, newPointerName: java.lang.String, meta: PointerMeta): scala.Unit = js.native
  def setRegistry(
    nodeId: webgmeLib.GmeCommonNs.NodeId,
    attr: java.lang.String,
    property: js.Any,
    message: java.lang.String
  ): scala.Unit = js.native
  /**
           * Transactions
           */
  def startTransaction(message: java.lang.String): scala.Unit = js.native
  /**
           * Initiate the initial load of nodes matching the patterns.
           */
  def updateTerritory(userId: java.lang.String, patterns: webgmeLib.GmeCommonNs.Dictionary[TerritoryPattern]): scala.Unit = js.native
  def updateValidChildrenItem(nodeId: webgmeLib.GmeCommonNs.NodeId, `type`: ChildType): scala.Unit = js.native
}

