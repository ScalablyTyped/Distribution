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
    def after(n: Double): SugarDefaultChainable[typings.sugar.Function] = js.native
    @JSName("apply")
    def apply(thisArg: js.Any): SugarDefaultChainable[_] = js.native
    @JSName("apply")
    def apply(thisArg: js.Any, argArray: js.Any): SugarDefaultChainable[_] = js.native
    def bind(thisArg: js.Any, argArray: js.Any*): SugarDefaultChainable[_] = js.native
    def call(thisArg: js.Any, argArray: js.Any*): SugarDefaultChainable[_] = js.native
    def cancel(): SugarDefaultChainable[typings.sugar.Function] = js.native
    def debounce(): SugarDefaultChainable[typings.sugar.Function] = js.native
    def debounce(ms: Double): SugarDefaultChainable[typings.sugar.Function] = js.native
    def delay(): SugarDefaultChainable[typings.sugar.Function] = js.native
    def delay(ms: Double, args: js.Any*): SugarDefaultChainable[typings.sugar.Function] = js.native
    def every(): SugarDefaultChainable[typings.sugar.Function] = js.native
    def every(ms: Double, args: js.Any*): SugarDefaultChainable[typings.sugar.Function] = js.native
    def `lazy`(): SugarDefaultChainable[typings.sugar.Function] = js.native
    def `lazy`(ms: Double): SugarDefaultChainable[typings.sugar.Function] = js.native
    def `lazy`(ms: Double, immediate: Boolean): SugarDefaultChainable[typings.sugar.Function] = js.native
    def `lazy`(ms: Double, immediate: Boolean, limit: Double): SugarDefaultChainable[typings.sugar.Function] = js.native
    def lock(): SugarDefaultChainable[typings.sugar.Function] = js.native
    def lock(n: Double): SugarDefaultChainable[typings.sugar.Function] = js.native
    def memoize(): SugarDefaultChainable[typings.sugar.Function] = js.native
    def memoize(hashFn: java.lang.String): SugarDefaultChainable[typings.sugar.Function] = js.native
    def memoize(hashFn: java.lang.String, limit: Double): SugarDefaultChainable[typings.sugar.Function] = js.native
    def memoize(hashFn: typings.sugar.Function): SugarDefaultChainable[typings.sugar.Function] = js.native
    def memoize(hashFn: typings.sugar.Function, limit: Double): SugarDefaultChainable[typings.sugar.Function] = js.native
    def once(): SugarDefaultChainable[typings.sugar.Function] = js.native
    def partial(args: js.Any*): SugarDefaultChainable[typings.sugar.Function] = js.native
    def throttle(): SugarDefaultChainable[typings.sugar.Function] = js.native
    def throttle(ms: Double): SugarDefaultChainable[typings.sugar.Function] = js.native
  }
  
  @js.native
  trait Constructor
    extends SugarNamespace
       with Instantiable0[Chainable[typings.sugar.Function]]
       with Instantiable1[/* raw */ typings.sugar.Function, Chainable[typings.sugar.Function]] {
    def apply(): Chainable[typings.sugar.Function] = js.native
    def apply(raw: typings.sugar.Function): Chainable[typings.sugar.Function] = js.native
    def after(instance: typings.sugar.Function, n: Double): typings.sugar.Function = js.native
    def cancel(instance: typings.sugar.Function): typings.sugar.Function = js.native
    def debounce(instance: typings.sugar.Function): typings.sugar.Function = js.native
    def debounce(instance: typings.sugar.Function, ms: Double): typings.sugar.Function = js.native
    def delay(instance: typings.sugar.Function): typings.sugar.Function = js.native
    def delay(instance: typings.sugar.Function, ms: Double, args: js.Any*): typings.sugar.Function = js.native
    def every(instance: typings.sugar.Function): typings.sugar.Function = js.native
    def every(instance: typings.sugar.Function, ms: Double, args: js.Any*): typings.sugar.Function = js.native
    def `lazy`(instance: typings.sugar.Function): typings.sugar.Function = js.native
    def `lazy`(instance: typings.sugar.Function, ms: Double): typings.sugar.Function = js.native
    def `lazy`(instance: typings.sugar.Function, ms: Double, immediate: Boolean): typings.sugar.Function = js.native
    def `lazy`(instance: typings.sugar.Function, ms: Double, immediate: Boolean, limit: Double): typings.sugar.Function = js.native
    def lock(instance: typings.sugar.Function): typings.sugar.Function = js.native
    def lock(instance: typings.sugar.Function, n: Double): typings.sugar.Function = js.native
    def memoize(instance: typings.sugar.Function): typings.sugar.Function = js.native
    def memoize(instance: typings.sugar.Function, hashFn: java.lang.String): typings.sugar.Function = js.native
    def memoize(instance: typings.sugar.Function, hashFn: java.lang.String, limit: Double): typings.sugar.Function = js.native
    def memoize(instance: typings.sugar.Function, hashFn: typings.sugar.Function): typings.sugar.Function = js.native
    def memoize(instance: typings.sugar.Function, hashFn: typings.sugar.Function, limit: Double): typings.sugar.Function = js.native
    def once(instance: typings.sugar.Function): typings.sugar.Function = js.native
    def partial(instance: typings.sugar.Function, args: js.Any*): typings.sugar.Function = js.native
    def throttle(instance: typings.sugar.Function): typings.sugar.Function = js.native
    def throttle(instance: typings.sugar.Function, ms: Double): typings.sugar.Function = js.native
  }
  
  type Chainable[RawValue] = ChainableBase[RawValue] with typings.sugar.sugarjs.Object.ChainableBase[RawValue]
}

