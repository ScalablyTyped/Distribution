package typings.stripejs.tokenMod

import typings.stripejs.stripejsStrings.company
import typings.stripejs.stripejsStrings.individual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BankTokenData extends IBANTokenData {
  /**
    * The bank account number
    */
  var account_number: String
  /**
    * The 2-digit country ISO code
    * @example 'US'
    */
  var country: String
  /**
    * The routing transit number for the bank account
    * NOTE: This is optional if the {@link BankTokenData.currency} is 'eur'
    */
  var routing_number: js.UndefOr[String] = js.undefined
}

object BankTokenData {
  @scala.inline
  def apply(
    account_holder_name: String,
    account_holder_type: individual | company,
    account_number: String,
    country: String,
    currency: String,
    routing_number: String = null
  ): BankTokenData = {
    val __obj = js.Dynamic.literal(account_holder_name = account_holder_name, account_holder_type = account_holder_type.asInstanceOf[js.Any], account_number = account_number, country = country, currency = currency)
    if (routing_number != null) __obj.updateDynamic("routing_number")(routing_number)
    __obj.asInstanceOf[BankTokenData]
  }
}

