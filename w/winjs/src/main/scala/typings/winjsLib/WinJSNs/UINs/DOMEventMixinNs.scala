package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Adds event-related methods to the control.
    **/
@JSGlobal("WinJS.UI.DOMEventMixin")
@js.native
object DOMEventMixinNs extends js.Object {
  def addEventListener(`type`: java.lang.String, listener: js.Function): scala.Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
  def dispatchEvent(`type`: java.lang.String, eventProperties: js.Any): scala.Boolean = js.native
  def removeEventListener(`type`: java.lang.String, listener: js.Function): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
}

