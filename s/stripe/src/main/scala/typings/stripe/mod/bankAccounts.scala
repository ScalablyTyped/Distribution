package typings.stripe.mod

import typings.stripe.mod.accounts.IExternalAccount
import typings.stripe.stripeStrings.`new`
import typings.stripe.stripeStrings.bank_account
import typings.stripe.stripeStrings.company
import typings.stripe.stripeStrings.errored
import typings.stripe.stripeStrings.individual
import typings.stripe.stripeStrings.validated
import typings.stripe.stripeStrings.verification_failed
import typings.stripe.stripeStrings.verified
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bankAccounts {
  
  trait IBankAccount
    extends StObject
       with IBankAccountHash
       with IExternalAccount
       with IStripeSource {
    
    var account: js.UndefOr[String] = js.undefined
    
    /**
      * This indicates whether or not this bank account is the default external account for its currency.
      */
    var default_for_currency: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A set of key/value pairs that you can attach to a bank account object. It
      * can be useful for storing additional information about the bank account in
      * a structured format.
      */
    var metadata: IMetadata
  }
  object IBankAccount {
    
    inline def apply(
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
    
    extension [Self <: typings.stripe.mod.bankAccounts.IBankAccount](x: Self) {
      
      inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
      
      inline def setDefault_for_currency(value: Boolean): Self = StObject.set(x, "default_for_currency", value.asInstanceOf[js.Any])
      
      inline def setDefault_for_currencyUndefined: Self = StObject.set(x, "default_for_currency", js.undefined)
      
      inline def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    }
  }
  
  trait IBankAccountHash
    extends StObject
       with IResourceObject {
    
    /**
      * The name of the person or business that owns the bank account.
      */
    var account_holder_name: String | Null
    
    /**
      * The type of entity that holds the account. This can be either
      * "individual"" or "company".
      */
    var account_holder_type: individual | company | Null
    
    /**
      * Name of the bank associated with the routing number, e.g. WELLS FARGO.
      */
    var bank_name: String
    
    /**
      * Two-letter ISO code representing the country the bank account is located in.
      */
    var country: String
    
    /**
      * Three-letter ISO currency code representing the currency paid out to the bank account.
      */
    var currency: String
    
    var customer: js.UndefOr[String] = js.undefined
    
    /**
      * Uniquely identifies this particular bank account. You can use this attribute
      * to check whether two bank accounts are the same.
      */
    var fingerprint: String
    
    var last4: String
    
    /**
      * value is "bank_account"
      */
    @JSName("object")
    var object_IBankAccountHash: bank_account
    
    /**
      * The routing transit number for the bank account.
      */
    var routing_number: String
    
    /**
      * Possible values are "new", "validated", "verified", "verification_failed",
      * or "errored". A bank account that hasn’t had any activity or validation
      * performed is "new". If Stripe can determine that the bank account exists, its
      * status will be "validated". Note that there often isn’t enough information
      * to know (e.g. for smaller credit unions), and the validation is not always
      * run. If customer bank account verification has succeeded, the bank
      * account status will be "verified". If the verification failed for any reason,
      * such as microdeposit failure, the status will be "verification_failed". If a
      * transfer sent to this bank account fails, we’ll set the status to "errored""
      * and will not continue to send transfers until the bank details are updated.
      */
    var status: `new` | validated | verified | verification_failed | errored
  }
  object IBankAccountHash {
    
    inline def apply(
      bank_name: String,
      country: String,
      currency: String,
      fingerprint: String,
      id: String,
      last4: String,
      routing_number: String,
      status: `new` | validated | verified | verification_failed | errored
    ): IBankAccountHash = {
      val __obj = js.Dynamic.literal(bank_name = bank_name.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], account_holder_name = null, account_holder_type = null)
      __obj.updateDynamic("object")("bank_account")
      __obj.asInstanceOf[IBankAccountHash]
    }
    
    extension [Self <: IBankAccountHash](x: Self) {
      
      inline def setAccount_holder_name(value: String): Self = StObject.set(x, "account_holder_name", value.asInstanceOf[js.Any])
      
      inline def setAccount_holder_nameNull: Self = StObject.set(x, "account_holder_name", null)
      
      inline def setAccount_holder_type(value: individual | company): Self = StObject.set(x, "account_holder_type", value.asInstanceOf[js.Any])
      
      inline def setAccount_holder_typeNull: Self = StObject.set(x, "account_holder_type", null)
      
      inline def setBank_name(value: String): Self = StObject.set(x, "bank_name", value.asInstanceOf[js.Any])
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
      
      inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
      
      inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      inline def setLast4(value: String): Self = StObject.set(x, "last4", value.asInstanceOf[js.Any])
      
      inline def setObject(value: bank_account): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setRouting_number(value: String): Self = StObject.set(x, "routing_number", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: `new` | validated | verified | verification_failed | errored): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait IBankAccountUpdateOptions
    extends StObject
       with IDataOptionsWithMetadata {
    
    /**
      * The name of the person or business that owns the bank account.
      */
    var account_holder_name: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The type of entity that holds the account. This can be either "individual" or "company".
      */
    var account_holder_type: js.UndefOr[individual | company | Null] = js.undefined
  }
  object IBankAccountUpdateOptions {
    
    inline def apply(): IBankAccountUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBankAccountUpdateOptions]
    }
    
    extension [Self <: IBankAccountUpdateOptions](x: Self) {
      
      inline def setAccount_holder_name(value: String): Self = StObject.set(x, "account_holder_name", value.asInstanceOf[js.Any])
      
      inline def setAccount_holder_nameNull: Self = StObject.set(x, "account_holder_name", null)
      
      inline def setAccount_holder_nameUndefined: Self = StObject.set(x, "account_holder_name", js.undefined)
      
      inline def setAccount_holder_type(value: individual | company): Self = StObject.set(x, "account_holder_type", value.asInstanceOf[js.Any])
      
      inline def setAccount_holder_typeNull: Self = StObject.set(x, "account_holder_type", null)
      
      inline def setAccount_holder_typeUndefined: Self = StObject.set(x, "account_holder_type", js.undefined)
    }
  }
  
  trait IBankAccountVerifyOptions extends StObject {
    
    /**
      * Two positive integers, in cents, equal to the values of the microdeposits sent to the bank account.
      */
    var amounts: js.Tuple2[Double, Double]
  }
  object IBankAccountVerifyOptions {
    
    inline def apply(amounts: js.Tuple2[Double, Double]): IBankAccountVerifyOptions = {
      val __obj = js.Dynamic.literal(amounts = amounts.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBankAccountVerifyOptions]
    }
    
    extension [Self <: IBankAccountVerifyOptions](x: Self) {
      
      inline def setAmounts(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "amounts", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISourceCreationOptions extends StObject {
    
    /**
      * The name of the person or business that owns the bank
      * account. This field is required when attaching the bank
      * account to a customer object.
      */
    var account_holder_name: js.UndefOr[String] = js.undefined
    
    /**
      * The type of entity that holds the account. This can be either
      * "individual" or "company". This field is required when
      * attaching the bank account to a customer object.
      */
    var account_holder_type: js.UndefOr[individual | company] = js.undefined
    
    /**
      * The account number for the bank account in string form.
      * Must be a checking account.
      */
    var account_number: String
    
    /**
      * The country the bank account is in.
      */
    var country: String
    
    /**
      * The currency the bank account is in. This must be a
      * country/currency pairing that Stripe supports.
      */
    var currency: String
    
    /**
      * The type of payment source. Should be "bank_account".
      */
    var `object`: bank_account
    
    /**
      * The routing number, sort code, or other country-appropriate
      * institution number for the bank account. For US bank
      * accounts, this is required and should be the ACH routing
      * number, not the wire routing number. If you are providing an
      * IBAN for account_number, this field is not required.
      */
    var routing_number: js.UndefOr[String] = js.undefined
  }
  object ISourceCreationOptions {
    
    inline def apply(account_number: String, country: String, currency: String): ISourceCreationOptions = {
      val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
      __obj.updateDynamic("object")("bank_account")
      __obj.asInstanceOf[ISourceCreationOptions]
    }
    
    extension [Self <: ISourceCreationOptions](x: Self) {
      
      inline def setAccount_holder_name(value: String): Self = StObject.set(x, "account_holder_name", value.asInstanceOf[js.Any])
      
      inline def setAccount_holder_nameUndefined: Self = StObject.set(x, "account_holder_name", js.undefined)
      
      inline def setAccount_holder_type(value: individual | company): Self = StObject.set(x, "account_holder_type", value.asInstanceOf[js.Any])
      
      inline def setAccount_holder_typeUndefined: Self = StObject.set(x, "account_holder_type", js.undefined)
      
      inline def setAccount_number(value: String): Self = StObject.set(x, "account_number", value.asInstanceOf[js.Any])
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setObject(value: bank_account): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setRouting_number(value: String): Self = StObject.set(x, "routing_number", value.asInstanceOf[js.Any])
      
      inline def setRouting_numberUndefined: Self = StObject.set(x, "routing_number", js.undefined)
    }
  }
}
