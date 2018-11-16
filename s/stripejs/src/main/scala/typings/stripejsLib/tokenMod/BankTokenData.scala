package typings
package stripejsLib.tokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BankTokenData extends IBANTokenData {
  /**
       * The bank account number
       */
  var account_number: java.lang.String
  /**
       * The 2-digit country ISO code
       * @example 'US'
       */
  var country: java.lang.String
  /**
       * The routing transit number for the bank account
       * NOTE: This is optional if the {@link BankTokenData.currency} is 'eur'
       */
  var routing_number: js.UndefOr[java.lang.String] = js.undefined
}

