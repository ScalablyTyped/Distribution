package typings.stripejs.tokenMod

import typings.stripejs.customerMod.BankAccount
import typings.stripejs.customerMod.Card
import typings.stripejs.stripejsStrings.account
import typings.stripejs.stripejsStrings.bank_account
import typings.stripejs.stripejsStrings.card
import typings.stripejs.stripejsStrings.pii
import typings.stripejs.stripejsStrings.token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  /**
    * Hash describing the bank account
    */
  var bank_account: js.UndefOr[BankAccount] = js.undefined
  /**
    * Hash describing the card used to make the charge
    */
  var card: js.UndefOr[Card] = js.undefined
  /**
    * IP address of the client that generated the token
    */
  var client_ip: String
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch
    */
  var created: String
  /**
    * The unique identifier for the token
    */
  var id: String
  /**
    * LIVE MODE = `true`
    * TEST MODE = `false`
    */
  var livemode: Boolean
  var `object`: token
  /**
    * Type of the token
    */
  var `type`: account | bank_account | card | pii
  /**
    * Whether this token has already been used (tokens can be used only once)
    */
  var used: Boolean
}

object Token {
  @scala.inline
  def apply(
    client_ip: String,
    created: String,
    id: String,
    livemode: Boolean,
    `object`: token,
    `type`: account | bank_account | card | pii,
    used: Boolean,
    bank_account: BankAccount = null,
    card: Card = null
  ): Token = {
    val __obj = js.Dynamic.literal(client_ip = client_ip.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bank_account != null) __obj.updateDynamic("bank_account")(bank_account.asInstanceOf[js.Any])
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

