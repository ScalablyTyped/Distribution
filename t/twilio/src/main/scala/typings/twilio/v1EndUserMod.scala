package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1EndUserMod {
  
  @JSImport("twilio/lib/rest/trusthub/v1/endUser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/trusthub/v1/endUser", "EndUserContext")
  @js.native
  open class EndUserContext protected () extends StObject {
    /**
      * Initialize the EndUserContext
      *
      * @param version - Version of the resource
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.trusthubV1Mod.^, sid: String) = this()
    
    /**
      * fetch a EndUserInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[EndUserInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ EndUserInstance, Any]): js.Promise[EndUserInstance] = js.native
    
    /**
      * remove a EndUserInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ EndUserInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a EndUserInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[EndUserInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ EndUserInstance, Any]): js.Promise[EndUserInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ EndUserInstance, Any]): js.Promise[EndUserInstance] = js.native
    def update(opts: EndUserInstanceUpdateOptions): js.Promise[EndUserInstance] = js.native
    def update(
      opts: EndUserInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ EndUserInstance, Any]
    ): js.Promise[EndUserInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/trusthub/v1/endUser", "EndUserInstance")
  @js.native
  open class EndUserInstance protected () extends SerializableClass {
    /**
      * Initialize the EndUserContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.trusthubV1Mod.^, payload: EndUserPayload, sid: String) = this()
    
    /* private */ var _proxy: EndUserContext = js.native
    
    var accountSid: String = js.native
    
    var attributes: Any = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a EndUserInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[EndUserInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[EndUserInstance] = js.native
    
    var friendlyName: String = js.native
    
    /**
      * remove a EndUserInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var `type`: String = js.native
    
    /**
      * update a EndUserInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[EndUserInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[EndUserInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[EndUserInstance] = js.native
    def update(opts: EndUserInstanceUpdateOptions): js.Promise[EndUserInstance] = js.native
    def update(
      opts: EndUserInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[EndUserInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the EndUserList
    *
    * @param version - Version of the resource
    */
  inline def EndUserList(version: typings.twilio.trusthubV1Mod.^): EndUserListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("EndUserList")(version.asInstanceOf[js.Any]).asInstanceOf[EndUserListInstance]
  
  @JSImport("twilio/lib/rest/trusthub/v1/endUser", "EndUserPage")
  @js.native
  open class EndUserPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.trusthubV1Mod.^, EndUserPayload, EndUserResource, EndUserInstance] {
    /**
      * Initialize the EndUserPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.trusthubV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: EndUserSolution
    ) = this()
    
    /**
      * Build an instance of EndUserInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: EndUserPayload): EndUserInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property attributes - The set of parameters that compose the End User resource
    * @property friendlyName - The string that you assigned to describe the resource
    */
  trait EndUserInstanceUpdateOptions extends StObject {
    
    var attributes: js.UndefOr[js.Object] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
  }
  object EndUserInstanceUpdateOptions {
    
    inline def apply(): EndUserInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndUserInstanceUpdateOptions]
    }
    
    extension [Self <: EndUserInstanceUpdateOptions](x: Self) {
      
      inline def setAttributes(value: js.Object): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    }
  }
  
  @js.native
  trait EndUserListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): EndUserContext = js.native
    
    /**
      * create a EndUserInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: EndUserListInstanceCreateOptions): js.Promise[EndUserInstance] = js.native
    def create(
      opts: EndUserListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ EndUserInstance, Any]
    ): js.Promise[EndUserInstance] = js.native
    
    /**
      * Streams EndUserInstance records from the API.
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
          /* item */ EndUserInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ EndUserInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: EndUserListInstanceEachOptions): Unit = js.native
    def each(
      opts: EndUserListInstanceEachOptions,
      callback: js.Function2[
          /* item */ EndUserInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a end_user
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): EndUserContext = js.native
    
    /**
      * Retrieve a single target page of EndUserInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[EndUserPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ EndUserPage, Any]): js.Promise[EndUserPage] = js.native
    def getPage(targetUrl: String): js.Promise[EndUserPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ EndUserPage, Any]
    ): js.Promise[EndUserPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ EndUserPage, Any]): js.Promise[EndUserPage] = js.native
    
    /**
      * Lists EndUserInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[EndUserInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[EndUserInstance], Any]): js.Promise[js.Array[EndUserInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[EndUserInstance], Any]
    ): js.Promise[js.Array[EndUserInstance]] = js.native
    def list(opts: EndUserListInstanceOptions): js.Promise[js.Array[EndUserInstance]] = js.native
    def list(
      opts: EndUserListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[EndUserInstance], Any]
    ): js.Promise[js.Array[EndUserInstance]] = js.native
    
    /**
      * Retrieve a single page of EndUserInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[EndUserPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ EndUserPage, Any]): js.Promise[EndUserPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ EndUserPage, Any]): js.Promise[EndUserPage] = js.native
    def page(opts: EndUserListInstancePageOptions): js.Promise[EndUserPage] = js.native
    def page(
      opts: EndUserListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ EndUserPage, Any]
    ): js.Promise[EndUserPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property attributes - The set of parameters that compose the End User resource
    * @property friendlyName - The string that you assigned to describe the resource
    * @property type - The type of end user of the Bundle resource
    */
  trait EndUserListInstanceCreateOptions extends StObject {
    
    var attributes: js.UndefOr[js.Object] = js.undefined
    
    var friendlyName: String
    
    var `type`: String
  }
  object EndUserListInstanceCreateOptions {
    
    inline def apply(friendlyName: String, `type`: String): EndUserListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndUserListInstanceCreateOptions]
    }
    
    extension [Self <: EndUserListInstanceCreateOptions](x: Self) {
      
      inline def setAttributes(value: js.Object): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
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
  trait EndUserListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ EndUserInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object EndUserListInstanceEachOptions {
    
    inline def apply(): EndUserListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndUserListInstanceEachOptions]
    }
    
    extension [Self <: EndUserListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ EndUserInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait EndUserListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object EndUserListInstanceOptions {
    
    inline def apply(): EndUserListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndUserListInstanceOptions]
    }
    
    extension [Self <: EndUserListInstanceOptions](x: Self) {
      
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
  trait EndUserListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object EndUserListInstancePageOptions {
    
    inline def apply(): EndUserListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndUserListInstancePageOptions]
    }
    
    extension [Self <: EndUserListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait EndUserPayload
    extends StObject
       with EndUserResource
       with TwilioResponsePayload
  object EndUserPayload {
    
    inline def apply(
      account_sid: String,
      attributes: js.Object,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      friendly_name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      `type`: String,
      uri: String,
      url: String
    ): EndUserPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndUserPayload]
    }
  }
  
  trait EndUserResource extends StObject {
    
    var account_sid: String
    
    var attributes: js.Object
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var sid: String
    
    var `type`: String
    
    var url: String
  }
  object EndUserResource {
    
    inline def apply(
      account_sid: String,
      attributes: js.Object,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      sid: String,
      `type`: String,
      url: String
    ): EndUserResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndUserResource]
    }
    
    extension [Self <: EndUserResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAttributes(value: js.Object): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait EndUserSolution extends StObject
}
