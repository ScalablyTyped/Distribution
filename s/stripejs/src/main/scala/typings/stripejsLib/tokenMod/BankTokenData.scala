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

object BankTokenData {
  @scala.inline
  def apply(
    account_holder_name: java.lang.String,
    account_holder_type: stripejsLib.stripejsLibStrings.individual | stripejsLib.stripejsLibStrings.company,
    account_number: java.lang.String,
    country: java.lang.String,
    currency: java.lang.String,
    routing_number: java.lang.String = null
  ): BankTokenData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("account_holder_name")(account_holder_name)
    __obj.updateDynamic("account_holder_type")(account_holder_type.asInstanceOf[js.Any])
    __obj.updateDynamic("account_number")(account_number)
    __obj.updateDynamic("country")(country)
    __obj.updateDynamic("currency")(currency)
    if (routing_number != null) __obj.updateDynamic("routing_number")(routing_number)
    __obj.asInstanceOf[BankTokenData]
  }
}

