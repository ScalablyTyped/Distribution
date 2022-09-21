package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appMod {
  
  @JSImport("twilio/lib/rest/microvisor/v1/app", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/microvisor/v1/app", "AppContext")
  @js.native
  open class AppContext protected () extends StObject {
    /**
      * Initialize the AppContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param sid - A string that uniquely identifies this App.
      */
    def this(version: typings.twilio.microvisorV1Mod.^, sid: String) = this()
    
    /**
      * fetch a AppInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AppInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ AppInstance, Any]): js.Promise[AppInstance] = js.native
    
    /**
      * remove a AppInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ AppInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/microvisor/v1/app", "AppInstance")
  @js.native
  open class AppInstance protected () extends SerializableClass {
    /**
      * Initialize the AppContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - A string that uniquely identifies this App.
      */
    def this(version: typings.twilio.microvisorV1Mod.^, payload: AppPayload, sid: String) = this()
    
    /* private */ var _proxy: AppContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a AppInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AppInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AppInstance] = js.native
    
    var hash: String = js.native
    
    /**
      * remove a AppInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var uniqueName: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the AppList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    */
  inline def AppList(version: typings.twilio.microvisorV1Mod.^): AppListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("AppList")(version.asInstanceOf[js.Any]).asInstanceOf[AppListInstance]
  
  @JSImport("twilio/lib/rest/microvisor/v1/app", "AppPage")
  @js.native
  open class AppPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.microvisorV1Mod.^, AppPayload, AppResource, AppInstance] {
    /**
      * Initialize the AppPage
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.microvisorV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: AppSolution
    ) = this()
    
    /**
      * Build an instance of AppInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: AppPayload): AppInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait AppListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): AppContext = js.native
    
    /**
      * Streams AppInstance records from the API.
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
          /* item */ AppInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ AppInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: AppListInstanceEachOptions): Unit = js.native
    def each(
      opts: AppListInstanceEachOptions,
      callback: js.Function2[
          /* item */ AppInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a app
      *
      * @param sid - A string that uniquely identifies this App.
      */
    def get(sid: String): AppContext = js.native
    
    /**
      * Retrieve a single target page of AppInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[AppPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ AppPage, Any]): js.Promise[AppPage] = js.native
    def getPage(targetUrl: String): js.Promise[AppPage] = js.native
    def getPage(targetUrl: String, callback: js.Function2[/* error */ js.Error | Null, /* items */ AppPage, Any]): js.Promise[AppPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ AppPage, Any]): js.Promise[AppPage] = js.native
    
    /**
      * Lists AppInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[AppInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AppInstance], Any]): js.Promise[js.Array[AppInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AppInstance], Any]
    ): js.Promise[js.Array[AppInstance]] = js.native
    def list(opts: AppListInstanceOptions): js.Promise[js.Array[AppInstance]] = js.native
    def list(
      opts: AppListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AppInstance], Any]
    ): js.Promise[js.Array[AppInstance]] = js.native
    
    /**
      * Retrieve a single page of AppInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[AppPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ AppPage, Any]): js.Promise[AppPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ AppPage, Any]): js.Promise[AppPage] = js.native
    def page(opts: AppListInstancePageOptions): js.Promise[AppPage] = js.native
    def page(
      opts: AppListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AppPage, Any]
    ): js.Promise[AppPage] = js.native
    
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
  trait AppListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ AppInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object AppListInstanceEachOptions {
    
    inline def apply(): AppListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppListInstanceEachOptions]
    }
    
    extension [Self <: AppListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ AppInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait AppListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object AppListInstanceOptions {
    
    inline def apply(): AppListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppListInstanceOptions]
    }
    
    extension [Self <: AppListInstanceOptions](x: Self) {
      
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
  trait AppListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object AppListInstancePageOptions {
    
    inline def apply(): AppListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppListInstancePageOptions]
    }
    
    extension [Self <: AppListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait AppPayload
    extends StObject
       with AppResource
       with TwilioResponsePayload
  object AppPayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      hash: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      unique_name: String,
      uri: String,
      url: String
    ): AppPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppPayload]
    }
  }
  
  trait AppResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var hash: String
    
    var sid: String
    
    var unique_name: String
    
    var url: String
  }
  object AppResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      hash: String,
      sid: String,
      unique_name: String,
      url: String
    ): AppResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppResource]
    }
    
    extension [Self <: AppResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppSolution extends StObject
}
