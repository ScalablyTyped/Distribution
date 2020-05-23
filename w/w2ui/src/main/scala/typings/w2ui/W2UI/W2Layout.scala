package typings.w2ui.W2UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait W2Layout
  extends W2Common
     with _W2Object {
  var padding: Double = js.native
  var panels: js.Array[W2Panel] = js.native
  var resizer: Double = js.native
  var tmp: js.Object = js.native
  def content(`type`: String): js.Array[HTMLElement] | W2Object = js.native
  def content(`type`: String, content: js.Object): Unit = js.native
  def content(`type`: String, content: js.Object, transition: String): Unit = js.native
  def content(`type`: String, content: HTMLElement): Unit = js.native
  def content(`type`: String, content: HTMLElement, transition: String): Unit = js.native
  def el(`type`: String): HTMLElement = js.native
  def get(`type`: String): W2Panel = js.native
  def hide(`type`: String): Unit = js.native
  def hide(`type`: String, immediate: Boolean): Unit = js.native
  def hideTabs(`type`: String): Unit = js.native
  def hideToolbar(`type`: String): Unit = js.native
  def html(`type`: String): String = js.native
  def html(`type`: String, content: String): Unit = js.native
  def html(`type`: String, content: String, transition: String): Unit = js.native
  def html(`type`: String, content: js.Object): Unit = js.native
  def html(`type`: String, content: js.Object, transition: String): Unit = js.native
  @JSName("html")
  def html_Unit(`type`: String): Unit = js.native
  def load(`type`: String, url: String): Unit = js.native
  def load(`type`: String, url: String, transition: String): Unit = js.native
  def load(`type`: String, url: String, transition: String, onLoad: js.Function): Unit = js.native
  def lock(panel: String, message: String): Unit = js.native
  def lock(panel: String, message: String, showSpinner: Boolean): Unit = js.native
  def set(`type`: String, panel: js.Object): Unit = js.native
  def show(`type`: String): Unit = js.native
  def show(`type`: String, immediate: Boolean): Unit = js.native
  def showTabs(`type`: String): Unit = js.native
  def showToolbar(`type`: String): Unit = js.native
  def sizeTo(`type`: String, size: Double): Unit = js.native
  def toggle(`type`: String): Unit = js.native
  def toggle(`type`: String, immediate: Boolean): Unit = js.native
  def toggleTabs(`type`: String): Unit = js.native
  def toggleToolbar(`type`: String): Unit = js.native
  def unlock(panel: String): Unit = js.native
}

