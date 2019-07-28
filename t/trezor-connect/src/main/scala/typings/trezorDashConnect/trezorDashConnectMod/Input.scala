package typings.trezorDashConnect.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Input extends js.Object {
  var address_n: js.Array[Double]
  var amount: String
  var prev_hash: String
  var prev_index: Double
  var script_type: String
}

object Input {
  @scala.inline
  def apply(
    address_n: js.Array[Double],
    amount: String,
    prev_hash: String,
    prev_index: Double,
    script_type: String
  ): Input = {
    val __obj = js.Dynamic.literal(address_n = address_n, amount = amount, prev_hash = prev_hash, prev_index = prev_index, script_type = script_type)
  
    __obj.asInstanceOf[Input]
  }
}

