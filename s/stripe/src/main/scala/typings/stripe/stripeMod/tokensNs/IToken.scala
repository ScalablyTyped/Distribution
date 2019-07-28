package typings.stripe.stripeMod.tokensNs

import typings.stripe.stripeMod.bankAccountsNs.IBankAccountHash
import typings.stripe.stripeMod.cardsNs.ICardHash
import typings.stripe.stripeStrings.bank_account
import typings.stripe.stripeStrings.card
import typings.stripe.stripeStrings.token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.stripe.stripeMod.tokensNs.IBankAccountToken because var conflicts: client_ip, created, id, livemode, `object`, `type`, used. Inlined bank_account */ trait IToken extends ICardToken {
  /**
    * Hash describing the bank account
    */
  var bank_account: js.UndefOr[IBankAccountHash] = js.undefined
}

object IToken {
  @scala.inline
  def apply(
    client_ip: String,
    created: Double,
    id: String,
    livemode: Boolean,
    `object`: token,
    `type`: card | bank_account,
    used: Boolean,
    bank_account: IBankAccountHash = null,
    card: ICardHash = null
  ): IToken = {
    val __obj = js.Dynamic.literal(client_ip = client_ip, created = created, id = id, livemode = livemode, used = used)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bank_account != null) __obj.updateDynamic("bank_account")(bank_account)
    if (card != null) __obj.updateDynamic("card")(card)
    __obj.asInstanceOf[IToken]
  }
}

