package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.messageDeliveryReceiptMod.DeliveryReceiptContext
import typings.twilio.messageDeliveryReceiptMod.DeliveryReceiptListInstance
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.asc_
import typings.twilio.twilioStrings.desc_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceConversationMessageMod {
  
  @JSImport("twilio/lib/rest/conversations/v1/service/conversation/message", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/conversations/v1/service/conversation/message", "MessageContext")
  @js.native
  open class MessageContext protected () extends StObject {
    /**
      * Initialize the MessageContext
      *
      * @param version - Version of the resource
      * @param chatServiceSid - The SID of the Conversation Service that the resource is associated with.
      * @param conversationSid - The unique ID of the Conversation for this message.
      * @param sid - A 34 character string that uniquely identifies this resource.
      */
    def this(
      version: typings.twilio.conversationsV1Mod.^,
      chatServiceSid: String,
      conversationSid: String,
      sid: String
    ) = this()
    
    /**
      * @param sid - sid of instance
      */
    def deliveryReceipts(sid: String): DeliveryReceiptContext = js.native
    @JSName("deliveryReceipts")
    var deliveryReceipts_Original: DeliveryReceiptListInstance = js.native
    
    /**
      * fetch a MessageInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[MessageInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ MessageInstance, Any]): js.Promise[MessageInstance] = js.native
    
    /**
      * remove a MessageInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ MessageInstance, Any]): js.Promise[Boolean] = js.native
    def remove(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ MessageInstance, Any]): js.Promise[Boolean] = js.native
    def remove(opts: MessageInstanceRemoveOptions): js.Promise[Boolean] = js.native
    def remove(
      opts: MessageInstanceRemoveOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ MessageInstance, Any]
    ): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a MessageInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[MessageInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ MessageInstance, Any]): js.Promise[MessageInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ MessageInstance, Any]): js.Promise[MessageInstance] = js.native
    def update(opts: MessageInstanceUpdateOptions): js.Promise[MessageInstance] = js.native
    def update(
      opts: MessageInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ MessageInstance, Any]
    ): js.Promise[MessageInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/conversations/v1/service/conversation/message", "MessageInstance")
  @js.native
  open class MessageInstance protected () extends SerializableClass {
    /**
      * Initialize the MessageContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param chatServiceSid - The SID of the Conversation Service that the resource is associated with.
      * @param conversationSid - The unique ID of the Conversation for this message.
      * @param sid - A 34 character string that uniquely identifies this resource.
      */
    def this(
      version: typings.twilio.conversationsV1Mod.^,
      payload: MessagePayload,
      chatServiceSid: String,
      conversationSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: MessageContext = js.native
    
    var accountSid: String = js.native
    
    var attributes: String = js.native
    
    var author: String = js.native
    
    var body: String = js.native
    
    var chatServiceSid: String = js.native
    
    var conversationSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var delivery: Any = js.native
    
    /**
      * Access the deliveryReceipts
      */
    def deliveryReceipts(): DeliveryReceiptListInstance = js.native
    
    /**
      * fetch a MessageInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[MessageInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[MessageInstance] = js.native
    
    var index: Double = js.native
    
    var links: String = js.native
    
    var media: js.Array[js.Object] = js.native
    
    var participantSid: String = js.native
    
    /**
      * remove a MessageInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    def remove(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    def remove(opts: MessageInstanceRemoveOptions): js.Promise[Boolean] = js.native
    def remove(
      opts: MessageInstanceRemoveOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    /**
      * update a MessageInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[MessageInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[MessageInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[MessageInstance] = js.native
    def update(opts: MessageInstanceUpdateOptions): js.Promise[MessageInstance] = js.native
    def update(
      opts: MessageInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[MessageInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the MessageList
    *
    * @param version - Version of the resource
    * @param chatServiceSid - The SID of the Conversation Service that the resource is associated with.
    * @param conversationSid - The unique ID of the Conversation for this message.
    */
  inline def MessageList(version: typings.twilio.conversationsV1Mod.^, chatServiceSid: String, conversationSid: String): MessageListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("MessageList")(version.asInstanceOf[js.Any], chatServiceSid.asInstanceOf[js.Any], conversationSid.asInstanceOf[js.Any])).asInstanceOf[MessageListInstance]
  
  @JSImport("twilio/lib/rest/conversations/v1/service/conversation/message", "MessagePage")
  @js.native
  open class MessagePage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.conversationsV1Mod.^, MessagePayload, MessageResource, MessageInstance] {
    /**
      * Initialize the MessagePage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.conversationsV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: MessageSolution
    ) = this()
    
    /**
      * Build an instance of MessageInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: MessagePayload): MessageInstance = js.native
    
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
  trait MessageInstanceRemoveOptions extends StObject {
    
    var xTwilioWebhookEnabled: js.UndefOr[MessageWebhookEnabledType] = js.undefined
  }
  object MessageInstanceRemoveOptions {
    
    inline def apply(): MessageInstanceRemoveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageInstanceRemoveOptions]
    }
    
    extension [Self <: MessageInstanceRemoveOptions](x: Self) {
      
      inline def setXTwilioWebhookEnabled(value: MessageWebhookEnabledType): Self = StObject.set(x, "xTwilioWebhookEnabled", value.asInstanceOf[js.Any])
      
      inline def setXTwilioWebhookEnabledUndefined: Self = StObject.set(x, "xTwilioWebhookEnabled", js.undefined)
    }
  }
  
  /**
    * Options to pass to update
    *
    * @property attributes - A string metadata field you can use to store any data you wish.
    * @property author - The channel specific identifier of the message's author.
    * @property body - The content of the message.
    * @property dateCreated - The date that this resource was created.
    * @property dateUpdated - The date that this resource was last updated.
    * @property xTwilioWebhookEnabled - The X-Twilio-Webhook-Enabled HTTP request header
    */
  trait MessageInstanceUpdateOptions extends StObject {
    
    var attributes: js.UndefOr[String] = js.undefined
    
    var author: js.UndefOr[String] = js.undefined
    
    var body: js.UndefOr[String] = js.undefined
    
    var dateCreated: js.UndefOr[js.Date] = js.undefined
    
    var dateUpdated: js.UndefOr[js.Date] = js.undefined
    
    var xTwilioWebhookEnabled: js.UndefOr[MessageWebhookEnabledType] = js.undefined
  }
  object MessageInstanceUpdateOptions {
    
    inline def apply(): MessageInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageInstanceUpdateOptions]
    }
    
    extension [Self <: MessageInstanceUpdateOptions](x: Self) {
      
      inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setDateCreated(value: js.Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
      
      inline def setDateUpdated(value: js.Date): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
      
      inline def setDateUpdatedUndefined: Self = StObject.set(x, "dateUpdated", js.undefined)
      
      inline def setXTwilioWebhookEnabled(value: MessageWebhookEnabledType): Self = StObject.set(x, "xTwilioWebhookEnabled", value.asInstanceOf[js.Any])
      
      inline def setXTwilioWebhookEnabledUndefined: Self = StObject.set(x, "xTwilioWebhookEnabled", js.undefined)
    }
  }
  
  @js.native
  trait MessageListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): MessageContext = js.native
    
    /**
      * create a MessageInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[MessageInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ MessageInstance, Any]): js.Promise[MessageInstance] = js.native
    def create(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* item */ MessageInstance, Any]): js.Promise[MessageInstance] = js.native
    def create(opts: MessageListInstanceCreateOptions): js.Promise[MessageInstance] = js.native
    def create(
      opts: MessageListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ MessageInstance, Any]
    ): js.Promise[MessageInstance] = js.native
    
    /**
      * Streams MessageInstance records from the API.
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
          /* item */ MessageInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ MessageInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: MessageListInstanceEachOptions): Unit = js.native
    def each(
      opts: MessageListInstanceEachOptions,
      callback: js.Function2[
          /* item */ MessageInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a message
      *
      * @param sid - A 34 character string that uniquely identifies this resource.
      */
    def get(sid: String): MessageContext = js.native
    
    /**
      * Retrieve a single target page of MessageInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[MessagePage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ MessagePage, Any]): js.Promise[MessagePage] = js.native
    def getPage(targetUrl: String): js.Promise[MessagePage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ MessagePage, Any]
    ): js.Promise[MessagePage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ MessagePage, Any]): js.Promise[MessagePage] = js.native
    
    /**
      * Lists MessageInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[MessageInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[MessageInstance], Any]): js.Promise[js.Array[MessageInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[MessageInstance], Any]
    ): js.Promise[js.Array[MessageInstance]] = js.native
    def list(opts: MessageListInstanceOptions): js.Promise[js.Array[MessageInstance]] = js.native
    def list(
      opts: MessageListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[MessageInstance], Any]
    ): js.Promise[js.Array[MessageInstance]] = js.native
    
    /**
      * Retrieve a single page of MessageInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[MessagePage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ MessagePage, Any]): js.Promise[MessagePage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ MessagePage, Any]): js.Promise[MessagePage] = js.native
    def page(opts: MessageListInstancePageOptions): js.Promise[MessagePage] = js.native
    def page(
      opts: MessageListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ MessagePage, Any]
    ): js.Promise[MessagePage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property attributes - A string metadata field you can use to store any data you wish.
    * @property author - The channel specific identifier of the message's author.
    * @property body - The content of the message.
    * @property dateCreated - The date that this resource was created.
    * @property dateUpdated - The date that this resource was last updated.
    * @property mediaSid - The Media SID to be attached to the new Message.
    * @property xTwilioWebhookEnabled - The X-Twilio-Webhook-Enabled HTTP request header
    */
  trait MessageListInstanceCreateOptions extends StObject {
    
    var attributes: js.UndefOr[String] = js.undefined
    
    var author: js.UndefOr[String] = js.undefined
    
    var body: js.UndefOr[String] = js.undefined
    
    var dateCreated: js.UndefOr[js.Date] = js.undefined
    
    var dateUpdated: js.UndefOr[js.Date] = js.undefined
    
    var mediaSid: js.UndefOr[String] = js.undefined
    
    var xTwilioWebhookEnabled: js.UndefOr[MessageWebhookEnabledType] = js.undefined
  }
  object MessageListInstanceCreateOptions {
    
    inline def apply(): MessageListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageListInstanceCreateOptions]
    }
    
    extension [Self <: MessageListInstanceCreateOptions](x: Self) {
      
      inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setDateCreated(value: js.Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
      
      inline def setDateUpdated(value: js.Date): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
      
      inline def setDateUpdatedUndefined: Self = StObject.set(x, "dateUpdated", js.undefined)
      
      inline def setMediaSid(value: String): Self = StObject.set(x, "mediaSid", value.asInstanceOf[js.Any])
      
      inline def setMediaSidUndefined: Self = StObject.set(x, "mediaSid", js.undefined)
      
      inline def setXTwilioWebhookEnabled(value: MessageWebhookEnabledType): Self = StObject.set(x, "xTwilioWebhookEnabled", value.asInstanceOf[js.Any])
      
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
    * @property order - The sort order of the returned messages
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no pageSize is defined but a limit is defined,
    *                         each() will attempt to read the limit with the most efficient
    *                         page size, i.e. min(limit, 1000)
    */
  trait MessageListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ MessageInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var order: js.UndefOr[MessageOrderType] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object MessageListInstanceEachOptions {
    
    inline def apply(): MessageListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageListInstanceEachOptions]
    }
    
    extension [Self <: MessageListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ MessageInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setOrder(value: MessageOrderType): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
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
    * @property order - The sort order of the returned messages
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no page_size is defined but a limit is defined,
    *                         list() will attempt to read the limit with the most
    *                         efficient page size, i.e. min(limit, 1000)
    */
  trait MessageListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var order: js.UndefOr[MessageOrderType] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object MessageListInstanceOptions {
    
    inline def apply(): MessageListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageListInstanceOptions]
    }
    
    extension [Self <: MessageListInstanceOptions](x: Self) {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setOrder(value: MessageOrderType): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property order - The sort order of the returned messages
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait MessageListInstancePageOptions extends StObject {
    
    var order: js.UndefOr[MessageOrderType] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object MessageListInstancePageOptions {
    
    inline def apply(): MessageListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageListInstancePageOptions]
    }
    
    extension [Self <: MessageListInstancePageOptions](x: Self) {
      
      inline def setOrder(value: MessageOrderType): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.asc_
    - typings.twilio.twilioStrings.desc_
  */
  trait MessageOrderType extends StObject
  object MessageOrderType {
    
    inline def asc: asc_ = "asc".asInstanceOf[asc_]
    
    inline def desc: desc_ = "desc".asInstanceOf[desc_]
  }
  
  trait MessagePayload
    extends StObject
       with MessageResource
       with TwilioResponsePayload
  object MessagePayload {
    
    inline def apply(
      account_sid: String,
      attributes: String,
      author: String,
      body: String,
      chat_service_sid: String,
      conversation_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      delivery: js.Object,
      first_page_uri: String,
      index: Double,
      links: String,
      media: js.Array[js.Object],
      next_page_uri: String,
      page: Double,
      page_size: Double,
      participant_sid: String,
      previous_page_uri: String,
      sid: String,
      uri: String,
      url: String
    ): MessagePayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], chat_service_sid = chat_service_sid.asInstanceOf[js.Any], conversation_sid = conversation_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], delivery = delivery.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], participant_sid = participant_sid.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessagePayload]
    }
  }
  
  trait MessageResource extends StObject {
    
    var account_sid: String
    
    var attributes: String
    
    var author: String
    
    var body: String
    
    var chat_service_sid: String
    
    var conversation_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var delivery: js.Object
    
    var index: Double
    
    var links: String
    
    var media: js.Array[js.Object]
    
    var participant_sid: String
    
    var sid: String
    
    var url: String
  }
  object MessageResource {
    
    inline def apply(
      account_sid: String,
      attributes: String,
      author: String,
      body: String,
      chat_service_sid: String,
      conversation_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      delivery: js.Object,
      index: Double,
      links: String,
      media: js.Array[js.Object],
      participant_sid: String,
      sid: String,
      url: String
    ): MessageResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], chat_service_sid = chat_service_sid.asInstanceOf[js.Any], conversation_sid = conversation_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], delivery = delivery.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], participant_sid = participant_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageResource]
    }
    
    extension [Self <: MessageResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setChat_service_sid(value: String): Self = StObject.set(x, "chat_service_sid", value.asInstanceOf[js.Any])
      
      inline def setConversation_sid(value: String): Self = StObject.set(x, "conversation_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDelivery(value: js.Object): Self = StObject.set(x, "delivery", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setMedia(value: js.Array[js.Object]): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setMediaVarargs(value: js.Object*): Self = StObject.set(x, "media", js.Array(value*))
      
      inline def setParticipant_sid(value: String): Self = StObject.set(x, "participant_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait MessageSolution extends StObject {
    
    var chatServiceSid: js.UndefOr[String] = js.undefined
    
    var conversationSid: js.UndefOr[String] = js.undefined
  }
  object MessageSolution {
    
    inline def apply(): MessageSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageSolution]
    }
    
    extension [Self <: MessageSolution](x: Self) {
      
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
  trait MessageWebhookEnabledType extends StObject
  object MessageWebhookEnabledType {
    
    inline def `false`: typings.twilio.twilioStrings.`false` = "false".asInstanceOf[typings.twilio.twilioStrings.`false`]
    
    inline def `true`: typings.twilio.twilioStrings.`true` = "true".asInstanceOf[typings.twilio.twilioStrings.`true`]
  }
}
