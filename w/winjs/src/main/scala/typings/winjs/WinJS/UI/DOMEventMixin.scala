package typings.winjs.WinJS.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adds event-related methods to the control.
  **/
@JSGlobal("WinJS.UI.DOMEventMixin")
@js.native
object DOMEventMixin extends js.Object {
  def addEventListener(`type`: String, listener: js.Function): Unit = js.native
  def addEventListener(`type`: String, listener: js.Function, useCapture: Boolean): Unit = js.native
  def dispatchEvent(`type`: String, eventProperties: js.Any): Boolean = js.native
  def removeEventListener(`type`: String, listener: js.Function): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function, useCapture: Boolean): Unit = js.native
}

