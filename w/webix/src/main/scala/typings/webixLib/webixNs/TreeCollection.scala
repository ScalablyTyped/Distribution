package typings
package webixLib.webixNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeCollection extends js.Object {
  var config: TreeCollectionConfig = js.native
  var data: DataStore = js.native
  var name: java.lang.String = js.native
  var waitData: js.Promise[_] = js.native
  def add(obj: js.Any): java.lang.String = js.native
  def add(obj: js.Any, index: scala.Double): java.lang.String = js.native
  def add(obj: js.Any, index: scala.Double, parentId: java.lang.String): java.lang.String = js.native
  def addBind(source: js.Any, rule: java.lang.String, format: java.lang.String): scala.Unit = js.native
  def attachEvent(`type`: TreeCollectionEventName, functor: WebixCallback): java.lang.String | scala.Double = js.native
  def attachEvent(`type`: TreeCollectionEventName, functor: WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
  def bind(target: js.Any): scala.Unit = js.native
  def bind(target: js.Any, rule: WebixCallback): scala.Unit = js.native
  def bind(target: js.Any, rule: WebixCallback, format: java.lang.String): scala.Unit = js.native
  def blockEvent(): scala.Unit = js.native
  def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
  def clearAll(): scala.Unit = js.native
  def clearAll(soft: scala.Boolean): scala.Unit = js.native
  def clearValidation(): scala.Unit = js.native
  def copy(sid: java.lang.String, tindex: scala.Double): scala.Unit = js.native
  def copy(sid: java.lang.String, tindex: scala.Double, tobj: js.Any): scala.Unit = js.native
  def copy(sid: java.lang.String, tindex: scala.Double, tobj: js.Any, details: js.Any): scala.Unit = js.native
  def copy(sid: scala.Double, tindex: scala.Double): scala.Unit = js.native
  def copy(sid: scala.Double, tindex: scala.Double, tobj: js.Any): scala.Unit = js.native
  def copy(sid: scala.Double, tindex: scala.Double, tobj: js.Any, details: js.Any): scala.Unit = js.native
  def count(): scala.Double = js.native
  def define(property: java.lang.String, value: js.Any): scala.Unit = js.native
  def destructor(): scala.Unit = js.native
  def detachEvent(id: java.lang.String): scala.Unit = js.native
  def exists(id: java.lang.String): scala.Boolean = js.native
  def exists(id: scala.Double): scala.Boolean = js.native
  def filter(text: WebixCallback | WebixTemplate): scala.Unit = js.native
  def filter(text: WebixCallback | WebixTemplate, value: java.lang.String): scala.Unit = js.native
  def filter(text: WebixCallback | WebixTemplate, value: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
  def filter(text: java.lang.String): scala.Unit = js.native
  def filter(text: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def filter(text: java.lang.String, value: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
  def find(criterion: WebixCallback): js.Any = js.native
  def find(criterion: WebixCallback, first: scala.Boolean): js.Any = js.native
  def getBindData(key: java.lang.String, update: scala.Boolean): scala.Unit = js.native
  def getBindData(key: scala.Double, update: scala.Boolean): scala.Unit = js.native
  def getBranchIndex(id: java.lang.String): scala.Double = js.native
  def getBranchIndex(id: java.lang.String, parent: java.lang.String): scala.Double = js.native
  def getBranchIndex(id: java.lang.String, parent: scala.Double): scala.Double = js.native
  def getBranchIndex(id: scala.Double): scala.Double = js.native
  def getBranchIndex(id: scala.Double, parent: java.lang.String): scala.Double = js.native
  def getBranchIndex(id: scala.Double, parent: scala.Double): scala.Double = js.native
  def getCursor(): scala.Double = js.native
  def getFirstChildId(id: java.lang.String): java.lang.String = js.native
  def getFirstChildId(id: scala.Double): java.lang.String = js.native
  def getFirstId(): java.lang.String | scala.Double = js.native
  def getIdByIndex(index: scala.Double): java.lang.String | scala.Double = js.native
  def getIndexById(id: java.lang.String): scala.Double = js.native
  def getIndexById(id: scala.Double): scala.Double = js.native
  def getItem(id: java.lang.String): js.Any = js.native
  def getItem(id: scala.Double): js.Any = js.native
  def getLastId(): java.lang.String | scala.Double = js.native
  def getNextId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
  def getNextId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
  def getNextSiblingId(id: java.lang.String): java.lang.String | scala.Double = js.native
  def getNextSiblingId(id: scala.Double): java.lang.String | scala.Double = js.native
  def getParentId(id: java.lang.String): java.lang.String | scala.Double = js.native
  def getParentId(id: scala.Double): java.lang.String | scala.Double = js.native
  def getPrevId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
  def getPrevId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
  def getPrevSiblingId(id: java.lang.String): java.lang.String | scala.Double = js.native
  def getPrevSiblingId(id: scala.Double): java.lang.String | scala.Double = js.native
  def hasEvent(name: java.lang.String): scala.Boolean = js.native
  def isBranch(id: java.lang.String): scala.Boolean = js.native
  def isBranch(id: scala.Double): scala.Boolean = js.native
  def isVisible(): scala.Boolean = js.native
  def load(url: java.lang.String): js.Promise[_] = js.native
  def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
  def load(url: java.lang.String, `type`: java.lang.String, callback: WebixCallback): js.Promise[_] = js.native
  def loadBranch(id: java.lang.String, callback: WebixCallback, url: java.lang.String): scala.Unit = js.native
  def loadBranch(id: scala.Double, callback: WebixCallback, url: java.lang.String): scala.Unit = js.native
  def loadNext(
    count: scala.Double,
    start: scala.Double,
    callback: WebixCallback,
    url: java.lang.String,
    now: scala.Boolean
  ): scala.Unit = js.native
  def mapEvent(map: js.Any): scala.Unit = js.native
  def move(sid: java.lang.String, tindex: scala.Double): java.lang.String | scala.Double = js.native
  def move(sid: java.lang.String, tindex: scala.Double, tobj: webixLib.webixNs.uiNs.baseview): java.lang.String | scala.Double = js.native
  def move(sid: java.lang.String, tindex: scala.Double, tobj: webixLib.webixNs.uiNs.baseview, details: js.Any): java.lang.String | scala.Double = js.native
  def move(sid: scala.Double, tindex: scala.Double): java.lang.String | scala.Double = js.native
  def move(sid: scala.Double, tindex: scala.Double, tobj: webixLib.webixNs.uiNs.baseview): java.lang.String | scala.Double = js.native
  def move(sid: scala.Double, tindex: scala.Double, tobj: webixLib.webixNs.uiNs.baseview, details: js.Any): java.lang.String | scala.Double = js.native
  def moveBottom(id: java.lang.String): scala.Unit = js.native
  def moveBottom(id: scala.Double): scala.Unit = js.native
  def moveTop(id: java.lang.String): scala.Unit = js.native
  def moveTop(id: scala.Double): scala.Unit = js.native
  def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def refresh(id: java.lang.String): scala.Unit = js.native
  def refresh(id: scala.Double): scala.Unit = js.native
  def refreshCursor(): scala.Unit = js.native
  def remove(id: java.lang.String): scala.Unit = js.native
  def remove(id: scala.Double): scala.Unit = js.native
  def removeBind(source: js.Any): scala.Unit = js.native
  def saveBatch(handler: WebixCallback): scala.Unit = js.native
  def serialize(): js.Array[_] = js.native
  def setBindData(data: js.Any, key: java.lang.String): scala.Unit = js.native
  def setBindData(data: js.Any, key: scala.Double): scala.Unit = js.native
  def setCursor(cursor: java.lang.String): scala.Unit = js.native
  def setCursor(cursor: scala.Double): scala.Unit = js.native
  def sort(by: java.lang.String): scala.Unit = js.native
  def sort(by: java.lang.String, dir: java.lang.String): scala.Unit = js.native
  def sort(by: java.lang.String, dir: java.lang.String, as: java.lang.String): scala.Unit = js.native
  def sync(source: js.Any, filter: WebixCallback, silent: scala.Boolean): scala.Unit = js.native
  def unbind(): scala.Unit = js.native
  def unblockEvent(): scala.Unit = js.native
  def updateItem(id: java.lang.String, data: js.Any): scala.Unit = js.native
  def updateItem(id: scala.Double, data: js.Any): scala.Unit = js.native
  def validate(): scala.Boolean = js.native
  def validate(id: java.lang.String): scala.Boolean = js.native
}

