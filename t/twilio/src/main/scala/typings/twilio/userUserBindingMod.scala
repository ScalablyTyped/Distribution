package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userUserBindingMod {
  
  @JSImport("twilio/lib/rest/ipMessaging/v2/service/user/userBinding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/ipMessaging/v2/service/user/userBinding", "UserBindingContext")
  @js.native
  open class UserBindingContext protected () extends StObject {
    /**
      * Initialize the UserBindingContext
      *
      * @param version - Version of the resource
      * @param serviceSid - The service_sid
      * @param userSid - The user_sid
      * @param sid - The sid
      */
    def this(version: typings.twilio.ipMessagingV2Mod.^, serviceSid: String, userSid: String, sid: String) = this()
    
    /**
      * fetch a UserBindingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[UserBindingInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ UserBindingInstance, Any]): js.Promise[UserBindingInstance] = js.native
    
    /**
      * remove a UserBindingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ UserBindingInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/ipMessaging/v2/service/user/userBinding", "UserBindingInstance")
  @js.native
  open class UserBindingInstance protected () extends SerializableClass {
    /**
      * Initialize the UserBindingContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - The service_sid
      * @param userSid - The user_sid
      * @param sid - The sid
      */
    def this(
      version: typings.twilio.ipMessagingV2Mod.^,
      payload: UserBindingPayload,
      serviceSid: String,
      userSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: UserBindingContext = js.native
    
    var accountSid: String = js.native
    
    var bindingType: UserBindingBindingType = js.native
    
    var credentialSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var endpoint: String = js.native
    
    /**
      * fetch a UserBindingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[UserBindingInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[UserBindingInstance] = js.native
    
    var identity: String = js.native
    
    var messageTypes: js.Array[String] = js.native
    
    /**
      * remove a UserBindingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    var url: String = js.native
    
    var userSid: String = js.native
  }
  
  /**
    * Initialize the UserBindingList
    *
    * @param version - Version of the resource
    * @param serviceSid - The service_sid
    * @param userSid - The user_sid
    */
  inline def UserBindingList(version: typings.twilio.ipMessagingV2Mod.^, serviceSid: String, userSid: String): UserBindingListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("UserBindingList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any], userSid.asInstanceOf[js.Any])).asInstanceOf[UserBindingListInstance]
  
  @JSImport("twilio/lib/rest/ipMessaging/v2/service/user/userBinding", "UserBindingPage")
  @js.native
  open class UserBindingPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.ipMessagingV2Mod.^, 
          UserBindingPayload, 
          UserBindingResource, 
          UserBindingInstance
        ] {
    /**
      * Initialize the UserBindingPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.ipMessagingV2Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: UserBindingSolution
    ) = this()
    
    /**
      * Build an instance of UserBindingInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: UserBindingPayload): UserBindingInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.gcm
    - typings.twilio.twilioStrings.apn
    - typings.twilio.twilioStrings.fcm
  */
  trait UserBindingBindingType extends StObject
  object UserBindingBindingType {
    
    inline def apn: typings.twilio.twilioStrings.apn = "apn".asInstanceOf[typings.twilio.twilioStrings.apn]
    
    inline def fcm: typings.twilio.twilioStrings.fcm = "fcm".asInstanceOf[typings.twilio.twilioStrings.fcm]
    
    inline def gcm: typings.twilio.twilioStrings.gcm = "gcm".asInstanceOf[typings.twilio.twilioStrings.gcm]
  }
  
  @js.native
  trait UserBindingListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): UserBindingContext = js.native
    
    /**
      * Streams UserBindingInstance records from the API.
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
          /* item */ UserBindingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ UserBindingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: UserBindingListInstanceEachOptions): Unit = js.native
    def each(
      opts: UserBindingListInstanceEachOptions,
      callback: js.Function2[
          /* item */ UserBindingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a user_binding
      *
      * @param sid - The sid
      */
    def get(sid: String): UserBindingContext = js.native
    
    /**
      * Retrieve a single target page of UserBindingInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[UserBindingPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ UserBindingPage, Any]): js.Promise[UserBindingPage] = js.native
    def getPage(targetUrl: String): js.Promise[UserBindingPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ UserBindingPage, Any]
    ): js.Promise[UserBindingPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ UserBindingPage, Any]
    ): js.Promise[UserBindingPage] = js.native
    
    /**
      * Lists UserBindingInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[UserBindingInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[UserBindingInstance], Any]
    ): js.Promise[js.Array[UserBindingInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[UserBindingInstance], Any]
    ): js.Promise[js.Array[UserBindingInstance]] = js.native
    def list(opts: UserBindingListInstanceOptions): js.Promise[js.Array[UserBindingInstance]] = js.native
    def list(
      opts: UserBindingListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[UserBindingInstance], Any]
    ): js.Promise[js.Array[UserBindingInstance]] = js.native
    
    /**
      * Retrieve a single page of UserBindingInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[UserBindingPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ UserBindingPage, Any]): js.Promise[UserBindingPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ UserBindingPage, Any]): js.Promise[UserBindingPage] = js.native
    def page(opts: UserBindingListInstancePageOptions): js.Promise[UserBindingPage] = js.native
    def page(
      opts: UserBindingListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ UserBindingPage, Any]
    ): js.Promise[UserBindingPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to each
    *
    * @property bindingType - The binding_type
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
  trait UserBindingListInstanceEachOptions extends StObject {
    
    var bindingType: js.UndefOr[UserBindingBindingType | js.Array[UserBindingBindingType]] = js.undefined
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ UserBindingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object UserBindingListInstanceEachOptions {
    
    inline def apply(): UserBindingListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserBindingListInstanceEachOptions]
    }
    
    extension [Self <: UserBindingListInstanceEachOptions](x: Self) {
      
      inline def setBindingType(value: UserBindingBindingType | js.Array[UserBindingBindingType]): Self = StObject.set(x, "bindingType", value.asInstanceOf[js.Any])
      
      inline def setBindingTypeUndefined: Self = StObject.set(x, "bindingType", js.undefined)
      
      inline def setBindingTypeVarargs(value: UserBindingBindingType*): Self = StObject.set(x, "bindingType", js.Array(value*))
      
      inline def setCallback(
        value: (/* item */ UserBindingInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
    * @property bindingType - The binding_type
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
  trait UserBindingListInstanceOptions extends StObject {
    
    var bindingType: js.UndefOr[UserBindingBindingType | js.Array[UserBindingBindingType]] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object UserBindingListInstanceOptions {
    
    inline def apply(): UserBindingListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserBindingListInstanceOptions]
    }
    
    extension [Self <: UserBindingListInstanceOptions](x: Self) {
      
      inline def setBindingType(value: UserBindingBindingType | js.Array[UserBindingBindingType]): Self = StObject.set(x, "bindingType", value.asInstanceOf[js.Any])
      
      inline def setBindingTypeUndefined: Self = StObject.set(x, "bindingType", js.undefined)
      
      inline def setBindingTypeVarargs(value: UserBindingBindingType*): Self = StObject.set(x, "bindingType", js.Array(value*))
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property bindingType - The binding_type
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait UserBindingListInstancePageOptions extends StObject {
    
    var bindingType: js.UndefOr[UserBindingBindingType | js.Array[UserBindingBindingType]] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object UserBindingListInstancePageOptions {
    
    inline def apply(): UserBindingListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserBindingListInstancePageOptions]
    }
    
    extension [Self <: UserBindingListInstancePageOptions](x: Self) {
      
      inline def setBindingType(value: UserBindingBindingType | js.Array[UserBindingBindingType]): Self = StObject.set(x, "bindingType", value.asInstanceOf[js.Any])
      
      inline def setBindingTypeUndefined: Self = StObject.set(x, "bindingType", js.undefined)
      
      inline def setBindingTypeVarargs(value: UserBindingBindingType*): Self = StObject.set(x, "bindingType", js.Array(value*))
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait UserBindingPayload
    extends StObject
       with UserBindingResource
       with TwilioResponsePayload
  object UserBindingPayload {
    
    inline def apply(
      account_sid: String,
      binding_type: UserBindingBindingType,
      credential_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      endpoint: String,
      first_page_uri: String,
      identity: String,
      message_types: js.Array[String],
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      service_sid: String,
      sid: String,
      uri: String,
      url: String,
      user_sid: String
    ): UserBindingPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], binding_type = binding_type.asInstanceOf[js.Any], credential_sid = credential_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], message_types = message_types.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user_sid = user_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserBindingPayload]
    }
  }
  
  trait UserBindingResource extends StObject {
    
    var account_sid: String
    
    var binding_type: UserBindingBindingType
    
    var credential_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var endpoint: String
    
    var identity: String
    
    var message_types: js.Array[String]
    
    var service_sid: String
    
    var sid: String
    
    var url: String
    
    var user_sid: String
  }
  object UserBindingResource {
    
    inline def apply(
      account_sid: String,
      binding_type: UserBindingBindingType,
      credential_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      endpoint: String,
      identity: String,
      message_types: js.Array[String],
      service_sid: String,
      sid: String,
      url: String,
      user_sid: String
    ): UserBindingResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], binding_type = binding_type.asInstanceOf[js.Any], credential_sid = credential_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], message_types = message_types.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user_sid = user_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserBindingResource]
    }
    
    extension [Self <: UserBindingResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setBinding_type(value: UserBindingBindingType): Self = StObject.set(x, "binding_type", value.asInstanceOf[js.Any])
      
      inline def setCredential_sid(value: String): Self = StObject.set(x, "credential_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setMessage_types(value: js.Array[String]): Self = StObject.set(x, "message_types", value.asInstanceOf[js.Any])
      
      inline def setMessage_typesVarargs(value: String*): Self = StObject.set(x, "message_types", js.Array(value*))
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUser_sid(value: String): Self = StObject.set(x, "user_sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserBindingSolution extends StObject {
    
    var serviceSid: js.UndefOr[String] = js.undefined
    
    var userSid: js.UndefOr[String] = js.undefined
  }
  object UserBindingSolution {
    
    inline def apply(): UserBindingSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserBindingSolution]
    }
    
    extension [Self <: UserBindingSolution](x: Self) {
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
      
      inline def setUserSid(value: String): Self = StObject.set(x, "userSid", value.asInstanceOf[js.Any])
      
      inline def setUserSidUndefined: Self = StObject.set(x, "userSid", js.undefined)
    }
  }
}
