package typings
package stripeLib.stripeMod.StripeNs.tokensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBankAccountToken extends ITokenBase {
  /**
    * Hash describing the bank account
    */
  var bank_account: js.UndefOr[stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccountHash] = js.undefined
}

object IBankAccountToken {
  @scala.inline
  def apply(
    client_ip: java.lang.String,
    created: scala.Double,
    id: java.lang.String,
    livemode: scala.Boolean,
    `object`: stripeLib.stripeLibStrings.token,
    `type`: stripeLib.stripeLibStrings.card | stripeLib.stripeLibStrings.bank_account,
    used: scala.Boolean,
    bank_account: stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccountHash = null
  ): IBankAccountToken = {
    val __obj = js.Dynamic.literal(`object` = `object`, `type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("client_ip")(client_ip)
    __obj.updateDynamic("created")(created)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("livemode")(livemode)
    __obj.updateDynamic("used")(used)
    if (bank_account != null) __obj.updateDynamic("bank_account")(bank_account)
    __obj.asInstanceOf[IBankAccountToken]
  }
}

