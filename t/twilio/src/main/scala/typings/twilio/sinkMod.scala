package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.sinkTestMod.SinkTestListInstance
import typings.twilio.sinkValidateMod.SinkValidateListInstance
import typings.twilio.twilioStrings.active_
import typings.twilio.twilioStrings.failed__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sinkMod {
  
  @JSImport("twilio/lib/rest/events/v1/sink", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/events/v1/sink", "SinkContext")
  @js.native
  open class SinkContext protected () extends StObject {
    /**
      * Initialize the SinkContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param sid - A string that uniquely identifies this Sink.
      */
    def this(version: typings.twilio.eventsV1Mod.^, sid: String) = this()
    
    /**
      * fetch a SinkInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SinkInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ SinkInstance, Any]): js.Promise[SinkInstance] = js.native
    
    /**
      * remove a SinkInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ SinkInstance, Any]): js.Promise[Boolean] = js.native
    
    var sinkTest: SinkTestListInstance = js.native
    
    var sinkValidate: SinkValidateListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a SinkInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: SinkInstanceUpdateOptions): js.Promise[SinkInstance] = js.native
    def update(
      opts: SinkInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SinkInstance, Any]
    ): js.Promise[SinkInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/events/v1/sink", "SinkInstance")
  @js.native
  open class SinkInstance protected () extends SerializableClass {
    /**
      * Initialize the SinkContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - A string that uniquely identifies this Sink.
      */
    def this(version: typings.twilio.eventsV1Mod.^, payload: SinkPayload, sid: String) = this()
    
    /* private */ var _proxy: SinkContext = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var description: String = js.native
    
    /**
      * fetch a SinkInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SinkInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SinkInstance] = js.native
    
    var links: String = js.native
    
    /**
      * remove a SinkInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var sinkConfiguration: Any = js.native
    
    /**
      * Access the sinkTest
      */
    def sinkTest(): SinkTestListInstance = js.native
    
    var sinkType: SinkSinkType = js.native
    
    /**
      * Access the sinkValidate
      */
    def sinkValidate(): SinkValidateListInstance = js.native
    
    var status: SinkStatus = js.native
    
    /**
      * update a SinkInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: SinkInstanceUpdateOptions): js.Promise[SinkInstance] = js.native
    def update(
      opts: SinkInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[SinkInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the SinkList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    */
  inline def SinkList(version: typings.twilio.eventsV1Mod.^): SinkListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("SinkList")(version.asInstanceOf[js.Any]).asInstanceOf[SinkListInstance]
  
  @JSImport("twilio/lib/rest/events/v1/sink", "SinkPage")
  @js.native
  open class SinkPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.eventsV1Mod.^, SinkPayload, SinkResource, SinkInstance] {
    /**
      * Initialize the SinkPage
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.eventsV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: SinkSolution
    ) = this()
    
    /**
      * Build an instance of SinkInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SinkPayload): SinkInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property description - Sink Description
    */
  trait SinkInstanceUpdateOptions extends StObject {
    
    var description: String
  }
  object SinkInstanceUpdateOptions {
    
    inline def apply(description: String): SinkInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
      __obj.asInstanceOf[SinkInstanceUpdateOptions]
    }
    
    extension [Self <: SinkInstanceUpdateOptions](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SinkListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): SinkContext = js.native
    
    /**
      * create a SinkInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: SinkListInstanceCreateOptions): js.Promise[SinkInstance] = js.native
    def create(
      opts: SinkListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ SinkInstance, Any]
    ): js.Promise[SinkInstance] = js.native
    
    /**
      * Streams SinkInstance records from the API.
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
          /* item */ SinkInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ SinkInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: SinkListInstanceEachOptions): Unit = js.native
    def each(
      opts: SinkListInstanceEachOptions,
      callback: js.Function2[
          /* item */ SinkInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a sink
      *
      * @param sid - A string that uniquely identifies this Sink.
      */
    def get(sid: String): SinkContext = js.native
    
    /**
      * Retrieve a single target page of SinkInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[SinkPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ SinkPage, Any]): js.Promise[SinkPage] = js.native
    def getPage(targetUrl: String): js.Promise[SinkPage] = js.native
    def getPage(targetUrl: String, callback: js.Function2[/* error */ js.Error | Null, /* items */ SinkPage, Any]): js.Promise[SinkPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ SinkPage, Any]): js.Promise[SinkPage] = js.native
    
    /**
      * Lists SinkInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[SinkInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SinkInstance], Any]): js.Promise[js.Array[SinkInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SinkInstance], Any]
    ): js.Promise[js.Array[SinkInstance]] = js.native
    def list(opts: SinkListInstanceOptions): js.Promise[js.Array[SinkInstance]] = js.native
    def list(
      opts: SinkListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SinkInstance], Any]
    ): js.Promise[js.Array[SinkInstance]] = js.native
    
    /**
      * Retrieve a single page of SinkInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[SinkPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ SinkPage, Any]): js.Promise[SinkPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ SinkPage, Any]): js.Promise[SinkPage] = js.native
    def page(opts: SinkListInstancePageOptions): js.Promise[SinkPage] = js.native
    def page(
      opts: SinkListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SinkPage, Any]
    ): js.Promise[SinkPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property description - Sink Description.
    * @property sinkConfiguration - JSON Sink configuration.
    * @property sinkType - Sink type.
    */
  trait SinkListInstanceCreateOptions extends StObject {
    
    var description: String
    
    var sinkConfiguration: js.Object
    
    var sinkType: SinkSinkType
  }
  object SinkListInstanceCreateOptions {
    
    inline def apply(description: String, sinkConfiguration: js.Object, sinkType: SinkSinkType): SinkListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], sinkConfiguration = sinkConfiguration.asInstanceOf[js.Any], sinkType = sinkType.asInstanceOf[js.Any])
      __obj.asInstanceOf[SinkListInstanceCreateOptions]
    }
    
    extension [Self <: SinkListInstanceCreateOptions](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setSinkConfiguration(value: js.Object): Self = StObject.set(x, "sinkConfiguration", value.asInstanceOf[js.Any])
      
      inline def setSinkType(value: SinkSinkType): Self = StObject.set(x, "sinkType", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
    * @property inUse - A boolean to return sinks used/not used by a subscription.
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
    * @property status - A string to filter sinks by status.
    */
  trait SinkListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ SinkInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var inUse: js.UndefOr[Boolean] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[String] = js.undefined
  }
  object SinkListInstanceEachOptions {
    
    inline def apply(): SinkListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SinkListInstanceEachOptions]
    }
    
    extension [Self <: SinkListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ SinkInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setInUse(value: Boolean): Self = StObject.set(x, "inUse", value.asInstanceOf[js.Any])
      
      inline def setInUseUndefined: Self = StObject.set(x, "inUse", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property inUse - A boolean to return sinks used/not used by a subscription.
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
    * @property status - A string to filter sinks by status.
    */
  trait SinkListInstanceOptions extends StObject {
    
    var inUse: js.UndefOr[Boolean] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[String] = js.undefined
  }
  object SinkListInstanceOptions {
    
    inline def apply(): SinkListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SinkListInstanceOptions]
    }
    
    extension [Self <: SinkListInstanceOptions](x: Self) {
      
      inline def setInUse(value: Boolean): Self = StObject.set(x, "inUse", value.asInstanceOf[js.Any])
      
      inline def setInUseUndefined: Self = StObject.set(x, "inUse", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property inUse - A boolean to return sinks used/not used by a subscription.
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property status - A string to filter sinks by status.
    */
  trait SinkListInstancePageOptions extends StObject {
    
    var inUse: js.UndefOr[Boolean] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[String] = js.undefined
  }
  object SinkListInstancePageOptions {
    
    inline def apply(): SinkListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SinkListInstancePageOptions]
    }
    
    extension [Self <: SinkListInstancePageOptions](x: Self) {
      
      inline def setInUse(value: Boolean): Self = StObject.set(x, "inUse", value.asInstanceOf[js.Any])
      
      inline def setInUseUndefined: Self = StObject.set(x, "inUse", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  trait SinkPayload
    extends StObject
       with SinkResource
       with TwilioResponsePayload
  object SinkPayload {
    
    inline def apply(
      date_created: js.Date,
      date_updated: js.Date,
      description: String,
      first_page_uri: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      sink_configuration: js.Object,
      sink_type: SinkSinkType,
      status: SinkStatus,
      uri: String,
      url: String
    ): SinkPayload = {
      val __obj = js.Dynamic.literal(date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sink_configuration = sink_configuration.asInstanceOf[js.Any], sink_type = sink_type.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SinkPayload]
    }
  }
  
  trait SinkResource extends StObject {
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var description: String
    
    var links: String
    
    var sid: String
    
    var sink_configuration: js.Object
    
    var sink_type: SinkSinkType
    
    var status: SinkStatus
    
    var url: String
  }
  object SinkResource {
    
    inline def apply(
      date_created: js.Date,
      date_updated: js.Date,
      description: String,
      links: String,
      sid: String,
      sink_configuration: js.Object,
      sink_type: SinkSinkType,
      status: SinkStatus,
      url: String
    ): SinkResource = {
      val __obj = js.Dynamic.literal(date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sink_configuration = sink_configuration.asInstanceOf[js.Any], sink_type = sink_type.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SinkResource]
    }
    
    extension [Self <: SinkResource](x: Self) {
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSink_configuration(value: js.Object): Self = StObject.set(x, "sink_configuration", value.asInstanceOf[js.Any])
      
      inline def setSink_type(value: SinkSinkType): Self = StObject.set(x, "sink_type", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: SinkStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.kinesis
    - typings.twilio.twilioStrings.webhook
    - typings.twilio.twilioStrings.segment
  */
  trait SinkSinkType extends StObject
  object SinkSinkType {
    
    inline def kinesis: typings.twilio.twilioStrings.kinesis = "kinesis".asInstanceOf[typings.twilio.twilioStrings.kinesis]
    
    inline def segment: typings.twilio.twilioStrings.segment = "segment".asInstanceOf[typings.twilio.twilioStrings.segment]
    
    inline def webhook: typings.twilio.twilioStrings.webhook = "webhook".asInstanceOf[typings.twilio.twilioStrings.webhook]
  }
  
  trait SinkSolution extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.initialized
    - typings.twilio.twilioStrings.validating
    - typings.twilio.twilioStrings.active_
    - typings.twilio.twilioStrings.failed__
  */
  trait SinkStatus extends StObject
  object SinkStatus {
    
    inline def active: active_ = "active".asInstanceOf[active_]
    
    inline def failed: failed__ = "failed".asInstanceOf[failed__]
    
    inline def initialized: typings.twilio.twilioStrings.initialized = "initialized".asInstanceOf[typings.twilio.twilioStrings.initialized]
    
    inline def validating: typings.twilio.twilioStrings.validating = "validating".asInstanceOf[typings.twilio.twilioStrings.validating]
  }
}
