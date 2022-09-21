package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object endUserTypeMod {
  
  @JSImport("twilio/lib/rest/numbers/v2/regulatoryCompliance/endUserType", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/numbers/v2/regulatoryCompliance/endUserType", "EndUserTypeContext")
  @js.native
  open class EndUserTypeContext protected () extends StObject {
    /**
      * Initialize the EndUserTypeContext
      *
      * @param version - Version of the resource
      * @param sid - The unique string that identifies the End-User Type resource
      */
    def this(version: typings.twilio.numbersV2Mod.^, sid: String) = this()
    
    /**
      * fetch a EndUserTypeInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[EndUserTypeInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ EndUserTypeInstance, Any]): js.Promise[EndUserTypeInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/numbers/v2/regulatoryCompliance/endUserType", "EndUserTypeInstance")
  @js.native
  open class EndUserTypeInstance protected () extends SerializableClass {
    /**
      * Initialize the EndUserTypeContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The unique string that identifies the End-User Type resource
      */
    def this(version: typings.twilio.numbersV2Mod.^, payload: EndUserTypePayload, sid: String) = this()
    
    /* private */ var _proxy: EndUserTypeContext = js.native
    
    /**
      * fetch a EndUserTypeInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[EndUserTypeInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[EndUserTypeInstance] = js.native
    
    var fields: js.Array[js.Object] = js.native
    
    var friendlyName: String = js.native
    
    var machineName: String = js.native
    
    var sid: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the EndUserTypeList
    *
    * @param version - Version of the resource
    */
  inline def EndUserTypeList(version: typings.twilio.numbersV2Mod.^): EndUserTypeListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("EndUserTypeList")(version.asInstanceOf[js.Any]).asInstanceOf[EndUserTypeListInstance]
  
  @JSImport("twilio/lib/rest/numbers/v2/regulatoryCompliance/endUserType", "EndUserTypePage")
  @js.native
  open class EndUserTypePage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.numbersV2Mod.^, 
          EndUserTypePayload, 
          EndUserTypeResource, 
          EndUserTypeInstance
        ] {
    /**
      * Initialize the EndUserTypePage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.numbersV2Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: EndUserTypeSolution
    ) = this()
    
    /**
      * Build an instance of EndUserTypeInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: EndUserTypePayload): EndUserTypeInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait EndUserTypeListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): EndUserTypeContext = js.native
    
    /**
      * Streams EndUserTypeInstance records from the API.
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
          /* item */ EndUserTypeInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ EndUserTypeInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: EndUserTypeListInstanceEachOptions): Unit = js.native
    def each(
      opts: EndUserTypeListInstanceEachOptions,
      callback: js.Function2[
          /* item */ EndUserTypeInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a end_user_type
      *
      * @param sid - The unique string that identifies the End-User Type resource
      */
    def get(sid: String): EndUserTypeContext = js.native
    
    /**
      * Retrieve a single target page of EndUserTypeInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[EndUserTypePage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ EndUserTypePage, Any]): js.Promise[EndUserTypePage] = js.native
    def getPage(targetUrl: String): js.Promise[EndUserTypePage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ EndUserTypePage, Any]
    ): js.Promise[EndUserTypePage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ EndUserTypePage, Any]
    ): js.Promise[EndUserTypePage] = js.native
    
    /**
      * Lists EndUserTypeInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[EndUserTypeInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[EndUserTypeInstance], Any]
    ): js.Promise[js.Array[EndUserTypeInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[EndUserTypeInstance], Any]
    ): js.Promise[js.Array[EndUserTypeInstance]] = js.native
    def list(opts: EndUserTypeListInstanceOptions): js.Promise[js.Array[EndUserTypeInstance]] = js.native
    def list(
      opts: EndUserTypeListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[EndUserTypeInstance], Any]
    ): js.Promise[js.Array[EndUserTypeInstance]] = js.native
    
    /**
      * Retrieve a single page of EndUserTypeInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[EndUserTypePage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ EndUserTypePage, Any]): js.Promise[EndUserTypePage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ EndUserTypePage, Any]): js.Promise[EndUserTypePage] = js.native
    def page(opts: EndUserTypeListInstancePageOptions): js.Promise[EndUserTypePage] = js.native
    def page(
      opts: EndUserTypeListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ EndUserTypePage, Any]
    ): js.Promise[EndUserTypePage] = js.native
    
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
  trait EndUserTypeListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ EndUserTypeInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object EndUserTypeListInstanceEachOptions {
    
    inline def apply(): EndUserTypeListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndUserTypeListInstanceEachOptions]
    }
    
    extension [Self <: EndUserTypeListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ EndUserTypeInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait EndUserTypeListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object EndUserTypeListInstanceOptions {
    
    inline def apply(): EndUserTypeListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndUserTypeListInstanceOptions]
    }
    
    extension [Self <: EndUserTypeListInstanceOptions](x: Self) {
      
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
  trait EndUserTypeListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object EndUserTypeListInstancePageOptions {
    
    inline def apply(): EndUserTypeListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndUserTypeListInstancePageOptions]
    }
    
    extension [Self <: EndUserTypeListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait EndUserTypePayload
    extends StObject
       with EndUserTypeResource
       with TwilioResponsePayload
  object EndUserTypePayload {
    
    inline def apply(
      fields: js.Array[js.Object],
      first_page_uri: String,
      friendly_name: String,
      machine_name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      uri: String,
      url: String
    ): EndUserTypePayload = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], machine_name = machine_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndUserTypePayload]
    }
  }
  
  trait EndUserTypeResource extends StObject {
    
    var fields: js.Array[js.Object]
    
    var friendly_name: String
    
    var machine_name: String
    
    var sid: String
    
    var url: String
  }
  object EndUserTypeResource {
    
    inline def apply(fields: js.Array[js.Object], friendly_name: String, machine_name: String, sid: String, url: String): EndUserTypeResource = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], machine_name = machine_name.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndUserTypeResource]
    }
    
    extension [Self <: EndUserTypeResource](x: Self) {
      
      inline def setFields(value: js.Array[js.Object]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsVarargs(value: js.Object*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setMachine_name(value: String): Self = StObject.set(x, "machine_name", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait EndUserTypeSolution extends StObject
}
