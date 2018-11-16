package typings
package sugarLib.sugarjsNs.FunctionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChainableBase[RawValue] extends js.Object {
  var raw: RawValue = js.native
  def after(n: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[js.Function] = js.native
  @JSName("apply")
  def apply(thisArg: js.Any): sugarLib.sugarjsNs.SugarDefaultChainable[_] = js.native
  @JSName("apply")
  def apply(thisArg: js.Any, argArray: js.Any): sugarLib.sugarjsNs.SugarDefaultChainable[_] = js.native
  def bind(thisArg: js.Any, argArray: js.Any*): sugarLib.sugarjsNs.SugarDefaultChainable[_] = js.native
  def call(thisArg: js.Any, argArray: js.Any*): sugarLib.sugarjsNs.SugarDefaultChainable[_] = js.native
  def cancel(): sugarLib.sugarjsNs.SugarDefaultChainable[js.Function] = js.native
  def debounce(): sugarLib.sugarjsNs.SugarDefaultChainable[js.Function] = js.native
  def debounce(ms: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[js.Function] = js.native
  def delay(): sugarLib.sugarjsNs.SugarDefaultChainable[js.Function] = js.native
  def delay(ms: scala.Double, args: js.Any*): sugarLib.sugarjsNs.SugarDefaultChainable[js.Function] = js.native
  def every(): sugarLib.sugarjsNs.SugarDefaultChainable[js.Function] = js.native
  def every(ms: scala.Double, args: js.Any*): sugarLib.sugarjsNs.SugarDefaultChainable[js.Function] = js.native
  def `lazy`(): sugarLib.sugarjsNs.SugarDefaultChainable[js.Function] = js.native
  def `lazy`(ms: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[js.Function] = js.native
  def `lazy`(ms: scala.Double, immediate: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[js.Function] = js.native
  def `lazy`(ms: scala.Double, immediate: scala.Boolean, limit: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[js.Function] = js.native
  def lock(): sugarLib.sugarjsNs.SugarDefaultChainable[js.Function] = js.native
  def lock(n: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[js.Function] = js.native
  def memoize(): sugarLib.sugarjsNs.SugarDefaultChainable[js.Function] = js.native
  def memoize(hashFn: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[js.Function] = js.native
  def memoize(hashFn: java.lang.String, limit: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[js.Function] = js.native
  def memoize(hashFn: js.Function): sugarLib.sugarjsNs.SugarDefaultChainable[js.Function] = js.native
  def memoize(hashFn: js.Function, limit: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[js.Function] = js.native
  def once(): sugarLib.sugarjsNs.SugarDefaultChainable[js.Function] = js.native
  def partial(args: js.Any*): sugarLib.sugarjsNs.SugarDefaultChainable[js.Function] = js.native
  def throttle(): sugarLib.sugarjsNs.SugarDefaultChainable[js.Function] = js.native
  def throttle(ms: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[js.Function] = js.native
}

