package typings
package sugarLib.sugarjsNs.FunctionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constructor
  extends sugarLib.sugarjsNs.SugarNamespace
     with ScalablyTyped.runtime.Instantiable0[Chainable[js.Function]]
     with ScalablyTyped.runtime.Instantiable1[/* raw */ js.Function, Chainable[js.Function]] {
  def apply(): Chainable[js.Function] = js.native
  def apply(raw: js.Function): Chainable[js.Function] = js.native
  def after(instance: js.Function, n: scala.Double): js.Function = js.native
  def cancel(instance: js.Function): js.Function = js.native
  def debounce(instance: js.Function): js.Function = js.native
  def debounce(instance: js.Function, ms: scala.Double): js.Function = js.native
  def delay(instance: js.Function): js.Function = js.native
  def delay(instance: js.Function, ms: scala.Double, args: js.Any*): js.Function = js.native
  def every(instance: js.Function): js.Function = js.native
  def every(instance: js.Function, ms: scala.Double, args: js.Any*): js.Function = js.native
  def `lazy`(instance: js.Function): js.Function = js.native
  def `lazy`(instance: js.Function, ms: scala.Double): js.Function = js.native
  def `lazy`(instance: js.Function, ms: scala.Double, immediate: scala.Boolean): js.Function = js.native
  def `lazy`(instance: js.Function, ms: scala.Double, immediate: scala.Boolean, limit: scala.Double): js.Function = js.native
  def lock(instance: js.Function): js.Function = js.native
  def lock(instance: js.Function, n: scala.Double): js.Function = js.native
  def memoize(instance: js.Function): js.Function = js.native
  def memoize(instance: js.Function, hashFn: java.lang.String): js.Function = js.native
  def memoize(instance: js.Function, hashFn: java.lang.String, limit: scala.Double): js.Function = js.native
  def memoize(instance: js.Function, hashFn: js.Function): js.Function = js.native
  def memoize(instance: js.Function, hashFn: js.Function, limit: scala.Double): js.Function = js.native
  def once(instance: js.Function): js.Function = js.native
  def partial(instance: js.Function, args: js.Any*): js.Function = js.native
  def throttle(instance: js.Function): js.Function = js.native
  def throttle(instance: js.Function, ms: scala.Double): js.Function = js.native
}

