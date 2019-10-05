package typings.winjs.WinJS.Utilities

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.Utilities.markDisposable")
@js.native
object markDisposable extends js.Object {
  /**
    * Attaches the default dispose API wrapping the dispose implementation to the specified element.
    * @param element The element to mark as disposable.
    * @param disposeImpl The function containing the element-specific dispose logic, called by the dispose function that markDisposable attaches.
    **/
  def apply(element: HTMLElement): Unit = js.native
  def apply(element: HTMLElement, disposeImpl: js.Function): Unit = js.native
}

