package typings.stripe.stripeMod.paymentMethodsNs

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
    val __obj = js.Dynamic.literal(masterpass = masterpass)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MasterpassWallet]
  }
}

