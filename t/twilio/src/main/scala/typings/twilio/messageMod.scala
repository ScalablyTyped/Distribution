package typings.twilio

import typings.twilio.anon.Key
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.mediaMod.MediaContext
import typings.twilio.mediaMod.MediaListInstance
import typings.twilio.messageFeedbackMod.FeedbackListInstance
import typings.twilio.twilioStrings.canceled
import typings.twilio.twilioStrings.failed__
import typings.twilio.twilioStrings.fixed
import typings.twilio.twilioStrings.free
import typings.twilio.twilioStrings.retain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/message", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/message", "MessageContext")
  @js.native
  open class MessageContext protected () extends StObject {
    /**
      * Initialize the MessageContext
      *
      * @param version - Version of the resource
      * @param accountSid - The SID of the Account that created the resource to fetch
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.v2010Mod.^, accountSid: String, sid: String) = this()
    
    var feedback: FeedbackListInstance = js.native
    
    /**
      * fetch a MessageInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[MessageInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ MessageInstance, Any]): js.Promise[MessageInstance] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def media(sid: String): MediaContext = js.native
    @JSName("media")
    var media_Original: MediaListInstance = js.native
    
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
  
  @JSImport("twilio/lib/rest/api/v2010/account/message", "MessageInstance")
  @js.native
  open class MessageInstance protected () extends SerializableClass {
    /**
      * Initialize the MessageContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - The SID of the Account that created the resource
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.v2010Mod.^, payload: MessagePayload, accountSid: String, sid: String) = this()
    
    /* private */ var _proxy: MessageContext = js.native
    
    var accountSid: String = js.native
    
    var apiVersion: String = js.native
    
    var body: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateSent: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var direction: MessageDirection = js.native
    
    var errorCode: Double = js.native
    
    var errorMessage: String = js.native
    
    /**
      * Access the feedback
      */
    def feedback(): FeedbackListInstance = js.native
    
    /**
      * fetch a MessageInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[MessageInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[MessageInstance] = js.native
    
    var from: String = js.native
    
    /**
      * Access the media
      */
    def media(): MediaListInstance = js.native
    
    var messagingServiceSid: String = js.native
    
    var numMedia: String = js.native
    
    var numSegments: String = js.native
    
    var price: String = js.native
    
    var priceUnit: String = js.native
    
    /**
      * remove a MessageInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var status: MessageStatus = js.native
    
    var subresourceUris: String = js.native
    
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
    
    var uri: String = js.native
  }
  
  /**
    * Initialize the MessageList
    *
    * @param version - Version of the resource
    * @param accountSid - The SID of the Account that created the resource
    */
  inline def MessageList(version: typings.twilio.v2010Mod.^, accountSid: String): MessageListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("MessageList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any])).asInstanceOf[MessageListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/message", "MessagePage")
  @js.native
  open class MessagePage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.v2010Mod.^, MessagePayload, MessageResource, MessageInstance] {
    /**
      * Initialize the MessagePage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
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
  
  type MessageAddressRetention = retain
  
  type MessageContentRetention = retain
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.inbound
    - typings.twilio.twilioStrings.`outbound-api`
    - typings.twilio.twilioStrings.`outbound-call`
    - typings.twilio.twilioStrings.`outbound-reply`
  */
  trait MessageDirection extends StObject
  object MessageDirection {
    
    inline def inbound: typings.twilio.twilioStrings.inbound = "inbound".asInstanceOf[typings.twilio.twilioStrings.inbound]
    
    inline def `outbound-api`: typings.twilio.twilioStrings.`outbound-api` = "outbound-api".asInstanceOf[typings.twilio.twilioStrings.`outbound-api`]
    
    inline def `outbound-call`: typings.twilio.twilioStrings.`outbound-call` = "outbound-call".asInstanceOf[typings.twilio.twilioStrings.`outbound-call`]
    
    inline def `outbound-reply`: typings.twilio.twilioStrings.`outbound-reply` = "outbound-reply".asInstanceOf[typings.twilio.twilioStrings.`outbound-reply`]
  }
  
  /**
    * Options to pass to update
    *
    * @property body - The text of the message you want to send
    * @property status - Set as `canceled` to cancel a message from being sent.
    */
  trait MessageInstanceUpdateOptions extends StObject {
    
    var body: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[MessageUpdateStatus] = js.undefined
  }
  object MessageInstanceUpdateOptions {
    
    inline def apply(): MessageInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageInstanceUpdateOptions]
    }
    
    extension [Self <: MessageInstanceUpdateOptions](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setStatus(value: MessageUpdateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
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
    * @property addressRetention - Determines if the address can be stored or obfuscated based on privacy settings
    * @property applicationSid - The application to use for callbacks
    * @property attempt - Total numer of attempts made , this inclusive to send out the message
    * @property body - The text of the message you want to send. Can be up to 1,600 characters in length.
    * @property contentRetention - Determines if the message content can be stored or redacted based on privacy settings
    * @property forceDelivery - Reserved
    * @property from - The phone number that initiated the message
    * @property maxPrice - The total maximum price up to 4 decimal places in US dollars acceptable for the message to be delivered.
    * @property mediaUrl - The URL of the media to send with the message
    * @property messagingServiceSid - The SID of the Messaging Service you want to associate with the message.
    * @property persistentAction - Rich actions for Channels Messages.
    * @property provideFeedback - Whether to confirm delivery of the message
    * @property scheduleType - Pass the value `fixed` to schedule a message at a fixed time.
    * @property sendAsMms - If set to True, Twilio will deliver the message as a single MMS message, regardless of the presence of media.
    * @property sendAt - The time that Twilio will send the message. Must be in ISO 8601 format.
    * @property smartEncoded - Whether to detect Unicode characters that have a similar GSM-7 character and replace them
    * @property statusCallback - The URL we should call to send status information to your application
    * @property to - The destination phone number
    * @property validityPeriod - The number of seconds that the message can remain in our outgoing queue.
    */
  trait MessageListInstanceCreateOptions extends StObject {
    
    var addressRetention: js.UndefOr[MessageAddressRetention] = js.undefined
    
    var applicationSid: js.UndefOr[String] = js.undefined
    
    var attempt: js.UndefOr[Double] = js.undefined
    
    var body: js.UndefOr[String] = js.undefined
    
    var contentRetention: js.UndefOr[MessageContentRetention] = js.undefined
    
    var forceDelivery: js.UndefOr[Boolean] = js.undefined
    
    var from: js.UndefOr[String] = js.undefined
    
    var maxPrice: js.UndefOr[Double] = js.undefined
    
    var mediaUrl: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var messagingServiceSid: js.UndefOr[String] = js.undefined
    
    var persistentAction: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var provideFeedback: js.UndefOr[Boolean] = js.undefined
    
    var scheduleType: js.UndefOr[MessageScheduleType] = js.undefined
    
    var sendAsMms: js.UndefOr[Boolean] = js.undefined
    
    var sendAt: js.UndefOr[js.Date] = js.undefined
    
    var smartEncoded: js.UndefOr[Boolean] = js.undefined
    
    var statusCallback: js.UndefOr[String] = js.undefined
    
    var to: String
    
    var validityPeriod: js.UndefOr[Double] = js.undefined
  }
  object MessageListInstanceCreateOptions {
    
    inline def apply(to: String): MessageListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageListInstanceCreateOptions]
    }
    
    extension [Self <: MessageListInstanceCreateOptions](x: Self) {
      
      inline def setAddressRetention(value: MessageAddressRetention): Self = StObject.set(x, "addressRetention", value.asInstanceOf[js.Any])
      
      inline def setAddressRetentionUndefined: Self = StObject.set(x, "addressRetention", js.undefined)
      
      inline def setApplicationSid(value: String): Self = StObject.set(x, "applicationSid", value.asInstanceOf[js.Any])
      
      inline def setApplicationSidUndefined: Self = StObject.set(x, "applicationSid", js.undefined)
      
      inline def setAttempt(value: Double): Self = StObject.set(x, "attempt", value.asInstanceOf[js.Any])
      
      inline def setAttemptUndefined: Self = StObject.set(x, "attempt", js.undefined)
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setContentRetention(value: MessageContentRetention): Self = StObject.set(x, "contentRetention", value.asInstanceOf[js.Any])
      
      inline def setContentRetentionUndefined: Self = StObject.set(x, "contentRetention", js.undefined)
      
      inline def setForceDelivery(value: Boolean): Self = StObject.set(x, "forceDelivery", value.asInstanceOf[js.Any])
      
      inline def setForceDeliveryUndefined: Self = StObject.set(x, "forceDelivery", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setMaxPrice(value: Double): Self = StObject.set(x, "maxPrice", value.asInstanceOf[js.Any])
      
      inline def setMaxPriceUndefined: Self = StObject.set(x, "maxPrice", js.undefined)
      
      inline def setMediaUrl(value: String | js.Array[String]): Self = StObject.set(x, "mediaUrl", value.asInstanceOf[js.Any])
      
      inline def setMediaUrlUndefined: Self = StObject.set(x, "mediaUrl", js.undefined)
      
      inline def setMediaUrlVarargs(value: String*): Self = StObject.set(x, "mediaUrl", js.Array(value*))
      
      inline def setMessagingServiceSid(value: String): Self = StObject.set(x, "messagingServiceSid", value.asInstanceOf[js.Any])
      
      inline def setMessagingServiceSidUndefined: Self = StObject.set(x, "messagingServiceSid", js.undefined)
      
      inline def setPersistentAction(value: String | js.Array[String]): Self = StObject.set(x, "persistentAction", value.asInstanceOf[js.Any])
      
      inline def setPersistentActionUndefined: Self = StObject.set(x, "persistentAction", js.undefined)
      
      inline def setPersistentActionVarargs(value: String*): Self = StObject.set(x, "persistentAction", js.Array(value*))
      
      inline def setProvideFeedback(value: Boolean): Self = StObject.set(x, "provideFeedback", value.asInstanceOf[js.Any])
      
      inline def setProvideFeedbackUndefined: Self = StObject.set(x, "provideFeedback", js.undefined)
      
      inline def setScheduleType(value: MessageScheduleType): Self = StObject.set(x, "scheduleType", value.asInstanceOf[js.Any])
      
      inline def setScheduleTypeUndefined: Self = StObject.set(x, "scheduleType", js.undefined)
      
      inline def setSendAsMms(value: Boolean): Self = StObject.set(x, "sendAsMms", value.asInstanceOf[js.Any])
      
      inline def setSendAsMmsUndefined: Self = StObject.set(x, "sendAsMms", js.undefined)
      
      inline def setSendAt(value: js.Date): Self = StObject.set(x, "sendAt", value.asInstanceOf[js.Any])
      
      inline def setSendAtUndefined: Self = StObject.set(x, "sendAt", js.undefined)
      
      inline def setSmartEncoded(value: Boolean): Self = StObject.set(x, "smartEncoded", value.asInstanceOf[js.Any])
      
      inline def setSmartEncodedUndefined: Self = StObject.set(x, "smartEncoded", js.undefined)
      
      inline def setStatusCallback(value: String): Self = StObject.set(x, "statusCallback", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackUndefined: Self = StObject.set(x, "statusCallback", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setValidityPeriod(value: Double): Self = StObject.set(x, "validityPeriod", value.asInstanceOf[js.Any])
      
      inline def setValidityPeriodUndefined: Self = StObject.set(x, "validityPeriod", js.undefined)
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property dateSent - Filter by date sent
    * @property dateSentAfter - Filter by date sent
    * @property dateSentBefore - Filter by date sent
    * @property done - Function to be called upon completion of streaming
    * @property from - Filter by from number
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
    * @property to - Filter by messages sent to this number
    */
  trait MessageListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ MessageInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var dateSent: js.UndefOr[js.Date] = js.undefined
    
    var dateSentAfter: js.UndefOr[js.Date] = js.undefined
    
    var dateSentBefore: js.UndefOr[js.Date] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var from: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
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
      
      inline def setDateSent(value: js.Date): Self = StObject.set(x, "dateSent", value.asInstanceOf[js.Any])
      
      inline def setDateSentAfter(value: js.Date): Self = StObject.set(x, "dateSentAfter", value.asInstanceOf[js.Any])
      
      inline def setDateSentAfterUndefined: Self = StObject.set(x, "dateSentAfter", js.undefined)
      
      inline def setDateSentBefore(value: js.Date): Self = StObject.set(x, "dateSentBefore", value.asInstanceOf[js.Any])
      
      inline def setDateSentBeforeUndefined: Self = StObject.set(x, "dateSentBefore", js.undefined)
      
      inline def setDateSentUndefined: Self = StObject.set(x, "dateSent", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property dateSent - Filter by date sent
    * @property dateSentAfter - Filter by date sent
    * @property dateSentBefore - Filter by date sent
    * @property from - Filter by from number
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
    * @property to - Filter by messages sent to this number
    */
  trait MessageListInstanceOptions extends StObject {
    
    var dateSent: js.UndefOr[js.Date] = js.undefined
    
    var dateSentAfter: js.UndefOr[js.Date] = js.undefined
    
    var dateSentBefore: js.UndefOr[js.Date] = js.undefined
    
    var from: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
  }
  object MessageListInstanceOptions {
    
    inline def apply(): MessageListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageListInstanceOptions]
    }
    
    extension [Self <: MessageListInstanceOptions](x: Self) {
      
      inline def setDateSent(value: js.Date): Self = StObject.set(x, "dateSent", value.asInstanceOf[js.Any])
      
      inline def setDateSentAfter(value: js.Date): Self = StObject.set(x, "dateSentAfter", value.asInstanceOf[js.Any])
      
      inline def setDateSentAfterUndefined: Self = StObject.set(x, "dateSentAfter", js.undefined)
      
      inline def setDateSentBefore(value: js.Date): Self = StObject.set(x, "dateSentBefore", value.asInstanceOf[js.Any])
      
      inline def setDateSentBeforeUndefined: Self = StObject.set(x, "dateSentBefore", js.undefined)
      
      inline def setDateSentUndefined: Self = StObject.set(x, "dateSent", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property dateSent - Filter by date sent
    * @property dateSentAfter - Filter by date sent
    * @property dateSentBefore - Filter by date sent
    * @property from - Filter by from number
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property to - Filter by messages sent to this number
    */
  trait MessageListInstancePageOptions extends StObject {
    
    var dateSent: js.UndefOr[js.Date] = js.undefined
    
    var dateSentAfter: js.UndefOr[js.Date] = js.undefined
    
    var dateSentBefore: js.UndefOr[js.Date] = js.undefined
    
    var from: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
  }
  object MessageListInstancePageOptions {
    
    inline def apply(): MessageListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageListInstancePageOptions]
    }
    
    extension [Self <: MessageListInstancePageOptions](x: Self) {
      
      inline def setDateSent(value: js.Date): Self = StObject.set(x, "dateSent", value.asInstanceOf[js.Any])
      
      inline def setDateSentAfter(value: js.Date): Self = StObject.set(x, "dateSentAfter", value.asInstanceOf[js.Any])
      
      inline def setDateSentAfterUndefined: Self = StObject.set(x, "dateSentAfter", js.undefined)
      
      inline def setDateSentBefore(value: js.Date): Self = StObject.set(x, "dateSentBefore", value.asInstanceOf[js.Any])
      
      inline def setDateSentBeforeUndefined: Self = StObject.set(x, "dateSentBefore", js.undefined)
      
      inline def setDateSentUndefined: Self = StObject.set(x, "dateSent", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.twilio.pageMod.TwilioResponsePayload because var conflicts: uri. Inlined first_page_uri, next_page_uri, page, page_size, previous_page_uri, meta */ trait MessagePayload
    extends StObject
       with MessageResource {
    
    // DEPRECTATED: end: any;
    var first_page_uri: String
    
    var meta: js.UndefOr[Key] = js.undefined
    
    // DEPRECTATED: last_page_uri: string;
    var next_page_uri: String
    
    // DEPRECTATED: num_pages: number;
    var page: Double
    
    var page_size: Double
    
    var previous_page_uri: String
  }
  object MessagePayload {
    
    inline def apply(
      account_sid: String,
      api_version: String,
      body: String,
      date_created: js.Date,
      date_sent: js.Date,
      date_updated: js.Date,
      direction: MessageDirection,
      error_code: Double,
      error_message: String,
      first_page_uri: String,
      from: String,
      messaging_service_sid: String,
      next_page_uri: String,
      num_media: String,
      num_segments: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      price: String,
      price_unit: String,
      sid: String,
      status: MessageStatus,
      subresource_uris: String,
      to: String,
      uri: String
    ): MessagePayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], api_version = api_version.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_sent = date_sent.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], error_code = error_code.asInstanceOf[js.Any], error_message = error_message.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], messaging_service_sid = messaging_service_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], num_media = num_media.asInstanceOf[js.Any], num_segments = num_segments.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], price_unit = price_unit.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subresource_uris = subresource_uris.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessagePayload]
    }
    
    extension [Self <: MessagePayload](x: Self) {
      
      inline def setFirst_page_uri(value: String): Self = StObject.set(x, "first_page_uri", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Key): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setNext_page_uri(value: String): Self = StObject.set(x, "next_page_uri", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      inline def setPrevious_page_uri(value: String): Self = StObject.set(x, "previous_page_uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait MessageResource extends StObject {
    
    var account_sid: String
    
    var api_version: String
    
    var body: String
    
    var date_created: js.Date
    
    var date_sent: js.Date
    
    var date_updated: js.Date
    
    var direction: MessageDirection
    
    var error_code: Double
    
    var error_message: String
    
    var from: String
    
    var messaging_service_sid: String
    
    var num_media: String
    
    var num_segments: String
    
    var price: String
    
    var price_unit: String
    
    var sid: String
    
    var status: MessageStatus
    
    var subresource_uris: String
    
    var to: String
    
    var uri: String
  }
  object MessageResource {
    
    inline def apply(
      account_sid: String,
      api_version: String,
      body: String,
      date_created: js.Date,
      date_sent: js.Date,
      date_updated: js.Date,
      direction: MessageDirection,
      error_code: Double,
      error_message: String,
      from: String,
      messaging_service_sid: String,
      num_media: String,
      num_segments: String,
      price: String,
      price_unit: String,
      sid: String,
      status: MessageStatus,
      subresource_uris: String,
      to: String,
      uri: String
    ): MessageResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], api_version = api_version.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_sent = date_sent.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], error_code = error_code.asInstanceOf[js.Any], error_message = error_message.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], messaging_service_sid = messaging_service_sid.asInstanceOf[js.Any], num_media = num_media.asInstanceOf[js.Any], num_segments = num_segments.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], price_unit = price_unit.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subresource_uris = subresource_uris.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageResource]
    }
    
    extension [Self <: MessageResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setApi_version(value: String): Self = StObject.set(x, "api_version", value.asInstanceOf[js.Any])
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_sent(value: js.Date): Self = StObject.set(x, "date_sent", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: MessageDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setError_code(value: Double): Self = StObject.set(x, "error_code", value.asInstanceOf[js.Any])
      
      inline def setError_message(value: String): Self = StObject.set(x, "error_message", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setMessaging_service_sid(value: String): Self = StObject.set(x, "messaging_service_sid", value.asInstanceOf[js.Any])
      
      inline def setNum_media(value: String): Self = StObject.set(x, "num_media", value.asInstanceOf[js.Any])
      
      inline def setNum_segments(value: String): Self = StObject.set(x, "num_segments", value.asInstanceOf[js.Any])
      
      inline def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setPrice_unit(value: String): Self = StObject.set(x, "price_unit", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: MessageStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setSubresource_uris(value: String): Self = StObject.set(x, "subresource_uris", value.asInstanceOf[js.Any])
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  type MessageScheduleType = fixed
  
  trait MessageSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
  }
  object MessageSolution {
    
    inline def apply(): MessageSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageSolution]
    }
    
    extension [Self <: MessageSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.queued
    - typings.twilio.twilioStrings.sending
    - typings.twilio.twilioStrings.sent
    - typings.twilio.twilioStrings.failed__
    - typings.twilio.twilioStrings.delivered
    - typings.twilio.twilioStrings.undelivered
    - typings.twilio.twilioStrings.receiving
    - typings.twilio.twilioStrings.received
    - typings.twilio.twilioStrings.accepted
    - typings.twilio.twilioStrings.scheduled
    - typings.twilio.twilioStrings.read
    - typings.twilio.twilioStrings.partially_delivered
    - typings.twilio.twilioStrings.canceled
  */
  trait MessageStatus extends StObject
  object MessageStatus {
    
    inline def accepted: typings.twilio.twilioStrings.accepted = "accepted".asInstanceOf[typings.twilio.twilioStrings.accepted]
    
    inline def canceled: typings.twilio.twilioStrings.canceled = "canceled".asInstanceOf[typings.twilio.twilioStrings.canceled]
    
    inline def delivered: typings.twilio.twilioStrings.delivered = "delivered".asInstanceOf[typings.twilio.twilioStrings.delivered]
    
    inline def failed: failed__ = "failed".asInstanceOf[failed__]
    
    inline def partially_delivered: typings.twilio.twilioStrings.partially_delivered = "partially_delivered".asInstanceOf[typings.twilio.twilioStrings.partially_delivered]
    
    inline def queued: typings.twilio.twilioStrings.queued = "queued".asInstanceOf[typings.twilio.twilioStrings.queued]
    
    inline def read: typings.twilio.twilioStrings.read = "read".asInstanceOf[typings.twilio.twilioStrings.read]
    
    inline def received: typings.twilio.twilioStrings.received = "received".asInstanceOf[typings.twilio.twilioStrings.received]
    
    inline def receiving: typings.twilio.twilioStrings.receiving = "receiving".asInstanceOf[typings.twilio.twilioStrings.receiving]
    
    inline def scheduled: typings.twilio.twilioStrings.scheduled = "scheduled".asInstanceOf[typings.twilio.twilioStrings.scheduled]
    
    inline def sending: typings.twilio.twilioStrings.sending = "sending".asInstanceOf[typings.twilio.twilioStrings.sending]
    
    inline def sent: typings.twilio.twilioStrings.sent = "sent".asInstanceOf[typings.twilio.twilioStrings.sent]
    
    inline def undelivered: typings.twilio.twilioStrings.undelivered = "undelivered".asInstanceOf[typings.twilio.twilioStrings.undelivered]
  }
  
  type MessageTrafficType = free
  
  type MessageUpdateStatus = canceled
}
