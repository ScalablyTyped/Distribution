package typings.twilio

import typings.twilio.anon.AddedToChannel
import typings.twilio.anon.ChannelMembers
import typings.twilio.anon.OnChannelAdd
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.ipMessagingV1ServiceRoleMod.RoleContext
import typings.twilio.ipMessagingV1ServiceRoleMod.RoleListInstance
import typings.twilio.ipMessagingV1ServiceUserMod.UserContext
import typings.twilio.ipMessagingV1ServiceUserMod.UserListInstance
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.v1ServiceChannelMod.ChannelContext
import typings.twilio.v1ServiceChannelMod.ChannelListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ipMessagingV1ServiceMod {
  
  @JSImport("twilio/lib/rest/ipMessaging/v1/service", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/ipMessaging/v1/service", "ServiceContext")
  @js.native
  open class ServiceContext protected () extends StObject {
    /**
      * Initialize the ServiceContext
      *
      * @param version - Version of the resource
      * @param sid - The sid
      */
    def this(version: typings.twilio.ipMessagingV1Mod.^, sid: String) = this()
    
    /**
      * @param sid - sid of instance
      */
    def channels(sid: String): ChannelContext = js.native
    @JSName("channels")
    var channels_Original: ChannelListInstance = js.native
    
    /**
      * fetch a ServiceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ServiceInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ ServiceInstance, Any]): js.Promise[ServiceInstance] = js.native
    
    /**
      * remove a ServiceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ ServiceInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def roles(sid: String): RoleContext = js.native
    @JSName("roles")
    var roles_Original: RoleListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a ServiceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ServiceInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ ServiceInstance, Any]): js.Promise[ServiceInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ ServiceInstance, Any]): js.Promise[ServiceInstance] = js.native
    def update(opts: ServiceInstanceUpdateOptions): js.Promise[ServiceInstance] = js.native
    def update(
      opts: ServiceInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ServiceInstance, Any]
    ): js.Promise[ServiceInstance] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def users(sid: String): UserContext = js.native
    @JSName("users")
    var users_Original: UserListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/ipMessaging/v1/service", "ServiceInstance")
  @js.native
  open class ServiceInstance protected () extends SerializableClass {
    /**
      * Initialize the ServiceContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The sid
      */
    def this(version: typings.twilio.ipMessagingV1Mod.^, payload: ServicePayload, sid: String) = this()
    
    /* private */ var _proxy: ServiceContext = js.native
    
    var accountSid: String = js.native
    
    /**
      * Access the channels
      */
    def channels(): ChannelListInstance = js.native
    
    var consumptionReportInterval: Double = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var defaultChannelCreatorRoleSid: String = js.native
    
    var defaultChannelRoleSid: String = js.native
    
    var defaultServiceRoleSid: String = js.native
    
    /**
      * fetch a ServiceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ServiceInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ServiceInstance] = js.native
    
    var friendlyName: String = js.native
    
    var limits: Any = js.native
    
    var links: String = js.native
    
    var notifications: Any = js.native
    
    var postWebhookUrl: String = js.native
    
    var preWebhookUrl: String = js.native
    
    var reachabilityEnabled: Boolean = js.native
    
    var readStatusEnabled: Boolean = js.native
    
    /**
      * remove a ServiceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Access the roles
      */
    def roles(): RoleListInstance = js.native
    
    var sid: String = js.native
    
    var typingIndicatorTimeout: Double = js.native
    
    /**
      * update a ServiceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ServiceInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ServiceInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ServiceInstance] = js.native
    def update(opts: ServiceInstanceUpdateOptions): js.Promise[ServiceInstance] = js.native
    def update(
      opts: ServiceInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[ServiceInstance] = js.native
    
    var url: String = js.native
    
    /**
      * Access the users
      */
    def users(): UserListInstance = js.native
    
    var webhookFilters: js.Array[String] = js.native
    
    var webhookMethod: String = js.native
    
    var webhooks: Any = js.native
  }
  
  /**
    * Initialize the ServiceList
    *
    * @param version - Version of the resource
    */
  inline def ServiceList(version: typings.twilio.ipMessagingV1Mod.^): ServiceListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("ServiceList")(version.asInstanceOf[js.Any]).asInstanceOf[ServiceListInstance]
  
  @JSImport("twilio/lib/rest/ipMessaging/v1/service", "ServicePage")
  @js.native
  open class ServicePage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.ipMessagingV1Mod.^, ServicePayload, ServiceResource, ServiceInstance] {
    /**
      * Initialize the ServicePage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.ipMessagingV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: ServiceSolution
    ) = this()
    
    /**
      * Build an instance of ServiceInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ServicePayload): ServiceInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property consumptionReportInterval - The consumption_report_interval
    * @property defaultChannelCreatorRoleSid - The default_channel_creator_role_sid
    * @property defaultChannelRoleSid - The default_channel_role_sid
    * @property defaultServiceRoleSid - The default_service_role_sid
    * @property friendlyName - The friendly_name
    * @property limits.channelMembers - The limits.channel_members
    * @property limits.userChannels - The limits.user_channels
    * @property notifications.addedToChannel.enabled - The notifications.added_to_channel.enabled
    * @property notifications.addedToChannel.template - The notifications.added_to_channel.template
    * @property notifications.invitedToChannel.enabled - The notifications.invited_to_channel.enabled
    * @property notifications.invitedToChannel.template - The notifications.invited_to_channel.template
    * @property notifications.newMessage.enabled - The notifications.new_message.enabled
    * @property notifications.newMessage.template - The notifications.new_message.template
    * @property notifications.removedFromChannel.enabled - The notifications.removed_from_channel.enabled
    * @property notifications.removedFromChannel.template - The notifications.removed_from_channel.template
    * @property postWebhookUrl - The post_webhook_url
    * @property preWebhookUrl - The pre_webhook_url
    * @property reachabilityEnabled - The reachability_enabled
    * @property readStatusEnabled - The read_status_enabled
    * @property typingIndicatorTimeout - The typing_indicator_timeout
    * @property webhookFilters - The webhook_filters
    * @property webhookMethod - The webhook_method
    * @property webhooks.onChannelAdd.method - The webhooks.on_channel_add.method
    * @property webhooks.onChannelAdd.url - The webhooks.on_channel_add.url
    * @property webhooks.onChannelAdded.method - The webhooks.on_channel_added.method
    * @property webhooks.onChannelAdded.url - The webhooks.on_channel_added.url
    * @property webhooks.onChannelDestroy.method - The webhooks.on_channel_destroy.method
    * @property webhooks.onChannelDestroy.url - The webhooks.on_channel_destroy.url
    * @property webhooks.onChannelDestroyed.method - The webhooks.on_channel_destroyed.method
    * @property webhooks.onChannelDestroyed.url - The webhooks.on_channel_destroyed.url
    * @property webhooks.onChannelUpdate.method - The webhooks.on_channel_update.method
    * @property webhooks.onChannelUpdate.url - The webhooks.on_channel_update.url
    * @property webhooks.onChannelUpdated.method - The webhooks.on_channel_updated.method
    * @property webhooks.onChannelUpdated.url - The webhooks.on_channel_updated.url
    * @property webhooks.onMemberAdd.method - The webhooks.on_member_add.method
    * @property webhooks.onMemberAdd.url - The webhooks.on_member_add.url
    * @property webhooks.onMemberAdded.method - The webhooks.on_member_added.method
    * @property webhooks.onMemberAdded.url - The webhooks.on_member_added.url
    * @property webhooks.onMemberRemove.method - The webhooks.on_member_remove.method
    * @property webhooks.onMemberRemove.url - The webhooks.on_member_remove.url
    * @property webhooks.onMemberRemoved.method - The webhooks.on_member_removed.method
    * @property webhooks.onMemberRemoved.url - The webhooks.on_member_removed.url
    * @property webhooks.onMessageRemove.method - The webhooks.on_message_remove.method
    * @property webhooks.onMessageRemove.url - The webhooks.on_message_remove.url
    * @property webhooks.onMessageRemoved.method - The webhooks.on_message_removed.method
    * @property webhooks.onMessageRemoved.url - The webhooks.on_message_removed.url
    * @property webhooks.onMessageSend.method - The webhooks.on_message_send.method
    * @property webhooks.onMessageSend.url - The webhooks.on_message_send.url
    * @property webhooks.onMessageSent.method - The webhooks.on_message_sent.method
    * @property webhooks.onMessageSent.url - The webhooks.on_message_sent.url
    * @property webhooks.onMessageUpdate.method - The webhooks.on_message_update.method
    * @property webhooks.onMessageUpdate.url - The webhooks.on_message_update.url
    * @property webhooks.onMessageUpdated.method - The webhooks.on_message_updated.method
    * @property webhooks.onMessageUpdated.url - The webhooks.on_message_updated.url
    */
  trait ServiceInstanceUpdateOptions extends StObject {
    
    var consumptionReportInterval: js.UndefOr[Double] = js.undefined
    
    var defaultChannelCreatorRoleSid: js.UndefOr[String] = js.undefined
    
    var defaultChannelRoleSid: js.UndefOr[String] = js.undefined
    
    var defaultServiceRoleSid: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limits: js.UndefOr[ChannelMembers] = js.undefined
    
    var notifications: js.UndefOr[AddedToChannel] = js.undefined
    
    var postWebhookUrl: js.UndefOr[String] = js.undefined
    
    var preWebhookUrl: js.UndefOr[String] = js.undefined
    
    var reachabilityEnabled: js.UndefOr[Boolean] = js.undefined
    
    var readStatusEnabled: js.UndefOr[Boolean] = js.undefined
    
    var typingIndicatorTimeout: js.UndefOr[Double] = js.undefined
    
    var webhookFilters: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var webhookMethod: js.UndefOr[String] = js.undefined
    
    var webhooks: js.UndefOr[OnChannelAdd] = js.undefined
  }
  object ServiceInstanceUpdateOptions {
    
    inline def apply(): ServiceInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceInstanceUpdateOptions]
    }
    
    extension [Self <: ServiceInstanceUpdateOptions](x: Self) {
      
      inline def setConsumptionReportInterval(value: Double): Self = StObject.set(x, "consumptionReportInterval", value.asInstanceOf[js.Any])
      
      inline def setConsumptionReportIntervalUndefined: Self = StObject.set(x, "consumptionReportInterval", js.undefined)
      
      inline def setDefaultChannelCreatorRoleSid(value: String): Self = StObject.set(x, "defaultChannelCreatorRoleSid", value.asInstanceOf[js.Any])
      
      inline def setDefaultChannelCreatorRoleSidUndefined: Self = StObject.set(x, "defaultChannelCreatorRoleSid", js.undefined)
      
      inline def setDefaultChannelRoleSid(value: String): Self = StObject.set(x, "defaultChannelRoleSid", value.asInstanceOf[js.Any])
      
      inline def setDefaultChannelRoleSidUndefined: Self = StObject.set(x, "defaultChannelRoleSid", js.undefined)
      
      inline def setDefaultServiceRoleSid(value: String): Self = StObject.set(x, "defaultServiceRoleSid", value.asInstanceOf[js.Any])
      
      inline def setDefaultServiceRoleSidUndefined: Self = StObject.set(x, "defaultServiceRoleSid", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setLimits(value: ChannelMembers): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
      
      inline def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
      
      inline def setNotifications(value: AddedToChannel): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      inline def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
      
      inline def setPostWebhookUrl(value: String): Self = StObject.set(x, "postWebhookUrl", value.asInstanceOf[js.Any])
      
      inline def setPostWebhookUrlUndefined: Self = StObject.set(x, "postWebhookUrl", js.undefined)
      
      inline def setPreWebhookUrl(value: String): Self = StObject.set(x, "preWebhookUrl", value.asInstanceOf[js.Any])
      
      inline def setPreWebhookUrlUndefined: Self = StObject.set(x, "preWebhookUrl", js.undefined)
      
      inline def setReachabilityEnabled(value: Boolean): Self = StObject.set(x, "reachabilityEnabled", value.asInstanceOf[js.Any])
      
      inline def setReachabilityEnabledUndefined: Self = StObject.set(x, "reachabilityEnabled", js.undefined)
      
      inline def setReadStatusEnabled(value: Boolean): Self = StObject.set(x, "readStatusEnabled", value.asInstanceOf[js.Any])
      
      inline def setReadStatusEnabledUndefined: Self = StObject.set(x, "readStatusEnabled", js.undefined)
      
      inline def setTypingIndicatorTimeout(value: Double): Self = StObject.set(x, "typingIndicatorTimeout", value.asInstanceOf[js.Any])
      
      inline def setTypingIndicatorTimeoutUndefined: Self = StObject.set(x, "typingIndicatorTimeout", js.undefined)
      
      inline def setWebhookFilters(value: String | js.Array[String]): Self = StObject.set(x, "webhookFilters", value.asInstanceOf[js.Any])
      
      inline def setWebhookFiltersUndefined: Self = StObject.set(x, "webhookFilters", js.undefined)
      
      inline def setWebhookFiltersVarargs(value: String*): Self = StObject.set(x, "webhookFilters", js.Array(value*))
      
      inline def setWebhookMethod(value: String): Self = StObject.set(x, "webhookMethod", value.asInstanceOf[js.Any])
      
      inline def setWebhookMethodUndefined: Self = StObject.set(x, "webhookMethod", js.undefined)
      
      inline def setWebhooks(value: OnChannelAdd): Self = StObject.set(x, "webhooks", value.asInstanceOf[js.Any])
      
      inline def setWebhooksUndefined: Self = StObject.set(x, "webhooks", js.undefined)
    }
  }
  
  @js.native
  trait ServiceListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): ServiceContext = js.native
    
    /**
      * create a ServiceInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: ServiceListInstanceCreateOptions): js.Promise[ServiceInstance] = js.native
    def create(
      opts: ServiceListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ ServiceInstance, Any]
    ): js.Promise[ServiceInstance] = js.native
    
    /**
      * Streams ServiceInstance records from the API.
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
          /* item */ ServiceInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ ServiceInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: ServiceListInstanceEachOptions): Unit = js.native
    def each(
      opts: ServiceListInstanceEachOptions,
      callback: js.Function2[
          /* item */ ServiceInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a service
      *
      * @param sid - The sid
      */
    def get(sid: String): ServiceContext = js.native
    
    /**
      * Retrieve a single target page of ServiceInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[ServicePage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ ServicePage, Any]): js.Promise[ServicePage] = js.native
    def getPage(targetUrl: String): js.Promise[ServicePage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ServicePage, Any]
    ): js.Promise[ServicePage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ ServicePage, Any]): js.Promise[ServicePage] = js.native
    
    /**
      * Lists ServiceInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[ServiceInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ServiceInstance], Any]): js.Promise[js.Array[ServiceInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ServiceInstance], Any]
    ): js.Promise[js.Array[ServiceInstance]] = js.native
    def list(opts: ServiceListInstanceOptions): js.Promise[js.Array[ServiceInstance]] = js.native
    def list(
      opts: ServiceListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ServiceInstance], Any]
    ): js.Promise[js.Array[ServiceInstance]] = js.native
    
    /**
      * Retrieve a single page of ServiceInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[ServicePage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ ServicePage, Any]): js.Promise[ServicePage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ ServicePage, Any]): js.Promise[ServicePage] = js.native
    def page(opts: ServiceListInstancePageOptions): js.Promise[ServicePage] = js.native
    def page(
      opts: ServiceListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ServicePage, Any]
    ): js.Promise[ServicePage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property friendlyName - The friendly_name
    */
  trait ServiceListInstanceCreateOptions extends StObject {
    
    var friendlyName: String
  }
  object ServiceListInstanceCreateOptions {
    
    inline def apply(friendlyName: String): ServiceListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceListInstanceCreateOptions]
    }
    
    extension [Self <: ServiceListInstanceCreateOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
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
  trait ServiceListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ ServiceInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ServiceListInstanceEachOptions {
    
    inline def apply(): ServiceListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceListInstanceEachOptions]
    }
    
    extension [Self <: ServiceListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ ServiceInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait ServiceListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ServiceListInstanceOptions {
    
    inline def apply(): ServiceListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceListInstanceOptions]
    }
    
    extension [Self <: ServiceListInstanceOptions](x: Self) {
      
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
  trait ServiceListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object ServiceListInstancePageOptions {
    
    inline def apply(): ServiceListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceListInstancePageOptions]
    }
    
    extension [Self <: ServiceListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait ServicePayload
    extends StObject
       with ServiceResource
       with TwilioResponsePayload
  object ServicePayload {
    
    inline def apply(
      account_sid: String,
      consumption_report_interval: Double,
      date_created: js.Date,
      date_updated: js.Date,
      default_channel_creator_role_sid: String,
      default_channel_role_sid: String,
      default_service_role_sid: String,
      first_page_uri: String,
      friendly_name: String,
      limits: js.Object,
      links: String,
      next_page_uri: String,
      notifications: js.Object,
      page: Double,
      page_size: Double,
      post_webhook_url: String,
      pre_webhook_url: String,
      previous_page_uri: String,
      reachability_enabled: Boolean,
      read_status_enabled: Boolean,
      sid: String,
      typing_indicator_timeout: Double,
      uri: String,
      url: String,
      webhook_filters: js.Array[String],
      webhook_method: String,
      webhooks: js.Object
    ): ServicePayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], consumption_report_interval = consumption_report_interval.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], default_channel_creator_role_sid = default_channel_creator_role_sid.asInstanceOf[js.Any], default_channel_role_sid = default_channel_role_sid.asInstanceOf[js.Any], default_service_role_sid = default_service_role_sid.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], limits = limits.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], post_webhook_url = post_webhook_url.asInstanceOf[js.Any], pre_webhook_url = pre_webhook_url.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], reachability_enabled = reachability_enabled.asInstanceOf[js.Any], read_status_enabled = read_status_enabled.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], typing_indicator_timeout = typing_indicator_timeout.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], webhook_filters = webhook_filters.asInstanceOf[js.Any], webhook_method = webhook_method.asInstanceOf[js.Any], webhooks = webhooks.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServicePayload]
    }
  }
  
  trait ServiceResource extends StObject {
    
    var account_sid: String
    
    var consumption_report_interval: Double
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var default_channel_creator_role_sid: String
    
    var default_channel_role_sid: String
    
    var default_service_role_sid: String
    
    var friendly_name: String
    
    var limits: js.Object
    
    var links: String
    
    var notifications: js.Object
    
    var post_webhook_url: String
    
    var pre_webhook_url: String
    
    var reachability_enabled: Boolean
    
    var read_status_enabled: Boolean
    
    var sid: String
    
    var typing_indicator_timeout: Double
    
    var url: String
    
    var webhook_filters: js.Array[String]
    
    var webhook_method: String
    
    var webhooks: js.Object
  }
  object ServiceResource {
    
    inline def apply(
      account_sid: String,
      consumption_report_interval: Double,
      date_created: js.Date,
      date_updated: js.Date,
      default_channel_creator_role_sid: String,
      default_channel_role_sid: String,
      default_service_role_sid: String,
      friendly_name: String,
      limits: js.Object,
      links: String,
      notifications: js.Object,
      post_webhook_url: String,
      pre_webhook_url: String,
      reachability_enabled: Boolean,
      read_status_enabled: Boolean,
      sid: String,
      typing_indicator_timeout: Double,
      url: String,
      webhook_filters: js.Array[String],
      webhook_method: String,
      webhooks: js.Object
    ): ServiceResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], consumption_report_interval = consumption_report_interval.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], default_channel_creator_role_sid = default_channel_creator_role_sid.asInstanceOf[js.Any], default_channel_role_sid = default_channel_role_sid.asInstanceOf[js.Any], default_service_role_sid = default_service_role_sid.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], limits = limits.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], post_webhook_url = post_webhook_url.asInstanceOf[js.Any], pre_webhook_url = pre_webhook_url.asInstanceOf[js.Any], reachability_enabled = reachability_enabled.asInstanceOf[js.Any], read_status_enabled = read_status_enabled.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], typing_indicator_timeout = typing_indicator_timeout.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], webhook_filters = webhook_filters.asInstanceOf[js.Any], webhook_method = webhook_method.asInstanceOf[js.Any], webhooks = webhooks.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceResource]
    }
    
    extension [Self <: ServiceResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setConsumption_report_interval(value: Double): Self = StObject.set(x, "consumption_report_interval", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDefault_channel_creator_role_sid(value: String): Self = StObject.set(x, "default_channel_creator_role_sid", value.asInstanceOf[js.Any])
      
      inline def setDefault_channel_role_sid(value: String): Self = StObject.set(x, "default_channel_role_sid", value.asInstanceOf[js.Any])
      
      inline def setDefault_service_role_sid(value: String): Self = StObject.set(x, "default_service_role_sid", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setLimits(value: js.Object): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setNotifications(value: js.Object): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      inline def setPost_webhook_url(value: String): Self = StObject.set(x, "post_webhook_url", value.asInstanceOf[js.Any])
      
      inline def setPre_webhook_url(value: String): Self = StObject.set(x, "pre_webhook_url", value.asInstanceOf[js.Any])
      
      inline def setReachability_enabled(value: Boolean): Self = StObject.set(x, "reachability_enabled", value.asInstanceOf[js.Any])
      
      inline def setRead_status_enabled(value: Boolean): Self = StObject.set(x, "read_status_enabled", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setTyping_indicator_timeout(value: Double): Self = StObject.set(x, "typing_indicator_timeout", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWebhook_filters(value: js.Array[String]): Self = StObject.set(x, "webhook_filters", value.asInstanceOf[js.Any])
      
      inline def setWebhook_filtersVarargs(value: String*): Self = StObject.set(x, "webhook_filters", js.Array(value*))
      
      inline def setWebhook_method(value: String): Self = StObject.set(x, "webhook_method", value.asInstanceOf[js.Any])
      
      inline def setWebhooks(value: js.Object): Self = StObject.set(x, "webhooks", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServiceSolution extends StObject
}
