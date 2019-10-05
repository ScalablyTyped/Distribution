package typings.winjs.WinJS.Utilities

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.Utilities.getRelativeTop")
@js.native
object getRelativeTop extends js.Object {
  /**
    * Gets the top coordinate of the element relative to the specified parent.
    * @param element The element.
    * @param parent The parent element.
    * @returns The relative top coordinate.
    **/
  def apply(): Double = js.native
  def apply(element: HTMLElement): Double = js.native
  def apply(element: HTMLElement, parent: HTMLElement): Double = js.native
}

