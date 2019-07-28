package typings.stripe.stripeMod.tokensNs

import typings.stripe.stripeMod.bankAccountsNs.IBankAccountHash
import typings.stripe.stripeStrings.bank_account
import typings.stripe.stripeStrings.card
import typings.stripe.stripeStrings.token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBankAccountToken extends ITokenBase {
  /**
    * Hash describing the bank account
    */
  var bank_account: js.UndefOr[IBankAccountHash] = js.undefined
}

object IBankAccountToken {
  @scala.inline
  def apply(
    client_ip: String,
    created: Double,
    id: String,
    livemode: Boolean,
    `object`: token,
    `type`: card | bank_account,
    used: Boolean,
    bank_account: IBankAccountHash = null
  ): IBankAccountToken = {
    val __obj = js.Dynamic.literal(client_ip = client_ip, created = created, id = id, livemode = livemode, used = used)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bank_account != null) __obj.updateDynamic("bank_account")(bank_account)
    __obj.asInstanceOf[IBankAccountToken]
  }
}

