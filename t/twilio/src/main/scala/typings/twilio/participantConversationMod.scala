package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.active_
import typings.twilio.twilioStrings.inactive_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object participantConversationMod {
  
  @JSImport("twilio/lib/rest/conversations/v1/participantConversation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/conversations/v1/participantConversation", "ParticipantConversationInstance")
  @js.native
  open class ParticipantConversationInstance protected () extends SerializableClass {
    /**
      * Initialize the ParticipantConversationContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      */
    def this(version: typings.twilio.conversationsV1Mod.^, payload: ParticipantConversationPayload) = this()
    
    var accountSid: String = js.native
    
    var chatServiceSid: String = js.native
    
    var conversationAttributes: String = js.native
    
    var conversationCreatedBy: String = js.native
    
    var conversationDateCreated: js.Date = js.native
    
    var conversationDateUpdated: js.Date = js.native
    
    var conversationFriendlyName: String = js.native
    
    var conversationSid: String = js.native
    
    var conversationState: ParticipantConversationState = js.native
    
    var conversationTimers: Any = js.native
    
    var conversationUniqueName: String = js.native
    
    var links: String = js.native
    
    var participantIdentity: String = js.native
    
    var participantMessagingBinding: Any = js.native
    
    var participantSid: String = js.native
    
    var participantUserSid: String = js.native
  }
  
  /**
    * Initialize the ParticipantConversationList
    *
    * @param version - Version of the resource
    */
  inline def ParticipantConversationList(version: typings.twilio.conversationsV1Mod.^): ParticipantConversationListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("ParticipantConversationList")(version.asInstanceOf[js.Any]).asInstanceOf[ParticipantConversationListInstance]
  
  @JSImport("twilio/lib/rest/conversations/v1/participantConversation", "ParticipantConversationPage")
  @js.native
  open class ParticipantConversationPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.conversationsV1Mod.^, 
          ParticipantConversationPayload, 
          ParticipantConversationResource, 
          ParticipantConversationInstance
        ] {
    /**
      * Initialize the ParticipantConversationPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.conversationsV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: ParticipantConversationSolution
    ) = this()
    
    /**
      * Build an instance of ParticipantConversationInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ParticipantConversationPayload): ParticipantConversationInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait ParticipantConversationListInstance extends StObject {
    
    /**
      * Streams ParticipantConversationInstance records from the API.
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
          /* item */ ParticipantConversationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ ParticipantConversationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: ParticipantConversationListInstanceEachOptions): Unit = js.native
    def each(
      opts: ParticipantConversationListInstanceEachOptions,
      callback: js.Function2[
          /* item */ ParticipantConversationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Retrieve a single target page of ParticipantConversationInstance records from
      * the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[ParticipantConversationPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantConversationPage, Any]): js.Promise[ParticipantConversationPage] = js.native
    def getPage(targetUrl: String): js.Promise[ParticipantConversationPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantConversationPage, Any]
    ): js.Promise[ParticipantConversationPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantConversationPage, Any]
    ): js.Promise[ParticipantConversationPage] = js.native
    
    /**
      * Lists ParticipantConversationInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[ParticipantConversationInstance]] = js.native
    def list(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[ParticipantConversationInstance], 
          Any
        ]
    ): js.Promise[js.Array[ParticipantConversationInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[ParticipantConversationInstance], 
          Any
        ]
    ): js.Promise[js.Array[ParticipantConversationInstance]] = js.native
    def list(opts: ParticipantConversationListInstanceOptions): js.Promise[js.Array[ParticipantConversationInstance]] = js.native
    def list(
      opts: ParticipantConversationListInstanceOptions,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[ParticipantConversationInstance], 
          Any
        ]
    ): js.Promise[js.Array[ParticipantConversationInstance]] = js.native
    
    /**
      * Retrieve a single page of ParticipantConversationInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[ParticipantConversationPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantConversationPage, Any]): js.Promise[ParticipantConversationPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantConversationPage, Any]
    ): js.Promise[ParticipantConversationPage] = js.native
    def page(opts: ParticipantConversationListInstancePageOptions): js.Promise[ParticipantConversationPage] = js.native
    def page(
      opts: ParticipantConversationListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantConversationPage, Any]
    ): js.Promise[ParticipantConversationPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to each
    *
    * @property address - A unique string identifier for the conversation participant who's not a Conversation User.
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
    * @property identity - A unique string identifier for the conversation participant as Conversation User.
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
  trait ParticipantConversationListInstanceEachOptions extends StObject {
    
    var address: js.UndefOr[String] = js.undefined
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ ParticipantConversationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var identity: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ParticipantConversationListInstanceEachOptions {
    
    inline def apply(): ParticipantConversationListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParticipantConversationListInstanceEachOptions]
    }
    
    extension [Self <: ParticipantConversationListInstanceEachOptions](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setCallback(
        value: (/* item */ ParticipantConversationInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property address - A unique string identifier for the conversation participant who's not a Conversation User.
    * @property identity - A unique string identifier for the conversation participant as Conversation User.
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
  trait ParticipantConversationListInstanceOptions extends StObject {
    
    var address: js.UndefOr[String] = js.undefined
    
    var identity: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ParticipantConversationListInstanceOptions {
    
    inline def apply(): ParticipantConversationListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParticipantConversationListInstanceOptions]
    }
    
    extension [Self <: ParticipantConversationListInstanceOptions](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property address - A unique string identifier for the conversation participant who's not a Conversation User.
    * @property identity - A unique string identifier for the conversation participant as Conversation User.
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait ParticipantConversationListInstancePageOptions extends StObject {
    
    var address: js.UndefOr[String] = js.undefined
    
    var identity: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object ParticipantConversationListInstancePageOptions {
    
    inline def apply(): ParticipantConversationListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParticipantConversationListInstancePageOptions]
    }
    
    extension [Self <: ParticipantConversationListInstancePageOptions](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait ParticipantConversationPayload
    extends StObject
       with ParticipantConversationResource
       with TwilioResponsePayload
  object ParticipantConversationPayload {
    
    inline def apply(
      account_sid: String,
      chat_service_sid: String,
      conversation_attributes: String,
      conversation_created_by: String,
      conversation_date_created: js.Date,
      conversation_date_updated: js.Date,
      conversation_friendly_name: String,
      conversation_sid: String,
      conversation_state: ParticipantConversationState,
      conversation_timers: js.Object,
      conversation_unique_name: String,
      first_page_uri: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      participant_identity: String,
      participant_messaging_binding: js.Object,
      participant_sid: String,
      participant_user_sid: String,
      previous_page_uri: String,
      uri: String
    ): ParticipantConversationPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], chat_service_sid = chat_service_sid.asInstanceOf[js.Any], conversation_attributes = conversation_attributes.asInstanceOf[js.Any], conversation_created_by = conversation_created_by.asInstanceOf[js.Any], conversation_date_created = conversation_date_created.asInstanceOf[js.Any], conversation_date_updated = conversation_date_updated.asInstanceOf[js.Any], conversation_friendly_name = conversation_friendly_name.asInstanceOf[js.Any], conversation_sid = conversation_sid.asInstanceOf[js.Any], conversation_state = conversation_state.asInstanceOf[js.Any], conversation_timers = conversation_timers.asInstanceOf[js.Any], conversation_unique_name = conversation_unique_name.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], participant_identity = participant_identity.asInstanceOf[js.Any], participant_messaging_binding = participant_messaging_binding.asInstanceOf[js.Any], participant_sid = participant_sid.asInstanceOf[js.Any], participant_user_sid = participant_user_sid.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParticipantConversationPayload]
    }
  }
  
  trait ParticipantConversationResource extends StObject {
    
    var account_sid: String
    
    var chat_service_sid: String
    
    var conversation_attributes: String
    
    var conversation_created_by: String
    
    var conversation_date_created: js.Date
    
    var conversation_date_updated: js.Date
    
    var conversation_friendly_name: String
    
    var conversation_sid: String
    
    var conversation_state: ParticipantConversationState
    
    var conversation_timers: js.Object
    
    var conversation_unique_name: String
    
    var links: String
    
    var participant_identity: String
    
    var participant_messaging_binding: js.Object
    
    var participant_sid: String
    
    var participant_user_sid: String
  }
  object ParticipantConversationResource {
    
    inline def apply(
      account_sid: String,
      chat_service_sid: String,
      conversation_attributes: String,
      conversation_created_by: String,
      conversation_date_created: js.Date,
      conversation_date_updated: js.Date,
      conversation_friendly_name: String,
      conversation_sid: String,
      conversation_state: ParticipantConversationState,
      conversation_timers: js.Object,
      conversation_unique_name: String,
      links: String,
      participant_identity: String,
      participant_messaging_binding: js.Object,
      participant_sid: String,
      participant_user_sid: String
    ): ParticipantConversationResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], chat_service_sid = chat_service_sid.asInstanceOf[js.Any], conversation_attributes = conversation_attributes.asInstanceOf[js.Any], conversation_created_by = conversation_created_by.asInstanceOf[js.Any], conversation_date_created = conversation_date_created.asInstanceOf[js.Any], conversation_date_updated = conversation_date_updated.asInstanceOf[js.Any], conversation_friendly_name = conversation_friendly_name.asInstanceOf[js.Any], conversation_sid = conversation_sid.asInstanceOf[js.Any], conversation_state = conversation_state.asInstanceOf[js.Any], conversation_timers = conversation_timers.asInstanceOf[js.Any], conversation_unique_name = conversation_unique_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], participant_identity = participant_identity.asInstanceOf[js.Any], participant_messaging_binding = participant_messaging_binding.asInstanceOf[js.Any], participant_sid = participant_sid.asInstanceOf[js.Any], participant_user_sid = participant_user_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParticipantConversationResource]
    }
    
    extension [Self <: ParticipantConversationResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setChat_service_sid(value: String): Self = StObject.set(x, "chat_service_sid", value.asInstanceOf[js.Any])
      
      inline def setConversation_attributes(value: String): Self = StObject.set(x, "conversation_attributes", value.asInstanceOf[js.Any])
      
      inline def setConversation_created_by(value: String): Self = StObject.set(x, "conversation_created_by", value.asInstanceOf[js.Any])
      
      inline def setConversation_date_created(value: js.Date): Self = StObject.set(x, "conversation_date_created", value.asInstanceOf[js.Any])
      
      inline def setConversation_date_updated(value: js.Date): Self = StObject.set(x, "conversation_date_updated", value.asInstanceOf[js.Any])
      
      inline def setConversation_friendly_name(value: String): Self = StObject.set(x, "conversation_friendly_name", value.asInstanceOf[js.Any])
      
      inline def setConversation_sid(value: String): Self = StObject.set(x, "conversation_sid", value.asInstanceOf[js.Any])
      
      inline def setConversation_state(value: ParticipantConversationState): Self = StObject.set(x, "conversation_state", value.asInstanceOf[js.Any])
      
      inline def setConversation_timers(value: js.Object): Self = StObject.set(x, "conversation_timers", value.asInstanceOf[js.Any])
      
      inline def setConversation_unique_name(value: String): Self = StObject.set(x, "conversation_unique_name", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setParticipant_identity(value: String): Self = StObject.set(x, "participant_identity", value.asInstanceOf[js.Any])
      
      inline def setParticipant_messaging_binding(value: js.Object): Self = StObject.set(x, "participant_messaging_binding", value.asInstanceOf[js.Any])
      
      inline def setParticipant_sid(value: String): Self = StObject.set(x, "participant_sid", value.asInstanceOf[js.Any])
      
      inline def setParticipant_user_sid(value: String): Self = StObject.set(x, "participant_user_sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParticipantConversationSolution extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.inactive_
    - typings.twilio.twilioStrings.active_
    - typings.twilio.twilioStrings.closed
  */
  trait ParticipantConversationState extends StObject
  object ParticipantConversationState {
    
    inline def active: active_ = "active".asInstanceOf[active_]
    
    inline def closed: typings.twilio.twilioStrings.closed = "closed".asInstanceOf[typings.twilio.twilioStrings.closed]
    
    inline def inactive: inactive_ = "inactive".asInstanceOf[inactive_]
  }
}
