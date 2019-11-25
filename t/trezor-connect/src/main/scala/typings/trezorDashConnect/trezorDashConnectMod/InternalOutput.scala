package typings.trezorDashConnect.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalOutput extends Output {
  var address_n: js.Array[Double]
  var amount: String
  var script_type: js.UndefOr[String] = js.undefined
}

object InternalOutput {
  @scala.inline
  def apply(address_n: js.Array[Double], amount: String, script_type: String = null): InternalOutput = {
    val __obj = js.Dynamic.literal(address_n = address_n.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any])
    if (script_type != null) __obj.updateDynamic("script_type")(script_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalOutput]
  }
}

