package typings.twilio

import typings.twilio.anon.Key
import typings.twilio.interfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paymentMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/call/payment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/call/payment", "PaymentContext")
  @js.native
  open class PaymentContext protected () extends StObject {
    /**
      * Initialize the PaymentContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param accountSid - The SID of the Account that will update the resource
      * @param callSid - The SID of the call that will create the resource.
      * @param sid - The SID of Payments session
      */
    def this(version: typings.twilio.v2010Mod.^, accountSid: String, callSid: String, sid: String) = this()
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a PaymentInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: PaymentInstanceUpdateOptions): js.Promise[PaymentInstance] = js.native
    def update(
      opts: PaymentInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ PaymentInstance, Any]
    ): js.Promise[PaymentInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/api/v2010/account/call/payment", "PaymentInstance")
  @js.native
  open class PaymentInstance protected () extends SerializableClass {
    /**
      * Initialize the PaymentContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - The SID of the Account that created the Payments resource.
      * @param callSid - The SID of the Call the resource is associated with.
      * @param sid - The SID of Payments session
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      payload: PaymentPayload,
      accountSid: String,
      callSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: PaymentContext = js.native
    
    var accountSid: String = js.native
    
    var callSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var sid: String = js.native
    
    /**
      * update a PaymentInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: PaymentInstanceUpdateOptions): js.Promise[PaymentInstance] = js.native
    def update(
      opts: PaymentInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[PaymentInstance] = js.native
    
    var uri: String = js.native
  }
  
  /**
    * Initialize the PaymentList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    * @param accountSid - The SID of the Account that created the Payments resource.
    * @param callSid - The SID of the Call the resource is associated with.
    */
  inline def PaymentList(version: typings.twilio.v2010Mod.^, accountSid: String, callSid: String): PaymentListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("PaymentList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any], callSid.asInstanceOf[js.Any])).asInstanceOf[PaymentListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/call/payment", "PaymentPage")
  @js.native
  open class PaymentPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.v2010Mod.^, PaymentPayload, PaymentResource, PaymentInstance] {
    /**
      * Initialize the PaymentPage
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: PaymentSolution
    ) = this()
    
    /**
      * Build an instance of PaymentInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: PaymentPayload): PaymentInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.`consumer-checking`
    - typings.twilio.twilioStrings.`consumer-savings`
    - typings.twilio.twilioStrings.`commercial-checking`
  */
  trait PaymentBankAccountType extends StObject
  object PaymentBankAccountType {
    
    inline def `commercial-checking`: typings.twilio.twilioStrings.`commercial-checking` = "commercial-checking".asInstanceOf[typings.twilio.twilioStrings.`commercial-checking`]
    
    inline def `consumer-checking`: typings.twilio.twilioStrings.`consumer-checking` = "consumer-checking".asInstanceOf[typings.twilio.twilioStrings.`consumer-checking`]
    
    inline def `consumer-savings`: typings.twilio.twilioStrings.`consumer-savings` = "consumer-savings".asInstanceOf[typings.twilio.twilioStrings.`consumer-savings`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.`payment-card-number`
    - typings.twilio.twilioStrings.`expiration-date`
    - typings.twilio.twilioStrings.`security-code`
    - typings.twilio.twilioStrings.`postal-code`
    - typings.twilio.twilioStrings.`bank-routing-number`
    - typings.twilio.twilioStrings.`bank-account-number`
  */
  trait PaymentCapture extends StObject
  object PaymentCapture {
    
    inline def `bank-account-number`: typings.twilio.twilioStrings.`bank-account-number` = "bank-account-number".asInstanceOf[typings.twilio.twilioStrings.`bank-account-number`]
    
    inline def `bank-routing-number`: typings.twilio.twilioStrings.`bank-routing-number` = "bank-routing-number".asInstanceOf[typings.twilio.twilioStrings.`bank-routing-number`]
    
    inline def `expiration-date`: typings.twilio.twilioStrings.`expiration-date` = "expiration-date".asInstanceOf[typings.twilio.twilioStrings.`expiration-date`]
    
    inline def `payment-card-number`: typings.twilio.twilioStrings.`payment-card-number` = "payment-card-number".asInstanceOf[typings.twilio.twilioStrings.`payment-card-number`]
    
    inline def `postal-code`: typings.twilio.twilioStrings.`postal-code` = "postal-code".asInstanceOf[typings.twilio.twilioStrings.`postal-code`]
    
    inline def `security-code`: typings.twilio.twilioStrings.`security-code` = "security-code".asInstanceOf[typings.twilio.twilioStrings.`security-code`]
  }
  
  /**
    * Options to pass to update
    *
    * @property capture - The piece of payment information that you wish the caller to enter.
    * @property idempotencyKey - A unique token that will be used to ensure that multiple API calls with the same information do not result in multiple transactions.
    * @property status - Indicates whether the current payment session should be cancelled or completed.
    * @property statusCallback - Provide an absolute or relative URL to receive status updates regarding your Pay session.
    */
  trait PaymentInstanceUpdateOptions extends StObject {
    
    var capture: js.UndefOr[PaymentCapture] = js.undefined
    
    var idempotencyKey: String
    
    var status: js.UndefOr[PaymentStatus] = js.undefined
    
    var statusCallback: String
  }
  object PaymentInstanceUpdateOptions {
    
    inline def apply(idempotencyKey: String, statusCallback: String): PaymentInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal(idempotencyKey = idempotencyKey.asInstanceOf[js.Any], statusCallback = statusCallback.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaymentInstanceUpdateOptions]
    }
    
    extension [Self <: PaymentInstanceUpdateOptions](x: Self) {
      
      inline def setCapture(value: PaymentCapture): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setIdempotencyKey(value: String): Self = StObject.set(x, "idempotencyKey", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: PaymentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusCallback(value: String): Self = StObject.set(x, "statusCallback", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  @js.native
  trait PaymentListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): PaymentContext = js.native
    
    /**
      * create a PaymentInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: PaymentListInstanceCreateOptions): js.Promise[PaymentInstance] = js.native
    def create(
      opts: PaymentListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ PaymentInstance, Any]
    ): js.Promise[PaymentInstance] = js.native
    
    /**
      * Constructs a payment
      *
      * @param sid - The SID of Payments session
      */
    def get(sid: String): PaymentContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property bankAccountType - Type of bank account if payment source is ACH.
    * @property chargeAmount - A positive decimal value less than 1,000,000 to charge against the credit card or bank account.
    * @property currency - The currency of the `charge_amount`.
    * @property description - The description can be used to provide more details regarding the transaction.
    * @property idempotencyKey - A unique token that will be used to ensure that multiple API calls with the same information do not result in multiple transactions.
    * @property input - A list of inputs that should be accepted. Currently only `dtmf` is supported.
    * @property minPostalCodeLength - A positive integer that is used to validate the length of the `PostalCode` inputted by the user.
    * @property parameter - A single-level JSON object used to pass custom parameters to payment processors. (Required for ACH payments)
    * @property paymentConnector - This is the unique name corresponding to the Pay Connector installed in the Twilio Add-ons.
    * @property paymentMethod - Type of payment being captured.
    * @property postalCode - Indicates whether the credit card PostalCode (zip code) is a required piece of payment information that must be provided by the caller.
    * @property securityCode - Indicates whether the credit card security code is a required piece of payment information that must be provided by the caller.
    * @property statusCallback - Provide an absolute or relative URL to receive status updates regarding your Pay session..
    * @property timeout - The number of seconds that <Pay> should wait for the caller to press a digit between each subsequent digit, after the first one, before moving on to validate the digits captured.
    * @property tokenType - Indicates whether the payment method should be tokenized as a `one-time` or `reusable` token.
    * @property validCardTypes - Credit card types separated by space that Pay should accept.
    */
  trait PaymentListInstanceCreateOptions extends StObject {
    
    var bankAccountType: js.UndefOr[PaymentBankAccountType] = js.undefined
    
    var chargeAmount: js.UndefOr[Double] = js.undefined
    
    var currency: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var idempotencyKey: String
    
    var input: js.UndefOr[String] = js.undefined
    
    var minPostalCodeLength: js.UndefOr[Double] = js.undefined
    
    var parameter: js.UndefOr[js.Object] = js.undefined
    
    var paymentConnector: js.UndefOr[String] = js.undefined
    
    var paymentMethod: js.UndefOr[PaymentPaymentMethod] = js.undefined
    
    var postalCode: js.UndefOr[Boolean] = js.undefined
    
    var securityCode: js.UndefOr[Boolean] = js.undefined
    
    var statusCallback: String
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var tokenType: js.UndefOr[PaymentTokenType] = js.undefined
    
    var validCardTypes: js.UndefOr[String] = js.undefined
  }
  object PaymentListInstanceCreateOptions {
    
    inline def apply(idempotencyKey: String, statusCallback: String): PaymentListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(idempotencyKey = idempotencyKey.asInstanceOf[js.Any], statusCallback = statusCallback.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaymentListInstanceCreateOptions]
    }
    
    extension [Self <: PaymentListInstanceCreateOptions](x: Self) {
      
      inline def setBankAccountType(value: PaymentBankAccountType): Self = StObject.set(x, "bankAccountType", value.asInstanceOf[js.Any])
      
      inline def setBankAccountTypeUndefined: Self = StObject.set(x, "bankAccountType", js.undefined)
      
      inline def setChargeAmount(value: Double): Self = StObject.set(x, "chargeAmount", value.asInstanceOf[js.Any])
      
      inline def setChargeAmountUndefined: Self = StObject.set(x, "chargeAmount", js.undefined)
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setIdempotencyKey(value: String): Self = StObject.set(x, "idempotencyKey", value.asInstanceOf[js.Any])
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setMinPostalCodeLength(value: Double): Self = StObject.set(x, "minPostalCodeLength", value.asInstanceOf[js.Any])
      
      inline def setMinPostalCodeLengthUndefined: Self = StObject.set(x, "minPostalCodeLength", js.undefined)
      
      inline def setParameter(value: js.Object): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
      
      inline def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
      
      inline def setPaymentConnector(value: String): Self = StObject.set(x, "paymentConnector", value.asInstanceOf[js.Any])
      
      inline def setPaymentConnectorUndefined: Self = StObject.set(x, "paymentConnector", js.undefined)
      
      inline def setPaymentMethod(value: PaymentPaymentMethod): Self = StObject.set(x, "paymentMethod", value.asInstanceOf[js.Any])
      
      inline def setPaymentMethodUndefined: Self = StObject.set(x, "paymentMethod", js.undefined)
      
      inline def setPostalCode(value: Boolean): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
      
      inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
      
      inline def setSecurityCode(value: Boolean): Self = StObject.set(x, "securityCode", value.asInstanceOf[js.Any])
      
      inline def setSecurityCodeUndefined: Self = StObject.set(x, "securityCode", js.undefined)
      
      inline def setStatusCallback(value: String): Self = StObject.set(x, "statusCallback", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTokenType(value: PaymentTokenType): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
      
      inline def setTokenTypeUndefined: Self = StObject.set(x, "tokenType", js.undefined)
      
      inline def setValidCardTypes(value: String): Self = StObject.set(x, "validCardTypes", value.asInstanceOf[js.Any])
      
      inline def setValidCardTypesUndefined: Self = StObject.set(x, "validCardTypes", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.twilio.pageMod.TwilioResponsePayload because var conflicts: uri. Inlined first_page_uri, next_page_uri, page, page_size, previous_page_uri, meta */ trait PaymentPayload
    extends StObject
       with PaymentResource {
    
    // DEPRECTATED: end: any;
    var first_page_uri: String
    
    var meta: js.UndefOr[Key] = js.undefined
    
    // DEPRECTATED: last_page_uri: string;
    var next_page_uri: String
    
    // DEPRECTATED: num_pages: number;
    var page: Double
    
    var page_size: Double
    
    var previous_page_uri: String
  }
  object PaymentPayload {
    
    inline def apply(
      account_sid: String,
      call_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      uri: String
    ): PaymentPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], call_sid = call_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaymentPayload]
    }
    
    extension [Self <: PaymentPayload](x: Self) {
      
      inline def setFirst_page_uri(value: String): Self = StObject.set(x, "first_page_uri", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Key): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setNext_page_uri(value: String): Self = StObject.set(x, "next_page_uri", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      inline def setPrevious_page_uri(value: String): Self = StObject.set(x, "previous_page_uri", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.`credit-card`
    - typings.twilio.twilioStrings.`ach-debit`
  */
  trait PaymentPaymentMethod extends StObject
  object PaymentPaymentMethod {
    
    inline def `ach-debit`: typings.twilio.twilioStrings.`ach-debit` = "ach-debit".asInstanceOf[typings.twilio.twilioStrings.`ach-debit`]
    
    inline def `credit-card`: typings.twilio.twilioStrings.`credit-card` = "credit-card".asInstanceOf[typings.twilio.twilioStrings.`credit-card`]
  }
  
  trait PaymentResource extends StObject {
    
    var account_sid: String
    
    var call_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var sid: String
    
    var uri: String
  }
  object PaymentResource {
    
    inline def apply(
      account_sid: String,
      call_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      sid: String,
      uri: String
    ): PaymentResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], call_sid = call_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaymentResource]
    }
    
    extension [Self <: PaymentResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCall_sid(value: String): Self = StObject.set(x, "call_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait PaymentSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
    
    var callSid: js.UndefOr[String] = js.undefined
  }
  object PaymentSolution {
    
    inline def apply(): PaymentSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaymentSolution]
    }
    
    extension [Self <: PaymentSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
      
      inline def setCallSid(value: String): Self = StObject.set(x, "callSid", value.asInstanceOf[js.Any])
      
      inline def setCallSidUndefined: Self = StObject.set(x, "callSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.complete
    - typings.twilio.twilioStrings.cancel
  */
  trait PaymentStatus extends StObject
  object PaymentStatus {
    
    inline def cancel: typings.twilio.twilioStrings.cancel = "cancel".asInstanceOf[typings.twilio.twilioStrings.cancel]
    
    inline def complete: typings.twilio.twilioStrings.complete = "complete".asInstanceOf[typings.twilio.twilioStrings.complete]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.`one-time`
    - typings.twilio.twilioStrings.reusable
  */
  trait PaymentTokenType extends StObject
  object PaymentTokenType {
    
    inline def `one-time`: typings.twilio.twilioStrings.`one-time` = "one-time".asInstanceOf[typings.twilio.twilioStrings.`one-time`]
    
    inline def reusable: typings.twilio.twilioStrings.reusable = "reusable".asInstanceOf[typings.twilio.twilioStrings.reusable]
  }
}
