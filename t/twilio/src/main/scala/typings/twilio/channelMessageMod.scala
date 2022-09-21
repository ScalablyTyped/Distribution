package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.asc_
import typings.twilio.twilioStrings.desc_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object channelMessageMod {
  
  @JSImport("twilio/lib/rest/chat/v1/service/channel/message", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/chat/v1/service/channel/message", "MessageContext")
  @js.native
  open class MessageContext protected () extends StObject {
    /**
      * Initialize the MessageContext
      *
      * @param version - Version of the resource
      * @param serviceSid - The SID of the Service to fetch the resource from
      * @param channelSid - The unique ID of the Channel the message to fetch belongs to
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.chatV1Mod.^, serviceSid: String, channelSid: String, sid: String) = this()
    
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
  
  @JSImport("twilio/lib/rest/chat/v1/service/channel/message", "MessageInstance")
  @js.native
  open class MessageInstance protected () extends SerializableClass {
    /**
      * Initialize the MessageContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - The SID of the Service that the resource is associated with
      * @param channelSid - The unique ID of the Channel the Message resource belongs to
      * @param sid - The unique string that identifies the resource
      */
    def this(
      version: typings.twilio.chatV1Mod.^,
      payload: MessagePayload,
      serviceSid: String,
      channelSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: MessageContext = js.native
    
    var accountSid: String = js.native
    
    var attributes: String = js.native
    
    var body: String = js.native
    
    var channelSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a MessageInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[MessageInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[MessageInstance] = js.native
    
    var from: String = js.native
    
    var index: Double = js.native
    
    /**
      * remove a MessageInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    var to: String = js.native
    
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
    
    var wasEdited: Boolean = js.native
  }
  
  /**
    * Initialize the MessageList
    *
    * @param version - Version of the resource
    * @param serviceSid - The SID of the Service that the resource is associated with
    * @param channelSid - The unique ID of the Channel the Message resource belongs to
    */
  inline def MessageList(version: typings.twilio.chatV1Mod.^, serviceSid: String, channelSid: String): MessageListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("MessageList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any], channelSid.asInstanceOf[js.Any])).asInstanceOf[MessageListInstance]
  
  @JSImport("twilio/lib/rest/chat/v1/service/channel/message", "MessagePage")
  @js.native
  open class MessagePage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.chatV1Mod.^, MessagePayload, MessageResource, MessageInstance] {
    /**
      * Initialize the MessagePage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.chatV1Mod.^,
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
    * Options to pass to update
    *
    * @property attributes - A valid JSON string that contains application-specific data
    * @property body - The message to send to the channel
    */
  trait MessageInstanceUpdateOptions extends StObject {
    
    var attributes: js.UndefOr[String] = js.undefined
    
    var body: js.UndefOr[String] = js.undefined
  }
  object MessageInstanceUpdateOptions {
    
    inline def apply(): MessageInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageInstanceUpdateOptions]
    }
    
    extension [Self <: MessageInstanceUpdateOptions](x: Self) {
      
      inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
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
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
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
      * @param sid - The unique string that identifies the resource
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
    * @property attributes - A valid JSON string that contains application-specific data
    * @property body - The message to send to the channel
    * @property from - The identity of the new message's author
    */
  trait MessageListInstanceCreateOptions extends StObject {
    
    var attributes: js.UndefOr[String] = js.undefined
    
    var body: String
    
    var from: js.UndefOr[String] = js.undefined
  }
  object MessageListInstanceCreateOptions {
    
    inline def apply(body: String): MessageListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageListInstanceCreateOptions]
    }
    
    extension [Self <: MessageListInstanceCreateOptions](x: Self) {
      
      inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
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
      body: String,
      channel_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      from: String,
      index: Double,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      service_sid: String,
      sid: String,
      to: String,
      uri: String,
      url: String,
      was_edited: Boolean
    ): MessagePayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], channel_sid = channel_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], was_edited = was_edited.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessagePayload]
    }
  }
  
  trait MessageResource extends StObject {
    
    var account_sid: String
    
    var attributes: String
    
    var body: String
    
    var channel_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var from: String
    
    var index: Double
    
    var service_sid: String
    
    var sid: String
    
    var to: String
    
    var url: String
    
    var was_edited: Boolean
  }
  object MessageResource {
    
    inline def apply(
      account_sid: String,
      attributes: String,
      body: String,
      channel_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      from: String,
      index: Double,
      service_sid: String,
      sid: String,
      to: String,
      url: String,
      was_edited: Boolean
    ): MessageResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], channel_sid = channel_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], was_edited = was_edited.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageResource]
    }
    
    extension [Self <: MessageResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setChannel_sid(value: String): Self = StObject.set(x, "channel_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWas_edited(value: Boolean): Self = StObject.set(x, "was_edited", value.asInstanceOf[js.Any])
    }
  }
  
  trait MessageSolution extends StObject {
    
    var channelSid: js.UndefOr[String] = js.undefined
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object MessageSolution {
    
    inline def apply(): MessageSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageSolution]
    }
    
    extension [Self <: MessageSolution](x: Self) {
      
      inline def setChannelSid(value: String): Self = StObject.set(x, "channelSid", value.asInstanceOf[js.Any])
      
      inline def setChannelSidUndefined: Self = StObject.set(x, "channelSid", js.undefined)
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
}
