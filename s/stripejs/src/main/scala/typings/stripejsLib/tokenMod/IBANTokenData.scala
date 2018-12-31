package typings
package stripejsLib.tokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBANTokenData extends js.Object {
  /**
    * The name of the person or business that owns the bank account.
    */
  var account_holder_name: java.lang.String
  /**
    * The type of entity that holds the account.
    */
  var account_holder_type: stripejsLib.stripejsLibStrings.individual | stripejsLib.stripejsLibStrings.company
  /**
    * Three-letter ISO code for the currency paid out to the bank account
    * @example 'usd'
    */
  var currency: java.lang.String
}

