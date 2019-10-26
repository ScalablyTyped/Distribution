package typings.typescriptDashCollections.distLibMultiRootTreeMod

import org.scalablytyped.runtime.StringDictionary
import typings.typescriptDashCollections.Anon_Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiRootTree extends js.Object {
  var nodes: StringDictionary[js.Array[String]] = js.native
  var rootIds: js.Array[String] = js.native
  def createEmptyNodeIfNotExist(nodeKey: String): Unit = js.native
  def deleteId(id: String): Unit = js.native
  /* private */ def findNode(nodeKey: js.Any): js.Any = js.native
  /* private */ def findNodeId(nodeKey: js.Any, id: js.Any): js.Any = js.native
  /* private */ def findRootId(id: js.Any): js.Any = js.native
  def flatten(): js.Array[FlatTreeNode] = js.native
  def getNodes(): StringDictionary[js.Array[String]] = js.native
  def getObject(): Anon_Id = js.native
  def getRootIds(): js.Array[String] = js.native
  def initNodes(): Unit = js.native
  def initRootIds(): Unit = js.native
  def insertIdAfterId(belowId: String, insertId: String): Unit = js.native
  def insertIdBeforeId(beforeId: String, insertId: String): Unit = js.native
  def insertIdIntoId(insideId: String, insertId: String): Unit = js.native
  def insertIdIntoNode(nodeKey: String, id: String): Unit = js.native
  def insertIdIntoNode(nodeKey: String, id: String, position: Double): Unit = js.native
  def insertIdIntoRoot(id: String): Unit = js.native
  def insertIdIntoRoot(id: String, position: Double): Unit = js.native
  /* private */ def moveId(moveId: js.Any, beforeId: js.Any, direction: js.Any): js.Any = js.native
  def moveIdAfterId(moveId: String, afterId: String): Unit = js.native
  def moveIdBeforeId(moveId: String, beforeId: String): Unit = js.native
  def moveIdIntoId(moveId: String, insideId: String): Unit = js.native
  def moveIdIntoId(moveId: String, insideId: String, atStart: Boolean): Unit = js.native
  /* private */ def nodeAndSubNodesDelete(nodeKey: js.Any): js.Any = js.native
  /* private */ def nodeDelete(nodeKey: js.Any): js.Any = js.native
  /* private */ def nodeDeleteAtIndex(nodeKey: js.Any, index: js.Any): js.Any = js.native
  /* private */ def nodeInsertAtEnd(nodeKey: js.Any, id: js.Any): js.Any = js.native
  /* private */ def nodeInsertAtStart(nodeKey: js.Any, id: js.Any): js.Any = js.native
  /* private */ def nodeRefrencesDelete(id: js.Any): js.Any = js.native
  /* private */ def rootDelete(index: js.Any): js.Any = js.native
  /* private */ def rootDeleteId(id: js.Any): js.Any = js.native
  /* private */ def rootInsertAtEnd(id: js.Any): js.Any = js.native
  /* private */ def rootInsertAtStart(id: js.Any): js.Any = js.native
  /* private */ def swapArrayElements(arr: js.Any, indexA: js.Any, indexB: js.Any): js.Any = js.native
  def swapRootIdWithRootId(rootId: String, withRootId: String): Unit = js.native
  def swapRootPositionWithRootPosition(swapRootPosition: Double, withRootPosition: Double): Unit = js.native
  def toObject(): Anon_Id = js.native
}

