package typings
package sugarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sugarjsNs {
  type NativeConstructor = stdLib.ArrayConstructor | stdLib.DateConstructor | stdLib.FunctionConstructor | stdLib.NumberConstructor | stdLib.ObjectConstructor | stdLib.RegExpConstructor | stdLib.StringConstructor | stdLib.BooleanConstructor | stdLib.ErrorConstructor
  type SugarDefaultChainable[RawValue] = (sugarLib.sugarjsNs.ArrayNs.Chainable[_, RawValue]) with sugarLib.sugarjsNs.DateNs.Chainable[RawValue] with sugarLib.sugarjsNs.FunctionNs.Chainable[RawValue] with sugarLib.sugarjsNs.NumberNs.Chainable[RawValue] with sugarLib.sugarjsNs.ObjectNs.Chainable[RawValue] with sugarLib.sugarjsNs.RegExpNs.Chainable[RawValue] with sugarLib.sugarjsNs.StringNs.Chainable[RawValue]
}
