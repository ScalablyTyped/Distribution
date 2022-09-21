package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trunkMod {
  
  @JSImport("twilio/lib/rest/routes/v2/trunk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/routes/v2/trunk", "TrunkContext")
  @js.native
  open class TrunkContext protected () extends StObject {
    /**
      * Initialize the TrunkContext
      *
      * @param version - Version of the resource
      * @param sipTrunkDomain - The SIP Trunk
      */
    def this(version: typings.twilio.routesV2Mod.^, sipTrunkDomain: String) = this()
    
    /**
      * fetch a TrunkInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[TrunkInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ TrunkInstance, Any]): js.Promise[TrunkInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a TrunkInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[TrunkInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ TrunkInstance, Any]): js.Promise[TrunkInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ TrunkInstance, Any]): js.Promise[TrunkInstance] = js.native
    def update(opts: TrunkInstanceUpdateOptions): js.Promise[TrunkInstance] = js.native
    def update(
      opts: TrunkInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TrunkInstance, Any]
    ): js.Promise[TrunkInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/routes/v2/trunk", "TrunkInstance")
  @js.native
  open class TrunkInstance protected () extends SerializableClass {
    /**
      * Initialize the TrunkContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sipTrunkDomain - The SIP Trunk
      */
    def this(version: typings.twilio.routesV2Mod.^, payload: TrunkPayload, sipTrunkDomain: String) = this()
    
    /* private */ var _proxy: TrunkContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a TrunkInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[TrunkInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TrunkInstance] = js.native
    
    var friendlyName: String = js.native
    
    var sid: String = js.native
    
    var sipTrunkDomain: String = js.native
    
    /**
      * update a TrunkInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[TrunkInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TrunkInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TrunkInstance] = js.native
    def update(opts: TrunkInstanceUpdateOptions): js.Promise[TrunkInstance] = js.native
    def update(
      opts: TrunkInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[TrunkInstance] = js.native
    
    var url: String = js.native
    
    var voiceRegion: String = js.native
  }
  
  /**
    * Initialize the TrunkList
    *
    * @param version - Version of the resource
    */
  inline def TrunkList(version: typings.twilio.routesV2Mod.^): TrunkListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("TrunkList")(version.asInstanceOf[js.Any]).asInstanceOf[TrunkListInstance]
  
  @JSImport("twilio/lib/rest/routes/v2/trunk", "TrunkPage")
  @js.native
  open class TrunkPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.routesV2Mod.^, TrunkPayload, TrunkResource, TrunkInstance] {
    /**
      * Initialize the TrunkPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.routesV2Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: TrunkSolution
    ) = this()
    
    /**
      * Build an instance of TrunkInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: TrunkPayload): TrunkInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property friendlyName - A human readable description of this resource.
    * @property voiceRegion - The Inbound Processing Region used for this SIP Trunk for voice
    */
  trait TrunkInstanceUpdateOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var voiceRegion: js.UndefOr[String] = js.undefined
  }
  object TrunkInstanceUpdateOptions {
    
    inline def apply(): TrunkInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrunkInstanceUpdateOptions]
    }
    
    extension [Self <: TrunkInstanceUpdateOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setVoiceRegion(value: String): Self = StObject.set(x, "voiceRegion", value.asInstanceOf[js.Any])
      
      inline def setVoiceRegionUndefined: Self = StObject.set(x, "voiceRegion", js.undefined)
    }
  }
  
  @js.native
  trait TrunkListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): TrunkContext = js.native
    
    /**
      * Constructs a trunk
      *
      * @param sipTrunkDomain - The SIP Trunk
      */
    def get(sipTrunkDomain: String): TrunkContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait TrunkPayload
    extends StObject
       with TrunkResource
       with TwilioResponsePayload
  object TrunkPayload {
    
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
      sip_trunk_domain: String,
      uri: String,
      url: String,
      voice_region: String
    ): TrunkPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sip_trunk_domain = sip_trunk_domain.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], voice_region = voice_region.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrunkPayload]
    }
  }
  
  trait TrunkResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var sid: String
    
    var sip_trunk_domain: String
    
    var url: String
    
    var voice_region: String
  }
  object TrunkResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      sid: String,
      sip_trunk_domain: String,
      url: String,
      voice_region: String
    ): TrunkResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sip_trunk_domain = sip_trunk_domain.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], voice_region = voice_region.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrunkResource]
    }
    
    extension [Self <: TrunkResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSip_trunk_domain(value: String): Self = StObject.set(x, "sip_trunk_domain", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVoice_region(value: String): Self = StObject.set(x, "voice_region", value.asInstanceOf[js.Any])
    }
  }
  
  trait TrunkSolution extends StObject
}
