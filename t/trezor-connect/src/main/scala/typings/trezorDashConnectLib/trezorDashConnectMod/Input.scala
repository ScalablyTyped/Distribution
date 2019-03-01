package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Input extends js.Object {
  var address_n: js.Array[scala.Double]
  var amount: java.lang.String
  var prev_hash: java.lang.String
  var prev_index: scala.Double
  var script_type: java.lang.String
}

object Input {
  @scala.inline
  def apply(
    address_n: js.Array[scala.Double],
    amount: java.lang.String,
    prev_hash: java.lang.String,
    prev_index: scala.Double,
    script_type: java.lang.String
  ): Input = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address_n")(address_n)
    __obj.updateDynamic("amount")(amount)
    __obj.updateDynamic("prev_hash")(prev_hash)
    __obj.updateDynamic("prev_index")(prev_index)
    __obj.updateDynamic("script_type")(script_type)
    __obj.asInstanceOf[Input]
  }
}

