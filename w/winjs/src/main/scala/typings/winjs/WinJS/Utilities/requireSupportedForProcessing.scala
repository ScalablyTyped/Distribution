package typings.winjs.WinJS.Utilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.Utilities.requireSupportedForProcessing")
@js.native
object requireSupportedForProcessing extends js.Object {
  /**
    * Asserts that the value is compatible with declarative processing. Declarative processing is performed by WinJS.UI.processAll or WinJS.Binding.processAll. If the value is not compatible, and strictProcessing is on, an exception is thrown. All functions that have been declared using WinJS.Class.define, WinJS.Class.derive, WinJS.UI.Pages.define, or WinJS.Binding.converter are automatically marked as supported for declarative processing. Any other function that you use from a declarative context (that is, a context in which an HTML element has a data-win-control or data-win-options attribute) must be marked manually by calling this function. When you mark a function as supported for declarative processing, you are guaranteeing that the code in the function is secure from injection of third-party content.
    * @param value The value to be tested for compatibility with declarative processing. If the value is a function it must be marked with a property supportedForProcessing with a value of true when strictProcessing is on. For more information, see WinJS.Utilities.markSupportedForProcessing.
    * @returns The input value.
    **/
  def apply[T](value: T): T = js.native
}

