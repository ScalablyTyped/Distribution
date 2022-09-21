package typings.twilio

import typings.twilio.anon.Closed
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.serviceConversationMessageMod.MessageContext
import typings.twilio.serviceConversationMessageMod.MessageListInstance
import typings.twilio.serviceConversationParticipantMod.ParticipantContext
import typings.twilio.serviceConversationParticipantMod.ParticipantListInstance
import typings.twilio.serviceConversationWebhookMod.WebhookContext
import typings.twilio.serviceConversationWebhookMod.WebhookListInstance
import typings.twilio.twilioStrings.active_
import typings.twilio.twilioStrings.inactive_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceConversationMod {
  
  @JSImport("twilio/lib/rest/conversations/v1/service/conversation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/conversations/v1/service/conversation", "ConversationContext")
  @js.native
  open class ConversationContext protected () extends StObject {
    /**
      * Initialize the ConversationContext
      *
      * @param version - Version of the resource
      * @param chatServiceSid - The SID of the Conversation Service that the resource is associated with.
      * @param sid - A 34 character string that uniquely identifies this resource.
      */
    def this(version: typings.twilio.conversationsV1Mod.^, chatServiceSid: String, sid: String) = this()
    
    /**
      * fetch a ConversationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ConversationInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ ConversationInstance, Any]): js.Promise[ConversationInstance] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def messages(sid: String): MessageContext = js.native
    @JSName("messages")
    var messages_Original: MessageListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def participants(sid: String): ParticipantContext = js.native
    @JSName("participants")
    var participants_Original: ParticipantListInstance = js.native
    
    /**
      * remove a ConversationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ ConversationInstance, Any]): js.Promise[Boolean] = js.native
    def remove(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConversationInstance, Any]
    ): js.Promise[Boolean] = js.native
    def remove(opts: ConversationInstanceRemoveOptions): js.Promise[Boolean] = js.native
    def remove(
      opts: ConversationInstanceRemoveOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConversationInstance, Any]
    ): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a ConversationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ConversationInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ ConversationInstance, Any]): js.Promise[ConversationInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConversationInstance, Any]
    ): js.Promise[ConversationInstance] = js.native
    def update(opts: ConversationInstanceUpdateOptions): js.Promise[ConversationInstance] = js.native
    def update(
      opts: ConversationInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConversationInstance, Any]
    ): js.Promise[ConversationInstance] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def webhooks(sid: String): WebhookContext = js.native
    @JSName("webhooks")
    var webhooks_Original: WebhookListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/conversations/v1/service/conversation", "ConversationInstance")
  @js.native
  open class ConversationInstance protected () extends SerializableClass {
    /**
      * Initialize the ConversationContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param chatServiceSid - The unique ID of the Conversation Service this conversation belongs to.
      * @param sid - A 34 character string that uniquely identifies this resource.
      */
    def this(
      version: typings.twilio.conversationsV1Mod.^,
      payload: ConversationPayload,
      chatServiceSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: ConversationContext = js.native
    
    var accountSid: String = js.native
    
    var attributes: String = js.native
    
    var bindings: Any = js.native
    
    var chatServiceSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a ConversationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ConversationInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ConversationInstance] = js.native
    
    var friendlyName: String = js.native
    
    var links: String = js.native
    
    /**
      * Access the messages
      */
    def messages(): MessageListInstance = js.native
    
    var messagingServiceSid: String = js.native
    
    /**
      * Access the participants
      */
    def participants(): ParticipantListInstance = js.native
    
    /**
      * remove a ConversationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    def remove(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    def remove(opts: ConversationInstanceRemoveOptions): js.Promise[Boolean] = js.native
    def remove(
      opts: ConversationInstanceRemoveOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var state: ConversationState = js.native
    
    var timers: Any = js.native
    
    var uniqueName: String = js.native
    
    /**
      * update a ConversationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ConversationInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ConversationInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ConversationInstance] = js.native
    def update(opts: ConversationInstanceUpdateOptions): js.Promise[ConversationInstance] = js.native
    def update(
      opts: ConversationInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[ConversationInstance] = js.native
    
    var url: String = js.native
    
    /**
      * Access the webhooks
      */
    def webhooks(): WebhookListInstance = js.native
  }
  
  /**
    * Initialize the ConversationList
    *
    * @param version - Version of the resource
    * @param chatServiceSid - The unique ID of the Conversation Service this conversation belongs to.
    */
  inline def ConversationList(version: typings.twilio.conversationsV1Mod.^, chatServiceSid: String): ConversationListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("ConversationList")(version.asInstanceOf[js.Any], chatServiceSid.asInstanceOf[js.Any])).asInstanceOf[ConversationListInstance]
  
  @JSImport("twilio/lib/rest/conversations/v1/service/conversation", "ConversationPage")
  @js.native
  open class ConversationPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.conversationsV1Mod.^, 
          ConversationPayload, 
          ConversationResource, 
          ConversationInstance
        ] {
    /**
      * Initialize the ConversationPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.conversationsV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: ConversationSolution
    ) = this()
    
    /**
      * Build an instance of ConversationInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ConversationPayload): ConversationInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to remove
    *
    * @property xTwilioWebhookEnabled - The X-Twilio-Webhook-Enabled HTTP request header
    */
  trait ConversationInstanceRemoveOptions extends StObject {
    
    var xTwilioWebhookEnabled: js.UndefOr[ConversationWebhookEnabledType] = js.undefined
  }
  object ConversationInstanceRemoveOptions {
    
    inline def apply(): ConversationInstanceRemoveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConversationInstanceRemoveOptions]
    }
    
    extension [Self <: ConversationInstanceRemoveOptions](x: Self) {
      
      inline def setXTwilioWebhookEnabled(value: ConversationWebhookEnabledType): Self = StObject.set(x, "xTwilioWebhookEnabled", value.asInstanceOf[js.Any])
      
      inline def setXTwilioWebhookEnabledUndefined: Self = StObject.set(x, "xTwilioWebhookEnabled", js.undefined)
    }
  }
  
  /**
    * Options to pass to update
    *
    * @property attributes - An optional string metadata field you can use to store any data you wish.
    * @property dateCreated - The date that this resource was created.
    * @property dateUpdated - The date that this resource was last updated.
    * @property friendlyName - The human-readable name of this conversation.
    * @property messagingServiceSid - The unique ID of the Messaging Service this conversation belongs to.
    * @property state - Current state of this conversation.
    * @property timers.closed - ISO8601 duration when conversation will be switched to `closed` state.
    * @property timers.inactive - ISO8601 duration when conversation will be switched to `inactive` state.
    * @property uniqueName - An application-defined string that uniquely identifies the resource
    * @property xTwilioWebhookEnabled - The X-Twilio-Webhook-Enabled HTTP request header
    */
  trait ConversationInstanceUpdateOptions extends StObject {
    
    var attributes: js.UndefOr[String] = js.undefined
    
    var dateCreated: js.UndefOr[js.Date] = js.undefined
    
    var dateUpdated: js.UndefOr[js.Date] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var messagingServiceSid: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[ConversationState] = js.undefined
    
    var timers: js.UndefOr[Closed] = js.undefined
    
    var uniqueName: js.UndefOr[String] = js.undefined
    
    var xTwilioWebhookEnabled: js.UndefOr[ConversationWebhookEnabledType] = js.undefined
  }
  object ConversationInstanceUpdateOptions {
    
    inline def apply(): ConversationInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConversationInstanceUpdateOptions]
    }
    
    extension [Self <: ConversationInstanceUpdateOptions](x: Self) {
      
      inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setDateCreated(value: js.Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
      
      inline def setDateUpdated(value: js.Date): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
      
      inline def setDateUpdatedUndefined: Self = StObject.set(x, "dateUpdated", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setMessagingServiceSid(value: String): Self = StObject.set(x, "messagingServiceSid", value.asInstanceOf[js.Any])
      
      inline def setMessagingServiceSidUndefined: Self = StObject.set(x, "messagingServiceSid", js.undefined)
      
      inline def setState(value: ConversationState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTimers(value: Closed): Self = StObject.set(x, "timers", value.asInstanceOf[js.Any])
      
      inline def setTimersUndefined: Self = StObject.set(x, "timers", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
      
      inline def setXTwilioWebhookEnabled(value: ConversationWebhookEnabledType): Self = StObject.set(x, "xTwilioWebhookEnabled", value.asInstanceOf[js.Any])
      
      inline def setXTwilioWebhookEnabledUndefined: Self = StObject.set(x, "xTwilioWebhookEnabled", js.undefined)
    }
  }
  
  @js.native
  trait ConversationListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): ConversationContext = js.native
    
    /**
      * create a ConversationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[ConversationInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ ConversationInstance, Any]): js.Promise[ConversationInstance] = js.native
    def create(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ ConversationInstance, Any]
    ): js.Promise[ConversationInstance] = js.native
    def create(opts: ConversationListInstanceCreateOptions): js.Promise[ConversationInstance] = js.native
    def create(
      opts: ConversationListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ ConversationInstance, Any]
    ): js.Promise[ConversationInstance] = js.native
    
    /**
      * Streams ConversationInstance records from the API.
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
          /* item */ ConversationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ ConversationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: ConversationListInstanceEachOptions): Unit = js.native
    def each(
      opts: ConversationListInstanceEachOptions,
      callback: js.Function2[
          /* item */ ConversationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a conversation
      *
      * @param sid - A 34 character string that uniquely identifies this resource.
      */
    def get(sid: String): ConversationContext = js.native
    
    /**
      * Retrieve a single target page of ConversationInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[ConversationPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ ConversationPage, Any]): js.Promise[ConversationPage] = js.native
    def getPage(targetUrl: String): js.Promise[ConversationPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConversationPage, Any]
    ): js.Promise[ConversationPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConversationPage, Any]
    ): js.Promise[ConversationPage] = js.native
    
    /**
      * Lists ConversationInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[ConversationInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ConversationInstance], Any]
    ): js.Promise[js.Array[ConversationInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ConversationInstance], Any]
    ): js.Promise[js.Array[ConversationInstance]] = js.native
    def list(opts: ConversationListInstanceOptions): js.Promise[js.Array[ConversationInstance]] = js.native
    def list(
      opts: ConversationListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ConversationInstance], Any]
    ): js.Promise[js.Array[ConversationInstance]] = js.native
    
    /**
      * Retrieve a single page of ConversationInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[ConversationPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ ConversationPage, Any]): js.Promise[ConversationPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ ConversationPage, Any]): js.Promise[ConversationPage] = js.native
    def page(opts: ConversationListInstancePageOptions): js.Promise[ConversationPage] = js.native
    def page(
      opts: ConversationListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConversationPage, Any]
    ): js.Promise[ConversationPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property attributes - An optional string metadata field you can use to store any data you wish.
    * @property dateCreated - The date that this resource was created.
    * @property dateUpdated - The date that this resource was last updated.
    * @property friendlyName - The human-readable name of this conversation.
    * @property messagingServiceSid - The unique ID of the Messaging Service this conversation belongs to.
    * @property state - Current state of this conversation.
    * @property timers.closed - ISO8601 duration when conversation will be switched to `closed` state.
    * @property timers.inactive - ISO8601 duration when conversation will be switched to `inactive` state.
    * @property uniqueName - An application-defined string that uniquely identifies the resource
    * @property xTwilioWebhookEnabled - The X-Twilio-Webhook-Enabled HTTP request header
    */
  trait ConversationListInstanceCreateOptions extends StObject {
    
    var attributes: js.UndefOr[String] = js.undefined
    
    var dateCreated: js.UndefOr[js.Date] = js.undefined
    
    var dateUpdated: js.UndefOr[js.Date] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var messagingServiceSid: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[ConversationState] = js.undefined
    
    var timers: js.UndefOr[Closed] = js.undefined
    
    var uniqueName: js.UndefOr[String] = js.undefined
    
    var xTwilioWebhookEnabled: js.UndefOr[ConversationWebhookEnabledType] = js.undefined
  }
  object ConversationListInstanceCreateOptions {
    
    inline def apply(): ConversationListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConversationListInstanceCreateOptions]
    }
    
    extension [Self <: ConversationListInstanceCreateOptions](x: Self) {
      
      inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setDateCreated(value: js.Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
      
      inline def setDateUpdated(value: js.Date): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
      
      inline def setDateUpdatedUndefined: Self = StObject.set(x, "dateUpdated", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setMessagingServiceSid(value: String): Self = StObject.set(x, "messagingServiceSid", value.asInstanceOf[js.Any])
      
      inline def setMessagingServiceSidUndefined: Self = StObject.set(x, "messagingServiceSid", js.undefined)
      
      inline def setState(value: ConversationState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTimers(value: Closed): Self = StObject.set(x, "timers", value.asInstanceOf[js.Any])
      
      inline def setTimersUndefined: Self = StObject.set(x, "timers", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
      
      inline def setXTwilioWebhookEnabled(value: ConversationWebhookEnabledType): Self = StObject.set(x, "xTwilioWebhookEnabled", value.asInstanceOf[js.Any])
      
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
  trait ConversationListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ ConversationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ConversationListInstanceEachOptions {
    
    inline def apply(): ConversationListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConversationListInstanceEachOptions]
    }
    
    extension [Self <: ConversationListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ ConversationInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait ConversationListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ConversationListInstanceOptions {
    
    inline def apply(): ConversationListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConversationListInstanceOptions]
    }
    
    extension [Self <: ConversationListInstanceOptions](x: Self) {
      
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
  trait ConversationListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object ConversationListInstancePageOptions {
    
    inline def apply(): ConversationListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConversationListInstancePageOptions]
    }
    
    extension [Self <: ConversationListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait ConversationPayload
    extends StObject
       with ConversationResource
       with TwilioResponsePayload
  object ConversationPayload {
    
    inline def apply(
      account_sid: String,
      attributes: String,
      bindings: js.Object,
      chat_service_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      friendly_name: String,
      links: String,
      messaging_service_sid: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      state: ConversationState,
      timers: js.Object,
      unique_name: String,
      uri: String,
      url: String
    ): ConversationPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], bindings = bindings.asInstanceOf[js.Any], chat_service_sid = chat_service_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], messaging_service_sid = messaging_service_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], timers = timers.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConversationPayload]
    }
  }
  
  trait ConversationResource extends StObject {
    
    var account_sid: String
    
    var attributes: String
    
    var bindings: js.Object
    
    var chat_service_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var links: String
    
    var messaging_service_sid: String
    
    var sid: String
    
    var state: ConversationState
    
    var timers: js.Object
    
    var unique_name: String
    
    var url: String
  }
  object ConversationResource {
    
    inline def apply(
      account_sid: String,
      attributes: String,
      bindings: js.Object,
      chat_service_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      links: String,
      messaging_service_sid: String,
      sid: String,
      state: ConversationState,
      timers: js.Object,
      unique_name: String,
      url: String
    ): ConversationResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], bindings = bindings.asInstanceOf[js.Any], chat_service_sid = chat_service_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], messaging_service_sid = messaging_service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], timers = timers.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConversationResource]
    }
    
    extension [Self <: ConversationResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setBindings(value: js.Object): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
      
      inline def setChat_service_sid(value: String): Self = StObject.set(x, "chat_service_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setMessaging_service_sid(value: String): Self = StObject.set(x, "messaging_service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setState(value: ConversationState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setTimers(value: js.Object): Self = StObject.set(x, "timers", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConversationSolution extends StObject {
    
    var chatServiceSid: js.UndefOr[String] = js.undefined
  }
  object ConversationSolution {
    
    inline def apply(): ConversationSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConversationSolution]
    }
    
    extension [Self <: ConversationSolution](x: Self) {
      
      inline def setChatServiceSid(value: String): Self = StObject.set(x, "chatServiceSid", value.asInstanceOf[js.Any])
      
      inline def setChatServiceSidUndefined: Self = StObject.set(x, "chatServiceSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.inactive_
    - typings.twilio.twilioStrings.active_
    - typings.twilio.twilioStrings.closed
  */
  trait ConversationState extends StObject
  object ConversationState {
    
    inline def active: active_ = "active".asInstanceOf[active_]
    
    inline def closed: typings.twilio.twilioStrings.closed = "closed".asInstanceOf[typings.twilio.twilioStrings.closed]
    
    inline def inactive: inactive_ = "inactive".asInstanceOf[inactive_]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.`true`
    - typings.twilio.twilioStrings.`false`
  */
  trait ConversationWebhookEnabledType extends StObject
  object ConversationWebhookEnabledType {
    
    inline def `false`: typings.twilio.twilioStrings.`false` = "false".asInstanceOf[typings.twilio.twilioStrings.`false`]
    
    inline def `true`: typings.twilio.twilioStrings.`true` = "true".asInstanceOf[typings.twilio.twilioStrings.`true`]
  }
}
