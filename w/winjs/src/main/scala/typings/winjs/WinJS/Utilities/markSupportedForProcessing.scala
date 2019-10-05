package typings.winjs.WinJS.Utilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.Utilities.markSupportedForProcessing")
@js.native
object markSupportedForProcessing extends js.Object {
  /**
    * Marks a function as being compatible with declarative processing. Declarative processing is performed by WinJS.UI.processAll or WinJS.Binding.processAll.
    * @param func The function to be marked as compatible with declarative processing.
    * @returns The input function, marked as compatible with declarative processing.
    **/
  def apply[U /* <: js.Function */](func: U): U = js.native
}

