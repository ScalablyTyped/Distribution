package typings.twilio

import typings.twilio.anon.Capabilities
import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libInterfacesMod.PhoneNumberCapabilities
import typings.twilio.libRestPreviewHostedNumbersMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewHostedNumbersHostedNumberOrderMod {
  
  @JSImport("twilio/lib/rest/preview/hosted_numbers/hostedNumberOrder", "HostedNumberOrderContextImpl")
  @js.native
  open class HostedNumberOrderContextImpl protected ()
    extends StObject
       with HostedNumberOrderContext {
    def this(_version: default, sid: String) = this()
    
    /* protected */ var _solution: HostedNumberOrderContextSolution = js.native
    
    /* protected */ var _uri: String = js.native
    
    /* protected */ var _version: default = js.native
    
    def update(
      params: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[HostedNumberOrderInstance], Any],
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[HostedNumberOrderInstance], Any]
    ): js.Promise[HostedNumberOrderInstance] = js.native
    def update(
      params: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[HostedNumberOrderInstance], Any]
    ): js.Promise[HostedNumberOrderInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/hosted_numbers/hostedNumberOrder", "HostedNumberOrderInstance")
  @js.native
  open class HostedNumberOrderInstance protected () extends StObject {
    def this(_version: default, payload: HostedNumberOrderResource) = this()
    def this(_version: default, payload: HostedNumberOrderResource, sid: String) = this()
    
    /* protected */ var _context: js.UndefOr[HostedNumberOrderContext] = js.native
    
    /* private */ def _proxy: Any = js.native
    
    /* protected */ var _solution: HostedNumberOrderContextSolution = js.native
    
    /* protected */ var _version: default = js.native
    
    /**
      * A 34 character string that uniquely identifies the account.
      */
    var accountSid: String = js.native
    
    /**
      * A 34 character string that uniquely identifies the Address resource that represents the address of the owner of this phone number.
      */
    var addressSid: String = js.native
    
    /**
      * A value between 0-30 specifying the number of seconds to delay initiating the ownership verification call.
      */
    var callDelay: Double = js.native
    
    var capabilities: PhoneNumberCapabilities = js.native
    
    /**
      * A list of emails that LOA document for this HostedNumberOrder will be carbon copied to.
      */
    var ccEmails: js.Array[String] = js.native
    
    /**
      * The date this resource was created, given as [GMT RFC 2822](http://www.ietf.org/rfc/rfc2822.txt) format.
      */
    var dateCreated: js.Date = js.native
    
    /**
      * The date that this resource was updated, given as [GMT RFC 2822](http://www.ietf.org/rfc/rfc2822.txt) format.
      */
    var dateUpdated: js.Date = js.native
    
    /**
      * Email of the owner of this phone number that is being hosted.
      */
    var email: String = js.native
    
    /**
      * A numerical extension to be used when making the ownership verification call.
      */
    var `extension`: String = js.native
    
    /**
      * A message that explains why a hosted_number_order went to status \"action-required\"
      */
    var failureReason: String = js.native
    
    /**
      * Fetch a HostedNumberOrderInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed HostedNumberOrderInstance
      */
    def fetch(): js.Promise[HostedNumberOrderInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[HostedNumberOrderInstance] = js.native
    
    /**
      * A 64 character string that is a human-readable text that describes this resource.
      */
    var friendlyName: String = js.native
    
    /**
      * A 34 character string that uniquely identifies the [IncomingPhoneNumber](https://www.twilio.com/docs/api/rest/incoming-phone-numbers) resource that represents the phone number being hosted.
      */
    var incomingPhoneNumberSid: String = js.native
    
    /**
      * Phone number to be hosted. This must be in [E.164](https://en.wikipedia.org/wiki/E.164) format, e.g., +16175551212
      */
    var phoneNumber: String = js.native
    
    /**
      * Remove a HostedNumberOrderInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed boolean
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[Boolean], Any]): js.Promise[Boolean] = js.native
    
    /**
      * A 34 character string that uniquely identifies this HostedNumberOrder.
      */
    var sid: String = js.native
    
    /**
      * A 34 character string that uniquely identifies the [Authorization Document](https://www.twilio.com/docs/api/phone-numbers/hosted-number-authorization-documents) the user needs to sign.
      */
    var signingDocumentSid: String = js.native
    
    var status: HostedNumberOrderStatus = js.native
    
    /**
      * Provide a user-friendly representation
      *
      * @returns Object
      */
    def toJSON(): Capabilities = js.native
    
    /**
      * Provides a unique and addressable name to be assigned to this HostedNumberOrder, assigned by the developer, to be optionally used in addition to SID.
      */
    var uniqueName: String = js.native
    
    /**
      * Update a HostedNumberOrderInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed HostedNumberOrderInstance
      */
    def update(): js.Promise[HostedNumberOrderInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[HostedNumberOrderInstance] = js.native
    /**
      * Update a HostedNumberOrderInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed HostedNumberOrderInstance
      */
    def update(params: HostedNumberOrderContextUpdateOptions): js.Promise[HostedNumberOrderInstance] = js.native
    def update(
      params: HostedNumberOrderContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]
    ): js.Promise[HostedNumberOrderInstance] = js.native
    
    /**
      * The URL of this HostedNumberOrder.
      */
    var url: String = js.native
    
    /**
      * The number of attempts made to verify ownership of the phone number that is being hosted.
      */
    var verificationAttempts: Double = js.native
    
    /**
      * A list of 34 character strings that are unique identifiers for the calls placed as part of ownership verification.
      */
    var verificationCallSids: js.Array[String] = js.native
    
    /**
      * A verification code provided in the response for a user to enter when they pick up the phone call.
      */
    var verificationCode: String = js.native
    
    /**
      * A 34 character string that uniquely identifies the Identity Document resource that represents the document for verifying ownership of the number to be hosted.
      */
    var verificationDocumentSid: String = js.native
    
    var verificationType: HostedNumberOrderVerificationType = js.native
  }
  
  @js.native
  trait HostedNumberOrderListInstance extends StObject {
    
    def apply(sid: String): HostedNumberOrderContext = js.native
    
    var _solution: HostedNumberOrderSolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
    /**
      * Create a HostedNumberOrderInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed HostedNumberOrderInstance
      */
    def create(params: HostedNumberOrderListInstanceCreateOptions): js.Promise[HostedNumberOrderInstance] = js.native
    def create(
      params: HostedNumberOrderListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[HostedNumberOrderInstance], Any]
    ): js.Promise[HostedNumberOrderInstance] = js.native
    
    /**
      * Streams HostedNumberOrderInstance records from the API.
      *
      * This operation lazily loads records as efficiently as possible until the limit
      * is reached.
      *
      * The results are passed into the callback function, so this operation is memory
      * efficient.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { HostedNumberOrderListInstanceEachOptions } [params] - Options for request
      * @param { function } [callback] - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ HostedNumberOrderInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(params: HostedNumberOrderListInstanceEachOptions): Unit = js.native
    def each(
      params: HostedNumberOrderListInstanceEachOptions,
      callback: js.Function2[
          /* item */ HostedNumberOrderInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    def get(sid: String): HostedNumberOrderContext = js.native
    
    /**
      * Retrieve a single target page of HostedNumberOrderInstance records from the API.
      *
      * The request is executed immediately.
      *
      * @param { string } [targetUrl] - API-generated URL for the requested results page
      * @param { function } [callback] - Callback to handle list of records
      */
    def getPage(targetUrl: String): js.Promise[HostedNumberOrderPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ HostedNumberOrderPage, Any]
    ): js.Promise[HostedNumberOrderPage] = js.native
    
    /**
      * Lists HostedNumberOrderInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { HostedNumberOrderListInstanceOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[HostedNumberOrderInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[HostedNumberOrderInstance], Any]
    ): js.Promise[js.Array[HostedNumberOrderInstance]] = js.native
    def list(params: HostedNumberOrderListInstanceOptions): js.Promise[js.Array[HostedNumberOrderInstance]] = js.native
    def list(
      params: HostedNumberOrderListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[HostedNumberOrderInstance], Any]
    ): js.Promise[js.Array[HostedNumberOrderInstance]] = js.native
    
    /**
      * Retrieve a single page of HostedNumberOrderInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { HostedNumberOrderListInstancePageOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def page(): js.Promise[HostedNumberOrderPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ HostedNumberOrderPage, Any]): js.Promise[HostedNumberOrderPage] = js.native
    def page(params: HostedNumberOrderListInstancePageOptions): js.Promise[HostedNumberOrderPage] = js.native
    def page(
      params: HostedNumberOrderListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ HostedNumberOrderPage, Any]
    ): js.Promise[HostedNumberOrderPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object HostedNumberOrderListInstance {
    
    @JSImport("twilio/lib/rest/preview/hosted_numbers/hostedNumberOrder", "HostedNumberOrderListInstance")
    @js.native
    def apply(version: default): HostedNumberOrderListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/hosted_numbers/hostedNumberOrder", "HostedNumberOrderPage")
  @js.native
  open class HostedNumberOrderPage protected ()
    extends typings.twilio.libBasePageMod.default[
          default, 
          HostedNumberOrderPayload, 
          HostedNumberOrderResource, 
          HostedNumberOrderInstance
        ] {
    /**
      * Initialize the HostedNumberOrderPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: default,
      response: typings.twilio.libHttpResponseMod.default[String],
      solution: HostedNumberOrderSolution
    ) = this()
    
    /**
      * Build an instance of HostedNumberOrderInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: HostedNumberOrderResource): HostedNumberOrderInstance = js.native
  }
  
  @js.native
  trait HostedNumberOrderContext extends StObject {
    
    /**
      * Fetch a HostedNumberOrderInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed HostedNumberOrderInstance
      */
    def fetch(): js.Promise[HostedNumberOrderInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[HostedNumberOrderInstance], Any]
    ): js.Promise[HostedNumberOrderInstance] = js.native
    
    /**
      * Remove a HostedNumberOrderInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed boolean
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[Boolean], Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * Update a HostedNumberOrderInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed HostedNumberOrderInstance
      */
    def update(): js.Promise[HostedNumberOrderInstance] = js.native
    def update(
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[HostedNumberOrderInstance], Any]
    ): js.Promise[HostedNumberOrderInstance] = js.native
    /**
      * Update a HostedNumberOrderInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed HostedNumberOrderInstance
      */
    def update(params: HostedNumberOrderContextUpdateOptions): js.Promise[HostedNumberOrderInstance] = js.native
    def update(
      params: HostedNumberOrderContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[HostedNumberOrderInstance], Any]
    ): js.Promise[HostedNumberOrderInstance] = js.native
  }
  
  trait HostedNumberOrderContextSolution extends StObject {
    
    var sid: String
  }
  object HostedNumberOrderContextSolution {
    
    inline def apply(sid: String): HostedNumberOrderContextSolution = {
      val __obj = js.Dynamic.literal(sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostedNumberOrderContextSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HostedNumberOrderContextSolution] (val x: Self) extends AnyVal {
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait HostedNumberOrderContextUpdateOptions extends StObject {
    
    /** The number of seconds, between 0 and 60, to delay before initiating the verification call. Defaults to 0. */
    var callDelay: js.UndefOr[Double] = js.undefined
    
    /** Optional. A list of emails that LOA document for this HostedNumberOrder will be carbon copied to. */
    var ccEmails: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Email of the owner of this phone number that is being hosted. */
    var email: js.UndefOr[String] = js.undefined
    
    /** Digits to dial after connecting the verification call. */
    var `extension`: js.UndefOr[String] = js.undefined
    
    /** A 64 character string that is a human readable text that describes this resource. */
    var friendlyName: js.UndefOr[String] = js.undefined
    
    /**  */
    var status: js.UndefOr[HostedNumberOrderStatus] = js.undefined
    
    /** Provides a unique and addressable name to be assigned to this HostedNumberOrder, assigned by the developer, to be optionally used in addition to SID. */
    var uniqueName: js.UndefOr[String] = js.undefined
    
    /** A verification code that is given to the user via a phone call to the phone number that is being hosted. */
    var verificationCode: js.UndefOr[String] = js.undefined
    
    /** Optional. The unique sid identifier of the Identity Document that represents the document for verifying ownership of the number to be hosted. Required when VerificationType is phone-bill. */
    var verificationDocumentSid: js.UndefOr[String] = js.undefined
    
    /**  */
    var verificationType: js.UndefOr[HostedNumberOrderVerificationType] = js.undefined
  }
  object HostedNumberOrderContextUpdateOptions {
    
    inline def apply(): HostedNumberOrderContextUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HostedNumberOrderContextUpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HostedNumberOrderContextUpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setCallDelay(value: Double): Self = StObject.set(x, "callDelay", value.asInstanceOf[js.Any])
      
      inline def setCallDelayUndefined: Self = StObject.set(x, "callDelay", js.undefined)
      
      inline def setCcEmails(value: js.Array[String]): Self = StObject.set(x, "ccEmails", value.asInstanceOf[js.Any])
      
      inline def setCcEmailsUndefined: Self = StObject.set(x, "ccEmails", js.undefined)
      
      inline def setCcEmailsVarargs(value: String*): Self = StObject.set(x, "ccEmails", js.Array(value*))
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setStatus(value: HostedNumberOrderStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
      
      inline def setVerificationCode(value: String): Self = StObject.set(x, "verificationCode", value.asInstanceOf[js.Any])
      
      inline def setVerificationCodeUndefined: Self = StObject.set(x, "verificationCode", js.undefined)
      
      inline def setVerificationDocumentSid(value: String): Self = StObject.set(x, "verificationDocumentSid", value.asInstanceOf[js.Any])
      
      inline def setVerificationDocumentSidUndefined: Self = StObject.set(x, "verificationDocumentSid", js.undefined)
      
      inline def setVerificationType(value: HostedNumberOrderVerificationType): Self = StObject.set(x, "verificationType", value.asInstanceOf[js.Any])
      
      inline def setVerificationTypeUndefined: Self = StObject.set(x, "verificationType", js.undefined)
    }
  }
  
  trait HostedNumberOrderListInstanceCreateOptions extends StObject {
    
    /** This defaults to the AccountSid of the authorization the user is using. This can be provided to specify a subaccount to add the HostedNumberOrder to. */
    var accountSid: js.UndefOr[String] = js.undefined
    
    /** Optional. A 34 character string that uniquely identifies the Address resource that represents the address of the owner of this phone number. */
    var addressSid: js.UndefOr[String] = js.undefined
    
    /** Optional. A list of emails that the LOA document for this HostedNumberOrder will be carbon copied to. */
    var ccEmails: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Optional. Email of the owner of this phone number that is being hosted. */
    var email: js.UndefOr[String] = js.undefined
    
    /** A 64 character string that is a human readable text that describes this resource. */
    var friendlyName: js.UndefOr[String] = js.undefined
    
    /** The number to host in [+E.164](https://en.wikipedia.org/wiki/E.164) format */
    var phoneNumber: String
    
    /** Optional. The 34 character sid of the application Twilio should use to handle SMS messages sent to this number. If a `SmsApplicationSid` is present, Twilio will ignore all of the SMS urls above and use those set on the application. */
    var smsApplicationSid: js.UndefOr[String] = js.undefined
    
    /** Used to specify that the SMS capability will be hosted on Twilio\\\'s platform. */
    var smsCapability: Boolean
    
    /** The HTTP method that should be used to request the SmsFallbackUrl. Must be either `GET` or `POST`. This will be copied onto the IncomingPhoneNumber resource. */
    var smsFallbackMethod: js.UndefOr[String] = js.undefined
    
    /** A URL that Twilio will request if an error occurs requesting or executing the TwiML defined by SmsUrl. This will be copied onto the IncomingPhoneNumber resource. */
    var smsFallbackUrl: js.UndefOr[String] = js.undefined
    
    /** The HTTP method that should be used to request the SmsUrl. Must be either `GET` or `POST`.  This will be copied onto the IncomingPhoneNumber resource. */
    var smsMethod: js.UndefOr[String] = js.undefined
    
    /** The URL that Twilio should request when somebody sends an SMS to the phone number. This will be copied onto the IncomingPhoneNumber resource. */
    var smsUrl: js.UndefOr[String] = js.undefined
    
    /** Optional. The Status Callback Method attached to the IncomingPhoneNumber resource. */
    var statusCallbackMethod: js.UndefOr[String] = js.undefined
    
    /** Optional. The Status Callback URL attached to the IncomingPhoneNumber resource. */
    var statusCallbackUrl: js.UndefOr[String] = js.undefined
    
    /** Optional. Provides a unique and addressable name to be assigned to this HostedNumberOrder, assigned by the developer, to be optionally used in addition to SID. */
    var uniqueName: js.UndefOr[String] = js.undefined
    
    /** Optional. The unique sid identifier of the Identity Document that represents the document for verifying ownership of the number to be hosted. Required when VerificationType is phone-bill. */
    var verificationDocumentSid: js.UndefOr[String] = js.undefined
    
    /**  */
    var verificationType: js.UndefOr[HostedNumberOrderVerificationType] = js.undefined
  }
  object HostedNumberOrderListInstanceCreateOptions {
    
    inline def apply(phoneNumber: String, smsCapability: Boolean): HostedNumberOrderListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any], smsCapability = smsCapability.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostedNumberOrderListInstanceCreateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HostedNumberOrderListInstanceCreateOptions] (val x: Self) extends AnyVal {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
      
      inline def setAddressSid(value: String): Self = StObject.set(x, "addressSid", value.asInstanceOf[js.Any])
      
      inline def setAddressSidUndefined: Self = StObject.set(x, "addressSid", js.undefined)
      
      inline def setCcEmails(value: js.Array[String]): Self = StObject.set(x, "ccEmails", value.asInstanceOf[js.Any])
      
      inline def setCcEmailsUndefined: Self = StObject.set(x, "ccEmails", js.undefined)
      
      inline def setCcEmailsVarargs(value: String*): Self = StObject.set(x, "ccEmails", js.Array(value*))
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      inline def setSmsApplicationSid(value: String): Self = StObject.set(x, "smsApplicationSid", value.asInstanceOf[js.Any])
      
      inline def setSmsApplicationSidUndefined: Self = StObject.set(x, "smsApplicationSid", js.undefined)
      
      inline def setSmsCapability(value: Boolean): Self = StObject.set(x, "smsCapability", value.asInstanceOf[js.Any])
      
      inline def setSmsFallbackMethod(value: String): Self = StObject.set(x, "smsFallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setSmsFallbackMethodUndefined: Self = StObject.set(x, "smsFallbackMethod", js.undefined)
      
      inline def setSmsFallbackUrl(value: String): Self = StObject.set(x, "smsFallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setSmsFallbackUrlUndefined: Self = StObject.set(x, "smsFallbackUrl", js.undefined)
      
      inline def setSmsMethod(value: String): Self = StObject.set(x, "smsMethod", value.asInstanceOf[js.Any])
      
      inline def setSmsMethodUndefined: Self = StObject.set(x, "smsMethod", js.undefined)
      
      inline def setSmsUrl(value: String): Self = StObject.set(x, "smsUrl", value.asInstanceOf[js.Any])
      
      inline def setSmsUrlUndefined: Self = StObject.set(x, "smsUrl", js.undefined)
      
      inline def setStatusCallbackMethod(value: String): Self = StObject.set(x, "statusCallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackMethodUndefined: Self = StObject.set(x, "statusCallbackMethod", js.undefined)
      
      inline def setStatusCallbackUrl(value: String): Self = StObject.set(x, "statusCallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackUrlUndefined: Self = StObject.set(x, "statusCallbackUrl", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
      
      inline def setVerificationDocumentSid(value: String): Self = StObject.set(x, "verificationDocumentSid", value.asInstanceOf[js.Any])
      
      inline def setVerificationDocumentSidUndefined: Self = StObject.set(x, "verificationDocumentSid", js.undefined)
      
      inline def setVerificationType(value: HostedNumberOrderVerificationType): Self = StObject.set(x, "verificationType", value.asInstanceOf[js.Any])
      
      inline def setVerificationTypeUndefined: Self = StObject.set(x, "verificationType", js.undefined)
    }
  }
  
  trait HostedNumberOrderListInstanceEachOptions extends StObject {
    
    /** Function to process each record. If this and a positional callback are passed, this one will be used */
    var callback: js.UndefOr[
        js.Function2[
          /* item */ HostedNumberOrderInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    /** Function to be called upon completion of streaming */
    var done: js.UndefOr[js.Function] = js.undefined
    
    /** A human readable description of this resource, up to 64 characters. */
    var friendlyName: js.UndefOr[String] = js.undefined
    
    /** A 34 character string that uniquely identifies the IncomingPhoneNumber resource created by this HostedNumberOrder. */
    var incomingPhoneNumberSid: js.UndefOr[String] = js.undefined
    
    /** Upper limit for the number of records to return. each() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** An E164 formatted phone number hosted by this HostedNumberOrder. */
    var phoneNumber: js.UndefOr[String] = js.undefined
    
    /** The Status of this HostedNumberOrder. One of `received`, `pending-verification`, `verified`, `pending-loa`, `carrier-processing`, `testing`, `completed`, `failed`, or `action-required`. */
    var status: js.UndefOr[HostedNumberOrderStatus] = js.undefined
    
    /** Provides a unique and addressable name to be assigned to this HostedNumberOrder, assigned by the developer, to be optionally used in addition to SID. */
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object HostedNumberOrderListInstanceEachOptions {
    
    inline def apply(): HostedNumberOrderListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HostedNumberOrderListInstanceEachOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HostedNumberOrderListInstanceEachOptions] (val x: Self) extends AnyVal {
      
      inline def setCallback(
        value: (/* item */ HostedNumberOrderInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setIncomingPhoneNumberSid(value: String): Self = StObject.set(x, "incomingPhoneNumberSid", value.asInstanceOf[js.Any])
      
      inline def setIncomingPhoneNumberSidUndefined: Self = StObject.set(x, "incomingPhoneNumberSid", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
      
      inline def setStatus(value: HostedNumberOrderStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  trait HostedNumberOrderListInstanceOptions extends StObject {
    
    /** A human readable description of this resource, up to 64 characters. */
    var friendlyName: js.UndefOr[String] = js.undefined
    
    /** A 34 character string that uniquely identifies the IncomingPhoneNumber resource created by this HostedNumberOrder. */
    var incomingPhoneNumberSid: js.UndefOr[String] = js.undefined
    
    /** Upper limit for the number of records to return. list() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** An E164 formatted phone number hosted by this HostedNumberOrder. */
    var phoneNumber: js.UndefOr[String] = js.undefined
    
    /** The Status of this HostedNumberOrder. One of `received`, `pending-verification`, `verified`, `pending-loa`, `carrier-processing`, `testing`, `completed`, `failed`, or `action-required`. */
    var status: js.UndefOr[HostedNumberOrderStatus] = js.undefined
    
    /** Provides a unique and addressable name to be assigned to this HostedNumberOrder, assigned by the developer, to be optionally used in addition to SID. */
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object HostedNumberOrderListInstanceOptions {
    
    inline def apply(): HostedNumberOrderListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HostedNumberOrderListInstanceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HostedNumberOrderListInstanceOptions] (val x: Self) extends AnyVal {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setIncomingPhoneNumberSid(value: String): Self = StObject.set(x, "incomingPhoneNumberSid", value.asInstanceOf[js.Any])
      
      inline def setIncomingPhoneNumberSidUndefined: Self = StObject.set(x, "incomingPhoneNumberSid", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
      
      inline def setStatus(value: HostedNumberOrderStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  trait HostedNumberOrderListInstancePageOptions extends StObject {
    
    /** A human readable description of this resource, up to 64 characters. */
    var friendlyName: js.UndefOr[String] = js.undefined
    
    /** A 34 character string that uniquely identifies the IncomingPhoneNumber resource created by this HostedNumberOrder. */
    var incomingPhoneNumberSid: js.UndefOr[String] = js.undefined
    
    /** Page Number, this value is simply for client state */
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** PageToken provided by the API */
    var pageToken: js.UndefOr[String] = js.undefined
    
    /** An E164 formatted phone number hosted by this HostedNumberOrder. */
    var phoneNumber: js.UndefOr[String] = js.undefined
    
    /** The Status of this HostedNumberOrder. One of `received`, `pending-verification`, `verified`, `pending-loa`, `carrier-processing`, `testing`, `completed`, `failed`, or `action-required`. */
    var status: js.UndefOr[HostedNumberOrderStatus] = js.undefined
    
    /** Provides a unique and addressable name to be assigned to this HostedNumberOrder, assigned by the developer, to be optionally used in addition to SID. */
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object HostedNumberOrderListInstancePageOptions {
    
    inline def apply(): HostedNumberOrderListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HostedNumberOrderListInstancePageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HostedNumberOrderListInstancePageOptions] (val x: Self) extends AnyVal {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setIncomingPhoneNumberSid(value: String): Self = StObject.set(x, "incomingPhoneNumberSid", value.asInstanceOf[js.Any])
      
      inline def setIncomingPhoneNumberSidUndefined: Self = StObject.set(x, "incomingPhoneNumberSid", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
      
      inline def setStatus(value: HostedNumberOrderStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  trait HostedNumberOrderPayload
    extends StObject
       with TwilioResponsePayload {
    
    var items: js.Array[HostedNumberOrderResource]
  }
  object HostedNumberOrderPayload {
    
    inline def apply(
      first_page_uri: String,
      items: js.Array[HostedNumberOrderResource],
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String
    ): HostedNumberOrderPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostedNumberOrderPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HostedNumberOrderPayload] (val x: Self) extends AnyVal {
      
      inline def setItems(value: js.Array[HostedNumberOrderResource]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: HostedNumberOrderResource*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
  
  trait HostedNumberOrderResource extends StObject {
    
    var account_sid: String
    
    var address_sid: String
    
    var call_delay: Double
    
    var capabilities: PhoneNumberCapabilities
    
    var cc_emails: js.Array[String]
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var email: String
    
    var `extension`: String
    
    var failure_reason: String
    
    var friendly_name: String
    
    var incoming_phone_number_sid: String
    
    var phone_number: String
    
    var sid: String
    
    var signing_document_sid: String
    
    var status: HostedNumberOrderStatus
    
    var unique_name: String
    
    var url: String
    
    var verification_attempts: Double
    
    var verification_call_sids: js.Array[String]
    
    var verification_code: String
    
    var verification_document_sid: String
    
    var verification_type: HostedNumberOrderVerificationType
  }
  object HostedNumberOrderResource {
    
    inline def apply(
      account_sid: String,
      address_sid: String,
      call_delay: Double,
      capabilities: PhoneNumberCapabilities,
      cc_emails: js.Array[String],
      date_created: js.Date,
      date_updated: js.Date,
      email: String,
      `extension`: String,
      failure_reason: String,
      friendly_name: String,
      incoming_phone_number_sid: String,
      phone_number: String,
      sid: String,
      signing_document_sid: String,
      status: HostedNumberOrderStatus,
      unique_name: String,
      url: String,
      verification_attempts: Double,
      verification_call_sids: js.Array[String],
      verification_code: String,
      verification_document_sid: String,
      verification_type: HostedNumberOrderVerificationType
    ): HostedNumberOrderResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], address_sid = address_sid.asInstanceOf[js.Any], call_delay = call_delay.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], cc_emails = cc_emails.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], failure_reason = failure_reason.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], incoming_phone_number_sid = incoming_phone_number_sid.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], signing_document_sid = signing_document_sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification_attempts = verification_attempts.asInstanceOf[js.Any], verification_call_sids = verification_call_sids.asInstanceOf[js.Any], verification_code = verification_code.asInstanceOf[js.Any], verification_document_sid = verification_document_sid.asInstanceOf[js.Any], verification_type = verification_type.asInstanceOf[js.Any])
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostedNumberOrderResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HostedNumberOrderResource] (val x: Self) extends AnyVal {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAddress_sid(value: String): Self = StObject.set(x, "address_sid", value.asInstanceOf[js.Any])
      
      inline def setCall_delay(value: Double): Self = StObject.set(x, "call_delay", value.asInstanceOf[js.Any])
      
      inline def setCapabilities(value: PhoneNumberCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setCc_emails(value: js.Array[String]): Self = StObject.set(x, "cc_emails", value.asInstanceOf[js.Any])
      
      inline def setCc_emailsVarargs(value: String*): Self = StObject.set(x, "cc_emails", js.Array(value*))
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setFailure_reason(value: String): Self = StObject.set(x, "failure_reason", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setIncoming_phone_number_sid(value: String): Self = StObject.set(x, "incoming_phone_number_sid", value.asInstanceOf[js.Any])
      
      inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSigning_document_sid(value: String): Self = StObject.set(x, "signing_document_sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: HostedNumberOrderStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVerification_attempts(value: Double): Self = StObject.set(x, "verification_attempts", value.asInstanceOf[js.Any])
      
      inline def setVerification_call_sids(value: js.Array[String]): Self = StObject.set(x, "verification_call_sids", value.asInstanceOf[js.Any])
      
      inline def setVerification_call_sidsVarargs(value: String*): Self = StObject.set(x, "verification_call_sids", js.Array(value*))
      
      inline def setVerification_code(value: String): Self = StObject.set(x, "verification_code", value.asInstanceOf[js.Any])
      
      inline def setVerification_document_sid(value: String): Self = StObject.set(x, "verification_document_sid", value.asInstanceOf[js.Any])
      
      inline def setVerification_type(value: HostedNumberOrderVerificationType): Self = StObject.set(x, "verification_type", value.asInstanceOf[js.Any])
    }
  }
  
  trait HostedNumberOrderSolution extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.received
    - typings.twilio.twilioStrings.`pending-verification`
    - typings.twilio.twilioStrings.verified
    - typings.twilio.twilioStrings.`pending-loa`
    - typings.twilio.twilioStrings.`carrier-processing`
    - typings.twilio.twilioStrings.testing
    - typings.twilio.twilioStrings.completed
    - typings.twilio.twilioStrings.failed
    - typings.twilio.twilioStrings.`action-required`
  */
  trait HostedNumberOrderStatus extends StObject
  object HostedNumberOrderStatus {
    
    inline def `action-required`: typings.twilio.twilioStrings.`action-required` = "action-required".asInstanceOf[typings.twilio.twilioStrings.`action-required`]
    
    inline def `carrier-processing`: typings.twilio.twilioStrings.`carrier-processing` = "carrier-processing".asInstanceOf[typings.twilio.twilioStrings.`carrier-processing`]
    
    inline def completed: typings.twilio.twilioStrings.completed = "completed".asInstanceOf[typings.twilio.twilioStrings.completed]
    
    inline def failed: typings.twilio.twilioStrings.failed = "failed".asInstanceOf[typings.twilio.twilioStrings.failed]
    
    inline def `pending-loa`: typings.twilio.twilioStrings.`pending-loa` = "pending-loa".asInstanceOf[typings.twilio.twilioStrings.`pending-loa`]
    
    inline def `pending-verification`: typings.twilio.twilioStrings.`pending-verification` = "pending-verification".asInstanceOf[typings.twilio.twilioStrings.`pending-verification`]
    
    inline def received: typings.twilio.twilioStrings.received = "received".asInstanceOf[typings.twilio.twilioStrings.received]
    
    inline def testing: typings.twilio.twilioStrings.testing = "testing".asInstanceOf[typings.twilio.twilioStrings.testing]
    
    inline def verified: typings.twilio.twilioStrings.verified = "verified".asInstanceOf[typings.twilio.twilioStrings.verified]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.`phone-call`
    - typings.twilio.twilioStrings.`phone-bill`
  */
  trait HostedNumberOrderVerificationType extends StObject
  object HostedNumberOrderVerificationType {
    
    inline def `phone-bill`: typings.twilio.twilioStrings.`phone-bill` = "phone-bill".asInstanceOf[typings.twilio.twilioStrings.`phone-bill`]
    
    inline def `phone-call`: typings.twilio.twilioStrings.`phone-call` = "phone-call".asInstanceOf[typings.twilio.twilioStrings.`phone-call`]
  }
}
