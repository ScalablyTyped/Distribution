package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dayMod {
  
  @JSImport("twilio/lib/rest/bulkexports/v1/export/day", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/bulkexports/v1/export/day", "DayContext")
  @js.native
  open class DayContext protected () extends StObject {
    /**
      * Initialize the DayContext
      *
      * @param version - Version of the resource
      * @param resourceType - The type of communication – Messages, Calls, Conferences, and Participants
      * @param day - The date of the data in the file
      */
    def this(version: typings.twilio.bulkexportsV1Mod.^, resourceType: String, day: String) = this()
    
    /**
      * fetch a DayInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[DayInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ DayInstance, Any]): js.Promise[DayInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/bulkexports/v1/export/day", "DayInstance")
  @js.native
  open class DayInstance protected () extends SerializableClass {
    /**
      * Initialize the DayContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param resourceType - The type of communication – Messages, Calls, Conferences, and Participants
      * @param day - The date of the data in the file
      */
    def this(version: typings.twilio.bulkexportsV1Mod.^, payload: DayPayload, resourceType: String, day: String) = this()
    
    /* private */ var _proxy: DayContext = js.native
    
    var createDate: String = js.native
    
    var day: String = js.native
    
    /**
      * fetch a DayInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[DayInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[DayInstance] = js.native
    
    var friendlyName: String = js.native
    
    var redirectTo: String = js.native
    
    var resourceType: String = js.native
    
    var size: Double = js.native
  }
  
  /**
    * Initialize the DayList
    *
    * @param version - Version of the resource
    * @param resourceType - The type of communication – Messages, Calls, Conferences, and Participants
    */
  inline def DayList(version: typings.twilio.bulkexportsV1Mod.^, resourceType: String): DayListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("DayList")(version.asInstanceOf[js.Any], resourceType.asInstanceOf[js.Any])).asInstanceOf[DayListInstance]
  
  @JSImport("twilio/lib/rest/bulkexports/v1/export/day", "DayPage")
  @js.native
  open class DayPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.bulkexportsV1Mod.^, DayPayload, DayResource, DayInstance] {
    /**
      * Initialize the DayPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.bulkexportsV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: DaySolution
    ) = this()
    
    /**
      * Build an instance of DayInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: DayPayload): DayInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait DayListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): DayContext = js.native
    
    /**
      * Streams DayInstance records from the API.
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
          /* item */ DayInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ DayInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: DayListInstanceEachOptions): Unit = js.native
    def each(
      opts: DayListInstanceEachOptions,
      callback: js.Function2[
          /* item */ DayInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a day
      *
      * @param day - The date of the data in the file
      */
    def get(day: String): DayContext = js.native
    
    /**
      * Retrieve a single target page of DayInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[DayPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ DayPage, Any]): js.Promise[DayPage] = js.native
    def getPage(targetUrl: String): js.Promise[DayPage] = js.native
    def getPage(targetUrl: String, callback: js.Function2[/* error */ js.Error | Null, /* items */ DayPage, Any]): js.Promise[DayPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ DayPage, Any]): js.Promise[DayPage] = js.native
    
    /**
      * Lists DayInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[DayInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[DayInstance], Any]): js.Promise[js.Array[DayInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[DayInstance], Any]
    ): js.Promise[js.Array[DayInstance]] = js.native
    def list(opts: DayListInstanceOptions): js.Promise[js.Array[DayInstance]] = js.native
    def list(
      opts: DayListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[DayInstance], Any]
    ): js.Promise[js.Array[DayInstance]] = js.native
    
    /**
      * Retrieve a single page of DayInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[DayPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ DayPage, Any]): js.Promise[DayPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ DayPage, Any]): js.Promise[DayPage] = js.native
    def page(opts: DayListInstancePageOptions): js.Promise[DayPage] = js.native
    def page(
      opts: DayListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DayPage, Any]
    ): js.Promise[DayPage] = js.native
    
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
  trait DayListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ DayInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object DayListInstanceEachOptions {
    
    inline def apply(): DayListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DayListInstanceEachOptions]
    }
    
    extension [Self <: DayListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ DayInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait DayListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object DayListInstanceOptions {
    
    inline def apply(): DayListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DayListInstanceOptions]
    }
    
    extension [Self <: DayListInstanceOptions](x: Self) {
      
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
  trait DayListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object DayListInstancePageOptions {
    
    inline def apply(): DayListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DayListInstancePageOptions]
    }
    
    extension [Self <: DayListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait DayPayload
    extends StObject
       with DayResource
       with TwilioResponsePayload
  object DayPayload {
    
    inline def apply(
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String
    ): DayPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[DayPayload]
    }
  }
  
  trait DayResource extends StObject {
    
    var create_date: js.UndefOr[String] = js.undefined
    
    var day: js.UndefOr[String] = js.undefined
    
    var friendly_name: js.UndefOr[String] = js.undefined
    
    var redirect_to: js.UndefOr[String] = js.undefined
    
    var resource_type: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object DayResource {
    
    inline def apply(): DayResource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DayResource]
    }
    
    extension [Self <: DayResource](x: Self) {
      
      inline def setCreate_date(value: String): Self = StObject.set(x, "create_date", value.asInstanceOf[js.Any])
      
      inline def setCreate_dateUndefined: Self = StObject.set(x, "create_date", js.undefined)
      
      inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setFriendly_nameUndefined: Self = StObject.set(x, "friendly_name", js.undefined)
      
      inline def setRedirect_to(value: String): Self = StObject.set(x, "redirect_to", value.asInstanceOf[js.Any])
      
      inline def setRedirect_toUndefined: Self = StObject.set(x, "redirect_to", js.undefined)
      
      inline def setResource_type(value: String): Self = StObject.set(x, "resource_type", value.asInstanceOf[js.Any])
      
      inline def setResource_typeUndefined: Self = StObject.set(x, "resource_type", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait DaySolution extends StObject {
    
    var resourceType: js.UndefOr[String] = js.undefined
  }
  object DaySolution {
    
    inline def apply(): DaySolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DaySolution]
    }
    
    extension [Self <: DaySolution](x: Self) {
      
      inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
      
      inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    }
  }
}
