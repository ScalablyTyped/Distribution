package typings
package sugarDashCoreLib.sugarjsNs.FunctionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChainableBase[RawValue] extends js.Object {
  var raw: RawValue = js.native
  @JSName("apply")
  def apply(thisArg: js.Any): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[_] = js.native
  @JSName("apply")
  def apply(thisArg: js.Any, argArray: js.Any): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[_] = js.native
  def bind(thisArg: js.Any, argArray: js.Any*): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[_] = js.native
  def call(thisArg: js.Any, argArray: js.Any*): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[_] = js.native
}

