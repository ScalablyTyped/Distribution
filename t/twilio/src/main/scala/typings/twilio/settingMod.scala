package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingMod {
  
  @JSImport("twilio/lib/rest/insights/v1/setting", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/insights/v1/setting", "SettingContext")
  @js.native
  open class SettingContext protected () extends StObject {
    /**
      * Initialize the SettingContext
      *
      * @param version - Version of the resource
      */
    def this(version: typings.twilio.insightsV1Mod.^) = this()
    
    /**
      * fetch a SettingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SettingInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ SettingInstance, Any]): js.Promise[SettingInstance] = js.native
    def fetch(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ SettingInstance, Any]): js.Promise[SettingInstance] = js.native
    def fetch(opts: SettingInstanceFetchOptions): js.Promise[SettingInstance] = js.native
    def fetch(
      opts: SettingInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SettingInstance, Any]
    ): js.Promise[SettingInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a SettingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[SettingInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ SettingInstance, Any]): js.Promise[SettingInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ SettingInstance, Any]): js.Promise[SettingInstance] = js.native
    def update(opts: SettingInstanceUpdateOptions): js.Promise[SettingInstance] = js.native
    def update(
      opts: SettingInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SettingInstance, Any]
    ): js.Promise[SettingInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/insights/v1/setting", "SettingInstance")
  @js.native
  open class SettingInstance protected () extends SerializableClass {
    /**
      * Initialize the SettingContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      */
    def this(version: typings.twilio.insightsV1Mod.^, payload: SettingPayload) = this()
    
    /* private */ var _proxy: SettingContext = js.native
    
    var accountSid: String = js.native
    
    var advancedFeatures: Boolean = js.native
    
    /**
      * fetch a SettingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SettingInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SettingInstance] = js.native
    def fetch(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SettingInstance] = js.native
    def fetch(opts: SettingInstanceFetchOptions): js.Promise[SettingInstance] = js.native
    def fetch(
      opts: SettingInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[SettingInstance] = js.native
    
    /**
      * update a SettingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[SettingInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SettingInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SettingInstance] = js.native
    def update(opts: SettingInstanceUpdateOptions): js.Promise[SettingInstance] = js.native
    def update(
      opts: SettingInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[SettingInstance] = js.native
    
    var url: String = js.native
    
    var voiceTrace: Boolean = js.native
  }
  
  /**
    * Initialize the SettingList
    *
    * @param version - Version of the resource
    */
  inline def SettingList(version: typings.twilio.insightsV1Mod.^): SettingListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("SettingList")(version.asInstanceOf[js.Any]).asInstanceOf[SettingListInstance]
  
  @JSImport("twilio/lib/rest/insights/v1/setting", "SettingPage")
  @js.native
  open class SettingPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.insightsV1Mod.^, SettingPayload, SettingResource, SettingInstance] {
    /**
      * Initialize the SettingPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.insightsV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: SettingSolution
    ) = this()
    
    /**
      * Build an instance of SettingInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SettingPayload): SettingInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to fetch
    *
    * @property subaccountSid - The subaccount_sid
    */
  trait SettingInstanceFetchOptions extends StObject {
    
    var subaccountSid: js.UndefOr[String] = js.undefined
  }
  object SettingInstanceFetchOptions {
    
    inline def apply(): SettingInstanceFetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SettingInstanceFetchOptions]
    }
    
    extension [Self <: SettingInstanceFetchOptions](x: Self) {
      
      inline def setSubaccountSid(value: String): Self = StObject.set(x, "subaccountSid", value.asInstanceOf[js.Any])
      
      inline def setSubaccountSidUndefined: Self = StObject.set(x, "subaccountSid", js.undefined)
    }
  }
  
  /**
    * Options to pass to update
    *
    * @property advancedFeatures - The advanced_features
    * @property subaccountSid - The subaccount_sid
    * @property voiceTrace - The voice_trace
    */
  trait SettingInstanceUpdateOptions extends StObject {
    
    var advancedFeatures: js.UndefOr[Boolean] = js.undefined
    
    var subaccountSid: js.UndefOr[String] = js.undefined
    
    var voiceTrace: js.UndefOr[Boolean] = js.undefined
  }
  object SettingInstanceUpdateOptions {
    
    inline def apply(): SettingInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SettingInstanceUpdateOptions]
    }
    
    extension [Self <: SettingInstanceUpdateOptions](x: Self) {
      
      inline def setAdvancedFeatures(value: Boolean): Self = StObject.set(x, "advancedFeatures", value.asInstanceOf[js.Any])
      
      inline def setAdvancedFeaturesUndefined: Self = StObject.set(x, "advancedFeatures", js.undefined)
      
      inline def setSubaccountSid(value: String): Self = StObject.set(x, "subaccountSid", value.asInstanceOf[js.Any])
      
      inline def setSubaccountSidUndefined: Self = StObject.set(x, "subaccountSid", js.undefined)
      
      inline def setVoiceTrace(value: Boolean): Self = StObject.set(x, "voiceTrace", value.asInstanceOf[js.Any])
      
      inline def setVoiceTraceUndefined: Self = StObject.set(x, "voiceTrace", js.undefined)
    }
  }
  
  @js.native
  trait SettingListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): SettingContext = js.native
    
    /**
      * Constructs a setting
      */
    def get(): SettingContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait SettingPayload
    extends StObject
       with SettingResource
       with TwilioResponsePayload
  object SettingPayload {
    
    inline def apply(
      account_sid: String,
      advanced_features: Boolean,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String,
      url: String,
      voice_trace: Boolean
    ): SettingPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], advanced_features = advanced_features.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], voice_trace = voice_trace.asInstanceOf[js.Any])
      __obj.asInstanceOf[SettingPayload]
    }
  }
  
  trait SettingResource extends StObject {
    
    var account_sid: String
    
    var advanced_features: Boolean
    
    var url: String
    
    var voice_trace: Boolean
  }
  object SettingResource {
    
    inline def apply(account_sid: String, advanced_features: Boolean, url: String, voice_trace: Boolean): SettingResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], advanced_features = advanced_features.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], voice_trace = voice_trace.asInstanceOf[js.Any])
      __obj.asInstanceOf[SettingResource]
    }
    
    extension [Self <: SettingResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAdvanced_features(value: Boolean): Self = StObject.set(x, "advanced_features", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVoice_trace(value: Boolean): Self = StObject.set(x, "voice_trace", value.asInstanceOf[js.Any])
    }
  }
  
  trait SettingSolution extends StObject
}
