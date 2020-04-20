package typings.trezorConnect.mod

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
    val __obj = js.Dynamic.literal(address_n = address_n.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], prev_hash = prev_hash.asInstanceOf[js.Any], prev_index = prev_index.asInstanceOf[js.Any], script_type = script_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Input]
  }
}

