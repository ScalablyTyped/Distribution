package typings.stripe.mod.accounts

import typings.stripe.mod.IMetadata
import typings.stripe.stripeStrings.Discover
import typings.stripe.stripeStrings.JCB
import typings.stripe.stripeStrings.MasterCard
import typings.stripe.stripeStrings.Unknown
import typings.stripe.stripeStrings.Visa
import typings.stripe.stripeStrings.`American Express`
import typings.stripe.stripeStrings.`Diners Club`
import typings.stripe.stripeStrings.`new`
import typings.stripe.stripeStrings.credit
import typings.stripe.stripeStrings.debit
import typings.stripe.stripeStrings.errored
import typings.stripe.stripeStrings.fail
import typings.stripe.stripeStrings.pass
import typings.stripe.stripeStrings.prepaid
import typings.stripe.stripeStrings.unavailable
import typings.stripe.stripeStrings.unchecked
import typings.stripe.stripeStrings.unknown_
import typings.stripe.stripeStrings.validated
import typings.stripe.stripeStrings.verification_failed
import typings.stripe.stripeStrings.verified
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Helper
/* Rewritten from type alias, can be one of: 
  - typings.stripe.mod.bankAccounts.IBankAccount
  - typings.stripe.mod.cards.ICard
*/
trait IExternalAccount extends StObject
object IExternalAccount {
  
  @scala.inline
  def IBankAccount(
    bank_name: String,
    country: String,
    currency: String,
    fingerprint: String,
    id: String,
    last4: String,
    metadata: IMetadata,
    routing_number: String,
    status: `new` | validated | verified | verification_failed | errored
  ): typings.stripe.mod.bankAccounts.IBankAccount = {
    val __obj = js.Dynamic.literal(bank_name = bank_name.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], account_holder_name = null, account_holder_type = null)
    __obj.updateDynamic("object")("bank_account")
    __obj.asInstanceOf[typings.stripe.mod.bankAccounts.IBankAccount]
  }
  
  @scala.inline
  def ICard(
    brand: Visa | (`American Express`) | MasterCard | Discover | JCB | (`Diners Club`) | Unknown,
    country: String,
    cvc_check: pass | fail | unavailable | unchecked,
    exp_month: Double,
    exp_year: Double,
    fingerprint: String,
    funding: credit | debit | prepaid | unknown_,
    id: String,
    last4: String
  ): typings.stripe.mod.cards.ICard = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], cvc_check = cvc_check.asInstanceOf[js.Any], exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], funding = funding.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], address_city = null, address_country = null, address_line1 = null, address_line1_check = null, address_line2 = null, address_state = null, address_zip = null, address_zip_check = null, dynamic_last4 = null, name = null, tokenization_method = null)
    __obj.updateDynamic("object")("card")
    __obj.asInstanceOf[typings.stripe.mod.cards.ICard]
  }
}
