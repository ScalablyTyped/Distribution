package typings.winjs.global.WinJS.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Adds event-related methods to the control.
  **/
object DOMEventMixin {
  
  @JSGlobal("WinJS.UI.DOMEventMixin.addEventListener")
  @js.native
  def addEventListener(`type`: String, listener: js.Function): Unit = js.native
  @JSGlobal("WinJS.UI.DOMEventMixin.addEventListener")
  @js.native
  def addEventListener(`type`: String, listener: js.Function, useCapture: Boolean): Unit = js.native
  
  @JSGlobal("WinJS.UI.DOMEventMixin.dispatchEvent")
  @js.native
  def dispatchEvent(`type`: String, eventProperties: js.Any): Boolean = js.native
  
  @JSGlobal("WinJS.UI.DOMEventMixin.removeEventListener")
  @js.native
  def removeEventListener(`type`: String, listener: js.Function): Unit = js.native
  @JSGlobal("WinJS.UI.DOMEventMixin.removeEventListener")
  @js.native
  def removeEventListener(`type`: String, listener: js.Function, useCapture: Boolean): Unit = js.native
}
