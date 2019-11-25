package typings.stripe.stripeMod.tokens

import typings.stripe.stripeMod.bankAccounts.IBankAccountHash
import typings.stripe.stripeMod.cards.ICardHash
import typings.stripe.stripeStrings.bank_account
import typings.stripe.stripeStrings.card
import typings.stripe.stripeStrings.token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.stripe.stripeMod.IObject because Already inherited
- typings.stripe.stripeMod.IResourceObject because Already inherited
- typings.stripe.stripeMod.tokens.ITokenBase because Already inherited
- typings.stripe.stripeMod.tokens.IBankAccountToken because var conflicts: client_ip, created, id, livemode, `object`, `type`, used. Inlined bank_account */ trait IToken extends ICardToken {
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
    val __obj = js.Dynamic.literal(client_ip = client_ip.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bank_account != null) __obj.updateDynamic("bank_account")(bank_account.asInstanceOf[js.Any])
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToken]
  }
}

