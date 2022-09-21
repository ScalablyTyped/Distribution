package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.active_
import typings.twilio.twilioStrings.inactive_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userUserConversationMod {
  
  @JSImport("twilio/lib/rest/conversations/v1/user/userConversation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/conversations/v1/user/userConversation", "UserConversationContext")
  @js.native
  open class UserConversationContext protected () extends StObject {
    /**
      * Initialize the UserConversationContext
      *
      * @param version - Version of the resource
      * @param userSid - The unique SID identifier of the User.
      * @param conversationSid - The unique SID identifier of the Conversation.
      */
    def this(version: typings.twilio.conversationsV1Mod.^, userSid: String, conversationSid: String) = this()
    
    /**
      * fetch a UserConversationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[UserConversationInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ UserConversationInstance, Any]): js.Promise[UserConversationInstance] = js.native
    
    /**
      * remove a UserConversationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ UserConversationInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a UserConversationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[UserConversationInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ UserConversationInstance, Any]): js.Promise[UserConversationInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ UserConversationInstance, Any]
    ): js.Promise[UserConversationInstance] = js.native
    def update(opts: UserConversationInstanceUpdateOptions): js.Promise[UserConversationInstance] = js.native
    def update(
      opts: UserConversationInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ UserConversationInstance, Any]
    ): js.Promise[UserConversationInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/conversations/v1/user/userConversation", "UserConversationInstance")
  @js.native
  open class UserConversationInstance protected () extends SerializableClass {
    /**
      * Initialize the UserConversationContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param userSid - The unique ID for the User.
      * @param conversationSid - The unique SID identifier of the Conversation.
      */
    def this(
      version: typings.twilio.conversationsV1Mod.^,
      payload: UserConversationPayload,
      userSid: String,
      conversationSid: String
    ) = this()
    
    /* private */ var _proxy: UserConversationContext = js.native
    
    var accountSid: String = js.native
    
    var attributes: String = js.native
    
    var chatServiceSid: String = js.native
    
    var conversationSid: String = js.native
    
    var conversationState: UserConversationState = js.native
    
    var createdBy: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a UserConversationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[UserConversationInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[UserConversationInstance] = js.native
    
    var friendlyName: String = js.native
    
    var lastReadMessageIndex: Double = js.native
    
    var links: String = js.native
    
    var notificationLevel: UserConversationNotificationLevel = js.native
    
    var participantSid: String = js.native
    
    /**
      * remove a UserConversationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var timers: Any = js.native
    
    var uniqueName: String = js.native
    
    var unreadMessagesCount: Double = js.native
    
    /**
      * update a UserConversationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[UserConversationInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[UserConversationInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[UserConversationInstance] = js.native
    def update(opts: UserConversationInstanceUpdateOptions): js.Promise[UserConversationInstance] = js.native
    def update(
      opts: UserConversationInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[UserConversationInstance] = js.native
    
    var url: String = js.native
    
    var userSid: String = js.native
  }
  
  /**
    * Initialize the UserConversationList
    *
    * @param version - Version of the resource
    * @param userSid - The unique ID for the User.
    */
  inline def UserConversationList(version: typings.twilio.conversationsV1Mod.^, userSid: String): UserConversationListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("UserConversationList")(version.asInstanceOf[js.Any], userSid.asInstanceOf[js.Any])).asInstanceOf[UserConversationListInstance]
  
  @JSImport("twilio/lib/rest/conversations/v1/user/userConversation", "UserConversationPage")
  @js.native
  open class UserConversationPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.conversationsV1Mod.^, 
          UserConversationPayload, 
          UserConversationResource, 
          UserConversationInstance
        ] {
    /**
      * Initialize the UserConversationPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.conversationsV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: UserConversationSolution
    ) = this()
    
    /**
      * Build an instance of UserConversationInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: UserConversationPayload): UserConversationInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property lastReadMessageIndex - The index of the last read Message.
    * @property lastReadTimestamp - The date of the last message read in conversation by the user.
    * @property notificationLevel - The Notification Level of this User Conversation.
    */
  trait UserConversationInstanceUpdateOptions extends StObject {
    
    var lastReadMessageIndex: js.UndefOr[Double] = js.undefined
    
    var lastReadTimestamp: js.UndefOr[js.Date] = js.undefined
    
    var notificationLevel: js.UndefOr[UserConversationNotificationLevel] = js.undefined
  }
  object UserConversationInstanceUpdateOptions {
    
    inline def apply(): UserConversationInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserConversationInstanceUpdateOptions]
    }
    
    extension [Self <: UserConversationInstanceUpdateOptions](x: Self) {
      
      inline def setLastReadMessageIndex(value: Double): Self = StObject.set(x, "lastReadMessageIndex", value.asInstanceOf[js.Any])
      
      inline def setLastReadMessageIndexUndefined: Self = StObject.set(x, "lastReadMessageIndex", js.undefined)
      
      inline def setLastReadTimestamp(value: js.Date): Self = StObject.set(x, "lastReadTimestamp", value.asInstanceOf[js.Any])
      
      inline def setLastReadTimestampUndefined: Self = StObject.set(x, "lastReadTimestamp", js.undefined)
      
      inline def setNotificationLevel(value: UserConversationNotificationLevel): Self = StObject.set(x, "notificationLevel", value.asInstanceOf[js.Any])
      
      inline def setNotificationLevelUndefined: Self = StObject.set(x, "notificationLevel", js.undefined)
    }
  }
  
  @js.native
  trait UserConversationListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): UserConversationContext = js.native
    
    /**
      * Streams UserConversationInstance records from the API.
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
          /* item */ UserConversationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ UserConversationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: UserConversationListInstanceEachOptions): Unit = js.native
    def each(
      opts: UserConversationListInstanceEachOptions,
      callback: js.Function2[
          /* item */ UserConversationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a user_conversation
      *
      * @param conversationSid - The unique SID identifier of the Conversation.
      */
    def get(conversationSid: String): UserConversationContext = js.native
    
    /**
      * Retrieve a single target page of UserConversationInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[UserConversationPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ UserConversationPage, Any]): js.Promise[UserConversationPage] = js.native
    def getPage(targetUrl: String): js.Promise[UserConversationPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ UserConversationPage, Any]
    ): js.Promise[UserConversationPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ UserConversationPage, Any]
    ): js.Promise[UserConversationPage] = js.native
    
    /**
      * Lists UserConversationInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[UserConversationInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[UserConversationInstance], Any]
    ): js.Promise[js.Array[UserConversationInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[UserConversationInstance], Any]
    ): js.Promise[js.Array[UserConversationInstance]] = js.native
    def list(opts: UserConversationListInstanceOptions): js.Promise[js.Array[UserConversationInstance]] = js.native
    def list(
      opts: UserConversationListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[UserConversationInstance], Any]
    ): js.Promise[js.Array[UserConversationInstance]] = js.native
    
    /**
      * Retrieve a single page of UserConversationInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[UserConversationPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ UserConversationPage, Any]): js.Promise[UserConversationPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ UserConversationPage, Any]
    ): js.Promise[UserConversationPage] = js.native
    def page(opts: UserConversationListInstancePageOptions): js.Promise[UserConversationPage] = js.native
    def page(
      opts: UserConversationListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ UserConversationPage, Any]
    ): js.Promise[UserConversationPage] = js.native
    
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
  trait UserConversationListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ UserConversationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object UserConversationListInstanceEachOptions {
    
    inline def apply(): UserConversationListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserConversationListInstanceEachOptions]
    }
    
    extension [Self <: UserConversationListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ UserConversationInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait UserConversationListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object UserConversationListInstanceOptions {
    
    inline def apply(): UserConversationListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserConversationListInstanceOptions]
    }
    
    extension [Self <: UserConversationListInstanceOptions](x: Self) {
      
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
  trait UserConversationListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object UserConversationListInstancePageOptions {
    
    inline def apply(): UserConversationListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserConversationListInstancePageOptions]
    }
    
    extension [Self <: UserConversationListInstancePageOptions](x: Self) {
      
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
  trait UserConversationNotificationLevel extends StObject
  object UserConversationNotificationLevel {
    
    inline def default: typings.twilio.twilioStrings.default = "default".asInstanceOf[typings.twilio.twilioStrings.default]
    
    inline def muted: typings.twilio.twilioStrings.muted = "muted".asInstanceOf[typings.twilio.twilioStrings.muted]
  }
  
  trait UserConversationPayload
    extends StObject
       with UserConversationResource
       with TwilioResponsePayload
  object UserConversationPayload {
    
    inline def apply(
      account_sid: String,
      attributes: String,
      chat_service_sid: String,
      conversation_sid: String,
      conversation_state: UserConversationState,
      created_by: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      friendly_name: String,
      last_read_message_index: Double,
      links: String,
      next_page_uri: String,
      notification_level: UserConversationNotificationLevel,
      page: Double,
      page_size: Double,
      participant_sid: String,
      previous_page_uri: String,
      timers: js.Object,
      unique_name: String,
      unread_messages_count: Double,
      uri: String,
      url: String,
      user_sid: String
    ): UserConversationPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], chat_service_sid = chat_service_sid.asInstanceOf[js.Any], conversation_sid = conversation_sid.asInstanceOf[js.Any], conversation_state = conversation_state.asInstanceOf[js.Any], created_by = created_by.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], last_read_message_index = last_read_message_index.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], notification_level = notification_level.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], participant_sid = participant_sid.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], timers = timers.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], unread_messages_count = unread_messages_count.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user_sid = user_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserConversationPayload]
    }
  }
  
  trait UserConversationResource extends StObject {
    
    var account_sid: String
    
    var attributes: String
    
    var chat_service_sid: String
    
    var conversation_sid: String
    
    var conversation_state: UserConversationState
    
    var created_by: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var last_read_message_index: Double
    
    var links: String
    
    var notification_level: UserConversationNotificationLevel
    
    var participant_sid: String
    
    var timers: js.Object
    
    var unique_name: String
    
    var unread_messages_count: Double
    
    var url: String
    
    var user_sid: String
  }
  object UserConversationResource {
    
    inline def apply(
      account_sid: String,
      attributes: String,
      chat_service_sid: String,
      conversation_sid: String,
      conversation_state: UserConversationState,
      created_by: String,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      last_read_message_index: Double,
      links: String,
      notification_level: UserConversationNotificationLevel,
      participant_sid: String,
      timers: js.Object,
      unique_name: String,
      unread_messages_count: Double,
      url: String,
      user_sid: String
    ): UserConversationResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], chat_service_sid = chat_service_sid.asInstanceOf[js.Any], conversation_sid = conversation_sid.asInstanceOf[js.Any], conversation_state = conversation_state.asInstanceOf[js.Any], created_by = created_by.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], last_read_message_index = last_read_message_index.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], notification_level = notification_level.asInstanceOf[js.Any], participant_sid = participant_sid.asInstanceOf[js.Any], timers = timers.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], unread_messages_count = unread_messages_count.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user_sid = user_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserConversationResource]
    }
    
    extension [Self <: UserConversationResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setChat_service_sid(value: String): Self = StObject.set(x, "chat_service_sid", value.asInstanceOf[js.Any])
      
      inline def setConversation_sid(value: String): Self = StObject.set(x, "conversation_sid", value.asInstanceOf[js.Any])
      
      inline def setConversation_state(value: UserConversationState): Self = StObject.set(x, "conversation_state", value.asInstanceOf[js.Any])
      
      inline def setCreated_by(value: String): Self = StObject.set(x, "created_by", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setLast_read_message_index(value: Double): Self = StObject.set(x, "last_read_message_index", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setNotification_level(value: UserConversationNotificationLevel): Self = StObject.set(x, "notification_level", value.asInstanceOf[js.Any])
      
      inline def setParticipant_sid(value: String): Self = StObject.set(x, "participant_sid", value.asInstanceOf[js.Any])
      
      inline def setTimers(value: js.Object): Self = StObject.set(x, "timers", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUnread_messages_count(value: Double): Self = StObject.set(x, "unread_messages_count", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUser_sid(value: String): Self = StObject.set(x, "user_sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserConversationSolution extends StObject {
    
    var userSid: js.UndefOr[String] = js.undefined
  }
  object UserConversationSolution {
    
    inline def apply(): UserConversationSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserConversationSolution]
    }
    
    extension [Self <: UserConversationSolution](x: Self) {
      
      inline def setUserSid(value: String): Self = StObject.set(x, "userSid", value.asInstanceOf[js.Any])
      
      inline def setUserSidUndefined: Self = StObject.set(x, "userSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.inactive_
    - typings.twilio.twilioStrings.active_
    - typings.twilio.twilioStrings.closed
  */
  trait UserConversationState extends StObject
  object UserConversationState {
    
    inline def active: active_ = "active".asInstanceOf[active_]
    
    inline def closed: typings.twilio.twilioStrings.closed = "closed".asInstanceOf[typings.twilio.twilioStrings.closed]
    
    inline def inactive: inactive_ = "inactive".asInstanceOf[inactive_]
  }
}
