package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.approved_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object verificationMod {
  
  @JSImport("twilio/lib/rest/verify/v2/service/verification", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/verify/v2/service/verification", "VerificationContext")
  @js.native
  open class VerificationContext protected () extends StObject {
    /**
      * Initialize the VerificationContext
      *
      * @param version - Version of the resource
      * @param serviceSid - The SID of the verification Service to fetch the resource from
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.verifyV2Mod.^, serviceSid: String, sid: String) = this()
    
    /**
      * fetch a VerificationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[VerificationInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ VerificationInstance, Any]): js.Promise[VerificationInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a VerificationInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: VerificationInstanceUpdateOptions): js.Promise[VerificationInstance] = js.native
    def update(
      opts: VerificationInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ VerificationInstance, Any]
    ): js.Promise[VerificationInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/verify/v2/service/verification", "VerificationInstance")
  @js.native
  open class VerificationInstance protected () extends SerializableClass {
    /**
      * Initialize the VerificationContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - The SID of the Service that the resource is associated with
      * @param sid - The unique string that identifies the resource
      */
    def this(
      version: typings.twilio.verifyV2Mod.^,
      payload: VerificationPayload,
      serviceSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: VerificationContext = js.native
    
    var accountSid: String = js.native
    
    var amount: String = js.native
    
    var channel: VerificationChannel = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a VerificationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[VerificationInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[VerificationInstance] = js.native
    
    var lookup: Any = js.native
    
    var payee: String = js.native
    
    var sendCodeAttempts: js.Array[js.Object] = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    var sna: Any = js.native
    
    var status: String = js.native
    
    var to: String = js.native
    
    /**
      * update a VerificationInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: VerificationInstanceUpdateOptions): js.Promise[VerificationInstance] = js.native
    def update(
      opts: VerificationInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[VerificationInstance] = js.native
    
    var url: String = js.native
    
    var valid: Boolean = js.native
  }
  
  /**
    * Initialize the VerificationList
    *
    * @param version - Version of the resource
    * @param serviceSid - The SID of the Service that the resource is associated with
    */
  inline def VerificationList(version: typings.twilio.verifyV2Mod.^, serviceSid: String): VerificationListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("VerificationList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any])).asInstanceOf[VerificationListInstance]
  
  @JSImport("twilio/lib/rest/verify/v2/service/verification", "VerificationPage")
  @js.native
  open class VerificationPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.verifyV2Mod.^, 
          VerificationPayload, 
          VerificationResource, 
          VerificationInstance
        ] {
    /**
      * Initialize the VerificationPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.verifyV2Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: VerificationSolution
    ) = this()
    
    /**
      * Build an instance of VerificationInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: VerificationPayload): VerificationInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.sms
    - typings.twilio.twilioStrings.call
    - typings.twilio.twilioStrings.email
    - typings.twilio.twilioStrings.whatsapp
    - typings.twilio.twilioStrings.sna
  */
  trait VerificationChannel extends StObject
  object VerificationChannel {
    
    inline def call: typings.twilio.twilioStrings.call = "call".asInstanceOf[typings.twilio.twilioStrings.call]
    
    inline def email: typings.twilio.twilioStrings.email = "email".asInstanceOf[typings.twilio.twilioStrings.email]
    
    inline def sms: typings.twilio.twilioStrings.sms = "sms".asInstanceOf[typings.twilio.twilioStrings.sms]
    
    inline def sna: typings.twilio.twilioStrings.sna = "sna".asInstanceOf[typings.twilio.twilioStrings.sna]
    
    inline def whatsapp: typings.twilio.twilioStrings.whatsapp = "whatsapp".asInstanceOf[typings.twilio.twilioStrings.whatsapp]
  }
  
  /**
    * Options to pass to update
    *
    * @property status - The new status of the resource
    */
  trait VerificationInstanceUpdateOptions extends StObject {
    
    var status: VerificationStatus
  }
  object VerificationInstanceUpdateOptions {
    
    inline def apply(status: VerificationStatus): VerificationInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerificationInstanceUpdateOptions]
    }
    
    extension [Self <: VerificationInstanceUpdateOptions](x: Self) {
      
      inline def setStatus(value: VerificationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VerificationListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): VerificationContext = js.native
    
    /**
      * create a VerificationInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: VerificationListInstanceCreateOptions): js.Promise[VerificationInstance] = js.native
    def create(
      opts: VerificationListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ VerificationInstance, Any]
    ): js.Promise[VerificationInstance] = js.native
    
    /**
      * Constructs a verification
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): VerificationContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property amount - The amount of the associated PSD2 compliant transaction.
    * @property appHash - Your App Hash to be appended at the end of an SMS.
    * @property channel - The verification method to use
    * @property channelConfiguration - Channel specific configuration in json format.
    * @property customCode - A pre-generated code
    * @property customFriendlyName - A custom user defined friendly name
    * @property customMessage - The text of a custom message to use for the verification
    * @property locale - The override locale to use for the verification SMS, WhatsApp or call
    * @property payee - The payee of the associated PSD2 compliant transaction
    * @property rateLimits - The custom key-value pairs of Programmable Rate Limits.
    * @property sendDigits - The digits to send after a phone call is answered
    * @property templateCustomSubstitutions - The values of the special variables declared on the message template.
    * @property templateSid - The verification template SMS messages.
    * @property to - The phone number or email to verify
    */
  trait VerificationListInstanceCreateOptions extends StObject {
    
    var amount: js.UndefOr[String] = js.undefined
    
    var appHash: js.UndefOr[String] = js.undefined
    
    var channel: String
    
    var channelConfiguration: js.UndefOr[js.Object] = js.undefined
    
    var customCode: js.UndefOr[String] = js.undefined
    
    var customFriendlyName: js.UndefOr[String] = js.undefined
    
    var customMessage: js.UndefOr[String] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var payee: js.UndefOr[String] = js.undefined
    
    var rateLimits: js.UndefOr[js.Object] = js.undefined
    
    var sendDigits: js.UndefOr[String] = js.undefined
    
    var templateCustomSubstitutions: js.UndefOr[String] = js.undefined
    
    var templateSid: js.UndefOr[String] = js.undefined
    
    var to: String
  }
  object VerificationListInstanceCreateOptions {
    
    inline def apply(channel: String, to: String): VerificationListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerificationListInstanceCreateOptions]
    }
    
    extension [Self <: VerificationListInstanceCreateOptions](x: Self) {
      
      inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      inline def setAppHash(value: String): Self = StObject.set(x, "appHash", value.asInstanceOf[js.Any])
      
      inline def setAppHashUndefined: Self = StObject.set(x, "appHash", js.undefined)
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelConfiguration(value: js.Object): Self = StObject.set(x, "channelConfiguration", value.asInstanceOf[js.Any])
      
      inline def setChannelConfigurationUndefined: Self = StObject.set(x, "channelConfiguration", js.undefined)
      
      inline def setCustomCode(value: String): Self = StObject.set(x, "customCode", value.asInstanceOf[js.Any])
      
      inline def setCustomCodeUndefined: Self = StObject.set(x, "customCode", js.undefined)
      
      inline def setCustomFriendlyName(value: String): Self = StObject.set(x, "customFriendlyName", value.asInstanceOf[js.Any])
      
      inline def setCustomFriendlyNameUndefined: Self = StObject.set(x, "customFriendlyName", js.undefined)
      
      inline def setCustomMessage(value: String): Self = StObject.set(x, "customMessage", value.asInstanceOf[js.Any])
      
      inline def setCustomMessageUndefined: Self = StObject.set(x, "customMessage", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setPayee(value: String): Self = StObject.set(x, "payee", value.asInstanceOf[js.Any])
      
      inline def setPayeeUndefined: Self = StObject.set(x, "payee", js.undefined)
      
      inline def setRateLimits(value: js.Object): Self = StObject.set(x, "rateLimits", value.asInstanceOf[js.Any])
      
      inline def setRateLimitsUndefined: Self = StObject.set(x, "rateLimits", js.undefined)
      
      inline def setSendDigits(value: String): Self = StObject.set(x, "sendDigits", value.asInstanceOf[js.Any])
      
      inline def setSendDigitsUndefined: Self = StObject.set(x, "sendDigits", js.undefined)
      
      inline def setTemplateCustomSubstitutions(value: String): Self = StObject.set(x, "templateCustomSubstitutions", value.asInstanceOf[js.Any])
      
      inline def setTemplateCustomSubstitutionsUndefined: Self = StObject.set(x, "templateCustomSubstitutions", js.undefined)
      
      inline def setTemplateSid(value: String): Self = StObject.set(x, "templateSid", value.asInstanceOf[js.Any])
      
      inline def setTemplateSidUndefined: Self = StObject.set(x, "templateSid", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait VerificationPayload
    extends StObject
       with VerificationResource
       with TwilioResponsePayload
  object VerificationPayload {
    
    inline def apply(
      account_sid: String,
      amount: String,
      channel: VerificationChannel,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      lookup: js.Object,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      payee: String,
      previous_page_uri: String,
      send_code_attempts: js.Array[js.Object],
      service_sid: String,
      sid: String,
      sna: js.Object,
      status: String,
      to: String,
      uri: String,
      url: String,
      valid: Boolean
    ): VerificationPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], payee = payee.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], send_code_attempts = send_code_attempts.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sna = sna.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerificationPayload]
    }
  }
  
  trait VerificationResource extends StObject {
    
    var account_sid: String
    
    var amount: String
    
    var channel: VerificationChannel
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var lookup: js.Object
    
    var payee: String
    
    var send_code_attempts: js.Array[js.Object]
    
    var service_sid: String
    
    var sid: String
    
    var sna: js.Object
    
    var status: String
    
    var to: String
    
    var url: String
    
    var valid: Boolean
  }
  object VerificationResource {
    
    inline def apply(
      account_sid: String,
      amount: String,
      channel: VerificationChannel,
      date_created: js.Date,
      date_updated: js.Date,
      lookup: js.Object,
      payee: String,
      send_code_attempts: js.Array[js.Object],
      service_sid: String,
      sid: String,
      sna: js.Object,
      status: String,
      to: String,
      url: String,
      valid: Boolean
    ): VerificationResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any], payee = payee.asInstanceOf[js.Any], send_code_attempts = send_code_attempts.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sna = sna.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerificationResource]
    }
    
    extension [Self <: VerificationResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setChannel(value: VerificationChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setLookup(value: js.Object): Self = StObject.set(x, "lookup", value.asInstanceOf[js.Any])
      
      inline def setPayee(value: String): Self = StObject.set(x, "payee", value.asInstanceOf[js.Any])
      
      inline def setSend_code_attempts(value: js.Array[js.Object]): Self = StObject.set(x, "send_code_attempts", value.asInstanceOf[js.Any])
      
      inline def setSend_code_attemptsVarargs(value: js.Object*): Self = StObject.set(x, "send_code_attempts", js.Array(value*))
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSna(value: js.Object): Self = StObject.set(x, "sna", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
  
  trait VerificationSolution extends StObject {
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object VerificationSolution {
    
    inline def apply(): VerificationSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerificationSolution]
    }
    
    extension [Self <: VerificationSolution](x: Self) {
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.canceled
    - typings.twilio.twilioStrings.approved_
  */
  trait VerificationStatus extends StObject
  object VerificationStatus {
    
    inline def approved: approved_ = "approved".asInstanceOf[approved_]
    
    inline def canceled: typings.twilio.twilioStrings.canceled = "canceled".asInstanceOf[typings.twilio.twilioStrings.canceled]
  }
}
