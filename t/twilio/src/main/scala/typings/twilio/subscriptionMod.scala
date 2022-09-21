package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.subscribedEventMod.SubscribedEventContext
import typings.twilio.subscribedEventMod.SubscribedEventListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscriptionMod {
  
  @JSImport("twilio/lib/rest/events/v1/subscription", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/events/v1/subscription", "SubscriptionContext")
  @js.native
  open class SubscriptionContext protected () extends StObject {
    /**
      * Initialize the SubscriptionContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param sid - A string that uniquely identifies this Subscription.
      */
    def this(version: typings.twilio.eventsV1Mod.^, sid: String) = this()
    
    /**
      * fetch a SubscriptionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SubscriptionInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ SubscriptionInstance, Any]): js.Promise[SubscriptionInstance] = js.native
    
    /**
      * remove a SubscriptionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ SubscriptionInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def subscribedEvents(sid: String): SubscribedEventContext = js.native
    @JSName("subscribedEvents")
    var subscribedEvents_Original: SubscribedEventListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a SubscriptionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[SubscriptionInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ SubscriptionInstance, Any]): js.Promise[SubscriptionInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SubscriptionInstance, Any]
    ): js.Promise[SubscriptionInstance] = js.native
    def update(opts: SubscriptionInstanceUpdateOptions): js.Promise[SubscriptionInstance] = js.native
    def update(
      opts: SubscriptionInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SubscriptionInstance, Any]
    ): js.Promise[SubscriptionInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/events/v1/subscription", "SubscriptionInstance")
  @js.native
  open class SubscriptionInstance protected () extends SerializableClass {
    /**
      * Initialize the SubscriptionContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - A string that uniquely identifies this Subscription.
      */
    def this(version: typings.twilio.eventsV1Mod.^, payload: SubscriptionPayload, sid: String) = this()
    
    /* private */ var _proxy: SubscriptionContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var description: String = js.native
    
    /**
      * fetch a SubscriptionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SubscriptionInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SubscriptionInstance] = js.native
    
    var links: String = js.native
    
    /**
      * remove a SubscriptionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var sinkSid: String = js.native
    
    /**
      * Access the subscribedEvents
      */
    def subscribedEvents(): SubscribedEventListInstance = js.native
    
    /**
      * update a SubscriptionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[SubscriptionInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SubscriptionInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SubscriptionInstance] = js.native
    def update(opts: SubscriptionInstanceUpdateOptions): js.Promise[SubscriptionInstance] = js.native
    def update(
      opts: SubscriptionInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[SubscriptionInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the SubscriptionList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    */
  inline def SubscriptionList(version: typings.twilio.eventsV1Mod.^): SubscriptionListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("SubscriptionList")(version.asInstanceOf[js.Any]).asInstanceOf[SubscriptionListInstance]
  
  @JSImport("twilio/lib/rest/events/v1/subscription", "SubscriptionPage")
  @js.native
  open class SubscriptionPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.eventsV1Mod.^, 
          SubscriptionPayload, 
          SubscriptionResource, 
          SubscriptionInstance
        ] {
    /**
      * Initialize the SubscriptionPage
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
      solution: SubscriptionSolution
    ) = this()
    
    /**
      * Build an instance of SubscriptionInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SubscriptionPayload): SubscriptionInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property description - Subscription description.
    * @property sinkSid - Sink SID.
    */
  trait SubscriptionInstanceUpdateOptions extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var sinkSid: js.UndefOr[String] = js.undefined
  }
  object SubscriptionInstanceUpdateOptions {
    
    inline def apply(): SubscriptionInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscriptionInstanceUpdateOptions]
    }
    
    extension [Self <: SubscriptionInstanceUpdateOptions](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setSinkSid(value: String): Self = StObject.set(x, "sinkSid", value.asInstanceOf[js.Any])
      
      inline def setSinkSidUndefined: Self = StObject.set(x, "sinkSid", js.undefined)
    }
  }
  
  @js.native
  trait SubscriptionListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): SubscriptionContext = js.native
    
    /**
      * create a SubscriptionInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: SubscriptionListInstanceCreateOptions): js.Promise[SubscriptionInstance] = js.native
    def create(
      opts: SubscriptionListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ SubscriptionInstance, Any]
    ): js.Promise[SubscriptionInstance] = js.native
    
    /**
      * Streams SubscriptionInstance records from the API.
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
          /* item */ SubscriptionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ SubscriptionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: SubscriptionListInstanceEachOptions): Unit = js.native
    def each(
      opts: SubscriptionListInstanceEachOptions,
      callback: js.Function2[
          /* item */ SubscriptionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a subscription
      *
      * @param sid - A string that uniquely identifies this Subscription.
      */
    def get(sid: String): SubscriptionContext = js.native
    
    /**
      * Retrieve a single target page of SubscriptionInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[SubscriptionPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ SubscriptionPage, Any]): js.Promise[SubscriptionPage] = js.native
    def getPage(targetUrl: String): js.Promise[SubscriptionPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SubscriptionPage, Any]
    ): js.Promise[SubscriptionPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SubscriptionPage, Any]
    ): js.Promise[SubscriptionPage] = js.native
    
    /**
      * Lists SubscriptionInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[SubscriptionInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SubscriptionInstance], Any]
    ): js.Promise[js.Array[SubscriptionInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SubscriptionInstance], Any]
    ): js.Promise[js.Array[SubscriptionInstance]] = js.native
    def list(opts: SubscriptionListInstanceOptions): js.Promise[js.Array[SubscriptionInstance]] = js.native
    def list(
      opts: SubscriptionListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SubscriptionInstance], Any]
    ): js.Promise[js.Array[SubscriptionInstance]] = js.native
    
    /**
      * Retrieve a single page of SubscriptionInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[SubscriptionPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ SubscriptionPage, Any]): js.Promise[SubscriptionPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ SubscriptionPage, Any]): js.Promise[SubscriptionPage] = js.native
    def page(opts: SubscriptionListInstancePageOptions): js.Promise[SubscriptionPage] = js.native
    def page(
      opts: SubscriptionListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SubscriptionPage, Any]
    ): js.Promise[SubscriptionPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property description - Subscription description
    * @property sinkSid - Sink SID.
    * @property types - Subscribed Event Types
    */
  trait SubscriptionListInstanceCreateOptions extends StObject {
    
    var description: String
    
    var sinkSid: String
    
    var types: js.Object | js.Array[js.Object]
  }
  object SubscriptionListInstanceCreateOptions {
    
    inline def apply(description: String, sinkSid: String, types: js.Object | js.Array[js.Object]): SubscriptionListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], sinkSid = sinkSid.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscriptionListInstanceCreateOptions]
    }
    
    extension [Self <: SubscriptionListInstanceCreateOptions](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setSinkSid(value: String): Self = StObject.set(x, "sinkSid", value.asInstanceOf[js.Any])
      
      inline def setTypes(value: js.Object | js.Array[js.Object]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesVarargs(value: js.Object*): Self = StObject.set(x, "types", js.Array(value*))
    }
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
    * @property sinkSid - Sink SID.
    */
  trait SubscriptionListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ SubscriptionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var sinkSid: js.UndefOr[String] = js.undefined
  }
  object SubscriptionListInstanceEachOptions {
    
    inline def apply(): SubscriptionListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscriptionListInstanceEachOptions]
    }
    
    extension [Self <: SubscriptionListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ SubscriptionInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setSinkSid(value: String): Self = StObject.set(x, "sinkSid", value.asInstanceOf[js.Any])
      
      inline def setSinkSidUndefined: Self = StObject.set(x, "sinkSid", js.undefined)
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
    * @property sinkSid - Sink SID.
    */
  trait SubscriptionListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var sinkSid: js.UndefOr[String] = js.undefined
  }
  object SubscriptionListInstanceOptions {
    
    inline def apply(): SubscriptionListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscriptionListInstanceOptions]
    }
    
    extension [Self <: SubscriptionListInstanceOptions](x: Self) {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setSinkSid(value: String): Self = StObject.set(x, "sinkSid", value.asInstanceOf[js.Any])
      
      inline def setSinkSidUndefined: Self = StObject.set(x, "sinkSid", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property sinkSid - Sink SID.
    */
  trait SubscriptionListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var sinkSid: js.UndefOr[String] = js.undefined
  }
  object SubscriptionListInstancePageOptions {
    
    inline def apply(): SubscriptionListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscriptionListInstancePageOptions]
    }
    
    extension [Self <: SubscriptionListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setSinkSid(value: String): Self = StObject.set(x, "sinkSid", value.asInstanceOf[js.Any])
      
      inline def setSinkSidUndefined: Self = StObject.set(x, "sinkSid", js.undefined)
    }
  }
  
  trait SubscriptionPayload
    extends StObject
       with SubscriptionResource
       with TwilioResponsePayload
  object SubscriptionPayload {
    
    inline def apply(
      account_sid: String,
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
      sink_sid: String,
      uri: String,
      url: String
    ): SubscriptionPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sink_sid = sink_sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscriptionPayload]
    }
  }
  
  trait SubscriptionResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var description: String
    
    var links: String
    
    var sid: String
    
    var sink_sid: String
    
    var url: String
  }
  object SubscriptionResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      description: String,
      links: String,
      sid: String,
      sink_sid: String,
      url: String
    ): SubscriptionResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sink_sid = sink_sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscriptionResource]
    }
    
    extension [Self <: SubscriptionResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSink_sid(value: String): Self = StObject.set(x, "sink_sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait SubscriptionSolution extends StObject
}
