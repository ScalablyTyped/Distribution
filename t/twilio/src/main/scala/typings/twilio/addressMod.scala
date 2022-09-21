package typings.twilio

import typings.twilio.anon.Key
import typings.twilio.dependentPhoneNumberMod.DependentPhoneNumberListInstance
import typings.twilio.interfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addressMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/address", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/address", "AddressContext")
  @js.native
  open class AddressContext protected () extends StObject {
    /**
      * Initialize the AddressContext
      *
      * @param version - Version of the resource
      * @param accountSid - The SID of the Account that is responsible for this address
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.v2010Mod.^, accountSid: String, sid: String) = this()
    
    var dependentPhoneNumbers: DependentPhoneNumberListInstance = js.native
    
    /**
      * fetch a AddressInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AddressInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ AddressInstance, Any]): js.Promise[AddressInstance] = js.native
    
    /**
      * remove a AddressInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ AddressInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a AddressInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[AddressInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ AddressInstance, Any]): js.Promise[AddressInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ AddressInstance, Any]): js.Promise[AddressInstance] = js.native
    def update(opts: AddressInstanceUpdateOptions): js.Promise[AddressInstance] = js.native
    def update(
      opts: AddressInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AddressInstance, Any]
    ): js.Promise[AddressInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/api/v2010/account/address", "AddressInstance")
  @js.native
  open class AddressInstance protected () extends SerializableClass {
    /**
      * Initialize the AddressContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - The SID of the Account that is responsible for the resource
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.v2010Mod.^, payload: AddressPayload, accountSid: String, sid: String) = this()
    
    /* private */ var _proxy: AddressContext = js.native
    
    var accountSid: String = js.native
    
    var city: String = js.native
    
    var customerName: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * Access the dependentPhoneNumbers
      */
    def dependentPhoneNumbers(): DependentPhoneNumberListInstance = js.native
    
    var emergencyEnabled: Boolean = js.native
    
    /**
      * fetch a AddressInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AddressInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AddressInstance] = js.native
    
    var friendlyName: String = js.native
    
    var isoCountry: String = js.native
    
    var postalCode: String = js.native
    
    var region: String = js.native
    
    /**
      * remove a AddressInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var street: String = js.native
    
    /**
      * update a AddressInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[AddressInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AddressInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AddressInstance] = js.native
    def update(opts: AddressInstanceUpdateOptions): js.Promise[AddressInstance] = js.native
    def update(
      opts: AddressInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[AddressInstance] = js.native
    
    var uri: String = js.native
    
    var validated: Boolean = js.native
    
    var verified: Boolean = js.native
  }
  
  /**
    * Initialize the AddressList
    *
    * @param version - Version of the resource
    * @param accountSid - The SID of the Account that is responsible for the resource
    */
  inline def AddressList(version: typings.twilio.v2010Mod.^, accountSid: String): AddressListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("AddressList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any])).asInstanceOf[AddressListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/address", "AddressPage")
  @js.native
  open class AddressPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.v2010Mod.^, AddressPayload, AddressResource, AddressInstance] {
    /**
      * Initialize the AddressPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: AddressSolution
    ) = this()
    
    /**
      * Build an instance of AddressInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: AddressPayload): AddressInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property autoCorrectAddress - Whether we should automatically correct the address
    * @property city - The city of the address
    * @property customerName - The name to associate with the address
    * @property emergencyEnabled - Whether to enable emergency calling on the address
    * @property friendlyName - A string to describe the resource
    * @property postalCode - The postal code of the address
    * @property region - The state or region of the address
    * @property street - The number and street address of the address
    */
  trait AddressInstanceUpdateOptions extends StObject {
    
    var autoCorrectAddress: js.UndefOr[Boolean] = js.undefined
    
    var city: js.UndefOr[String] = js.undefined
    
    var customerName: js.UndefOr[String] = js.undefined
    
    var emergencyEnabled: js.UndefOr[Boolean] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var postalCode: js.UndefOr[String] = js.undefined
    
    var region: js.UndefOr[String] = js.undefined
    
    var street: js.UndefOr[String] = js.undefined
  }
  object AddressInstanceUpdateOptions {
    
    inline def apply(): AddressInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddressInstanceUpdateOptions]
    }
    
    extension [Self <: AddressInstanceUpdateOptions](x: Self) {
      
      inline def setAutoCorrectAddress(value: Boolean): Self = StObject.set(x, "autoCorrectAddress", value.asInstanceOf[js.Any])
      
      inline def setAutoCorrectAddressUndefined: Self = StObject.set(x, "autoCorrectAddress", js.undefined)
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      inline def setCustomerName(value: String): Self = StObject.set(x, "customerName", value.asInstanceOf[js.Any])
      
      inline def setCustomerNameUndefined: Self = StObject.set(x, "customerName", js.undefined)
      
      inline def setEmergencyEnabled(value: Boolean): Self = StObject.set(x, "emergencyEnabled", value.asInstanceOf[js.Any])
      
      inline def setEmergencyEnabledUndefined: Self = StObject.set(x, "emergencyEnabled", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
      
      inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setStreet(value: String): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
      
      inline def setStreetUndefined: Self = StObject.set(x, "street", js.undefined)
    }
  }
  
  @js.native
  trait AddressListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): AddressContext = js.native
    
    /**
      * create a AddressInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: AddressListInstanceCreateOptions): js.Promise[AddressInstance] = js.native
    def create(
      opts: AddressListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ AddressInstance, Any]
    ): js.Promise[AddressInstance] = js.native
    
    /**
      * Streams AddressInstance records from the API.
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
          /* item */ AddressInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ AddressInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: AddressListInstanceEachOptions): Unit = js.native
    def each(
      opts: AddressListInstanceEachOptions,
      callback: js.Function2[
          /* item */ AddressInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a address
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): AddressContext = js.native
    
    /**
      * Retrieve a single target page of AddressInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[AddressPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ AddressPage, Any]): js.Promise[AddressPage] = js.native
    def getPage(targetUrl: String): js.Promise[AddressPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AddressPage, Any]
    ): js.Promise[AddressPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ AddressPage, Any]): js.Promise[AddressPage] = js.native
    
    /**
      * Lists AddressInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[AddressInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AddressInstance], Any]): js.Promise[js.Array[AddressInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AddressInstance], Any]
    ): js.Promise[js.Array[AddressInstance]] = js.native
    def list(opts: AddressListInstanceOptions): js.Promise[js.Array[AddressInstance]] = js.native
    def list(
      opts: AddressListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AddressInstance], Any]
    ): js.Promise[js.Array[AddressInstance]] = js.native
    
    /**
      * Retrieve a single page of AddressInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[AddressPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ AddressPage, Any]): js.Promise[AddressPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ AddressPage, Any]): js.Promise[AddressPage] = js.native
    def page(opts: AddressListInstancePageOptions): js.Promise[AddressPage] = js.native
    def page(
      opts: AddressListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AddressPage, Any]
    ): js.Promise[AddressPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property autoCorrectAddress - Whether we should automatically correct the address
    * @property city - The city of the new address
    * @property customerName - The name to associate with the new address
    * @property emergencyEnabled - Whether to enable emergency calling on the new address
    * @property friendlyName - A string to describe the new resource
    * @property isoCountry - The ISO country code of the new address
    * @property postalCode - The postal code of the new address
    * @property region - The state or region of the new address
    * @property street - The number and street address of the new address
    */
  trait AddressListInstanceCreateOptions extends StObject {
    
    var autoCorrectAddress: js.UndefOr[Boolean] = js.undefined
    
    var city: String
    
    var customerName: String
    
    var emergencyEnabled: js.UndefOr[Boolean] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var isoCountry: String
    
    var postalCode: String
    
    var region: String
    
    var street: String
  }
  object AddressListInstanceCreateOptions {
    
    inline def apply(
      city: String,
      customerName: String,
      isoCountry: String,
      postalCode: String,
      region: String,
      street: String
    ): AddressListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], customerName = customerName.asInstanceOf[js.Any], isoCountry = isoCountry.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressListInstanceCreateOptions]
    }
    
    extension [Self <: AddressListInstanceCreateOptions](x: Self) {
      
      inline def setAutoCorrectAddress(value: Boolean): Self = StObject.set(x, "autoCorrectAddress", value.asInstanceOf[js.Any])
      
      inline def setAutoCorrectAddressUndefined: Self = StObject.set(x, "autoCorrectAddress", js.undefined)
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCustomerName(value: String): Self = StObject.set(x, "customerName", value.asInstanceOf[js.Any])
      
      inline def setEmergencyEnabled(value: Boolean): Self = StObject.set(x, "emergencyEnabled", value.asInstanceOf[js.Any])
      
      inline def setEmergencyEnabledUndefined: Self = StObject.set(x, "emergencyEnabled", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setIsoCountry(value: String): Self = StObject.set(x, "isoCountry", value.asInstanceOf[js.Any])
      
      inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setStreet(value: String): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property customerName - The `customer_name` of the Address resources to read
    * @property done - Function to be called upon completion of streaming
    * @property friendlyName - The string that identifies the Address resources to read
    * @property isoCountry - The ISO country code of the Address resources to read
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
  trait AddressListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ AddressInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var customerName: js.UndefOr[String] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var isoCountry: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object AddressListInstanceEachOptions {
    
    inline def apply(): AddressListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddressListInstanceEachOptions]
    }
    
    extension [Self <: AddressListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ AddressInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setCustomerName(value: String): Self = StObject.set(x, "customerName", value.asInstanceOf[js.Any])
      
      inline def setCustomerNameUndefined: Self = StObject.set(x, "customerName", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setIsoCountry(value: String): Self = StObject.set(x, "isoCountry", value.asInstanceOf[js.Any])
      
      inline def setIsoCountryUndefined: Self = StObject.set(x, "isoCountry", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property customerName - The `customer_name` of the Address resources to read
    * @property friendlyName - The string that identifies the Address resources to read
    * @property isoCountry - The ISO country code of the Address resources to read
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
  trait AddressListInstanceOptions extends StObject {
    
    var customerName: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var isoCountry: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object AddressListInstanceOptions {
    
    inline def apply(): AddressListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddressListInstanceOptions]
    }
    
    extension [Self <: AddressListInstanceOptions](x: Self) {
      
      inline def setCustomerName(value: String): Self = StObject.set(x, "customerName", value.asInstanceOf[js.Any])
      
      inline def setCustomerNameUndefined: Self = StObject.set(x, "customerName", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setIsoCountry(value: String): Self = StObject.set(x, "isoCountry", value.asInstanceOf[js.Any])
      
      inline def setIsoCountryUndefined: Self = StObject.set(x, "isoCountry", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property customerName - The `customer_name` of the Address resources to read
    * @property friendlyName - The string that identifies the Address resources to read
    * @property isoCountry - The ISO country code of the Address resources to read
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait AddressListInstancePageOptions extends StObject {
    
    var customerName: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var isoCountry: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object AddressListInstancePageOptions {
    
    inline def apply(): AddressListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddressListInstancePageOptions]
    }
    
    extension [Self <: AddressListInstancePageOptions](x: Self) {
      
      inline def setCustomerName(value: String): Self = StObject.set(x, "customerName", value.asInstanceOf[js.Any])
      
      inline def setCustomerNameUndefined: Self = StObject.set(x, "customerName", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setIsoCountry(value: String): Self = StObject.set(x, "isoCountry", value.asInstanceOf[js.Any])
      
      inline def setIsoCountryUndefined: Self = StObject.set(x, "isoCountry", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.twilio.pageMod.TwilioResponsePayload because var conflicts: uri. Inlined first_page_uri, next_page_uri, page, page_size, previous_page_uri, meta */ trait AddressPayload
    extends StObject
       with AddressResource {
    
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
  object AddressPayload {
    
    inline def apply(
      account_sid: String,
      city: String,
      customer_name: String,
      date_created: js.Date,
      date_updated: js.Date,
      emergency_enabled: Boolean,
      first_page_uri: String,
      friendly_name: String,
      iso_country: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      postal_code: String,
      previous_page_uri: String,
      region: String,
      sid: String,
      street: String,
      uri: String,
      validated: Boolean,
      verified: Boolean
    ): AddressPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], customer_name = customer_name.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], emergency_enabled = emergency_enabled.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], iso_country = iso_country.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], postal_code = postal_code.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], validated = validated.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressPayload]
    }
    
    extension [Self <: AddressPayload](x: Self) {
      
      inline def setFirst_page_uri(value: String): Self = StObject.set(x, "first_page_uri", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Key): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setNext_page_uri(value: String): Self = StObject.set(x, "next_page_uri", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      inline def setPrevious_page_uri(value: String): Self = StObject.set(x, "previous_page_uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait AddressResource extends StObject {
    
    var account_sid: String
    
    var city: String
    
    var customer_name: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var emergency_enabled: Boolean
    
    var friendly_name: String
    
    var iso_country: String
    
    var postal_code: String
    
    var region: String
    
    var sid: String
    
    var street: String
    
    var uri: String
    
    var validated: Boolean
    
    var verified: Boolean
  }
  object AddressResource {
    
    inline def apply(
      account_sid: String,
      city: String,
      customer_name: String,
      date_created: js.Date,
      date_updated: js.Date,
      emergency_enabled: Boolean,
      friendly_name: String,
      iso_country: String,
      postal_code: String,
      region: String,
      sid: String,
      street: String,
      uri: String,
      validated: Boolean,
      verified: Boolean
    ): AddressResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], customer_name = customer_name.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], emergency_enabled = emergency_enabled.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], iso_country = iso_country.asInstanceOf[js.Any], postal_code = postal_code.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], validated = validated.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressResource]
    }
    
    extension [Self <: AddressResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCustomer_name(value: String): Self = StObject.set(x, "customer_name", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setEmergency_enabled(value: Boolean): Self = StObject.set(x, "emergency_enabled", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setIso_country(value: String): Self = StObject.set(x, "iso_country", value.asInstanceOf[js.Any])
      
      inline def setPostal_code(value: String): Self = StObject.set(x, "postal_code", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStreet(value: String): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setValidated(value: Boolean): Self = StObject.set(x, "validated", value.asInstanceOf[js.Any])
      
      inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    }
  }
  
  trait AddressSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
  }
  object AddressSolution {
    
    inline def apply(): AddressSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddressSolution]
    }
    
    extension [Self <: AddressSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
    }
  }
}
