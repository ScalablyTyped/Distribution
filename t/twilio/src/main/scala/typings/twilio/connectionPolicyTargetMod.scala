package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectionPolicyTargetMod {
  
  @JSImport("twilio/lib/rest/voice/v1/connectionPolicy/connectionPolicyTarget", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/voice/v1/connectionPolicy/connectionPolicyTarget", "ConnectionPolicyTargetContext")
  @js.native
  open class ConnectionPolicyTargetContext protected () extends StObject {
    /**
      * Initialize the ConnectionPolicyTargetContext
      *
      * @param version - Version of the resource
      * @param connectionPolicySid - The SID of the Connection Policy that owns the Target
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.voiceV1Mod.^, connectionPolicySid: String, sid: String) = this()
    
    /**
      * fetch a ConnectionPolicyTargetInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ConnectionPolicyTargetInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConnectionPolicyTargetInstance, Any]
    ): js.Promise[ConnectionPolicyTargetInstance] = js.native
    
    /**
      * remove a ConnectionPolicyTargetInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConnectionPolicyTargetInstance, Any]
    ): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a ConnectionPolicyTargetInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ConnectionPolicyTargetInstance] = js.native
    def update(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConnectionPolicyTargetInstance, Any]
    ): js.Promise[ConnectionPolicyTargetInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConnectionPolicyTargetInstance, Any]
    ): js.Promise[ConnectionPolicyTargetInstance] = js.native
    def update(opts: ConnectionPolicyTargetInstanceUpdateOptions): js.Promise[ConnectionPolicyTargetInstance] = js.native
    def update(
      opts: ConnectionPolicyTargetInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConnectionPolicyTargetInstance, Any]
    ): js.Promise[ConnectionPolicyTargetInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/voice/v1/connectionPolicy/connectionPolicyTarget", "ConnectionPolicyTargetInstance")
  @js.native
  open class ConnectionPolicyTargetInstance protected () extends SerializableClass {
    /**
      * Initialize the ConnectionPolicyTargetContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param connectionPolicySid - The SID of the Connection Policy that owns the Target
      * @param sid - The unique string that identifies the resource
      */
    def this(
      version: typings.twilio.voiceV1Mod.^,
      payload: ConnectionPolicyTargetPayload,
      connectionPolicySid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: ConnectionPolicyTargetContext = js.native
    
    var accountSid: String = js.native
    
    var connectionPolicySid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var enabled: Boolean = js.native
    
    /**
      * fetch a ConnectionPolicyTargetInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ConnectionPolicyTargetInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ConnectionPolicyTargetInstance] = js.native
    
    var friendlyName: String = js.native
    
    var priority: Double = js.native
    
    /**
      * remove a ConnectionPolicyTargetInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var target: String = js.native
    
    /**
      * update a ConnectionPolicyTargetInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ConnectionPolicyTargetInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ConnectionPolicyTargetInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ConnectionPolicyTargetInstance] = js.native
    def update(opts: ConnectionPolicyTargetInstanceUpdateOptions): js.Promise[ConnectionPolicyTargetInstance] = js.native
    def update(
      opts: ConnectionPolicyTargetInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[ConnectionPolicyTargetInstance] = js.native
    
    var url: String = js.native
    
    var weight: Double = js.native
  }
  
  /**
    * Initialize the ConnectionPolicyTargetList
    *
    * @param version - Version of the resource
    * @param connectionPolicySid - The SID of the Connection Policy that owns the Target
    */
  inline def ConnectionPolicyTargetList(version: typings.twilio.voiceV1Mod.^, connectionPolicySid: String): ConnectionPolicyTargetListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("ConnectionPolicyTargetList")(version.asInstanceOf[js.Any], connectionPolicySid.asInstanceOf[js.Any])).asInstanceOf[ConnectionPolicyTargetListInstance]
  
  @JSImport("twilio/lib/rest/voice/v1/connectionPolicy/connectionPolicyTarget", "ConnectionPolicyTargetPage")
  @js.native
  open class ConnectionPolicyTargetPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.voiceV1Mod.^, 
          ConnectionPolicyTargetPayload, 
          ConnectionPolicyTargetResource, 
          ConnectionPolicyTargetInstance
        ] {
    /**
      * Initialize the ConnectionPolicyTargetPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.voiceV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: ConnectionPolicyTargetSolution
    ) = this()
    
    /**
      * Build an instance of ConnectionPolicyTargetInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ConnectionPolicyTargetPayload): ConnectionPolicyTargetInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property enabled - Whether the Target is enabled
    * @property friendlyName - A string to describe the resource
    * @property priority - The relative importance of the target
    * @property target - The SIP address you want Twilio to route your calls to
    * @property weight - The value that determines the relative load the Target should receive compared to others with the same priority
    */
  trait ConnectionPolicyTargetInstanceUpdateOptions extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var priority: js.UndefOr[Double] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
    
    var weight: js.UndefOr[Double] = js.undefined
  }
  object ConnectionPolicyTargetInstanceUpdateOptions {
    
    inline def apply(): ConnectionPolicyTargetInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionPolicyTargetInstanceUpdateOptions]
    }
    
    extension [Self <: ConnectionPolicyTargetInstanceUpdateOptions](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
  
  @js.native
  trait ConnectionPolicyTargetListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): ConnectionPolicyTargetContext = js.native
    
    /**
      * create a ConnectionPolicyTargetInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: ConnectionPolicyTargetListInstanceCreateOptions): js.Promise[ConnectionPolicyTargetInstance] = js.native
    def create(
      opts: ConnectionPolicyTargetListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ ConnectionPolicyTargetInstance, Any]
    ): js.Promise[ConnectionPolicyTargetInstance] = js.native
    
    /**
      * Streams ConnectionPolicyTargetInstance records from the API.
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
          /* item */ ConnectionPolicyTargetInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ ConnectionPolicyTargetInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: ConnectionPolicyTargetListInstanceEachOptions): Unit = js.native
    def each(
      opts: ConnectionPolicyTargetListInstanceEachOptions,
      callback: js.Function2[
          /* item */ ConnectionPolicyTargetInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a connection_policy_target
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): ConnectionPolicyTargetContext = js.native
    
    /**
      * Retrieve a single target page of ConnectionPolicyTargetInstance records from the
      * API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[ConnectionPolicyTargetPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ ConnectionPolicyTargetPage, Any]): js.Promise[ConnectionPolicyTargetPage] = js.native
    def getPage(targetUrl: String): js.Promise[ConnectionPolicyTargetPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConnectionPolicyTargetPage, Any]
    ): js.Promise[ConnectionPolicyTargetPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConnectionPolicyTargetPage, Any]
    ): js.Promise[ConnectionPolicyTargetPage] = js.native
    
    /**
      * Lists ConnectionPolicyTargetInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[ConnectionPolicyTargetInstance]] = js.native
    def list(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[ConnectionPolicyTargetInstance], 
          Any
        ]
    ): js.Promise[js.Array[ConnectionPolicyTargetInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[ConnectionPolicyTargetInstance], 
          Any
        ]
    ): js.Promise[js.Array[ConnectionPolicyTargetInstance]] = js.native
    def list(opts: ConnectionPolicyTargetListInstanceOptions): js.Promise[js.Array[ConnectionPolicyTargetInstance]] = js.native
    def list(
      opts: ConnectionPolicyTargetListInstanceOptions,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[ConnectionPolicyTargetInstance], 
          Any
        ]
    ): js.Promise[js.Array[ConnectionPolicyTargetInstance]] = js.native
    
    /**
      * Retrieve a single page of ConnectionPolicyTargetInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[ConnectionPolicyTargetPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ ConnectionPolicyTargetPage, Any]): js.Promise[ConnectionPolicyTargetPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConnectionPolicyTargetPage, Any]
    ): js.Promise[ConnectionPolicyTargetPage] = js.native
    def page(opts: ConnectionPolicyTargetListInstancePageOptions): js.Promise[ConnectionPolicyTargetPage] = js.native
    def page(
      opts: ConnectionPolicyTargetListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConnectionPolicyTargetPage, Any]
    ): js.Promise[ConnectionPolicyTargetPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property enabled - Whether the Target is enabled
    * @property friendlyName - A string to describe the resource
    * @property priority - The relative importance of the target
    * @property target - The SIP address you want Twilio to route your calls to
    * @property weight - The value that determines the relative load the Target should receive compared to others with the same priority
    */
  trait ConnectionPolicyTargetListInstanceCreateOptions extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var priority: js.UndefOr[Double] = js.undefined
    
    var target: String
    
    var weight: js.UndefOr[Double] = js.undefined
  }
  object ConnectionPolicyTargetListInstanceCreateOptions {
    
    inline def apply(target: String): ConnectionPolicyTargetListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionPolicyTargetListInstanceCreateOptions]
    }
    
    extension [Self <: ConnectionPolicyTargetListInstanceCreateOptions](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
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
  trait ConnectionPolicyTargetListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ ConnectionPolicyTargetInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ConnectionPolicyTargetListInstanceEachOptions {
    
    inline def apply(): ConnectionPolicyTargetListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionPolicyTargetListInstanceEachOptions]
    }
    
    extension [Self <: ConnectionPolicyTargetListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ ConnectionPolicyTargetInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait ConnectionPolicyTargetListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ConnectionPolicyTargetListInstanceOptions {
    
    inline def apply(): ConnectionPolicyTargetListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionPolicyTargetListInstanceOptions]
    }
    
    extension [Self <: ConnectionPolicyTargetListInstanceOptions](x: Self) {
      
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
  trait ConnectionPolicyTargetListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object ConnectionPolicyTargetListInstancePageOptions {
    
    inline def apply(): ConnectionPolicyTargetListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionPolicyTargetListInstancePageOptions]
    }
    
    extension [Self <: ConnectionPolicyTargetListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait ConnectionPolicyTargetPayload
    extends StObject
       with ConnectionPolicyTargetResource
       with TwilioResponsePayload
  object ConnectionPolicyTargetPayload {
    
    inline def apply(
      account_sid: String,
      connection_policy_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      enabled: Boolean,
      first_page_uri: String,
      friendly_name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      priority: Double,
      sid: String,
      target: String,
      uri: String,
      url: String,
      weight: Double
    ): ConnectionPolicyTargetPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], connection_policy_sid = connection_policy_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionPolicyTargetPayload]
    }
  }
  
  trait ConnectionPolicyTargetResource extends StObject {
    
    var account_sid: String
    
    var connection_policy_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var enabled: Boolean
    
    var friendly_name: String
    
    var priority: Double
    
    var sid: String
    
    var target: String
    
    var url: String
    
    var weight: Double
  }
  object ConnectionPolicyTargetResource {
    
    inline def apply(
      account_sid: String,
      connection_policy_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      enabled: Boolean,
      friendly_name: String,
      priority: Double,
      sid: String,
      target: String,
      url: String,
      weight: Double
    ): ConnectionPolicyTargetResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], connection_policy_sid = connection_policy_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionPolicyTargetResource]
    }
    
    extension [Self <: ConnectionPolicyTargetResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setConnection_policy_sid(value: String): Self = StObject.set(x, "connection_policy_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConnectionPolicyTargetSolution extends StObject {
    
    var connectionPolicySid: js.UndefOr[String] = js.undefined
  }
  object ConnectionPolicyTargetSolution {
    
    inline def apply(): ConnectionPolicyTargetSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionPolicyTargetSolution]
    }
    
    extension [Self <: ConnectionPolicyTargetSolution](x: Self) {
      
      inline def setConnectionPolicySid(value: String): Self = StObject.set(x, "connectionPolicySid", value.asInstanceOf[js.Any])
      
      inline def setConnectionPolicySidUndefined: Self = StObject.set(x, "connectionPolicySid", js.undefined)
    }
  }
}
