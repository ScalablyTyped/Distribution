package typings.trezorDashConnect.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinOutput extends js.Object {
  var amount: Double
  var script_pubkey: String
}

object BinOutput {
  @scala.inline
  def apply(amount: Double, script_pubkey: String): BinOutput = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], script_pubkey = script_pubkey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BinOutput]
  }
}

