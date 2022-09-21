package typings.twilio

import typings.twilio.interfacesMod.PhoneNumberCapabilities
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.completed_
import typings.twilio.twilioStrings.failed__
import typings.twilio.twilioStrings.verified_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hostedNumberOrderMod {
  
  @JSImport("twilio/lib/rest/preview/hosted_numbers/hostedNumberOrder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/hosted_numbers/hostedNumberOrder", "HostedNumberOrderContext")
  @js.native
  open class HostedNumberOrderContext protected () extends StObject {
    /**
      * Initialize the HostedNumberOrderContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param sid - HostedNumberOrder sid.
      */
    def this(version: typings.twilio.hostedNumbersMod.^, sid: String) = this()
    
    /**
      * fetch a HostedNumberOrderInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[HostedNumberOrderInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ HostedNumberOrderInstance, Any]): js.Promise[HostedNumberOrderInstance] = js.native
    
    /**
      * remove a HostedNumberOrderInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ HostedNumberOrderInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a HostedNumberOrderInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[HostedNumberOrderInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ HostedNumberOrderInstance, Any]): js.Promise[HostedNumberOrderInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ HostedNumberOrderInstance, Any]
    ): js.Promise[HostedNumberOrderInstance] = js.native
    def update(opts: HostedNumberOrderInstanceUpdateOptions): js.Promise[HostedNumberOrderInstance] = js.native
    def update(
      opts: HostedNumberOrderInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ HostedNumberOrderInstance, Any]
    ): js.Promise[HostedNumberOrderInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/hosted_numbers/hostedNumberOrder", "HostedNumberOrderInstance")
  @js.native
  open class HostedNumberOrderInstance protected () extends SerializableClass {
    /**
      * Initialize the HostedNumberOrderContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - HostedNumberOrder sid.
      */
    def this(version: typings.twilio.hostedNumbersMod.^, payload: HostedNumberOrderPayload, sid: String) = this()
    
    /* private */ var _proxy: HostedNumberOrderContext = js.native
    
    var accountSid: String = js.native
    
    var addressSid: String = js.native
    
    var callDelay: Double = js.native
    
    var capabilities: PhoneNumberCapabilities = js.native
    
    var ccEmails: js.Array[String] = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var email: String = js.native
    
    var `extension`: String = js.native
    
    var failureReason: String = js.native
    
    /**
      * fetch a HostedNumberOrderInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[HostedNumberOrderInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[HostedNumberOrderInstance] = js.native
    
    var friendlyName: String = js.native
    
    var incomingPhoneNumberSid: String = js.native
    
    var phoneNumber: String = js.native
    
    /**
      * remove a HostedNumberOrderInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var signingDocumentSid: String = js.native
    
    var status: HostedNumberOrderStatus = js.native
    
    var uniqueName: String = js.native
    
    /**
      * update a HostedNumberOrderInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[HostedNumberOrderInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[HostedNumberOrderInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[HostedNumberOrderInstance] = js.native
    def update(opts: HostedNumberOrderInstanceUpdateOptions): js.Promise[HostedNumberOrderInstance] = js.native
    def update(
      opts: HostedNumberOrderInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[HostedNumberOrderInstance] = js.native
    
    var url: String = js.native
    
    var verificationAttempts: Double = js.native
    
    var verificationCallSids: js.Array[String] = js.native
    
    var verificationCode: String = js.native
    
    var verificationDocumentSid: String = js.native
    
    var verificationType: HostedNumberOrderVerificationType = js.native
  }
  
  /**
    * Initialize the HostedNumberOrderList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    */
  inline def HostedNumberOrderList(version: typings.twilio.hostedNumbersMod.^): HostedNumberOrderListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("HostedNumberOrderList")(version.asInstanceOf[js.Any]).asInstanceOf[HostedNumberOrderListInstance]
  
  @JSImport("twilio/lib/rest/preview/hosted_numbers/hostedNumberOrder", "HostedNumberOrderPage")
  @js.native
  open class HostedNumberOrderPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.hostedNumbersMod.^, 
          HostedNumberOrderPayload, 
          HostedNumberOrderResource, 
          HostedNumberOrderInstance
        ] {
    /**
      * Initialize the HostedNumberOrderPage
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
      version: typings.twilio.hostedNumbersMod.^,
      response: typings.twilio.responseMod.^[String],
      solution: HostedNumberOrderSolution
    ) = this()
    
    /**
      * Build an instance of HostedNumberOrderInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: HostedNumberOrderPayload): HostedNumberOrderInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property callDelay - The number of seconds, between 0 and 60, to delay before initiating the verification call.
    * @property ccEmails - A list of emails.
    * @property email - Email.
    * @property extension - Digits to dial after connecting the verification call.
    * @property friendlyName - A human readable description of this resource.
    * @property status - The Status of this HostedNumberOrder.
    * @property uniqueName - A unique, developer assigned name of this HostedNumberOrder.
    * @property verificationCode - A verification code.
    * @property verificationDocumentSid - Verification Document Sid
    * @property verificationType - Verification Type.
    */
  trait HostedNumberOrderInstanceUpdateOptions extends StObject {
    
    var callDelay: js.UndefOr[Double] = js.undefined
    
    var ccEmails: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var `extension`: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[HostedNumberOrderStatus] = js.undefined
    
    var uniqueName: js.UndefOr[String] = js.undefined
    
    var verificationCode: js.UndefOr[String] = js.undefined
    
    var verificationDocumentSid: js.UndefOr[String] = js.undefined
    
    var verificationType: js.UndefOr[HostedNumberOrderVerificationType] = js.undefined
  }
  object HostedNumberOrderInstanceUpdateOptions {
    
    inline def apply(): HostedNumberOrderInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HostedNumberOrderInstanceUpdateOptions]
    }
    
    extension [Self <: HostedNumberOrderInstanceUpdateOptions](x: Self) {
      
      inline def setCallDelay(value: Double): Self = StObject.set(x, "callDelay", value.asInstanceOf[js.Any])
      
      inline def setCallDelayUndefined: Self = StObject.set(x, "callDelay", js.undefined)
      
      inline def setCcEmails(value: String | js.Array[String]): Self = StObject.set(x, "ccEmails", value.asInstanceOf[js.Any])
      
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
  
  @js.native
  trait HostedNumberOrderListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): HostedNumberOrderContext = js.native
    
    /**
      * create a HostedNumberOrderInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: HostedNumberOrderListInstanceCreateOptions): js.Promise[HostedNumberOrderInstance] = js.native
    def create(
      opts: HostedNumberOrderListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ HostedNumberOrderInstance, Any]
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
      * @param callback - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ HostedNumberOrderInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ HostedNumberOrderInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: HostedNumberOrderListInstanceEachOptions): Unit = js.native
    def each(
      opts: HostedNumberOrderListInstanceEachOptions,
      callback: js.Function2[
          /* item */ HostedNumberOrderInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a hosted_number_order
      *
      * @param sid - HostedNumberOrder sid.
      */
    def get(sid: String): HostedNumberOrderContext = js.native
    
    /**
      * Retrieve a single target page of HostedNumberOrderInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[HostedNumberOrderPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ HostedNumberOrderPage, Any]): js.Promise[HostedNumberOrderPage] = js.native
    def getPage(targetUrl: String): js.Promise[HostedNumberOrderPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ HostedNumberOrderPage, Any]
    ): js.Promise[HostedNumberOrderPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ HostedNumberOrderPage, Any]
    ): js.Promise[HostedNumberOrderPage] = js.native
    
    /**
      * Lists HostedNumberOrderInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[HostedNumberOrderInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[HostedNumberOrderInstance], Any]
    ): js.Promise[js.Array[HostedNumberOrderInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[HostedNumberOrderInstance], Any]
    ): js.Promise[js.Array[HostedNumberOrderInstance]] = js.native
    def list(opts: HostedNumberOrderListInstanceOptions): js.Promise[js.Array[HostedNumberOrderInstance]] = js.native
    def list(
      opts: HostedNumberOrderListInstanceOptions,
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
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[HostedNumberOrderPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ HostedNumberOrderPage, Any]): js.Promise[HostedNumberOrderPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ HostedNumberOrderPage, Any]
    ): js.Promise[HostedNumberOrderPage] = js.native
    def page(opts: HostedNumberOrderListInstancePageOptions): js.Promise[HostedNumberOrderPage] = js.native
    def page(
      opts: HostedNumberOrderListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ HostedNumberOrderPage, Any]
    ): js.Promise[HostedNumberOrderPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property accountSid - Account Sid.
    * @property addressSid - Address sid.
    * @property ccEmails - A list of emails.
    * @property email - Email.
    * @property friendlyName - A human readable description of this resource.
    * @property phoneNumber - An E164 formatted phone number.
    * @property smsApplicationSid - SMS Application Sid.
    * @property smsCapability - Specify SMS capability to host.
    * @property smsFallbackMethod - SMS Fallback Method.
    * @property smsFallbackUrl - SMS Fallback URL.
    * @property smsMethod - SMS Method.
    * @property smsUrl - SMS URL.
    * @property statusCallbackMethod - Status Callback Method.
    * @property statusCallbackUrl - Status Callback URL.
    * @property uniqueName - A unique, developer assigned name of this HostedNumberOrder.
    * @property verificationDocumentSid - Verification Document Sid
    * @property verificationType - Verification Type.
    */
  trait HostedNumberOrderListInstanceCreateOptions extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
    
    var addressSid: js.UndefOr[String] = js.undefined
    
    var ccEmails: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var phoneNumber: String
    
    var smsApplicationSid: js.UndefOr[String] = js.undefined
    
    var smsCapability: Boolean
    
    var smsFallbackMethod: js.UndefOr[String] = js.undefined
    
    var smsFallbackUrl: js.UndefOr[String] = js.undefined
    
    var smsMethod: js.UndefOr[String] = js.undefined
    
    var smsUrl: js.UndefOr[String] = js.undefined
    
    var statusCallbackMethod: js.UndefOr[String] = js.undefined
    
    var statusCallbackUrl: js.UndefOr[String] = js.undefined
    
    var uniqueName: js.UndefOr[String] = js.undefined
    
    var verificationDocumentSid: js.UndefOr[String] = js.undefined
    
    var verificationType: js.UndefOr[HostedNumberOrderVerificationType] = js.undefined
  }
  object HostedNumberOrderListInstanceCreateOptions {
    
    inline def apply(phoneNumber: String, smsCapability: Boolean): HostedNumberOrderListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any], smsCapability = smsCapability.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostedNumberOrderListInstanceCreateOptions]
    }
    
    extension [Self <: HostedNumberOrderListInstanceCreateOptions](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
      
      inline def setAddressSid(value: String): Self = StObject.set(x, "addressSid", value.asInstanceOf[js.Any])
      
      inline def setAddressSidUndefined: Self = StObject.set(x, "addressSid", js.undefined)
      
      inline def setCcEmails(value: String | js.Array[String]): Self = StObject.set(x, "ccEmails", value.asInstanceOf[js.Any])
      
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
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
    * @property friendlyName - A human readable description of this resource.
    * @property incomingPhoneNumberSid - IncomingPhoneNumber sid.
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         each() guarantees never to return more than limit.
    *                         Default is no limit
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no pageSize is defined but a limit is defined,
    *                         each() will attempt to read the limit with the most efficient
    *                         page size, i.e. min(limit, 1000)
    * @property phoneNumber - An E164 formatted phone number.
    * @property status - The Status of this HostedNumberOrder.
    * @property uniqueName - A unique, developer assigned name of this HostedNumberOrder.
    */
  trait HostedNumberOrderListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ HostedNumberOrderInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var incomingPhoneNumberSid: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var phoneNumber: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[HostedNumberOrderStatus] = js.undefined
    
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object HostedNumberOrderListInstanceEachOptions {
    
    inline def apply(): HostedNumberOrderListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HostedNumberOrderListInstanceEachOptions]
    }
    
    extension [Self <: HostedNumberOrderListInstanceEachOptions](x: Self) {
      
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
  
  /**
    * Options to pass to list
    *
    * @property friendlyName - A human readable description of this resource.
    * @property incomingPhoneNumberSid - IncomingPhoneNumber sid.
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         list() guarantees never to return more than limit.
    *                         Default is no limit
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no page_size is defined but a limit is defined,
    *                         list() will attempt to read the limit with the most
    *                         efficient page size, i.e. min(limit, 1000)
    * @property phoneNumber - An E164 formatted phone number.
    * @property status - The Status of this HostedNumberOrder.
    * @property uniqueName - A unique, developer assigned name of this HostedNumberOrder.
    */
  trait HostedNumberOrderListInstanceOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var incomingPhoneNumberSid: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var phoneNumber: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[HostedNumberOrderStatus] = js.undefined
    
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object HostedNumberOrderListInstanceOptions {
    
    inline def apply(): HostedNumberOrderListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HostedNumberOrderListInstanceOptions]
    }
    
    extension [Self <: HostedNumberOrderListInstanceOptions](x: Self) {
      
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
  
  /**
    * Options to pass to page
    *
    * @property friendlyName - A human readable description of this resource.
    * @property incomingPhoneNumberSid - IncomingPhoneNumber sid.
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property phoneNumber - An E164 formatted phone number.
    * @property status - The Status of this HostedNumberOrder.
    * @property uniqueName - A unique, developer assigned name of this HostedNumberOrder.
    */
  trait HostedNumberOrderListInstancePageOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var incomingPhoneNumberSid: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var phoneNumber: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[HostedNumberOrderStatus] = js.undefined
    
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object HostedNumberOrderListInstancePageOptions {
    
    inline def apply(): HostedNumberOrderListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HostedNumberOrderListInstancePageOptions]
    }
    
    extension [Self <: HostedNumberOrderListInstancePageOptions](x: Self) {
      
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
       with HostedNumberOrderResource
       with TwilioResponsePayload
  object HostedNumberOrderPayload {
    
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
      first_page_uri: String,
      friendly_name: String,
      incoming_phone_number_sid: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      phone_number: String,
      previous_page_uri: String,
      sid: String,
      signing_document_sid: String,
      status: HostedNumberOrderStatus,
      unique_name: String,
      uri: String,
      url: String,
      verification_attempts: Double,
      verification_call_sids: js.Array[String],
      verification_code: String,
      verification_document_sid: String,
      verification_type: HostedNumberOrderVerificationType
    ): HostedNumberOrderPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], address_sid = address_sid.asInstanceOf[js.Any], call_delay = call_delay.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], cc_emails = cc_emails.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], failure_reason = failure_reason.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], incoming_phone_number_sid = incoming_phone_number_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], signing_document_sid = signing_document_sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification_attempts = verification_attempts.asInstanceOf[js.Any], verification_call_sids = verification_call_sids.asInstanceOf[js.Any], verification_code = verification_code.asInstanceOf[js.Any], verification_document_sid = verification_document_sid.asInstanceOf[js.Any], verification_type = verification_type.asInstanceOf[js.Any])
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostedNumberOrderPayload]
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
    
    extension [Self <: HostedNumberOrderResource](x: Self) {
      
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
    - typings.twilio.twilioStrings.verified_
    - typings.twilio.twilioStrings.`pending-loa`
    - typings.twilio.twilioStrings.`carrier-processing`
    - typings.twilio.twilioStrings.testing
    - typings.twilio.twilioStrings.completed_
    - typings.twilio.twilioStrings.failed__
    - typings.twilio.twilioStrings.`action-required`
  */
  trait HostedNumberOrderStatus extends StObject
  object HostedNumberOrderStatus {
    
    inline def `action-required`: typings.twilio.twilioStrings.`action-required` = "action-required".asInstanceOf[typings.twilio.twilioStrings.`action-required`]
    
    inline def `carrier-processing`: typings.twilio.twilioStrings.`carrier-processing` = "carrier-processing".asInstanceOf[typings.twilio.twilioStrings.`carrier-processing`]
    
    inline def completed: completed_ = "completed".asInstanceOf[completed_]
    
    inline def failed: failed__ = "failed".asInstanceOf[failed__]
    
    inline def `pending-loa`: typings.twilio.twilioStrings.`pending-loa` = "pending-loa".asInstanceOf[typings.twilio.twilioStrings.`pending-loa`]
    
    inline def `pending-verification`: typings.twilio.twilioStrings.`pending-verification` = "pending-verification".asInstanceOf[typings.twilio.twilioStrings.`pending-verification`]
    
    inline def received: typings.twilio.twilioStrings.received = "received".asInstanceOf[typings.twilio.twilioStrings.received]
    
    inline def testing: typings.twilio.twilioStrings.testing = "testing".asInstanceOf[typings.twilio.twilioStrings.testing]
    
    inline def verified: verified_ = "verified".asInstanceOf[verified_]
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
