package typings
package webixLib.webixNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("webix.ui.filemanager")
@js.native
class filemanager () extends baseview {
  @JSName("$$")
  var $$: js.Any = js.native
  @JSName("$dropAllow")
  var $dropAllow_Original: webixLib.webixNs.WebixCallback = js.native
  @JSName("config")
  var config_filemanager: filemanagerConfig = js.native
  var data: webixLib.webixNs.DataStore = js.native
  var waitData: stdLib.Promise[_] = js.native
  @JSName("$dropAllow")
  def $dropAllow(args: js.Any*): js.Any = js.native
  def add(obj: js.Any): java.lang.String | scala.Double = js.native
  def add(obj: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
  def attachEvent(`type`: filemanagerEventName, functor: webixLib.webixNs.WebixCallback): java.lang.String | scala.Double = js.native
  def attachEvent(`type`: filemanagerEventName, functor: webixLib.webixNs.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
  def blockEvent(): scala.Unit = js.native
  def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
  def clearAll(): scala.Unit = js.native
  def clearAll(soft: scala.Boolean): scala.Unit = js.native
  def copy(sid: java.lang.String, tindex: scala.Double): scala.Double = js.native
  def copy(sid: java.lang.String, tindex: scala.Double, tobj: baseview): scala.Double = js.native
  def copy(sid: java.lang.String, tindex: scala.Double, tobj: baseview, details: js.Any): scala.Double = js.native
  def copy(sid: scala.Double, tindex: scala.Double): scala.Double = js.native
  def copy(sid: scala.Double, tindex: scala.Double, tobj: baseview): scala.Double = js.native
  def copy(sid: scala.Double, tindex: scala.Double, tobj: baseview, details: js.Any): scala.Double = js.native
  def copyFile(source: java.lang.String, target: java.lang.String): scala.Unit = js.native
  def copyFile(source: js.Array[_], target: java.lang.String): scala.Unit = js.native
  def count(): scala.Double = js.native
  def createFolder(targetId: java.lang.String): scala.Unit = js.native
  def deleteFile(ids: java.lang.String): scala.Unit = js.native
  def deleteFile(ids: js.Array[_]): scala.Unit = js.native
  def detachEvent(id: java.lang.String): scala.Unit = js.native
  def download(id: java.lang.String): scala.Unit = js.native
  def editFile(id: java.lang.String): scala.Unit = js.native
  def exists(id: java.lang.String): scala.Boolean = js.native
  def exists(id: scala.Double): scala.Boolean = js.native
  def filter(text: webixLib.webixNs.WebixCallback | webixLib.webixNs.WebixTemplate): scala.Unit = js.native
  def filter(text: webixLib.webixNs.WebixCallback | webixLib.webixNs.WebixTemplate, value: java.lang.String): scala.Unit = js.native
  def filter(
    text: webixLib.webixNs.WebixCallback | webixLib.webixNs.WebixTemplate,
    value: java.lang.String,
    preserve: scala.Boolean
  ): scala.Unit = js.native
  def filter(text: java.lang.String): scala.Unit = js.native
  def filter(text: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def filter(text: java.lang.String, value: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
  def find(criterion: webixLib.webixNs.WebixCallback): js.Any = js.native
  def find(criterion: webixLib.webixNs.WebixCallback, first: scala.Boolean): js.Any = js.native
  def getActive(): java.lang.String = js.native
  def getActiveView(): js.Any = js.native
  def getBranchIndex(id: java.lang.String): scala.Double = js.native
  def getBranchIndex(id: java.lang.String, parent: java.lang.String): scala.Double = js.native
  def getBranchIndex(id: java.lang.String, parent: scala.Double): scala.Double = js.native
  def getBranchIndex(id: scala.Double): scala.Double = js.native
  def getBranchIndex(id: scala.Double, parent: java.lang.String): scala.Double = js.native
  def getBranchIndex(id: scala.Double, parent: scala.Double): scala.Double = js.native
  def getCurrentFolder(): java.lang.String = js.native
  def getFirstChildId(id: java.lang.String): java.lang.String = js.native
  def getFirstChildId(id: scala.Double): java.lang.String = js.native
  def getFirstId(): java.lang.String | scala.Double = js.native
  def getIdByIndex(index: scala.Double): java.lang.String | scala.Double = js.native
  def getIndexById(id: java.lang.String): scala.Double = js.native
  def getIndexById(id: scala.Double): scala.Double = js.native
  def getItem(id: java.lang.String): js.Any = js.native
  def getItem(id: scala.Double): js.Any = js.native
  def getLastId(): java.lang.String | scala.Double = js.native
  def getMenu(): js.Any = js.native
  def getNextId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
  def getNextId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
  def getNextSiblingId(id: java.lang.String): java.lang.String | scala.Double = js.native
  def getNextSiblingId(id: scala.Double): java.lang.String | scala.Double = js.native
  def getParentId(id: java.lang.String): java.lang.String | scala.Double = js.native
  def getParentId(id: scala.Double): java.lang.String | scala.Double = js.native
  def getPath(id: java.lang.String): js.Array[_] = js.native
  def getPathNames(id: java.lang.String): js.Array[_] = js.native
  def getPrevId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
  def getPrevId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
  def getPrevSiblingId(id: java.lang.String): java.lang.String | scala.Double = js.native
  def getPrevSiblingId(id: scala.Double): java.lang.String | scala.Double = js.native
  def getSearchData(id: java.lang.String, text: java.lang.String): js.Array[_] = js.native
  def getSelectedFile(): java.lang.String | js.Array[_] = js.native
  def getUploader(): js.Any = js.native
  def goBack(step: scala.Double): scala.Unit = js.native
  def goForward(step: scala.Double): scala.Unit = js.native
  def hasEvent(name: java.lang.String): scala.Boolean = js.native
  def hideProgress(): scala.Unit = js.native
  def hideSearchResults(): scala.Unit = js.native
  def hideTree(): scala.Unit = js.native
  def innerId(id: java.lang.String): scala.Double | java.lang.String = js.native
  def innerId(id: scala.Double): scala.Double | java.lang.String = js.native
  def isBranch(id: java.lang.String): scala.Boolean = js.native
  def isBranch(id: scala.Double): scala.Boolean = js.native
  def levelUp(id: java.lang.String): scala.Unit = js.native
  def load(url: java.lang.String): stdLib.Promise[_] = js.native
  def load(url: java.lang.String, `type`: java.lang.String): stdLib.Promise[_] = js.native
  def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixNs.WebixCallback): stdLib.Promise[_] = js.native
  def loadBranch(id: java.lang.String, callback: webixLib.webixNs.WebixCallback, url: java.lang.String): scala.Unit = js.native
  def loadBranch(id: scala.Double, callback: webixLib.webixNs.WebixCallback, url: java.lang.String): scala.Unit = js.native
  def loadNext(
    count: scala.Double,
    start: scala.Double,
    callback: webixLib.webixNs.WebixCallback,
    url: java.lang.String,
    now: scala.Boolean
  ): scala.Unit = js.native
  def mapEvent(map: js.Any): scala.Unit = js.native
  def markCopy(id: java.lang.String): scala.Unit = js.native
  def markCopy(id: js.Array[_]): scala.Unit = js.native
  def markCut(id: java.lang.String): scala.Unit = js.native
  def markCut(id: js.Array[_]): scala.Unit = js.native
  def move(sid: java.lang.String, tindex: scala.Double): java.lang.String = js.native
  def move(sid: java.lang.String, tindex: scala.Double, tobj: js.Any): java.lang.String = js.native
  def move(sid: java.lang.String, tindex: scala.Double, tobj: js.Any, details: js.Any): java.lang.String = js.native
  def moveFile(source: java.lang.String, target: java.lang.String): scala.Unit = js.native
  def openFolders(folders: js.Array[_]): scala.Unit = js.native
  def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def pasteFile(id: java.lang.String): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def refresh(id: java.lang.String): scala.Unit = js.native
  def refresh(id: scala.Double): scala.Unit = js.native
  def remove(id: java.lang.String): scala.Unit = js.native
  def remove(id: scala.Double): scala.Unit = js.native
  def renameFile(id: java.lang.String, name: java.lang.String, property: java.lang.String): scala.Unit = js.native
  def setPath(id: java.lang.String): scala.Unit = js.native
  def showProgress(): scala.Unit = js.native
  def showProgress(config: js.Any): scala.Unit = js.native
  def showSearchResults(text: java.lang.String): scala.Unit = js.native
  def showTree(): scala.Unit = js.native
  def sort(by: java.lang.String): scala.Unit = js.native
  def sort(by: java.lang.String, dir: java.lang.String): scala.Unit = js.native
  def sort(by: java.lang.String, dir: java.lang.String, as: java.lang.String): scala.Unit = js.native
  def sync(source: js.Any, filter: webixLib.webixNs.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
  def ui(view: js.Any): baseview = js.native
  def unblockEvent(): scala.Unit = js.native
  def updateItem(id: java.lang.String, data: js.Any): scala.Unit = js.native
  def updateItem(id: scala.Double, data: js.Any): scala.Unit = js.native
  def uploadFile(target: java.lang.String): scala.Unit = js.native
}

