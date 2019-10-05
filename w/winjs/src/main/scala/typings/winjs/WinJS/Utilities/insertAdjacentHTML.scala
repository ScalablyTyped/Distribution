package typings.winjs.WinJS.Utilities

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.Utilities.insertAdjacentHTML")
@js.native
object insertAdjacentHTML extends js.Object {
  /**
    * Calls insertAdjacentHTML on the specified element.
    * @param element The element on which insertAdjacentHTML is to be called.
    * @param position The position relative to the element at which to insert the HTML. Possible values are: beforebegin, afterbegin, beforeend, afterend.
    * @param text The text to insert.
    **/
  def apply(element: HTMLElement, position: String, text: String): Unit = js.native
}

