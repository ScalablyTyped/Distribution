package typings.webix.webix.ui

import typings.webix.webix.DataCollection
import typings.webix.webix.DataStore
import typings.webix.webix.WebixCallback
import typings.webix.webix.WebixTemplate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait kanban
  extends StObject
     with baseview {
  
  def add(obj: js.Any): String | Double = js.native
  def add(obj: js.Any, index: Double): String | Double = js.native
  
  def addView(view: js.Any): String | Double = js.native
  def addView(view: js.Any, index: Double): String | Double = js.native
  
  def attachEvent(`type`: kanbanEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: kanbanEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[js.Any]): Boolean = js.native
  
  def clearAll(): Unit = js.native
  def clearAll(soft: Boolean): Unit = js.native
  
  @JSName("config")
  var config_kanban: kanbanConfig = js.native
  
  def copy(id: String): Unit = js.native
  def copy(id: Double): Unit = js.native
  
  def count(): Double = js.native
  
  var data: DataStore = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def eachList(func: WebixCallback): Unit = js.native
  
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
  
  def getColors(): DataCollection = js.native
  
  def getComments(): baseview = js.native
  
  def getEditor(): baseview = js.native
  
  def getFirstId(): Double | String = js.native
  
  def getIdByIndex(index: String): String | Double = js.native
  def getIdByIndex(index: Double): String | Double = js.native
  
  def getIndexById(id: String): Double = js.native
  def getIndexById(id: Double): Double = js.native
  
  def getItem(id: String): js.Any = js.native
  def getItem(id: Double): js.Any = js.native
  
  def getLastId(): Double | String = js.native
  
  def getMenu(): baseview = js.native
  
  def getNextId(id: String, step: Double): String | Double = js.native
  def getNextId(id: Double, step: Double): String | Double = js.native
  
  def getOwnerList(itemId: String): js.Any = js.native
  def getOwnerList(itemId: Double): js.Any = js.native
  
  def getPrevId(id: String, step: Double): String | Double = js.native
  def getPrevId(id: Double, step: Double): String | Double = js.native
  
  def getSelectedId(): String | Double = js.native
  
  def getStatuses(): js.Array[js.Any] = js.native
  
  def getTags(): DataCollection = js.native
  
  def getUserList(): baseview = js.native
  
  def getUsers(): DataCollection = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def index(obj: js.Any): Double = js.native
  
  def load(url: String): js.Promise[js.Any] = js.native
  def load(url: String, `type`: String): js.Promise[js.Any] = js.native
  def load(url: String, `type`: String, callback: WebixCallback): js.Promise[js.Any] = js.native
  def load(url: String, `type`: Unit, callback: WebixCallback): js.Promise[js.Any] = js.native
  
  def loadNext(count: Double, start: Double, callback: WebixCallback, url: String, now: Boolean): js.Promise[js.Any] = js.native
  
  def mapEvent(map: js.Any): Unit = js.native
  
  def parse(data: js.Any, `type`: String): Unit = js.native
  
  def reconstruct(): Unit = js.native
  
  def refresh(): Unit = js.native
  def refresh(id: String): Unit = js.native
  def refresh(id: Double): Unit = js.native
  
  def remove(id: String): Unit = js.native
  def remove(id: js.Array[js.Any]): Unit = js.native
  def remove(id: Double): Unit = js.native
  
  def removeView(id: js.Any): Unit = js.native
  
  def resizeChildren(): Unit = js.native
  
  def restore(state: js.Any): Unit = js.native
  def restore(state: js.Any, factory: WebixCallback): Unit = js.native
  
  def select(id: String): Unit = js.native
  def select(id: Double): Unit = js.native
  
  def serialize(): js.Array[js.Any] = js.native
  def serialize(all: Boolean): js.Array[js.Any] = js.native
  
  def showBatch(name: String): Unit = js.native
  def showBatch(name: String, mode: Boolean): Unit = js.native
  
  def showEditor(): Unit = js.native
  def showEditor(obj: js.Any): Unit = js.native
  
  def sort(by: String): Unit = js.native
  def sort(by: String, dir: String): Unit = js.native
  def sort(by: String, dir: String, as: String): Unit = js.native
  def sort(by: String, dir: Unit, as: String): Unit = js.native
  
  def sync(source: js.Any, filter: WebixCallback, silent: Boolean): Unit = js.native
  
  def unblockEvent(): Unit = js.native
  
  def updateItem(id: String, data: js.Any): Unit = js.native
  def updateItem(id: Double, data: js.Any): Unit = js.native
  
  var waitData: js.Promise[js.Any] = js.native
  
  def waitSave(handler: WebixCallback): js.Promise[js.Any] = js.native
}
