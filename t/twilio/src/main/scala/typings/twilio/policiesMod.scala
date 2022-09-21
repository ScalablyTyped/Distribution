package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object policiesMod {
  
  @JSImport("twilio/lib/rest/trusthub/v1/policies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/trusthub/v1/policies", "PoliciesContext")
  @js.native
  open class PoliciesContext protected () extends StObject {
    /**
      * Initialize the PoliciesContext
      *
      * @param version - Version of the resource
      * @param sid - The unique string that identifies the Policy resource
      */
    def this(version: typings.twilio.trusthubV1Mod.^, sid: String) = this()
    
    /**
      * fetch a PoliciesInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[PoliciesInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ PoliciesInstance, Any]): js.Promise[PoliciesInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/trusthub/v1/policies", "PoliciesInstance")
  @js.native
  open class PoliciesInstance protected () extends SerializableClass {
    /**
      * Initialize the PoliciesContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The unique string that identifies the Policy resource
      */
    def this(version: typings.twilio.trusthubV1Mod.^, payload: PoliciesPayload, sid: String) = this()
    
    /* private */ var _proxy: PoliciesContext = js.native
    
    /**
      * fetch a PoliciesInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[PoliciesInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[PoliciesInstance] = js.native
    
    var friendlyName: String = js.native
    
    var requirements: Any = js.native
    
    var sid: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the PoliciesList
    *
    * @param version - Version of the resource
    */
  inline def PoliciesList(version: typings.twilio.trusthubV1Mod.^): PoliciesListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("PoliciesList")(version.asInstanceOf[js.Any]).asInstanceOf[PoliciesListInstance]
  
  @JSImport("twilio/lib/rest/trusthub/v1/policies", "PoliciesPage")
  @js.native
  open class PoliciesPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.trusthubV1Mod.^, PoliciesPayload, PoliciesResource, PoliciesInstance] {
    /**
      * Initialize the PoliciesPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.trusthubV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: PoliciesSolution
    ) = this()
    
    /**
      * Build an instance of PoliciesInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: PoliciesPayload): PoliciesInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.individual
    - typings.twilio.twilioStrings.business
  */
  trait PoliciesEndUserType extends StObject
  object PoliciesEndUserType {
    
    inline def business: typings.twilio.twilioStrings.business = "business".asInstanceOf[typings.twilio.twilioStrings.business]
    
    inline def individual: typings.twilio.twilioStrings.individual = "individual".asInstanceOf[typings.twilio.twilioStrings.individual]
  }
  
  @js.native
  trait PoliciesListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): PoliciesContext = js.native
    
    /**
      * Streams PoliciesInstance records from the API.
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
          /* item */ PoliciesInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ PoliciesInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: PoliciesListInstanceEachOptions): Unit = js.native
    def each(
      opts: PoliciesListInstanceEachOptions,
      callback: js.Function2[
          /* item */ PoliciesInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a policies
      *
      * @param sid - The unique string that identifies the Policy resource
      */
    def get(sid: String): PoliciesContext = js.native
    
    /**
      * Retrieve a single target page of PoliciesInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[PoliciesPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ PoliciesPage, Any]): js.Promise[PoliciesPage] = js.native
    def getPage(targetUrl: String): js.Promise[PoliciesPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ PoliciesPage, Any]
    ): js.Promise[PoliciesPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ PoliciesPage, Any]
    ): js.Promise[PoliciesPage] = js.native
    
    /**
      * Lists PoliciesInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[PoliciesInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[PoliciesInstance], Any]): js.Promise[js.Array[PoliciesInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[PoliciesInstance], Any]
    ): js.Promise[js.Array[PoliciesInstance]] = js.native
    def list(opts: PoliciesListInstanceOptions): js.Promise[js.Array[PoliciesInstance]] = js.native
    def list(
      opts: PoliciesListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[PoliciesInstance], Any]
    ): js.Promise[js.Array[PoliciesInstance]] = js.native
    
    /**
      * Retrieve a single page of PoliciesInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[PoliciesPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ PoliciesPage, Any]): js.Promise[PoliciesPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ PoliciesPage, Any]): js.Promise[PoliciesPage] = js.native
    def page(opts: PoliciesListInstancePageOptions): js.Promise[PoliciesPage] = js.native
    def page(
      opts: PoliciesListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ PoliciesPage, Any]
    ): js.Promise[PoliciesPage] = js.native
    
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
  trait PoliciesListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ PoliciesInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object PoliciesListInstanceEachOptions {
    
    inline def apply(): PoliciesListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PoliciesListInstanceEachOptions]
    }
    
    extension [Self <: PoliciesListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ PoliciesInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait PoliciesListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object PoliciesListInstanceOptions {
    
    inline def apply(): PoliciesListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PoliciesListInstanceOptions]
    }
    
    extension [Self <: PoliciesListInstanceOptions](x: Self) {
      
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
  trait PoliciesListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object PoliciesListInstancePageOptions {
    
    inline def apply(): PoliciesListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PoliciesListInstancePageOptions]
    }
    
    extension [Self <: PoliciesListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait PoliciesPayload
    extends StObject
       with PoliciesResource
       with TwilioResponsePayload
  object PoliciesPayload {
    
    inline def apply(
      first_page_uri: String,
      friendly_name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      requirements: js.Object,
      sid: String,
      uri: String,
      url: String
    ): PoliciesPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], requirements = requirements.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PoliciesPayload]
    }
  }
  
  trait PoliciesResource extends StObject {
    
    var friendly_name: String
    
    var requirements: js.Object
    
    var sid: String
    
    var url: String
  }
  object PoliciesResource {
    
    inline def apply(friendly_name: String, requirements: js.Object, sid: String, url: String): PoliciesResource = {
      val __obj = js.Dynamic.literal(friendly_name = friendly_name.asInstanceOf[js.Any], requirements = requirements.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PoliciesResource]
    }
    
    extension [Self <: PoliciesResource](x: Self) {
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setRequirements(value: js.Object): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait PoliciesSolution extends StObject
}
