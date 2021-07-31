package typings.stripejs

import typings.stripejs.anon.Clientsecret
import typings.stripejs.elementMod.ElementCreatorOptions
import typings.stripejs.elementMod.ElementFactory
import typings.stripejs.elementMod.StripeElement
import typings.stripejs.paymentMod.StripePaymentOptions
import typings.stripejs.paymentMod.StripePaymentRequest
import typings.stripejs.sourceMod.SourceData
import typings.stripejs.sourceMod.SourceResult
import typings.stripejs.stripejsStrings.bank_account
import typings.stripejs.stripejsStrings.pii
import typings.stripejs.tokenMod.BankTokenData
import typings.stripejs.tokenMod.IBANTokenData
import typings.stripejs.tokenMod.PiiTokenData
import typings.stripejs.tokenMod.TokenData
import typings.stripejs.tokenMod.TokenResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait StripeConfigOptions extends StObject {
    
    var stripeAccount: String
  }
  object StripeConfigOptions {
    
    @scala.inline
    def apply(stripeAccount: String): StripeConfigOptions = {
      val __obj = js.Dynamic.literal(stripeAccount = stripeAccount.asInstanceOf[js.Any])
      __obj.asInstanceOf[StripeConfigOptions]
    }
    
    @scala.inline
    implicit class StripeConfigOptionsMutableBuilder[Self <: StripeConfigOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStripeAccount(value: String): Self = StObject.set(x, "stripeAccount", value.asInstanceOf[js.Any])
    }
  }
  
  trait StripeError extends StObject {
    
    /**
      * For card errors, the ID of the failed charge
      */
    var charge: js.UndefOr[String] = js.undefined
    
    /**
      * For some errors that could be handled programmatically,
      * a short string indicating the error code reported
      */
    var code: js.UndefOr[String] = js.undefined
    
    /**
      * For card errors resulting from a card issuer decline,
      * a short string indicating the card issuer’s reason for the decline if they provide one
      */
    var decline_code: js.UndefOr[String] = js.undefined
    
    /**
      * A URL to more information about the error code reported
      */
    var doc_url: js.UndefOr[String] = js.undefined
    
    /**
      * A human-readable message providing more details about the error.
      * NOTE: For card errors, these messages can be shown to your users
      */
    var message: js.UndefOr[String] = js.undefined
    
    /**
      * If the error is parameter-specific, the parameter related to the error
      */
    var param: js.UndefOr[String] = js.undefined
    
    /**
      * The type of error that has occurred
      */
    var `type`: errorType
  }
  object StripeError {
    
    @scala.inline
    def apply(`type`: errorType): StripeError = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StripeError]
    }
    
    @scala.inline
    implicit class StripeErrorMutableBuilder[Self <: StripeError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharge(value: String): Self = StObject.set(x, "charge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChargeUndefined: Self = StObject.set(x, "charge", js.undefined)
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setDecline_code(value: String): Self = StObject.set(x, "decline_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecline_codeUndefined: Self = StObject.set(x, "decline_code", js.undefined)
      
      @scala.inline
      def setDoc_url(value: String): Self = StObject.set(x, "doc_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoc_urlUndefined: Self = StObject.set(x, "doc_url", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setParam(value: String): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
      
      @scala.inline
      def setType(value: errorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StripeJS extends StObject {
    
    /**
      * Initialization function for StripeJS
      * @see https://stripe.com/docs/stripe-js/reference#including-stripejs
      *
      * @param key - The public key of the user
      * @param [options] - Any options to configure StripeJS
      *
      * @return StripeJS instance
      */
    def apply(key: String): StripeJS = js.native
    def apply(key: String, options: StripeConfigOptions): StripeJS = js.native
    
    /**
      * The currently used key
      */
    var _apiKey: String = js.native
    
    /**
      * The mode in which the requests are currently done
      * @example 'test'
      */
    var _keyMode: String = js.native
    
    def createSource(data: SourceData): js.Promise[SourceResult] = js.native
    /**
      *  convert payment information collected by Elements into a Source object that you safely pass
      *  to your server to use in an API call
      *  @see https://stripe.com/docs/stripe-js/reference#stripe-create-source
      *
      * @param element - The element from which information should be extracted
      * @param data - An object containing the type of Source you want to create and any additional payment source information
      * NOTE: You cannot pass raw card information without an `Element`!
      *
      * @return an object containing the generated Source or an error
      */
    def createSource(element: StripeElement, data: SourceData): js.Promise[SourceResult] = js.native
    
    /**
      * to convert information collected by Elements into a single-use token that you safely pass to your server
      * to use in an API call
      * @see https://stripe.com/docs/stripe-js/reference#stripe-create-token
      *
      * @param element - The element from which the data should be extracted
      * @param [data] - an object containing additional payment information you might have collected
      *
      * @return an object containing the generated token or an error
      */
    def createToken(element: StripeElement): js.Promise[TokenResult] = js.native
    def createToken(element: StripeElement, data: IBANTokenData): js.Promise[TokenResult] = js.native
    def createToken(element: StripeElement, data: TokenData): js.Promise[TokenResult] = js.native
    @JSName("createToken")
    def createToken_bankaccount(`type`: bank_account, data: BankTokenData): js.Promise[TokenResult] = js.native
    @JSName("createToken")
    def createToken_pii(`type`: pii, data: PiiTokenData): js.Promise[TokenResult] = js.native
    
    /**
      * Create an instance of elements which can be used to manage a group of StripeJS elements
      * @see https://stripe.com/docs/stripe-js/reference#stripe-elements
      *
      * @param [options] - Configuration options for the elements object
      *
      * @return an instance of `Elements` to manage a group of elements
      */
    def elements(): ElementFactory = js.native
    def elements(options: ElementCreatorOptions): ElementFactory = js.native
    
    /**
      * Creates a new payment request based on the given options
      * @see https://stripe.com/docs/stripe-js/reference#stripe-payment-request
      *
      * @param options - Options that should be used to configure the payment request
      */
    def paymentRequest(options: StripePaymentOptions): StripePaymentRequest = js.native
    
    /**
      * Retrieve a Source using its unique ID and client secret
      * NOTE: The parameters are always available in any source object fetched with StripeJS
      *
      * @param id - Unique identifier of the source
      * @param client_secret - A secret available to the web client that created the Source
      *
      * @return an object containing the generated Source or an error
      */
    def retrieveSource(hasIdClient_secret: Clientsecret): js.Promise[SourceResult] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stripejs.stripejsStrings.api_connection_error
    - typings.stripejs.stripejsStrings.api_error
    - typings.stripejs.stripejsStrings.authentication_error
    - typings.stripejs.stripejsStrings.card_error
    - typings.stripejs.stripejsStrings.idempotency_error
    - typings.stripejs.stripejsStrings.invalid_request_error
    - typings.stripejs.stripejsStrings.rate_limit_error
  */
  trait errorType extends StObject
  object errorType {
    
    @scala.inline
    def api_connection_error: typings.stripejs.stripejsStrings.api_connection_error = "api_connection_error".asInstanceOf[typings.stripejs.stripejsStrings.api_connection_error]
    
    @scala.inline
    def api_error: typings.stripejs.stripejsStrings.api_error = "api_error".asInstanceOf[typings.stripejs.stripejsStrings.api_error]
    
    @scala.inline
    def authentication_error: typings.stripejs.stripejsStrings.authentication_error = "authentication_error".asInstanceOf[typings.stripejs.stripejsStrings.authentication_error]
    
    @scala.inline
    def card_error: typings.stripejs.stripejsStrings.card_error = "card_error".asInstanceOf[typings.stripejs.stripejsStrings.card_error]
    
    @scala.inline
    def idempotency_error: typings.stripejs.stripejsStrings.idempotency_error = "idempotency_error".asInstanceOf[typings.stripejs.stripejsStrings.idempotency_error]
    
    @scala.inline
    def invalid_request_error: typings.stripejs.stripejsStrings.invalid_request_error = "invalid_request_error".asInstanceOf[typings.stripejs.stripejsStrings.invalid_request_error]
    
    @scala.inline
    def rate_limit_error: typings.stripejs.stripejsStrings.rate_limit_error = "rate_limit_error".asInstanceOf[typings.stripejs.stripejsStrings.rate_limit_error]
  }
}
