package typings.stripejs

import typings.stripejs.customerMod.BankAccount
import typings.stripejs.customerMod.Card
import typings.stripejs.mod.StripeError
import typings.stripejs.stripejsStrings.account
import typings.stripejs.stripejsStrings.bank_account
import typings.stripejs.stripejsStrings.card
import typings.stripejs.stripejsStrings.company
import typings.stripejs.stripejsStrings.individual
import typings.stripejs.stripejsStrings.pii
import typings.stripejs.stripejsStrings.token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenMod {
  
  @js.native
  trait BankTokenData extends IBANTokenData {
    
    /**
      * The bank account number
      */
    var account_number: String = js.native
    
    /**
      * The 2-digit country ISO code
      * @example 'US'
      */
    var country: String = js.native
    
    /**
      * The routing transit number for the bank account
      * NOTE: This is optional if the {@link BankTokenData.currency} is 'eur'
      */
    var routing_number: js.UndefOr[String] = js.native
  }
  object BankTokenData {
    
    @scala.inline
    def apply(
      account_holder_name: String,
      account_holder_type: individual | company,
      account_number: String,
      country: String,
      currency: String
    ): BankTokenData = {
      val __obj = js.Dynamic.literal(account_holder_name = account_holder_name.asInstanceOf[js.Any], account_holder_type = account_holder_type.asInstanceOf[js.Any], account_number = account_number.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
      __obj.asInstanceOf[BankTokenData]
    }
    
    @scala.inline
    implicit class BankTokenDataMutableBuilder[Self <: BankTokenData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccount_number(value: String): Self = StObject.set(x, "account_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouting_number(value: String): Self = StObject.set(x, "routing_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouting_numberUndefined: Self = StObject.set(x, "routing_number", js.undefined)
    }
  }
  
  @js.native
  trait IBANTokenData extends StObject {
    
    /**
      * The name of the person or business that owns the bank account.
      */
    var account_holder_name: String = js.native
    
    /**
      * The type of entity that holds the account.
      */
    var account_holder_type: individual | company = js.native
    
    /**
      * Three-letter ISO code for the currency paid out to the bank account
      * @example 'usd'
      */
    var currency: String = js.native
  }
  object IBANTokenData {
    
    @scala.inline
    def apply(account_holder_name: String, account_holder_type: individual | company, currency: String): IBANTokenData = {
      val __obj = js.Dynamic.literal(account_holder_name = account_holder_name.asInstanceOf[js.Any], account_holder_type = account_holder_type.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBANTokenData]
    }
    
    @scala.inline
    implicit class IBANTokenDataMutableBuilder[Self <: IBANTokenData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccount_holder_name(value: String): Self = StObject.set(x, "account_holder_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccount_holder_type(value: individual | company): Self = StObject.set(x, "account_holder_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PiiTokenData extends StObject {
    
    /**
      * The personal ID number
      */
    var personal_id_number: String = js.native
  }
  object PiiTokenData {
    
    @scala.inline
    def apply(personal_id_number: String): PiiTokenData = {
      val __obj = js.Dynamic.literal(personal_id_number = personal_id_number.asInstanceOf[js.Any])
      __obj.asInstanceOf[PiiTokenData]
    }
    
    @scala.inline
    implicit class PiiTokenDataMutableBuilder[Self <: PiiTokenData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPersonal_id_number(value: String): Self = StObject.set(x, "personal_id_number", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Token extends StObject {
    
    /**
      * Hash describing the bank account
      */
    var bank_account: js.UndefOr[BankAccount] = js.native
    
    /**
      * Hash describing the card used to make the charge
      */
    var card: js.UndefOr[Card] = js.native
    
    /**
      * IP address of the client that generated the token
      */
    var client_ip: String = js.native
    
    /**
      * Time at which the object was created. Measured in seconds since the Unix epoch
      */
    var created: String = js.native
    
    /**
      * The unique identifier for the token
      */
    var id: String = js.native
    
    /**
      * LIVE MODE = `true`
      * TEST MODE = `false`
      */
    var livemode: Boolean = js.native
    
    var `object`: token = js.native
    
    /**
      * Type of the token
      */
    var `type`: account | bank_account | card | pii = js.native
    
    /**
      * Whether this token has already been used (tokens can be used only once)
      */
    var used: Boolean = js.native
  }
  object Token {
    
    @scala.inline
    def apply(
      client_ip: String,
      created: String,
      id: String,
      livemode: Boolean,
      `object`: token,
      `type`: account | bank_account | card | pii,
      used: Boolean
    ): Token = {
      val __obj = js.Dynamic.literal(client_ip = client_ip.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    @scala.inline
    implicit class TokenMutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBank_account(value: BankAccount): Self = StObject.set(x, "bank_account", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBank_accountUndefined: Self = StObject.set(x, "bank_account", js.undefined)
      
      @scala.inline
      def setCard(value: Card): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
      
      @scala.inline
      def setClient_ip(value: String): Self = StObject.set(x, "client_ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: token): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: account | bank_account | card | pii): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsed(value: Boolean): Self = StObject.set(x, "used", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TokenData extends StObject {
    
    var address_city: String = js.native
    
    /**
      * A two character country code identifying the country
      * @example 'US'
      */
    var address_country: js.UndefOr[String] = js.native
    
    /**
      * Fields for billing address information.
      */
    var address_line1: String = js.native
    
    var address_line2: js.UndefOr[String] = js.native
    
    var address_state: String = js.native
    
    var address_zip: String = js.native
    
    /**
      * The amount paid, not a decimal. In USD this is in cents.
      */
    var amount: js.UndefOr[Double] = js.native
    
    /**
      * Used to add a card to an account
      * NOTE: Currently, the only supported currency for debit card payouts is 'usd'
      */
    var currency: js.UndefOr[String] = js.native
    
    /**
      * The Cardholder name
      */
    var name: String = js.native
  }
  object TokenData {
    
    @scala.inline
    def apply(
      address_city: String,
      address_line1: String,
      address_state: String,
      address_zip: String,
      name: String
    ): TokenData = {
      val __obj = js.Dynamic.literal(address_city = address_city.asInstanceOf[js.Any], address_line1 = address_line1.asInstanceOf[js.Any], address_state = address_state.asInstanceOf[js.Any], address_zip = address_zip.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenData]
    }
    
    @scala.inline
    implicit class TokenDataMutableBuilder[Self <: TokenData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress_city(value: String): Self = StObject.set(x, "address_city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress_country(value: String): Self = StObject.set(x, "address_country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress_countryUndefined: Self = StObject.set(x, "address_country", js.undefined)
      
      @scala.inline
      def setAddress_line1(value: String): Self = StObject.set(x, "address_line1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress_line2(value: String): Self = StObject.set(x, "address_line2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress_line2Undefined: Self = StObject.set(x, "address_line2", js.undefined)
      
      @scala.inline
      def setAddress_state(value: String): Self = StObject.set(x, "address_state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress_zip(value: String): Self = StObject.set(x, "address_zip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TokenResult extends StObject {
    
    /**
      * There was an error. This includes client-side validation errors.
      */
    var error: js.UndefOr[StripeError] = js.native
    
    /**
      * The generated string that can be used for communication with the backend
      */
    var token: js.UndefOr[Token] = js.native
  }
  object TokenResult {
    
    @scala.inline
    def apply(): TokenResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokenResult]
    }
    
    @scala.inline
    implicit class TokenResultMutableBuilder[Self <: TokenResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: StripeError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setToken(value: Token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
}
