package typings.webix.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeStore extends js.Object {
  var name: String = js.native
  def add(obj: js.Any): String = js.native
  def add(obj: js.Any, index: js.UndefOr[scala.Nothing], parentId: String): String = js.native
  def add(obj: js.Any, index: Double): String = js.native
  def add(obj: js.Any, index: Double, parentId: String): String = js.native
  def changeId(old: String, newid: String): Unit = js.native
  def changeId(old: String, newid: Double): Unit = js.native
  def changeId(old: Double, newid: String): Unit = js.native
  def changeId(old: Double, newid: Double): Unit = js.native
  def clearAll(): Unit = js.native
  def clearAll(soft: Boolean): Unit = js.native
  def count(): Double = js.native
  def each(code: WebixCallback, master: js.Any, all: Boolean, pid: String): Unit = js.native
  def eachChild(pid: String, code: WebixCallback): Unit = js.native
  def eachChild(pid: String, code: WebixCallback, master: js.UndefOr[scala.Nothing], all: Boolean): Unit = js.native
  def eachChild(pid: String, code: WebixCallback, master: js.Any): Unit = js.native
  def eachChild(pid: String, code: WebixCallback, master: js.Any, all: Boolean): Unit = js.native
  def eachLeaf(pid: String, code: WebixCallback): Unit = js.native
  def eachOpen(code: WebixCallback): Unit = js.native
  def eachOpen(code: WebixCallback, master: js.UndefOr[scala.Nothing], pid: String): Unit = js.native
  def eachOpen(code: WebixCallback, master: js.Any): Unit = js.native
  def eachOpen(code: WebixCallback, master: js.Any, pid: String): Unit = js.native
  def eachSubItem(pid: String, code: WebixCallback): Unit = js.native
  def getBranch(id: String): js.Array[_] = js.native
  def getBranchIndex(id: String): Double = js.native
  def getBranchIndex(id: String, parent: String): Double = js.native
  def getBranchIndex(id: String, parent: Double): Double = js.native
  def getBranchIndex(id: Double): Double = js.native
  def getBranchIndex(id: Double, parent: String): Double = js.native
  def getBranchIndex(id: Double, parent: Double): Double = js.native
  def getFirstChildId(id: String): String = js.native
  def getFirstChildId(id: Double): String = js.native
  def getNextSiblingId(id: String): String | Double = js.native
  def getNextSiblingId(id: Double): String | Double = js.native
  def getParentId(id: String): String | Double = js.native
  def getParentId(id: Double): String | Double = js.native
  def getPrevSiblingId(id: String): String | Double = js.native
  def getPrevSiblingId(id: Double): String | Double = js.native
  def getTopRange(): js.Array[_] = js.native
  def isBranch(id: String): Boolean = js.native
  def isBranch(id: Double): Boolean = js.native
  def provideApi(target: js.Any, eventable: Boolean): Unit = js.native
  def remove(id: String): Unit = js.native
  def remove(id: js.Array[_]): Unit = js.native
  def remove(id: Double): Unit = js.native
  def serialize(): js.Array[_] = js.native
  def serialize(all: Boolean): js.Array[_] = js.native
}

@JSImport("webix", "TreeStore")
@js.native
object TreeStore extends TopLevel[TreeStore]

