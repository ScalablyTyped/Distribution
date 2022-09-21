package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object phoneNumberMod {
  
  @JSImport("twilio/lib/rest/lookups/v1/phoneNumber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/lookups/v1/phoneNumber", "PhoneNumberContext")
  @js.native
  open class PhoneNumberContext protected () extends StObject {
    /**
      * Initialize the PhoneNumberContext
      *
      * @param version - Version of the resource
      * @param phoneNumber - The phone number to fetch in E.164 format
      */
    def this(version: typings.twilio.lookupsV1Mod.^, phoneNumber: String) = this()
    
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
  
  @JSImport("twilio/lib/rest/lookups/v1/phoneNumber", "PhoneNumberInstance")
  @js.native
  open class PhoneNumberInstance protected () extends SerializableClass {
    /**
      * Initialize the PhoneNumberContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param phoneNumber - The phone number to fetch in E.164 format
      */
    def this(version: typings.twilio.lookupsV1Mod.^, payload: PhoneNumberPayload, phoneNumber: String) = this()
    
    /* private */ var _proxy: PhoneNumberContext = js.native
    
    var addOns: Any = js.native
    
    var callerName: Any = js.native
    
    var carrier: Any = js.native
    
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
    
    var nationalFormat: String = js.native
    
    var phoneNumber: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the PhoneNumberList
    *
    * @param version - Version of the resource
    */
  inline def PhoneNumberList(version: typings.twilio.lookupsV1Mod.^): PhoneNumberListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("PhoneNumberList")(version.asInstanceOf[js.Any]).asInstanceOf[PhoneNumberListInstance]
  
  @JSImport("twilio/lib/rest/lookups/v1/phoneNumber", "PhoneNumberPage")
  @js.native
  open class PhoneNumberPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.lookupsV1Mod.^, 
          PhoneNumberPayload, 
          PhoneNumberResource, 
          PhoneNumberInstance
        ] {
    /**
      * Initialize the PhoneNumberPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.lookupsV1Mod.^,
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
    * @property addOns - The unique_name of an Add-on you would like to invoke
    * @property addOnsData - Data specific to the add-on you would like to invoke
    * @property countryCode - The ISO country code of the phone number
    * @property type - The type of information to return
    */
  trait PhoneNumberInstanceFetchOptions extends StObject {
    
    var addOns: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var addOnsData: js.UndefOr[js.Object] = js.undefined
    
    var countryCode: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object PhoneNumberInstanceFetchOptions {
    
    inline def apply(): PhoneNumberInstanceFetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PhoneNumberInstanceFetchOptions]
    }
    
    extension [Self <: PhoneNumberInstanceFetchOptions](x: Self) {
      
      inline def setAddOns(value: String | js.Array[String]): Self = StObject.set(x, "addOns", value.asInstanceOf[js.Any])
      
      inline def setAddOnsData(value: js.Object): Self = StObject.set(x, "addOnsData", value.asInstanceOf[js.Any])
      
      inline def setAddOnsDataUndefined: Self = StObject.set(x, "addOnsData", js.undefined)
      
      inline def setAddOnsUndefined: Self = StObject.set(x, "addOns", js.undefined)
      
      inline def setAddOnsVarargs(value: String*): Self = StObject.set(x, "addOns", js.Array(value*))
      
      inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
      
      inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
      
      inline def setType(value: String | js.Array[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value*))
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
      * @param phoneNumber - The phone number to fetch in E.164 format
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
      add_ons: js.Object,
      caller_name: js.Object,
      carrier: js.Object,
      country_code: String,
      first_page_uri: String,
      national_format: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      phone_number: String,
      previous_page_uri: String,
      uri: String,
      url: String
    ): PhoneNumberPayload = {
      val __obj = js.Dynamic.literal(add_ons = add_ons.asInstanceOf[js.Any], caller_name = caller_name.asInstanceOf[js.Any], carrier = carrier.asInstanceOf[js.Any], country_code = country_code.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], national_format = national_format.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhoneNumberPayload]
    }
  }
  
  trait PhoneNumberResource extends StObject {
    
    var add_ons: js.Object
    
    var caller_name: js.Object
    
    var carrier: js.Object
    
    var country_code: String
    
    var national_format: String
    
    var phone_number: String
    
    var url: String
  }
  object PhoneNumberResource {
    
    inline def apply(
      add_ons: js.Object,
      caller_name: js.Object,
      carrier: js.Object,
      country_code: String,
      national_format: String,
      phone_number: String,
      url: String
    ): PhoneNumberResource = {
      val __obj = js.Dynamic.literal(add_ons = add_ons.asInstanceOf[js.Any], caller_name = caller_name.asInstanceOf[js.Any], carrier = carrier.asInstanceOf[js.Any], country_code = country_code.asInstanceOf[js.Any], national_format = national_format.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhoneNumberResource]
    }
    
    extension [Self <: PhoneNumberResource](x: Self) {
      
      inline def setAdd_ons(value: js.Object): Self = StObject.set(x, "add_ons", value.asInstanceOf[js.Any])
      
      inline def setCaller_name(value: js.Object): Self = StObject.set(x, "caller_name", value.asInstanceOf[js.Any])
      
      inline def setCarrier(value: js.Object): Self = StObject.set(x, "carrier", value.asInstanceOf[js.Any])
      
      inline def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
      
      inline def setNational_format(value: String): Self = StObject.set(x, "national_format", value.asInstanceOf[js.Any])
      
      inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
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
}
