package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceChannelInviteMod {
  
  @JSImport("twilio/lib/rest/ipMessaging/v1/service/channel/invite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/ipMessaging/v1/service/channel/invite", "InviteContext")
  @js.native
  open class InviteContext protected () extends StObject {
    /**
      * Initialize the InviteContext
      *
      * @param version - Version of the resource
      * @param serviceSid - The service_sid
      * @param channelSid - The channel_sid
      * @param sid - The sid
      */
    def this(version: typings.twilio.ipMessagingV1Mod.^, serviceSid: String, channelSid: String, sid: String) = this()
    
    /**
      * fetch a InviteInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[InviteInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ InviteInstance, Any]): js.Promise[InviteInstance] = js.native
    
    /**
      * remove a InviteInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ InviteInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/ipMessaging/v1/service/channel/invite", "InviteInstance")
  @js.native
  open class InviteInstance protected () extends SerializableClass {
    /**
      * Initialize the InviteContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - The service_sid
      * @param channelSid - The channel_sid
      * @param sid - The sid
      */
    def this(
      version: typings.twilio.ipMessagingV1Mod.^,
      payload: InvitePayload,
      serviceSid: String,
      channelSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: InviteContext = js.native
    
    var accountSid: String = js.native
    
    var channelSid: String = js.native
    
    var createdBy: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a InviteInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[InviteInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[InviteInstance] = js.native
    
    var identity: String = js.native
    
    /**
      * remove a InviteInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var roleSid: String = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the InviteList
    *
    * @param version - Version of the resource
    * @param serviceSid - The service_sid
    * @param channelSid - The channel_sid
    */
  inline def InviteList(version: typings.twilio.ipMessagingV1Mod.^, serviceSid: String, channelSid: String): InviteListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("InviteList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any], channelSid.asInstanceOf[js.Any])).asInstanceOf[InviteListInstance]
  
  @JSImport("twilio/lib/rest/ipMessaging/v1/service/channel/invite", "InvitePage")
  @js.native
  open class InvitePage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.ipMessagingV1Mod.^, InvitePayload, InviteResource, InviteInstance] {
    /**
      * Initialize the InvitePage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.ipMessagingV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: InviteSolution
    ) = this()
    
    /**
      * Build an instance of InviteInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: InvitePayload): InviteInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait InviteListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): InviteContext = js.native
    
    /**
      * create a InviteInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: InviteListInstanceCreateOptions): js.Promise[InviteInstance] = js.native
    def create(
      opts: InviteListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ InviteInstance, Any]
    ): js.Promise[InviteInstance] = js.native
    
    /**
      * Streams InviteInstance records from the API.
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
          /* item */ InviteInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ InviteInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: InviteListInstanceEachOptions): Unit = js.native
    def each(
      opts: InviteListInstanceEachOptions,
      callback: js.Function2[
          /* item */ InviteInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a invite
      *
      * @param sid - The sid
      */
    def get(sid: String): InviteContext = js.native
    
    /**
      * Retrieve a single target page of InviteInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[InvitePage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ InvitePage, Any]): js.Promise[InvitePage] = js.native
    def getPage(targetUrl: String): js.Promise[InvitePage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ InvitePage, Any]
    ): js.Promise[InvitePage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ InvitePage, Any]): js.Promise[InvitePage] = js.native
    
    /**
      * Lists InviteInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[InviteInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[InviteInstance], Any]): js.Promise[js.Array[InviteInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[InviteInstance], Any]
    ): js.Promise[js.Array[InviteInstance]] = js.native
    def list(opts: InviteListInstanceOptions): js.Promise[js.Array[InviteInstance]] = js.native
    def list(
      opts: InviteListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[InviteInstance], Any]
    ): js.Promise[js.Array[InviteInstance]] = js.native
    
    /**
      * Retrieve a single page of InviteInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[InvitePage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ InvitePage, Any]): js.Promise[InvitePage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ InvitePage, Any]): js.Promise[InvitePage] = js.native
    def page(opts: InviteListInstancePageOptions): js.Promise[InvitePage] = js.native
    def page(
      opts: InviteListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ InvitePage, Any]
    ): js.Promise[InvitePage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property identity - The identity
    * @property roleSid - The role_sid
    */
  trait InviteListInstanceCreateOptions extends StObject {
    
    var identity: String
    
    var roleSid: js.UndefOr[String] = js.undefined
  }
  object InviteListInstanceCreateOptions {
    
    inline def apply(identity: String): InviteListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any])
      __obj.asInstanceOf[InviteListInstanceCreateOptions]
    }
    
    extension [Self <: InviteListInstanceCreateOptions](x: Self) {
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setRoleSid(value: String): Self = StObject.set(x, "roleSid", value.asInstanceOf[js.Any])
      
      inline def setRoleSidUndefined: Self = StObject.set(x, "roleSid", js.undefined)
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
    * @property identity - The identity
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
  trait InviteListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ InviteInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var identity: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object InviteListInstanceEachOptions {
    
    inline def apply(): InviteListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InviteListInstanceEachOptions]
    }
    
    extension [Self <: InviteListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ InviteInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setIdentity(value: String | js.Array[String]): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setIdentityVarargs(value: String*): Self = StObject.set(x, "identity", js.Array(value*))
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property identity - The identity
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
  trait InviteListInstanceOptions extends StObject {
    
    var identity: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object InviteListInstanceOptions {
    
    inline def apply(): InviteListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InviteListInstanceOptions]
    }
    
    extension [Self <: InviteListInstanceOptions](x: Self) {
      
      inline def setIdentity(value: String | js.Array[String]): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setIdentityVarargs(value: String*): Self = StObject.set(x, "identity", js.Array(value*))
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property identity - The identity
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait InviteListInstancePageOptions extends StObject {
    
    var identity: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object InviteListInstancePageOptions {
    
    inline def apply(): InviteListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InviteListInstancePageOptions]
    }
    
    extension [Self <: InviteListInstancePageOptions](x: Self) {
      
      inline def setIdentity(value: String | js.Array[String]): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setIdentityVarargs(value: String*): Self = StObject.set(x, "identity", js.Array(value*))
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait InvitePayload
    extends StObject
       with InviteResource
       with TwilioResponsePayload
  object InvitePayload {
    
    inline def apply(
      account_sid: String,
      channel_sid: String,
      created_by: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      identity: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      role_sid: String,
      service_sid: String,
      sid: String,
      uri: String,
      url: String
    ): InvitePayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], channel_sid = channel_sid.asInstanceOf[js.Any], created_by = created_by.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], role_sid = role_sid.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvitePayload]
    }
  }
  
  trait InviteResource extends StObject {
    
    var account_sid: String
    
    var channel_sid: String
    
    var created_by: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var identity: String
    
    var role_sid: String
    
    var service_sid: String
    
    var sid: String
    
    var url: String
  }
  object InviteResource {
    
    inline def apply(
      account_sid: String,
      channel_sid: String,
      created_by: String,
      date_created: js.Date,
      date_updated: js.Date,
      identity: String,
      role_sid: String,
      service_sid: String,
      sid: String,
      url: String
    ): InviteResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], channel_sid = channel_sid.asInstanceOf[js.Any], created_by = created_by.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], role_sid = role_sid.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[InviteResource]
    }
    
    extension [Self <: InviteResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setChannel_sid(value: String): Self = StObject.set(x, "channel_sid", value.asInstanceOf[js.Any])
      
      inline def setCreated_by(value: String): Self = StObject.set(x, "created_by", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setRole_sid(value: String): Self = StObject.set(x, "role_sid", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait InviteSolution extends StObject {
    
    var channelSid: js.UndefOr[String] = js.undefined
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object InviteSolution {
    
    inline def apply(): InviteSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InviteSolution]
    }
    
    extension [Self <: InviteSolution](x: Self) {
      
      inline def setChannelSid(value: String): Self = StObject.set(x, "channelSid", value.asInstanceOf[js.Any])
      
      inline def setChannelSidUndefined: Self = StObject.set(x, "channelSid", js.undefined)
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
}
