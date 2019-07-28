package typings.sugar.sugarjsNs.FunctionNs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.sugar.sugarjsNs.SugarNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constructor
  extends SugarNamespace
     with Instantiable0[Chainable[js.Function]]
     with Instantiable1[/* raw */ js.Function, Chainable[js.Function]] {
  def apply(): Chainable[js.Function] = js.native
  def apply(raw: js.Function): Chainable[js.Function] = js.native
  def after(instance: js.Function, n: Double): js.Function = js.native
  def cancel(instance: js.Function): js.Function = js.native
  def debounce(instance: js.Function): js.Function = js.native
  def debounce(instance: js.Function, ms: Double): js.Function = js.native
  def delay(instance: js.Function): js.Function = js.native
  def delay(instance: js.Function, ms: Double, args: js.Any*): js.Function = js.native
  def every(instance: js.Function): js.Function = js.native
  def every(instance: js.Function, ms: Double, args: js.Any*): js.Function = js.native
  def `lazy`(instance: js.Function): js.Function = js.native
  def `lazy`(instance: js.Function, ms: Double): js.Function = js.native
  def `lazy`(instance: js.Function, ms: Double, immediate: Boolean): js.Function = js.native
  def `lazy`(instance: js.Function, ms: Double, immediate: Boolean, limit: Double): js.Function = js.native
  def lock(instance: js.Function): js.Function = js.native
  def lock(instance: js.Function, n: Double): js.Function = js.native
  def memoize(instance: js.Function): js.Function = js.native
  def memoize(instance: js.Function, hashFn: String): js.Function = js.native
  def memoize(instance: js.Function, hashFn: String, limit: Double): js.Function = js.native
  def memoize(instance: js.Function, hashFn: js.Function): js.Function = js.native
  def memoize(instance: js.Function, hashFn: js.Function, limit: Double): js.Function = js.native
  def once(instance: js.Function): js.Function = js.native
  def partial(instance: js.Function, args: js.Any*): js.Function = js.native
  def throttle(instance: js.Function): js.Function = js.native
  def throttle(instance: js.Function, ms: Double): js.Function = js.native
}

