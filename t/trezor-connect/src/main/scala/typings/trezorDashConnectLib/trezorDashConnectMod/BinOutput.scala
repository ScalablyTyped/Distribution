package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinOutput extends js.Object {
  var amount: scala.Double
  var script_pubkey: java.lang.String
}

object BinOutput {
  @scala.inline
  def apply(amount: scala.Double, script_pubkey: java.lang.String): BinOutput = {
    val __obj = js.Dynamic.literal(amount = amount, script_pubkey = script_pubkey)
  
    __obj.asInstanceOf[BinOutput]
  }
}

