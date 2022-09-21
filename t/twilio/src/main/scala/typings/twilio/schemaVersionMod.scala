package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemaVersionMod {
  
  @JSImport("twilio/lib/rest/events/v1/schema/version", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/events/v1/schema/version", "SchemaVersionContext")
  @js.native
  open class SchemaVersionContext protected () extends StObject {
    /**
      * Initialize the SchemaVersionContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param id - The unique identifier of the schema.
      * @param schemaVersion - The version of the schema
      */
    def this(version: typings.twilio.eventsV1Mod.^, id: String, schemaVersion: Double) = this()
    
    /**
      * fetch a SchemaVersionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SchemaVersionInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ SchemaVersionInstance, Any]): js.Promise[SchemaVersionInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/events/v1/schema/version", "SchemaVersionInstance")
  @js.native
  open class SchemaVersionInstance protected () extends SerializableClass {
    /**
      * Initialize the SchemaVersionContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param id - The unique identifier of the schema.
      * @param schemaVersion - The version of the schema
      */
    def this(
      version: typings.twilio.eventsV1Mod.^,
      payload: SchemaVersionPayload,
      id: String,
      schemaVersion: Double
    ) = this()
    
    /* private */ var _proxy: SchemaVersionContext = js.native
    
    var dateCreated: js.Date = js.native
    
    /**
      * fetch a SchemaVersionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SchemaVersionInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SchemaVersionInstance] = js.native
    
    var id: String = js.native
    
    var raw: String = js.native
    
    var schemaVersion: Double = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the SchemaVersionList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param id - The unique identifier of the schema.
    */
  inline def SchemaVersionList(version: typings.twilio.eventsV1Mod.^, id: String): SchemaVersionListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("SchemaVersionList")(version.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[SchemaVersionListInstance]
  
  @JSImport("twilio/lib/rest/events/v1/schema/version", "SchemaVersionPage")
  @js.native
  open class SchemaVersionPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.eventsV1Mod.^, 
          SchemaVersionPayload, 
          SchemaVersionResource, 
          SchemaVersionInstance
        ] {
    /**
      * Initialize the SchemaVersionPage
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
      solution: SchemaVersionSolution
    ) = this()
    
    /**
      * Build an instance of SchemaVersionInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SchemaVersionPayload): SchemaVersionInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait SchemaVersionListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): SchemaVersionContext = js.native
    
    /**
      * Streams SchemaVersionInstance records from the API.
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
          /* item */ SchemaVersionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ SchemaVersionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: SchemaVersionListInstanceEachOptions): Unit = js.native
    def each(
      opts: SchemaVersionListInstanceEachOptions,
      callback: js.Function2[
          /* item */ SchemaVersionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a schema_version
      *
      * @param schemaVersion - The version of the schema
      */
    def get(schemaVersion: String): SchemaVersionContext = js.native
    
    /**
      * Retrieve a single target page of SchemaVersionInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[SchemaVersionPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ SchemaVersionPage, Any]): js.Promise[SchemaVersionPage] = js.native
    def getPage(targetUrl: String): js.Promise[SchemaVersionPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SchemaVersionPage, Any]
    ): js.Promise[SchemaVersionPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SchemaVersionPage, Any]
    ): js.Promise[SchemaVersionPage] = js.native
    
    /**
      * Lists SchemaVersionInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[SchemaVersionInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SchemaVersionInstance], Any]
    ): js.Promise[js.Array[SchemaVersionInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SchemaVersionInstance], Any]
    ): js.Promise[js.Array[SchemaVersionInstance]] = js.native
    def list(opts: SchemaVersionListInstanceOptions): js.Promise[js.Array[SchemaVersionInstance]] = js.native
    def list(
      opts: SchemaVersionListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SchemaVersionInstance], Any]
    ): js.Promise[js.Array[SchemaVersionInstance]] = js.native
    
    /**
      * Retrieve a single page of SchemaVersionInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[SchemaVersionPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ SchemaVersionPage, Any]): js.Promise[SchemaVersionPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SchemaVersionPage, Any]
    ): js.Promise[SchemaVersionPage] = js.native
    def page(opts: SchemaVersionListInstancePageOptions): js.Promise[SchemaVersionPage] = js.native
    def page(
      opts: SchemaVersionListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SchemaVersionPage, Any]
    ): js.Promise[SchemaVersionPage] = js.native
    
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
  trait SchemaVersionListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ SchemaVersionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SchemaVersionListInstanceEachOptions {
    
    inline def apply(): SchemaVersionListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchemaVersionListInstanceEachOptions]
    }
    
    extension [Self <: SchemaVersionListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ SchemaVersionInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait SchemaVersionListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SchemaVersionListInstanceOptions {
    
    inline def apply(): SchemaVersionListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchemaVersionListInstanceOptions]
    }
    
    extension [Self <: SchemaVersionListInstanceOptions](x: Self) {
      
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
  trait SchemaVersionListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object SchemaVersionListInstancePageOptions {
    
    inline def apply(): SchemaVersionListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchemaVersionListInstancePageOptions]
    }
    
    extension [Self <: SchemaVersionListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait SchemaVersionPayload
    extends StObject
       with SchemaVersionResource
       with TwilioResponsePayload
  object SchemaVersionPayload {
    
    inline def apply(
      date_created: js.Date,
      first_page_uri: String,
      id: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      raw: String,
      schema_version: Double,
      uri: String,
      url: String
    ): SchemaVersionPayload = {
      val __obj = js.Dynamic.literal(date_created = date_created.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], schema_version = schema_version.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemaVersionPayload]
    }
  }
  
  trait SchemaVersionResource extends StObject {
    
    var date_created: js.Date
    
    var id: String
    
    var raw: String
    
    var schema_version: Double
    
    var url: String
  }
  object SchemaVersionResource {
    
    inline def apply(date_created: js.Date, id: String, raw: String, schema_version: Double, url: String): SchemaVersionResource = {
      val __obj = js.Dynamic.literal(date_created = date_created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], schema_version = schema_version.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemaVersionResource]
    }
    
    extension [Self <: SchemaVersionResource](x: Self) {
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setSchema_version(value: Double): Self = StObject.set(x, "schema_version", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait SchemaVersionSolution extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
  }
  object SchemaVersionSolution {
    
    inline def apply(): SchemaVersionSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchemaVersionSolution]
    }
    
    extension [Self <: SchemaVersionSolution](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
}
