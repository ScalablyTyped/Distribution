package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customerProfilesChannelEndpointAssignmentMod {
  
  @JSImport("twilio/lib/rest/trusthub/v1/customerProfiles/customerProfilesChannelEndpointAssignment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/trusthub/v1/customerProfiles/customerProfilesChannelEndpointAssignment", "CustomerProfilesChannelEndpointAssignmentContext")
  @js.native
  open class CustomerProfilesChannelEndpointAssignmentContext protected () extends StObject {
    /**
      * Initialize the CustomerProfilesChannelEndpointAssignmentContext
      *
      * @param version - Version of the resource
      * @param customerProfileSid - The unique string that identifies the resource.
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.trusthubV1Mod.^, customerProfileSid: String, sid: String) = this()
    
    /**
      * fetch a CustomerProfilesChannelEndpointAssignmentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[CustomerProfilesChannelEndpointAssignmentInstance] = js.native
    def fetch(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ CustomerProfilesChannelEndpointAssignmentInstance, 
          Any
        ]
    ): js.Promise[CustomerProfilesChannelEndpointAssignmentInstance] = js.native
    
    /**
      * remove a CustomerProfilesChannelEndpointAssignmentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ CustomerProfilesChannelEndpointAssignmentInstance, 
          Any
        ]
    ): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/trusthub/v1/customerProfiles/customerProfilesChannelEndpointAssignment", "CustomerProfilesChannelEndpointAssignmentInstance")
  @js.native
  open class CustomerProfilesChannelEndpointAssignmentInstance protected () extends SerializableClass {
    /**
      * Initialize the CustomerProfilesChannelEndpointAssignmentContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param customerProfileSid - The unique string that identifies the CustomerProfile resource.
      * @param sid - The unique string that identifies the resource
      */
    def this(
      version: typings.twilio.trusthubV1Mod.^,
      payload: CustomerProfilesChannelEndpointAssignmentPayload,
      customerProfileSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: CustomerProfilesChannelEndpointAssignmentContext = js.native
    
    var accountSid: String = js.native
    
    var channelEndpointSid: String = js.native
    
    var channelEndpointType: String = js.native
    
    var customerProfileSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    /**
      * fetch a CustomerProfilesChannelEndpointAssignmentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[CustomerProfilesChannelEndpointAssignmentInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[CustomerProfilesChannelEndpointAssignmentInstance] = js.native
    
    /**
      * remove a CustomerProfilesChannelEndpointAssignmentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the CustomerProfilesChannelEndpointAssignmentList
    *
    * @param version - Version of the resource
    * @param customerProfileSid - The unique string that identifies the CustomerProfile resource.
    */
  inline def CustomerProfilesChannelEndpointAssignmentList(version: typings.twilio.trusthubV1Mod.^, customerProfileSid: String): CustomerProfilesChannelEndpointAssignmentListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("CustomerProfilesChannelEndpointAssignmentList")(version.asInstanceOf[js.Any], customerProfileSid.asInstanceOf[js.Any])).asInstanceOf[CustomerProfilesChannelEndpointAssignmentListInstance]
  
  @JSImport("twilio/lib/rest/trusthub/v1/customerProfiles/customerProfilesChannelEndpointAssignment", "CustomerProfilesChannelEndpointAssignmentPage")
  @js.native
  open class CustomerProfilesChannelEndpointAssignmentPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.trusthubV1Mod.^, 
          CustomerProfilesChannelEndpointAssignmentPayload, 
          CustomerProfilesChannelEndpointAssignmentResource, 
          CustomerProfilesChannelEndpointAssignmentInstance
        ] {
    /**
      * Initialize the CustomerProfilesChannelEndpointAssignmentPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.trusthubV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: CustomerProfilesChannelEndpointAssignmentSolution
    ) = this()
    
    /**
      * Build an instance of CustomerProfilesChannelEndpointAssignmentInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: CustomerProfilesChannelEndpointAssignmentPayload): CustomerProfilesChannelEndpointAssignmentInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait CustomerProfilesChannelEndpointAssignmentListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): CustomerProfilesChannelEndpointAssignmentContext = js.native
    
    /**
      * create a CustomerProfilesChannelEndpointAssignmentInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: CustomerProfilesChannelEndpointAssignmentListInstanceCreateOptions): js.Promise[CustomerProfilesChannelEndpointAssignmentInstance] = js.native
    def create(
      opts: CustomerProfilesChannelEndpointAssignmentListInstanceCreateOptions,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* item */ CustomerProfilesChannelEndpointAssignmentInstance, 
          Any
        ]
    ): js.Promise[CustomerProfilesChannelEndpointAssignmentInstance] = js.native
    
    /**
      * Streams CustomerProfilesChannelEndpointAssignmentInstance records from the API.
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
          /* item */ CustomerProfilesChannelEndpointAssignmentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ CustomerProfilesChannelEndpointAssignmentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: CustomerProfilesChannelEndpointAssignmentListInstanceEachOptions): Unit = js.native
    def each(
      opts: CustomerProfilesChannelEndpointAssignmentListInstanceEachOptions,
      callback: js.Function2[
          /* item */ CustomerProfilesChannelEndpointAssignmentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a customer_profiles_channel_endpoint_assignment
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): CustomerProfilesChannelEndpointAssignmentContext = js.native
    
    /**
      * Retrieve a single target page of
      * CustomerProfilesChannelEndpointAssignmentInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[CustomerProfilesChannelEndpointAssignmentPage] = js.native
    def getPage(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ CustomerProfilesChannelEndpointAssignmentPage, 
          Any
        ]
    ): js.Promise[CustomerProfilesChannelEndpointAssignmentPage] = js.native
    def getPage(targetUrl: String): js.Promise[CustomerProfilesChannelEndpointAssignmentPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ CustomerProfilesChannelEndpointAssignmentPage, 
          Any
        ]
    ): js.Promise[CustomerProfilesChannelEndpointAssignmentPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ CustomerProfilesChannelEndpointAssignmentPage, 
          Any
        ]
    ): js.Promise[CustomerProfilesChannelEndpointAssignmentPage] = js.native
    
    /**
      * Lists CustomerProfilesChannelEndpointAssignmentInstance records from the API as
      * a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[CustomerProfilesChannelEndpointAssignmentInstance]] = js.native
    def list(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[CustomerProfilesChannelEndpointAssignmentInstance], 
          Any
        ]
    ): js.Promise[js.Array[CustomerProfilesChannelEndpointAssignmentInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[CustomerProfilesChannelEndpointAssignmentInstance], 
          Any
        ]
    ): js.Promise[js.Array[CustomerProfilesChannelEndpointAssignmentInstance]] = js.native
    def list(opts: CustomerProfilesChannelEndpointAssignmentListInstanceOptions): js.Promise[js.Array[CustomerProfilesChannelEndpointAssignmentInstance]] = js.native
    def list(
      opts: CustomerProfilesChannelEndpointAssignmentListInstanceOptions,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[CustomerProfilesChannelEndpointAssignmentInstance], 
          Any
        ]
    ): js.Promise[js.Array[CustomerProfilesChannelEndpointAssignmentInstance]] = js.native
    
    /**
      * Retrieve a single page of CustomerProfilesChannelEndpointAssignmentInstance
      * records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[CustomerProfilesChannelEndpointAssignmentPage] = js.native
    def page(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ CustomerProfilesChannelEndpointAssignmentPage, 
          Any
        ]
    ): js.Promise[CustomerProfilesChannelEndpointAssignmentPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ CustomerProfilesChannelEndpointAssignmentPage, 
          Any
        ]
    ): js.Promise[CustomerProfilesChannelEndpointAssignmentPage] = js.native
    def page(opts: CustomerProfilesChannelEndpointAssignmentListInstancePageOptions): js.Promise[CustomerProfilesChannelEndpointAssignmentPage] = js.native
    def page(
      opts: CustomerProfilesChannelEndpointAssignmentListInstancePageOptions,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ CustomerProfilesChannelEndpointAssignmentPage, 
          Any
        ]
    ): js.Promise[CustomerProfilesChannelEndpointAssignmentPage] = js.native
    
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
  trait CustomerProfilesChannelEndpointAssignmentListInstanceCreateOptions extends StObject {
    
    var channelEndpointSid: String
    
    var channelEndpointType: String
  }
  object CustomerProfilesChannelEndpointAssignmentListInstanceCreateOptions {
    
    inline def apply(channelEndpointSid: String, channelEndpointType: String): CustomerProfilesChannelEndpointAssignmentListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(channelEndpointSid = channelEndpointSid.asInstanceOf[js.Any], channelEndpointType = channelEndpointType.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomerProfilesChannelEndpointAssignmentListInstanceCreateOptions]
    }
    
    extension [Self <: CustomerProfilesChannelEndpointAssignmentListInstanceCreateOptions](x: Self) {
      
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
  trait CustomerProfilesChannelEndpointAssignmentListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ CustomerProfilesChannelEndpointAssignmentInstance, 
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
  object CustomerProfilesChannelEndpointAssignmentListInstanceEachOptions {
    
    inline def apply(): CustomerProfilesChannelEndpointAssignmentListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomerProfilesChannelEndpointAssignmentListInstanceEachOptions]
    }
    
    extension [Self <: CustomerProfilesChannelEndpointAssignmentListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ CustomerProfilesChannelEndpointAssignmentInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait CustomerProfilesChannelEndpointAssignmentListInstanceOptions extends StObject {
    
    var channelEndpointSid: js.UndefOr[String] = js.undefined
    
    var channelEndpointSids: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object CustomerProfilesChannelEndpointAssignmentListInstanceOptions {
    
    inline def apply(): CustomerProfilesChannelEndpointAssignmentListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomerProfilesChannelEndpointAssignmentListInstanceOptions]
    }
    
    extension [Self <: CustomerProfilesChannelEndpointAssignmentListInstanceOptions](x: Self) {
      
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
  trait CustomerProfilesChannelEndpointAssignmentListInstancePageOptions extends StObject {
    
    var channelEndpointSid: js.UndefOr[String] = js.undefined
    
    var channelEndpointSids: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object CustomerProfilesChannelEndpointAssignmentListInstancePageOptions {
    
    inline def apply(): CustomerProfilesChannelEndpointAssignmentListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomerProfilesChannelEndpointAssignmentListInstancePageOptions]
    }
    
    extension [Self <: CustomerProfilesChannelEndpointAssignmentListInstancePageOptions](x: Self) {
      
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
  
  trait CustomerProfilesChannelEndpointAssignmentPayload
    extends StObject
       with CustomerProfilesChannelEndpointAssignmentResource
       with TwilioResponsePayload
  object CustomerProfilesChannelEndpointAssignmentPayload {
    
    inline def apply(
      account_sid: String,
      channel_endpoint_sid: String,
      channel_endpoint_type: String,
      customer_profile_sid: String,
      date_created: js.Date,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      uri: String,
      url: String
    ): CustomerProfilesChannelEndpointAssignmentPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], channel_endpoint_sid = channel_endpoint_sid.asInstanceOf[js.Any], channel_endpoint_type = channel_endpoint_type.asInstanceOf[js.Any], customer_profile_sid = customer_profile_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomerProfilesChannelEndpointAssignmentPayload]
    }
  }
  
  trait CustomerProfilesChannelEndpointAssignmentResource extends StObject {
    
    var account_sid: String
    
    var channel_endpoint_sid: String
    
    var channel_endpoint_type: String
    
    var customer_profile_sid: String
    
    var date_created: js.Date
    
    var sid: String
    
    var url: String
  }
  object CustomerProfilesChannelEndpointAssignmentResource {
    
    inline def apply(
      account_sid: String,
      channel_endpoint_sid: String,
      channel_endpoint_type: String,
      customer_profile_sid: String,
      date_created: js.Date,
      sid: String,
      url: String
    ): CustomerProfilesChannelEndpointAssignmentResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], channel_endpoint_sid = channel_endpoint_sid.asInstanceOf[js.Any], channel_endpoint_type = channel_endpoint_type.asInstanceOf[js.Any], customer_profile_sid = customer_profile_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomerProfilesChannelEndpointAssignmentResource]
    }
    
    extension [Self <: CustomerProfilesChannelEndpointAssignmentResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setChannel_endpoint_sid(value: String): Self = StObject.set(x, "channel_endpoint_sid", value.asInstanceOf[js.Any])
      
      inline def setChannel_endpoint_type(value: String): Self = StObject.set(x, "channel_endpoint_type", value.asInstanceOf[js.Any])
      
      inline def setCustomer_profile_sid(value: String): Self = StObject.set(x, "customer_profile_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait CustomerProfilesChannelEndpointAssignmentSolution extends StObject {
    
    var customerProfileSid: js.UndefOr[String] = js.undefined
  }
  object CustomerProfilesChannelEndpointAssignmentSolution {
    
    inline def apply(): CustomerProfilesChannelEndpointAssignmentSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomerProfilesChannelEndpointAssignmentSolution]
    }
    
    extension [Self <: CustomerProfilesChannelEndpointAssignmentSolution](x: Self) {
      
      inline def setCustomerProfileSid(value: String): Self = StObject.set(x, "customerProfileSid", value.asInstanceOf[js.Any])
      
      inline def setCustomerProfileSidUndefined: Self = StObject.set(x, "customerProfileSid", js.undefined)
    }
  }
}
