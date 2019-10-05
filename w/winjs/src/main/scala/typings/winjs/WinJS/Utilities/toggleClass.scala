package typings.winjs.WinJS.Utilities

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.Utilities.toggleClass")
@js.native
object toggleClass extends js.Object {
  /**
    * Toggles (adds or removes) the specified class on the specified element. If the class is present, it is removed; if it is absent, it is added.
    * @param e The element on which to toggle the class.
    * @param name The name of the class to toggle.
    * @returns The element.
    **/
  def apply[T /* <: HTMLElement */](e: T, name: String): T = js.native
}

