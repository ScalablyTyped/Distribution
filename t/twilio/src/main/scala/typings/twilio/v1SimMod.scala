package typings.twilio

import typings.twilio.billingPeriodMod.BillingPeriodListInstance
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.simIpAddressMod.SimIpAddressListInstance
import typings.twilio.twilioStrings.active_
import typings.twilio.twilioStrings.inactive_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1SimMod {
  
  @JSImport("twilio/lib/rest/supersim/v1/sim", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/supersim/v1/sim", "SimContext")
  @js.native
  open class SimContext protected () extends StObject {
    /**
      * Initialize the SimContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.supersimV1Mod.^, sid: String) = this()
    
    var billingPeriods: BillingPeriodListInstance = js.native
    
    /**
      * fetch a SimInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SimInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ SimInstance, Any]): js.Promise[SimInstance] = js.native
    
    var simIpAddresses: SimIpAddressListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a SimInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[SimInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ SimInstance, Any]): js.Promise[SimInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ SimInstance, Any]): js.Promise[SimInstance] = js.native
    def update(opts: SimInstanceUpdateOptions): js.Promise[SimInstance] = js.native
    def update(
      opts: SimInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SimInstance, Any]
    ): js.Promise[SimInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/supersim/v1/sim", "SimInstance")
  @js.native
  open class SimInstance protected () extends SerializableClass {
    /**
      * Initialize the SimContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.supersimV1Mod.^, payload: SimPayload, sid: String) = this()
    
    /* private */ var _proxy: SimContext = js.native
    
    var accountSid: String = js.native
    
    /**
      * Access the billingPeriods
      */
    def billingPeriods(): BillingPeriodListInstance = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a SimInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SimInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SimInstance] = js.native
    
    var fleetSid: String = js.native
    
    var iccid: String = js.native
    
    var links: String = js.native
    
    var sid: String = js.native
    
    /**
      * Access the simIpAddresses
      */
    def simIpAddresses(): SimIpAddressListInstance = js.native
    
    var status: SimStatus = js.native
    
    var uniqueName: String = js.native
    
    /**
      * update a SimInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[SimInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SimInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SimInstance] = js.native
    def update(opts: SimInstanceUpdateOptions): js.Promise[SimInstance] = js.native
    def update(
      opts: SimInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[SimInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the SimList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    */
  inline def SimList(version: typings.twilio.supersimV1Mod.^): SimListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("SimList")(version.asInstanceOf[js.Any]).asInstanceOf[SimListInstance]
  
  @JSImport("twilio/lib/rest/supersim/v1/sim", "SimPage")
  @js.native
  open class SimPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.supersimV1Mod.^, SimPayload, SimResource, SimInstance] {
    /**
      * Initialize the SimPage
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.supersimV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: SimSolution
    ) = this()
    
    /**
      * Build an instance of SimInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SimPayload): SimInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property accountSid - The SID of the Account to which the Sim resource should belong
    * @property callbackMethod - The HTTP method we should use to call callback_url
    * @property callbackUrl - The URL we should call after the update has finished
    * @property fleet - The SID or unique name of the Fleet to which the SIM resource should be assigned
    * @property status - The new status of the Super SIM
    * @property uniqueName - An application-defined string that uniquely identifies the resource
    */
  trait SimInstanceUpdateOptions extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
    
    var callbackMethod: js.UndefOr[String] = js.undefined
    
    var callbackUrl: js.UndefOr[String] = js.undefined
    
    var fleet: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[SimStatusUpdate] = js.undefined
    
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object SimInstanceUpdateOptions {
    
    inline def apply(): SimInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimInstanceUpdateOptions]
    }
    
    extension [Self <: SimInstanceUpdateOptions](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
      
      inline def setCallbackMethod(value: String): Self = StObject.set(x, "callbackMethod", value.asInstanceOf[js.Any])
      
      inline def setCallbackMethodUndefined: Self = StObject.set(x, "callbackMethod", js.undefined)
      
      inline def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
      
      inline def setCallbackUrlUndefined: Self = StObject.set(x, "callbackUrl", js.undefined)
      
      inline def setFleet(value: String): Self = StObject.set(x, "fleet", value.asInstanceOf[js.Any])
      
      inline def setFleetUndefined: Self = StObject.set(x, "fleet", js.undefined)
      
      inline def setStatus(value: SimStatusUpdate): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  @js.native
  trait SimListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): SimContext = js.native
    
    /**
      * create a SimInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: SimListInstanceCreateOptions): js.Promise[SimInstance] = js.native
    def create(
      opts: SimListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ SimInstance, Any]
    ): js.Promise[SimInstance] = js.native
    
    /**
      * Streams SimInstance records from the API.
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
          /* item */ SimInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ SimInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: SimListInstanceEachOptions): Unit = js.native
    def each(
      opts: SimListInstanceEachOptions,
      callback: js.Function2[
          /* item */ SimInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a sim
      *
      * @param sid - The SID that identifies the resource to fetch
      */
    def get(sid: String): SimContext = js.native
    
    /**
      * Retrieve a single target page of SimInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[SimPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ SimPage, Any]): js.Promise[SimPage] = js.native
    def getPage(targetUrl: String): js.Promise[SimPage] = js.native
    def getPage(targetUrl: String, callback: js.Function2[/* error */ js.Error | Null, /* items */ SimPage, Any]): js.Promise[SimPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ SimPage, Any]): js.Promise[SimPage] = js.native
    
    /**
      * Lists SimInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[SimInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SimInstance], Any]): js.Promise[js.Array[SimInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SimInstance], Any]
    ): js.Promise[js.Array[SimInstance]] = js.native
    def list(opts: SimListInstanceOptions): js.Promise[js.Array[SimInstance]] = js.native
    def list(
      opts: SimListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SimInstance], Any]
    ): js.Promise[js.Array[SimInstance]] = js.native
    
    /**
      * Retrieve a single page of SimInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[SimPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ SimPage, Any]): js.Promise[SimPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ SimPage, Any]): js.Promise[SimPage] = js.native
    def page(opts: SimListInstancePageOptions): js.Promise[SimPage] = js.native
    def page(
      opts: SimListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SimPage, Any]
    ): js.Promise[SimPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property iccid - The {@link https://en.wikipedia.org/wiki/Subscriber_identity_module#ICCID|ICCID} of the Super SIM to be added to your Account
    * @property registrationCode - The 10-digit code required to claim the Super SIM for your Account
    */
  trait SimListInstanceCreateOptions extends StObject {
    
    var iccid: String
    
    var registrationCode: String
  }
  object SimListInstanceCreateOptions {
    
    inline def apply(iccid: String, registrationCode: String): SimListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(iccid = iccid.asInstanceOf[js.Any], registrationCode = registrationCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimListInstanceCreateOptions]
    }
    
    extension [Self <: SimListInstanceCreateOptions](x: Self) {
      
      inline def setIccid(value: String): Self = StObject.set(x, "iccid", value.asInstanceOf[js.Any])
      
      inline def setRegistrationCode(value: String): Self = StObject.set(x, "registrationCode", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
    * @property fleet - The SID or unique name of the Fleet to which a list of Sims are assigned
    * @property iccid - The ICCID associated with a Super SIM to filter the list by
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
    * @property status - The status of the Sim resources to read
    */
  trait SimListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ SimInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var fleet: js.UndefOr[String] = js.undefined
    
    var iccid: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[SimStatus] = js.undefined
  }
  object SimListInstanceEachOptions {
    
    inline def apply(): SimListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimListInstanceEachOptions]
    }
    
    extension [Self <: SimListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ SimInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setFleet(value: String): Self = StObject.set(x, "fleet", value.asInstanceOf[js.Any])
      
      inline def setFleetUndefined: Self = StObject.set(x, "fleet", js.undefined)
      
      inline def setIccid(value: String): Self = StObject.set(x, "iccid", value.asInstanceOf[js.Any])
      
      inline def setIccidUndefined: Self = StObject.set(x, "iccid", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setStatus(value: SimStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property fleet - The SID or unique name of the Fleet to which a list of Sims are assigned
    * @property iccid - The ICCID associated with a Super SIM to filter the list by
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
    * @property status - The status of the Sim resources to read
    */
  trait SimListInstanceOptions extends StObject {
    
    var fleet: js.UndefOr[String] = js.undefined
    
    var iccid: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[SimStatus] = js.undefined
  }
  object SimListInstanceOptions {
    
    inline def apply(): SimListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimListInstanceOptions]
    }
    
    extension [Self <: SimListInstanceOptions](x: Self) {
      
      inline def setFleet(value: String): Self = StObject.set(x, "fleet", value.asInstanceOf[js.Any])
      
      inline def setFleetUndefined: Self = StObject.set(x, "fleet", js.undefined)
      
      inline def setIccid(value: String): Self = StObject.set(x, "iccid", value.asInstanceOf[js.Any])
      
      inline def setIccidUndefined: Self = StObject.set(x, "iccid", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setStatus(value: SimStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property fleet - The SID or unique name of the Fleet to which a list of Sims are assigned
    * @property iccid - The ICCID associated with a Super SIM to filter the list by
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property status - The status of the Sim resources to read
    */
  trait SimListInstancePageOptions extends StObject {
    
    var fleet: js.UndefOr[String] = js.undefined
    
    var iccid: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[SimStatus] = js.undefined
  }
  object SimListInstancePageOptions {
    
    inline def apply(): SimListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimListInstancePageOptions]
    }
    
    extension [Self <: SimListInstancePageOptions](x: Self) {
      
      inline def setFleet(value: String): Self = StObject.set(x, "fleet", value.asInstanceOf[js.Any])
      
      inline def setFleetUndefined: Self = StObject.set(x, "fleet", js.undefined)
      
      inline def setIccid(value: String): Self = StObject.set(x, "iccid", value.asInstanceOf[js.Any])
      
      inline def setIccidUndefined: Self = StObject.set(x, "iccid", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setStatus(value: SimStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  trait SimPayload
    extends StObject
       with SimResource
       with TwilioResponsePayload
  object SimPayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      fleet_sid: String,
      iccid: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      status: SimStatus,
      unique_name: String,
      uri: String,
      url: String
    ): SimPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], fleet_sid = fleet_sid.asInstanceOf[js.Any], iccid = iccid.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimPayload]
    }
  }
  
  trait SimResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var fleet_sid: String
    
    var iccid: String
    
    var links: String
    
    var sid: String
    
    var status: SimStatus
    
    var unique_name: String
    
    var url: String
  }
  object SimResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      fleet_sid: String,
      iccid: String,
      links: String,
      sid: String,
      status: SimStatus,
      unique_name: String,
      url: String
    ): SimResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], fleet_sid = fleet_sid.asInstanceOf[js.Any], iccid = iccid.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimResource]
    }
    
    extension [Self <: SimResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFleet_sid(value: String): Self = StObject.set(x, "fleet_sid", value.asInstanceOf[js.Any])
      
      inline def setIccid(value: String): Self = StObject.set(x, "iccid", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: SimStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait SimSolution extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.`new`
    - typings.twilio.twilioStrings.ready
    - typings.twilio.twilioStrings.active_
    - typings.twilio.twilioStrings.inactive_
    - typings.twilio.twilioStrings.scheduled
  */
  trait SimStatus extends StObject
  object SimStatus {
    
    inline def active: active_ = "active".asInstanceOf[active_]
    
    inline def inactive: inactive_ = "inactive".asInstanceOf[inactive_]
    
    inline def `new`: typings.twilio.twilioStrings.`new` = "new".asInstanceOf[typings.twilio.twilioStrings.`new`]
    
    inline def ready: typings.twilio.twilioStrings.ready = "ready".asInstanceOf[typings.twilio.twilioStrings.ready]
    
    inline def scheduled: typings.twilio.twilioStrings.scheduled = "scheduled".asInstanceOf[typings.twilio.twilioStrings.scheduled]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.ready
    - typings.twilio.twilioStrings.active_
    - typings.twilio.twilioStrings.inactive_
  */
  trait SimStatusUpdate extends StObject
  object SimStatusUpdate {
    
    inline def active: active_ = "active".asInstanceOf[active_]
    
    inline def inactive: inactive_ = "inactive".asInstanceOf[inactive_]
    
    inline def ready: typings.twilio.twilioStrings.ready = "ready".asInstanceOf[typings.twilio.twilioStrings.ready]
  }
}
