package typings.twilio

import typings.twilio.anon.Key
import typings.twilio.interfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outgoingCallerIdMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/outgoingCallerId", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/outgoingCallerId", "OutgoingCallerIdContext")
  @js.native
  open class OutgoingCallerIdContext protected () extends StObject {
    /**
      * Initialize the OutgoingCallerIdContext
      *
      * @param version - Version of the resource
      * @param accountSid - The SID of the Account that created the resource to fetch
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.v2010Mod.^, accountSid: String, sid: String) = this()
    
    /**
      * fetch a OutgoingCallerIdInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[OutgoingCallerIdInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ OutgoingCallerIdInstance, Any]): js.Promise[OutgoingCallerIdInstance] = js.native
    
    /**
      * remove a OutgoingCallerIdInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ OutgoingCallerIdInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a OutgoingCallerIdInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[OutgoingCallerIdInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ OutgoingCallerIdInstance, Any]): js.Promise[OutgoingCallerIdInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ OutgoingCallerIdInstance, Any]
    ): js.Promise[OutgoingCallerIdInstance] = js.native
    def update(opts: OutgoingCallerIdInstanceUpdateOptions): js.Promise[OutgoingCallerIdInstance] = js.native
    def update(
      opts: OutgoingCallerIdInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ OutgoingCallerIdInstance, Any]
    ): js.Promise[OutgoingCallerIdInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/api/v2010/account/outgoingCallerId", "OutgoingCallerIdInstance")
  @js.native
  open class OutgoingCallerIdInstance protected () extends SerializableClass {
    /**
      * Initialize the OutgoingCallerIdContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - The SID of the Account that created the resource
      * @param sid - The unique string that identifies the resource
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      payload: OutgoingCallerIdPayload,
      accountSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: OutgoingCallerIdContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a OutgoingCallerIdInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[OutgoingCallerIdInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[OutgoingCallerIdInstance] = js.native
    
    var friendlyName: String = js.native
    
    var phoneNumber: String = js.native
    
    /**
      * remove a OutgoingCallerIdInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    /**
      * update a OutgoingCallerIdInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[OutgoingCallerIdInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[OutgoingCallerIdInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[OutgoingCallerIdInstance] = js.native
    def update(opts: OutgoingCallerIdInstanceUpdateOptions): js.Promise[OutgoingCallerIdInstance] = js.native
    def update(
      opts: OutgoingCallerIdInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[OutgoingCallerIdInstance] = js.native
    
    var uri: String = js.native
  }
  
  /**
    * Initialize the OutgoingCallerIdList
    *
    * @param version - Version of the resource
    * @param accountSid - The SID of the Account that created the resource
    */
  inline def OutgoingCallerIdList(version: typings.twilio.v2010Mod.^, accountSid: String): OutgoingCallerIdListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("OutgoingCallerIdList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any])).asInstanceOf[OutgoingCallerIdListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/outgoingCallerId", "OutgoingCallerIdPage")
  @js.native
  open class OutgoingCallerIdPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.v2010Mod.^, 
          OutgoingCallerIdPayload, 
          OutgoingCallerIdResource, 
          OutgoingCallerIdInstance
        ] {
    /**
      * Initialize the OutgoingCallerIdPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: OutgoingCallerIdSolution
    ) = this()
    
    /**
      * Build an instance of OutgoingCallerIdInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: OutgoingCallerIdPayload): OutgoingCallerIdInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property friendlyName - A string to describe the resource
    */
  trait OutgoingCallerIdInstanceUpdateOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
  }
  object OutgoingCallerIdInstanceUpdateOptions {
    
    inline def apply(): OutgoingCallerIdInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OutgoingCallerIdInstanceUpdateOptions]
    }
    
    extension [Self <: OutgoingCallerIdInstanceUpdateOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    }
  }
  
  @js.native
  trait OutgoingCallerIdListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): OutgoingCallerIdContext = js.native
    
    /**
      * Streams OutgoingCallerIdInstance records from the API.
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
          /* item */ OutgoingCallerIdInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ OutgoingCallerIdInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: OutgoingCallerIdListInstanceEachOptions): Unit = js.native
    def each(
      opts: OutgoingCallerIdListInstanceEachOptions,
      callback: js.Function2[
          /* item */ OutgoingCallerIdInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a outgoing_caller_id
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): OutgoingCallerIdContext = js.native
    
    /**
      * Retrieve a single target page of OutgoingCallerIdInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[OutgoingCallerIdPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ OutgoingCallerIdPage, Any]): js.Promise[OutgoingCallerIdPage] = js.native
    def getPage(targetUrl: String): js.Promise[OutgoingCallerIdPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ OutgoingCallerIdPage, Any]
    ): js.Promise[OutgoingCallerIdPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ OutgoingCallerIdPage, Any]
    ): js.Promise[OutgoingCallerIdPage] = js.native
    
    /**
      * Lists OutgoingCallerIdInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[OutgoingCallerIdInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[OutgoingCallerIdInstance], Any]
    ): js.Promise[js.Array[OutgoingCallerIdInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[OutgoingCallerIdInstance], Any]
    ): js.Promise[js.Array[OutgoingCallerIdInstance]] = js.native
    def list(opts: OutgoingCallerIdListInstanceOptions): js.Promise[js.Array[OutgoingCallerIdInstance]] = js.native
    def list(
      opts: OutgoingCallerIdListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[OutgoingCallerIdInstance], Any]
    ): js.Promise[js.Array[OutgoingCallerIdInstance]] = js.native
    
    /**
      * Retrieve a single page of OutgoingCallerIdInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[OutgoingCallerIdPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ OutgoingCallerIdPage, Any]): js.Promise[OutgoingCallerIdPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ OutgoingCallerIdPage, Any]
    ): js.Promise[OutgoingCallerIdPage] = js.native
    def page(opts: OutgoingCallerIdListInstancePageOptions): js.Promise[OutgoingCallerIdPage] = js.native
    def page(
      opts: OutgoingCallerIdListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ OutgoingCallerIdPage, Any]
    ): js.Promise[OutgoingCallerIdPage] = js.native
    
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
    * @property friendlyName - The string that identifies the OutgoingCallerId resources to read
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
    * @property phoneNumber - The phone number of the OutgoingCallerId resources to read
    */
  trait OutgoingCallerIdListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ OutgoingCallerIdInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var phoneNumber: js.UndefOr[String] = js.undefined
  }
  object OutgoingCallerIdListInstanceEachOptions {
    
    inline def apply(): OutgoingCallerIdListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OutgoingCallerIdListInstanceEachOptions]
    }
    
    extension [Self <: OutgoingCallerIdListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ OutgoingCallerIdInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property friendlyName - The string that identifies the OutgoingCallerId resources to read
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
    * @property phoneNumber - The phone number of the OutgoingCallerId resources to read
    */
  trait OutgoingCallerIdListInstanceOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var phoneNumber: js.UndefOr[String] = js.undefined
  }
  object OutgoingCallerIdListInstanceOptions {
    
    inline def apply(): OutgoingCallerIdListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OutgoingCallerIdListInstanceOptions]
    }
    
    extension [Self <: OutgoingCallerIdListInstanceOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property friendlyName - The string that identifies the OutgoingCallerId resources to read
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property phoneNumber - The phone number of the OutgoingCallerId resources to read
    */
  trait OutgoingCallerIdListInstancePageOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var phoneNumber: js.UndefOr[String] = js.undefined
  }
  object OutgoingCallerIdListInstancePageOptions {
    
    inline def apply(): OutgoingCallerIdListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OutgoingCallerIdListInstancePageOptions]
    }
    
    extension [Self <: OutgoingCallerIdListInstancePageOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.twilio.pageMod.TwilioResponsePayload because var conflicts: uri. Inlined first_page_uri, next_page_uri, page, page_size, previous_page_uri, meta */ trait OutgoingCallerIdPayload
    extends StObject
       with OutgoingCallerIdResource {
    
    // DEPRECTATED: end: any;
    var first_page_uri: String
    
    var meta: js.UndefOr[Key] = js.undefined
    
    // DEPRECTATED: last_page_uri: string;
    var next_page_uri: String
    
    // DEPRECTATED: num_pages: number;
    var page: Double
    
    var page_size: Double
    
    var previous_page_uri: String
  }
  object OutgoingCallerIdPayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      friendly_name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      phone_number: String,
      previous_page_uri: String,
      sid: String,
      uri: String
    ): OutgoingCallerIdPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutgoingCallerIdPayload]
    }
    
    extension [Self <: OutgoingCallerIdPayload](x: Self) {
      
      inline def setFirst_page_uri(value: String): Self = StObject.set(x, "first_page_uri", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Key): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setNext_page_uri(value: String): Self = StObject.set(x, "next_page_uri", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      inline def setPrevious_page_uri(value: String): Self = StObject.set(x, "previous_page_uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait OutgoingCallerIdResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var phone_number: String
    
    var sid: String
    
    var uri: String
  }
  object OutgoingCallerIdResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      phone_number: String,
      sid: String,
      uri: String
    ): OutgoingCallerIdResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutgoingCallerIdResource]
    }
    
    extension [Self <: OutgoingCallerIdResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait OutgoingCallerIdSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
  }
  object OutgoingCallerIdSolution {
    
    inline def apply(): OutgoingCallerIdSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OutgoingCallerIdSolution]
    }
    
    extension [Self <: OutgoingCallerIdSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
    }
  }
}
