package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validationRequestMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/validationRequest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/validationRequest", "ValidationRequestInstance")
  @js.native
  open class ValidationRequestInstance protected () extends SerializableClass {
    /**
      * Initialize the ValidationRequestContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - The SID of the Account that created the resource
      */
    def this(version: typings.twilio.v2010Mod.^, payload: ValidationRequestPayload, accountSid: String) = this()
    
    var accountSid: String = js.native
    
    var callSid: String = js.native
    
    var friendlyName: String = js.native
    
    var phoneNumber: String = js.native
    
    var validationCode: String = js.native
  }
  
  /**
    * Initialize the ValidationRequestList
    *
    * @param version - Version of the resource
    * @param accountSid - The SID of the Account that created the resource
    */
  inline def ValidationRequestList(version: typings.twilio.v2010Mod.^, accountSid: String): ValidationRequestListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("ValidationRequestList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any])).asInstanceOf[ValidationRequestListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/validationRequest", "ValidationRequestPage")
  @js.native
  open class ValidationRequestPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.v2010Mod.^, 
          ValidationRequestPayload, 
          ValidationRequestResource, 
          ValidationRequestInstance
        ] {
    /**
      * Initialize the ValidationRequestPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: ValidationRequestSolution
    ) = this()
    
    /**
      * Build an instance of ValidationRequestInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ValidationRequestPayload): ValidationRequestInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait ValidationRequestListInstance extends StObject {
    
    /**
      * create a ValidationRequestInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: ValidationRequestListInstanceCreateOptions): js.Promise[ValidationRequestInstance] = js.native
    def create(
      opts: ValidationRequestListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ ValidationRequestInstance, Any]
    ): js.Promise[ValidationRequestInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property callDelay - The number of seconds to delay before initiating the verification call
    * @property extension - The digits to dial after connecting the verification call
    * @property friendlyName - A string to describe the resource
    * @property phoneNumber - The phone number to verify in E.164 format
    * @property statusCallback - The URL we should call to send status information to your application
    * @property statusCallbackMethod - The HTTP method we should use to call status_callback
    */
  trait ValidationRequestListInstanceCreateOptions extends StObject {
    
    var callDelay: js.UndefOr[Double] = js.undefined
    
    var `extension`: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var phoneNumber: String
    
    var statusCallback: js.UndefOr[String] = js.undefined
    
    var statusCallbackMethod: js.UndefOr[String] = js.undefined
  }
  object ValidationRequestListInstanceCreateOptions {
    
    inline def apply(phoneNumber: String): ValidationRequestListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationRequestListInstanceCreateOptions]
    }
    
    extension [Self <: ValidationRequestListInstanceCreateOptions](x: Self) {
      
      inline def setCallDelay(value: Double): Self = StObject.set(x, "callDelay", value.asInstanceOf[js.Any])
      
      inline def setCallDelayUndefined: Self = StObject.set(x, "callDelay", js.undefined)
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      inline def setStatusCallback(value: String): Self = StObject.set(x, "statusCallback", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackMethod(value: String): Self = StObject.set(x, "statusCallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackMethodUndefined: Self = StObject.set(x, "statusCallbackMethod", js.undefined)
      
      inline def setStatusCallbackUndefined: Self = StObject.set(x, "statusCallback", js.undefined)
    }
  }
  
  trait ValidationRequestPayload
    extends StObject
       with ValidationRequestResource
       with TwilioResponsePayload
  object ValidationRequestPayload {
    
    inline def apply(
      account_sid: String,
      call_sid: String,
      first_page_uri: String,
      friendly_name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      phone_number: String,
      previous_page_uri: String,
      uri: String,
      validation_code: String
    ): ValidationRequestPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], call_sid = call_sid.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], validation_code = validation_code.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationRequestPayload]
    }
  }
  
  trait ValidationRequestResource extends StObject {
    
    var account_sid: String
    
    var call_sid: String
    
    var friendly_name: String
    
    var phone_number: String
    
    var validation_code: String
  }
  object ValidationRequestResource {
    
    inline def apply(
      account_sid: String,
      call_sid: String,
      friendly_name: String,
      phone_number: String,
      validation_code: String
    ): ValidationRequestResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], call_sid = call_sid.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], validation_code = validation_code.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationRequestResource]
    }
    
    extension [Self <: ValidationRequestResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCall_sid(value: String): Self = StObject.set(x, "call_sid", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
      
      inline def setValidation_code(value: String): Self = StObject.set(x, "validation_code", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValidationRequestSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
  }
  object ValidationRequestSolution {
    
    inline def apply(): ValidationRequestSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidationRequestSolution]
    }
    
    extension [Self <: ValidationRequestSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
    }
  }
}
