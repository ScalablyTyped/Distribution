package typings.twilio

import typings.twilio.anon.Address
import typings.twilio.anon.ProjectedAddress
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceConversationParticipantMod {
  
  @JSImport("twilio/lib/rest/conversations/v1/service/conversation/participant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/conversations/v1/service/conversation/participant", "ParticipantContext")
  @js.native
  open class ParticipantContext protected () extends StObject {
    /**
      * Initialize the ParticipantContext
      *
      * @param version - Version of the resource
      * @param chatServiceSid - The SID of the Conversation Service that the resource is associated with.
      * @param conversationSid - The unique ID of the Conversation for this participant.
      * @param sid - A 34 character string that uniquely identifies this resource.
      */
    def this(
      version: typings.twilio.conversationsV1Mod.^,
      chatServiceSid: String,
      conversationSid: String,
      sid: String
    ) = this()
    
    /**
      * fetch a ParticipantInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ParticipantInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantInstance, Any]): js.Promise[ParticipantInstance] = js.native
    
    /**
      * remove a ParticipantInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantInstance, Any]): js.Promise[Boolean] = js.native
    def remove(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantInstance, Any]
    ): js.Promise[Boolean] = js.native
    def remove(opts: ParticipantInstanceRemoveOptions): js.Promise[Boolean] = js.native
    def remove(
      opts: ParticipantInstanceRemoveOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantInstance, Any]
    ): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a ParticipantInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ParticipantInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantInstance, Any]): js.Promise[ParticipantInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantInstance, Any]
    ): js.Promise[ParticipantInstance] = js.native
    def update(opts: ParticipantInstanceUpdateOptions): js.Promise[ParticipantInstance] = js.native
    def update(
      opts: ParticipantInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantInstance, Any]
    ): js.Promise[ParticipantInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/conversations/v1/service/conversation/participant", "ParticipantInstance")
  @js.native
  open class ParticipantInstance protected () extends SerializableClass {
    /**
      * Initialize the ParticipantContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param chatServiceSid - The SID of the Conversation Service that the resource is associated with.
      * @param conversationSid - The unique ID of the Conversation for this participant.
      * @param sid - A 34 character string that uniquely identifies this resource.
      */
    def this(
      version: typings.twilio.conversationsV1Mod.^,
      payload: ParticipantPayload,
      chatServiceSid: String,
      conversationSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: ParticipantContext = js.native
    
    var accountSid: String = js.native
    
    var attributes: String = js.native
    
    var chatServiceSid: String = js.native
    
    var conversationSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a ParticipantInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ParticipantInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ParticipantInstance] = js.native
    
    var identity: String = js.native
    
    var lastReadMessageIndex: Double = js.native
    
    var lastReadTimestamp: String = js.native
    
    var messagingBinding: Any = js.native
    
    /**
      * remove a ParticipantInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    def remove(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    def remove(opts: ParticipantInstanceRemoveOptions): js.Promise[Boolean] = js.native
    def remove(
      opts: ParticipantInstanceRemoveOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[Boolean] = js.native
    
    var roleSid: String = js.native
    
    var sid: String = js.native
    
    /**
      * update a ParticipantInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ParticipantInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ParticipantInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ParticipantInstance] = js.native
    def update(opts: ParticipantInstanceUpdateOptions): js.Promise[ParticipantInstance] = js.native
    def update(
      opts: ParticipantInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[ParticipantInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the ParticipantList
    *
    * @param version - Version of the resource
    * @param chatServiceSid - The SID of the Conversation Service that the resource is associated with.
    * @param conversationSid - The unique ID of the Conversation for this participant.
    */
  inline def ParticipantList(version: typings.twilio.conversationsV1Mod.^, chatServiceSid: String, conversationSid: String): ParticipantListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("ParticipantList")(version.asInstanceOf[js.Any], chatServiceSid.asInstanceOf[js.Any], conversationSid.asInstanceOf[js.Any])).asInstanceOf[ParticipantListInstance]
  
  @JSImport("twilio/lib/rest/conversations/v1/service/conversation/participant", "ParticipantPage")
  @js.native
  open class ParticipantPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.conversationsV1Mod.^, 
          ParticipantPayload, 
          ParticipantResource, 
          ParticipantInstance
        ] {
    /**
      * Initialize the ParticipantPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.conversationsV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: ParticipantSolution
    ) = this()
    
    /**
      * Build an instance of ParticipantInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ParticipantPayload): ParticipantInstance = js.native
    
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
  trait ParticipantInstanceRemoveOptions extends StObject {
    
    var xTwilioWebhookEnabled: js.UndefOr[ParticipantWebhookEnabledType] = js.undefined
  }
  object ParticipantInstanceRemoveOptions {
    
    inline def apply(): ParticipantInstanceRemoveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParticipantInstanceRemoveOptions]
    }
    
    extension [Self <: ParticipantInstanceRemoveOptions](x: Self) {
      
      inline def setXTwilioWebhookEnabled(value: ParticipantWebhookEnabledType): Self = StObject.set(x, "xTwilioWebhookEnabled", value.asInstanceOf[js.Any])
      
      inline def setXTwilioWebhookEnabledUndefined: Self = StObject.set(x, "xTwilioWebhookEnabled", js.undefined)
    }
  }
  
  /**
    * Options to pass to update
    *
    * @property attributes - An optional string metadata field you can use to store any data you wish.
    * @property dateCreated - The date that this resource was created.
    * @property dateUpdated - The date that this resource was last updated.
    * @property identity - A unique string identifier for the conversation participant as Conversation User.
    * @property lastReadMessageIndex - Index of last “read” message in the Conversation for the Participant.
    * @property lastReadTimestamp - Timestamp of last “read” message in the Conversation for the Participant.
    * @property messagingBinding.projectedAddress - The address of the Twilio phone number that is used in Group MMS.
    * @property messagingBinding.proxyAddress - The address of the Twilio phone number that the participant is in contact with.
    * @property roleSid - The SID of a conversation-level Role to assign to the participant
    * @property xTwilioWebhookEnabled - The X-Twilio-Webhook-Enabled HTTP request header
    */
  trait ParticipantInstanceUpdateOptions extends StObject {
    
    var attributes: js.UndefOr[String] = js.undefined
    
    var dateCreated: js.UndefOr[js.Date] = js.undefined
    
    var dateUpdated: js.UndefOr[js.Date] = js.undefined
    
    var identity: js.UndefOr[String] = js.undefined
    
    var lastReadMessageIndex: js.UndefOr[Double] = js.undefined
    
    var lastReadTimestamp: js.UndefOr[String] = js.undefined
    
    var messagingBinding: js.UndefOr[ProjectedAddress] = js.undefined
    
    var roleSid: js.UndefOr[String] = js.undefined
    
    var xTwilioWebhookEnabled: js.UndefOr[ParticipantWebhookEnabledType] = js.undefined
  }
  object ParticipantInstanceUpdateOptions {
    
    inline def apply(): ParticipantInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParticipantInstanceUpdateOptions]
    }
    
    extension [Self <: ParticipantInstanceUpdateOptions](x: Self) {
      
      inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setDateCreated(value: js.Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
      
      inline def setDateUpdated(value: js.Date): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
      
      inline def setDateUpdatedUndefined: Self = StObject.set(x, "dateUpdated", js.undefined)
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setLastReadMessageIndex(value: Double): Self = StObject.set(x, "lastReadMessageIndex", value.asInstanceOf[js.Any])
      
      inline def setLastReadMessageIndexUndefined: Self = StObject.set(x, "lastReadMessageIndex", js.undefined)
      
      inline def setLastReadTimestamp(value: String): Self = StObject.set(x, "lastReadTimestamp", value.asInstanceOf[js.Any])
      
      inline def setLastReadTimestampUndefined: Self = StObject.set(x, "lastReadTimestamp", js.undefined)
      
      inline def setMessagingBinding(value: ProjectedAddress): Self = StObject.set(x, "messagingBinding", value.asInstanceOf[js.Any])
      
      inline def setMessagingBindingUndefined: Self = StObject.set(x, "messagingBinding", js.undefined)
      
      inline def setRoleSid(value: String): Self = StObject.set(x, "roleSid", value.asInstanceOf[js.Any])
      
      inline def setRoleSidUndefined: Self = StObject.set(x, "roleSid", js.undefined)
      
      inline def setXTwilioWebhookEnabled(value: ParticipantWebhookEnabledType): Self = StObject.set(x, "xTwilioWebhookEnabled", value.asInstanceOf[js.Any])
      
      inline def setXTwilioWebhookEnabledUndefined: Self = StObject.set(x, "xTwilioWebhookEnabled", js.undefined)
    }
  }
  
  @js.native
  trait ParticipantListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): ParticipantContext = js.native
    
    /**
      * create a ParticipantInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[ParticipantInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ ParticipantInstance, Any]): js.Promise[ParticipantInstance] = js.native
    def create(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ ParticipantInstance, Any]
    ): js.Promise[ParticipantInstance] = js.native
    def create(opts: ParticipantListInstanceCreateOptions): js.Promise[ParticipantInstance] = js.native
    def create(
      opts: ParticipantListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ ParticipantInstance, Any]
    ): js.Promise[ParticipantInstance] = js.native
    
    /**
      * Streams ParticipantInstance records from the API.
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
          /* item */ ParticipantInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ ParticipantInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: ParticipantListInstanceEachOptions): Unit = js.native
    def each(
      opts: ParticipantListInstanceEachOptions,
      callback: js.Function2[
          /* item */ ParticipantInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a participant
      *
      * @param sid - A 34 character string that uniquely identifies this resource.
      */
    def get(sid: String): ParticipantContext = js.native
    
    /**
      * Retrieve a single target page of ParticipantInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[ParticipantPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantPage, Any]): js.Promise[ParticipantPage] = js.native
    def getPage(targetUrl: String): js.Promise[ParticipantPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantPage, Any]
    ): js.Promise[ParticipantPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantPage, Any]
    ): js.Promise[ParticipantPage] = js.native
    
    /**
      * Lists ParticipantInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[ParticipantInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ParticipantInstance], Any]
    ): js.Promise[js.Array[ParticipantInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ParticipantInstance], Any]
    ): js.Promise[js.Array[ParticipantInstance]] = js.native
    def list(opts: ParticipantListInstanceOptions): js.Promise[js.Array[ParticipantInstance]] = js.native
    def list(
      opts: ParticipantListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ParticipantInstance], Any]
    ): js.Promise[js.Array[ParticipantInstance]] = js.native
    
    /**
      * Retrieve a single page of ParticipantInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[ParticipantPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantPage, Any]): js.Promise[ParticipantPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantPage, Any]): js.Promise[ParticipantPage] = js.native
    def page(opts: ParticipantListInstancePageOptions): js.Promise[ParticipantPage] = js.native
    def page(
      opts: ParticipantListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantPage, Any]
    ): js.Promise[ParticipantPage] = js.native
    
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
    * @property identity - A unique string identifier for the conversation participant as Conversation User.
    * @property messagingBinding.address - The address of the participant's device.
    * @property messagingBinding.projectedAddress - The address of the Twilio phone number that is used in Group MMS.
    * @property messagingBinding.proxyAddress - The address of the Twilio phone number that the participant is in contact with.
    * @property roleSid - The SID of a conversation-level Role to assign to the participant
    * @property xTwilioWebhookEnabled - The X-Twilio-Webhook-Enabled HTTP request header
    */
  trait ParticipantListInstanceCreateOptions extends StObject {
    
    var attributes: js.UndefOr[String] = js.undefined
    
    var dateCreated: js.UndefOr[js.Date] = js.undefined
    
    var dateUpdated: js.UndefOr[js.Date] = js.undefined
    
    var identity: js.UndefOr[String] = js.undefined
    
    var messagingBinding: js.UndefOr[Address] = js.undefined
    
    var roleSid: js.UndefOr[String] = js.undefined
    
    var xTwilioWebhookEnabled: js.UndefOr[ParticipantWebhookEnabledType] = js.undefined
  }
  object ParticipantListInstanceCreateOptions {
    
    inline def apply(): ParticipantListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParticipantListInstanceCreateOptions]
    }
    
    extension [Self <: ParticipantListInstanceCreateOptions](x: Self) {
      
      inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setDateCreated(value: js.Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
      
      inline def setDateUpdated(value: js.Date): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
      
      inline def setDateUpdatedUndefined: Self = StObject.set(x, "dateUpdated", js.undefined)
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setMessagingBinding(value: Address): Self = StObject.set(x, "messagingBinding", value.asInstanceOf[js.Any])
      
      inline def setMessagingBindingUndefined: Self = StObject.set(x, "messagingBinding", js.undefined)
      
      inline def setRoleSid(value: String): Self = StObject.set(x, "roleSid", value.asInstanceOf[js.Any])
      
      inline def setRoleSidUndefined: Self = StObject.set(x, "roleSid", js.undefined)
      
      inline def setXTwilioWebhookEnabled(value: ParticipantWebhookEnabledType): Self = StObject.set(x, "xTwilioWebhookEnabled", value.asInstanceOf[js.Any])
      
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
  trait ParticipantListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ ParticipantInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ParticipantListInstanceEachOptions {
    
    inline def apply(): ParticipantListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParticipantListInstanceEachOptions]
    }
    
    extension [Self <: ParticipantListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ ParticipantInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait ParticipantListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ParticipantListInstanceOptions {
    
    inline def apply(): ParticipantListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParticipantListInstanceOptions]
    }
    
    extension [Self <: ParticipantListInstanceOptions](x: Self) {
      
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
  trait ParticipantListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object ParticipantListInstancePageOptions {
    
    inline def apply(): ParticipantListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParticipantListInstancePageOptions]
    }
    
    extension [Self <: ParticipantListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait ParticipantPayload
    extends StObject
       with ParticipantResource
       with TwilioResponsePayload
  object ParticipantPayload {
    
    inline def apply(
      account_sid: String,
      attributes: String,
      chat_service_sid: String,
      conversation_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      identity: String,
      last_read_message_index: Double,
      last_read_timestamp: String,
      messaging_binding: js.Object,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      role_sid: String,
      sid: String,
      uri: String,
      url: String
    ): ParticipantPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], chat_service_sid = chat_service_sid.asInstanceOf[js.Any], conversation_sid = conversation_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], last_read_message_index = last_read_message_index.asInstanceOf[js.Any], last_read_timestamp = last_read_timestamp.asInstanceOf[js.Any], messaging_binding = messaging_binding.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], role_sid = role_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParticipantPayload]
    }
  }
  
  trait ParticipantResource extends StObject {
    
    var account_sid: String
    
    var attributes: String
    
    var chat_service_sid: String
    
    var conversation_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var identity: String
    
    var last_read_message_index: Double
    
    var last_read_timestamp: String
    
    var messaging_binding: js.Object
    
    var role_sid: String
    
    var sid: String
    
    var url: String
  }
  object ParticipantResource {
    
    inline def apply(
      account_sid: String,
      attributes: String,
      chat_service_sid: String,
      conversation_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      identity: String,
      last_read_message_index: Double,
      last_read_timestamp: String,
      messaging_binding: js.Object,
      role_sid: String,
      sid: String,
      url: String
    ): ParticipantResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], chat_service_sid = chat_service_sid.asInstanceOf[js.Any], conversation_sid = conversation_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], last_read_message_index = last_read_message_index.asInstanceOf[js.Any], last_read_timestamp = last_read_timestamp.asInstanceOf[js.Any], messaging_binding = messaging_binding.asInstanceOf[js.Any], role_sid = role_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParticipantResource]
    }
    
    extension [Self <: ParticipantResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setChat_service_sid(value: String): Self = StObject.set(x, "chat_service_sid", value.asInstanceOf[js.Any])
      
      inline def setConversation_sid(value: String): Self = StObject.set(x, "conversation_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setLast_read_message_index(value: Double): Self = StObject.set(x, "last_read_message_index", value.asInstanceOf[js.Any])
      
      inline def setLast_read_timestamp(value: String): Self = StObject.set(x, "last_read_timestamp", value.asInstanceOf[js.Any])
      
      inline def setMessaging_binding(value: js.Object): Self = StObject.set(x, "messaging_binding", value.asInstanceOf[js.Any])
      
      inline def setRole_sid(value: String): Self = StObject.set(x, "role_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParticipantSolution extends StObject {
    
    var chatServiceSid: js.UndefOr[String] = js.undefined
    
    var conversationSid: js.UndefOr[String] = js.undefined
  }
  object ParticipantSolution {
    
    inline def apply(): ParticipantSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParticipantSolution]
    }
    
    extension [Self <: ParticipantSolution](x: Self) {
      
      inline def setChatServiceSid(value: String): Self = StObject.set(x, "chatServiceSid", value.asInstanceOf[js.Any])
      
      inline def setChatServiceSidUndefined: Self = StObject.set(x, "chatServiceSid", js.undefined)
      
      inline def setConversationSid(value: String): Self = StObject.set(x, "conversationSid", value.asInstanceOf[js.Any])
      
      inline def setConversationSidUndefined: Self = StObject.set(x, "conversationSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.`true`
    - typings.twilio.twilioStrings.`false`
  */
  trait ParticipantWebhookEnabledType extends StObject
  object ParticipantWebhookEnabledType {
    
    inline def `false`: typings.twilio.twilioStrings.`false` = "false".asInstanceOf[typings.twilio.twilioStrings.`false`]
    
    inline def `true`: typings.twilio.twilioStrings.`true` = "true".asInstanceOf[typings.twilio.twilioStrings.`true`]
  }
}
