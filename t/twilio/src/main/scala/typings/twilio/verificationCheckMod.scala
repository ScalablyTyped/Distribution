package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object verificationCheckMod {
  
  @JSImport("twilio/lib/rest/verify/v2/service/verificationCheck", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/verify/v2/service/verificationCheck", "VerificationCheckInstance")
  @js.native
  open class VerificationCheckInstance protected () extends SerializableClass {
    /**
      * Initialize the VerificationCheckContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - The SID of the Service that the resource is associated with
      */
    def this(version: typings.twilio.verifyV2Mod.^, payload: VerificationCheckPayload, serviceSid: String) = this()
    
    var accountSid: String = js.native
    
    var amount: String = js.native
    
    var channel: VerificationCheckChannel = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var payee: String = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    var snaAttemptsErrorCodes: js.Array[js.Object] = js.native
    
    var status: String = js.native
    
    var to: String = js.native
    
    var valid: Boolean = js.native
  }
  
  /**
    * Initialize the VerificationCheckList
    *
    * @param version - Version of the resource
    * @param serviceSid - The SID of the Service that the resource is associated with
    */
  inline def VerificationCheckList(version: typings.twilio.verifyV2Mod.^, serviceSid: String): VerificationCheckListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("VerificationCheckList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any])).asInstanceOf[VerificationCheckListInstance]
  
  @JSImport("twilio/lib/rest/verify/v2/service/verificationCheck", "VerificationCheckPage")
  @js.native
  open class VerificationCheckPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.verifyV2Mod.^, 
          VerificationCheckPayload, 
          VerificationCheckResource, 
          VerificationCheckInstance
        ] {
    /**
      * Initialize the VerificationCheckPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.verifyV2Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: VerificationCheckSolution
    ) = this()
    
    /**
      * Build an instance of VerificationCheckInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: VerificationCheckPayload): VerificationCheckInstance = js.native
    
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
  trait VerificationCheckChannel extends StObject
  object VerificationCheckChannel {
    
    inline def call: typings.twilio.twilioStrings.call = "call".asInstanceOf[typings.twilio.twilioStrings.call]
    
    inline def email: typings.twilio.twilioStrings.email = "email".asInstanceOf[typings.twilio.twilioStrings.email]
    
    inline def sms: typings.twilio.twilioStrings.sms = "sms".asInstanceOf[typings.twilio.twilioStrings.sms]
    
    inline def sna: typings.twilio.twilioStrings.sna = "sna".asInstanceOf[typings.twilio.twilioStrings.sna]
    
    inline def whatsapp: typings.twilio.twilioStrings.whatsapp = "whatsapp".asInstanceOf[typings.twilio.twilioStrings.whatsapp]
  }
  
  @js.native
  trait VerificationCheckListInstance extends StObject {
    
    /**
      * create a VerificationCheckInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[VerificationCheckInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ VerificationCheckInstance, Any]): js.Promise[VerificationCheckInstance] = js.native
    def create(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ VerificationCheckInstance, Any]
    ): js.Promise[VerificationCheckInstance] = js.native
    def create(opts: VerificationCheckListInstanceCreateOptions): js.Promise[VerificationCheckInstance] = js.native
    def create(
      opts: VerificationCheckListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ VerificationCheckInstance, Any]
    ): js.Promise[VerificationCheckInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property amount - The amount of the associated PSD2 compliant transaction.
    * @property code - The verification string
    * @property payee - The payee of the associated PSD2 compliant transaction
    * @property to - The phone number or email to verify
    * @property verificationSid - A SID that uniquely identifies the Verification Check
    */
  trait VerificationCheckListInstanceCreateOptions extends StObject {
    
    var amount: js.UndefOr[String] = js.undefined
    
    var code: js.UndefOr[String] = js.undefined
    
    var payee: js.UndefOr[String] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
    
    var verificationSid: js.UndefOr[String] = js.undefined
  }
  object VerificationCheckListInstanceCreateOptions {
    
    inline def apply(): VerificationCheckListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerificationCheckListInstanceCreateOptions]
    }
    
    extension [Self <: VerificationCheckListInstanceCreateOptions](x: Self) {
      
      inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setPayee(value: String): Self = StObject.set(x, "payee", value.asInstanceOf[js.Any])
      
      inline def setPayeeUndefined: Self = StObject.set(x, "payee", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setVerificationSid(value: String): Self = StObject.set(x, "verificationSid", value.asInstanceOf[js.Any])
      
      inline def setVerificationSidUndefined: Self = StObject.set(x, "verificationSid", js.undefined)
    }
  }
  
  trait VerificationCheckPayload
    extends StObject
       with VerificationCheckResource
       with TwilioResponsePayload
  object VerificationCheckPayload {
    
    inline def apply(
      account_sid: String,
      amount: String,
      channel: VerificationCheckChannel,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      payee: String,
      previous_page_uri: String,
      service_sid: String,
      sid: String,
      sna_attempts_error_codes: js.Array[js.Object],
      status: String,
      to: String,
      uri: String,
      valid: Boolean
    ): VerificationCheckPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], payee = payee.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sna_attempts_error_codes = sna_attempts_error_codes.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerificationCheckPayload]
    }
  }
  
  trait VerificationCheckResource extends StObject {
    
    var account_sid: String
    
    var amount: String
    
    var channel: VerificationCheckChannel
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var payee: String
    
    var service_sid: String
    
    var sid: String
    
    var sna_attempts_error_codes: js.Array[js.Object]
    
    var status: String
    
    var to: String
    
    var valid: Boolean
  }
  object VerificationCheckResource {
    
    inline def apply(
      account_sid: String,
      amount: String,
      channel: VerificationCheckChannel,
      date_created: js.Date,
      date_updated: js.Date,
      payee: String,
      service_sid: String,
      sid: String,
      sna_attempts_error_codes: js.Array[js.Object],
      status: String,
      to: String,
      valid: Boolean
    ): VerificationCheckResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], payee = payee.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sna_attempts_error_codes = sna_attempts_error_codes.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerificationCheckResource]
    }
    
    extension [Self <: VerificationCheckResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setChannel(value: VerificationCheckChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setPayee(value: String): Self = StObject.set(x, "payee", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSna_attempts_error_codes(value: js.Array[js.Object]): Self = StObject.set(x, "sna_attempts_error_codes", value.asInstanceOf[js.Any])
      
      inline def setSna_attempts_error_codesVarargs(value: js.Object*): Self = StObject.set(x, "sna_attempts_error_codes", js.Array(value*))
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
  
  trait VerificationCheckSolution extends StObject {
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object VerificationCheckSolution {
    
    inline def apply(): VerificationCheckSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerificationCheckSolution]
    }
    
    extension [Self <: VerificationCheckSolution](x: Self) {
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
}
