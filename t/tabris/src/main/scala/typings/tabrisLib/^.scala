package typings
package tabrisLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  var console: Console = js.native
  var localStorage: Storage = js.native
  // Timer
  /**
    * Cancels the running interval associated with the given ID. When given an invalid ID, nothing happens.
    * @param id The ID that was returned by `setInterval`.
    */
  def clearInterval(id: js.Any): scala.Unit = js.native
  /**
    * Cancels the running timeout associated with the given ID. When given an invalid ID, nothing happens.
    * @param id The ID that was returned by `setTimeout`.
    */
  def clearTimeout(id: js.Any): scala.Unit = js.native
  def fetch(url: java.lang.String): js.Promise[Response] = js.native
  def fetch(url: java.lang.String, init: RequestInit): js.Promise[Response] = js.native
  def fetch(url: Request): js.Promise[Response] = js.native
  def fetch(url: Request, init: RequestInit): js.Promise[Response] = js.native
  /**
    * Calls the given function repeatedly, each times waiting the given delay. The actual delay may be
    * slightly longer than the given one.
    * @param callback The function to call.
    * @param delay The delay in milliseconds.
    * @param params One or more values passed on to the callback.
    */
  def setInterval(callback: js.Function): js.Any = js.native
  def setInterval(callback: js.Function, delay: scala.Double, params: js.Any*): js.Any = js.native
  /**
    * Calls the given function with `param` (and all following parameters) after the specified delay. The
    * actual delay may be slightly longer than the given one.
    * @param callback The function to call.
    * @param delay The delay in milliseconds.
    * @param params One or more values passed on to the callback.
    */
  def setTimeout(callback: js.Function): js.Any = js.native
  def setTimeout(callback: js.Function, delay: scala.Double, params: js.Any*): js.Any = js.native
}

