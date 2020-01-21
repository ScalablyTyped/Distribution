package typings.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegularOutput extends Output {
  var address: String
  var amount: String
  var script_type: js.UndefOr[String] = js.undefined
}

object RegularOutput {
  @scala.inline
  def apply(address: String, amount: String, script_type: String = null): RegularOutput = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any])
    if (script_type != null) __obj.updateDynamic("script_type")(script_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegularOutput]
  }
}

