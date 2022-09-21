package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v2SipDomainMod {
  
  @JSImport("twilio/lib/rest/routes/v2/sipDomain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/routes/v2/sipDomain", "SipDomainContext")
  @js.native
  open class SipDomainContext protected () extends StObject {
    /**
      * Initialize the SipDomainContext
      *
      * @param version - Version of the resource
      * @param sipDomain - The sip_domain
      */
    def this(version: typings.twilio.routesV2Mod.^, sipDomain: String) = this()
    
    /**
      * fetch a SipDomainInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SipDomainInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ SipDomainInstance, Any]): js.Promise[SipDomainInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a SipDomainInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[SipDomainInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ SipDomainInstance, Any]): js.Promise[SipDomainInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SipDomainInstance, Any]
    ): js.Promise[SipDomainInstance] = js.native
    def update(opts: SipDomainInstanceUpdateOptions): js.Promise[SipDomainInstance] = js.native
    def update(
      opts: SipDomainInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SipDomainInstance, Any]
    ): js.Promise[SipDomainInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/routes/v2/sipDomain", "SipDomainInstance")
  @js.native
  open class SipDomainInstance protected () extends SerializableClass {
    /**
      * Initialize the SipDomainContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sipDomain - The sip_domain
      */
    def this(version: typings.twilio.routesV2Mod.^, payload: SipDomainPayload, sipDomain: String) = this()
    
    /* private */ var _proxy: SipDomainContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a SipDomainInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SipDomainInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SipDomainInstance] = js.native
    
    var friendlyName: String = js.native
    
    var sid: String = js.native
    
    var sipDomain: String = js.native
    
    /**
      * update a SipDomainInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[SipDomainInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SipDomainInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SipDomainInstance] = js.native
    def update(opts: SipDomainInstanceUpdateOptions): js.Promise[SipDomainInstance] = js.native
    def update(
      opts: SipDomainInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[SipDomainInstance] = js.native
    
    var url: String = js.native
    
    var voiceRegion: String = js.native
  }
  
  /**
    * Initialize the SipDomainList
    *
    * @param version - Version of the resource
    */
  inline def SipDomainList(version: typings.twilio.routesV2Mod.^): SipDomainListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("SipDomainList")(version.asInstanceOf[js.Any]).asInstanceOf[SipDomainListInstance]
  
  @JSImport("twilio/lib/rest/routes/v2/sipDomain", "SipDomainPage")
  @js.native
  open class SipDomainPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.routesV2Mod.^, SipDomainPayload, SipDomainResource, SipDomainInstance] {
    /**
      * Initialize the SipDomainPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.routesV2Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: SipDomainSolution
    ) = this()
    
    /**
      * Build an instance of SipDomainInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SipDomainPayload): SipDomainInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property friendlyName - The friendly_name
    * @property voiceRegion - The voice_region
    */
  trait SipDomainInstanceUpdateOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var voiceRegion: js.UndefOr[String] = js.undefined
  }
  object SipDomainInstanceUpdateOptions {
    
    inline def apply(): SipDomainInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SipDomainInstanceUpdateOptions]
    }
    
    extension [Self <: SipDomainInstanceUpdateOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setVoiceRegion(value: String): Self = StObject.set(x, "voiceRegion", value.asInstanceOf[js.Any])
      
      inline def setVoiceRegionUndefined: Self = StObject.set(x, "voiceRegion", js.undefined)
    }
  }
  
  @js.native
  trait SipDomainListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): SipDomainContext = js.native
    
    /**
      * Constructs a sip_domain
      *
      * @param sipDomain - The sip_domain
      */
    def get(sipDomain: String): SipDomainContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait SipDomainPayload
    extends StObject
       with SipDomainResource
       with TwilioResponsePayload
  object SipDomainPayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      friendly_name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      sip_domain: String,
      uri: String,
      url: String,
      voice_region: String
    ): SipDomainPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sip_domain = sip_domain.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], voice_region = voice_region.asInstanceOf[js.Any])
      __obj.asInstanceOf[SipDomainPayload]
    }
  }
  
  trait SipDomainResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var sid: String
    
    var sip_domain: String
    
    var url: String
    
    var voice_region: String
  }
  object SipDomainResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      sid: String,
      sip_domain: String,
      url: String,
      voice_region: String
    ): SipDomainResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sip_domain = sip_domain.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], voice_region = voice_region.asInstanceOf[js.Any])
      __obj.asInstanceOf[SipDomainResource]
    }
    
    extension [Self <: SipDomainResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSip_domain(value: String): Self = StObject.set(x, "sip_domain", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVoice_region(value: String): Self = StObject.set(x, "voice_region", value.asInstanceOf[js.Any])
    }
  }
  
  trait SipDomainSolution extends StObject
}
