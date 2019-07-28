package typings.sugar.sugarjsNs.FunctionNs

import typings.sugar.sugarjsNs.SugarDefaultChainable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChainableBase[RawValue] extends js.Object {
  var raw: RawValue = js.native
  def after(n: Double): SugarDefaultChainable[js.Function] = js.native
  @JSName("apply")
  def apply(thisArg: js.Any): SugarDefaultChainable[_] = js.native
  @JSName("apply")
  def apply(thisArg: js.Any, argArray: js.Any): SugarDefaultChainable[_] = js.native
  def bind(thisArg: js.Any, argArray: js.Any*): SugarDefaultChainable[_] = js.native
  def call(thisArg: js.Any, argArray: js.Any*): SugarDefaultChainable[_] = js.native
  def cancel(): SugarDefaultChainable[js.Function] = js.native
  def debounce(): SugarDefaultChainable[js.Function] = js.native
  def debounce(ms: Double): SugarDefaultChainable[js.Function] = js.native
  def delay(): SugarDefaultChainable[js.Function] = js.native
  def delay(ms: Double, args: js.Any*): SugarDefaultChainable[js.Function] = js.native
  def every(): SugarDefaultChainable[js.Function] = js.native
  def every(ms: Double, args: js.Any*): SugarDefaultChainable[js.Function] = js.native
  def `lazy`(): SugarDefaultChainable[js.Function] = js.native
  def `lazy`(ms: Double): SugarDefaultChainable[js.Function] = js.native
  def `lazy`(ms: Double, immediate: Boolean): SugarDefaultChainable[js.Function] = js.native
  def `lazy`(ms: Double, immediate: Boolean, limit: Double): SugarDefaultChainable[js.Function] = js.native
  def lock(): SugarDefaultChainable[js.Function] = js.native
  def lock(n: Double): SugarDefaultChainable[js.Function] = js.native
  def memoize(): SugarDefaultChainable[js.Function] = js.native
  def memoize(hashFn: String): SugarDefaultChainable[js.Function] = js.native
  def memoize(hashFn: String, limit: Double): SugarDefaultChainable[js.Function] = js.native
  def memoize(hashFn: js.Function): SugarDefaultChainable[js.Function] = js.native
  def memoize(hashFn: js.Function, limit: Double): SugarDefaultChainable[js.Function] = js.native
  def once(): SugarDefaultChainable[js.Function] = js.native
  def partial(args: js.Any*): SugarDefaultChainable[js.Function] = js.native
  def throttle(): SugarDefaultChainable[js.Function] = js.native
  def throttle(ms: Double): SugarDefaultChainable[js.Function] = js.native
}

