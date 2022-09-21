package typings.twilio

import typings.twilio.anon.Fields
import typings.twilio.challengeNotificationMod.NotificationListInstance
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.approved_
import typings.twilio.twilioStrings.asc_
import typings.twilio.twilioStrings.desc_
import typings.twilio.twilioStrings.pending_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object challengeMod {
  
  @JSImport("twilio/lib/rest/verify/v2/service/entity/challenge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/verify/v2/service/entity/challenge", "ChallengeContext")
  @js.native
  open class ChallengeContext protected () extends StObject {
    /**
      * Initialize the ChallengeContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param serviceSid - Service Sid.
      * @param identity - Unique external identifier of the Entity
      * @param sid - A string that uniquely identifies this Challenge.
      */
    def this(version: typings.twilio.verifyV2Mod.^, serviceSid: String, identity: String, sid: String) = this()
    
    /**
      * fetch a ChallengeInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ChallengeInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ ChallengeInstance, Any]): js.Promise[ChallengeInstance] = js.native
    
    var notifications: NotificationListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a ChallengeInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ChallengeInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ ChallengeInstance, Any]): js.Promise[ChallengeInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ChallengeInstance, Any]
    ): js.Promise[ChallengeInstance] = js.native
    def update(opts: ChallengeInstanceUpdateOptions): js.Promise[ChallengeInstance] = js.native
    def update(
      opts: ChallengeInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ChallengeInstance, Any]
    ): js.Promise[ChallengeInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/verify/v2/service/entity/challenge", "ChallengeInstance")
  @js.native
  open class ChallengeInstance protected () extends SerializableClass {
    /**
      * Initialize the ChallengeContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - Service Sid.
      * @param identity - Unique external identifier of the Entity
      * @param sid - A string that uniquely identifies this Challenge.
      */
    def this(
      version: typings.twilio.verifyV2Mod.^,
      payload: ChallengePayload,
      serviceSid: String,
      identity: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: ChallengeContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateResponded: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var details: Any = js.native
    
    var entitySid: String = js.native
    
    var expirationDate: js.Date = js.native
    
    var factorSid: String = js.native
    
    var factorType: ChallengeFactorTypes = js.native
    
    /**
      * fetch a ChallengeInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ChallengeInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ChallengeInstance] = js.native
    
    var hiddenDetails: Any = js.native
    
    var identity: String = js.native
    
    var links: String = js.native
    
    var metadata: Any = js.native
    
    /**
      * Access the notifications
      */
    def notifications(): NotificationListInstance = js.native
    
    var respondedReason: ChallengeChallengeReasons = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    var status: ChallengeChallengeStatuses = js.native
    
    /**
      * update a ChallengeInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ChallengeInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ChallengeInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ChallengeInstance] = js.native
    def update(opts: ChallengeInstanceUpdateOptions): js.Promise[ChallengeInstance] = js.native
    def update(
      opts: ChallengeInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[ChallengeInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the ChallengeList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param serviceSid - Service Sid.
    * @param identity - Unique external identifier of the Entity
    */
  inline def ChallengeList(version: typings.twilio.verifyV2Mod.^, serviceSid: String, identity: String): ChallengeListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("ChallengeList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any], identity.asInstanceOf[js.Any])).asInstanceOf[ChallengeListInstance]
  
  @JSImport("twilio/lib/rest/verify/v2/service/entity/challenge", "ChallengePage")
  @js.native
  open class ChallengePage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.verifyV2Mod.^, ChallengePayload, ChallengeResource, ChallengeInstance] {
    /**
      * Initialize the ChallengePage
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.verifyV2Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: ChallengeSolution
    ) = this()
    
    /**
      * Build an instance of ChallengeInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ChallengePayload): ChallengeInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.none
    - typings.twilio.twilioStrings.not_needed
    - typings.twilio.twilioStrings.not_requested
  */
  trait ChallengeChallengeReasons extends StObject
  object ChallengeChallengeReasons {
    
    inline def none: typings.twilio.twilioStrings.none = "none".asInstanceOf[typings.twilio.twilioStrings.none]
    
    inline def not_needed: typings.twilio.twilioStrings.not_needed = "not_needed".asInstanceOf[typings.twilio.twilioStrings.not_needed]
    
    inline def not_requested: typings.twilio.twilioStrings.not_requested = "not_requested".asInstanceOf[typings.twilio.twilioStrings.not_requested]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.pending_
    - typings.twilio.twilioStrings.expired
    - typings.twilio.twilioStrings.approved_
    - typings.twilio.twilioStrings.denied
  */
  trait ChallengeChallengeStatuses extends StObject
  object ChallengeChallengeStatuses {
    
    inline def approved: approved_ = "approved".asInstanceOf[approved_]
    
    inline def denied: typings.twilio.twilioStrings.denied = "denied".asInstanceOf[typings.twilio.twilioStrings.denied]
    
    inline def expired: typings.twilio.twilioStrings.expired = "expired".asInstanceOf[typings.twilio.twilioStrings.expired]
    
    inline def pending: pending_ = "pending".asInstanceOf[pending_]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.push
    - typings.twilio.twilioStrings.totp
  */
  trait ChallengeFactorTypes extends StObject
  object ChallengeFactorTypes {
    
    inline def push: typings.twilio.twilioStrings.push = "push".asInstanceOf[typings.twilio.twilioStrings.push]
    
    inline def totp: typings.twilio.twilioStrings.totp = "totp".asInstanceOf[typings.twilio.twilioStrings.totp]
  }
  
  /**
    * Options to pass to update
    *
    * @property authPayload - Optional payload to verify the Challenge
    * @property metadata - Metadata of the challenge.
    */
  trait ChallengeInstanceUpdateOptions extends StObject {
    
    var authPayload: js.UndefOr[String] = js.undefined
    
    var metadata: js.UndefOr[js.Object] = js.undefined
  }
  object ChallengeInstanceUpdateOptions {
    
    inline def apply(): ChallengeInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChallengeInstanceUpdateOptions]
    }
    
    extension [Self <: ChallengeInstanceUpdateOptions](x: Self) {
      
      inline def setAuthPayload(value: String): Self = StObject.set(x, "authPayload", value.asInstanceOf[js.Any])
      
      inline def setAuthPayloadUndefined: Self = StObject.set(x, "authPayload", js.undefined)
      
      inline def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
  
  @js.native
  trait ChallengeListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): ChallengeContext = js.native
    
    /**
      * create a ChallengeInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: ChallengeListInstanceCreateOptions): js.Promise[ChallengeInstance] = js.native
    def create(
      opts: ChallengeListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ ChallengeInstance, Any]
    ): js.Promise[ChallengeInstance] = js.native
    
    /**
      * Streams ChallengeInstance records from the API.
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
          /* item */ ChallengeInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ ChallengeInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: ChallengeListInstanceEachOptions): Unit = js.native
    def each(
      opts: ChallengeListInstanceEachOptions,
      callback: js.Function2[
          /* item */ ChallengeInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a challenge
      *
      * @param sid - A string that uniquely identifies this Challenge.
      */
    def get(sid: String): ChallengeContext = js.native
    
    /**
      * Retrieve a single target page of ChallengeInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[ChallengePage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ ChallengePage, Any]): js.Promise[ChallengePage] = js.native
    def getPage(targetUrl: String): js.Promise[ChallengePage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ChallengePage, Any]
    ): js.Promise[ChallengePage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ChallengePage, Any]
    ): js.Promise[ChallengePage] = js.native
    
    /**
      * Lists ChallengeInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[ChallengeInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ChallengeInstance], Any]): js.Promise[js.Array[ChallengeInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ChallengeInstance], Any]
    ): js.Promise[js.Array[ChallengeInstance]] = js.native
    def list(opts: ChallengeListInstanceOptions): js.Promise[js.Array[ChallengeInstance]] = js.native
    def list(
      opts: ChallengeListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ChallengeInstance], Any]
    ): js.Promise[js.Array[ChallengeInstance]] = js.native
    
    /**
      * Retrieve a single page of ChallengeInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[ChallengePage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ ChallengePage, Any]): js.Promise[ChallengePage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ ChallengePage, Any]): js.Promise[ChallengePage] = js.native
    def page(opts: ChallengeListInstancePageOptions): js.Promise[ChallengePage] = js.native
    def page(
      opts: ChallengeListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ChallengePage, Any]
    ): js.Promise[ChallengePage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property authPayload - Optional payload to verify the Challenge
    * @property details.fields - A list of objects that describe the Fields included in the Challenge
    * @property details.message - Shown to the user when the push notification arrives
    * @property expirationDate - The date-time when this Challenge expires
    * @property factorSid - Factor Sid.
    * @property hiddenDetails - Hidden details provided to contextualize the Challenge
    */
  trait ChallengeListInstanceCreateOptions extends StObject {
    
    var authPayload: js.UndefOr[String] = js.undefined
    
    var details: js.UndefOr[Fields] = js.undefined
    
    var expirationDate: js.UndefOr[js.Date] = js.undefined
    
    var factorSid: String
    
    var hiddenDetails: js.UndefOr[js.Object] = js.undefined
  }
  object ChallengeListInstanceCreateOptions {
    
    inline def apply(factorSid: String): ChallengeListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(factorSid = factorSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChallengeListInstanceCreateOptions]
    }
    
    extension [Self <: ChallengeListInstanceCreateOptions](x: Self) {
      
      inline def setAuthPayload(value: String): Self = StObject.set(x, "authPayload", value.asInstanceOf[js.Any])
      
      inline def setAuthPayloadUndefined: Self = StObject.set(x, "authPayload", js.undefined)
      
      inline def setDetails(value: Fields): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      inline def setExpirationDate(value: js.Date): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
      
      inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
      
      inline def setFactorSid(value: String): Self = StObject.set(x, "factorSid", value.asInstanceOf[js.Any])
      
      inline def setHiddenDetails(value: js.Object): Self = StObject.set(x, "hiddenDetails", value.asInstanceOf[js.Any])
      
      inline def setHiddenDetailsUndefined: Self = StObject.set(x, "hiddenDetails", js.undefined)
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
    * @property factorSid - Factor Sid.
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         each() guarantees never to return more than limit.
    *                         Default is no limit
    * @property order - The sort order of the Challenges list
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no pageSize is defined but a limit is defined,
    *                         each() will attempt to read the limit with the most efficient
    *                         page size, i.e. min(limit, 1000)
    * @property status - The Status of theChallenges to fetch
    */
  trait ChallengeListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ ChallengeInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var factorSid: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var order: js.UndefOr[ChallengeListOrders] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[ChallengeChallengeStatuses] = js.undefined
  }
  object ChallengeListInstanceEachOptions {
    
    inline def apply(): ChallengeListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChallengeListInstanceEachOptions]
    }
    
    extension [Self <: ChallengeListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ ChallengeInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setFactorSid(value: String): Self = StObject.set(x, "factorSid", value.asInstanceOf[js.Any])
      
      inline def setFactorSidUndefined: Self = StObject.set(x, "factorSid", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setOrder(value: ChallengeListOrders): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setStatus(value: ChallengeChallengeStatuses): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property factorSid - Factor Sid.
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         list() guarantees never to return more than limit.
    *                         Default is no limit
    * @property order - The sort order of the Challenges list
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no page_size is defined but a limit is defined,
    *                         list() will attempt to read the limit with the most
    *                         efficient page size, i.e. min(limit, 1000)
    * @property status - The Status of theChallenges to fetch
    */
  trait ChallengeListInstanceOptions extends StObject {
    
    var factorSid: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var order: js.UndefOr[ChallengeListOrders] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[ChallengeChallengeStatuses] = js.undefined
  }
  object ChallengeListInstanceOptions {
    
    inline def apply(): ChallengeListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChallengeListInstanceOptions]
    }
    
    extension [Self <: ChallengeListInstanceOptions](x: Self) {
      
      inline def setFactorSid(value: String): Self = StObject.set(x, "factorSid", value.asInstanceOf[js.Any])
      
      inline def setFactorSidUndefined: Self = StObject.set(x, "factorSid", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setOrder(value: ChallengeListOrders): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setStatus(value: ChallengeChallengeStatuses): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property factorSid - Factor Sid.
    * @property order - The sort order of the Challenges list
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property status - The Status of theChallenges to fetch
    */
  trait ChallengeListInstancePageOptions extends StObject {
    
    var factorSid: js.UndefOr[String] = js.undefined
    
    var order: js.UndefOr[ChallengeListOrders] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[ChallengeChallengeStatuses] = js.undefined
  }
  object ChallengeListInstancePageOptions {
    
    inline def apply(): ChallengeListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChallengeListInstancePageOptions]
    }
    
    extension [Self <: ChallengeListInstancePageOptions](x: Self) {
      
      inline def setFactorSid(value: String): Self = StObject.set(x, "factorSid", value.asInstanceOf[js.Any])
      
      inline def setFactorSidUndefined: Self = StObject.set(x, "factorSid", js.undefined)
      
      inline def setOrder(value: ChallengeListOrders): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setStatus(value: ChallengeChallengeStatuses): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.asc_
    - typings.twilio.twilioStrings.desc_
  */
  trait ChallengeListOrders extends StObject
  object ChallengeListOrders {
    
    inline def asc: asc_ = "asc".asInstanceOf[asc_]
    
    inline def desc: desc_ = "desc".asInstanceOf[desc_]
  }
  
  trait ChallengePayload
    extends StObject
       with ChallengeResource
       with TwilioResponsePayload
  object ChallengePayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_responded: js.Date,
      date_updated: js.Date,
      details: js.Object,
      entity_sid: String,
      expiration_date: js.Date,
      factor_sid: String,
      factor_type: ChallengeFactorTypes,
      first_page_uri: String,
      hidden_details: js.Object,
      identity: String,
      links: String,
      metadata: js.Object,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      responded_reason: ChallengeChallengeReasons,
      service_sid: String,
      sid: String,
      status: ChallengeChallengeStatuses,
      uri: String,
      url: String
    ): ChallengePayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_responded = date_responded.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], entity_sid = entity_sid.asInstanceOf[js.Any], expiration_date = expiration_date.asInstanceOf[js.Any], factor_sid = factor_sid.asInstanceOf[js.Any], factor_type = factor_type.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], hidden_details = hidden_details.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], responded_reason = responded_reason.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChallengePayload]
    }
  }
  
  trait ChallengeResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_responded: js.Date
    
    var date_updated: js.Date
    
    var details: js.Object
    
    var entity_sid: String
    
    var expiration_date: js.Date
    
    var factor_sid: String
    
    var factor_type: ChallengeFactorTypes
    
    var hidden_details: js.Object
    
    var identity: String
    
    var links: String
    
    var metadata: js.Object
    
    var responded_reason: ChallengeChallengeReasons
    
    var service_sid: String
    
    var sid: String
    
    var status: ChallengeChallengeStatuses
    
    var url: String
  }
  object ChallengeResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_responded: js.Date,
      date_updated: js.Date,
      details: js.Object,
      entity_sid: String,
      expiration_date: js.Date,
      factor_sid: String,
      factor_type: ChallengeFactorTypes,
      hidden_details: js.Object,
      identity: String,
      links: String,
      metadata: js.Object,
      responded_reason: ChallengeChallengeReasons,
      service_sid: String,
      sid: String,
      status: ChallengeChallengeStatuses,
      url: String
    ): ChallengeResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_responded = date_responded.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], entity_sid = entity_sid.asInstanceOf[js.Any], expiration_date = expiration_date.asInstanceOf[js.Any], factor_sid = factor_sid.asInstanceOf[js.Any], factor_type = factor_type.asInstanceOf[js.Any], hidden_details = hidden_details.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], responded_reason = responded_reason.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChallengeResource]
    }
    
    extension [Self <: ChallengeResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_responded(value: js.Date): Self = StObject.set(x, "date_responded", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDetails(value: js.Object): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setEntity_sid(value: String): Self = StObject.set(x, "entity_sid", value.asInstanceOf[js.Any])
      
      inline def setExpiration_date(value: js.Date): Self = StObject.set(x, "expiration_date", value.asInstanceOf[js.Any])
      
      inline def setFactor_sid(value: String): Self = StObject.set(x, "factor_sid", value.asInstanceOf[js.Any])
      
      inline def setFactor_type(value: ChallengeFactorTypes): Self = StObject.set(x, "factor_type", value.asInstanceOf[js.Any])
      
      inline def setHidden_details(value: js.Object): Self = StObject.set(x, "hidden_details", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setResponded_reason(value: ChallengeChallengeReasons): Self = StObject.set(x, "responded_reason", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: ChallengeChallengeStatuses): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChallengeSolution extends StObject {
    
    var identity: js.UndefOr[String] = js.undefined
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object ChallengeSolution {
    
    inline def apply(): ChallengeSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChallengeSolution]
    }
    
    extension [Self <: ChallengeSolution](x: Self) {
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
}
