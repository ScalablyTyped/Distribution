package typings.sugarDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sugarjsNs {
  import typings.std.ArrayConstructor
  import typings.std.BooleanConstructor
  import typings.std.DateConstructor
  import typings.std.ErrorConstructor
  import typings.std.FunctionConstructor
  import typings.std.NumberConstructor
  import typings.std.ObjectConstructor
  import typings.std.RegExpConstructor
  import typings.std.StringConstructor
  import typings.sugarDashCore.sugarjsNs.ArrayNs.Chainable

  type NativeConstructor = ArrayConstructor | DateConstructor | FunctionConstructor | NumberConstructor | ObjectConstructor | RegExpConstructor | StringConstructor | BooleanConstructor | ErrorConstructor
  type SugarDefaultChainable[RawValue] = (Chainable[_, RawValue]) with typings.sugarDashCore.sugarjsNs.DateNs.Chainable[RawValue] with typings.sugarDashCore.sugarjsNs.FunctionNs.Chainable[RawValue] with typings.sugarDashCore.sugarjsNs.NumberNs.Chainable[RawValue] with typings.sugarDashCore.sugarjsNs.ObjectNs.Chainable[RawValue] with typings.sugarDashCore.sugarjsNs.RegExpNs.Chainable[RawValue] with typings.sugarDashCore.sugarjsNs.StringNs.Chainable[RawValue]
}
