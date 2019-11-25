package typings.sugar.sugarjs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.sugar.sugarjs.Function.Chainable
import typings.sugar.sugarjs.Function.ChainableBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sugarjs.Function")
@js.native
object Function extends js.Object {
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
    def memoize(hashFn: java.lang.String): SugarDefaultChainable[js.Function] = js.native
    def memoize(hashFn: java.lang.String, limit: Double): SugarDefaultChainable[js.Function] = js.native
    def memoize(hashFn: js.Function): SugarDefaultChainable[js.Function] = js.native
    def memoize(hashFn: js.Function, limit: Double): SugarDefaultChainable[js.Function] = js.native
    def once(): SugarDefaultChainable[js.Function] = js.native
    def partial(args: js.Any*): SugarDefaultChainable[js.Function] = js.native
    def throttle(): SugarDefaultChainable[js.Function] = js.native
    def throttle(ms: Double): SugarDefaultChainable[js.Function] = js.native
  }
  
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
    def memoize(instance: js.Function, hashFn: java.lang.String): js.Function = js.native
    def memoize(instance: js.Function, hashFn: java.lang.String, limit: Double): js.Function = js.native
    def memoize(instance: js.Function, hashFn: js.Function): js.Function = js.native
    def memoize(instance: js.Function, hashFn: js.Function, limit: Double): js.Function = js.native
    def once(instance: js.Function): js.Function = js.native
    def partial(instance: js.Function, args: js.Any*): js.Function = js.native
    def throttle(instance: js.Function): js.Function = js.native
    def throttle(instance: js.Function, ms: Double): js.Function = js.native
  }
  
  type Chainable[RawValue] = ChainableBase[RawValue] with typings.sugar.sugarjs.Object.ChainableBase[RawValue]
}

