package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.completed_
import typings.twilio.twilioStrings.deleted_
import typings.twilio.twilioStrings.failed__
import typings.twilio.twilioStrings.unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageInteractionMod {
  
  @JSImport("twilio/lib/rest/proxy/v1/service/session/participant/messageInteraction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/proxy/v1/service/session/participant/messageInteraction", "MessageInteractionContext")
  @js.native
  open class MessageInteractionContext protected () extends StObject {
    /**
      * Initialize the MessageInteractionContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param serviceSid - The SID of the Service to fetch the resource from
      * @param sessionSid - The SID of the parent Session
      * @param participantSid - The SID of the Participant resource
      * @param sid - The unique string that identifies the resource
      */
    def this(
      version: typings.twilio.proxyV1Mod.^,
      serviceSid: String,
      sessionSid: String,
      participantSid: String,
      sid: String
    ) = this()
    
    /**
      * fetch a MessageInteractionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[MessageInteractionInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ MessageInteractionInstance, Any]): js.Promise[MessageInteractionInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/proxy/v1/service/session/participant/messageInteraction", "MessageInteractionInstance")
  @js.native
  open class MessageInteractionInstance protected () extends SerializableClass {
    /**
      * Initialize the MessageInteractionContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - The SID of the resource's parent Service
      * @param sessionSid - The SID of the resource's parent Session
      * @param participantSid - The SID of the Participant resource
      * @param sid - The unique string that identifies the resource
      */
    def this(
      version: typings.twilio.proxyV1Mod.^,
      payload: MessageInteractionPayload,
      serviceSid: String,
      sessionSid: String,
      participantSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: MessageInteractionContext = js.native
    
    var accountSid: String = js.native
    
    var data: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a MessageInteractionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[MessageInteractionInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[MessageInteractionInstance] = js.native
    
    var inboundParticipantSid: String = js.native
    
    var inboundResourceSid: String = js.native
    
    var inboundResourceStatus: MessageInteractionResourceStatus = js.native
    
    var inboundResourceType: String = js.native
    
    var inboundResourceUrl: String = js.native
    
    var outboundParticipantSid: String = js.native
    
    var outboundResourceSid: String = js.native
    
    var outboundResourceStatus: MessageInteractionResourceStatus = js.native
    
    var outboundResourceType: String = js.native
    
    var outboundResourceUrl: String = js.native
    
    var participantSid: String = js.native
    
    var serviceSid: String = js.native
    
    var sessionSid: String = js.native
    
    var sid: String = js.native
    
    var `type`: MessageInteractionType = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the MessageInteractionList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param serviceSid - The SID of the resource's parent Service
    * @param sessionSid - The SID of the resource's parent Session
    * @param participantSid - The SID of the Participant resource
    */
  inline def MessageInteractionList(
    version: typings.twilio.proxyV1Mod.^,
    serviceSid: String,
    sessionSid: String,
    participantSid: String
  ): MessageInteractionListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("MessageInteractionList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any], sessionSid.asInstanceOf[js.Any], participantSid.asInstanceOf[js.Any])).asInstanceOf[MessageInteractionListInstance]
  
  @JSImport("twilio/lib/rest/proxy/v1/service/session/participant/messageInteraction", "MessageInteractionPage")
  @js.native
  open class MessageInteractionPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.proxyV1Mod.^, 
          MessageInteractionPayload, 
          MessageInteractionResource, 
          MessageInteractionInstance
        ] {
    /**
      * Initialize the MessageInteractionPage
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.proxyV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: MessageInteractionSolution
    ) = this()
    
    /**
      * Build an instance of MessageInteractionInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: MessageInteractionPayload): MessageInteractionInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait MessageInteractionListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): MessageInteractionContext = js.native
    
    /**
      * create a MessageInteractionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[MessageInteractionInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ MessageInteractionInstance, Any]): js.Promise[MessageInteractionInstance] = js.native
    def create(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ MessageInteractionInstance, Any]
    ): js.Promise[MessageInteractionInstance] = js.native
    def create(opts: MessageInteractionListInstanceCreateOptions): js.Promise[MessageInteractionInstance] = js.native
    def create(
      opts: MessageInteractionListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ MessageInteractionInstance, Any]
    ): js.Promise[MessageInteractionInstance] = js.native
    
    /**
      * Streams MessageInteractionInstance records from the API.
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
          /* item */ MessageInteractionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ MessageInteractionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: MessageInteractionListInstanceEachOptions): Unit = js.native
    def each(
      opts: MessageInteractionListInstanceEachOptions,
      callback: js.Function2[
          /* item */ MessageInteractionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a message_interaction
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): MessageInteractionContext = js.native
    
    /**
      * Retrieve a single target page of MessageInteractionInstance records from the
      * API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[MessageInteractionPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ MessageInteractionPage, Any]): js.Promise[MessageInteractionPage] = js.native
    def getPage(targetUrl: String): js.Promise[MessageInteractionPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ MessageInteractionPage, Any]
    ): js.Promise[MessageInteractionPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ MessageInteractionPage, Any]
    ): js.Promise[MessageInteractionPage] = js.native
    
    /**
      * Lists MessageInteractionInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[MessageInteractionInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[MessageInteractionInstance], Any]
    ): js.Promise[js.Array[MessageInteractionInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[MessageInteractionInstance], Any]
    ): js.Promise[js.Array[MessageInteractionInstance]] = js.native
    def list(opts: MessageInteractionListInstanceOptions): js.Promise[js.Array[MessageInteractionInstance]] = js.native
    def list(
      opts: MessageInteractionListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[MessageInteractionInstance], Any]
    ): js.Promise[js.Array[MessageInteractionInstance]] = js.native
    
    /**
      * Retrieve a single page of MessageInteractionInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[MessageInteractionPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ MessageInteractionPage, Any]): js.Promise[MessageInteractionPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ MessageInteractionPage, Any]
    ): js.Promise[MessageInteractionPage] = js.native
    def page(opts: MessageInteractionListInstancePageOptions): js.Promise[MessageInteractionPage] = js.native
    def page(
      opts: MessageInteractionListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ MessageInteractionPage, Any]
    ): js.Promise[MessageInteractionPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property body - Message body
    * @property mediaUrl - Reserved
    */
  trait MessageInteractionListInstanceCreateOptions extends StObject {
    
    var body: js.UndefOr[String] = js.undefined
    
    var mediaUrl: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object MessageInteractionListInstanceCreateOptions {
    
    inline def apply(): MessageInteractionListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageInteractionListInstanceCreateOptions]
    }
    
    extension [Self <: MessageInteractionListInstanceCreateOptions](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setMediaUrl(value: String | js.Array[String]): Self = StObject.set(x, "mediaUrl", value.asInstanceOf[js.Any])
      
      inline def setMediaUrlUndefined: Self = StObject.set(x, "mediaUrl", js.undefined)
      
      inline def setMediaUrlVarargs(value: String*): Self = StObject.set(x, "mediaUrl", js.Array(value*))
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
  trait MessageInteractionListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ MessageInteractionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object MessageInteractionListInstanceEachOptions {
    
    inline def apply(): MessageInteractionListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageInteractionListInstanceEachOptions]
    }
    
    extension [Self <: MessageInteractionListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ MessageInteractionInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait MessageInteractionListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object MessageInteractionListInstanceOptions {
    
    inline def apply(): MessageInteractionListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageInteractionListInstanceOptions]
    }
    
    extension [Self <: MessageInteractionListInstanceOptions](x: Self) {
      
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
  trait MessageInteractionListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object MessageInteractionListInstancePageOptions {
    
    inline def apply(): MessageInteractionListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageInteractionListInstancePageOptions]
    }
    
    extension [Self <: MessageInteractionListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait MessageInteractionPayload
    extends StObject
       with MessageInteractionResource
       with TwilioResponsePayload
  object MessageInteractionPayload {
    
    inline def apply(
      account_sid: String,
      data: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      inbound_participant_sid: String,
      inbound_resource_sid: String,
      inbound_resource_status: MessageInteractionResourceStatus,
      inbound_resource_type: String,
      inbound_resource_url: String,
      next_page_uri: String,
      outbound_participant_sid: String,
      outbound_resource_sid: String,
      outbound_resource_status: MessageInteractionResourceStatus,
      outbound_resource_type: String,
      outbound_resource_url: String,
      page: Double,
      page_size: Double,
      participant_sid: String,
      previous_page_uri: String,
      service_sid: String,
      session_sid: String,
      sid: String,
      `type`: MessageInteractionType,
      uri: String,
      url: String
    ): MessageInteractionPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], inbound_participant_sid = inbound_participant_sid.asInstanceOf[js.Any], inbound_resource_sid = inbound_resource_sid.asInstanceOf[js.Any], inbound_resource_status = inbound_resource_status.asInstanceOf[js.Any], inbound_resource_type = inbound_resource_type.asInstanceOf[js.Any], inbound_resource_url = inbound_resource_url.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], outbound_participant_sid = outbound_participant_sid.asInstanceOf[js.Any], outbound_resource_sid = outbound_resource_sid.asInstanceOf[js.Any], outbound_resource_status = outbound_resource_status.asInstanceOf[js.Any], outbound_resource_type = outbound_resource_type.asInstanceOf[js.Any], outbound_resource_url = outbound_resource_url.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], participant_sid = participant_sid.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], session_sid = session_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageInteractionPayload]
    }
  }
  
  trait MessageInteractionResource extends StObject {
    
    var account_sid: String
    
    var data: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var inbound_participant_sid: String
    
    var inbound_resource_sid: String
    
    var inbound_resource_status: MessageInteractionResourceStatus
    
    var inbound_resource_type: String
    
    var inbound_resource_url: String
    
    var outbound_participant_sid: String
    
    var outbound_resource_sid: String
    
    var outbound_resource_status: MessageInteractionResourceStatus
    
    var outbound_resource_type: String
    
    var outbound_resource_url: String
    
    var participant_sid: String
    
    var service_sid: String
    
    var session_sid: String
    
    var sid: String
    
    var `type`: MessageInteractionType
    
    var url: String
  }
  object MessageInteractionResource {
    
    inline def apply(
      account_sid: String,
      data: String,
      date_created: js.Date,
      date_updated: js.Date,
      inbound_participant_sid: String,
      inbound_resource_sid: String,
      inbound_resource_status: MessageInteractionResourceStatus,
      inbound_resource_type: String,
      inbound_resource_url: String,
      outbound_participant_sid: String,
      outbound_resource_sid: String,
      outbound_resource_status: MessageInteractionResourceStatus,
      outbound_resource_type: String,
      outbound_resource_url: String,
      participant_sid: String,
      service_sid: String,
      session_sid: String,
      sid: String,
      `type`: MessageInteractionType,
      url: String
    ): MessageInteractionResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], inbound_participant_sid = inbound_participant_sid.asInstanceOf[js.Any], inbound_resource_sid = inbound_resource_sid.asInstanceOf[js.Any], inbound_resource_status = inbound_resource_status.asInstanceOf[js.Any], inbound_resource_type = inbound_resource_type.asInstanceOf[js.Any], inbound_resource_url = inbound_resource_url.asInstanceOf[js.Any], outbound_participant_sid = outbound_participant_sid.asInstanceOf[js.Any], outbound_resource_sid = outbound_resource_sid.asInstanceOf[js.Any], outbound_resource_status = outbound_resource_status.asInstanceOf[js.Any], outbound_resource_type = outbound_resource_type.asInstanceOf[js.Any], outbound_resource_url = outbound_resource_url.asInstanceOf[js.Any], participant_sid = participant_sid.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], session_sid = session_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageInteractionResource]
    }
    
    extension [Self <: MessageInteractionResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setInbound_participant_sid(value: String): Self = StObject.set(x, "inbound_participant_sid", value.asInstanceOf[js.Any])
      
      inline def setInbound_resource_sid(value: String): Self = StObject.set(x, "inbound_resource_sid", value.asInstanceOf[js.Any])
      
      inline def setInbound_resource_status(value: MessageInteractionResourceStatus): Self = StObject.set(x, "inbound_resource_status", value.asInstanceOf[js.Any])
      
      inline def setInbound_resource_type(value: String): Self = StObject.set(x, "inbound_resource_type", value.asInstanceOf[js.Any])
      
      inline def setInbound_resource_url(value: String): Self = StObject.set(x, "inbound_resource_url", value.asInstanceOf[js.Any])
      
      inline def setOutbound_participant_sid(value: String): Self = StObject.set(x, "outbound_participant_sid", value.asInstanceOf[js.Any])
      
      inline def setOutbound_resource_sid(value: String): Self = StObject.set(x, "outbound_resource_sid", value.asInstanceOf[js.Any])
      
      inline def setOutbound_resource_status(value: MessageInteractionResourceStatus): Self = StObject.set(x, "outbound_resource_status", value.asInstanceOf[js.Any])
      
      inline def setOutbound_resource_type(value: String): Self = StObject.set(x, "outbound_resource_type", value.asInstanceOf[js.Any])
      
      inline def setOutbound_resource_url(value: String): Self = StObject.set(x, "outbound_resource_url", value.asInstanceOf[js.Any])
      
      inline def setParticipant_sid(value: String): Self = StObject.set(x, "participant_sid", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSession_sid(value: String): Self = StObject.set(x, "session_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setType(value: MessageInteractionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.accepted
    - typings.twilio.twilioStrings.answered
    - typings.twilio.twilioStrings.busy
    - typings.twilio.twilioStrings.canceled
    - typings.twilio.twilioStrings.completed_
    - typings.twilio.twilioStrings.deleted_
    - typings.twilio.twilioStrings.delivered
    - typings.twilio.twilioStrings.`delivery-unknown`
    - typings.twilio.twilioStrings.failed__
    - typings.twilio.twilioStrings.`in-progress`
    - typings.twilio.twilioStrings.initiated
    - typings.twilio.twilioStrings.`no-answer`
    - typings.twilio.twilioStrings.queued
    - typings.twilio.twilioStrings.received
    - typings.twilio.twilioStrings.receiving
    - typings.twilio.twilioStrings.ringing
    - typings.twilio.twilioStrings.scheduled
    - typings.twilio.twilioStrings.sending
    - typings.twilio.twilioStrings.sent
    - typings.twilio.twilioStrings.undelivered
    - typings.twilio.twilioStrings.unknown_
  */
  trait MessageInteractionResourceStatus extends StObject
  object MessageInteractionResourceStatus {
    
    inline def accepted: typings.twilio.twilioStrings.accepted = "accepted".asInstanceOf[typings.twilio.twilioStrings.accepted]
    
    inline def answered: typings.twilio.twilioStrings.answered = "answered".asInstanceOf[typings.twilio.twilioStrings.answered]
    
    inline def busy: typings.twilio.twilioStrings.busy = "busy".asInstanceOf[typings.twilio.twilioStrings.busy]
    
    inline def canceled: typings.twilio.twilioStrings.canceled = "canceled".asInstanceOf[typings.twilio.twilioStrings.canceled]
    
    inline def completed: completed_ = "completed".asInstanceOf[completed_]
    
    inline def deleted: deleted_ = "deleted".asInstanceOf[deleted_]
    
    inline def delivered: typings.twilio.twilioStrings.delivered = "delivered".asInstanceOf[typings.twilio.twilioStrings.delivered]
    
    inline def `delivery-unknown`: typings.twilio.twilioStrings.`delivery-unknown` = "delivery-unknown".asInstanceOf[typings.twilio.twilioStrings.`delivery-unknown`]
    
    inline def failed: failed__ = "failed".asInstanceOf[failed__]
    
    inline def `in-progress`: typings.twilio.twilioStrings.`in-progress` = "in-progress".asInstanceOf[typings.twilio.twilioStrings.`in-progress`]
    
    inline def initiated: typings.twilio.twilioStrings.initiated = "initiated".asInstanceOf[typings.twilio.twilioStrings.initiated]
    
    inline def `no-answer`: typings.twilio.twilioStrings.`no-answer` = "no-answer".asInstanceOf[typings.twilio.twilioStrings.`no-answer`]
    
    inline def queued: typings.twilio.twilioStrings.queued = "queued".asInstanceOf[typings.twilio.twilioStrings.queued]
    
    inline def received: typings.twilio.twilioStrings.received = "received".asInstanceOf[typings.twilio.twilioStrings.received]
    
    inline def receiving: typings.twilio.twilioStrings.receiving = "receiving".asInstanceOf[typings.twilio.twilioStrings.receiving]
    
    inline def ringing: typings.twilio.twilioStrings.ringing = "ringing".asInstanceOf[typings.twilio.twilioStrings.ringing]
    
    inline def scheduled: typings.twilio.twilioStrings.scheduled = "scheduled".asInstanceOf[typings.twilio.twilioStrings.scheduled]
    
    inline def sending: typings.twilio.twilioStrings.sending = "sending".asInstanceOf[typings.twilio.twilioStrings.sending]
    
    inline def sent: typings.twilio.twilioStrings.sent = "sent".asInstanceOf[typings.twilio.twilioStrings.sent]
    
    inline def undelivered: typings.twilio.twilioStrings.undelivered = "undelivered".asInstanceOf[typings.twilio.twilioStrings.undelivered]
    
    inline def unknown: unknown_ = "unknown".asInstanceOf[unknown_]
  }
  
  trait MessageInteractionSolution extends StObject {
    
    var participantSid: js.UndefOr[String] = js.undefined
    
    var serviceSid: js.UndefOr[String] = js.undefined
    
    var sessionSid: js.UndefOr[String] = js.undefined
  }
  object MessageInteractionSolution {
    
    inline def apply(): MessageInteractionSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageInteractionSolution]
    }
    
    extension [Self <: MessageInteractionSolution](x: Self) {
      
      inline def setParticipantSid(value: String): Self = StObject.set(x, "participantSid", value.asInstanceOf[js.Any])
      
      inline def setParticipantSidUndefined: Self = StObject.set(x, "participantSid", js.undefined)
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
      
      inline def setSessionSid(value: String): Self = StObject.set(x, "sessionSid", value.asInstanceOf[js.Any])
      
      inline def setSessionSidUndefined: Self = StObject.set(x, "sessionSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.message
    - typings.twilio.twilioStrings.voice
    - typings.twilio.twilioStrings.unknown_
  */
  trait MessageInteractionType extends StObject
  object MessageInteractionType {
    
    inline def message: typings.twilio.twilioStrings.message = "message".asInstanceOf[typings.twilio.twilioStrings.message]
    
    inline def unknown: unknown_ = "unknown".asInstanceOf[unknown_]
    
    inline def voice: typings.twilio.twilioStrings.voice = "voice".asInstanceOf[typings.twilio.twilioStrings.voice]
  }
}
