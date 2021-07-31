package typings.webix.webix

import typings.webix.webix.ui.baseview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataStore extends StObject {
  
  def add(obj: js.Any): String | Double = js.native
  def add(obj: js.Any, index: Double): String | Double = js.native
  
  def addMark(id: String, name: String): js.Any = js.native
  def addMark(id: String, name: String, css: Boolean): js.Any = js.native
  def addMark(id: String, name: String, css: Boolean, value: js.Any): js.Any = js.native
  def addMark(id: String, name: String, css: Unit, value: js.Any): js.Any = js.native
  
  def attachEvent(`type`: String, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: String, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[js.Any]): Boolean = js.native
  
  def changeId(old: String, newid: String): Unit = js.native
  def changeId(old: String, newid: Double): Unit = js.native
  def changeId(old: Double, newid: String): Unit = js.native
  def changeId(old: Double, newid: Double): Unit = js.native
  
  def clearAll(): Unit = js.native
  def clearAll(soft: Boolean): Unit = js.native
  
  def clearMark(name: String): Unit = js.native
  
  def count(): Double = js.native
  
  def destructor(): Unit = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  var driver: js.Any = js.native
  
  def each(method: WebixCallback): Unit = js.native
  def each(method: WebixCallback, master: js.Any): Unit = js.native
  def each(method: WebixCallback, master: js.Any, all: Boolean): Unit = js.native
  def each(method: WebixCallback, master: Unit, all: Boolean): Unit = js.native
  
  def exists(id: String): Boolean = js.native
  def exists(id: Double): Boolean = js.native
  
  def filter(text: String): Unit = js.native
  def filter(text: String, value: String): Unit = js.native
  def filter(text: String, value: String, preserve: Boolean): Unit = js.native
  def filter(text: String, value: Unit, preserve: Boolean): Unit = js.native
  def filter(text: WebixCallback): Unit = js.native
  def filter(text: WebixCallback, value: String): Unit = js.native
  def filter(text: WebixCallback, value: String, preserve: Boolean): Unit = js.native
  def filter(text: WebixCallback, value: Unit, preserve: Boolean): Unit = js.native
  def filter(text: WebixTemplate): Unit = js.native
  def filter(text: WebixTemplate, value: String): Unit = js.native
  def filter(text: WebixTemplate, value: String, preserve: Boolean): Unit = js.native
  def filter(text: WebixTemplate, value: Unit, preserve: Boolean): Unit = js.native
  
  def find(criterion: WebixCallback): js.Any = js.native
  def find(criterion: WebixCallback, first: Boolean): js.Any = js.native
  
  def getFirstId(): Double | String = js.native
  
  def getIdByIndex(index: String): String | Double = js.native
  def getIdByIndex(index: Double): String | Double = js.native
  
  def getIndexById(id: String): Double = js.native
  def getIndexById(id: Double): Double = js.native
  
  def getIndexRange(from: String, to: String): js.Array[js.Any] = js.native
  def getIndexRange(from: String, to: Double): js.Array[js.Any] = js.native
  def getIndexRange(from: Double, to: String): js.Array[js.Any] = js.native
  def getIndexRange(from: Double, to: Double): js.Array[js.Any] = js.native
  
  def getItem(id: String): js.Any = js.native
  def getItem(id: Double): js.Any = js.native
  
  def getLastId(): Double | String = js.native
  
  def getMark(id: String, mark_name: String): js.Any = js.native
  def getMark(id: Double, mark_name: String): js.Any = js.native
  
  def getNextId(id: String, step: Double): String | Double = js.native
  def getNextId(id: Double, step: Double): String | Double = js.native
  
  def getPrevId(id: String, step: Double): String | Double = js.native
  def getPrevId(id: Double, step: Double): String | Double = js.native
  
  def getRange(from: String, to: String): js.Array[js.Any] = js.native
  def getRange(from: String, to: Double): js.Array[js.Any] = js.native
  def getRange(from: Double, to: String): js.Array[js.Any] = js.native
  def getRange(from: Double, to: Double): js.Array[js.Any] = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def id(item: js.Any): Double | String = js.native
  
  def importData(source: baseview): Unit = js.native
  
  def mapEvent(map: js.Any): Unit = js.native
  
  def move(sid: String, tindex: Double): String = js.native
  def move(sid: String, tindex: Double, tobj: js.Any): String = js.native
  def move(sid: String, tindex: Double, tobj: js.Any, details: js.Any): String = js.native
  def move(sid: String, tindex: Double, tobj: Unit, details: js.Any): String = js.native
  
  var name: String = js.native
  
  var order: js.Array[js.Any] = js.native
  
  def provideApi(target: js.Any, eventable: Boolean): Unit = js.native
  
  var pull: js.Any = js.native
  
  def refresh(): Unit = js.native
  def refresh(id: String): Unit = js.native
  def refresh(id: Double): Unit = js.native
  
  def remove(id: String): Unit = js.native
  def remove(id: js.Array[js.Any]): Unit = js.native
  def remove(id: Double): Unit = js.native
  
  def removeMark(id: String, name: String, css: Boolean): Unit = js.native
  def removeMark(id: Double, name: String, css: Boolean): Unit = js.native
  
  def scheme(config: js.Any): Unit = js.native
  
  def serialize(): js.Array[js.Any] = js.native
  def serialize(all: Boolean): js.Array[js.Any] = js.native
  
  def setDriver(`type`: String): Unit = js.native
  
  def silent(code: WebixCallback): Unit = js.native
  
  def sort(by: String): Unit = js.native
  def sort(by: String, dir: String): Unit = js.native
  def sort(by: String, dir: String, as: String): Unit = js.native
  def sort(by: String, dir: Unit, as: String): Unit = js.native
  
  var sorting: js.Any = js.native
  
  def sync(source: js.Any, filter: WebixCallback, silent: Boolean): Unit = js.native
  
  def unblockEvent(): Unit = js.native
  
  def unsync(): Unit = js.native
  
  def updateItem(id: String, data: js.Any): Unit = js.native
  def updateItem(id: Double, data: js.Any): Unit = js.native
}
