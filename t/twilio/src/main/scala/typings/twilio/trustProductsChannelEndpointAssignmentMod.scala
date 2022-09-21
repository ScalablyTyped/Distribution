package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trustProductsChannelEndpointAssignmentMod {
  
  @JSImport("twilio/lib/rest/trusthub/v1/trustProducts/trustProductsChannelEndpointAssignment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/trusthub/v1/trustProducts/trustProductsChannelEndpointAssignment", "TrustProductsChannelEndpointAssignmentContext")
  @js.native
  open class TrustProductsChannelEndpointAssignmentContext protected () extends StObject {
    /**
      * Initialize the TrustProductsChannelEndpointAssignmentContext
      *
      * @param version - Version of the resource
      * @param trustProductSid - The unique string that identifies the resource.
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.trusthubV1Mod.^, trustProductSid: String, sid: String) = this()
    
    /**
      * fetch a TrustProductsChannelEndpointAssignmentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[TrustProductsChannelEndpointAssignmentInstance] = js.native
    def fetch(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ TrustProductsChannelEndpointAssignmentInstance, 
          Any
        ]
    ): js.Promise[TrustProductsChannelEndpointAssignmentInstance] = js.native
    
    /**
      * remove a TrustProductsChannelEndpointAssignmentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ TrustProductsChannelEndpointAssignmentInstance, 
          Any
        ]
    ): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/trusthub/v1/trustProducts/trustProductsChannelEndpointAssignment", "TrustProductsChannelEndpointAssignmentInstance")
  @js.native
  open class TrustProductsChannelEndpointAssignmentInstance protected () extends SerializableClass {
    /**
      * Initialize the TrustProductsChannelEndpointAssignmentContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param trustProductSid - The unique string that identifies the CustomerProfile resource.
      * @param sid - The unique string that identifies the resource
      */
    def this(
      version: typings.twilio.trusthubV1Mod.^,
      payload: TrustProductsChannelEndpointAssignmentPayload,
      trustProductSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: TrustProductsChannelEndpointAssignmentContext = js.native
    
    var accountSid: String = js.native
    
    var channelEndpointSid: String = js.native
    
    var channelEndpointType: String = js.native
    
    var dateCreated: js.Date = js.native
    
    /**
      * fetch a TrustProductsChannelEndpointAssignmentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[TrustProductsChannelEndpointAssignmentInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TrustProductsChannelEndpointAssignmentInstance] = js.native
    
    /**
      * remove a TrustProductsChannelEndpointAssignmentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var trustProductSid: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the TrustProductsChannelEndpointAssignmentList
    *
    * @param version - Version of the resource
    * @param trustProductSid - The unique string that identifies the CustomerProfile resource.
    */
  inline def TrustProductsChannelEndpointAssignmentList(version: typings.twilio.trusthubV1Mod.^, trustProductSid: String): TrustProductsChannelEndpointAssignmentListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("TrustProductsChannelEndpointAssignmentList")(version.asInstanceOf[js.Any], trustProductSid.asInstanceOf[js.Any])).asInstanceOf[TrustProductsChannelEndpointAssignmentListInstance]
  
  @JSImport("twilio/lib/rest/trusthub/v1/trustProducts/trustProductsChannelEndpointAssignment", "TrustProductsChannelEndpointAssignmentPage")
  @js.native
  open class TrustProductsChannelEndpointAssignmentPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.trusthubV1Mod.^, 
          TrustProductsChannelEndpointAssignmentPayload, 
          TrustProductsChannelEndpointAssignmentResource, 
          TrustProductsChannelEndpointAssignmentInstance
        ] {
    /**
      * Initialize the TrustProductsChannelEndpointAssignmentPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.trusthubV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: TrustProductsChannelEndpointAssignmentSolution
    ) = this()
    
    /**
      * Build an instance of TrustProductsChannelEndpointAssignmentInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: TrustProductsChannelEndpointAssignmentPayload): TrustProductsChannelEndpointAssignmentInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait TrustProductsChannelEndpointAssignmentListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): TrustProductsChannelEndpointAssignmentContext = js.native
    
    /**
      * create a TrustProductsChannelEndpointAssignmentInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: TrustProductsChannelEndpointAssignmentListInstanceCreateOptions): js.Promise[TrustProductsChannelEndpointAssignmentInstance] = js.native
    def create(
      opts: TrustProductsChannelEndpointAssignmentListInstanceCreateOptions,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* item */ TrustProductsChannelEndpointAssignmentInstance, 
          Any
        ]
    ): js.Promise[TrustProductsChannelEndpointAssignmentInstance] = js.native
    
    /**
      * Streams TrustProductsChannelEndpointAssignmentInstance records from the API.
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
          /* item */ TrustProductsChannelEndpointAssignmentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ TrustProductsChannelEndpointAssignmentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: TrustProductsChannelEndpointAssignmentListInstanceEachOptions): Unit = js.native
    def each(
      opts: TrustProductsChannelEndpointAssignmentListInstanceEachOptions,
      callback: js.Function2[
          /* item */ TrustProductsChannelEndpointAssignmentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a trust_products_channel_endpoint_assignment
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): TrustProductsChannelEndpointAssignmentContext = js.native
    
    /**
      * Retrieve a single target page of TrustProductsChannelEndpointAssignmentInstance
      * records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[TrustProductsChannelEndpointAssignmentPage] = js.native
    def getPage(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ TrustProductsChannelEndpointAssignmentPage, 
          Any
        ]
    ): js.Promise[TrustProductsChannelEndpointAssignmentPage] = js.native
    def getPage(targetUrl: String): js.Promise[TrustProductsChannelEndpointAssignmentPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ TrustProductsChannelEndpointAssignmentPage, 
          Any
        ]
    ): js.Promise[TrustProductsChannelEndpointAssignmentPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ TrustProductsChannelEndpointAssignmentPage, 
          Any
        ]
    ): js.Promise[TrustProductsChannelEndpointAssignmentPage] = js.native
    
    /**
      * Lists TrustProductsChannelEndpointAssignmentInstance records from the API as a
      * list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[TrustProductsChannelEndpointAssignmentInstance]] = js.native
    def list(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[TrustProductsChannelEndpointAssignmentInstance], 
          Any
        ]
    ): js.Promise[js.Array[TrustProductsChannelEndpointAssignmentInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[TrustProductsChannelEndpointAssignmentInstance], 
          Any
        ]
    ): js.Promise[js.Array[TrustProductsChannelEndpointAssignmentInstance]] = js.native
    def list(opts: TrustProductsChannelEndpointAssignmentListInstanceOptions): js.Promise[js.Array[TrustProductsChannelEndpointAssignmentInstance]] = js.native
    def list(
      opts: TrustProductsChannelEndpointAssignmentListInstanceOptions,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[TrustProductsChannelEndpointAssignmentInstance], 
          Any
        ]
    ): js.Promise[js.Array[TrustProductsChannelEndpointAssignmentInstance]] = js.native
    
    /**
      * Retrieve a single page of TrustProductsChannelEndpointAssignmentInstance records
      * from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[TrustProductsChannelEndpointAssignmentPage] = js.native
    def page(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ TrustProductsChannelEndpointAssignmentPage, 
          Any
        ]
    ): js.Promise[TrustProductsChannelEndpointAssignmentPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ TrustProductsChannelEndpointAssignmentPage, 
          Any
        ]
    ): js.Promise[TrustProductsChannelEndpointAssignmentPage] = js.native
    def page(opts: TrustProductsChannelEndpointAssignmentListInstancePageOptions): js.Promise[TrustProductsChannelEndpointAssignmentPage] = js.native
    def page(
      opts: TrustProductsChannelEndpointAssignmentListInstancePageOptions,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ TrustProductsChannelEndpointAssignmentPage, 
          Any
        ]
    ): js.Promise[TrustProductsChannelEndpointAssignmentPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property channelEndpointSid - The sid of an channel endpoint
    * @property channelEndpointType - The type of channel endpoint
    */
  trait TrustProductsChannelEndpointAssignmentListInstanceCreateOptions extends StObject {
    
    var channelEndpointSid: String
    
    var channelEndpointType: String
  }
  object TrustProductsChannelEndpointAssignmentListInstanceCreateOptions {
    
    inline def apply(channelEndpointSid: String, channelEndpointType: String): TrustProductsChannelEndpointAssignmentListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(channelEndpointSid = channelEndpointSid.asInstanceOf[js.Any], channelEndpointType = channelEndpointType.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrustProductsChannelEndpointAssignmentListInstanceCreateOptions]
    }
    
    extension [Self <: TrustProductsChannelEndpointAssignmentListInstanceCreateOptions](x: Self) {
      
      inline def setChannelEndpointSid(value: String): Self = StObject.set(x, "channelEndpointSid", value.asInstanceOf[js.Any])
      
      inline def setChannelEndpointType(value: String): Self = StObject.set(x, "channelEndpointType", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property channelEndpointSid - The sid of an channel endpoint
    * @property channelEndpointSids - comma separated list of channel endpoint sids
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
  trait TrustProductsChannelEndpointAssignmentListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ TrustProductsChannelEndpointAssignmentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var channelEndpointSid: js.UndefOr[String] = js.undefined
    
    var channelEndpointSids: js.UndefOr[String] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object TrustProductsChannelEndpointAssignmentListInstanceEachOptions {
    
    inline def apply(): TrustProductsChannelEndpointAssignmentListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrustProductsChannelEndpointAssignmentListInstanceEachOptions]
    }
    
    extension [Self <: TrustProductsChannelEndpointAssignmentListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ TrustProductsChannelEndpointAssignmentInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setChannelEndpointSid(value: String): Self = StObject.set(x, "channelEndpointSid", value.asInstanceOf[js.Any])
      
      inline def setChannelEndpointSidUndefined: Self = StObject.set(x, "channelEndpointSid", js.undefined)
      
      inline def setChannelEndpointSids(value: String): Self = StObject.set(x, "channelEndpointSids", value.asInstanceOf[js.Any])
      
      inline def setChannelEndpointSidsUndefined: Self = StObject.set(x, "channelEndpointSids", js.undefined)
      
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
    * @property channelEndpointSid - The sid of an channel endpoint
    * @property channelEndpointSids - comma separated list of channel endpoint sids
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
  trait TrustProductsChannelEndpointAssignmentListInstanceOptions extends StObject {
    
    var channelEndpointSid: js.UndefOr[String] = js.undefined
    
    var channelEndpointSids: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object TrustProductsChannelEndpointAssignmentListInstanceOptions {
    
    inline def apply(): TrustProductsChannelEndpointAssignmentListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrustProductsChannelEndpointAssignmentListInstanceOptions]
    }
    
    extension [Self <: TrustProductsChannelEndpointAssignmentListInstanceOptions](x: Self) {
      
      inline def setChannelEndpointSid(value: String): Self = StObject.set(x, "channelEndpointSid", value.asInstanceOf[js.Any])
      
      inline def setChannelEndpointSidUndefined: Self = StObject.set(x, "channelEndpointSid", js.undefined)
      
      inline def setChannelEndpointSids(value: String): Self = StObject.set(x, "channelEndpointSids", value.asInstanceOf[js.Any])
      
      inline def setChannelEndpointSidsUndefined: Self = StObject.set(x, "channelEndpointSids", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property channelEndpointSid - The sid of an channel endpoint
    * @property channelEndpointSids - comma separated list of channel endpoint sids
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait TrustProductsChannelEndpointAssignmentListInstancePageOptions extends StObject {
    
    var channelEndpointSid: js.UndefOr[String] = js.undefined
    
    var channelEndpointSids: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object TrustProductsChannelEndpointAssignmentListInstancePageOptions {
    
    inline def apply(): TrustProductsChannelEndpointAssignmentListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrustProductsChannelEndpointAssignmentListInstancePageOptions]
    }
    
    extension [Self <: TrustProductsChannelEndpointAssignmentListInstancePageOptions](x: Self) {
      
      inline def setChannelEndpointSid(value: String): Self = StObject.set(x, "channelEndpointSid", value.asInstanceOf[js.Any])
      
      inline def setChannelEndpointSidUndefined: Self = StObject.set(x, "channelEndpointSid", js.undefined)
      
      inline def setChannelEndpointSids(value: String): Self = StObject.set(x, "channelEndpointSids", value.asInstanceOf[js.Any])
      
      inline def setChannelEndpointSidsUndefined: Self = StObject.set(x, "channelEndpointSids", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait TrustProductsChannelEndpointAssignmentPayload
    extends StObject
       with TrustProductsChannelEndpointAssignmentResource
       with TwilioResponsePayload
  object TrustProductsChannelEndpointAssignmentPayload {
    
    inline def apply(
      account_sid: String,
      channel_endpoint_sid: String,
      channel_endpoint_type: String,
      date_created: js.Date,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      trust_product_sid: String,
      uri: String,
      url: String
    ): TrustProductsChannelEndpointAssignmentPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], channel_endpoint_sid = channel_endpoint_sid.asInstanceOf[js.Any], channel_endpoint_type = channel_endpoint_type.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], trust_product_sid = trust_product_sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrustProductsChannelEndpointAssignmentPayload]
    }
  }
  
  trait TrustProductsChannelEndpointAssignmentResource extends StObject {
    
    var account_sid: String
    
    var channel_endpoint_sid: String
    
    var channel_endpoint_type: String
    
    var date_created: js.Date
    
    var sid: String
    
    var trust_product_sid: String
    
    var url: String
  }
  object TrustProductsChannelEndpointAssignmentResource {
    
    inline def apply(
      account_sid: String,
      channel_endpoint_sid: String,
      channel_endpoint_type: String,
      date_created: js.Date,
      sid: String,
      trust_product_sid: String,
      url: String
    ): TrustProductsChannelEndpointAssignmentResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], channel_endpoint_sid = channel_endpoint_sid.asInstanceOf[js.Any], channel_endpoint_type = channel_endpoint_type.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], trust_product_sid = trust_product_sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrustProductsChannelEndpointAssignmentResource]
    }
    
    extension [Self <: TrustProductsChannelEndpointAssignmentResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setChannel_endpoint_sid(value: String): Self = StObject.set(x, "channel_endpoint_sid", value.asInstanceOf[js.Any])
      
      inline def setChannel_endpoint_type(value: String): Self = StObject.set(x, "channel_endpoint_type", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setTrust_product_sid(value: String): Self = StObject.set(x, "trust_product_sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait TrustProductsChannelEndpointAssignmentSolution extends StObject {
    
    var trustProductSid: js.UndefOr[String] = js.undefined
  }
  object TrustProductsChannelEndpointAssignmentSolution {
    
    inline def apply(): TrustProductsChannelEndpointAssignmentSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrustProductsChannelEndpointAssignmentSolution]
    }
    
    extension [Self <: TrustProductsChannelEndpointAssignmentSolution](x: Self) {
      
      inline def setTrustProductSid(value: String): Self = StObject.set(x, "trustProductSid", value.asInstanceOf[js.Any])
      
      inline def setTrustProductSidUndefined: Self = StObject.set(x, "trustProductSid", js.undefined)
    }
  }
}
