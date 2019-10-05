package typings.winjs.WinJS.Utilities

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.Utilities.insertAdjacentHTMLUnsafe")
@js.native
object insertAdjacentHTMLUnsafe extends js.Object {
  /**
    * Calls insertAdjacentHTML on the specified element in the context of MSApp.execUnsafeLocalFunction.
    * @param element The element on which insertAdjacentHTML is to be called.
    * @param position The position relative to the element at which to insert the HTML. Possible values are: beforebegin, afterbegin, beforeend, afterend.
    * @param text Value to be provided to insertAdjacentHTML.
    **/
  def apply(element: HTMLElement, position: String, text: String): Unit = js.native
}

