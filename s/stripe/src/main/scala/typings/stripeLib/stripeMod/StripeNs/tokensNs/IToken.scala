package typings
package stripeLib.stripeMod.StripeNs.tokensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- stripeLib.stripeMod.StripeNs.tokensNs.IBankAccountToken because var conflicts: client_ip, created, id, livemode, `object`, `type`, used. Inlined bank_account */ trait IToken extends ICardToken {
  /**
    * Hash describing the bank account
    */
  var bank_account: js.UndefOr[stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccountHash] = js.undefined
}

object IToken {
  @scala.inline
  def apply(
    client_ip: java.lang.String,
    created: scala.Double,
    id: java.lang.String,
    livemode: scala.Boolean,
    `object`: stripeLib.stripeLibStrings.token,
    `type`: stripeLib.stripeLibStrings.card | stripeLib.stripeLibStrings.bank_account,
    used: scala.Boolean,
    bank_account: stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccountHash = null,
    card: stripeLib.stripeMod.StripeNs.cardsNs.ICardHash = null
  ): IToken = {
    val __obj = js.Dynamic.literal(client_ip = client_ip, created = created, id = id, livemode = livemode, used = used)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bank_account != null) __obj.updateDynamic("bank_account")(bank_account)
    if (card != null) __obj.updateDynamic("card")(card)
    __obj.asInstanceOf[IToken]
  }
}

