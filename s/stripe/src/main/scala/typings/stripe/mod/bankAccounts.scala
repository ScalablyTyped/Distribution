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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bankAccounts {
  
  @js.native
  trait IBankAccount
    extends IBankAccountHash
       with IExternalAccount
       with IStripeSource {
    
    var account: js.UndefOr[String] = js.native
    
    /**
      * This indicates whether or not this bank account is the default external account for its currency.
      */
    var default_for_currency: js.UndefOr[Boolean] = js.native
    
    /**
      * A set of key/value pairs that you can attach to a bank account object. It
      * can be useful for storing additional information about the bank account in
      * a structured format.
      */
    var metadata: IMetadata = js.native
  }
  object IBankAccount {
    
    @scala.inline
    def apply(
      bank_name: String,
      country: String,
      currency: String,
      fingerprint: String,
      id: String,
      last4: String,
      metadata: IMetadata,
      `object`: bank_account,
      routing_number: String,
      status: `new` | validated | verified | verification_failed | errored
    ): typings.stripe.mod.bankAccounts.IBankAccount = {
      val __obj = js.Dynamic.literal(bank_name = bank_name.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.stripe.mod.bankAccounts.IBankAccount]
    }
    
    @scala.inline
    implicit class IBankAccountMutableBuilder[Self <: typings.stripe.mod.bankAccounts.IBankAccount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
      
      @scala.inline
      def setDefault_for_currency(value: Boolean): Self = StObject.set(x, "default_for_currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefault_for_currencyUndefined: Self = StObject.set(x, "default_for_currency", js.undefined)
      
      @scala.inline
      def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IBankAccountHash extends IResourceObject {
    
    /**
      * The name of the person or business that owns the bank account.
      */
    var account_holder_name: String | Null = js.native
    
    /**
      * The type of entity that holds the account. This can be either
      * "individual"" or "company".
      */
    var account_holder_type: individual | company | Null = js.native
    
    /**
      * Name of the bank associated with the routing number, e.g. WELLS FARGO.
      */
    var bank_name: String = js.native
    
    /**
      * Two-letter ISO code representing the country the bank account is located in.
      */
    var country: String = js.native
    
    /**
      * Three-letter ISO currency code representing the currency paid out to the bank account.
      */
    var currency: String = js.native
    
    var customer: js.UndefOr[String] = js.native
    
    /**
      * Uniquely identifies this particular bank account. You can use this attribute
      * to check whether two bank accounts are the same.
      */
    var fingerprint: String = js.native
    
    var last4: String = js.native
    
    /**
      * value is "bank_account"
      */
    @JSName("object")
    var object_IBankAccountHash: bank_account = js.native
    
    /**
      * The routing transit number for the bank account.
      */
    var routing_number: String = js.native
    
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
    var status: `new` | validated | verified | verification_failed | errored = js.native
  }
  object IBankAccountHash {
    
    @scala.inline
    def apply(
      bank_name: String,
      country: String,
      currency: String,
      fingerprint: String,
      id: String,
      last4: String,
      `object`: bank_account,
      routing_number: String,
      status: `new` | validated | verified | verification_failed | errored
    ): IBankAccountHash = {
      val __obj = js.Dynamic.literal(bank_name = bank_name.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBankAccountHash]
    }
    
    @scala.inline
    implicit class IBankAccountHashMutableBuilder[Self <: IBankAccountHash] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccount_holder_name(value: String): Self = StObject.set(x, "account_holder_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccount_holder_nameNull: Self = StObject.set(x, "account_holder_name", null)
      
      @scala.inline
      def setAccount_holder_type(value: individual | company): Self = StObject.set(x, "account_holder_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccount_holder_typeNull: Self = StObject.set(x, "account_holder_type", null)
      
      @scala.inline
      def setBank_name(value: String): Self = StObject.set(x, "bank_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
      
      @scala.inline
      def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast4(value: String): Self = StObject.set(x, "last4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: bank_account): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouting_number(value: String): Self = StObject.set(x, "routing_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: `new` | validated | verified | verification_failed | errored): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IBankAccountUpdateOptions extends IDataOptionsWithMetadata {
    
    /**
      * The name of the person or business that owns the bank account.
      */
    var account_holder_name: js.UndefOr[String | Null] = js.native
    
    /**
      * The type of entity that holds the account. This can be either "individual" or "company".
      */
    var account_holder_type: js.UndefOr[individual | company | Null] = js.native
  }
  object IBankAccountUpdateOptions {
    
    @scala.inline
    def apply(): IBankAccountUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBankAccountUpdateOptions]
    }
    
    @scala.inline
    implicit class IBankAccountUpdateOptionsMutableBuilder[Self <: IBankAccountUpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccount_holder_name(value: String): Self = StObject.set(x, "account_holder_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccount_holder_nameNull: Self = StObject.set(x, "account_holder_name", null)
      
      @scala.inline
      def setAccount_holder_nameUndefined: Self = StObject.set(x, "account_holder_name", js.undefined)
      
      @scala.inline
      def setAccount_holder_type(value: individual | company): Self = StObject.set(x, "account_holder_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccount_holder_typeNull: Self = StObject.set(x, "account_holder_type", null)
      
      @scala.inline
      def setAccount_holder_typeUndefined: Self = StObject.set(x, "account_holder_type", js.undefined)
    }
  }
  
  @js.native
  trait IBankAccountVerifyOptions extends StObject {
    
    /**
      * Two positive integers, in cents, equal to the values of the microdeposits sent to the bank account.
      */
    var amounts: js.Tuple2[Double, Double] = js.native
  }
  object IBankAccountVerifyOptions {
    
    @scala.inline
    def apply(amounts: js.Tuple2[Double, Double]): IBankAccountVerifyOptions = {
      val __obj = js.Dynamic.literal(amounts = amounts.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBankAccountVerifyOptions]
    }
    
    @scala.inline
    implicit class IBankAccountVerifyOptionsMutableBuilder[Self <: IBankAccountVerifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmounts(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "amounts", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ISourceCreationOptions extends StObject {
    
    /**
      * The name of the person or business that owns the bank
      * account. This field is required when attaching the bank
      * account to a customer object.
      */
    var account_holder_name: js.UndefOr[String] = js.native
    
    /**
      * The type of entity that holds the account. This can be either
      * "individual" or "company". This field is required when
      * attaching the bank account to a customer object.
      */
    var account_holder_type: js.UndefOr[individual | company] = js.native
    
    /**
      * The account number for the bank account in string form.
      * Must be a checking account.
      */
    var account_number: String = js.native
    
    /**
      * The country the bank account is in.
      */
    var country: String = js.native
    
    /**
      * The currency the bank account is in. This must be a
      * country/currency pairing that Stripe supports.
      */
    var currency: String = js.native
    
    /**
      * The type of payment source. Should be "bank_account".
      */
    var `object`: bank_account = js.native
    
    /**
      * The routing number, sort code, or other country-appropriate
      * institution number for the bank account. For US bank
      * accounts, this is required and should be the ACH routing
      * number, not the wire routing number. If you are providing an
      * IBAN for account_number, this field is not required.
      */
    var routing_number: js.UndefOr[String] = js.native
  }
  object ISourceCreationOptions {
    
    @scala.inline
    def apply(account_number: String, country: String, currency: String, `object`: bank_account): ISourceCreationOptions = {
      val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISourceCreationOptions]
    }
    
    @scala.inline
    implicit class ISourceCreationOptionsMutableBuilder[Self <: ISourceCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccount_holder_name(value: String): Self = StObject.set(x, "account_holder_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccount_holder_nameUndefined: Self = StObject.set(x, "account_holder_name", js.undefined)
      
      @scala.inline
      def setAccount_holder_type(value: individual | company): Self = StObject.set(x, "account_holder_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccount_holder_typeUndefined: Self = StObject.set(x, "account_holder_type", js.undefined)
      
      @scala.inline
      def setAccount_number(value: String): Self = StObject.set(x, "account_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: bank_account): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouting_number(value: String): Self = StObject.set(x, "routing_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouting_numberUndefined: Self = StObject.set(x, "routing_number", js.undefined)
    }
  }
}
