package typings.stripe.stripeMod.tokens

import typings.stripe.stripeMod.cards.ICardHash
import typings.stripe.stripeStrings.bank_account
import typings.stripe.stripeStrings.card
import typings.stripe.stripeStrings.token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICardToken extends ITokenBase {
  /**
    * Hash describing the card used to make the charge
    */
  var card: js.UndefOr[ICardHash] = js.undefined
}

object ICardToken {
  @scala.inline
  def apply(
    client_ip: String,
    created: Double,
    id: String,
    livemode: Boolean,
    `object`: token,
    `type`: card | bank_account,
    used: Boolean,
    card: ICardHash = null
  ): ICardToken = {
    val __obj = js.Dynamic.literal(client_ip = client_ip, created = created, id = id, livemode = livemode, used = used)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (card != null) __obj.updateDynamic("card")(card)
    __obj.asInstanceOf[ICardToken]
  }
}

