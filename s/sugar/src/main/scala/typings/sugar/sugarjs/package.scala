package typings.sugar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sugarjs {
  /* Rewritten from type alias, can be one of: 
    - typings.sugar.ArrayConstructor
    - typings.sugar.DateConstructor
    - typings.std.FunctionConstructor
    - typings.sugar.NumberConstructor
    - typings.sugar.ObjectConstructor
    - typings.sugar.RegExpConstructor
    - typings.sugar.StringConstructor
    - typings.std.BooleanConstructor
    - typings.std.ErrorConstructor
  */
  type NativeConstructor = typings.sugar.sugarjs._NativeConstructor | typings.std.FunctionConstructor | typings.std.BooleanConstructor | typings.std.ErrorConstructor
  type SugarDefaultChainable[RawValue] = (typings.sugar.sugarjs.Array.Chainable[_, RawValue]) with typings.sugar.sugarjs.Date.Chainable[RawValue] with typings.sugar.sugarjs.Function.Chainable[RawValue] with typings.sugar.sugarjs.Number.Chainable[RawValue] with typings.sugar.sugarjs.Object.Chainable[RawValue] with typings.sugar.sugarjs.RegExp.Chainable[RawValue] with typings.sugar.sugarjs.String.Chainable[RawValue]
}
