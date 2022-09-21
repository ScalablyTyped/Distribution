package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v2PhoneNumberMod {
  
  @JSImport("twilio/lib/rest/lookups/v2/phoneNumber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/lookups/v2/phoneNumber", "PhoneNumberContext")
  @js.native
  open class PhoneNumberContext protected () extends StObject {
    /**
      * Initialize the PhoneNumberContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param phoneNumber - Phone number to lookup
      */
    def this(version: typings.twilio.lookupsV2Mod.^, phoneNumber: String) = this()
    
    /**
      * fetch a PhoneNumberInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[PhoneNumberInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ PhoneNumberInstance, Any]): js.Promise[PhoneNumberInstance] = js.native
    def fetch(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ PhoneNumberInstance, Any]
    ): js.Promise[PhoneNumberInstance] = js.native
    def fetch(opts: PhoneNumberInstanceFetchOptions): js.Promise[PhoneNumberInstance] = js.native
    def fetch(
      opts: PhoneNumberInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ PhoneNumberInstance, Any]
    ): js.Promise[PhoneNumberInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/lookups/v2/phoneNumber", "PhoneNumberInstance")
  @js.native
  open class PhoneNumberInstance protected () extends SerializableClass {
    /**
      * Initialize the PhoneNumberContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param phoneNumber - Phone number to lookup
      */
    def this(version: typings.twilio.lookupsV2Mod.^, payload: PhoneNumberPayload, phoneNumber: String) = this()
    
    /* private */ var _proxy: PhoneNumberContext = js.native
    
    var callForwarding: Any = js.native
    
    var callerName: Any = js.native
    
    var callingCountryCode: String = js.native
    
    var countryCode: String = js.native
    
    /**
      * fetch a PhoneNumberInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[PhoneNumberInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[PhoneNumberInstance] = js.native
    def fetch(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[PhoneNumberInstance] = js.native
    def fetch(opts: PhoneNumberInstanceFetchOptions): js.Promise[PhoneNumberInstance] = js.native
    def fetch(
      opts: PhoneNumberInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[PhoneNumberInstance] = js.native
    
    var lineTypeIntelligence: Any = js.native
    
    var liveActivity: Any = js.native
    
    var nationalFormat: String = js.native
    
    var phoneNumber: String = js.native
    
    var simSwap: Any = js.native
    
    var url: String = js.native
    
    var valid: Boolean = js.native
    
    var validationErrors: js.Array[PhoneNumberValidationError] = js.native
  }
  
  /**
    * Initialize the PhoneNumberList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    */
  inline def PhoneNumberList(version: typings.twilio.lookupsV2Mod.^): PhoneNumberListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("PhoneNumberList")(version.asInstanceOf[js.Any]).asInstanceOf[PhoneNumberListInstance]
  
  @JSImport("twilio/lib/rest/lookups/v2/phoneNumber", "PhoneNumberPage")
  @js.native
  open class PhoneNumberPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.lookupsV2Mod.^, 
          PhoneNumberPayload, 
          PhoneNumberResource, 
          PhoneNumberInstance
        ] {
    /**
      * Initialize the PhoneNumberPage
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.lookupsV2Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: PhoneNumberSolution
    ) = this()
    
    /**
      * Build an instance of PhoneNumberInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: PhoneNumberPayload): PhoneNumberInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to fetch
    *
    * @property countryCode - Country code for national phone number lookups
    * @property fields - Fields to return
    */
  trait PhoneNumberInstanceFetchOptions extends StObject {
    
    var countryCode: js.UndefOr[String] = js.undefined
    
    var fields: js.UndefOr[String] = js.undefined
  }
  object PhoneNumberInstanceFetchOptions {
    
    inline def apply(): PhoneNumberInstanceFetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PhoneNumberInstanceFetchOptions]
    }
    
    extension [Self <: PhoneNumberInstanceFetchOptions](x: Self) {
      
      inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
      
      inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
      
      inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    }
  }
  
  @js.native
  trait PhoneNumberListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): PhoneNumberContext = js.native
    
    /**
      * Constructs a phone_number
      *
      * @param phoneNumber - Phone number to lookup
      */
    def get(phoneNumber: String): PhoneNumberContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait PhoneNumberPayload
    extends StObject
       with PhoneNumberResource
       with TwilioResponsePayload
  object PhoneNumberPayload {
    
    inline def apply(
      call_forwarding: js.Object,
      caller_name: js.Object,
      calling_country_code: String,
      country_code: String,
      first_page_uri: String,
      line_type_intelligence: js.Object,
      live_activity: js.Object,
      national_format: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      phone_number: String,
      previous_page_uri: String,
      sim_swap: js.Object,
      uri: String,
      url: String,
      valid: Boolean,
      validation_errors: js.Array[PhoneNumberValidationError]
    ): PhoneNumberPayload = {
      val __obj = js.Dynamic.literal(call_forwarding = call_forwarding.asInstanceOf[js.Any], caller_name = caller_name.asInstanceOf[js.Any], calling_country_code = calling_country_code.asInstanceOf[js.Any], country_code = country_code.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], line_type_intelligence = line_type_intelligence.asInstanceOf[js.Any], live_activity = live_activity.asInstanceOf[js.Any], national_format = national_format.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sim_swap = sim_swap.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], validation_errors = validation_errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhoneNumberPayload]
    }
  }
  
  trait PhoneNumberResource extends StObject {
    
    var call_forwarding: js.Object
    
    var caller_name: js.Object
    
    var calling_country_code: String
    
    var country_code: String
    
    var line_type_intelligence: js.Object
    
    var live_activity: js.Object
    
    var national_format: String
    
    var phone_number: String
    
    var sim_swap: js.Object
    
    var url: String
    
    var valid: Boolean
    
    var validation_errors: js.Array[PhoneNumberValidationError]
  }
  object PhoneNumberResource {
    
    inline def apply(
      call_forwarding: js.Object,
      caller_name: js.Object,
      calling_country_code: String,
      country_code: String,
      line_type_intelligence: js.Object,
      live_activity: js.Object,
      national_format: String,
      phone_number: String,
      sim_swap: js.Object,
      url: String,
      valid: Boolean,
      validation_errors: js.Array[PhoneNumberValidationError]
    ): PhoneNumberResource = {
      val __obj = js.Dynamic.literal(call_forwarding = call_forwarding.asInstanceOf[js.Any], caller_name = caller_name.asInstanceOf[js.Any], calling_country_code = calling_country_code.asInstanceOf[js.Any], country_code = country_code.asInstanceOf[js.Any], line_type_intelligence = line_type_intelligence.asInstanceOf[js.Any], live_activity = live_activity.asInstanceOf[js.Any], national_format = national_format.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], sim_swap = sim_swap.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], validation_errors = validation_errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhoneNumberResource]
    }
    
    extension [Self <: PhoneNumberResource](x: Self) {
      
      inline def setCall_forwarding(value: js.Object): Self = StObject.set(x, "call_forwarding", value.asInstanceOf[js.Any])
      
      inline def setCaller_name(value: js.Object): Self = StObject.set(x, "caller_name", value.asInstanceOf[js.Any])
      
      inline def setCalling_country_code(value: String): Self = StObject.set(x, "calling_country_code", value.asInstanceOf[js.Any])
      
      inline def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
      
      inline def setLine_type_intelligence(value: js.Object): Self = StObject.set(x, "line_type_intelligence", value.asInstanceOf[js.Any])
      
      inline def setLive_activity(value: js.Object): Self = StObject.set(x, "live_activity", value.asInstanceOf[js.Any])
      
      inline def setNational_format(value: String): Self = StObject.set(x, "national_format", value.asInstanceOf[js.Any])
      
      inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
      
      inline def setSim_swap(value: js.Object): Self = StObject.set(x, "sim_swap", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValidation_errors(value: js.Array[PhoneNumberValidationError]): Self = StObject.set(x, "validation_errors", value.asInstanceOf[js.Any])
      
      inline def setValidation_errorsVarargs(value: PhoneNumberValidationError*): Self = StObject.set(x, "validation_errors", js.Array(value*))
    }
  }
  
  trait PhoneNumberSolution extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.landline
    - typings.twilio.twilioStrings.mobile
    - typings.twilio.twilioStrings.voip
  */
  trait PhoneNumberType extends StObject
  object PhoneNumberType {
    
    inline def landline: typings.twilio.twilioStrings.landline = "landline".asInstanceOf[typings.twilio.twilioStrings.landline]
    
    inline def mobile: typings.twilio.twilioStrings.mobile = "mobile".asInstanceOf[typings.twilio.twilioStrings.mobile]
    
    inline def voip: typings.twilio.twilioStrings.voip = "voip".asInstanceOf[typings.twilio.twilioStrings.voip]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.TOO_SHORT
    - typings.twilio.twilioStrings.TOO_LONG
    - typings.twilio.twilioStrings.INVALID_BUT_POSSIBLE
    - typings.twilio.twilioStrings.INVALID_COUNTRY_CODE
    - typings.twilio.twilioStrings.INVALID_LENGTH
    - typings.twilio.twilioStrings.NOT_A_NUMBER
  */
  trait PhoneNumberValidationError extends StObject
  object PhoneNumberValidationError {
    
    inline def INVALID_BUT_POSSIBLE: typings.twilio.twilioStrings.INVALID_BUT_POSSIBLE = "INVALID_BUT_POSSIBLE".asInstanceOf[typings.twilio.twilioStrings.INVALID_BUT_POSSIBLE]
    
    inline def INVALID_COUNTRY_CODE: typings.twilio.twilioStrings.INVALID_COUNTRY_CODE = "INVALID_COUNTRY_CODE".asInstanceOf[typings.twilio.twilioStrings.INVALID_COUNTRY_CODE]
    
    inline def INVALID_LENGTH: typings.twilio.twilioStrings.INVALID_LENGTH = "INVALID_LENGTH".asInstanceOf[typings.twilio.twilioStrings.INVALID_LENGTH]
    
    inline def NOT_A_NUMBER: typings.twilio.twilioStrings.NOT_A_NUMBER = "NOT_A_NUMBER".asInstanceOf[typings.twilio.twilioStrings.NOT_A_NUMBER]
    
    inline def TOO_LONG: typings.twilio.twilioStrings.TOO_LONG = "TOO_LONG".asInstanceOf[typings.twilio.twilioStrings.TOO_LONG]
    
    inline def TOO_SHORT: typings.twilio.twilioStrings.TOO_SHORT = "TOO_SHORT".asInstanceOf[typings.twilio.twilioStrings.TOO_SHORT]
  }
}
