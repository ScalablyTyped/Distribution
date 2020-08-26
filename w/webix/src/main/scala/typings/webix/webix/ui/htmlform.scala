package typings.webix.webix.ui

import typings.std.Event
import typings.std.HTMLElement
import typings.webix.webix.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait htmlform extends baseview {
  @JSName("$scope")
  var $scope: js.Any = js.native
  @JSName("config")
  var config_htmlform: htmlformConfig = js.native
  @JSName("$tooltipIn")
  def $tooltipIn(node: HTMLElement): HTMLElement = js.native
  @JSName("$tooltipMove")
  def $tooltipMove(t: HTMLElement, e: Event, text: String): Unit = js.native
  @JSName("$tooltipOut")
  def $tooltipOut(): Unit = js.native
  def attachEvent(`type`: htmlformEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: htmlformEventName, functor: WebixCallback, id: String): String | Double = js.native
  def blockEvent(): Unit = js.native
  def blur(): Unit = js.native
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  def clear(): Unit = js.native
  def clear(all: Boolean): Unit = js.native
  def detachEvent(id: String): Unit = js.native
  def focus(item: String): Unit = js.native
  def getCleanValues(): js.Any = js.native
  def getDirtyValues(): js.Any = js.native
  def getScrollState(): js.Any = js.native
  def getValues(): js.Any = js.native
  def getValues(details: js.Any): js.Any = js.native
  def hasEvent(name: String): Boolean = js.native
  def isDirty(): Boolean = js.native
  def load(url: String): js.Promise[_] = js.native
  def load(url: String, `type`: js.UndefOr[scala.Nothing], callback: WebixCallback): js.Promise[_] = js.native
  def load(url: String, `type`: String): js.Promise[_] = js.native
  def load(url: String, `type`: String, callback: WebixCallback): js.Promise[_] = js.native
  def mapEvent(map: js.Any): Unit = js.native
  def markInvalid(name: String): Unit = js.native
  def markInvalid(name: String, state: String): Unit = js.native
  def markInvalid(name: String, state: Boolean): Unit = js.native
  def parse(data: js.Any, `type`: String): Unit = js.native
  def refresh(): Unit = js.native
  def render(id: String, data: js.Any, `type`: String): Unit = js.native
  def render(id: Double, data: js.Any, `type`: String): Unit = js.native
  def scrollTo(x: Double, y: Double): Unit = js.native
  def setContent(node: js.Any): Unit = js.native
  def setDirty(): Unit = js.native
  def setDirty(mark: Boolean): Unit = js.native
  def setHTML(html: String): Unit = js.native
  def setValues(values: js.Any): Unit = js.native
  def setValues(values: js.Any, update: Boolean): Unit = js.native
  def sync(source: js.Any, filter: WebixCallback, silent: Boolean): Unit = js.native
  def unblockEvent(): Unit = js.native
}

