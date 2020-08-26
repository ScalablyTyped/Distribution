package typings.webix.mod.ui

import typings.webix.mod.DataStore
import typings.webix.mod.WebixCallback
import typings.webix.mod.WebixTemplate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webix", "ui.datalayout")
@js.native
class datalayout ()
  extends typings.webix.webix.ui.baseview {
  @JSName("$skin")
  var $skin_Original_datalayout: WebixCallback = js.native
  @JSName("config")
  var config_datalayout: datalayoutConfig = js.native
  var data: DataStore = js.native
  var waitData: js.Promise[_] = js.native
  def add(obj: js.Any): String | Double = js.native
  def add(obj: js.Any, index: Double): String | Double = js.native
  def addView(view: js.Any): String | Double = js.native
  def addView(view: js.Any, index: Double): String | Double = js.native
  def attachEvent(`type`: datalayoutEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: datalayoutEventName, functor: WebixCallback, id: String): String | Double = js.native
  def blockEvent(): Unit = js.native
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  def clearAll(): Unit = js.native
  def clearAll(soft: Boolean): Unit = js.native
  def count(): Double = js.native
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
  def getPrevId(id: String, step: Double): String | Double = js.native
  def getPrevId(id: Double, step: Double): String | Double = js.native
  def getValue(): js.Array[_] = js.native
  def hasEvent(name: String): Boolean = js.native
  def index(obj: js.Any): Double = js.native
  def load(url: String): js.Promise[_] = js.native
  def load(url: String, `type`: js.UndefOr[scala.Nothing], callback: WebixCallback): js.Promise[_] = js.native
  def load(url: String, `type`: String): js.Promise[_] = js.native
  def load(url: String, `type`: String, callback: WebixCallback): js.Promise[_] = js.native
  def loadNext(count: Double, start: Double, callback: WebixCallback, url: String, now: Boolean): js.Promise[_] = js.native
  def mapEvent(map: js.Any): Unit = js.native
  def parse(data: js.Any, `type`: String): Unit = js.native
  def reconstruct(): Unit = js.native
  def refresh(): Unit = js.native
  def refresh(id: String): Unit = js.native
  def refresh(id: Double): Unit = js.native
  def remove(id: String): Unit = js.native
  def remove(id: js.Array[_]): Unit = js.native
  def remove(id: Double): Unit = js.native
  def removeView(id: js.Any): Unit = js.native
  def render(id: String, obj: js.Any, mode: String): Unit = js.native
  def render(id: Double, obj: js.Any, mode: String): Unit = js.native
  def resizeChildren(): Unit = js.native
  def setValue(values: js.Array[_]): Unit = js.native
  def showBatch(name: String): Unit = js.native
  def showBatch(name: String, mode: Boolean): Unit = js.native
  def sort(by: String): Unit = js.native
  def sort(by: String, dir: js.UndefOr[scala.Nothing], as: String): Unit = js.native
  def sort(by: String, dir: String): Unit = js.native
  def sort(by: String, dir: String, as: String): Unit = js.native
  def sync(source: js.Any, filter: WebixCallback, silent: Boolean): Unit = js.native
  def unblockEvent(): Unit = js.native
  def updateItem(id: String, data: js.Any): Unit = js.native
  def updateItem(id: Double, data: js.Any): Unit = js.native
  def waitSave(handler: WebixCallback): js.Promise[_] = js.native
}

