package typings.webix.webix

import typings.webix.webix.ui.baseview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeCollection extends StObject {
  
  def add(obj: js.Any): String = js.native
  def add(obj: js.Any, index: js.UndefOr[scala.Nothing], parentId: String): String = js.native
  def add(obj: js.Any, index: Double): String = js.native
  def add(obj: js.Any, index: Double, parentId: String): String = js.native
  
  def addBind(source: js.Any, rule: String, format: String): Unit = js.native
  
  def attachEvent(`type`: TreeCollectionEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: TreeCollectionEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def bind(target: js.Any): Unit = js.native
  def bind(target: js.Any, rule: js.UndefOr[scala.Nothing], format: String): Unit = js.native
  def bind(target: js.Any, rule: WebixCallback): Unit = js.native
  def bind(target: js.Any, rule: WebixCallback, format: String): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  
  def clearAll(): Unit = js.native
  def clearAll(soft: Boolean): Unit = js.native
  
  def clearValidation(): Unit = js.native
  
  var config: TreeCollectionConfig = js.native
  
  def copy(sid: String, tindex: Double): Unit = js.native
  def copy(sid: String, tindex: Double, tobj: js.UndefOr[scala.Nothing], details: js.Any): Unit = js.native
  def copy(sid: String, tindex: Double, tobj: js.Any): Unit = js.native
  def copy(sid: String, tindex: Double, tobj: js.Any, details: js.Any): Unit = js.native
  def copy(sid: Double, tindex: Double): Unit = js.native
  def copy(sid: Double, tindex: Double, tobj: js.UndefOr[scala.Nothing], details: js.Any): Unit = js.native
  def copy(sid: Double, tindex: Double, tobj: js.Any): Unit = js.native
  def copy(sid: Double, tindex: Double, tobj: js.Any, details: js.Any): Unit = js.native
  
  def count(): Double = js.native
  
  var data: DataStore = js.native
  
  def define(property: String, value: js.Any): Unit = js.native
  
  def destructor(): Unit = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def exists(id: String): Boolean = js.native
  def exists(id: Double): Boolean = js.native
  
  def filter(text: WebixCallback | WebixTemplate): Unit = js.native
  def filter(text: WebixCallback | WebixTemplate, value: js.UndefOr[scala.Nothing], preserve: Boolean): Unit = js.native
  def filter(text: WebixCallback | WebixTemplate, value: String): Unit = js.native
  def filter(text: WebixCallback | WebixTemplate, value: String, preserve: Boolean): Unit = js.native
  def filter(text: String): Unit = js.native
  def filter(text: String, value: js.UndefOr[scala.Nothing], preserve: Boolean): Unit = js.native
  def filter(text: String, value: String): Unit = js.native
  def filter(text: String, value: String, preserve: Boolean): Unit = js.native
  
  def find(criterion: WebixCallback): js.Any = js.native
  def find(criterion: WebixCallback, first: Boolean): js.Any = js.native
  
  def getBindData(key: String, update: Boolean): Unit = js.native
  def getBindData(key: Double, update: Boolean): Unit = js.native
  
  def getBranchIndex(id: String): Double = js.native
  def getBranchIndex(id: String, parent: String): Double = js.native
  def getBranchIndex(id: String, parent: Double): Double = js.native
  def getBranchIndex(id: Double): Double = js.native
  def getBranchIndex(id: Double, parent: String): Double = js.native
  def getBranchIndex(id: Double, parent: Double): Double = js.native
  
  def getCursor(): Double = js.native
  
  def getFirstChildId(id: String): String = js.native
  def getFirstChildId(id: Double): String = js.native
  
  def getFirstId(): Double | String = js.native
  
  def getIdByIndex(index: String): String | Double = js.native
  def getIdByIndex(index: Double): String | Double = js.native
  
  def getIndexById(id: String): Double = js.native
  def getIndexById(id: Double): Double = js.native
  
  def getItem(id: String): js.Any = js.native
  def getItem(id: Double): js.Any = js.native
  
  def getLastId(): Double | String = js.native
  
  def getNextId(id: String, step: Double): String | Double = js.native
  def getNextId(id: Double, step: Double): String | Double = js.native
  
  def getNextSiblingId(id: String): String | Double = js.native
  def getNextSiblingId(id: Double): String | Double = js.native
  
  def getParentId(id: String): String | Double = js.native
  def getParentId(id: Double): String | Double = js.native
  
  def getPrevId(id: String, step: Double): String | Double = js.native
  def getPrevId(id: Double, step: Double): String | Double = js.native
  
  def getPrevSiblingId(id: String): String | Double = js.native
  def getPrevSiblingId(id: Double): String | Double = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def isBranch(id: String): Boolean = js.native
  def isBranch(id: Double): Boolean = js.native
  
  def isVisible(): Boolean = js.native
  
  def load(url: String): js.Promise[_] = js.native
  def load(url: String, `type`: js.UndefOr[scala.Nothing], callback: WebixCallback): js.Promise[_] = js.native
  def load(url: String, `type`: String): js.Promise[_] = js.native
  def load(url: String, `type`: String, callback: WebixCallback): js.Promise[_] = js.native
  
  def loadBranch(id: String, callback: WebixCallback, url: String): js.Promise[_] = js.native
  def loadBranch(id: Double, callback: WebixCallback, url: String): js.Promise[_] = js.native
  
  def loadNext(count: Double, start: Double, callback: WebixCallback, url: String, now: Boolean): js.Promise[_] = js.native
  
  def mapEvent(map: js.Any): Unit = js.native
  
  def move(sid: String, tindex: Double): String | Double = js.native
  def move(sid: String, tindex: Double, tobj: js.UndefOr[scala.Nothing], details: js.Any): String | Double = js.native
  def move(sid: String, tindex: Double, tobj: baseview): String | Double = js.native
  def move(sid: String, tindex: Double, tobj: baseview, details: js.Any): String | Double = js.native
  def move(sid: Double, tindex: Double): String | Double = js.native
  def move(sid: Double, tindex: Double, tobj: js.UndefOr[scala.Nothing], details: js.Any): String | Double = js.native
  def move(sid: Double, tindex: Double, tobj: baseview): String | Double = js.native
  def move(sid: Double, tindex: Double, tobj: baseview, details: js.Any): String | Double = js.native
  
  def moveBottom(id: String): Unit = js.native
  def moveBottom(id: Double): Unit = js.native
  
  def moveTop(id: String): Unit = js.native
  def moveTop(id: Double): Unit = js.native
  
  var name: String = js.native
  
  def parse(data: js.Any, `type`: String): Unit = js.native
  
  def refresh(): Unit = js.native
  def refresh(id: String): Unit = js.native
  def refresh(id: Double): Unit = js.native
  
  def refreshCursor(): Unit = js.native
  
  def remove(id: String): Unit = js.native
  def remove(id: js.Array[_]): Unit = js.native
  def remove(id: Double): Unit = js.native
  
  def removeBind(source: js.Any): Unit = js.native
  
  def saveBatch(handler: WebixCallback): Unit = js.native
  
  def serialize(): js.Array[_] = js.native
  def serialize(all: Boolean): js.Array[_] = js.native
  
  def setBindData(data: js.Any, key: String): Unit = js.native
  def setBindData(data: js.Any, key: Double): Unit = js.native
  
  def setCursor(cursor: String): Unit = js.native
  def setCursor(cursor: Double): Unit = js.native
  
  def sort(by: String): Unit = js.native
  def sort(by: String, dir: js.UndefOr[scala.Nothing], as: String): Unit = js.native
  def sort(by: String, dir: String): Unit = js.native
  def sort(by: String, dir: String, as: String): Unit = js.native
  
  def sync(source: js.Any, filter: WebixCallback, silent: Boolean): Unit = js.native
  
  def unbind(): Unit = js.native
  
  def unblockEvent(): Unit = js.native
  
  def updateItem(id: String, data: js.Any): Unit = js.native
  def updateItem(id: Double, data: js.Any): Unit = js.native
  
  def validate(): Boolean = js.native
  def validate(id: String): Boolean = js.native
  
  var waitData: js.Promise[_] = js.native
  
  def waitSave(handler: WebixCallback): js.Promise[_] = js.native
}
