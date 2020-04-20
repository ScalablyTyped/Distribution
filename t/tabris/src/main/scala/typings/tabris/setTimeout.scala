package typings.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("setTimeout")
@js.native
object setTimeout extends js.Object {
  /**
    * Calls the given function with `param` (and all following parameters) after the specified delay. The
    * actual delay may be slightly longer than the given one.
    * @param callback The function to call.
    * @param delay The delay in milliseconds.
    * @param params One or more values passed on to the callback.
    */
  def apply(callback: js.Function): js.Any = js.native
  def apply(callback: js.Function, delay: Double, params: js.Any*): js.Any = js.native
}

