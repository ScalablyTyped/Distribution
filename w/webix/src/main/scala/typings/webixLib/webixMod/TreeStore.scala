package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeStore extends js.Object {
  var name: java.lang.String = js.native
  def add(obj: js.Any): java.lang.String = js.native
  def add(obj: js.Any, index: scala.Double): java.lang.String = js.native
  def add(obj: js.Any, index: scala.Double, parentId: java.lang.String): java.lang.String = js.native
  def changeId(old: java.lang.String, newid: java.lang.String): scala.Unit = js.native
  def changeId(old: java.lang.String, newid: scala.Double): scala.Unit = js.native
  def changeId(old: scala.Double, newid: java.lang.String): scala.Unit = js.native
  def changeId(old: scala.Double, newid: scala.Double): scala.Unit = js.native
  def clearAll(): scala.Unit = js.native
  def clearAll(soft: scala.Boolean): scala.Unit = js.native
  def count(): scala.Double = js.native
  def each(code: webixLib.WebixCallback, master: js.Any, all: scala.Boolean, pid: java.lang.String): scala.Unit = js.native
  def eachChild(pid: java.lang.String, code: webixLib.WebixCallback): scala.Unit = js.native
  def eachChild(pid: java.lang.String, code: webixLib.WebixCallback, master: js.Any): scala.Unit = js.native
  def eachChild(pid: java.lang.String, code: webixLib.WebixCallback, master: js.Any, all: scala.Boolean): scala.Unit = js.native
  def eachLeaf(pid: java.lang.String, code: webixLib.WebixCallback): scala.Unit = js.native
  def eachOpen(code: webixLib.WebixCallback): scala.Unit = js.native
  def eachOpen(code: webixLib.WebixCallback, master: js.Any): scala.Unit = js.native
  def eachOpen(code: webixLib.WebixCallback, master: js.Any, pid: java.lang.String): scala.Unit = js.native
  def eachSubItem(pid: java.lang.String, code: webixLib.WebixCallback): scala.Unit = js.native
  def getBranch(id: java.lang.String): js.Array[_] = js.native
  def getBranchIndex(id: java.lang.String): scala.Double = js.native
  def getBranchIndex(id: java.lang.String, parent: java.lang.String): scala.Double = js.native
  def getBranchIndex(id: java.lang.String, parent: scala.Double): scala.Double = js.native
  def getBranchIndex(id: scala.Double): scala.Double = js.native
  def getBranchIndex(id: scala.Double, parent: java.lang.String): scala.Double = js.native
  def getBranchIndex(id: scala.Double, parent: scala.Double): scala.Double = js.native
  def getFirstChildId(id: java.lang.String): java.lang.String = js.native
  def getFirstChildId(id: scala.Double): java.lang.String = js.native
  def getNextSiblingId(id: java.lang.String): java.lang.String | scala.Double = js.native
  def getNextSiblingId(id: scala.Double): java.lang.String | scala.Double = js.native
  def getParentId(id: java.lang.String): java.lang.String | scala.Double = js.native
  def getParentId(id: scala.Double): java.lang.String | scala.Double = js.native
  def getPrevSiblingId(id: java.lang.String): java.lang.String | scala.Double = js.native
  def getPrevSiblingId(id: scala.Double): java.lang.String | scala.Double = js.native
  def getTopRange(): js.Array[_] = js.native
  def isBranch(id: java.lang.String): scala.Boolean = js.native
  def isBranch(id: scala.Double): scala.Boolean = js.native
  def provideApi(target: js.Any, eventable: scala.Boolean): scala.Unit = js.native
  def remove(id: java.lang.String): scala.Unit = js.native
  def remove(id: scala.Double): scala.Unit = js.native
  def serialize(): js.Array[_] = js.native
}

