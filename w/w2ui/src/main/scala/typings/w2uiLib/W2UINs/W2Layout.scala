package typings
package w2uiLib.W2UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait W2Layout
  extends W2Common
     with W2Object {
  var padding: scala.Double = js.native
  var panels: js.Array[W2Panel] = js.native
  var resizer: scala.Double = js.native
  var tmp: js.Object = js.native
  def content(`type`: java.lang.String): js.Array[stdLib.HTMLElement] | W2Object = js.native
  def content(`type`: java.lang.String, content: js.Object): scala.Unit = js.native
  def content(`type`: java.lang.String, content: js.Object, transition: java.lang.String): scala.Unit = js.native
  def content(`type`: java.lang.String, content: stdLib.HTMLElement): scala.Unit = js.native
  def content(`type`: java.lang.String, content: stdLib.HTMLElement, transition: java.lang.String): scala.Unit = js.native
  def el(`type`: java.lang.String): stdLib.HTMLElement = js.native
  def get(`type`: java.lang.String): W2Panel = js.native
  def hide(`type`: java.lang.String): scala.Unit = js.native
  def hide(`type`: java.lang.String, immediate: scala.Boolean): scala.Unit = js.native
  def hideTabs(`type`: java.lang.String): scala.Unit = js.native
  def hideToolbar(`type`: java.lang.String): scala.Unit = js.native
  def html(`type`: java.lang.String): java.lang.String = js.native
  def html(`type`: java.lang.String, content: java.lang.String): scala.Unit = js.native
  def html(`type`: java.lang.String, content: java.lang.String, transition: java.lang.String): scala.Unit = js.native
  def html(`type`: java.lang.String, content: js.Object): scala.Unit = js.native
  def html(`type`: java.lang.String, content: js.Object, transition: java.lang.String): scala.Unit = js.native
  @JSName("html")
  def html_Unit(`type`: java.lang.String): scala.Unit = js.native
  def load(`type`: java.lang.String, url: java.lang.String): scala.Unit = js.native
  def load(`type`: java.lang.String, url: java.lang.String, transition: java.lang.String): scala.Unit = js.native
  def load(`type`: java.lang.String, url: java.lang.String, transition: java.lang.String, onLoad: js.Function): scala.Unit = js.native
  def lock(panel: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def lock(panel: java.lang.String, message: java.lang.String, showSpinner: scala.Boolean): scala.Unit = js.native
  def set(`type`: java.lang.String, panel: js.Object): scala.Unit = js.native
  def show(`type`: java.lang.String): scala.Unit = js.native
  def show(`type`: java.lang.String, immediate: scala.Boolean): scala.Unit = js.native
  def showTabs(`type`: java.lang.String): scala.Unit = js.native
  def showToolbar(`type`: java.lang.String): scala.Unit = js.native
  def sizeTo(`type`: java.lang.String, size: scala.Double): scala.Unit = js.native
  def toggle(`type`: java.lang.String): scala.Unit = js.native
  def toggle(`type`: java.lang.String, immediate: scala.Boolean): scala.Unit = js.native
  def toggleTabs(`type`: java.lang.String): scala.Unit = js.native
  def toggleToolbar(`type`: java.lang.String): scala.Unit = js.native
  def unlock(panel: java.lang.String): scala.Unit = js.native
}

