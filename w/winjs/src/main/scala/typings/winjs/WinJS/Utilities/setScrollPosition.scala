package typings.winjs.WinJS.Utilities

import typings.std.HTMLElement
import typings.winjs.AnonScrollLeft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.Utilities.setScrollPosition")
@js.native
object setScrollPosition extends js.Object {
  /**
    * Sets the scrollLeft and scrollTop of the specified element, changing the scrollLeft from logical coordinates to browser-specific coordinates when in RTL.
    * @param element The element.
    * @param position An object describing the position to set.
    **/
  def apply(element: HTMLElement, position: AnonScrollLeft): Unit = js.native
}

