package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceChannelMemberMod {
  
  @JSImport("twilio/lib/rest/chat/v2/service/channel/member", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/chat/v2/service/channel/member", "MemberContext")
  @js.native
  open class MemberContext protected () extends StObject {
    /**
      * Initialize the MemberContext
      *
      * @param version - Version of the resource
      * @param serviceSid - The SID of the Service to fetch the resource from
      * @param channelSid - The SID of the channel the member belongs to
      * @param sid - The SID of the Member resource to fetch
      */
    def this(version: typings.twilio.v2Mod.^, serviceSid: String, channelSid: String, sid: String) = this()
    
    /**
      * fetch a MemberInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[MemberInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ MemberInstance, Any]): js.Promise[MemberInstance] = js.native
    
    /**
      * remove a MemberInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ MemberInstance, Any]): js.Promise[Boolean] = js.native
    def remove(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ MemberInstance, Any]): js.Promise[Boolean] = js.native
    def remove(opts: MemberInstanceRemoveOptions): js.Promise[Boolean] = js.native
    def remove(
      opts: MemberInstanceRemoveOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ MemberInstance, Any]
    ): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a MemberInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[MemberInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ MemberInstance, Any]): js.Promise[MemberInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ MemberInstance, Any]): js.Promise[MemberInstance] = js.native
    def update(opts: MemberInstanceUpdateOptions): js.Promise[MemberInstance] = js.native
    def update(
      opts: MemberInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ MemberInstance, Any]
    ): js.Promise[MemberInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/chat/v2/service/channel/member", "MemberInstance")
  @js.native
  open class MemberInstance protected () extends SerializableClass {
    /**
      * Initialize the MemberContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - The SID of the Service that the resource is associated with
      * @param channelSid - The SID of the Channel for the member
      * @param sid - The SID of the Member resource to fetch
      */
    def this(
      version: typings.twilio.v2Mod.^,
      payload: MemberPayload,
      serviceSid: String,
      channelSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: MemberContext = js.native
    
    var accountSid: String = js.native
    
    var attributes: String = js.native
    
    var channelSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a MemberInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[MemberInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[MemberInstance] = js.native
    
    var identity: String = js.native
    
    var lastConsumedMessageIndex: Double = js.native
    
    var lastConsumptionTimestamp: js.Date = js.native
    
    /**
      * remove a MemberInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    def remove(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    def remove(opts: MemberInstanceRemoveOptions): js.Promise[Boolean] = js.native
    def remove(
      opts: MemberInstanceRemoveOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[Boolean] = js.native
    
    var roleSid: String = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    /**
      * update a MemberInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[MemberInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[MemberInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[MemberInstance] = js.native
    def update(opts: MemberInstanceUpdateOptions): js.Promise[MemberInstance] = js.native
    def update(
      opts: MemberInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[MemberInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the MemberList
    *
    * @param version - Version of the resource
    * @param serviceSid - The SID of the Service that the resource is associated with
    * @param channelSid - The SID of the Channel for the member
    */
  inline def MemberList(version: typings.twilio.v2Mod.^, serviceSid: String, channelSid: String): MemberListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("MemberList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any], channelSid.asInstanceOf[js.Any])).asInstanceOf[MemberListInstance]
  
  @JSImport("twilio/lib/rest/chat/v2/service/channel/member", "MemberPage")
  @js.native
  open class MemberPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.v2Mod.^, MemberPayload, MemberResource, MemberInstance] {
    /**
      * Initialize the MemberPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: MemberSolution
    ) = this()
    
    /**
      * Build an instance of MemberInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: MemberPayload): MemberInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to remove
    *
    * @property xTwilioWebhookEnabled - The X-Twilio-Webhook-Enabled HTTP request header
    */
  trait MemberInstanceRemoveOptions extends StObject {
    
    var xTwilioWebhookEnabled: js.UndefOr[MemberWebhookEnabledType] = js.undefined
  }
  object MemberInstanceRemoveOptions {
    
    inline def apply(): MemberInstanceRemoveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MemberInstanceRemoveOptions]
    }
    
    extension [Self <: MemberInstanceRemoveOptions](x: Self) {
      
      inline def setXTwilioWebhookEnabled(value: MemberWebhookEnabledType): Self = StObject.set(x, "xTwilioWebhookEnabled", value.asInstanceOf[js.Any])
      
      inline def setXTwilioWebhookEnabledUndefined: Self = StObject.set(x, "xTwilioWebhookEnabled", js.undefined)
    }
  }
  
  /**
    * Options to pass to update
    *
    * @property attributes - A valid JSON string that contains application-specific data
    * @property dateCreated - The ISO 8601 date and time in GMT when the resource was created
    * @property dateUpdated - The ISO 8601 date and time in GMT when the resource was updated
    * @property lastConsumedMessageIndex - The index of the last consumed Message for the Channel for the Member
    * @property lastConsumptionTimestamp - The ISO 8601 based timestamp string representing the datetime of the last Message read event for the Member within the Channel
    * @property roleSid - The SID of the Role to assign to the member
    * @property xTwilioWebhookEnabled - The X-Twilio-Webhook-Enabled HTTP request header
    */
  trait MemberInstanceUpdateOptions extends StObject {
    
    var attributes: js.UndefOr[String] = js.undefined
    
    var dateCreated: js.UndefOr[js.Date] = js.undefined
    
    var dateUpdated: js.UndefOr[js.Date] = js.undefined
    
    var lastConsumedMessageIndex: js.UndefOr[Double] = js.undefined
    
    var lastConsumptionTimestamp: js.UndefOr[js.Date] = js.undefined
    
    var roleSid: js.UndefOr[String] = js.undefined
    
    var xTwilioWebhookEnabled: js.UndefOr[MemberWebhookEnabledType] = js.undefined
  }
  object MemberInstanceUpdateOptions {
    
    inline def apply(): MemberInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MemberInstanceUpdateOptions]
    }
    
    extension [Self <: MemberInstanceUpdateOptions](x: Self) {
      
      inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setDateCreated(value: js.Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
      
      inline def setDateUpdated(value: js.Date): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
      
      inline def setDateUpdatedUndefined: Self = StObject.set(x, "dateUpdated", js.undefined)
      
      inline def setLastConsumedMessageIndex(value: Double): Self = StObject.set(x, "lastConsumedMessageIndex", value.asInstanceOf[js.Any])
      
      inline def setLastConsumedMessageIndexUndefined: Self = StObject.set(x, "lastConsumedMessageIndex", js.undefined)
      
      inline def setLastConsumptionTimestamp(value: js.Date): Self = StObject.set(x, "lastConsumptionTimestamp", value.asInstanceOf[js.Any])
      
      inline def setLastConsumptionTimestampUndefined: Self = StObject.set(x, "lastConsumptionTimestamp", js.undefined)
      
      inline def setRoleSid(value: String): Self = StObject.set(x, "roleSid", value.asInstanceOf[js.Any])
      
      inline def setRoleSidUndefined: Self = StObject.set(x, "roleSid", js.undefined)
      
      inline def setXTwilioWebhookEnabled(value: MemberWebhookEnabledType): Self = StObject.set(x, "xTwilioWebhookEnabled", value.asInstanceOf[js.Any])
      
      inline def setXTwilioWebhookEnabledUndefined: Self = StObject.set(x, "xTwilioWebhookEnabled", js.undefined)
    }
  }
  
  @js.native
  trait MemberListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): MemberContext = js.native
    
    /**
      * create a MemberInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: MemberListInstanceCreateOptions): js.Promise[MemberInstance] = js.native
    def create(
      opts: MemberListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ MemberInstance, Any]
    ): js.Promise[MemberInstance] = js.native
    
    /**
      * Streams MemberInstance records from the API.
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
          /* item */ MemberInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ MemberInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: MemberListInstanceEachOptions): Unit = js.native
    def each(
      opts: MemberListInstanceEachOptions,
      callback: js.Function2[
          /* item */ MemberInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a member
      *
      * @param sid - The SID of the Member resource to fetch
      */
    def get(sid: String): MemberContext = js.native
    
    /**
      * Retrieve a single target page of MemberInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[MemberPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ MemberPage, Any]): js.Promise[MemberPage] = js.native
    def getPage(targetUrl: String): js.Promise[MemberPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ MemberPage, Any]
    ): js.Promise[MemberPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ MemberPage, Any]): js.Promise[MemberPage] = js.native
    
    /**
      * Lists MemberInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[MemberInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[MemberInstance], Any]): js.Promise[js.Array[MemberInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[MemberInstance], Any]
    ): js.Promise[js.Array[MemberInstance]] = js.native
    def list(opts: MemberListInstanceOptions): js.Promise[js.Array[MemberInstance]] = js.native
    def list(
      opts: MemberListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[MemberInstance], Any]
    ): js.Promise[js.Array[MemberInstance]] = js.native
    
    /**
      * Retrieve a single page of MemberInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[MemberPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ MemberPage, Any]): js.Promise[MemberPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ MemberPage, Any]): js.Promise[MemberPage] = js.native
    def page(opts: MemberListInstancePageOptions): js.Promise[MemberPage] = js.native
    def page(
      opts: MemberListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ MemberPage, Any]
    ): js.Promise[MemberPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property attributes - A valid JSON string that contains application-specific data
    * @property dateCreated - The ISO 8601 date and time in GMT when the resource was created
    * @property dateUpdated - The ISO 8601 date and time in GMT when the resource was updated
    * @property identity - The `identity` value that identifies the new resource's User
    * @property lastConsumedMessageIndex - The index of the last Message in the Channel the Member has read
    * @property lastConsumptionTimestamp - The ISO 8601 based timestamp string representing the datetime of the last Message read event for the member within the Channel
    * @property roleSid - The SID of the Role to assign to the member
    * @property xTwilioWebhookEnabled - The X-Twilio-Webhook-Enabled HTTP request header
    */
  trait MemberListInstanceCreateOptions extends StObject {
    
    var attributes: js.UndefOr[String] = js.undefined
    
    var dateCreated: js.UndefOr[js.Date] = js.undefined
    
    var dateUpdated: js.UndefOr[js.Date] = js.undefined
    
    var identity: String
    
    var lastConsumedMessageIndex: js.UndefOr[Double] = js.undefined
    
    var lastConsumptionTimestamp: js.UndefOr[js.Date] = js.undefined
    
    var roleSid: js.UndefOr[String] = js.undefined
    
    var xTwilioWebhookEnabled: js.UndefOr[MemberWebhookEnabledType] = js.undefined
  }
  object MemberListInstanceCreateOptions {
    
    inline def apply(identity: String): MemberListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemberListInstanceCreateOptions]
    }
    
    extension [Self <: MemberListInstanceCreateOptions](x: Self) {
      
      inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setDateCreated(value: js.Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
      
      inline def setDateUpdated(value: js.Date): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
      
      inline def setDateUpdatedUndefined: Self = StObject.set(x, "dateUpdated", js.undefined)
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setLastConsumedMessageIndex(value: Double): Self = StObject.set(x, "lastConsumedMessageIndex", value.asInstanceOf[js.Any])
      
      inline def setLastConsumedMessageIndexUndefined: Self = StObject.set(x, "lastConsumedMessageIndex", js.undefined)
      
      inline def setLastConsumptionTimestamp(value: js.Date): Self = StObject.set(x, "lastConsumptionTimestamp", value.asInstanceOf[js.Any])
      
      inline def setLastConsumptionTimestampUndefined: Self = StObject.set(x, "lastConsumptionTimestamp", js.undefined)
      
      inline def setRoleSid(value: String): Self = StObject.set(x, "roleSid", value.asInstanceOf[js.Any])
      
      inline def setRoleSidUndefined: Self = StObject.set(x, "roleSid", js.undefined)
      
      inline def setXTwilioWebhookEnabled(value: MemberWebhookEnabledType): Self = StObject.set(x, "xTwilioWebhookEnabled", value.asInstanceOf[js.Any])
      
      inline def setXTwilioWebhookEnabledUndefined: Self = StObject.set(x, "xTwilioWebhookEnabled", js.undefined)
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
    * @property identity - The `identity` value of the resources to read
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
  trait MemberListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ MemberInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var identity: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object MemberListInstanceEachOptions {
    
    inline def apply(): MemberListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MemberListInstanceEachOptions]
    }
    
    extension [Self <: MemberListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ MemberInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
    * @property identity - The `identity` value of the resources to read
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
  trait MemberListInstanceOptions extends StObject {
    
    var identity: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object MemberListInstanceOptions {
    
    inline def apply(): MemberListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MemberListInstanceOptions]
    }
    
    extension [Self <: MemberListInstanceOptions](x: Self) {
      
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
    * @property identity - The `identity` value of the resources to read
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait MemberListInstancePageOptions extends StObject {
    
    var identity: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object MemberListInstancePageOptions {
    
    inline def apply(): MemberListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MemberListInstancePageOptions]
    }
    
    extension [Self <: MemberListInstancePageOptions](x: Self) {
      
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
  
  trait MemberPayload
    extends StObject
       with MemberResource
       with TwilioResponsePayload
  object MemberPayload {
    
    inline def apply(
      account_sid: String,
      attributes: String,
      channel_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      identity: String,
      last_consumed_message_index: Double,
      last_consumption_timestamp: js.Date,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      role_sid: String,
      service_sid: String,
      sid: String,
      uri: String,
      url: String
    ): MemberPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], channel_sid = channel_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], last_consumed_message_index = last_consumed_message_index.asInstanceOf[js.Any], last_consumption_timestamp = last_consumption_timestamp.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], role_sid = role_sid.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemberPayload]
    }
  }
  
  trait MemberResource extends StObject {
    
    var account_sid: String
    
    var attributes: String
    
    var channel_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var identity: String
    
    var last_consumed_message_index: Double
    
    var last_consumption_timestamp: js.Date
    
    var role_sid: String
    
    var service_sid: String
    
    var sid: String
    
    var url: String
  }
  object MemberResource {
    
    inline def apply(
      account_sid: String,
      attributes: String,
      channel_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      identity: String,
      last_consumed_message_index: Double,
      last_consumption_timestamp: js.Date,
      role_sid: String,
      service_sid: String,
      sid: String,
      url: String
    ): MemberResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], channel_sid = channel_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], last_consumed_message_index = last_consumed_message_index.asInstanceOf[js.Any], last_consumption_timestamp = last_consumption_timestamp.asInstanceOf[js.Any], role_sid = role_sid.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemberResource]
    }
    
    extension [Self <: MemberResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setChannel_sid(value: String): Self = StObject.set(x, "channel_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setLast_consumed_message_index(value: Double): Self = StObject.set(x, "last_consumed_message_index", value.asInstanceOf[js.Any])
      
      inline def setLast_consumption_timestamp(value: js.Date): Self = StObject.set(x, "last_consumption_timestamp", value.asInstanceOf[js.Any])
      
      inline def setRole_sid(value: String): Self = StObject.set(x, "role_sid", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait MemberSolution extends StObject {
    
    var channelSid: js.UndefOr[String] = js.undefined
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object MemberSolution {
    
    inline def apply(): MemberSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MemberSolution]
    }
    
    extension [Self <: MemberSolution](x: Self) {
      
      inline def setChannelSid(value: String): Self = StObject.set(x, "channelSid", value.asInstanceOf[js.Any])
      
      inline def setChannelSidUndefined: Self = StObject.set(x, "channelSid", js.undefined)
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.`true`
    - typings.twilio.twilioStrings.`false`
  */
  trait MemberWebhookEnabledType extends StObject
  object MemberWebhookEnabledType {
    
    inline def `false`: typings.twilio.twilioStrings.`false` = "false".asInstanceOf[typings.twilio.twilioStrings.`false`]
    
    inline def `true`: typings.twilio.twilioStrings.`true` = "true".asInstanceOf[typings.twilio.twilioStrings.`true`]
  }
}
