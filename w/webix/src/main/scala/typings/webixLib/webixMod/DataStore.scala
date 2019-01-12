package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataStore extends js.Object {
  var driver: js.Any = js.native
  var name: java.lang.String = js.native
  var order: js.Array[_] = js.native
  var pull: js.Any = js.native
  var sorting: js.Any = js.native
  def add(obj: js.Any): java.lang.String | scala.Double = js.native
  def add(obj: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
  def addMark(id: java.lang.String, name: java.lang.String): js.Any = js.native
  def addMark(id: java.lang.String, name: java.lang.String, css: scala.Boolean): js.Any = js.native
  def addMark(id: java.lang.String, name: java.lang.String, css: scala.Boolean, value: js.Any): js.Any = js.native
  def attachEvent(`type`: java.lang.String, functor: webixLib.WebixCallback): java.lang.String | scala.Double = js.native
  def attachEvent(`type`: java.lang.String, functor: webixLib.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
  def blockEvent(): scala.Unit = js.native
  def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
  def changeId(old: java.lang.String, newid: java.lang.String): scala.Unit = js.native
  def changeId(old: java.lang.String, newid: scala.Double): scala.Unit = js.native
  def changeId(old: scala.Double, newid: java.lang.String): scala.Unit = js.native
  def changeId(old: scala.Double, newid: scala.Double): scala.Unit = js.native
  def clearAll(): scala.Unit = js.native
  def clearAll(soft: scala.Boolean): scala.Unit = js.native
  def clearMark(name: java.lang.String): scala.Unit = js.native
  def count(): scala.Double = js.native
  def destructor(): scala.Unit = js.native
  def detachEvent(id: java.lang.String): scala.Unit = js.native
  def each(method: webixLib.WebixCallback): scala.Unit = js.native
  def each(method: webixLib.WebixCallback, master: js.Any): scala.Unit = js.native
  def each(method: webixLib.WebixCallback, master: js.Any, all: scala.Boolean): scala.Unit = js.native
  def exists(id: java.lang.String): scala.Boolean = js.native
  def exists(id: scala.Double): scala.Boolean = js.native
  def filter(text: webixLib.WebixCallback | webixLib.WebixTemplate): scala.Unit = js.native
  def filter(text: webixLib.WebixCallback | webixLib.WebixTemplate, value: java.lang.String): scala.Unit = js.native
  def filter(
    text: webixLib.WebixCallback | webixLib.WebixTemplate,
    value: java.lang.String,
    preserve: scala.Boolean
  ): scala.Unit = js.native
  def filter(text: java.lang.String): scala.Unit = js.native
  def filter(text: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def filter(text: java.lang.String, value: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
  def find(criterion: webixLib.WebixCallback): js.Any = js.native
  def find(criterion: webixLib.WebixCallback, first: scala.Boolean): js.Any = js.native
  def getFirstId(): java.lang.String | scala.Double = js.native
  def getIdByIndex(index: scala.Double): java.lang.String | scala.Double = js.native
  def getIndexById(id: java.lang.String): scala.Double = js.native
  def getIndexById(id: scala.Double): scala.Double = js.native
  def getIndexRange(from: java.lang.String, to: java.lang.String): js.Array[_] = js.native
  def getIndexRange(from: java.lang.String, to: scala.Double): js.Array[_] = js.native
  def getIndexRange(from: scala.Double, to: java.lang.String): js.Array[_] = js.native
  def getIndexRange(from: scala.Double, to: scala.Double): js.Array[_] = js.native
  def getItem(id: java.lang.String): js.Any = js.native
  def getItem(id: scala.Double): js.Any = js.native
  def getLastId(): java.lang.String | scala.Double = js.native
  def getMark(id: java.lang.String, mark_name: java.lang.String): js.Any = js.native
  def getNextId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
  def getNextId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
  def getPrevId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
  def getPrevId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
  def getRange(from: java.lang.String, to: java.lang.String): js.Array[_] = js.native
  def getRange(from: java.lang.String, to: scala.Double): js.Array[_] = js.native
  def getRange(from: scala.Double, to: java.lang.String): js.Array[_] = js.native
  def getRange(from: scala.Double, to: scala.Double): js.Array[_] = js.native
  def hasEvent(name: java.lang.String): scala.Boolean = js.native
  def id(item: js.Any): java.lang.String | scala.Double = js.native
  def importData(source: webixLib.webixMod.uiNs.baseview): scala.Unit = js.native
  def mapEvent(map: js.Any): scala.Unit = js.native
  def move(sid: java.lang.String, tindex: scala.Double): java.lang.String = js.native
  def move(sid: java.lang.String, tindex: scala.Double, tobj: js.Any): java.lang.String = js.native
  def move(sid: java.lang.String, tindex: scala.Double, tobj: js.Any, details: js.Any): java.lang.String = js.native
  def provideApi(target: js.Any, eventable: scala.Boolean): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def refresh(id: java.lang.String): scala.Unit = js.native
  def refresh(id: scala.Double): scala.Unit = js.native
  def remove(id: java.lang.String): scala.Unit = js.native
  def remove(id: scala.Double): scala.Unit = js.native
  def removeMark(id: java.lang.String, name: java.lang.String, css: scala.Boolean): scala.Unit = js.native
  def scheme(config: js.Any): scala.Unit = js.native
  def serialize(): js.Array[_] = js.native
  def setDriver(`type`: java.lang.String): scala.Unit = js.native
  def silent(code: webixLib.WebixCallback): scala.Unit = js.native
  def sort(by: java.lang.String): scala.Unit = js.native
  def sort(by: java.lang.String, dir: java.lang.String): scala.Unit = js.native
  def sort(by: java.lang.String, dir: java.lang.String, as: java.lang.String): scala.Unit = js.native
  def sync(source: js.Any, filter: webixLib.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
  def unblockEvent(): scala.Unit = js.native
  def unsync(): scala.Unit = js.native
  def updateItem(id: java.lang.String, data: js.Any): scala.Unit = js.native
  def updateItem(id: scala.Double, data: js.Any): scala.Unit = js.native
}

