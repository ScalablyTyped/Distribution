package typings
package stripeLib.stripeMod.tokensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBankAccountToken extends ITokenBase {
  /**
    * Hash describing the bank account
    */
  var bank_account: js.UndefOr[stripeLib.stripeMod.bankAccountsNs.IBankAccountHash] = js.undefined
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
    bank_account: stripeLib.stripeMod.bankAccountsNs.IBankAccountHash = null
  ): IBankAccountToken = {
    val __obj = js.Dynamic.literal(client_ip = client_ip, created = created, id = id, livemode = livemode, used = used)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bank_account != null) __obj.updateDynamic("bank_account")(bank_account)
    __obj.asInstanceOf[IBankAccountToken]
  }
}

