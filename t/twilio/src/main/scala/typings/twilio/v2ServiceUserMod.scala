package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.userUserBindingMod.UserBindingContext
import typings.twilio.userUserBindingMod.UserBindingListInstance
import typings.twilio.v2ServiceUserUserChannelMod.UserChannelContext
import typings.twilio.v2ServiceUserUserChannelMod.UserChannelListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v2ServiceUserMod {
  
  @JSImport("twilio/lib/rest/ipMessaging/v2/service/user", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/ipMessaging/v2/service/user", "UserContext")
  @js.native
  open class UserContext protected () extends StObject {
    /**
      * Initialize the UserContext
      *
      * @param version - Version of the resource
      * @param serviceSid - The service_sid
      * @param sid - The sid
      */
    def this(version: typings.twilio.ipMessagingV2Mod.^, serviceSid: String, sid: String) = this()
    
    /**
      * fetch a UserInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[UserInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ UserInstance, Any]): js.Promise[UserInstance] = js.native
    
    /**
      * remove a UserInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ UserInstance, Any]): js.Promise[Boolean] = js.native
    
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
    
    /**
      * @param sid - sid of instance
      */
    def userBindings(sid: String): UserBindingContext = js.native
    @JSName("userBindings")
    var userBindings_Original: UserBindingListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def userChannels(sid: String): UserChannelContext = js.native
    @JSName("userChannels")
    var userChannels_Original: UserChannelListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/ipMessaging/v2/service/user", "UserInstance")
  @js.native
  open class UserInstance protected () extends SerializableClass {
    /**
      * Initialize the UserContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - The service_sid
      * @param sid - The sid
      */
    def this(version: typings.twilio.ipMessagingV2Mod.^, payload: UserPayload, serviceSid: String, sid: String) = this()
    
    /* private */ var _proxy: UserContext = js.native
    
    var accountSid: String = js.native
    
    var attributes: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a UserInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[UserInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[UserInstance] = js.native
    
    var friendlyName: String = js.native
    
    var identity: String = js.native
    
    var isNotifiable: Boolean = js.native
    
    var isOnline: Boolean = js.native
    
    var joinedChannelsCount: Double = js.native
    
    var links: String = js.native
    
    /**
      * remove a UserInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var roleSid: String = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
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
    
    /**
      * Access the userBindings
      */
    def userBindings(): UserBindingListInstance = js.native
    
    /**
      * Access the userChannels
      */
    def userChannels(): UserChannelListInstance = js.native
  }
  
  /**
    * Initialize the UserList
    *
    * @param version - Version of the resource
    * @param serviceSid - The service_sid
    */
  inline def UserList(version: typings.twilio.ipMessagingV2Mod.^, serviceSid: String): UserListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("UserList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any])).asInstanceOf[UserListInstance]
  
  @JSImport("twilio/lib/rest/ipMessaging/v2/service/user", "UserPage")
  @js.native
  open class UserPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.ipMessagingV2Mod.^, UserPayload, UserResource, UserInstance] {
    /**
      * Initialize the UserPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.ipMessagingV2Mod.^,
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
    * @property attributes - The attributes
    * @property friendlyName - The friendly_name
    * @property roleSid - The role_sid
    * @property xTwilioWebhookEnabled - The X-Twilio-Webhook-Enabled HTTP request header
    */
  trait UserInstanceUpdateOptions extends StObject {
    
    var attributes: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var roleSid: js.UndefOr[String] = js.undefined
    
    var xTwilioWebhookEnabled: js.UndefOr[UserWebhookEnabledType] = js.undefined
  }
  object UserInstanceUpdateOptions {
    
    inline def apply(): UserInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserInstanceUpdateOptions]
    }
    
    extension [Self <: UserInstanceUpdateOptions](x: Self) {
      
      inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setRoleSid(value: String): Self = StObject.set(x, "roleSid", value.asInstanceOf[js.Any])
      
      inline def setRoleSidUndefined: Self = StObject.set(x, "roleSid", js.undefined)
      
      inline def setXTwilioWebhookEnabled(value: UserWebhookEnabledType): Self = StObject.set(x, "xTwilioWebhookEnabled", value.asInstanceOf[js.Any])
      
      inline def setXTwilioWebhookEnabledUndefined: Self = StObject.set(x, "xTwilioWebhookEnabled", js.undefined)
    }
  }
  
  @js.native
  trait UserListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): UserContext = js.native
    
    /**
      * create a UserInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: UserListInstanceCreateOptions): js.Promise[UserInstance] = js.native
    def create(
      opts: UserListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ UserInstance, Any]
    ): js.Promise[UserInstance] = js.native
    
    /**
      * Streams UserInstance records from the API.
      *
      * This operation lazily loads records as efficiently as possible until the limit
      * is reached.
      *
      * The results are passed into the callback function, so this operation is memory
      * efficient.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ UserInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ UserInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: UserListInstanceEachOptions): Unit = js.native
    def each(
      opts: UserListInstanceEachOptions,
      callback: js.Function2[
          /* item */ UserInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a user
      *
      * @param sid - The sid
      */
    def get(sid: String): UserContext = js.native
    
    /**
      * Retrieve a single target page of UserInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[UserPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ UserPage, Any]): js.Promise[UserPage] = js.native
    def getPage(targetUrl: String): js.Promise[UserPage] = js.native
    def getPage(targetUrl: String, callback: js.Function2[/* error */ js.Error | Null, /* items */ UserPage, Any]): js.Promise[UserPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ UserPage, Any]): js.Promise[UserPage] = js.native
    
    /**
      * Lists UserInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[UserInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[UserInstance], Any]): js.Promise[js.Array[UserInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[UserInstance], Any]
    ): js.Promise[js.Array[UserInstance]] = js.native
    def list(opts: UserListInstanceOptions): js.Promise[js.Array[UserInstance]] = js.native
    def list(
      opts: UserListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[UserInstance], Any]
    ): js.Promise[js.Array[UserInstance]] = js.native
    
    /**
      * Retrieve a single page of UserInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[UserPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ UserPage, Any]): js.Promise[UserPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ UserPage, Any]): js.Promise[UserPage] = js.native
    def page(opts: UserListInstancePageOptions): js.Promise[UserPage] = js.native
    def page(
      opts: UserListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ UserPage, Any]
    ): js.Promise[UserPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property attributes - The attributes
    * @property friendlyName - The friendly_name
    * @property identity - The identity
    * @property roleSid - The role_sid
    * @property xTwilioWebhookEnabled - The X-Twilio-Webhook-Enabled HTTP request header
    */
  trait UserListInstanceCreateOptions extends StObject {
    
    var attributes: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var identity: String
    
    var roleSid: js.UndefOr[String] = js.undefined
    
    var xTwilioWebhookEnabled: js.UndefOr[UserWebhookEnabledType] = js.undefined
  }
  object UserListInstanceCreateOptions {
    
    inline def apply(identity: String): UserListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserListInstanceCreateOptions]
    }
    
    extension [Self <: UserListInstanceCreateOptions](x: Self) {
      
      inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setRoleSid(value: String): Self = StObject.set(x, "roleSid", value.asInstanceOf[js.Any])
      
      inline def setRoleSidUndefined: Self = StObject.set(x, "roleSid", js.undefined)
      
      inline def setXTwilioWebhookEnabled(value: UserWebhookEnabledType): Self = StObject.set(x, "xTwilioWebhookEnabled", value.asInstanceOf[js.Any])
      
      inline def setXTwilioWebhookEnabledUndefined: Self = StObject.set(x, "xTwilioWebhookEnabled", js.undefined)
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         each() guarantees never to return more than limit.
    *                         Default is no limit
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no pageSize is defined but a limit is defined,
    *                         each() will attempt to read the limit with the most efficient
    *                         page size, i.e. min(limit, 1000)
    */
  trait UserListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ UserInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object UserListInstanceEachOptions {
    
    inline def apply(): UserListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserListInstanceEachOptions]
    }
    
    extension [Self <: UserListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ UserInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         list() guarantees never to return more than limit.
    *                         Default is no limit
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no page_size is defined but a limit is defined,
    *                         list() will attempt to read the limit with the most
    *                         efficient page size, i.e. min(limit, 1000)
    */
  trait UserListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object UserListInstanceOptions {
    
    inline def apply(): UserListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserListInstanceOptions]
    }
    
    extension [Self <: UserListInstanceOptions](x: Self) {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait UserListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object UserListInstancePageOptions {
    
    inline def apply(): UserListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserListInstancePageOptions]
    }
    
    extension [Self <: UserListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait UserPayload
    extends StObject
       with UserResource
       with TwilioResponsePayload
  object UserPayload {
    
    inline def apply(
      account_sid: String,
      attributes: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      friendly_name: String,
      identity: String,
      is_notifiable: Boolean,
      is_online: Boolean,
      joined_channels_count: Double,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      role_sid: String,
      service_sid: String,
      sid: String,
      uri: String,
      url: String
    ): UserPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], is_notifiable = is_notifiable.asInstanceOf[js.Any], is_online = is_online.asInstanceOf[js.Any], joined_channels_count = joined_channels_count.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], role_sid = role_sid.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserPayload]
    }
  }
  
  trait UserResource extends StObject {
    
    var account_sid: String
    
    var attributes: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var identity: String
    
    var is_notifiable: Boolean
    
    var is_online: Boolean
    
    var joined_channels_count: Double
    
    var links: String
    
    var role_sid: String
    
    var service_sid: String
    
    var sid: String
    
    var url: String
  }
  object UserResource {
    
    inline def apply(
      account_sid: String,
      attributes: String,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      identity: String,
      is_notifiable: Boolean,
      is_online: Boolean,
      joined_channels_count: Double,
      links: String,
      role_sid: String,
      service_sid: String,
      sid: String,
      url: String
    ): UserResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], is_notifiable = is_notifiable.asInstanceOf[js.Any], is_online = is_online.asInstanceOf[js.Any], joined_channels_count = joined_channels_count.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], role_sid = role_sid.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserResource]
    }
    
    extension [Self <: UserResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIs_notifiable(value: Boolean): Self = StObject.set(x, "is_notifiable", value.asInstanceOf[js.Any])
      
      inline def setIs_online(value: Boolean): Self = StObject.set(x, "is_online", value.asInstanceOf[js.Any])
      
      inline def setJoined_channels_count(value: Double): Self = StObject.set(x, "joined_channels_count", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setRole_sid(value: String): Self = StObject.set(x, "role_sid", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserSolution extends StObject {
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object UserSolution {
    
    inline def apply(): UserSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserSolution]
    }
    
    extension [Self <: UserSolution](x: Self) {
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.`true`
    - typings.twilio.twilioStrings.`false`
  */
  trait UserWebhookEnabledType extends StObject
  object UserWebhookEnabledType {
    
    inline def `false`: typings.twilio.twilioStrings.`false` = "false".asInstanceOf[typings.twilio.twilioStrings.`false`]
    
    inline def `true`: typings.twilio.twilioStrings.`true` = "true".asInstanceOf[typings.twilio.twilioStrings.`true`]
  }
}
