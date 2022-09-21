package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1SupportingDocumentTypeMod {
  
  @JSImport("twilio/lib/rest/trusthub/v1/supportingDocumentType", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/trusthub/v1/supportingDocumentType", "SupportingDocumentTypeContext")
  @js.native
  open class SupportingDocumentTypeContext protected () extends StObject {
    /**
      * Initialize the SupportingDocumentTypeContext
      *
      * @param version - Version of the resource
      * @param sid - The unique string that identifies the Supporting Document Type resource
      */
    def this(version: typings.twilio.trusthubV1Mod.^, sid: String) = this()
    
    /**
      * fetch a SupportingDocumentTypeInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SupportingDocumentTypeInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SupportingDocumentTypeInstance, Any]
    ): js.Promise[SupportingDocumentTypeInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/trusthub/v1/supportingDocumentType", "SupportingDocumentTypeInstance")
  @js.native
  open class SupportingDocumentTypeInstance protected () extends SerializableClass {
    /**
      * Initialize the SupportingDocumentTypeContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The unique string that identifies the Supporting Document Type resource
      */
    def this(version: typings.twilio.trusthubV1Mod.^, payload: SupportingDocumentTypePayload, sid: String) = this()
    
    /* private */ var _proxy: SupportingDocumentTypeContext = js.native
    
    /**
      * fetch a SupportingDocumentTypeInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SupportingDocumentTypeInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SupportingDocumentTypeInstance] = js.native
    
    var fields: js.Array[js.Object] = js.native
    
    var friendlyName: String = js.native
    
    var machineName: String = js.native
    
    var sid: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the SupportingDocumentTypeList
    *
    * @param version - Version of the resource
    */
  inline def SupportingDocumentTypeList(version: typings.twilio.trusthubV1Mod.^): SupportingDocumentTypeListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("SupportingDocumentTypeList")(version.asInstanceOf[js.Any]).asInstanceOf[SupportingDocumentTypeListInstance]
  
  @JSImport("twilio/lib/rest/trusthub/v1/supportingDocumentType", "SupportingDocumentTypePage")
  @js.native
  open class SupportingDocumentTypePage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.trusthubV1Mod.^, 
          SupportingDocumentTypePayload, 
          SupportingDocumentTypeResource, 
          SupportingDocumentTypeInstance
        ] {
    /**
      * Initialize the SupportingDocumentTypePage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.trusthubV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: SupportingDocumentTypeSolution
    ) = this()
    
    /**
      * Build an instance of SupportingDocumentTypeInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SupportingDocumentTypePayload): SupportingDocumentTypeInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait SupportingDocumentTypeListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): SupportingDocumentTypeContext = js.native
    
    /**
      * Streams SupportingDocumentTypeInstance records from the API.
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
          /* item */ SupportingDocumentTypeInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ SupportingDocumentTypeInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: SupportingDocumentTypeListInstanceEachOptions): Unit = js.native
    def each(
      opts: SupportingDocumentTypeListInstanceEachOptions,
      callback: js.Function2[
          /* item */ SupportingDocumentTypeInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a supporting_document_type
      *
      * @param sid - The unique string that identifies the Supporting Document Type resource
      */
    def get(sid: String): SupportingDocumentTypeContext = js.native
    
    /**
      * Retrieve a single target page of SupportingDocumentTypeInstance records from the
      * API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[SupportingDocumentTypePage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ SupportingDocumentTypePage, Any]): js.Promise[SupportingDocumentTypePage] = js.native
    def getPage(targetUrl: String): js.Promise[SupportingDocumentTypePage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SupportingDocumentTypePage, Any]
    ): js.Promise[SupportingDocumentTypePage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SupportingDocumentTypePage, Any]
    ): js.Promise[SupportingDocumentTypePage] = js.native
    
    /**
      * Lists SupportingDocumentTypeInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[SupportingDocumentTypeInstance]] = js.native
    def list(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[SupportingDocumentTypeInstance], 
          Any
        ]
    ): js.Promise[js.Array[SupportingDocumentTypeInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[SupportingDocumentTypeInstance], 
          Any
        ]
    ): js.Promise[js.Array[SupportingDocumentTypeInstance]] = js.native
    def list(opts: SupportingDocumentTypeListInstanceOptions): js.Promise[js.Array[SupportingDocumentTypeInstance]] = js.native
    def list(
      opts: SupportingDocumentTypeListInstanceOptions,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[SupportingDocumentTypeInstance], 
          Any
        ]
    ): js.Promise[js.Array[SupportingDocumentTypeInstance]] = js.native
    
    /**
      * Retrieve a single page of SupportingDocumentTypeInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[SupportingDocumentTypePage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ SupportingDocumentTypePage, Any]): js.Promise[SupportingDocumentTypePage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SupportingDocumentTypePage, Any]
    ): js.Promise[SupportingDocumentTypePage] = js.native
    def page(opts: SupportingDocumentTypeListInstancePageOptions): js.Promise[SupportingDocumentTypePage] = js.native
    def page(
      opts: SupportingDocumentTypeListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SupportingDocumentTypePage, Any]
    ): js.Promise[SupportingDocumentTypePage] = js.native
    
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
  trait SupportingDocumentTypeListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ SupportingDocumentTypeInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SupportingDocumentTypeListInstanceEachOptions {
    
    inline def apply(): SupportingDocumentTypeListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SupportingDocumentTypeListInstanceEachOptions]
    }
    
    extension [Self <: SupportingDocumentTypeListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ SupportingDocumentTypeInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait SupportingDocumentTypeListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SupportingDocumentTypeListInstanceOptions {
    
    inline def apply(): SupportingDocumentTypeListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SupportingDocumentTypeListInstanceOptions]
    }
    
    extension [Self <: SupportingDocumentTypeListInstanceOptions](x: Self) {
      
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
  trait SupportingDocumentTypeListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object SupportingDocumentTypeListInstancePageOptions {
    
    inline def apply(): SupportingDocumentTypeListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SupportingDocumentTypeListInstancePageOptions]
    }
    
    extension [Self <: SupportingDocumentTypeListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait SupportingDocumentTypePayload
    extends StObject
       with SupportingDocumentTypeResource
       with TwilioResponsePayload
  object SupportingDocumentTypePayload {
    
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
    ): SupportingDocumentTypePayload = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], machine_name = machine_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SupportingDocumentTypePayload]
    }
  }
  
  trait SupportingDocumentTypeResource extends StObject {
    
    var fields: js.Array[js.Object]
    
    var friendly_name: String
    
    var machine_name: String
    
    var sid: String
    
    var url: String
  }
  object SupportingDocumentTypeResource {
    
    inline def apply(fields: js.Array[js.Object], friendly_name: String, machine_name: String, sid: String, url: String): SupportingDocumentTypeResource = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], machine_name = machine_name.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SupportingDocumentTypeResource]
    }
    
    extension [Self <: SupportingDocumentTypeResource](x: Self) {
      
      inline def setFields(value: js.Array[js.Object]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsVarargs(value: js.Object*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setMachine_name(value: String): Self = StObject.set(x, "machine_name", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait SupportingDocumentTypeSolution extends StObject
}
