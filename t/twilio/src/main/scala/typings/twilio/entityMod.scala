package typings.twilio

import typings.twilio.challengeMod.ChallengeContext
import typings.twilio.challengeMod.ChallengeListInstance
import typings.twilio.factorMod.FactorContext
import typings.twilio.factorMod.FactorListInstance
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.newFactorMod.NewFactorListInstance
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityMod {
  
  @JSImport("twilio/lib/rest/verify/v2/service/entity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/verify/v2/service/entity", "EntityContext")
  @js.native
  open class EntityContext protected () extends StObject {
    /**
      * Initialize the EntityContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param serviceSid - Service Sid.
      * @param identity - Unique external identifier of the Entity
      */
    def this(version: typings.twilio.verifyV2Mod.^, serviceSid: String, identity: String) = this()
    
    /**
      * @param sid - sid of instance
      */
    def challenges(sid: String): ChallengeContext = js.native
    @JSName("challenges")
    var challenges_Original: ChallengeListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def factors(sid: String): FactorContext = js.native
    @JSName("factors")
    var factors_Original: FactorListInstance = js.native
    
    /**
      * fetch a EntityInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[EntityInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ EntityInstance, Any]): js.Promise[EntityInstance] = js.native
    
    var newFactors: NewFactorListInstance = js.native
    
    /**
      * remove a EntityInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ EntityInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/verify/v2/service/entity", "EntityInstance")
  @js.native
  open class EntityInstance protected () extends SerializableClass {
    /**
      * Initialize the EntityContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - Service Sid.
      * @param identity - Unique external identifier of the Entity
      */
    def this(
      version: typings.twilio.verifyV2Mod.^,
      payload: EntityPayload,
      serviceSid: String,
      identity: String
    ) = this()
    
    /* private */ var _proxy: EntityContext = js.native
    
    var accountSid: String = js.native
    
    /**
      * Access the challenges
      */
    def challenges(): ChallengeListInstance = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * Access the factors
      */
    def factors(): FactorListInstance = js.native
    
    /**
      * fetch a EntityInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[EntityInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[EntityInstance] = js.native
    
    var identity: String = js.native
    
    var links: String = js.native
    
    /**
      * Access the newFactors
      */
    def newFactors(): NewFactorListInstance = js.native
    
    /**
      * remove a EntityInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the EntityList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param serviceSid - Service Sid.
    */
  inline def EntityList(version: typings.twilio.verifyV2Mod.^, serviceSid: String): EntityListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("EntityList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any])).asInstanceOf[EntityListInstance]
  
  @JSImport("twilio/lib/rest/verify/v2/service/entity", "EntityPage")
  @js.native
  open class EntityPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.verifyV2Mod.^, EntityPayload, EntityResource, EntityInstance] {
    /**
      * Initialize the EntityPage
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
      solution: EntitySolution
    ) = this()
    
    /**
      * Build an instance of EntityInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: EntityPayload): EntityInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait EntityListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): EntityContext = js.native
    
    /**
      * create a EntityInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: EntityListInstanceCreateOptions): js.Promise[EntityInstance] = js.native
    def create(
      opts: EntityListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ EntityInstance, Any]
    ): js.Promise[EntityInstance] = js.native
    
    /**
      * Streams EntityInstance records from the API.
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
          /* item */ EntityInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ EntityInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: EntityListInstanceEachOptions): Unit = js.native
    def each(
      opts: EntityListInstanceEachOptions,
      callback: js.Function2[
          /* item */ EntityInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a entity
      *
      * @param identity - Unique external identifier of the Entity
      */
    def get(identity: String): EntityContext = js.native
    
    /**
      * Retrieve a single target page of EntityInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[EntityPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ EntityPage, Any]): js.Promise[EntityPage] = js.native
    def getPage(targetUrl: String): js.Promise[EntityPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ EntityPage, Any]
    ): js.Promise[EntityPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ EntityPage, Any]): js.Promise[EntityPage] = js.native
    
    /**
      * Lists EntityInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[EntityInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[EntityInstance], Any]): js.Promise[js.Array[EntityInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[EntityInstance], Any]
    ): js.Promise[js.Array[EntityInstance]] = js.native
    def list(opts: EntityListInstanceOptions): js.Promise[js.Array[EntityInstance]] = js.native
    def list(
      opts: EntityListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[EntityInstance], Any]
    ): js.Promise[js.Array[EntityInstance]] = js.native
    
    /**
      * Retrieve a single page of EntityInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[EntityPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ EntityPage, Any]): js.Promise[EntityPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ EntityPage, Any]): js.Promise[EntityPage] = js.native
    def page(opts: EntityListInstancePageOptions): js.Promise[EntityPage] = js.native
    def page(
      opts: EntityListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ EntityPage, Any]
    ): js.Promise[EntityPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property identity - Unique external identifier of the Entity
    */
  trait EntityListInstanceCreateOptions extends StObject {
    
    var identity: String
  }
  object EntityListInstanceCreateOptions {
    
    inline def apply(identity: String): EntityListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntityListInstanceCreateOptions]
    }
    
    extension [Self <: EntityListInstanceCreateOptions](x: Self) {
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
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
  trait EntityListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ EntityInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object EntityListInstanceEachOptions {
    
    inline def apply(): EntityListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EntityListInstanceEachOptions]
    }
    
    extension [Self <: EntityListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ EntityInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait EntityListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object EntityListInstanceOptions {
    
    inline def apply(): EntityListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EntityListInstanceOptions]
    }
    
    extension [Self <: EntityListInstanceOptions](x: Self) {
      
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
  trait EntityListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object EntityListInstancePageOptions {
    
    inline def apply(): EntityListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EntityListInstancePageOptions]
    }
    
    extension [Self <: EntityListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait EntityPayload
    extends StObject
       with EntityResource
       with TwilioResponsePayload
  object EntityPayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      identity: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      service_sid: String,
      sid: String,
      uri: String,
      url: String
    ): EntityPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntityPayload]
    }
  }
  
  trait EntityResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var identity: String
    
    var links: String
    
    var service_sid: String
    
    var sid: String
    
    var url: String
  }
  object EntityResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      identity: String,
      links: String,
      service_sid: String,
      sid: String,
      url: String
    ): EntityResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntityResource]
    }
    
    extension [Self <: EntityResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait EntitySolution extends StObject {
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object EntitySolution {
    
    inline def apply(): EntitySolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EntitySolution]
    }
    
    extension [Self <: EntitySolution](x: Self) {
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
}
