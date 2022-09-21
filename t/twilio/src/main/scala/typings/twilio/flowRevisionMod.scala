package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flowRevisionMod {
  
  @JSImport("twilio/lib/rest/studio/v2/flow/flowRevision", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/studio/v2/flow/flowRevision", "FlowRevisionContext")
  @js.native
  open class FlowRevisionContext protected () extends StObject {
    /**
      * Initialize the FlowRevisionContext
      *
      * @param version - Version of the resource
      * @param sid - The SID that identifies the resource to fetch
      * @param revision - Specific Revision number or can be `LatestPublished` and `LatestRevision`
      */
    def this(version: typings.twilio.studioV2Mod.^, sid: String, revision: String) = this()
    
    /**
      * fetch a FlowRevisionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[FlowRevisionInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ FlowRevisionInstance, Any]): js.Promise[FlowRevisionInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/studio/v2/flow/flowRevision", "FlowRevisionInstance")
  @js.native
  open class FlowRevisionInstance protected () extends SerializableClass {
    /**
      * Initialize the FlowRevisionContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The unique string that identifies the resource
      * @param revision - Specific Revision number or can be `LatestPublished` and `LatestRevision`
      */
    def this(version: typings.twilio.studioV2Mod.^, payload: FlowRevisionPayload, sid: String, revision: String) = this()
    
    /* private */ var _proxy: FlowRevisionContext = js.native
    
    var accountSid: String = js.native
    
    var commitMessage: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var definition: Any = js.native
    
    var errors: js.Array[js.Object] = js.native
    
    /**
      * fetch a FlowRevisionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[FlowRevisionInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[FlowRevisionInstance] = js.native
    
    var friendlyName: String = js.native
    
    var revision: Double = js.native
    
    var sid: String = js.native
    
    var status: FlowRevisionStatus = js.native
    
    var url: String = js.native
    
    var valid: Boolean = js.native
  }
  
  /**
    * Initialize the FlowRevisionList
    *
    * @param version - Version of the resource
    * @param sid - The unique string that identifies the resource
    */
  inline def FlowRevisionList(version: typings.twilio.studioV2Mod.^, sid: String): FlowRevisionListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("FlowRevisionList")(version.asInstanceOf[js.Any], sid.asInstanceOf[js.Any])).asInstanceOf[FlowRevisionListInstance]
  
  @JSImport("twilio/lib/rest/studio/v2/flow/flowRevision", "FlowRevisionPage")
  @js.native
  open class FlowRevisionPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.studioV2Mod.^, 
          FlowRevisionPayload, 
          FlowRevisionResource, 
          FlowRevisionInstance
        ] {
    /**
      * Initialize the FlowRevisionPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.studioV2Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: FlowRevisionSolution
    ) = this()
    
    /**
      * Build an instance of FlowRevisionInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: FlowRevisionPayload): FlowRevisionInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait FlowRevisionListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): FlowRevisionContext = js.native
    
    /**
      * Streams FlowRevisionInstance records from the API.
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
          /* item */ FlowRevisionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ FlowRevisionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: FlowRevisionListInstanceEachOptions): Unit = js.native
    def each(
      opts: FlowRevisionListInstanceEachOptions,
      callback: js.Function2[
          /* item */ FlowRevisionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a flow_revision
      *
      * @param revision - Specific Revision number or can be `LatestPublished` and `LatestRevision`
      */
    def get(revision: String): FlowRevisionContext = js.native
    
    /**
      * Retrieve a single target page of FlowRevisionInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[FlowRevisionPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ FlowRevisionPage, Any]): js.Promise[FlowRevisionPage] = js.native
    def getPage(targetUrl: String): js.Promise[FlowRevisionPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ FlowRevisionPage, Any]
    ): js.Promise[FlowRevisionPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ FlowRevisionPage, Any]
    ): js.Promise[FlowRevisionPage] = js.native
    
    /**
      * Lists FlowRevisionInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[FlowRevisionInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[FlowRevisionInstance], Any]
    ): js.Promise[js.Array[FlowRevisionInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[FlowRevisionInstance], Any]
    ): js.Promise[js.Array[FlowRevisionInstance]] = js.native
    def list(opts: FlowRevisionListInstanceOptions): js.Promise[js.Array[FlowRevisionInstance]] = js.native
    def list(
      opts: FlowRevisionListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[FlowRevisionInstance], Any]
    ): js.Promise[js.Array[FlowRevisionInstance]] = js.native
    
    /**
      * Retrieve a single page of FlowRevisionInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[FlowRevisionPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ FlowRevisionPage, Any]): js.Promise[FlowRevisionPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ FlowRevisionPage, Any]): js.Promise[FlowRevisionPage] = js.native
    def page(opts: FlowRevisionListInstancePageOptions): js.Promise[FlowRevisionPage] = js.native
    def page(
      opts: FlowRevisionListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ FlowRevisionPage, Any]
    ): js.Promise[FlowRevisionPage] = js.native
    
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
  trait FlowRevisionListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ FlowRevisionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object FlowRevisionListInstanceEachOptions {
    
    inline def apply(): FlowRevisionListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlowRevisionListInstanceEachOptions]
    }
    
    extension [Self <: FlowRevisionListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ FlowRevisionInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait FlowRevisionListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object FlowRevisionListInstanceOptions {
    
    inline def apply(): FlowRevisionListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlowRevisionListInstanceOptions]
    }
    
    extension [Self <: FlowRevisionListInstanceOptions](x: Self) {
      
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
  trait FlowRevisionListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object FlowRevisionListInstancePageOptions {
    
    inline def apply(): FlowRevisionListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlowRevisionListInstancePageOptions]
    }
    
    extension [Self <: FlowRevisionListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait FlowRevisionPayload
    extends StObject
       with FlowRevisionResource
       with TwilioResponsePayload
  object FlowRevisionPayload {
    
    inline def apply(
      account_sid: String,
      commit_message: String,
      date_created: js.Date,
      date_updated: js.Date,
      definition: js.Object,
      errors: js.Array[js.Object],
      first_page_uri: String,
      friendly_name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      revision: Double,
      sid: String,
      status: FlowRevisionStatus,
      uri: String,
      url: String,
      valid: Boolean
    ): FlowRevisionPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], commit_message = commit_message.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlowRevisionPayload]
    }
  }
  
  trait FlowRevisionResource extends StObject {
    
    var account_sid: String
    
    var commit_message: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var definition: js.Object
    
    var errors: js.Array[js.Object]
    
    var friendly_name: String
    
    var revision: Double
    
    var sid: String
    
    var status: FlowRevisionStatus
    
    var url: String
    
    var valid: Boolean
  }
  object FlowRevisionResource {
    
    inline def apply(
      account_sid: String,
      commit_message: String,
      date_created: js.Date,
      date_updated: js.Date,
      definition: js.Object,
      errors: js.Array[js.Object],
      friendly_name: String,
      revision: Double,
      sid: String,
      status: FlowRevisionStatus,
      url: String,
      valid: Boolean
    ): FlowRevisionResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], commit_message = commit_message.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlowRevisionResource]
    }
    
    extension [Self <: FlowRevisionResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCommit_message(value: String): Self = StObject.set(x, "commit_message", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDefinition(value: js.Object): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: js.Array[js.Object]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: js.Object*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: FlowRevisionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
  
  trait FlowRevisionSolution extends StObject {
    
    var sid: js.UndefOr[String] = js.undefined
  }
  object FlowRevisionSolution {
    
    inline def apply(): FlowRevisionSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlowRevisionSolution]
    }
    
    extension [Self <: FlowRevisionSolution](x: Self) {
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSidUndefined: Self = StObject.set(x, "sid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.draft
    - typings.twilio.twilioStrings.published
  */
  trait FlowRevisionStatus extends StObject
  object FlowRevisionStatus {
    
    inline def draft: typings.twilio.twilioStrings.draft = "draft".asInstanceOf[typings.twilio.twilioStrings.draft]
    
    inline def published: typings.twilio.twilioStrings.published = "published".asInstanceOf[typings.twilio.twilioStrings.published]
  }
}
