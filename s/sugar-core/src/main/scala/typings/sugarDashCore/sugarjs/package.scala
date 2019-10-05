package typings.sugarDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sugarjs {
  import typings.std.ArrayConstructor
  import typings.std.BooleanConstructor
  import typings.std.DateConstructor
  import typings.std.ErrorConstructor
  import typings.std.FunctionConstructor
  import typings.std.NumberConstructor
  import typings.std.ObjectConstructor
  import typings.std.RegExpConstructor
  import typings.std.StringConstructor
  import typings.sugarDashCore.sugarjs.Array.Chainable

  type NativeConstructor = ArrayConstructor | DateConstructor | FunctionConstructor | NumberConstructor | ObjectConstructor | RegExpConstructor | StringConstructor | BooleanConstructor | ErrorConstructor
  type SugarDefaultChainable[RawValue] = (Chainable[_, RawValue]) with typings.sugarDashCore.sugarjs.Date.Chainable[RawValue] with typings.sugarDashCore.sugarjs.Function.Chainable[RawValue] with typings.sugarDashCore.sugarjs.Number.Chainable[RawValue] with typings.sugarDashCore.sugarjs.Object.Chainable[RawValue] with typings.sugarDashCore.sugarjs.RegExp.Chainable[RawValue] with typings.sugarDashCore.sugarjs.String.Chainable[RawValue]
}
