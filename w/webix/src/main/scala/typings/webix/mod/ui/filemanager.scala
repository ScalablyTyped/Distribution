package typings.webix.mod.ui

import typings.webix.mod.DataStore
import typings.webix.mod.WebixCallback
import typings.webix.mod.WebixTemplate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webix", "ui.filemanager")
@js.native
class filemanager ()
  extends typings.webix.webix.ui.baseview {
  @JSName("$dropAllow")
  var $dropAllow_Original: WebixCallback = js.native
  @JSName("$skin")
  var $skin_Original_filemanager: WebixCallback = js.native
  @JSName("$$")
  var DollarDollar: js.Any = js.native
  @JSName("config")
  var config_filemanager: filemanagerConfig = js.native
  var data: DataStore = js.native
  var waitData: js.Promise[_] = js.native
  @JSName("$dropAllow")
  def $dropAllow(args: js.Any*): js.Any = js.native
  def add(obj: js.Any): String | Double = js.native
  def add(obj: js.Any, index: Double): String | Double = js.native
  def attachEvent(`type`: filemanagerEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: filemanagerEventName, functor: WebixCallback, id: String): String | Double = js.native
  def blockEvent(): Unit = js.native
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  def clearAll(): Unit = js.native
  def clearAll(soft: Boolean): Unit = js.native
  def copy(sid: String, tindex: Double): Double = js.native
  def copy(sid: String, tindex: Double, tobj: typings.webix.webix.ui.baseview): Double = js.native
  def copy(sid: String, tindex: Double, tobj: typings.webix.webix.ui.baseview, details: js.Any): Double = js.native
  def copy(sid: Double, tindex: Double): Double = js.native
  def copy(sid: Double, tindex: Double, tobj: typings.webix.webix.ui.baseview): Double = js.native
  def copy(sid: Double, tindex: Double, tobj: typings.webix.webix.ui.baseview, details: js.Any): Double = js.native
  def copyFile(source: String, target: String): Unit = js.native
  def copyFile(source: js.Array[_], target: String): Unit = js.native
  def count(): Double = js.native
  def createFolder(targetId: String): Unit = js.native
  def deleteFile(ids: String): Unit = js.native
  def deleteFile(ids: js.Array[_]): Unit = js.native
  def detachEvent(id: String): Unit = js.native
  def download(id: String): Unit = js.native
  def editFile(id: String): Unit = js.native
  def exists(id: String): Boolean = js.native
  def exists(id: Double): Boolean = js.native
  def filter(text: WebixCallback | WebixTemplate): Unit = js.native
  def filter(text: WebixCallback | WebixTemplate, value: String): Unit = js.native
  def filter(text: WebixCallback | WebixTemplate, value: String, preserve: Boolean): Unit = js.native
  def filter(text: String): Unit = js.native
  def filter(text: String, value: String): Unit = js.native
  def filter(text: String, value: String, preserve: Boolean): Unit = js.native
  def find(criterion: WebixCallback): js.Any = js.native
  def find(criterion: WebixCallback, first: Boolean): js.Any = js.native
  def getActive(): String | js.Array[_] = js.native
  def getActiveView(): js.Any = js.native
  def getBranchIndex(id: String): Double = js.native
  def getBranchIndex(id: String, parent: String): Double = js.native
  def getBranchIndex(id: String, parent: Double): Double = js.native
  def getBranchIndex(id: Double): Double = js.native
  def getBranchIndex(id: Double, parent: String): Double = js.native
  def getBranchIndex(id: Double, parent: Double): Double = js.native
  def getCurrentFolder(): String = js.native
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
  def getMenu(): js.Any = js.native
  def getNextId(id: String, step: Double): String | Double = js.native
  def getNextId(id: Double, step: Double): String | Double = js.native
  def getNextSiblingId(id: String): String | Double = js.native
  def getNextSiblingId(id: Double): String | Double = js.native
  def getParentId(id: String): String | Double = js.native
  def getParentId(id: Double): String | Double = js.native
  def getPath(id: String): js.Array[_] = js.native
  def getPathNames(id: String): js.Array[_] = js.native
  def getPrevId(id: String, step: Double): String | Double = js.native
  def getPrevId(id: Double, step: Double): String | Double = js.native
  def getPrevSiblingId(id: String): String | Double = js.native
  def getPrevSiblingId(id: Double): String | Double = js.native
  def getSearchData(id: String, text: String): js.Array[_] = js.native
  def getSelectedFile(): String | js.Array[_] = js.native
  def getUploader(): js.Any = js.native
  def goBack(step: Double): Unit = js.native
  def goForward(step: Double): Unit = js.native
  def hasEvent(name: String): Boolean = js.native
  def hideProgress(): Unit = js.native
  def hideSearchResults(): Unit = js.native
  def hideTree(): Unit = js.native
  def innerId(id: String): Double | String = js.native
  def innerId(id: Double): Double | String = js.native
  def isBranch(id: String): Boolean = js.native
  def isBranch(id: Double): Boolean = js.native
  def levelUp(id: String): Unit = js.native
  def load(url: String): js.Promise[_] = js.native
  def load(url: String, `type`: String): js.Promise[_] = js.native
  def load(url: String, `type`: String, callback: WebixCallback): js.Promise[_] = js.native
  def loadBranch(id: String, callback: WebixCallback, url: String): js.Promise[_] = js.native
  def loadBranch(id: Double, callback: WebixCallback, url: String): js.Promise[_] = js.native
  def loadNext(count: Double, start: Double, callback: WebixCallback, url: String, now: Boolean): js.Promise[_] = js.native
  def mapEvent(map: js.Any): Unit = js.native
  def markCopy(id: String): Unit = js.native
  def markCopy(id: js.Array[_]): Unit = js.native
  def markCut(id: String): Unit = js.native
  def markCut(id: js.Array[_]): Unit = js.native
  def move(sid: String, tindex: Double): String = js.native
  def move(sid: String, tindex: Double, tobj: js.Any): String = js.native
  def move(sid: String, tindex: Double, tobj: js.Any, details: js.Any): String = js.native
  def moveFile(source: String, target: String): Unit = js.native
  def openFolders(folders: js.Array[_]): Unit = js.native
  def parse(data: js.Any, `type`: String): Unit = js.native
  def pasteFile(id: String): Unit = js.native
  def refresh(): Unit = js.native
  def refresh(id: String): Unit = js.native
  def refresh(id: Double): Unit = js.native
  def remove(id: String): Unit = js.native
  def remove(id: js.Array[_]): Unit = js.native
  def remove(id: Double): Unit = js.native
  def renameFile(id: String, name: String, property: String): Unit = js.native
  def setDefaultHandlers(url: String): Unit = js.native
  def setPath(id: String): Unit = js.native
  def showProgress(): Unit = js.native
  def showProgress(config: js.Any): Unit = js.native
  def showSearchResults(text: String): Unit = js.native
  def showTree(): Unit = js.native
  def sort(by: String): Unit = js.native
  def sort(by: String, dir: String): Unit = js.native
  def sort(by: String, dir: String, as: String): Unit = js.native
  def sync(source: js.Any, filter: WebixCallback, silent: Boolean): Unit = js.native
  def ui(view: js.Any): typings.webix.webix.ui.baseview = js.native
  def unblockEvent(): Unit = js.native
  def updateItem(id: String, data: js.Any): Unit = js.native
  def updateItem(id: Double, data: js.Any): Unit = js.native
  def uploadFile(target: String): Unit = js.native
  def waitSave(handler: WebixCallback): js.Promise[_] = js.native
}

