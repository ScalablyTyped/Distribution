package typings
package atUifabricUtilitiesLib.libAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/Async", "Async")
@js.native
class Async () extends js.Object {
  def this(parent: js.Object) = this()
  def this(parent: js.Object, onError: js.Function1[/* e */ js.Any, scala.Unit]) = this()
  var _animationFrameIds: js.Any = js.native
  var _immediateIds: js.Any = js.native
  var _intervalIds: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _noop: js.Any = js.native
  var _onErrorHandler: js.Any = js.native
  var _parent: js.Any = js.native
  var _timeoutIds: js.Any = js.native
  /* protected */ def _logError(e: js.Any): scala.Unit = js.native
  def cancelAnimationFrame(id: scala.Double): scala.Unit = js.native
  /**
    * Clears the immediate.
    * @param id - Id to cancel.
    */
  def clearImmediate(id: scala.Double): scala.Unit = js.native
  /**
    * Clears the interval.
    * @param id - Id to cancel.
    */
  def clearInterval(id: scala.Double): scala.Unit = js.native
  /**
    * Clears the timeout.
    * @param id - Id to cancel.
    */
  def clearTimeout(id: scala.Double): scala.Unit = js.native
  /**
    * Creates a function that will delay the execution of func until after wait milliseconds have
    * elapsed since the last time it was invoked. Provide an options object to indicate that func
    * should be invoked on the leading and/or trailing edge of the wait timeout. Subsequent calls
    * to the debounced function will return the result of the last func call.
    *
    * Note: If leading and trailing options are true func will be called on the trailing edge of
    * the timeout only if the the debounced function is invoked more than once during the wait
    * timeout.
    *
    * @param func - The function to debounce.
    * @param wait - The number of milliseconds to delay.
    * @param options - The options object.
    * @returns The new debounced function.
    */
  def debounce[T /* <: js.Function */](func: T): ICancelable[T] with js.Function0[scala.Unit] = js.native
  def debounce[T /* <: js.Function */](func: T, wait: scala.Double): ICancelable[T] with js.Function0[scala.Unit] = js.native
  def debounce[T /* <: js.Function */](func: T, wait: scala.Double, options: atUifabricUtilitiesLib.Anon_LeadingMaxWait): ICancelable[T] with js.Function0[scala.Unit] = js.native
  /**
    * Dispose function, clears all async operations.
    */
  def dispose(): scala.Unit = js.native
  def requestAnimationFrame(callback: js.Function0[scala.Unit]): scala.Double = js.native
  /**
    * SetImmediate override, which will auto cancel the immediate during dispose.
    * @param callback - Callback to execute.
    * @returns The setTimeout id.
    */
  def setImmediate(callback: js.Function0[scala.Unit]): scala.Double = js.native
  /**
    * SetInterval override, which will auto cancel the timeout during dispose.
    * @param callback - Callback to execute.
    * @param duration - Duration in milliseconds.
    * @returns The setTimeout id.
    */
  def setInterval(callback: js.Function0[scala.Unit], duration: scala.Double): scala.Double = js.native
  /**
    * SetTimeout override, which will auto cancel the timeout during dispose.
    * @param callback - Callback to execute.
    * @param duration - Duration in milliseconds.
    * @returns The setTimeout id.
    */
  def setTimeout(callback: js.Function0[scala.Unit], duration: scala.Double): scala.Double = js.native
  /**
    * Creates a function that, when executed, will only call the func function at most once per
    * every wait milliseconds. Provide an options object to indicate that func should be invoked
    * on the leading and/or trailing edge of the wait timeout. Subsequent calls to the throttled
    * function will return the result of the last func call.
    *
    * Note: If leading and trailing options are true func will be called on the trailing edge of
    * the timeout only if the the throttled function is invoked more than once during the wait timeout.
    *
    * @param func - The function to throttle.
    * @param wait - The number of milliseconds to throttle executions to. Defaults to 0.
    * @param options - The options object.
    * @returns The new throttled function.
    */
  def throttle[T /* <: js.Function */](func: T): T | js.Function0[scala.Unit] = js.native
  def throttle[T /* <: js.Function */](func: T, wait: scala.Double): T | js.Function0[scala.Unit] = js.native
  def throttle[T /* <: js.Function */](func: T, wait: scala.Double, options: atUifabricUtilitiesLib.Anon_Leading): T | js.Function0[scala.Unit] = js.native
}

