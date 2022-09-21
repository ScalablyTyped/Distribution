package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.failed__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageDeliveryReceiptMod {
  
  @JSImport("twilio/lib/rest/conversations/v1/service/conversation/message/deliveryReceipt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/conversations/v1/service/conversation/message/deliveryReceipt", "DeliveryReceiptContext")
  @js.native
  open class DeliveryReceiptContext protected () extends StObject {
    /**
      * Initialize the DeliveryReceiptContext
      *
      * @param version - Version of the resource
      * @param chatServiceSid - The SID of the Conversation Service that the resource is associated with.
      * @param conversationSid - The unique ID of the Conversation for this delivery receipt.
      * @param messageSid - The SID of the message the delivery receipt belongs to.
      * @param sid - A 34 character string that uniquely identifies this resource.
      */
    def this(
      version: typings.twilio.conversationsV1Mod.^,
      chatServiceSid: String,
      conversationSid: String,
      messageSid: String,
      sid: String
    ) = this()
    
    /**
      * fetch a DeliveryReceiptInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[DeliveryReceiptInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ DeliveryReceiptInstance, Any]): js.Promise[DeliveryReceiptInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/conversations/v1/service/conversation/message/deliveryReceipt", "DeliveryReceiptInstance")
  @js.native
  open class DeliveryReceiptInstance protected () extends SerializableClass {
    /**
      * Initialize the DeliveryReceiptContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param chatServiceSid - The SID of the Conversation Service that the resource is associated with.
      * @param conversationSid - The unique ID of the Conversation for this message.
      * @param messageSid - The SID of the message the delivery receipt belongs to
      * @param sid - A 34 character string that uniquely identifies this resource.
      */
    def this(
      version: typings.twilio.conversationsV1Mod.^,
      payload: DeliveryReceiptPayload,
      chatServiceSid: String,
      conversationSid: String,
      messageSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: DeliveryReceiptContext = js.native
    
    var accountSid: String = js.native
    
    var channelMessageSid: String = js.native
    
    var chatServiceSid: String = js.native
    
    var conversationSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var errorCode: Double = js.native
    
    /**
      * fetch a DeliveryReceiptInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[DeliveryReceiptInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[DeliveryReceiptInstance] = js.native
    
    var messageSid: String = js.native
    
    var participantSid: String = js.native
    
    var sid: String = js.native
    
    var status: DeliveryReceiptDeliveryStatus = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the DeliveryReceiptList
    *
    * @param version - Version of the resource
    * @param chatServiceSid - The SID of the Conversation Service that the resource is associated with.
    * @param conversationSid - The unique ID of the Conversation for this message.
    * @param messageSid - The SID of the message the delivery receipt belongs to
    */
  inline def DeliveryReceiptList(
    version: typings.twilio.conversationsV1Mod.^,
    chatServiceSid: String,
    conversationSid: String,
    messageSid: String
  ): DeliveryReceiptListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("DeliveryReceiptList")(version.asInstanceOf[js.Any], chatServiceSid.asInstanceOf[js.Any], conversationSid.asInstanceOf[js.Any], messageSid.asInstanceOf[js.Any])).asInstanceOf[DeliveryReceiptListInstance]
  
  @JSImport("twilio/lib/rest/conversations/v1/service/conversation/message/deliveryReceipt", "DeliveryReceiptPage")
  @js.native
  open class DeliveryReceiptPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.conversationsV1Mod.^, 
          DeliveryReceiptPayload, 
          DeliveryReceiptResource, 
          DeliveryReceiptInstance
        ] {
    /**
      * Initialize the DeliveryReceiptPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.conversationsV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: DeliveryReceiptSolution
    ) = this()
    
    /**
      * Build an instance of DeliveryReceiptInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: DeliveryReceiptPayload): DeliveryReceiptInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.read
    - typings.twilio.twilioStrings.failed__
    - typings.twilio.twilioStrings.delivered
    - typings.twilio.twilioStrings.undelivered
    - typings.twilio.twilioStrings.sent
  */
  trait DeliveryReceiptDeliveryStatus extends StObject
  object DeliveryReceiptDeliveryStatus {
    
    inline def delivered: typings.twilio.twilioStrings.delivered = "delivered".asInstanceOf[typings.twilio.twilioStrings.delivered]
    
    inline def failed: failed__ = "failed".asInstanceOf[failed__]
    
    inline def read: typings.twilio.twilioStrings.read = "read".asInstanceOf[typings.twilio.twilioStrings.read]
    
    inline def sent: typings.twilio.twilioStrings.sent = "sent".asInstanceOf[typings.twilio.twilioStrings.sent]
    
    inline def undelivered: typings.twilio.twilioStrings.undelivered = "undelivered".asInstanceOf[typings.twilio.twilioStrings.undelivered]
  }
  
  @js.native
  trait DeliveryReceiptListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): DeliveryReceiptContext = js.native
    
    /**
      * Streams DeliveryReceiptInstance records from the API.
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
          /* item */ DeliveryReceiptInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ DeliveryReceiptInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: DeliveryReceiptListInstanceEachOptions): Unit = js.native
    def each(
      opts: DeliveryReceiptListInstanceEachOptions,
      callback: js.Function2[
          /* item */ DeliveryReceiptInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a delivery_receipt
      *
      * @param sid - A 34 character string that uniquely identifies this resource.
      */
    def get(sid: String): DeliveryReceiptContext = js.native
    
    /**
      * Retrieve a single target page of DeliveryReceiptInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[DeliveryReceiptPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ DeliveryReceiptPage, Any]): js.Promise[DeliveryReceiptPage] = js.native
    def getPage(targetUrl: String): js.Promise[DeliveryReceiptPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DeliveryReceiptPage, Any]
    ): js.Promise[DeliveryReceiptPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DeliveryReceiptPage, Any]
    ): js.Promise[DeliveryReceiptPage] = js.native
    
    /**
      * Lists DeliveryReceiptInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[DeliveryReceiptInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[DeliveryReceiptInstance], Any]
    ): js.Promise[js.Array[DeliveryReceiptInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[DeliveryReceiptInstance], Any]
    ): js.Promise[js.Array[DeliveryReceiptInstance]] = js.native
    def list(opts: DeliveryReceiptListInstanceOptions): js.Promise[js.Array[DeliveryReceiptInstance]] = js.native
    def list(
      opts: DeliveryReceiptListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[DeliveryReceiptInstance], Any]
    ): js.Promise[js.Array[DeliveryReceiptInstance]] = js.native
    
    /**
      * Retrieve a single page of DeliveryReceiptInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[DeliveryReceiptPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ DeliveryReceiptPage, Any]): js.Promise[DeliveryReceiptPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DeliveryReceiptPage, Any]
    ): js.Promise[DeliveryReceiptPage] = js.native
    def page(opts: DeliveryReceiptListInstancePageOptions): js.Promise[DeliveryReceiptPage] = js.native
    def page(
      opts: DeliveryReceiptListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DeliveryReceiptPage, Any]
    ): js.Promise[DeliveryReceiptPage] = js.native
    
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
  trait DeliveryReceiptListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ DeliveryReceiptInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object DeliveryReceiptListInstanceEachOptions {
    
    inline def apply(): DeliveryReceiptListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeliveryReceiptListInstanceEachOptions]
    }
    
    extension [Self <: DeliveryReceiptListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ DeliveryReceiptInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait DeliveryReceiptListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object DeliveryReceiptListInstanceOptions {
    
    inline def apply(): DeliveryReceiptListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeliveryReceiptListInstanceOptions]
    }
    
    extension [Self <: DeliveryReceiptListInstanceOptions](x: Self) {
      
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
  trait DeliveryReceiptListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object DeliveryReceiptListInstancePageOptions {
    
    inline def apply(): DeliveryReceiptListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeliveryReceiptListInstancePageOptions]
    }
    
    extension [Self <: DeliveryReceiptListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait DeliveryReceiptPayload
    extends StObject
       with DeliveryReceiptResource
       with TwilioResponsePayload
  object DeliveryReceiptPayload {
    
    inline def apply(
      account_sid: String,
      channel_message_sid: String,
      chat_service_sid: String,
      conversation_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      error_code: Double,
      first_page_uri: String,
      message_sid: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      participant_sid: String,
      previous_page_uri: String,
      sid: String,
      status: DeliveryReceiptDeliveryStatus,
      uri: String,
      url: String
    ): DeliveryReceiptPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], channel_message_sid = channel_message_sid.asInstanceOf[js.Any], chat_service_sid = chat_service_sid.asInstanceOf[js.Any], conversation_sid = conversation_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], error_code = error_code.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], message_sid = message_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], participant_sid = participant_sid.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeliveryReceiptPayload]
    }
  }
  
  trait DeliveryReceiptResource extends StObject {
    
    var account_sid: String
    
    var channel_message_sid: String
    
    var chat_service_sid: String
    
    var conversation_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var error_code: Double
    
    var message_sid: String
    
    var participant_sid: String
    
    var sid: String
    
    var status: DeliveryReceiptDeliveryStatus
    
    var url: String
  }
  object DeliveryReceiptResource {
    
    inline def apply(
      account_sid: String,
      channel_message_sid: String,
      chat_service_sid: String,
      conversation_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      error_code: Double,
      message_sid: String,
      participant_sid: String,
      sid: String,
      status: DeliveryReceiptDeliveryStatus,
      url: String
    ): DeliveryReceiptResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], channel_message_sid = channel_message_sid.asInstanceOf[js.Any], chat_service_sid = chat_service_sid.asInstanceOf[js.Any], conversation_sid = conversation_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], error_code = error_code.asInstanceOf[js.Any], message_sid = message_sid.asInstanceOf[js.Any], participant_sid = participant_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeliveryReceiptResource]
    }
    
    extension [Self <: DeliveryReceiptResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setChannel_message_sid(value: String): Self = StObject.set(x, "channel_message_sid", value.asInstanceOf[js.Any])
      
      inline def setChat_service_sid(value: String): Self = StObject.set(x, "chat_service_sid", value.asInstanceOf[js.Any])
      
      inline def setConversation_sid(value: String): Self = StObject.set(x, "conversation_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setError_code(value: Double): Self = StObject.set(x, "error_code", value.asInstanceOf[js.Any])
      
      inline def setMessage_sid(value: String): Self = StObject.set(x, "message_sid", value.asInstanceOf[js.Any])
      
      inline def setParticipant_sid(value: String): Self = StObject.set(x, "participant_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: DeliveryReceiptDeliveryStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeliveryReceiptSolution extends StObject {
    
    var chatServiceSid: js.UndefOr[String] = js.undefined
    
    var conversationSid: js.UndefOr[String] = js.undefined
    
    var messageSid: js.UndefOr[String] = js.undefined
  }
  object DeliveryReceiptSolution {
    
    inline def apply(): DeliveryReceiptSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeliveryReceiptSolution]
    }
    
    extension [Self <: DeliveryReceiptSolution](x: Self) {
      
      inline def setChatServiceSid(value: String): Self = StObject.set(x, "chatServiceSid", value.asInstanceOf[js.Any])
      
      inline def setChatServiceSidUndefined: Self = StObject.set(x, "chatServiceSid", js.undefined)
      
      inline def setConversationSid(value: String): Self = StObject.set(x, "conversationSid", value.asInstanceOf[js.Any])
      
      inline def setConversationSidUndefined: Self = StObject.set(x, "conversationSid", js.undefined)
      
      inline def setMessageSid(value: String): Self = StObject.set(x, "messageSid", value.asInstanceOf[js.Any])
      
      inline def setMessageSidUndefined: Self = StObject.set(x, "messageSid", js.undefined)
    }
  }
}
