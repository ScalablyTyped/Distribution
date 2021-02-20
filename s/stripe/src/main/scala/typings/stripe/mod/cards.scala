package typings.stripe.mod

import typings.stripe.mod.accounts.IAccount
import typings.stripe.mod.accounts.IExternalAccount
import typings.stripe.mod.customers.ICustomer
import typings.stripe.mod.recipients.IRecipient
import typings.stripe.stripeStrings.Discover
import typings.stripe.stripeStrings.JCB
import typings.stripe.stripeStrings.MasterCard
import typings.stripe.stripeStrings.Unknown
import typings.stripe.stripeStrings.Visa
import typings.stripe.stripeStrings.`American Express`
import typings.stripe.stripeStrings.`Diners Club`
import typings.stripe.stripeStrings.card
import typings.stripe.stripeStrings.credit
import typings.stripe.stripeStrings.debit
import typings.stripe.stripeStrings.fail
import typings.stripe.stripeStrings.pass
import typings.stripe.stripeStrings.prepaid
import typings.stripe.stripeStrings.unavailable
import typings.stripe.stripeStrings.unchecked
import typings.stripe.stripeStrings.unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cards {
  
  /**
    * You can store multiple cards on a customer in order to charge the customer later. You
    * can also store multiple debit cards on a recipient in order to transfer to those cards later.
    */
  @js.native
  trait ICard
    extends ICardHash
       with IExternalAccount
       with IStripeSource {
    
    /**
      * The account this card belongs to. This attribute will not be in the
      * card object if the card belongs to a customer or recipient instead.
      * [Expandable]
      */
    var account: js.UndefOr[String | IAccount] = js.native
    
    /**
      * Only applicable on accounts (not customers or recipients). The
      * card can be used as a transfer destination for funds in this
      * currency.
      */
    var currency: js.UndefOr[String] = js.native
    
    /**
      * The customer that this card belongs to. This attribute will not be
      * in the card object if the card belongs to an account or recipient
      * instead.
      */
    var customer: js.UndefOr[String | ICustomer | Null] = js.native
    
    /**
      * Only applicable on accounts (not customers or recipients). This
      * indicates whether or not this card is the default external account
      * for its currency.
      */
    var default_for_currency: js.UndefOr[Boolean] = js.native
    
    /**
      * The recipient that this card belongs to. This attribute will not be
      * in the card object if the card belongs to a customer or account
      * instead. [Expandable]
      */
    var recipient: js.UndefOr[String | IRecipient] = js.native
  }
  object ICard {
    
    @scala.inline
    def apply(
      brand: Visa | (`American Express`) | MasterCard | Discover | JCB | (`Diners Club`) | Unknown,
      country: String,
      cvc_check: pass | fail | unavailable | unchecked,
      exp_month: Double,
      exp_year: Double,
      fingerprint: String,
      funding: credit | debit | prepaid | unknown_,
      id: String,
      last4: String,
      `object`: card
    ): typings.stripe.mod.cards.ICard = {
      val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], cvc_check = cvc_check.asInstanceOf[js.Any], exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], funding = funding.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.stripe.mod.cards.ICard]
    }
    
    @scala.inline
    implicit class ICardMutableBuilder[Self <: typings.stripe.mod.cards.ICard] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccount(value: String | IAccount): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      @scala.inline
      def setCustomer(value: String | ICustomer): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerNull: Self = StObject.set(x, "customer", null)
      
      @scala.inline
      def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
      
      @scala.inline
      def setDefault_for_currency(value: Boolean): Self = StObject.set(x, "default_for_currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefault_for_currencyUndefined: Self = StObject.set(x, "default_for_currency", js.undefined)
      
      @scala.inline
      def setRecipient(value: String | IRecipient): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipientUndefined: Self = StObject.set(x, "recipient", js.undefined)
    }
  }
  
  /**
    * Hash describing the card used to make the charge
    */
  @js.native
  trait ICardHash
    extends IResourceObject
       with ICardHashInfo {
    
    /**
      * Value is 'card'
      */
    @JSName("object")
    var object_ICardHash: card = js.native
  }
  object ICardHash {
    
    @scala.inline
    def apply(
      brand: Visa | (`American Express`) | MasterCard | Discover | JCB | (`Diners Club`) | Unknown,
      country: String,
      cvc_check: pass | fail | unavailable | unchecked,
      exp_month: Double,
      exp_year: Double,
      fingerprint: String,
      funding: credit | debit | prepaid | unknown_,
      id: String,
      last4: String,
      `object`: card
    ): ICardHash = {
      val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], cvc_check = cvc_check.asInstanceOf[js.Any], exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], funding = funding.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICardHash]
    }
    
    @scala.inline
    implicit class ICardHashMutableBuilder[Self <: ICardHash] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setObject(value: card): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ICardSourceCreationOptions extends StObject {
    
    var address_city: js.UndefOr[String] = js.native
    
    var address_country: js.UndefOr[String] = js.native
    
    var address_line1: js.UndefOr[String] = js.native
    
    var address_line2: js.UndefOr[String] = js.native
    
    var address_state: js.UndefOr[String] = js.native
    
    var address_zip: js.UndefOr[String] = js.native
    
    /**
      * Card security code. Required unless your account is registered in
      * Australia, Canada, or the United States. Highly recommended to always
      * include this value.
      */
    var cvc: js.UndefOr[String] = js.native
    
    /**
      * Two digit number representing the card's expiration month.
      */
    var exp_month: Double = js.native
    
    /**
      * Two or four digit number representing the card's expiration year.
      */
    var exp_year: Double = js.native
    
    var metadata: js.UndefOr[IOptionsMetadata] = js.native
    
    /**
      * Cardholder's full name.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * The card number, as a string without any separators.
      */
    var number: String = js.native
    
    /**
      * The type of payment source. Should be "card".
      */
    var `object`: card = js.native
  }
  object ICardSourceCreationOptions {
    
    @scala.inline
    def apply(exp_month: Double, exp_year: Double, number: String, `object`: card): ICardSourceCreationOptions = {
      val __obj = js.Dynamic.literal(exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICardSourceCreationOptions]
    }
    
    @scala.inline
    implicit class ICardSourceCreationOptionsMutableBuilder[Self <: ICardSourceCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress_city(value: String): Self = StObject.set(x, "address_city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress_cityUndefined: Self = StObject.set(x, "address_city", js.undefined)
      
      @scala.inline
      def setAddress_country(value: String): Self = StObject.set(x, "address_country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress_countryUndefined: Self = StObject.set(x, "address_country", js.undefined)
      
      @scala.inline
      def setAddress_line1(value: String): Self = StObject.set(x, "address_line1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress_line1Undefined: Self = StObject.set(x, "address_line1", js.undefined)
      
      @scala.inline
      def setAddress_line2(value: String): Self = StObject.set(x, "address_line2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress_line2Undefined: Self = StObject.set(x, "address_line2", js.undefined)
      
      @scala.inline
      def setAddress_state(value: String): Self = StObject.set(x, "address_state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress_stateUndefined: Self = StObject.set(x, "address_state", js.undefined)
      
      @scala.inline
      def setAddress_zip(value: String): Self = StObject.set(x, "address_zip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress_zipUndefined: Self = StObject.set(x, "address_zip", js.undefined)
      
      @scala.inline
      def setCvc(value: String): Self = StObject.set(x, "cvc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCvcUndefined: Self = StObject.set(x, "cvc", js.undefined)
      
      @scala.inline
      def setExp_month(value: Double): Self = StObject.set(x, "exp_month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExp_year(value: Double): Self = StObject.set(x, "exp_year", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: IOptionsMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: card): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ICardSourceCreationOptionsExtended extends ICardSourceCreationOptions {
    
    /**
      * Required when adding a card to an account (not applicable to a
      * customers or recipients). The card (which must be a debit card) can be
      * used as a transfer destination for funds in this currency. Currently, the
      * only supported currency for debit card transfers is usd.
      *
      * Managed accounts only.
      */
    var currency: js.UndefOr[String] = js.native
    
    /**
      * Only applicable on accounts (not customers or recipients). If you set
      * this to true (or if this is the first external account being added in this
      * currency) this card will become the default external account for its
      * currency.
      *
      * Managed accounts only.
      */
    var default_for_currency: js.UndefOr[Boolean] = js.native
  }
  object ICardSourceCreationOptionsExtended {
    
    @scala.inline
    def apply(exp_month: Double, exp_year: Double, number: String, `object`: card): ICardSourceCreationOptionsExtended = {
      val __obj = js.Dynamic.literal(exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICardSourceCreationOptionsExtended]
    }
    
    @scala.inline
    implicit class ICardSourceCreationOptionsExtendedMutableBuilder[Self <: ICardSourceCreationOptionsExtended] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      @scala.inline
      def setDefault_for_currency(value: Boolean): Self = StObject.set(x, "default_for_currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefault_for_currencyUndefined: Self = StObject.set(x, "default_for_currency", js.undefined)
    }
  }
  
  @js.native
  trait ICardUpdateOptions extends IDataOptionsWithMetadata {
    
    var address_city: js.UndefOr[String] = js.native
    
    var address_country: js.UndefOr[String] = js.native
    
    var address_line1: js.UndefOr[String] = js.native
    
    var address_line2: js.UndefOr[String] = js.native
    
    var address_state: js.UndefOr[String] = js.native
    
    var address_zip: js.UndefOr[String] = js.native
    
    /**
      * Only applicable on accounts (not customers or recipients).
      * If set to true, this card will become the default external
      * account for its currency.
      *
      * Managed accounts only
      */
    var default_for_currency: js.UndefOr[Boolean] = js.native
    
    var exp_month: js.UndefOr[Double] = js.native
    
    var exp_year: js.UndefOr[Double] = js.native
    
    /**
      * Cardholder name
      */
    var name: js.UndefOr[String] = js.native
  }
  object ICardUpdateOptions {
    
    @scala.inline
    def apply(): ICardUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICardUpdateOptions]
    }
    
    @scala.inline
    implicit class ICardUpdateOptionsMutableBuilder[Self <: ICardUpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress_city(value: String): Self = StObject.set(x, "address_city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress_cityUndefined: Self = StObject.set(x, "address_city", js.undefined)
      
      @scala.inline
      def setAddress_country(value: String): Self = StObject.set(x, "address_country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress_countryUndefined: Self = StObject.set(x, "address_country", js.undefined)
      
      @scala.inline
      def setAddress_line1(value: String): Self = StObject.set(x, "address_line1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress_line1Undefined: Self = StObject.set(x, "address_line1", js.undefined)
      
      @scala.inline
      def setAddress_line2(value: String): Self = StObject.set(x, "address_line2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress_line2Undefined: Self = StObject.set(x, "address_line2", js.undefined)
      
      @scala.inline
      def setAddress_state(value: String): Self = StObject.set(x, "address_state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress_stateUndefined: Self = StObject.set(x, "address_state", js.undefined)
      
      @scala.inline
      def setAddress_zip(value: String): Self = StObject.set(x, "address_zip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress_zipUndefined: Self = StObject.set(x, "address_zip", js.undefined)
      
      @scala.inline
      def setDefault_for_currency(value: Boolean): Self = StObject.set(x, "default_for_currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefault_for_currencyUndefined: Self = StObject.set(x, "default_for_currency", js.undefined)
      
      @scala.inline
      def setExp_month(value: Double): Self = StObject.set(x, "exp_month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExp_monthUndefined: Self = StObject.set(x, "exp_month", js.undefined)
      
      @scala.inline
      def setExp_year(value: Double): Self = StObject.set(x, "exp_year", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExp_yearUndefined: Self = StObject.set(x, "exp_year", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
