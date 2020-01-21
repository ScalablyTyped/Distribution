package typings.winjs.WinJS.Utilities

import typings.std.HTMLElement
import typings.winjs.AnonScrollLeft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.Utilities.getScrollPosition")
@js.native
object getScrollPosition extends js.Object {
  /**
    * Gets the scrollLeft and scrollTop of the specified element, adjusting the scrollLeft to change from browser specific coordinates to logical coordinates when in RTL.
    * @param element The element.
    * @returns An object with two properties: scrollLeft and scrollTop
    **/
  def apply(element: HTMLElement): AnonScrollLeft = js.native
}

