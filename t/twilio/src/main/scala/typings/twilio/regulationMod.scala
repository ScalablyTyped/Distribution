package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object regulationMod {
  
  @JSImport("twilio/lib/rest/numbers/v2/regulatoryCompliance/regulation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/numbers/v2/regulatoryCompliance/regulation", "RegulationContext")
  @js.native
  open class RegulationContext protected () extends StObject {
    /**
      * Initialize the RegulationContext
      *
      * @param version - Version of the resource
      * @param sid - The unique string that identifies the Regulation resource
      */
    def this(version: typings.twilio.numbersV2Mod.^, sid: String) = this()
    
    /**
      * fetch a RegulationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[RegulationInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ RegulationInstance, Any]): js.Promise[RegulationInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/numbers/v2/regulatoryCompliance/regulation", "RegulationInstance")
  @js.native
  open class RegulationInstance protected () extends SerializableClass {
    /**
      * Initialize the RegulationContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The unique string that identifies the Regulation resource
      */
    def this(version: typings.twilio.numbersV2Mod.^, payload: RegulationPayload, sid: String) = this()
    
    /* private */ var _proxy: RegulationContext = js.native
    
    var endUserType: RegulationEndUserType = js.native
    
    /**
      * fetch a RegulationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[RegulationInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[RegulationInstance] = js.native
    
    var friendlyName: String = js.native
    
    var isoCountry: String = js.native
    
    var numberType: String = js.native
    
    var requirements: Any = js.native
    
    var sid: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the RegulationList
    *
    * @param version - Version of the resource
    */
  inline def RegulationList(version: typings.twilio.numbersV2Mod.^): RegulationListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("RegulationList")(version.asInstanceOf[js.Any]).asInstanceOf[RegulationListInstance]
  
  @JSImport("twilio/lib/rest/numbers/v2/regulatoryCompliance/regulation", "RegulationPage")
  @js.native
  open class RegulationPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.numbersV2Mod.^, 
          RegulationPayload, 
          RegulationResource, 
          RegulationInstance
        ] {
    /**
      * Initialize the RegulationPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.numbersV2Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: RegulationSolution
    ) = this()
    
    /**
      * Build an instance of RegulationInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: RegulationPayload): RegulationInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.individual
    - typings.twilio.twilioStrings.business
  */
  trait RegulationEndUserType extends StObject
  object RegulationEndUserType {
    
    inline def business: typings.twilio.twilioStrings.business = "business".asInstanceOf[typings.twilio.twilioStrings.business]
    
    inline def individual: typings.twilio.twilioStrings.individual = "individual".asInstanceOf[typings.twilio.twilioStrings.individual]
  }
  
  @js.native
  trait RegulationListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): RegulationContext = js.native
    
    /**
      * Streams RegulationInstance records from the API.
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
          /* item */ RegulationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ RegulationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: RegulationListInstanceEachOptions): Unit = js.native
    def each(
      opts: RegulationListInstanceEachOptions,
      callback: js.Function2[
          /* item */ RegulationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a regulation
      *
      * @param sid - The unique string that identifies the Regulation resource
      */
    def get(sid: String): RegulationContext = js.native
    
    /**
      * Retrieve a single target page of RegulationInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[RegulationPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ RegulationPage, Any]): js.Promise[RegulationPage] = js.native
    def getPage(targetUrl: String): js.Promise[RegulationPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ RegulationPage, Any]
    ): js.Promise[RegulationPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ RegulationPage, Any]
    ): js.Promise[RegulationPage] = js.native
    
    /**
      * Lists RegulationInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[RegulationInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[RegulationInstance], Any]): js.Promise[js.Array[RegulationInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[RegulationInstance], Any]
    ): js.Promise[js.Array[RegulationInstance]] = js.native
    def list(opts: RegulationListInstanceOptions): js.Promise[js.Array[RegulationInstance]] = js.native
    def list(
      opts: RegulationListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[RegulationInstance], Any]
    ): js.Promise[js.Array[RegulationInstance]] = js.native
    
    /**
      * Retrieve a single page of RegulationInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[RegulationPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ RegulationPage, Any]): js.Promise[RegulationPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ RegulationPage, Any]): js.Promise[RegulationPage] = js.native
    def page(opts: RegulationListInstancePageOptions): js.Promise[RegulationPage] = js.native
    def page(
      opts: RegulationListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ RegulationPage, Any]
    ): js.Promise[RegulationPage] = js.native
    
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
    * @property endUserType - The type of End User of the Regulation resource
    * @property isoCountry - The ISO country code of the phone number's country
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         each() guarantees never to return more than limit.
    *                         Default is no limit
    * @property numberType - The type of phone number being regulated
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no pageSize is defined but a limit is defined,
    *                         each() will attempt to read the limit with the most efficient
    *                         page size, i.e. min(limit, 1000)
    */
  trait RegulationListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ RegulationInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var endUserType: js.UndefOr[RegulationEndUserType] = js.undefined
    
    var isoCountry: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var numberType: js.UndefOr[String] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object RegulationListInstanceEachOptions {
    
    inline def apply(): RegulationListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegulationListInstanceEachOptions]
    }
    
    extension [Self <: RegulationListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ RegulationInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setEndUserType(value: RegulationEndUserType): Self = StObject.set(x, "endUserType", value.asInstanceOf[js.Any])
      
      inline def setEndUserTypeUndefined: Self = StObject.set(x, "endUserType", js.undefined)
      
      inline def setIsoCountry(value: String): Self = StObject.set(x, "isoCountry", value.asInstanceOf[js.Any])
      
      inline def setIsoCountryUndefined: Self = StObject.set(x, "isoCountry", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setNumberType(value: String): Self = StObject.set(x, "numberType", value.asInstanceOf[js.Any])
      
      inline def setNumberTypeUndefined: Self = StObject.set(x, "numberType", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property endUserType - The type of End User of the Regulation resource
    * @property isoCountry - The ISO country code of the phone number's country
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         list() guarantees never to return more than limit.
    *                         Default is no limit
    * @property numberType - The type of phone number being regulated
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no page_size is defined but a limit is defined,
    *                         list() will attempt to read the limit with the most
    *                         efficient page size, i.e. min(limit, 1000)
    */
  trait RegulationListInstanceOptions extends StObject {
    
    var endUserType: js.UndefOr[RegulationEndUserType] = js.undefined
    
    var isoCountry: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var numberType: js.UndefOr[String] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object RegulationListInstanceOptions {
    
    inline def apply(): RegulationListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegulationListInstanceOptions]
    }
    
    extension [Self <: RegulationListInstanceOptions](x: Self) {
      
      inline def setEndUserType(value: RegulationEndUserType): Self = StObject.set(x, "endUserType", value.asInstanceOf[js.Any])
      
      inline def setEndUserTypeUndefined: Self = StObject.set(x, "endUserType", js.undefined)
      
      inline def setIsoCountry(value: String): Self = StObject.set(x, "isoCountry", value.asInstanceOf[js.Any])
      
      inline def setIsoCountryUndefined: Self = StObject.set(x, "isoCountry", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setNumberType(value: String): Self = StObject.set(x, "numberType", value.asInstanceOf[js.Any])
      
      inline def setNumberTypeUndefined: Self = StObject.set(x, "numberType", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property endUserType - The type of End User of the Regulation resource
    * @property isoCountry - The ISO country code of the phone number's country
    * @property numberType - The type of phone number being regulated
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait RegulationListInstancePageOptions extends StObject {
    
    var endUserType: js.UndefOr[RegulationEndUserType] = js.undefined
    
    var isoCountry: js.UndefOr[String] = js.undefined
    
    var numberType: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object RegulationListInstancePageOptions {
    
    inline def apply(): RegulationListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegulationListInstancePageOptions]
    }
    
    extension [Self <: RegulationListInstancePageOptions](x: Self) {
      
      inline def setEndUserType(value: RegulationEndUserType): Self = StObject.set(x, "endUserType", value.asInstanceOf[js.Any])
      
      inline def setEndUserTypeUndefined: Self = StObject.set(x, "endUserType", js.undefined)
      
      inline def setIsoCountry(value: String): Self = StObject.set(x, "isoCountry", value.asInstanceOf[js.Any])
      
      inline def setIsoCountryUndefined: Self = StObject.set(x, "isoCountry", js.undefined)
      
      inline def setNumberType(value: String): Self = StObject.set(x, "numberType", value.asInstanceOf[js.Any])
      
      inline def setNumberTypeUndefined: Self = StObject.set(x, "numberType", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait RegulationPayload
    extends StObject
       with RegulationResource
       with TwilioResponsePayload
  object RegulationPayload {
    
    inline def apply(
      end_user_type: RegulationEndUserType,
      first_page_uri: String,
      friendly_name: String,
      iso_country: String,
      next_page_uri: String,
      number_type: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      requirements: js.Object,
      sid: String,
      uri: String,
      url: String
    ): RegulationPayload = {
      val __obj = js.Dynamic.literal(end_user_type = end_user_type.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], iso_country = iso_country.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], number_type = number_type.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], requirements = requirements.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegulationPayload]
    }
  }
  
  trait RegulationResource extends StObject {
    
    var end_user_type: RegulationEndUserType
    
    var friendly_name: String
    
    var iso_country: String
    
    var number_type: String
    
    var requirements: js.Object
    
    var sid: String
    
    var url: String
  }
  object RegulationResource {
    
    inline def apply(
      end_user_type: RegulationEndUserType,
      friendly_name: String,
      iso_country: String,
      number_type: String,
      requirements: js.Object,
      sid: String,
      url: String
    ): RegulationResource = {
      val __obj = js.Dynamic.literal(end_user_type = end_user_type.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], iso_country = iso_country.asInstanceOf[js.Any], number_type = number_type.asInstanceOf[js.Any], requirements = requirements.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegulationResource]
    }
    
    extension [Self <: RegulationResource](x: Self) {
      
      inline def setEnd_user_type(value: RegulationEndUserType): Self = StObject.set(x, "end_user_type", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setIso_country(value: String): Self = StObject.set(x, "iso_country", value.asInstanceOf[js.Any])
      
      inline def setNumber_type(value: String): Self = StObject.set(x, "number_type", value.asInstanceOf[js.Any])
      
      inline def setRequirements(value: js.Object): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait RegulationSolution extends StObject
}
