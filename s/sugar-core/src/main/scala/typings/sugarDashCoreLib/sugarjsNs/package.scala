package typings
package sugarDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sugarjsNs {
  type NativeConstructor = stdLib.ArrayConstructor | stdLib.DateConstructor | stdLib.FunctionConstructor | stdLib.NumberConstructor | stdLib.ObjectConstructor | stdLib.RegExpConstructor | stdLib.StringConstructor | stdLib.BooleanConstructor | stdLib.ErrorConstructor
  type SugarDefaultChainable[RawValue] = (sugarDashCoreLib.sugarjsNs.ArrayNs.Chainable[_, RawValue]) with sugarDashCoreLib.sugarjsNs.DateNs.Chainable[RawValue] with sugarDashCoreLib.sugarjsNs.FunctionNs.Chainable[RawValue] with sugarDashCoreLib.sugarjsNs.NumberNs.Chainable[RawValue] with sugarDashCoreLib.sugarjsNs.ObjectNs.Chainable[RawValue] with sugarDashCoreLib.sugarjsNs.RegExpNs.Chainable[RawValue] with sugarDashCoreLib.sugarjsNs.StringNs.Chainable[RawValue]
}
