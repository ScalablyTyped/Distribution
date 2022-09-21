package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscribedEventMod {
  
  @JSImport("twilio/lib/rest/events/v1/subscription/subscribedEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/events/v1/subscription/subscribedEvent", "SubscribedEventContext")
  @js.native
  open class SubscribedEventContext protected () extends StObject {
    /**
      * Initialize the SubscribedEventContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param subscriptionSid - Subscription SID.
      * @param type - Type of event being subscribed to.
      */
    def this(version: typings.twilio.eventsV1Mod.^, subscriptionSid: String, `type`: String) = this()
    
    /**
      * fetch a SubscribedEventInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SubscribedEventInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ SubscribedEventInstance, Any]): js.Promise[SubscribedEventInstance] = js.native
    
    /**
      * remove a SubscribedEventInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ SubscribedEventInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a SubscribedEventInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[SubscribedEventInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ SubscribedEventInstance, Any]): js.Promise[SubscribedEventInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SubscribedEventInstance, Any]
    ): js.Promise[SubscribedEventInstance] = js.native
    def update(opts: SubscribedEventInstanceUpdateOptions): js.Promise[SubscribedEventInstance] = js.native
    def update(
      opts: SubscribedEventInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SubscribedEventInstance, Any]
    ): js.Promise[SubscribedEventInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/events/v1/subscription/subscribedEvent", "SubscribedEventInstance")
  @js.native
  open class SubscribedEventInstance protected () extends SerializableClass {
    /**
      * Initialize the SubscribedEventContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param subscriptionSid - Subscription SID.
      * @param type - Type of event being subscribed to.
      */
    def this(
      version: typings.twilio.eventsV1Mod.^,
      payload: SubscribedEventPayload,
      subscriptionSid: String,
      `type`: String
    ) = this()
    
    /* private */ var _proxy: SubscribedEventContext = js.native
    
    var accountSid: String = js.native
    
    /**
      * fetch a SubscribedEventInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SubscribedEventInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SubscribedEventInstance] = js.native
    
    /**
      * remove a SubscribedEventInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var schemaVersion: Double = js.native
    
    var subscriptionSid: String = js.native
    
    var `type`: String = js.native
    
    /**
      * update a SubscribedEventInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[SubscribedEventInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SubscribedEventInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SubscribedEventInstance] = js.native
    def update(opts: SubscribedEventInstanceUpdateOptions): js.Promise[SubscribedEventInstance] = js.native
    def update(
      opts: SubscribedEventInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[SubscribedEventInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the SubscribedEventList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param subscriptionSid - Subscription SID.
    */
  inline def SubscribedEventList(version: typings.twilio.eventsV1Mod.^, subscriptionSid: String): SubscribedEventListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("SubscribedEventList")(version.asInstanceOf[js.Any], subscriptionSid.asInstanceOf[js.Any])).asInstanceOf[SubscribedEventListInstance]
  
  @JSImport("twilio/lib/rest/events/v1/subscription/subscribedEvent", "SubscribedEventPage")
  @js.native
  open class SubscribedEventPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.eventsV1Mod.^, 
          SubscribedEventPayload, 
          SubscribedEventResource, 
          SubscribedEventInstance
        ] {
    /**
      * Initialize the SubscribedEventPage
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
      solution: SubscribedEventSolution
    ) = this()
    
    /**
      * Build an instance of SubscribedEventInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SubscribedEventPayload): SubscribedEventInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property schemaVersion - The schema version that the subscription should use.
    */
  trait SubscribedEventInstanceUpdateOptions extends StObject {
    
    var schemaVersion: js.UndefOr[Double] = js.undefined
  }
  object SubscribedEventInstanceUpdateOptions {
    
    inline def apply(): SubscribedEventInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscribedEventInstanceUpdateOptions]
    }
    
    extension [Self <: SubscribedEventInstanceUpdateOptions](x: Self) {
      
      inline def setSchemaVersion(value: Double): Self = StObject.set(x, "schemaVersion", value.asInstanceOf[js.Any])
      
      inline def setSchemaVersionUndefined: Self = StObject.set(x, "schemaVersion", js.undefined)
    }
  }
  
  @js.native
  trait SubscribedEventListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): SubscribedEventContext = js.native
    
    /**
      * create a SubscribedEventInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: SubscribedEventListInstanceCreateOptions): js.Promise[SubscribedEventInstance] = js.native
    def create(
      opts: SubscribedEventListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ SubscribedEventInstance, Any]
    ): js.Promise[SubscribedEventInstance] = js.native
    
    /**
      * Streams SubscribedEventInstance records from the API.
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
          /* item */ SubscribedEventInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ SubscribedEventInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: SubscribedEventListInstanceEachOptions): Unit = js.native
    def each(
      opts: SubscribedEventListInstanceEachOptions,
      callback: js.Function2[
          /* item */ SubscribedEventInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a subscribed_event
      *
      * @param type - Type of event being subscribed to.
      */
    def get(`type`: String): SubscribedEventContext = js.native
    
    /**
      * Retrieve a single target page of SubscribedEventInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[SubscribedEventPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ SubscribedEventPage, Any]): js.Promise[SubscribedEventPage] = js.native
    def getPage(targetUrl: String): js.Promise[SubscribedEventPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SubscribedEventPage, Any]
    ): js.Promise[SubscribedEventPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SubscribedEventPage, Any]
    ): js.Promise[SubscribedEventPage] = js.native
    
    /**
      * Lists SubscribedEventInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[SubscribedEventInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SubscribedEventInstance], Any]
    ): js.Promise[js.Array[SubscribedEventInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SubscribedEventInstance], Any]
    ): js.Promise[js.Array[SubscribedEventInstance]] = js.native
    def list(opts: SubscribedEventListInstanceOptions): js.Promise[js.Array[SubscribedEventInstance]] = js.native
    def list(
      opts: SubscribedEventListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SubscribedEventInstance], Any]
    ): js.Promise[js.Array[SubscribedEventInstance]] = js.native
    
    /**
      * Retrieve a single page of SubscribedEventInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[SubscribedEventPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ SubscribedEventPage, Any]): js.Promise[SubscribedEventPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SubscribedEventPage, Any]
    ): js.Promise[SubscribedEventPage] = js.native
    def page(opts: SubscribedEventListInstancePageOptions): js.Promise[SubscribedEventPage] = js.native
    def page(
      opts: SubscribedEventListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SubscribedEventPage, Any]
    ): js.Promise[SubscribedEventPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property schemaVersion - The schema version that the subscription should use.
    * @property type - Type of event being subscribed to.
    */
  trait SubscribedEventListInstanceCreateOptions extends StObject {
    
    var schemaVersion: js.UndefOr[Double] = js.undefined
    
    var `type`: String
  }
  object SubscribedEventListInstanceCreateOptions {
    
    inline def apply(`type`: String): SubscribedEventListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscribedEventListInstanceCreateOptions]
    }
    
    extension [Self <: SubscribedEventListInstanceCreateOptions](x: Self) {
      
      inline def setSchemaVersion(value: Double): Self = StObject.set(x, "schemaVersion", value.asInstanceOf[js.Any])
      
      inline def setSchemaVersionUndefined: Self = StObject.set(x, "schemaVersion", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    */
  trait SubscribedEventListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ SubscribedEventInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SubscribedEventListInstanceEachOptions {
    
    inline def apply(): SubscribedEventListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscribedEventListInstanceEachOptions]
    }
    
    extension [Self <: SubscribedEventListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ SubscribedEventInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait SubscribedEventListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SubscribedEventListInstanceOptions {
    
    inline def apply(): SubscribedEventListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscribedEventListInstanceOptions]
    }
    
    extension [Self <: SubscribedEventListInstanceOptions](x: Self) {
      
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
  trait SubscribedEventListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object SubscribedEventListInstancePageOptions {
    
    inline def apply(): SubscribedEventListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscribedEventListInstancePageOptions]
    }
    
    extension [Self <: SubscribedEventListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait SubscribedEventPayload
    extends StObject
       with SubscribedEventResource
       with TwilioResponsePayload
  object SubscribedEventPayload {
    
    inline def apply(
      account_sid: String,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      schema_version: Double,
      subscription_sid: String,
      `type`: String,
      uri: String,
      url: String
    ): SubscribedEventPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], schema_version = schema_version.asInstanceOf[js.Any], subscription_sid = subscription_sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscribedEventPayload]
    }
  }
  
  trait SubscribedEventResource extends StObject {
    
    var account_sid: String
    
    var schema_version: Double
    
    var subscription_sid: String
    
    var `type`: String
    
    var url: String
  }
  object SubscribedEventResource {
    
    inline def apply(account_sid: String, schema_version: Double, subscription_sid: String, `type`: String, url: String): SubscribedEventResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], schema_version = schema_version.asInstanceOf[js.Any], subscription_sid = subscription_sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscribedEventResource]
    }
    
    extension [Self <: SubscribedEventResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setSchema_version(value: Double): Self = StObject.set(x, "schema_version", value.asInstanceOf[js.Any])
      
      inline def setSubscription_sid(value: String): Self = StObject.set(x, "subscription_sid", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait SubscribedEventSolution extends StObject {
    
    var subscriptionSid: js.UndefOr[String] = js.undefined
  }
  object SubscribedEventSolution {
    
    inline def apply(): SubscribedEventSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscribedEventSolution]
    }
    
    extension [Self <: SubscribedEventSolution](x: Self) {
      
      inline def setSubscriptionSid(value: String): Self = StObject.set(x, "subscriptionSid", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionSidUndefined: Self = StObject.set(x, "subscriptionSid", js.undefined)
    }
  }
}
