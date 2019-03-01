package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalOutput extends Output {
  var address_n: js.Array[scala.Double]
  var amount: java.lang.String
  var script_type: js.UndefOr[java.lang.String] = js.undefined
}

object InternalOutput {
  @scala.inline
  def apply(address_n: js.Array[scala.Double], amount: java.lang.String, script_type: java.lang.String = null): InternalOutput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address_n")(address_n)
    __obj.updateDynamic("amount")(amount)
    if (script_type != null) __obj.updateDynamic("script_type")(script_type)
    __obj.asInstanceOf[InternalOutput]
  }
}

