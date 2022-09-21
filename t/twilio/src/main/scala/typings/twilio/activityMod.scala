package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object activityMod {
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/activity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/activity", "ActivityContext")
  @js.native
  open class ActivityContext protected () extends StObject {
    /**
      * Initialize the ActivityContext
      *
      * @param version - Version of the resource
      * @param workspaceSid - The SID of the Workspace with the Activity resources to fetch
      * @param sid - The SID of the resource to fetch
      */
    def this(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String, sid: String) = this()
    
    /**
      * fetch a ActivityInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ActivityInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ ActivityInstance, Any]): js.Promise[ActivityInstance] = js.native
    
    /**
      * remove a ActivityInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ ActivityInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a ActivityInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ActivityInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ ActivityInstance, Any]): js.Promise[ActivityInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ ActivityInstance, Any]): js.Promise[ActivityInstance] = js.native
    def update(opts: ActivityInstanceUpdateOptions): js.Promise[ActivityInstance] = js.native
    def update(
      opts: ActivityInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ActivityInstance, Any]
    ): js.Promise[ActivityInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/activity", "ActivityInstance")
  @js.native
  open class ActivityInstance protected () extends SerializableClass {
    /**
      * Initialize the ActivityContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param workspaceSid - The SID of the Workspace that contains the Activity
      * @param sid - The SID of the resource to fetch
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      payload: ActivityPayload,
      workspaceSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: ActivityContext = js.native
    
    var accountSid: String = js.native
    
    var available: Boolean = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a ActivityInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ActivityInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ActivityInstance] = js.native
    
    var friendlyName: String = js.native
    
    var links: String = js.native
    
    /**
      * remove a ActivityInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    /**
      * update a ActivityInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ActivityInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ActivityInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ActivityInstance] = js.native
    def update(opts: ActivityInstanceUpdateOptions): js.Promise[ActivityInstance] = js.native
    def update(
      opts: ActivityInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[ActivityInstance] = js.native
    
    var url: String = js.native
    
    var workspaceSid: String = js.native
  }
  
  /**
    * Initialize the ActivityList
    *
    * @param version - Version of the resource
    * @param workspaceSid - The SID of the Workspace that contains the Activity
    */
  inline def ActivityList(version: typings.twilio.taskrouterV1Mod.^, workspaceSid: String): ActivityListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("ActivityList")(version.asInstanceOf[js.Any], workspaceSid.asInstanceOf[js.Any])).asInstanceOf[ActivityListInstance]
  
  @JSImport("twilio/lib/rest/taskrouter/v1/workspace/activity", "ActivityPage")
  @js.native
  open class ActivityPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.taskrouterV1Mod.^, ActivityPayload, ActivityResource, ActivityInstance] {
    /**
      * Initialize the ActivityPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.taskrouterV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: ActivitySolution
    ) = this()
    
    /**
      * Build an instance of ActivityInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ActivityPayload): ActivityInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property friendlyName - A string to describe the Activity resource
    */
  trait ActivityInstanceUpdateOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
  }
  object ActivityInstanceUpdateOptions {
    
    inline def apply(): ActivityInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActivityInstanceUpdateOptions]
    }
    
    extension [Self <: ActivityInstanceUpdateOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    }
  }
  
  @js.native
  trait ActivityListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): ActivityContext = js.native
    
    /**
      * create a ActivityInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: ActivityListInstanceCreateOptions): js.Promise[ActivityInstance] = js.native
    def create(
      opts: ActivityListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ ActivityInstance, Any]
    ): js.Promise[ActivityInstance] = js.native
    
    /**
      * Streams ActivityInstance records from the API.
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
          /* item */ ActivityInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ ActivityInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: ActivityListInstanceEachOptions): Unit = js.native
    def each(
      opts: ActivityListInstanceEachOptions,
      callback: js.Function2[
          /* item */ ActivityInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a activity
      *
      * @param sid - The SID of the resource to fetch
      */
    def get(sid: String): ActivityContext = js.native
    
    /**
      * Retrieve a single target page of ActivityInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[ActivityPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ ActivityPage, Any]): js.Promise[ActivityPage] = js.native
    def getPage(targetUrl: String): js.Promise[ActivityPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ActivityPage, Any]
    ): js.Promise[ActivityPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ActivityPage, Any]
    ): js.Promise[ActivityPage] = js.native
    
    /**
      * Lists ActivityInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[ActivityInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ActivityInstance], Any]): js.Promise[js.Array[ActivityInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ActivityInstance], Any]
    ): js.Promise[js.Array[ActivityInstance]] = js.native
    def list(opts: ActivityListInstanceOptions): js.Promise[js.Array[ActivityInstance]] = js.native
    def list(
      opts: ActivityListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ActivityInstance], Any]
    ): js.Promise[js.Array[ActivityInstance]] = js.native
    
    /**
      * Retrieve a single page of ActivityInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[ActivityPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ ActivityPage, Any]): js.Promise[ActivityPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ ActivityPage, Any]): js.Promise[ActivityPage] = js.native
    def page(opts: ActivityListInstancePageOptions): js.Promise[ActivityPage] = js.native
    def page(
      opts: ActivityListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ActivityPage, Any]
    ): js.Promise[ActivityPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property available - Whether the Worker should be eligible to receive a Task when it occupies the Activity
    * @property friendlyName - A string to describe the Activity resource
    */
  trait ActivityListInstanceCreateOptions extends StObject {
    
    var available: js.UndefOr[Boolean] = js.undefined
    
    var friendlyName: String
  }
  object ActivityListInstanceCreateOptions {
    
    inline def apply(friendlyName: String): ActivityListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActivityListInstanceCreateOptions]
    }
    
    extension [Self <: ActivityListInstanceCreateOptions](x: Self) {
      
      inline def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
      
      inline def setAvailableUndefined: Self = StObject.set(x, "available", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property available - Whether to return activities that are available or unavailable
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
    * @property friendlyName - The friendly_name of the Activity resources to read
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
  trait ActivityListInstanceEachOptions extends StObject {
    
    var available: js.UndefOr[String] = js.undefined
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ ActivityInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ActivityListInstanceEachOptions {
    
    inline def apply(): ActivityListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActivityListInstanceEachOptions]
    }
    
    extension [Self <: ActivityListInstanceEachOptions](x: Self) {
      
      inline def setAvailable(value: String): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
      
      inline def setAvailableUndefined: Self = StObject.set(x, "available", js.undefined)
      
      inline def setCallback(
        value: (/* item */ ActivityInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property available - Whether to return activities that are available or unavailable
    * @property friendlyName - The friendly_name of the Activity resources to read
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
  trait ActivityListInstanceOptions extends StObject {
    
    var available: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ActivityListInstanceOptions {
    
    inline def apply(): ActivityListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActivityListInstanceOptions]
    }
    
    extension [Self <: ActivityListInstanceOptions](x: Self) {
      
      inline def setAvailable(value: String): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
      
      inline def setAvailableUndefined: Self = StObject.set(x, "available", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property available - Whether to return activities that are available or unavailable
    * @property friendlyName - The friendly_name of the Activity resources to read
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait ActivityListInstancePageOptions extends StObject {
    
    var available: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object ActivityListInstancePageOptions {
    
    inline def apply(): ActivityListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActivityListInstancePageOptions]
    }
    
    extension [Self <: ActivityListInstancePageOptions](x: Self) {
      
      inline def setAvailable(value: String): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
      
      inline def setAvailableUndefined: Self = StObject.set(x, "available", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait ActivityPayload
    extends StObject
       with ActivityResource
       with TwilioResponsePayload
  object ActivityPayload {
    
    inline def apply(
      account_sid: String,
      available: Boolean,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      friendly_name: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      uri: String,
      url: String,
      workspace_sid: String
    ): ActivityPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], available = available.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActivityPayload]
    }
  }
  
  trait ActivityResource extends StObject {
    
    var account_sid: String
    
    var available: Boolean
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var links: String
    
    var sid: String
    
    var url: String
    
    var workspace_sid: String
  }
  object ActivityResource {
    
    inline def apply(
      account_sid: String,
      available: Boolean,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      links: String,
      sid: String,
      url: String,
      workspace_sid: String
    ): ActivityResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], available = available.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workspace_sid = workspace_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActivityResource]
    }
    
    extension [Self <: ActivityResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWorkspace_sid(value: String): Self = StObject.set(x, "workspace_sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait ActivitySolution extends StObject {
    
    var workspaceSid: js.UndefOr[String] = js.undefined
  }
  object ActivitySolution {
    
    inline def apply(): ActivitySolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActivitySolution]
    }
    
    extension [Self <: ActivitySolution](x: Self) {
      
      inline def setWorkspaceSid(value: String): Self = StObject.set(x, "workspaceSid", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceSidUndefined: Self = StObject.set(x, "workspaceSid", js.undefined)
    }
  }
}
