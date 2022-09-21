package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routesV2PhoneNumberMod {
  
  @JSImport("twilio/lib/rest/routes/v2/phoneNumber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/routes/v2/phoneNumber", "PhoneNumberContext")
  @js.native
  open class PhoneNumberContext protected () extends StObject {
    /**
      * Initialize the PhoneNumberContext
      *
      * @param version - Version of the resource
      * @param phoneNumber - The phone number
      */
    def this(version: typings.twilio.routesV2Mod.^, phoneNumber: String) = this()
    
    /**
      * fetch a PhoneNumberInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[PhoneNumberInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ PhoneNumberInstance, Any]): js.Promise[PhoneNumberInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a PhoneNumberInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[PhoneNumberInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ PhoneNumberInstance, Any]): js.Promise[PhoneNumberInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ PhoneNumberInstance, Any]
    ): js.Promise[PhoneNumberInstance] = js.native
    def update(opts: PhoneNumberInstanceUpdateOptions): js.Promise[PhoneNumberInstance] = js.native
    def update(
      opts: PhoneNumberInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ PhoneNumberInstance, Any]
    ): js.Promise[PhoneNumberInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/routes/v2/phoneNumber", "PhoneNumberInstance")
  @js.native
  open class PhoneNumberInstance protected () extends SerializableClass {
    /**
      * Initialize the PhoneNumberContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param phoneNumber - The phone number
      */
    def this(version: typings.twilio.routesV2Mod.^, payload: PhoneNumberPayload, phoneNumber: String) = this()
    
    /* private */ var _proxy: PhoneNumberContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a PhoneNumberInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[PhoneNumberInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[PhoneNumberInstance] = js.native
    
    var friendlyName: String = js.native
    
    var phoneNumber: String = js.native
    
    var sid: String = js.native
    
    /**
      * update a PhoneNumberInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[PhoneNumberInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[PhoneNumberInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[PhoneNumberInstance] = js.native
    def update(opts: PhoneNumberInstanceUpdateOptions): js.Promise[PhoneNumberInstance] = js.native
    def update(
      opts: PhoneNumberInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[PhoneNumberInstance] = js.native
    
    var url: String = js.native
    
    var voiceRegion: String = js.native
  }
  
  /**
    * Initialize the PhoneNumberList
    *
    * @param version - Version of the resource
    */
  inline def PhoneNumberList(version: typings.twilio.routesV2Mod.^): PhoneNumberListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("PhoneNumberList")(version.asInstanceOf[js.Any]).asInstanceOf[PhoneNumberListInstance]
  
  @JSImport("twilio/lib/rest/routes/v2/phoneNumber", "PhoneNumberPage")
  @js.native
  open class PhoneNumberPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.routesV2Mod.^, 
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
      version: typings.twilio.routesV2Mod.^,
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
    * Options to pass to update
    *
    * @property friendlyName - A human readable description of this resource.
    * @property voiceRegion - The Inbound Processing Region used for this phone number for voice
    */
  trait PhoneNumberInstanceUpdateOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var voiceRegion: js.UndefOr[String] = js.undefined
  }
  object PhoneNumberInstanceUpdateOptions {
    
    inline def apply(): PhoneNumberInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PhoneNumberInstanceUpdateOptions]
    }
    
    extension [Self <: PhoneNumberInstanceUpdateOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setVoiceRegion(value: String): Self = StObject.set(x, "voiceRegion", value.asInstanceOf[js.Any])
      
      inline def setVoiceRegionUndefined: Self = StObject.set(x, "voiceRegion", js.undefined)
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
      * @param phoneNumber - The phone number
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
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      friendly_name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      phone_number: String,
      previous_page_uri: String,
      sid: String,
      uri: String,
      url: String,
      voice_region: String
    ): PhoneNumberPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], voice_region = voice_region.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhoneNumberPayload]
    }
  }
  
  trait PhoneNumberResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var phone_number: String
    
    var sid: String
    
    var url: String
    
    var voice_region: String
  }
  object PhoneNumberResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      phone_number: String,
      sid: String,
      url: String,
      voice_region: String
    ): PhoneNumberResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], voice_region = voice_region.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhoneNumberResource]
    }
    
    extension [Self <: PhoneNumberResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVoice_region(value: String): Self = StObject.set(x, "voice_region", value.asInstanceOf[js.Any])
    }
  }
  
  trait PhoneNumberSolution extends StObject
}
