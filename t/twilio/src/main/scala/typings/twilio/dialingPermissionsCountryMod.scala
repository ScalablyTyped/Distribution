package typings.twilio

import typings.twilio.highriskSpecialPrefixMod.HighriskSpecialPrefixListInstance
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialingPermissionsCountryMod {
  
  @JSImport("twilio/lib/rest/voice/v1/dialingPermissions/country", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/voice/v1/dialingPermissions/country", "CountryContext")
  @js.native
  open class CountryContext protected () extends StObject {
    /**
      * Initialize the CountryContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param isoCode - The ISO country code
      */
    def this(version: typings.twilio.voiceV1Mod.^, isoCode: String) = this()
    
    /**
      * fetch a CountryInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[CountryInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ CountryInstance, Any]): js.Promise[CountryInstance] = js.native
    
    var highriskSpecialPrefixes: HighriskSpecialPrefixListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/voice/v1/dialingPermissions/country", "CountryInstance")
  @js.native
  open class CountryInstance protected () extends SerializableClass {
    /**
      * Initialize the CountryContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param isoCode - The ISO country code
      */
    def this(version: typings.twilio.voiceV1Mod.^, payload: CountryPayload, isoCode: String) = this()
    
    /* private */ var _proxy: CountryContext = js.native
    
    var continent: String = js.native
    
    var countryCodes: js.Array[String] = js.native
    
    /**
      * fetch a CountryInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[CountryInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[CountryInstance] = js.native
    
    var highRiskSpecialNumbersEnabled: Boolean = js.native
    
    var highRiskTollfraudNumbersEnabled: Boolean = js.native
    
    /**
      * Access the highriskSpecialPrefixes
      */
    def highriskSpecialPrefixes(): HighriskSpecialPrefixListInstance = js.native
    
    var isoCode: String = js.native
    
    var links: String = js.native
    
    var lowRiskNumbersEnabled: Boolean = js.native
    
    var name: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the CountryList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    */
  inline def CountryList(version: typings.twilio.voiceV1Mod.^): CountryListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("CountryList")(version.asInstanceOf[js.Any]).asInstanceOf[CountryListInstance]
  
  @JSImport("twilio/lib/rest/voice/v1/dialingPermissions/country", "CountryPage")
  @js.native
  open class CountryPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.voiceV1Mod.^, CountryPayload, CountryResource, CountryInstance] {
    /**
      * Initialize the CountryPage
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.voiceV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: CountrySolution
    ) = this()
    
    /**
      * Build an instance of CountryInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: CountryPayload): CountryInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait CountryListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): CountryContext = js.native
    
    /**
      * Streams CountryInstance records from the API.
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
          /* item */ CountryInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ CountryInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: CountryListInstanceEachOptions): Unit = js.native
    def each(
      opts: CountryListInstanceEachOptions,
      callback: js.Function2[
          /* item */ CountryInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a country
      *
      * @param isoCode - The ISO country code
      */
    def get(isoCode: String): CountryContext = js.native
    
    /**
      * Retrieve a single target page of CountryInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[CountryPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ CountryPage, Any]): js.Promise[CountryPage] = js.native
    def getPage(targetUrl: String): js.Promise[CountryPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CountryPage, Any]
    ): js.Promise[CountryPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ CountryPage, Any]): js.Promise[CountryPage] = js.native
    
    /**
      * Lists CountryInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[CountryInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[CountryInstance], Any]): js.Promise[js.Array[CountryInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[CountryInstance], Any]
    ): js.Promise[js.Array[CountryInstance]] = js.native
    def list(opts: CountryListInstanceOptions): js.Promise[js.Array[CountryInstance]] = js.native
    def list(
      opts: CountryListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[CountryInstance], Any]
    ): js.Promise[js.Array[CountryInstance]] = js.native
    
    /**
      * Retrieve a single page of CountryInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[CountryPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ CountryPage, Any]): js.Promise[CountryPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ CountryPage, Any]): js.Promise[CountryPage] = js.native
    def page(opts: CountryListInstancePageOptions): js.Promise[CountryPage] = js.native
    def page(
      opts: CountryListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CountryPage, Any]
    ): js.Promise[CountryPage] = js.native
    
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
    * @property continent - Filter to retrieve the country permissions by specifying the continent
    * @property countryCode - Country code filter
    * @property done - Function to be called upon completion of streaming
    * @property highRiskSpecialNumbersEnabled - Filter to retrieve the country permissions with dialing to high-risk special service numbers enabled
    * @property highRiskTollfraudNumbersEnabled - Filter to retrieve the country permissions with dialing to high-risk toll fraud numbers enabled
    * @property isoCode - Filter to retrieve the country permissions by specifying the ISO country code
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         each() guarantees never to return more than limit.
    *                         Default is no limit
    * @property lowRiskNumbersEnabled - Filter to retrieve the country permissions with dialing to low-risk numbers enabled
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no pageSize is defined but a limit is defined,
    *                         each() will attempt to read the limit with the most efficient
    *                         page size, i.e. min(limit, 1000)
    */
  trait CountryListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ CountryInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var continent: js.UndefOr[String] = js.undefined
    
    var countryCode: js.UndefOr[String] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var highRiskSpecialNumbersEnabled: js.UndefOr[Boolean] = js.undefined
    
    var highRiskTollfraudNumbersEnabled: js.UndefOr[Boolean] = js.undefined
    
    var isoCode: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var lowRiskNumbersEnabled: js.UndefOr[Boolean] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object CountryListInstanceEachOptions {
    
    inline def apply(): CountryListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CountryListInstanceEachOptions]
    }
    
    extension [Self <: CountryListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ CountryInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setContinent(value: String): Self = StObject.set(x, "continent", value.asInstanceOf[js.Any])
      
      inline def setContinentUndefined: Self = StObject.set(x, "continent", js.undefined)
      
      inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
      
      inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setHighRiskSpecialNumbersEnabled(value: Boolean): Self = StObject.set(x, "highRiskSpecialNumbersEnabled", value.asInstanceOf[js.Any])
      
      inline def setHighRiskSpecialNumbersEnabledUndefined: Self = StObject.set(x, "highRiskSpecialNumbersEnabled", js.undefined)
      
      inline def setHighRiskTollfraudNumbersEnabled(value: Boolean): Self = StObject.set(x, "highRiskTollfraudNumbersEnabled", value.asInstanceOf[js.Any])
      
      inline def setHighRiskTollfraudNumbersEnabledUndefined: Self = StObject.set(x, "highRiskTollfraudNumbersEnabled", js.undefined)
      
      inline def setIsoCode(value: String): Self = StObject.set(x, "isoCode", value.asInstanceOf[js.Any])
      
      inline def setIsoCodeUndefined: Self = StObject.set(x, "isoCode", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setLowRiskNumbersEnabled(value: Boolean): Self = StObject.set(x, "lowRiskNumbersEnabled", value.asInstanceOf[js.Any])
      
      inline def setLowRiskNumbersEnabledUndefined: Self = StObject.set(x, "lowRiskNumbersEnabled", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property continent - Filter to retrieve the country permissions by specifying the continent
    * @property countryCode - Country code filter
    * @property highRiskSpecialNumbersEnabled - Filter to retrieve the country permissions with dialing to high-risk special service numbers enabled
    * @property highRiskTollfraudNumbersEnabled - Filter to retrieve the country permissions with dialing to high-risk toll fraud numbers enabled
    * @property isoCode - Filter to retrieve the country permissions by specifying the ISO country code
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         list() guarantees never to return more than limit.
    *                         Default is no limit
    * @property lowRiskNumbersEnabled - Filter to retrieve the country permissions with dialing to low-risk numbers enabled
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no page_size is defined but a limit is defined,
    *                         list() will attempt to read the limit with the most
    *                         efficient page size, i.e. min(limit, 1000)
    */
  trait CountryListInstanceOptions extends StObject {
    
    var continent: js.UndefOr[String] = js.undefined
    
    var countryCode: js.UndefOr[String] = js.undefined
    
    var highRiskSpecialNumbersEnabled: js.UndefOr[Boolean] = js.undefined
    
    var highRiskTollfraudNumbersEnabled: js.UndefOr[Boolean] = js.undefined
    
    var isoCode: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var lowRiskNumbersEnabled: js.UndefOr[Boolean] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object CountryListInstanceOptions {
    
    inline def apply(): CountryListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CountryListInstanceOptions]
    }
    
    extension [Self <: CountryListInstanceOptions](x: Self) {
      
      inline def setContinent(value: String): Self = StObject.set(x, "continent", value.asInstanceOf[js.Any])
      
      inline def setContinentUndefined: Self = StObject.set(x, "continent", js.undefined)
      
      inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
      
      inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
      
      inline def setHighRiskSpecialNumbersEnabled(value: Boolean): Self = StObject.set(x, "highRiskSpecialNumbersEnabled", value.asInstanceOf[js.Any])
      
      inline def setHighRiskSpecialNumbersEnabledUndefined: Self = StObject.set(x, "highRiskSpecialNumbersEnabled", js.undefined)
      
      inline def setHighRiskTollfraudNumbersEnabled(value: Boolean): Self = StObject.set(x, "highRiskTollfraudNumbersEnabled", value.asInstanceOf[js.Any])
      
      inline def setHighRiskTollfraudNumbersEnabledUndefined: Self = StObject.set(x, "highRiskTollfraudNumbersEnabled", js.undefined)
      
      inline def setIsoCode(value: String): Self = StObject.set(x, "isoCode", value.asInstanceOf[js.Any])
      
      inline def setIsoCodeUndefined: Self = StObject.set(x, "isoCode", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setLowRiskNumbersEnabled(value: Boolean): Self = StObject.set(x, "lowRiskNumbersEnabled", value.asInstanceOf[js.Any])
      
      inline def setLowRiskNumbersEnabledUndefined: Self = StObject.set(x, "lowRiskNumbersEnabled", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property continent - Filter to retrieve the country permissions by specifying the continent
    * @property countryCode - Country code filter
    * @property highRiskSpecialNumbersEnabled - Filter to retrieve the country permissions with dialing to high-risk special service numbers enabled
    * @property highRiskTollfraudNumbersEnabled - Filter to retrieve the country permissions with dialing to high-risk toll fraud numbers enabled
    * @property isoCode - Filter to retrieve the country permissions by specifying the ISO country code
    * @property lowRiskNumbersEnabled - Filter to retrieve the country permissions with dialing to low-risk numbers enabled
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait CountryListInstancePageOptions extends StObject {
    
    var continent: js.UndefOr[String] = js.undefined
    
    var countryCode: js.UndefOr[String] = js.undefined
    
    var highRiskSpecialNumbersEnabled: js.UndefOr[Boolean] = js.undefined
    
    var highRiskTollfraudNumbersEnabled: js.UndefOr[Boolean] = js.undefined
    
    var isoCode: js.UndefOr[String] = js.undefined
    
    var lowRiskNumbersEnabled: js.UndefOr[Boolean] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object CountryListInstancePageOptions {
    
    inline def apply(): CountryListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CountryListInstancePageOptions]
    }
    
    extension [Self <: CountryListInstancePageOptions](x: Self) {
      
      inline def setContinent(value: String): Self = StObject.set(x, "continent", value.asInstanceOf[js.Any])
      
      inline def setContinentUndefined: Self = StObject.set(x, "continent", js.undefined)
      
      inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
      
      inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
      
      inline def setHighRiskSpecialNumbersEnabled(value: Boolean): Self = StObject.set(x, "highRiskSpecialNumbersEnabled", value.asInstanceOf[js.Any])
      
      inline def setHighRiskSpecialNumbersEnabledUndefined: Self = StObject.set(x, "highRiskSpecialNumbersEnabled", js.undefined)
      
      inline def setHighRiskTollfraudNumbersEnabled(value: Boolean): Self = StObject.set(x, "highRiskTollfraudNumbersEnabled", value.asInstanceOf[js.Any])
      
      inline def setHighRiskTollfraudNumbersEnabledUndefined: Self = StObject.set(x, "highRiskTollfraudNumbersEnabled", js.undefined)
      
      inline def setIsoCode(value: String): Self = StObject.set(x, "isoCode", value.asInstanceOf[js.Any])
      
      inline def setIsoCodeUndefined: Self = StObject.set(x, "isoCode", js.undefined)
      
      inline def setLowRiskNumbersEnabled(value: Boolean): Self = StObject.set(x, "lowRiskNumbersEnabled", value.asInstanceOf[js.Any])
      
      inline def setLowRiskNumbersEnabledUndefined: Self = StObject.set(x, "lowRiskNumbersEnabled", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait CountryPayload
    extends StObject
       with CountryResource
       with TwilioResponsePayload
  object CountryPayload {
    
    inline def apply(
      continent: String,
      country_codes: js.Array[String],
      first_page_uri: String,
      high_risk_special_numbers_enabled: Boolean,
      high_risk_tollfraud_numbers_enabled: Boolean,
      iso_code: String,
      links: String,
      low_risk_numbers_enabled: Boolean,
      name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String,
      url: String
    ): CountryPayload = {
      val __obj = js.Dynamic.literal(continent = continent.asInstanceOf[js.Any], country_codes = country_codes.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], high_risk_special_numbers_enabled = high_risk_special_numbers_enabled.asInstanceOf[js.Any], high_risk_tollfraud_numbers_enabled = high_risk_tollfraud_numbers_enabled.asInstanceOf[js.Any], iso_code = iso_code.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], low_risk_numbers_enabled = low_risk_numbers_enabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CountryPayload]
    }
  }
  
  trait CountryResource extends StObject {
    
    var continent: String
    
    var country_codes: js.Array[String]
    
    var high_risk_special_numbers_enabled: Boolean
    
    var high_risk_tollfraud_numbers_enabled: Boolean
    
    var iso_code: String
    
    var links: String
    
    var low_risk_numbers_enabled: Boolean
    
    var name: String
    
    var url: String
  }
  object CountryResource {
    
    inline def apply(
      continent: String,
      country_codes: js.Array[String],
      high_risk_special_numbers_enabled: Boolean,
      high_risk_tollfraud_numbers_enabled: Boolean,
      iso_code: String,
      links: String,
      low_risk_numbers_enabled: Boolean,
      name: String,
      url: String
    ): CountryResource = {
      val __obj = js.Dynamic.literal(continent = continent.asInstanceOf[js.Any], country_codes = country_codes.asInstanceOf[js.Any], high_risk_special_numbers_enabled = high_risk_special_numbers_enabled.asInstanceOf[js.Any], high_risk_tollfraud_numbers_enabled = high_risk_tollfraud_numbers_enabled.asInstanceOf[js.Any], iso_code = iso_code.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], low_risk_numbers_enabled = low_risk_numbers_enabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CountryResource]
    }
    
    extension [Self <: CountryResource](x: Self) {
      
      inline def setContinent(value: String): Self = StObject.set(x, "continent", value.asInstanceOf[js.Any])
      
      inline def setCountry_codes(value: js.Array[String]): Self = StObject.set(x, "country_codes", value.asInstanceOf[js.Any])
      
      inline def setCountry_codesVarargs(value: String*): Self = StObject.set(x, "country_codes", js.Array(value*))
      
      inline def setHigh_risk_special_numbers_enabled(value: Boolean): Self = StObject.set(x, "high_risk_special_numbers_enabled", value.asInstanceOf[js.Any])
      
      inline def setHigh_risk_tollfraud_numbers_enabled(value: Boolean): Self = StObject.set(x, "high_risk_tollfraud_numbers_enabled", value.asInstanceOf[js.Any])
      
      inline def setIso_code(value: String): Self = StObject.set(x, "iso_code", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLow_risk_numbers_enabled(value: Boolean): Self = StObject.set(x, "low_risk_numbers_enabled", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait CountrySolution extends StObject
}
