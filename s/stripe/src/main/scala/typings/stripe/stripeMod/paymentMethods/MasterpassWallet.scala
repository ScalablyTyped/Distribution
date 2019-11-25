package typings.stripe.stripeMod.paymentMethods

import typings.stripe.stripeStrings.masterpass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasterpassWallet extends CardWallet {
  var masterpass: WalletData
  var `type`: masterpass
}

object MasterpassWallet {
  @scala.inline
  def apply(masterpass: WalletData, `type`: masterpass): MasterpassWallet = {
    val __obj = js.Dynamic.literal(masterpass = masterpass.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasterpassWallet]
  }
}

