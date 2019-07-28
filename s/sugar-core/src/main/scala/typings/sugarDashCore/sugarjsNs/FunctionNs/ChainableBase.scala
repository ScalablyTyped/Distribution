package typings.sugarDashCore.sugarjsNs.FunctionNs

import typings.sugarDashCore.sugarjsNs.SugarDefaultChainable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChainableBase[RawValue] extends js.Object {
  var raw: RawValue = js.native
  @JSName("apply")
  def apply(thisArg: js.Any): SugarDefaultChainable[_] = js.native
  @JSName("apply")
  def apply(thisArg: js.Any, argArray: js.Any): SugarDefaultChainable[_] = js.native
  def bind(thisArg: js.Any, argArray: js.Any*): SugarDefaultChainable[_] = js.native
  def call(thisArg: js.Any, argArray: js.Any*): SugarDefaultChainable[_] = js.native
}

