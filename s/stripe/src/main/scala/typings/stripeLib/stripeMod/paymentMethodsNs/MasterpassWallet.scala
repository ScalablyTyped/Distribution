package typings
package stripeLib.stripeMod.paymentMethodsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasterpassWallet extends CardWallet {
  var masterpass: WalletData
  var `type`: stripeLib.stripeLibStrings.masterpass
}

object MasterpassWallet {
  @scala.inline
  def apply(masterpass: WalletData, `type`: stripeLib.stripeLibStrings.masterpass): MasterpassWallet = {
    val __obj = js.Dynamic.literal(masterpass = masterpass)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MasterpassWallet]
  }
}

