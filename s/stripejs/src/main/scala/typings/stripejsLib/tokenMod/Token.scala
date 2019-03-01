package typings
package stripejsLib.tokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  /**
    * Hash describing the bank account
    */
  var bank_account: js.UndefOr[stripejsLib.customerMod.BankAccount] = js.undefined
  /**
    * Hash describing the card used to make the charge
    */
  var card: js.UndefOr[stripejsLib.customerMod.Card] = js.undefined
  /**
    * IP address of the client that generated the token
    */
  var client_ip: java.lang.String
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch
    */
  var created: java.lang.String
  /**
    * The unique identifier for the token
    */
  var id: java.lang.String
  /**
    * LIVE MODE = `true`
    * TEST MODE = `false`
    */
  var livemode: scala.Boolean
  var `object`: stripejsLib.stripejsLibStrings.token
  /**
    * Type of the token
    */
  var `type`: stripejsLib.stripejsLibStrings.account | stripejsLib.stripejsLibStrings.bank_account | stripejsLib.stripejsLibStrings.card | stripejsLib.stripejsLibStrings.pii
  /**
    * Whether this token has already been used (tokens can be used only once)
    */
  var used: scala.Boolean
}

object Token {
  @scala.inline
  def apply(
    client_ip: java.lang.String,
    created: java.lang.String,
    id: java.lang.String,
    livemode: scala.Boolean,
    `object`: stripejsLib.stripejsLibStrings.token,
    `type`: stripejsLib.stripejsLibStrings.account | stripejsLib.stripejsLibStrings.bank_account | stripejsLib.stripejsLibStrings.card | stripejsLib.stripejsLibStrings.pii,
    used: scala.Boolean,
    bank_account: stripejsLib.customerMod.BankAccount = null,
    card: stripejsLib.customerMod.Card = null
  ): Token = {
    val __obj = js.Dynamic.literal(`object` = `object`, `type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("client_ip")(client_ip)
    __obj.updateDynamic("created")(created)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("livemode")(livemode)
    __obj.updateDynamic("used")(used)
    if (bank_account != null) __obj.updateDynamic("bank_account")(bank_account)
    if (card != null) __obj.updateDynamic("card")(card)
    __obj.asInstanceOf[Token]
  }
}

