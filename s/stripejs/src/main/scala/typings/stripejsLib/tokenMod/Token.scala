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

