package typings.twilio

import typings.twilio.anon.Key
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.localMod.LocalListInstance
import typings.twilio.machineToMachineMod.MachineToMachineListInstance
import typings.twilio.mobileMod.MobileListInstance
import typings.twilio.nationalMod.NationalListInstance
import typings.twilio.sharedCostMod.SharedCostListInstance
import typings.twilio.tollFreeMod.TollFreeListInstance
import typings.twilio.voipMod.VoipListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object availablePhoneNumberMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/availablePhoneNumber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/availablePhoneNumber", "AvailablePhoneNumberCountryContext")
  @js.native
  open class AvailablePhoneNumberCountryContext protected () extends StObject {
    /**
      * Initialize the AvailablePhoneNumberCountryContext
      *
      * @param version - Version of the resource
      * @param accountSid - The SID of the Account requesting the available phone number Country resource
      * @param countryCode - The ISO country code of the country to fetch available phone number information about
      */
    def this(version: typings.twilio.v2010Mod.^, accountSid: String, countryCode: String) = this()
    
    /**
      * fetch a AvailablePhoneNumberCountryInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AvailablePhoneNumberCountryInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AvailablePhoneNumberCountryInstance, Any]
    ): js.Promise[AvailablePhoneNumberCountryInstance] = js.native
    
    var local: LocalListInstance = js.native
    
    var machineToMachine: MachineToMachineListInstance = js.native
    
    var mobile: MobileListInstance = js.native
    
    var national: NationalListInstance = js.native
    
    var sharedCost: SharedCostListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    var tollFree: TollFreeListInstance = js.native
    
    var voip: VoipListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/api/v2010/account/availablePhoneNumber", "AvailablePhoneNumberCountryInstance")
  @js.native
  open class AvailablePhoneNumberCountryInstance protected () extends SerializableClass {
    /**
      * Initialize the AvailablePhoneNumberCountryContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - A 34 character string that uniquely identifies this resource.
      * @param countryCode - The ISO country code of the country to fetch available phone number information about
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      payload: AvailablePhoneNumberCountryPayload,
      accountSid: String,
      countryCode: String
    ) = this()
    
    /* private */ var _proxy: AvailablePhoneNumberCountryContext = js.native
    
    var beta: Boolean = js.native
    
    var country: String = js.native
    
    var countryCode: String = js.native
    
    /**
      * fetch a AvailablePhoneNumberCountryInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AvailablePhoneNumberCountryInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AvailablePhoneNumberCountryInstance] = js.native
    
    /**
      * Access the local
      */
    def local(): LocalListInstance = js.native
    
    /**
      * Access the machineToMachine
      */
    def machineToMachine(): MachineToMachineListInstance = js.native
    
    /**
      * Access the mobile
      */
    def mobile(): MobileListInstance = js.native
    
    /**
      * Access the national
      */
    def national(): NationalListInstance = js.native
    
    /**
      * Access the sharedCost
      */
    def sharedCost(): SharedCostListInstance = js.native
    
    var subresourceUris: String = js.native
    
    /**
      * Access the tollFree
      */
    def tollFree(): TollFreeListInstance = js.native
    
    var uri: String = js.native
    
    /**
      * Access the voip
      */
    def voip(): VoipListInstance = js.native
  }
  
  /**
    * Initialize the AvailablePhoneNumberCountryList
    *
    * @param version - Version of the resource
    * @param accountSid - A 34 character string that uniquely identifies this resource.
    */
  inline def AvailablePhoneNumberCountryList(version: typings.twilio.v2010Mod.^, accountSid: String): AvailablePhoneNumberCountryListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("AvailablePhoneNumberCountryList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any])).asInstanceOf[AvailablePhoneNumberCountryListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/availablePhoneNumber", "AvailablePhoneNumberCountryPage")
  @js.native
  open class AvailablePhoneNumberCountryPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.v2010Mod.^, 
          AvailablePhoneNumberCountryPayload, 
          AvailablePhoneNumberCountryResource, 
          AvailablePhoneNumberCountryInstance
        ] {
    /**
      * Initialize the AvailablePhoneNumberCountryPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: AvailablePhoneNumberCountrySolution
    ) = this()
    
    /**
      * Build an instance of AvailablePhoneNumberCountryInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: AvailablePhoneNumberCountryPayload): AvailablePhoneNumberCountryInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait AvailablePhoneNumberCountryListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): AvailablePhoneNumberCountryContext = js.native
    
    /**
      * Streams AvailablePhoneNumberCountryInstance records from the API.
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
          /* item */ AvailablePhoneNumberCountryInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ AvailablePhoneNumberCountryInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: AvailablePhoneNumberCountryListInstanceEachOptions): Unit = js.native
    def each(
      opts: AvailablePhoneNumberCountryListInstanceEachOptions,
      callback: js.Function2[
          /* item */ AvailablePhoneNumberCountryInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a available_phone_number_country
      *
      * @param countryCode - The ISO country code of the country to fetch available phone number information about
      */
    def get(countryCode: String): AvailablePhoneNumberCountryContext = js.native
    
    /**
      * Retrieve a single target page of AvailablePhoneNumberCountryInstance records
      * from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[AvailablePhoneNumberCountryPage] = js.native
    def getPage(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AvailablePhoneNumberCountryPage, Any]
    ): js.Promise[AvailablePhoneNumberCountryPage] = js.native
    def getPage(targetUrl: String): js.Promise[AvailablePhoneNumberCountryPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AvailablePhoneNumberCountryPage, Any]
    ): js.Promise[AvailablePhoneNumberCountryPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AvailablePhoneNumberCountryPage, Any]
    ): js.Promise[AvailablePhoneNumberCountryPage] = js.native
    
    /**
      * Lists AvailablePhoneNumberCountryInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[AvailablePhoneNumberCountryInstance]] = js.native
    def list(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[AvailablePhoneNumberCountryInstance], 
          Any
        ]
    ): js.Promise[js.Array[AvailablePhoneNumberCountryInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[AvailablePhoneNumberCountryInstance], 
          Any
        ]
    ): js.Promise[js.Array[AvailablePhoneNumberCountryInstance]] = js.native
    def list(opts: AvailablePhoneNumberCountryListInstanceOptions): js.Promise[js.Array[AvailablePhoneNumberCountryInstance]] = js.native
    def list(
      opts: AvailablePhoneNumberCountryListInstanceOptions,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[AvailablePhoneNumberCountryInstance], 
          Any
        ]
    ): js.Promise[js.Array[AvailablePhoneNumberCountryInstance]] = js.native
    
    /**
      * Retrieve a single page of AvailablePhoneNumberCountryInstance records from the
      * API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[AvailablePhoneNumberCountryPage] = js.native
    def page(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AvailablePhoneNumberCountryPage, Any]
    ): js.Promise[AvailablePhoneNumberCountryPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AvailablePhoneNumberCountryPage, Any]
    ): js.Promise[AvailablePhoneNumberCountryPage] = js.native
    def page(opts: AvailablePhoneNumberCountryListInstancePageOptions): js.Promise[AvailablePhoneNumberCountryPage] = js.native
    def page(
      opts: AvailablePhoneNumberCountryListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AvailablePhoneNumberCountryPage, Any]
    ): js.Promise[AvailablePhoneNumberCountryPage] = js.native
    
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
  trait AvailablePhoneNumberCountryListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ AvailablePhoneNumberCountryInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object AvailablePhoneNumberCountryListInstanceEachOptions {
    
    inline def apply(): AvailablePhoneNumberCountryListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvailablePhoneNumberCountryListInstanceEachOptions]
    }
    
    extension [Self <: AvailablePhoneNumberCountryListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ AvailablePhoneNumberCountryInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait AvailablePhoneNumberCountryListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object AvailablePhoneNumberCountryListInstanceOptions {
    
    inline def apply(): AvailablePhoneNumberCountryListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvailablePhoneNumberCountryListInstanceOptions]
    }
    
    extension [Self <: AvailablePhoneNumberCountryListInstanceOptions](x: Self) {
      
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
  trait AvailablePhoneNumberCountryListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object AvailablePhoneNumberCountryListInstancePageOptions {
    
    inline def apply(): AvailablePhoneNumberCountryListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvailablePhoneNumberCountryListInstancePageOptions]
    }
    
    extension [Self <: AvailablePhoneNumberCountryListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.twilio.pageMod.TwilioResponsePayload because var conflicts: uri. Inlined first_page_uri, next_page_uri, page, page_size, previous_page_uri, meta */ trait AvailablePhoneNumberCountryPayload
    extends StObject
       with AvailablePhoneNumberCountryResource {
    
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
  object AvailablePhoneNumberCountryPayload {
    
    inline def apply(
      beta: Boolean,
      country: String,
      country_code: String,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      subresource_uris: String,
      uri: String
    ): AvailablePhoneNumberCountryPayload = {
      val __obj = js.Dynamic.literal(beta = beta.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], country_code = country_code.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], subresource_uris = subresource_uris.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvailablePhoneNumberCountryPayload]
    }
    
    extension [Self <: AvailablePhoneNumberCountryPayload](x: Self) {
      
      inline def setFirst_page_uri(value: String): Self = StObject.set(x, "first_page_uri", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Key): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setNext_page_uri(value: String): Self = StObject.set(x, "next_page_uri", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      inline def setPrevious_page_uri(value: String): Self = StObject.set(x, "previous_page_uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait AvailablePhoneNumberCountryResource extends StObject {
    
    var beta: Boolean
    
    var country: String
    
    var country_code: String
    
    var subresource_uris: String
    
    var uri: String
  }
  object AvailablePhoneNumberCountryResource {
    
    inline def apply(beta: Boolean, country: String, country_code: String, subresource_uris: String, uri: String): AvailablePhoneNumberCountryResource = {
      val __obj = js.Dynamic.literal(beta = beta.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], country_code = country_code.asInstanceOf[js.Any], subresource_uris = subresource_uris.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvailablePhoneNumberCountryResource]
    }
    
    extension [Self <: AvailablePhoneNumberCountryResource](x: Self) {
      
      inline def setBeta(value: Boolean): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
      
      inline def setSubresource_uris(value: String): Self = StObject.set(x, "subresource_uris", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait AvailablePhoneNumberCountrySolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
  }
  object AvailablePhoneNumberCountrySolution {
    
    inline def apply(): AvailablePhoneNumberCountrySolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvailablePhoneNumberCountrySolution]
    }
    
    extension [Self <: AvailablePhoneNumberCountrySolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
    }
  }
}
