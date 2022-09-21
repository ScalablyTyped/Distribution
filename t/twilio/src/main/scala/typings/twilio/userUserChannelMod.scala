package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userUserChannelMod {
  
  @JSImport("twilio/lib/rest/chat/v2/service/user/userChannel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/chat/v2/service/user/userChannel", "UserChannelContext")
  @js.native
  open class UserChannelContext protected () extends StObject {
    /**
      * Initialize the UserChannelContext
      *
      * @param version - Version of the resource
      * @param serviceSid - The SID of the Service to fetch the User Channel resource from
      * @param userSid - The SID of the User to fetch the User Channel resource from
      * @param channelSid - The SID of the Channel that has the User Channel to fetch
      */
    def this(version: typings.twilio.v2Mod.^, serviceSid: String, userSid: String, channelSid: String) = this()
    
    /**
      * fetch a UserChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[UserChannelInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ UserChannelInstance, Any]): js.Promise[UserChannelInstance] = js.native
    
    /**
      * remove a UserChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ UserChannelInstance, Any]): js.Promise[Boolean] = js.native
    def remove(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ UserChannelInstance, Any]
    ): js.Promise[Boolean] = js.native
    def remove(opts: UserChannelInstanceRemoveOptions): js.Promise[Boolean] = js.native
    def remove(
      opts: UserChannelInstanceRemoveOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ UserChannelInstance, Any]
    ): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a UserChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[UserChannelInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ UserChannelInstance, Any]): js.Promise[UserChannelInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ UserChannelInstance, Any]
    ): js.Promise[UserChannelInstance] = js.native
    def update(opts: UserChannelInstanceUpdateOptions): js.Promise[UserChannelInstance] = js.native
    def update(
      opts: UserChannelInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ UserChannelInstance, Any]
    ): js.Promise[UserChannelInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/chat/v2/service/user/userChannel", "UserChannelInstance")
  @js.native
  open class UserChannelInstance protected () extends SerializableClass {
    /**
      * Initialize the UserChannelContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - The SID of the Service that the resource is associated with
      * @param userSid - The SID of the User the User Channel belongs to
      * @param channelSid - The SID of the Channel that has the User Channel to fetch
      */
    def this(
      version: typings.twilio.v2Mod.^,
      payload: UserChannelPayload,
      serviceSid: String,
      userSid: String,
      channelSid: String
    ) = this()
    
    /* private */ var _proxy: UserChannelContext = js.native
    
    var accountSid: String = js.native
    
    var channelSid: String = js.native
    
    /**
      * fetch a UserChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[UserChannelInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[UserChannelInstance] = js.native
    
    var lastConsumedMessageIndex: Double = js.native
    
    var links: String = js.native
    
    var memberSid: String = js.native
    
    var notificationLevel: UserChannelNotificationLevel = js.native
    
    /**
      * remove a UserChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    def remove(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    def remove(opts: UserChannelInstanceRemoveOptions): js.Promise[Boolean] = js.native
    def remove(
      opts: UserChannelInstanceRemoveOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[Boolean] = js.native
    
    var serviceSid: String = js.native
    
    var status: UserChannelChannelStatus = js.native
    
    var unreadMessagesCount: Double = js.native
    
    /**
      * update a UserChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[UserChannelInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[UserChannelInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[UserChannelInstance] = js.native
    def update(opts: UserChannelInstanceUpdateOptions): js.Promise[UserChannelInstance] = js.native
    def update(
      opts: UserChannelInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[UserChannelInstance] = js.native
    
    var url: String = js.native
    
    var userSid: String = js.native
  }
  
  /**
    * Initialize the UserChannelList
    *
    * @param version - Version of the resource
    * @param serviceSid - The SID of the Service that the resource is associated with
    * @param userSid - The SID of the User the User Channel belongs to
    */
  inline def UserChannelList(version: typings.twilio.v2Mod.^, serviceSid: String, userSid: String): UserChannelListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("UserChannelList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any], userSid.asInstanceOf[js.Any])).asInstanceOf[UserChannelListInstance]
  
  @JSImport("twilio/lib/rest/chat/v2/service/user/userChannel", "UserChannelPage")
  @js.native
  open class UserChannelPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.v2Mod.^, UserChannelPayload, UserChannelResource, UserChannelInstance] {
    /**
      * Initialize the UserChannelPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: UserChannelSolution
    ) = this()
    
    /**
      * Build an instance of UserChannelInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: UserChannelPayload): UserChannelInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.joined
    - typings.twilio.twilioStrings.invited
    - typings.twilio.twilioStrings.not_participating
  */
  trait UserChannelChannelStatus extends StObject
  object UserChannelChannelStatus {
    
    inline def invited: typings.twilio.twilioStrings.invited = "invited".asInstanceOf[typings.twilio.twilioStrings.invited]
    
    inline def joined: typings.twilio.twilioStrings.joined = "joined".asInstanceOf[typings.twilio.twilioStrings.joined]
    
    inline def not_participating: typings.twilio.twilioStrings.not_participating = "not_participating".asInstanceOf[typings.twilio.twilioStrings.not_participating]
  }
  
  /**
    * Options to pass to remove
    *
    * @property xTwilioWebhookEnabled - The X-Twilio-Webhook-Enabled HTTP request header
    */
  trait UserChannelInstanceRemoveOptions extends StObject {
    
    var xTwilioWebhookEnabled: js.UndefOr[UserChannelWebhookEnabledType] = js.undefined
  }
  object UserChannelInstanceRemoveOptions {
    
    inline def apply(): UserChannelInstanceRemoveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserChannelInstanceRemoveOptions]
    }
    
    extension [Self <: UserChannelInstanceRemoveOptions](x: Self) {
      
      inline def setXTwilioWebhookEnabled(value: UserChannelWebhookEnabledType): Self = StObject.set(x, "xTwilioWebhookEnabled", value.asInstanceOf[js.Any])
      
      inline def setXTwilioWebhookEnabledUndefined: Self = StObject.set(x, "xTwilioWebhookEnabled", js.undefined)
    }
  }
  
  /**
    * Options to pass to update
    *
    * @property lastConsumedMessageIndex - The index of the last Message that the Member has read within the Channel
    * @property lastConsumptionTimestamp - The ISO 8601 based timestamp string that represents the datetime of the last Message read event for the Member within the Channel
    * @property notificationLevel - The push notification level to assign to the User Channel
    */
  trait UserChannelInstanceUpdateOptions extends StObject {
    
    var lastConsumedMessageIndex: js.UndefOr[Double] = js.undefined
    
    var lastConsumptionTimestamp: js.UndefOr[js.Date] = js.undefined
    
    var notificationLevel: js.UndefOr[UserChannelNotificationLevel] = js.undefined
  }
  object UserChannelInstanceUpdateOptions {
    
    inline def apply(): UserChannelInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserChannelInstanceUpdateOptions]
    }
    
    extension [Self <: UserChannelInstanceUpdateOptions](x: Self) {
      
      inline def setLastConsumedMessageIndex(value: Double): Self = StObject.set(x, "lastConsumedMessageIndex", value.asInstanceOf[js.Any])
      
      inline def setLastConsumedMessageIndexUndefined: Self = StObject.set(x, "lastConsumedMessageIndex", js.undefined)
      
      inline def setLastConsumptionTimestamp(value: js.Date): Self = StObject.set(x, "lastConsumptionTimestamp", value.asInstanceOf[js.Any])
      
      inline def setLastConsumptionTimestampUndefined: Self = StObject.set(x, "lastConsumptionTimestamp", js.undefined)
      
      inline def setNotificationLevel(value: UserChannelNotificationLevel): Self = StObject.set(x, "notificationLevel", value.asInstanceOf[js.Any])
      
      inline def setNotificationLevelUndefined: Self = StObject.set(x, "notificationLevel", js.undefined)
    }
  }
  
  @js.native
  trait UserChannelListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): UserChannelContext = js.native
    
    /**
      * Streams UserChannelInstance records from the API.
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
          /* item */ UserChannelInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ UserChannelInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: UserChannelListInstanceEachOptions): Unit = js.native
    def each(
      opts: UserChannelListInstanceEachOptions,
      callback: js.Function2[
          /* item */ UserChannelInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a user_channel
      *
      * @param channelSid - The SID of the Channel that has the User Channel to fetch
      */
    def get(channelSid: String): UserChannelContext = js.native
    
    /**
      * Retrieve a single target page of UserChannelInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[UserChannelPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ UserChannelPage, Any]): js.Promise[UserChannelPage] = js.native
    def getPage(targetUrl: String): js.Promise[UserChannelPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ UserChannelPage, Any]
    ): js.Promise[UserChannelPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ UserChannelPage, Any]
    ): js.Promise[UserChannelPage] = js.native
    
    /**
      * Lists UserChannelInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[UserChannelInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[UserChannelInstance], Any]
    ): js.Promise[js.Array[UserChannelInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[UserChannelInstance], Any]
    ): js.Promise[js.Array[UserChannelInstance]] = js.native
    def list(opts: UserChannelListInstanceOptions): js.Promise[js.Array[UserChannelInstance]] = js.native
    def list(
      opts: UserChannelListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[UserChannelInstance], Any]
    ): js.Promise[js.Array[UserChannelInstance]] = js.native
    
    /**
      * Retrieve a single page of UserChannelInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[UserChannelPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ UserChannelPage, Any]): js.Promise[UserChannelPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ UserChannelPage, Any]): js.Promise[UserChannelPage] = js.native
    def page(opts: UserChannelListInstancePageOptions): js.Promise[UserChannelPage] = js.native
    def page(
      opts: UserChannelListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ UserChannelPage, Any]
    ): js.Promise[UserChannelPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
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
  trait UserChannelListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ UserChannelInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object UserChannelListInstanceEachOptions {
    
    inline def apply(): UserChannelListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserChannelListInstanceEachOptions]
    }
    
    extension [Self <: UserChannelListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ UserChannelInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait UserChannelListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object UserChannelListInstanceOptions {
    
    inline def apply(): UserChannelListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserChannelListInstanceOptions]
    }
    
    extension [Self <: UserChannelListInstanceOptions](x: Self) {
      
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
  trait UserChannelListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object UserChannelListInstancePageOptions {
    
    inline def apply(): UserChannelListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserChannelListInstancePageOptions]
    }
    
    extension [Self <: UserChannelListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.default
    - typings.twilio.twilioStrings.muted
  */
  trait UserChannelNotificationLevel extends StObject
  object UserChannelNotificationLevel {
    
    inline def default: typings.twilio.twilioStrings.default = "default".asInstanceOf[typings.twilio.twilioStrings.default]
    
    inline def muted: typings.twilio.twilioStrings.muted = "muted".asInstanceOf[typings.twilio.twilioStrings.muted]
  }
  
  trait UserChannelPayload
    extends StObject
       with UserChannelResource
       with TwilioResponsePayload
  object UserChannelPayload {
    
    inline def apply(
      account_sid: String,
      channel_sid: String,
      first_page_uri: String,
      last_consumed_message_index: Double,
      links: String,
      member_sid: String,
      next_page_uri: String,
      notification_level: UserChannelNotificationLevel,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      service_sid: String,
      status: UserChannelChannelStatus,
      unread_messages_count: Double,
      uri: String,
      url: String,
      user_sid: String
    ): UserChannelPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], channel_sid = channel_sid.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], last_consumed_message_index = last_consumed_message_index.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], member_sid = member_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], notification_level = notification_level.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], unread_messages_count = unread_messages_count.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user_sid = user_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserChannelPayload]
    }
  }
  
  trait UserChannelResource extends StObject {
    
    var account_sid: String
    
    var channel_sid: String
    
    var last_consumed_message_index: Double
    
    var links: String
    
    var member_sid: String
    
    var notification_level: UserChannelNotificationLevel
    
    var service_sid: String
    
    var status: UserChannelChannelStatus
    
    var unread_messages_count: Double
    
    var url: String
    
    var user_sid: String
  }
  object UserChannelResource {
    
    inline def apply(
      account_sid: String,
      channel_sid: String,
      last_consumed_message_index: Double,
      links: String,
      member_sid: String,
      notification_level: UserChannelNotificationLevel,
      service_sid: String,
      status: UserChannelChannelStatus,
      unread_messages_count: Double,
      url: String,
      user_sid: String
    ): UserChannelResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], channel_sid = channel_sid.asInstanceOf[js.Any], last_consumed_message_index = last_consumed_message_index.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], member_sid = member_sid.asInstanceOf[js.Any], notification_level = notification_level.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], unread_messages_count = unread_messages_count.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user_sid = user_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserChannelResource]
    }
    
    extension [Self <: UserChannelResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setChannel_sid(value: String): Self = StObject.set(x, "channel_sid", value.asInstanceOf[js.Any])
      
      inline def setLast_consumed_message_index(value: Double): Self = StObject.set(x, "last_consumed_message_index", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setMember_sid(value: String): Self = StObject.set(x, "member_sid", value.asInstanceOf[js.Any])
      
      inline def setNotification_level(value: UserChannelNotificationLevel): Self = StObject.set(x, "notification_level", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: UserChannelChannelStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUnread_messages_count(value: Double): Self = StObject.set(x, "unread_messages_count", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUser_sid(value: String): Self = StObject.set(x, "user_sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserChannelSolution extends StObject {
    
    var serviceSid: js.UndefOr[String] = js.undefined
    
    var userSid: js.UndefOr[String] = js.undefined
  }
  object UserChannelSolution {
    
    inline def apply(): UserChannelSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserChannelSolution]
    }
    
    extension [Self <: UserChannelSolution](x: Self) {
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
      
      inline def setUserSid(value: String): Self = StObject.set(x, "userSid", value.asInstanceOf[js.Any])
      
      inline def setUserSidUndefined: Self = StObject.set(x, "userSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.`true`
    - typings.twilio.twilioStrings.`false`
  */
  trait UserChannelWebhookEnabledType extends StObject
  object UserChannelWebhookEnabledType {
    
    inline def `false`: typings.twilio.twilioStrings.`false` = "false".asInstanceOf[typings.twilio.twilioStrings.`false`]
    
    inline def `true`: typings.twilio.twilioStrings.`true` = "true".asInstanceOf[typings.twilio.twilioStrings.`true`]
  }
}
