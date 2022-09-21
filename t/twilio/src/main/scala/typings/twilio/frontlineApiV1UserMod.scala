package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.active_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object frontlineApiV1UserMod {
  
  @JSImport("twilio/lib/rest/frontlineApi/v1/user", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/frontlineApi/v1/user", "UserContext")
  @js.native
  open class UserContext protected () extends StObject {
    /**
      * Initialize the UserContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param sid - The SID of the User resource to fetch
      */
    def this(version: typings.twilio.frontlineApiV1Mod.^, sid: String) = this()
    
    /**
      * fetch a UserInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[UserInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ UserInstance, Any]): js.Promise[UserInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a UserInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[UserInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ UserInstance, Any]): js.Promise[UserInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ UserInstance, Any]): js.Promise[UserInstance] = js.native
    def update(opts: UserInstanceUpdateOptions): js.Promise[UserInstance] = js.native
    def update(
      opts: UserInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ UserInstance, Any]
    ): js.Promise[UserInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/frontlineApi/v1/user", "UserInstance")
  @js.native
  open class UserInstance protected () extends SerializableClass {
    /**
      * Initialize the UserContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The SID of the User resource to fetch
      */
    def this(version: typings.twilio.frontlineApiV1Mod.^, payload: UserPayload, sid: String) = this()
    
    /* private */ var _proxy: UserContext = js.native
    
    var avatar: String = js.native
    
    /**
      * fetch a UserInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[UserInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[UserInstance] = js.native
    
    var friendlyName: String = js.native
    
    var identity: String = js.native
    
    var isAvailable: Boolean = js.native
    
    var sid: String = js.native
    
    var state: UserStateType = js.native
    
    /**
      * update a UserInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[UserInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[UserInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[UserInstance] = js.native
    def update(opts: UserInstanceUpdateOptions): js.Promise[UserInstance] = js.native
    def update(
      opts: UserInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[UserInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the UserList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    */
  inline def UserList(version: typings.twilio.frontlineApiV1Mod.^): UserListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("UserList")(version.asInstanceOf[js.Any]).asInstanceOf[UserListInstance]
  
  @JSImport("twilio/lib/rest/frontlineApi/v1/user", "UserPage")
  @js.native
  open class UserPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.frontlineApiV1Mod.^, UserPayload, UserResource, UserInstance] {
    /**
      * Initialize the UserPage
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.frontlineApiV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: UserSolution
    ) = this()
    
    /**
      * Build an instance of UserInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: UserPayload): UserInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property avatar - The avatar URL which will be shown in Frontline application
    * @property friendlyName - The string that you assigned to describe the User
    * @property isAvailable - Whether the User is available for new conversations
    * @property state - Current state of this user
    */
  trait UserInstanceUpdateOptions extends StObject {
    
    var avatar: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var isAvailable: js.UndefOr[Boolean] = js.undefined
    
    var state: js.UndefOr[UserStateType] = js.undefined
  }
  object UserInstanceUpdateOptions {
    
    inline def apply(): UserInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserInstanceUpdateOptions]
    }
    
    extension [Self <: UserInstanceUpdateOptions](x: Self) {
      
      inline def setAvatar(value: String): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setIsAvailable(value: Boolean): Self = StObject.set(x, "isAvailable", value.asInstanceOf[js.Any])
      
      inline def setIsAvailableUndefined: Self = StObject.set(x, "isAvailable", js.undefined)
      
      inline def setState(value: UserStateType): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  @js.native
  trait UserListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): UserContext = js.native
    
    /**
      * Constructs a user
      *
      * @param sid - The SID of the User resource to fetch
      */
    def get(sid: String): UserContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait UserPayload
    extends StObject
       with UserResource
       with TwilioResponsePayload
  object UserPayload {
    
    inline def apply(
      avatar: String,
      first_page_uri: String,
      friendly_name: String,
      identity: String,
      is_available: Boolean,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      state: UserStateType,
      uri: String,
      url: String
    ): UserPayload = {
      val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], is_available = is_available.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserPayload]
    }
  }
  
  trait UserResource extends StObject {
    
    var avatar: String
    
    var friendly_name: String
    
    var identity: String
    
    var is_available: Boolean
    
    var sid: String
    
    var state: UserStateType
    
    var url: String
  }
  object UserResource {
    
    inline def apply(
      avatar: String,
      friendly_name: String,
      identity: String,
      is_available: Boolean,
      sid: String,
      state: UserStateType,
      url: String
    ): UserResource = {
      val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], is_available = is_available.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserResource]
    }
    
    extension [Self <: UserResource](x: Self) {
      
      inline def setAvatar(value: String): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIs_available(value: Boolean): Self = StObject.set(x, "is_available", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setState(value: UserStateType): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserSolution extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.active_
    - typings.twilio.twilioStrings.deactivated
  */
  trait UserStateType extends StObject
  object UserStateType {
    
    inline def active: active_ = "active".asInstanceOf[active_]
    
    inline def deactivated: typings.twilio.twilioStrings.deactivated = "deactivated".asInstanceOf[typings.twilio.twilioStrings.deactivated]
  }
}
