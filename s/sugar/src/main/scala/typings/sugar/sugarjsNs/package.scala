package typings.sugar

import typings.std.ArrayConstructor
import typings.std.BooleanConstructor
import typings.std.DateConstructor
import typings.std.ErrorConstructor
import typings.std.FunctionConstructor
import typings.std.NumberConstructor
import typings.std.ObjectConstructor
import typings.std.RegExpConstructor
import typings.std.StringConstructor
import typings.sugar.sugarjsNs.ArrayNs.Chainable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sugarjsNs {
  type NativeConstructor = ArrayConstructor | DateConstructor | FunctionConstructor | NumberConstructor | ObjectConstructor | RegExpConstructor | StringConstructor | BooleanConstructor | ErrorConstructor
  type SugarDefaultChainable[RawValue] = (Chainable[_, RawValue]) with typings.sugar.sugarjsNs.DateNs.Chainable[RawValue] with typings.sugar.sugarjsNs.FunctionNs.Chainable[RawValue] with typings.sugar.sugarjsNs.NumberNs.Chainable[RawValue] with typings.sugar.sugarjsNs.ObjectNs.Chainable[RawValue] with typings.sugar.sugarjsNs.RegExpNs.Chainable[RawValue] with typings.sugar.sugarjsNs.StringNs.Chainable[RawValue]
}
