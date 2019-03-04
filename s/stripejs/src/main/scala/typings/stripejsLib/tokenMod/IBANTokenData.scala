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

object IBANTokenData {
  @scala.inline
  def apply(
    account_holder_name: java.lang.String,
    account_holder_type: stripejsLib.stripejsLibStrings.individual | stripejsLib.stripejsLibStrings.company,
    currency: java.lang.String
  ): IBANTokenData = {
    val __obj = js.Dynamic.literal(account_holder_name = account_holder_name, account_holder_type = account_holder_type.asInstanceOf[js.Any], currency = currency)
  
    __obj.asInstanceOf[IBANTokenData]
  }
}

