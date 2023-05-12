package typings.stripe.anon

import typings.stripe.mod.Stripe.Account
import typings.stripe.mod.Stripe.BankAccount.AvailablePayoutMethod
import typings.stripe.mod.Stripe.BankAccount.FutureRequirements
import typings.stripe.mod.Stripe.BankAccount.Requirements
import typings.stripe.mod.Stripe.Customer
import typings.stripe.mod.Stripe.DeletedCustomer
import typings.stripe.mod.Stripe.Metadata
import typings.stripe.stripeStrings.bank_account
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.BankAccount> */
trait ResponseBankAccount extends StObject {
  
  /**
    * The ID of the account that the bank account is associated with.
    */
  var account: js.UndefOr[String | Account | Null] = js.undefined
  
  /**
    * The name of the person or business that owns the bank account.
    */
  var account_holder_name: String | Null
  
  /**
    * The type of entity that holds the account. This can be either `individual` or `company`.
    */
  var account_holder_type: String | Null
  
  /**
    * The bank account type. This can only be `checking` or `savings` in most countries. In Japan, this can only be `futsu` or `toza`.
    */
  var account_type: String | Null
  
  /**
    * A set of available payout methods for this bank account. Only values from this set should be passed as the `method` when creating a payout.
    */
  var available_payout_methods: js.UndefOr[js.Array[AvailablePayoutMethod] | Null] = js.undefined
  
  /**
    * Name of the bank associated with the routing number (e.g., `WELLS FARGO`).
    */
  var bank_name: String | Null
  
  /**
    * Two-letter ISO code representing the country the bank account is located in.
    */
  var country: String
  
  /**
    * Three-letter [ISO code for the currency](https://stripe.com/docs/payouts) paid out to the bank account.
    */
  var currency: String
  
  /**
    * The ID of the customer that the bank account is associated with.
    */
  var customer: js.UndefOr[String | Customer | DeletedCustomer | Null] = js.undefined
  
  /**
    * Whether this bank account is the default external account for its currency.
    */
  var default_for_currency: js.UndefOr[Boolean | Null] = js.undefined
  
  var deleted: js.UndefOr[Unit] = js.undefined
  
  /**
    * Uniquely identifies this particular bank account. You can use this attribute to check whether two bank accounts are the same.
    */
  var fingerprint: String | Null
  
  /**
    * Information about upcoming new requirements for the bank account, including what information needs to be collected.
    */
  var future_requirements: js.UndefOr[FutureRequirements | Null] = js.undefined
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  /**
    * The last four digits of the bank account number.
    */
  var last4: String
  
  var lastResponse: ApiVersion
  
  /**
    * Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: js.UndefOr[Metadata | Null] = js.undefined
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: bank_account
  
  /**
    * Information about the requirements for the bank account, including what information needs to be collected.
    */
  var requirements: js.UndefOr[Requirements | Null] = js.undefined
  
  /**
    * The routing transit number for the bank account.
    */
  var routing_number: String | Null
  
  /**
    * For bank accounts, possible values are `new`, `validated`, `verified`, `verification_failed`, or `errored`. A bank account that hasn't had any activity or validation performed is `new`. If Stripe can determine that the bank account exists, its status will be `validated`. Note that there often isn't enough information to know (e.g., for smaller credit unions), and the validation is not always run. If customer bank account verification has succeeded, the bank account status will be `verified`. If the verification failed for any reason, such as microdeposit failure, the status will be `verification_failed`. If a transfer sent to this bank account fails, we'll set the status to `errored` and will not continue to send transfers until the bank details are updated.
    *
    * For external accounts, possible values are `new`, `errored` and `verification_failed`. If a transfer fails, the status is set to `errored` and transfers are stopped until account details are updated. In India, if we can't [verify the owner of the bank account](https://support.stripe.com/questions/bank-account-ownership-verification), we'll set the status to `verification_failed`. Other validations aren't run against external accounts because they're only used for payouts. This means the other statuses don't apply.
    */
  var status: String
}
object ResponseBankAccount {
  
  inline def apply(
    country: String,
    currency: String,
    id: String,
    last4: String,
    lastResponse: ApiVersion,
    status: String
  ): ResponseBankAccount = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], account_holder_name = null, account_holder_type = null, account_type = null, bank_name = null, fingerprint = null, routing_number = null)
    __obj.updateDynamic("object")("bank_account")
    __obj.asInstanceOf[ResponseBankAccount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseBankAccount] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: String | Account): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountNull: Self = StObject.set(x, "account", null)
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setAccount_holder_name(value: String): Self = StObject.set(x, "account_holder_name", value.asInstanceOf[js.Any])
    
    inline def setAccount_holder_nameNull: Self = StObject.set(x, "account_holder_name", null)
    
    inline def setAccount_holder_type(value: String): Self = StObject.set(x, "account_holder_type", value.asInstanceOf[js.Any])
    
    inline def setAccount_holder_typeNull: Self = StObject.set(x, "account_holder_type", null)
    
    inline def setAccount_type(value: String): Self = StObject.set(x, "account_type", value.asInstanceOf[js.Any])
    
    inline def setAccount_typeNull: Self = StObject.set(x, "account_type", null)
    
    inline def setAvailable_payout_methods(value: js.Array[AvailablePayoutMethod]): Self = StObject.set(x, "available_payout_methods", value.asInstanceOf[js.Any])
    
    inline def setAvailable_payout_methodsNull: Self = StObject.set(x, "available_payout_methods", null)
    
    inline def setAvailable_payout_methodsUndefined: Self = StObject.set(x, "available_payout_methods", js.undefined)
    
    inline def setAvailable_payout_methodsVarargs(value: AvailablePayoutMethod*): Self = StObject.set(x, "available_payout_methods", js.Array(value*))
    
    inline def setBank_name(value: String): Self = StObject.set(x, "bank_name", value.asInstanceOf[js.Any])
    
    inline def setBank_nameNull: Self = StObject.set(x, "bank_name", null)
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCustomer(value: String | Customer | DeletedCustomer): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerNull: Self = StObject.set(x, "customer", null)
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setDefault_for_currency(value: Boolean): Self = StObject.set(x, "default_for_currency", value.asInstanceOf[js.Any])
    
    inline def setDefault_for_currencyNull: Self = StObject.set(x, "default_for_currency", null)
    
    inline def setDefault_for_currencyUndefined: Self = StObject.set(x, "default_for_currency", js.undefined)
    
    inline def setDeleted(value: Unit): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintNull: Self = StObject.set(x, "fingerprint", null)
    
    inline def setFuture_requirements(value: FutureRequirements): Self = StObject.set(x, "future_requirements", value.asInstanceOf[js.Any])
    
    inline def setFuture_requirementsNull: Self = StObject.set(x, "future_requirements", null)
    
    inline def setFuture_requirementsUndefined: Self = StObject.set(x, "future_requirements", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLast4(value: String): Self = StObject.set(x, "last4", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setObject(value: bank_account): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setRequirements(value: Requirements): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
    
    inline def setRequirementsNull: Self = StObject.set(x, "requirements", null)
    
    inline def setRequirementsUndefined: Self = StObject.set(x, "requirements", js.undefined)
    
    inline def setRouting_number(value: String): Self = StObject.set(x, "routing_number", value.asInstanceOf[js.Any])
    
    inline def setRouting_numberNull: Self = StObject.set(x, "routing_number", null)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
