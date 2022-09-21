package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingsMod {
  
  @JSImport("twilio/lib/rest/voice/v1/dialingPermissions/settings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/voice/v1/dialingPermissions/settings", "SettingsContext")
  @js.native
  open class SettingsContext protected () extends StObject {
    /**
      * Initialize the SettingsContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      */
    def this(version: typings.twilio.voiceV1Mod.^) = this()
    
    /**
      * fetch a SettingsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SettingsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ SettingsInstance, Any]): js.Promise[SettingsInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a SettingsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[SettingsInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ SettingsInstance, Any]): js.Promise[SettingsInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ SettingsInstance, Any]): js.Promise[SettingsInstance] = js.native
    def update(opts: SettingsInstanceUpdateOptions): js.Promise[SettingsInstance] = js.native
    def update(
      opts: SettingsInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SettingsInstance, Any]
    ): js.Promise[SettingsInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/voice/v1/dialingPermissions/settings", "SettingsInstance")
  @js.native
  open class SettingsInstance protected () extends SerializableClass {
    /**
      * Initialize the SettingsContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      */
    def this(version: typings.twilio.voiceV1Mod.^, payload: SettingsPayload) = this()
    
    /* private */ var _proxy: SettingsContext = js.native
    
    var dialingPermissionsInheritance: Boolean = js.native
    
    /**
      * fetch a SettingsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SettingsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SettingsInstance] = js.native
    
    /**
      * update a SettingsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[SettingsInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SettingsInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SettingsInstance] = js.native
    def update(opts: SettingsInstanceUpdateOptions): js.Promise[SettingsInstance] = js.native
    def update(
      opts: SettingsInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[SettingsInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the SettingsList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    */
  inline def SettingsList(version: typings.twilio.voiceV1Mod.^): SettingsListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("SettingsList")(version.asInstanceOf[js.Any]).asInstanceOf[SettingsListInstance]
  
  @JSImport("twilio/lib/rest/voice/v1/dialingPermissions/settings", "SettingsPage")
  @js.native
  open class SettingsPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.voiceV1Mod.^, SettingsPayload, SettingsResource, SettingsInstance] {
    /**
      * Initialize the SettingsPage
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
      version: typings.twilio.voiceV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: SettingsSolution
    ) = this()
    
    /**
      * Build an instance of SettingsInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SettingsPayload): SettingsInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property dialingPermissionsInheritance - `true` for the sub-account to inherit voice dialing permissions from the Master Project; otherwise `false`
    */
  trait SettingsInstanceUpdateOptions extends StObject {
    
    var dialingPermissionsInheritance: js.UndefOr[Boolean] = js.undefined
  }
  object SettingsInstanceUpdateOptions {
    
    inline def apply(): SettingsInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SettingsInstanceUpdateOptions]
    }
    
    extension [Self <: SettingsInstanceUpdateOptions](x: Self) {
      
      inline def setDialingPermissionsInheritance(value: Boolean): Self = StObject.set(x, "dialingPermissionsInheritance", value.asInstanceOf[js.Any])
      
      inline def setDialingPermissionsInheritanceUndefined: Self = StObject.set(x, "dialingPermissionsInheritance", js.undefined)
    }
  }
  
  @js.native
  trait SettingsListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): SettingsContext = js.native
    
    /**
      * Constructs a settings
      */
    def get(): SettingsContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait SettingsPayload
    extends StObject
       with SettingsResource
       with TwilioResponsePayload
  object SettingsPayload {
    
    inline def apply(
      dialing_permissions_inheritance: Boolean,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String,
      url: String
    ): SettingsPayload = {
      val __obj = js.Dynamic.literal(dialing_permissions_inheritance = dialing_permissions_inheritance.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SettingsPayload]
    }
  }
  
  trait SettingsResource extends StObject {
    
    var dialing_permissions_inheritance: Boolean
    
    var url: String
  }
  object SettingsResource {
    
    inline def apply(dialing_permissions_inheritance: Boolean, url: String): SettingsResource = {
      val __obj = js.Dynamic.literal(dialing_permissions_inheritance = dialing_permissions_inheritance.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SettingsResource]
    }
    
    extension [Self <: SettingsResource](x: Self) {
      
      inline def setDialing_permissions_inheritance(value: Boolean): Self = StObject.set(x, "dialing_permissions_inheritance", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait SettingsSolution extends StObject
}
