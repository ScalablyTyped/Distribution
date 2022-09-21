package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1RoleMod {
  
  @JSImport("twilio/lib/rest/conversations/v1/role", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/conversations/v1/role", "RoleContext")
  @js.native
  open class RoleContext protected () extends StObject {
    /**
      * Initialize the RoleContext
      *
      * @param version - Version of the resource
      * @param sid - The SID of the Role resource to fetch
      */
    def this(version: typings.twilio.conversationsV1Mod.^, sid: String) = this()
    
    /**
      * fetch a RoleInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[RoleInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ RoleInstance, Any]): js.Promise[RoleInstance] = js.native
    
    /**
      * remove a RoleInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ RoleInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a RoleInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: RoleInstanceUpdateOptions): js.Promise[RoleInstance] = js.native
    def update(
      opts: RoleInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ RoleInstance, Any]
    ): js.Promise[RoleInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/conversations/v1/role", "RoleInstance")
  @js.native
  open class RoleInstance protected () extends SerializableClass {
    /**
      * Initialize the RoleContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The SID of the Role resource to fetch
      */
    def this(version: typings.twilio.conversationsV1Mod.^, payload: RolePayload, sid: String) = this()
    
    /* private */ var _proxy: RoleContext = js.native
    
    var accountSid: String = js.native
    
    var chatServiceSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a RoleInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[RoleInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[RoleInstance] = js.native
    
    var friendlyName: String = js.native
    
    var permissions: js.Array[String] = js.native
    
    /**
      * remove a RoleInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var `type`: RoleRoleType = js.native
    
    /**
      * update a RoleInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: RoleInstanceUpdateOptions): js.Promise[RoleInstance] = js.native
    def update(
      opts: RoleInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[RoleInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the RoleList
    *
    * @param version - Version of the resource
    */
  inline def RoleList(version: typings.twilio.conversationsV1Mod.^): RoleListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("RoleList")(version.asInstanceOf[js.Any]).asInstanceOf[RoleListInstance]
  
  @JSImport("twilio/lib/rest/conversations/v1/role", "RolePage")
  @js.native
  open class RolePage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.conversationsV1Mod.^, RolePayload, RoleResource, RoleInstance] {
    /**
      * Initialize the RolePage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.conversationsV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: RoleSolution
    ) = this()
    
    /**
      * Build an instance of RoleInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: RolePayload): RoleInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property permission - A permission the role should have
    */
  trait RoleInstanceUpdateOptions extends StObject {
    
    var permission: String | js.Array[String]
  }
  object RoleInstanceUpdateOptions {
    
    inline def apply(permission: String | js.Array[String]): RoleInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal(permission = permission.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoleInstanceUpdateOptions]
    }
    
    extension [Self <: RoleInstanceUpdateOptions](x: Self) {
      
      inline def setPermission(value: String | js.Array[String]): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
      
      inline def setPermissionVarargs(value: String*): Self = StObject.set(x, "permission", js.Array(value*))
    }
  }
  
  @js.native
  trait RoleListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): RoleContext = js.native
    
    /**
      * create a RoleInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: RoleListInstanceCreateOptions): js.Promise[RoleInstance] = js.native
    def create(
      opts: RoleListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ RoleInstance, Any]
    ): js.Promise[RoleInstance] = js.native
    
    /**
      * Streams RoleInstance records from the API.
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
          /* item */ RoleInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ RoleInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: RoleListInstanceEachOptions): Unit = js.native
    def each(
      opts: RoleListInstanceEachOptions,
      callback: js.Function2[
          /* item */ RoleInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a role
      *
      * @param sid - The SID of the Role resource to fetch
      */
    def get(sid: String): RoleContext = js.native
    
    /**
      * Retrieve a single target page of RoleInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[RolePage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ RolePage, Any]): js.Promise[RolePage] = js.native
    def getPage(targetUrl: String): js.Promise[RolePage] = js.native
    def getPage(targetUrl: String, callback: js.Function2[/* error */ js.Error | Null, /* items */ RolePage, Any]): js.Promise[RolePage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ RolePage, Any]): js.Promise[RolePage] = js.native
    
    /**
      * Lists RoleInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[RoleInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[RoleInstance], Any]): js.Promise[js.Array[RoleInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[RoleInstance], Any]
    ): js.Promise[js.Array[RoleInstance]] = js.native
    def list(opts: RoleListInstanceOptions): js.Promise[js.Array[RoleInstance]] = js.native
    def list(
      opts: RoleListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[RoleInstance], Any]
    ): js.Promise[js.Array[RoleInstance]] = js.native
    
    /**
      * Retrieve a single page of RoleInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[RolePage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ RolePage, Any]): js.Promise[RolePage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ RolePage, Any]): js.Promise[RolePage] = js.native
    def page(opts: RoleListInstancePageOptions): js.Promise[RolePage] = js.native
    def page(
      opts: RoleListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ RolePage, Any]
    ): js.Promise[RolePage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property friendlyName - A string to describe the new resource
    * @property permission - A permission the role should have
    * @property type - The type of role
    */
  trait RoleListInstanceCreateOptions extends StObject {
    
    var friendlyName: String
    
    var permission: String | js.Array[String]
    
    var `type`: RoleRoleType
  }
  object RoleListInstanceCreateOptions {
    
    inline def apply(friendlyName: String, permission: String | js.Array[String], `type`: RoleRoleType): RoleListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoleListInstanceCreateOptions]
    }
    
    extension [Self <: RoleListInstanceCreateOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setPermission(value: String | js.Array[String]): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
      
      inline def setPermissionVarargs(value: String*): Self = StObject.set(x, "permission", js.Array(value*))
      
      inline def setType(value: RoleRoleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
  trait RoleListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ RoleInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object RoleListInstanceEachOptions {
    
    inline def apply(): RoleListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoleListInstanceEachOptions]
    }
    
    extension [Self <: RoleListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ RoleInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait RoleListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object RoleListInstanceOptions {
    
    inline def apply(): RoleListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoleListInstanceOptions]
    }
    
    extension [Self <: RoleListInstanceOptions](x: Self) {
      
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
  trait RoleListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object RoleListInstancePageOptions {
    
    inline def apply(): RoleListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoleListInstancePageOptions]
    }
    
    extension [Self <: RoleListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait RolePayload
    extends StObject
       with RoleResource
       with TwilioResponsePayload
  object RolePayload {
    
    inline def apply(
      account_sid: String,
      chat_service_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      friendly_name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      permissions: js.Array[String],
      previous_page_uri: String,
      sid: String,
      `type`: RoleRoleType,
      uri: String,
      url: String
    ): RolePayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], chat_service_sid = chat_service_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RolePayload]
    }
  }
  
  trait RoleResource extends StObject {
    
    var account_sid: String
    
    var chat_service_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var permissions: js.Array[String]
    
    var sid: String
    
    var `type`: RoleRoleType
    
    var url: String
  }
  object RoleResource {
    
    inline def apply(
      account_sid: String,
      chat_service_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      permissions: js.Array[String],
      sid: String,
      `type`: RoleRoleType,
      url: String
    ): RoleResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], chat_service_sid = chat_service_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoleResource]
    }
    
    extension [Self <: RoleResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setChat_service_sid(value: String): Self = StObject.set(x, "chat_service_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      inline def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value*))
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setType(value: RoleRoleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.conversation
    - typings.twilio.twilioStrings.service
  */
  trait RoleRoleType extends StObject
  object RoleRoleType {
    
    inline def conversation: typings.twilio.twilioStrings.conversation = "conversation".asInstanceOf[typings.twilio.twilioStrings.conversation]
    
    inline def service: typings.twilio.twilioStrings.service = "service".asInstanceOf[typings.twilio.twilioStrings.service]
  }
  
  trait RoleSolution extends StObject
}
