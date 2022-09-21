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

object sessionInteractionMod {
  
  @JSImport("twilio/lib/rest/proxy/v1/service/session/interaction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/proxy/v1/service/session/interaction", "InteractionContext")
  @js.native
  open class InteractionContext protected () extends StObject {
    /**
      * Initialize the InteractionContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param serviceSid - The SID of the parent Service of the resource to fetch
      * @param sessionSid - he SID of the parent Session of the resource to fetch
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.proxyV1Mod.^, serviceSid: String, sessionSid: String, sid: String) = this()
    
    /**
      * fetch a InteractionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[InteractionInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ InteractionInstance, Any]): js.Promise[InteractionInstance] = js.native
    
    /**
      * remove a InteractionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ InteractionInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/proxy/v1/service/session/interaction", "InteractionInstance")
  @js.native
  open class InteractionInstance protected () extends SerializableClass {
    /**
      * Initialize the InteractionContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - The SID of the resource's parent Service
      * @param sessionSid - The SID of the resource's parent Session
      * @param sid - The unique string that identifies the resource
      */
    def this(
      version: typings.twilio.proxyV1Mod.^,
      payload: InteractionPayload,
      serviceSid: String,
      sessionSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: InteractionContext = js.native
    
    var accountSid: String = js.native
    
    var data: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a InteractionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[InteractionInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[InteractionInstance] = js.native
    
    var inboundParticipantSid: String = js.native
    
    var inboundResourceSid: String = js.native
    
    var inboundResourceStatus: InteractionResourceStatus = js.native
    
    var inboundResourceType: String = js.native
    
    var inboundResourceUrl: String = js.native
    
    var outboundParticipantSid: String = js.native
    
    var outboundResourceSid: String = js.native
    
    var outboundResourceStatus: InteractionResourceStatus = js.native
    
    var outboundResourceType: String = js.native
    
    var outboundResourceUrl: String = js.native
    
    /**
      * remove a InteractionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var serviceSid: String = js.native
    
    var sessionSid: String = js.native
    
    var sid: String = js.native
    
    var `type`: InteractionType = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the InteractionList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param serviceSid - The SID of the resource's parent Service
    * @param sessionSid - The SID of the resource's parent Session
    */
  inline def InteractionList(version: typings.twilio.proxyV1Mod.^, serviceSid: String, sessionSid: String): InteractionListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("InteractionList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any], sessionSid.asInstanceOf[js.Any])).asInstanceOf[InteractionListInstance]
  
  @JSImport("twilio/lib/rest/proxy/v1/service/session/interaction", "InteractionPage")
  @js.native
  open class InteractionPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.proxyV1Mod.^, 
          InteractionPayload, 
          InteractionResource, 
          InteractionInstance
        ] {
    /**
      * Initialize the InteractionPage
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
      solution: InteractionSolution
    ) = this()
    
    /**
      * Build an instance of InteractionInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: InteractionPayload): InteractionInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait InteractionListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): InteractionContext = js.native
    
    /**
      * Streams InteractionInstance records from the API.
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
          /* item */ InteractionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ InteractionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: InteractionListInstanceEachOptions): Unit = js.native
    def each(
      opts: InteractionListInstanceEachOptions,
      callback: js.Function2[
          /* item */ InteractionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a interaction
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): InteractionContext = js.native
    
    /**
      * Retrieve a single target page of InteractionInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[InteractionPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ InteractionPage, Any]): js.Promise[InteractionPage] = js.native
    def getPage(targetUrl: String): js.Promise[InteractionPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ InteractionPage, Any]
    ): js.Promise[InteractionPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ InteractionPage, Any]
    ): js.Promise[InteractionPage] = js.native
    
    /**
      * Lists InteractionInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[InteractionInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[InteractionInstance], Any]
    ): js.Promise[js.Array[InteractionInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[InteractionInstance], Any]
    ): js.Promise[js.Array[InteractionInstance]] = js.native
    def list(opts: InteractionListInstanceOptions): js.Promise[js.Array[InteractionInstance]] = js.native
    def list(
      opts: InteractionListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[InteractionInstance], Any]
    ): js.Promise[js.Array[InteractionInstance]] = js.native
    
    /**
      * Retrieve a single page of InteractionInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[InteractionPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ InteractionPage, Any]): js.Promise[InteractionPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ InteractionPage, Any]): js.Promise[InteractionPage] = js.native
    def page(opts: InteractionListInstancePageOptions): js.Promise[InteractionPage] = js.native
    def page(
      opts: InteractionListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ InteractionPage, Any]
    ): js.Promise[InteractionPage] = js.native
    
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
  trait InteractionListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ InteractionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object InteractionListInstanceEachOptions {
    
    inline def apply(): InteractionListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InteractionListInstanceEachOptions]
    }
    
    extension [Self <: InteractionListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ InteractionInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait InteractionListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object InteractionListInstanceOptions {
    
    inline def apply(): InteractionListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InteractionListInstanceOptions]
    }
    
    extension [Self <: InteractionListInstanceOptions](x: Self) {
      
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
  trait InteractionListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object InteractionListInstancePageOptions {
    
    inline def apply(): InteractionListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InteractionListInstancePageOptions]
    }
    
    extension [Self <: InteractionListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait InteractionPayload
    extends StObject
       with InteractionResource
       with TwilioResponsePayload
  object InteractionPayload {
    
    inline def apply(
      account_sid: String,
      data: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      inbound_participant_sid: String,
      inbound_resource_sid: String,
      inbound_resource_status: InteractionResourceStatus,
      inbound_resource_type: String,
      inbound_resource_url: String,
      next_page_uri: String,
      outbound_participant_sid: String,
      outbound_resource_sid: String,
      outbound_resource_status: InteractionResourceStatus,
      outbound_resource_type: String,
      outbound_resource_url: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      service_sid: String,
      session_sid: String,
      sid: String,
      `type`: InteractionType,
      uri: String,
      url: String
    ): InteractionPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], inbound_participant_sid = inbound_participant_sid.asInstanceOf[js.Any], inbound_resource_sid = inbound_resource_sid.asInstanceOf[js.Any], inbound_resource_status = inbound_resource_status.asInstanceOf[js.Any], inbound_resource_type = inbound_resource_type.asInstanceOf[js.Any], inbound_resource_url = inbound_resource_url.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], outbound_participant_sid = outbound_participant_sid.asInstanceOf[js.Any], outbound_resource_sid = outbound_resource_sid.asInstanceOf[js.Any], outbound_resource_status = outbound_resource_status.asInstanceOf[js.Any], outbound_resource_type = outbound_resource_type.asInstanceOf[js.Any], outbound_resource_url = outbound_resource_url.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], session_sid = session_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[InteractionPayload]
    }
  }
  
  trait InteractionResource extends StObject {
    
    var account_sid: String
    
    var data: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var inbound_participant_sid: String
    
    var inbound_resource_sid: String
    
    var inbound_resource_status: InteractionResourceStatus
    
    var inbound_resource_type: String
    
    var inbound_resource_url: String
    
    var outbound_participant_sid: String
    
    var outbound_resource_sid: String
    
    var outbound_resource_status: InteractionResourceStatus
    
    var outbound_resource_type: String
    
    var outbound_resource_url: String
    
    var service_sid: String
    
    var session_sid: String
    
    var sid: String
    
    var `type`: InteractionType
    
    var url: String
  }
  object InteractionResource {
    
    inline def apply(
      account_sid: String,
      data: String,
      date_created: js.Date,
      date_updated: js.Date,
      inbound_participant_sid: String,
      inbound_resource_sid: String,
      inbound_resource_status: InteractionResourceStatus,
      inbound_resource_type: String,
      inbound_resource_url: String,
      outbound_participant_sid: String,
      outbound_resource_sid: String,
      outbound_resource_status: InteractionResourceStatus,
      outbound_resource_type: String,
      outbound_resource_url: String,
      service_sid: String,
      session_sid: String,
      sid: String,
      `type`: InteractionType,
      url: String
    ): InteractionResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], inbound_participant_sid = inbound_participant_sid.asInstanceOf[js.Any], inbound_resource_sid = inbound_resource_sid.asInstanceOf[js.Any], inbound_resource_status = inbound_resource_status.asInstanceOf[js.Any], inbound_resource_type = inbound_resource_type.asInstanceOf[js.Any], inbound_resource_url = inbound_resource_url.asInstanceOf[js.Any], outbound_participant_sid = outbound_participant_sid.asInstanceOf[js.Any], outbound_resource_sid = outbound_resource_sid.asInstanceOf[js.Any], outbound_resource_status = outbound_resource_status.asInstanceOf[js.Any], outbound_resource_type = outbound_resource_type.asInstanceOf[js.Any], outbound_resource_url = outbound_resource_url.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], session_sid = session_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[InteractionResource]
    }
    
    extension [Self <: InteractionResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setInbound_participant_sid(value: String): Self = StObject.set(x, "inbound_participant_sid", value.asInstanceOf[js.Any])
      
      inline def setInbound_resource_sid(value: String): Self = StObject.set(x, "inbound_resource_sid", value.asInstanceOf[js.Any])
      
      inline def setInbound_resource_status(value: InteractionResourceStatus): Self = StObject.set(x, "inbound_resource_status", value.asInstanceOf[js.Any])
      
      inline def setInbound_resource_type(value: String): Self = StObject.set(x, "inbound_resource_type", value.asInstanceOf[js.Any])
      
      inline def setInbound_resource_url(value: String): Self = StObject.set(x, "inbound_resource_url", value.asInstanceOf[js.Any])
      
      inline def setOutbound_participant_sid(value: String): Self = StObject.set(x, "outbound_participant_sid", value.asInstanceOf[js.Any])
      
      inline def setOutbound_resource_sid(value: String): Self = StObject.set(x, "outbound_resource_sid", value.asInstanceOf[js.Any])
      
      inline def setOutbound_resource_status(value: InteractionResourceStatus): Self = StObject.set(x, "outbound_resource_status", value.asInstanceOf[js.Any])
      
      inline def setOutbound_resource_type(value: String): Self = StObject.set(x, "outbound_resource_type", value.asInstanceOf[js.Any])
      
      inline def setOutbound_resource_url(value: String): Self = StObject.set(x, "outbound_resource_url", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSession_sid(value: String): Self = StObject.set(x, "session_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setType(value: InteractionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
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
  trait InteractionResourceStatus extends StObject
  object InteractionResourceStatus {
    
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
  
  trait InteractionSolution extends StObject {
    
    var serviceSid: js.UndefOr[String] = js.undefined
    
    var sessionSid: js.UndefOr[String] = js.undefined
  }
  object InteractionSolution {
    
    inline def apply(): InteractionSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InteractionSolution]
    }
    
    extension [Self <: InteractionSolution](x: Self) {
      
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
  trait InteractionType extends StObject
  object InteractionType {
    
    inline def message: typings.twilio.twilioStrings.message = "message".asInstanceOf[typings.twilio.twilioStrings.message]
    
    inline def unknown: unknown_ = "unknown".asInstanceOf[unknown_]
    
    inline def voice: typings.twilio.twilioStrings.voice = "voice".asInstanceOf[typings.twilio.twilioStrings.voice]
  }
}
