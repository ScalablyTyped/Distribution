package typings.twilio

import typings.twilio.interfacesMod.PhoneNumberCapabilities
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object voipMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/availablePhoneNumber/voip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/availablePhoneNumber/voip", "VoipInstance")
  @js.native
  open class VoipInstance protected () extends SerializableClass {
    /**
      * Initialize the VoipContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - The account_sid
      * @param countryCode - The ISO-3166-1 country code of the country.
      */
    def this(version: typings.twilio.v2010Mod.^, payload: VoipPayload, accountSid: String, countryCode: String) = this()
    
    var addressRequirements: String = js.native
    
    var beta: Boolean = js.native
    
    var capabilities: PhoneNumberCapabilities = js.native
    
    var friendlyName: String = js.native
    
    var isoCountry: String = js.native
    
    var lata: String = js.native
    
    var latitude: Double = js.native
    
    var locality: String = js.native
    
    var longitude: Double = js.native
    
    var phoneNumber: String = js.native
    
    var postalCode: String = js.native
    
    var rateCenter: String = js.native
    
    var region: String = js.native
  }
  
  /**
    * Initialize the VoipList
    *
    * @param version - Version of the resource
    * @param accountSid - The account_sid
    * @param countryCode - The ISO-3166-1 country code of the country.
    */
  inline def VoipList(version: typings.twilio.v2010Mod.^, accountSid: String, countryCode: String): VoipListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("VoipList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any], countryCode.asInstanceOf[js.Any])).asInstanceOf[VoipListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/availablePhoneNumber/voip", "VoipPage")
  @js.native
  open class VoipPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.v2010Mod.^, VoipPayload, VoipResource, VoipInstance] {
    /**
      * Initialize the VoipPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: VoipSolution
    ) = this()
    
    /**
      * Build an instance of VoipInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: VoipPayload): VoipInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait VoipListInstance extends StObject {
    
    /**
      * Streams VoipInstance records from the API.
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
          /* item */ VoipInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ VoipInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: VoipListInstanceEachOptions): Unit = js.native
    def each(
      opts: VoipListInstanceEachOptions,
      callback: js.Function2[
          /* item */ VoipInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Retrieve a single target page of VoipInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[VoipPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ VoipPage, Any]): js.Promise[VoipPage] = js.native
    def getPage(targetUrl: String): js.Promise[VoipPage] = js.native
    def getPage(targetUrl: String, callback: js.Function2[/* error */ js.Error | Null, /* items */ VoipPage, Any]): js.Promise[VoipPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ VoipPage, Any]): js.Promise[VoipPage] = js.native
    
    /**
      * Lists VoipInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[VoipInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[VoipInstance], Any]): js.Promise[js.Array[VoipInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[VoipInstance], Any]
    ): js.Promise[js.Array[VoipInstance]] = js.native
    def list(opts: VoipListInstanceOptions): js.Promise[js.Array[VoipInstance]] = js.native
    def list(
      opts: VoipListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[VoipInstance], Any]
    ): js.Promise[js.Array[VoipInstance]] = js.native
    
    /**
      * Retrieve a single page of VoipInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[VoipPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ VoipPage, Any]): js.Promise[VoipPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ VoipPage, Any]): js.Promise[VoipPage] = js.native
    def page(opts: VoipListInstancePageOptions): js.Promise[VoipPage] = js.native
    def page(
      opts: VoipListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ VoipPage, Any]
    ): js.Promise[VoipPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to each
    *
    * @property areaCode - The area code of the phone numbers to read
    * @property beta - Whether to read phone numbers new to the Twilio platform
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property contains - The pattern on which to match phone numbers
    * @property distance - The search radius, in miles, for a near_ query. (US/Canada only)
    * @property done - Function to be called upon completion of streaming
    * @property excludeAllAddressRequired - Whether to exclude phone numbers that require an Address
    * @property excludeForeignAddressRequired - Whether to exclude phone numbers that require a foreign address
    * @property excludeLocalAddressRequired - Whether to exclude phone numbers that require a local address
    * @property faxEnabled - Whether the phone numbers can receive faxes
    * @property inLata - Limit results to a specific local access and transport area. (US/Canada only)
    * @property inLocality - Limit results to a particular locality
    * @property inPostalCode - Limit results to a particular postal code. (US/Canada only)
    * @property inRateCenter - Limit results to a specific rate center, or given a phone number search within the same rate center as that number. (US/Canada only)
    * @property inRegion - Limit results to a particular region. (US/Canada only)
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         each() guarantees never to return more than limit.
    *                         Default is no limit
    * @property mmsEnabled - Whether the phone numbers can receive MMS messages
    * @property nearLatLong - Given a latitude/longitude pair lat,long find geographically close numbers within distance miles. (US/Canada only)
    * @property nearNumber - Given a phone number, find a geographically close number within distance miles. (US/Canada only)
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no pageSize is defined but a limit is defined,
    *                         each() will attempt to read the limit with the most efficient
    *                         page size, i.e. min(limit, 1000)
    * @property smsEnabled - Whether the phone numbers can receive text messages
    * @property voiceEnabled - Whether the phone numbers can receive calls.
    */
  trait VoipListInstanceEachOptions extends StObject {
    
    var areaCode: js.UndefOr[Double] = js.undefined
    
    var beta: js.UndefOr[Boolean] = js.undefined
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ VoipInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var contains: js.UndefOr[String] = js.undefined
    
    var distance: js.UndefOr[Double] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var excludeAllAddressRequired: js.UndefOr[Boolean] = js.undefined
    
    var excludeForeignAddressRequired: js.UndefOr[Boolean] = js.undefined
    
    var excludeLocalAddressRequired: js.UndefOr[Boolean] = js.undefined
    
    var faxEnabled: js.UndefOr[Boolean] = js.undefined
    
    var inLata: js.UndefOr[String] = js.undefined
    
    var inLocality: js.UndefOr[String] = js.undefined
    
    var inPostalCode: js.UndefOr[String] = js.undefined
    
    var inRateCenter: js.UndefOr[String] = js.undefined
    
    var inRegion: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var mmsEnabled: js.UndefOr[Boolean] = js.undefined
    
    var nearLatLong: js.UndefOr[String] = js.undefined
    
    var nearNumber: js.UndefOr[String] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var smsEnabled: js.UndefOr[Boolean] = js.undefined
    
    var voiceEnabled: js.UndefOr[Boolean] = js.undefined
  }
  object VoipListInstanceEachOptions {
    
    inline def apply(): VoipListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VoipListInstanceEachOptions]
    }
    
    extension [Self <: VoipListInstanceEachOptions](x: Self) {
      
      inline def setAreaCode(value: Double): Self = StObject.set(x, "areaCode", value.asInstanceOf[js.Any])
      
      inline def setAreaCodeUndefined: Self = StObject.set(x, "areaCode", js.undefined)
      
      inline def setBeta(value: Boolean): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
      
      inline def setBetaUndefined: Self = StObject.set(x, "beta", js.undefined)
      
      inline def setCallback(
        value: (/* item */ VoipInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setContains(value: String): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setExcludeAllAddressRequired(value: Boolean): Self = StObject.set(x, "excludeAllAddressRequired", value.asInstanceOf[js.Any])
      
      inline def setExcludeAllAddressRequiredUndefined: Self = StObject.set(x, "excludeAllAddressRequired", js.undefined)
      
      inline def setExcludeForeignAddressRequired(value: Boolean): Self = StObject.set(x, "excludeForeignAddressRequired", value.asInstanceOf[js.Any])
      
      inline def setExcludeForeignAddressRequiredUndefined: Self = StObject.set(x, "excludeForeignAddressRequired", js.undefined)
      
      inline def setExcludeLocalAddressRequired(value: Boolean): Self = StObject.set(x, "excludeLocalAddressRequired", value.asInstanceOf[js.Any])
      
      inline def setExcludeLocalAddressRequiredUndefined: Self = StObject.set(x, "excludeLocalAddressRequired", js.undefined)
      
      inline def setFaxEnabled(value: Boolean): Self = StObject.set(x, "faxEnabled", value.asInstanceOf[js.Any])
      
      inline def setFaxEnabledUndefined: Self = StObject.set(x, "faxEnabled", js.undefined)
      
      inline def setInLata(value: String): Self = StObject.set(x, "inLata", value.asInstanceOf[js.Any])
      
      inline def setInLataUndefined: Self = StObject.set(x, "inLata", js.undefined)
      
      inline def setInLocality(value: String): Self = StObject.set(x, "inLocality", value.asInstanceOf[js.Any])
      
      inline def setInLocalityUndefined: Self = StObject.set(x, "inLocality", js.undefined)
      
      inline def setInPostalCode(value: String): Self = StObject.set(x, "inPostalCode", value.asInstanceOf[js.Any])
      
      inline def setInPostalCodeUndefined: Self = StObject.set(x, "inPostalCode", js.undefined)
      
      inline def setInRateCenter(value: String): Self = StObject.set(x, "inRateCenter", value.asInstanceOf[js.Any])
      
      inline def setInRateCenterUndefined: Self = StObject.set(x, "inRateCenter", js.undefined)
      
      inline def setInRegion(value: String): Self = StObject.set(x, "inRegion", value.asInstanceOf[js.Any])
      
      inline def setInRegionUndefined: Self = StObject.set(x, "inRegion", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setMmsEnabled(value: Boolean): Self = StObject.set(x, "mmsEnabled", value.asInstanceOf[js.Any])
      
      inline def setMmsEnabledUndefined: Self = StObject.set(x, "mmsEnabled", js.undefined)
      
      inline def setNearLatLong(value: String): Self = StObject.set(x, "nearLatLong", value.asInstanceOf[js.Any])
      
      inline def setNearLatLongUndefined: Self = StObject.set(x, "nearLatLong", js.undefined)
      
      inline def setNearNumber(value: String): Self = StObject.set(x, "nearNumber", value.asInstanceOf[js.Any])
      
      inline def setNearNumberUndefined: Self = StObject.set(x, "nearNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setSmsEnabled(value: Boolean): Self = StObject.set(x, "smsEnabled", value.asInstanceOf[js.Any])
      
      inline def setSmsEnabledUndefined: Self = StObject.set(x, "smsEnabled", js.undefined)
      
      inline def setVoiceEnabled(value: Boolean): Self = StObject.set(x, "voiceEnabled", value.asInstanceOf[js.Any])
      
      inline def setVoiceEnabledUndefined: Self = StObject.set(x, "voiceEnabled", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property areaCode - The area code of the phone numbers to read
    * @property beta - Whether to read phone numbers new to the Twilio platform
    * @property contains - The pattern on which to match phone numbers
    * @property distance - The search radius, in miles, for a near_ query. (US/Canada only)
    * @property excludeAllAddressRequired - Whether to exclude phone numbers that require an Address
    * @property excludeForeignAddressRequired - Whether to exclude phone numbers that require a foreign address
    * @property excludeLocalAddressRequired - Whether to exclude phone numbers that require a local address
    * @property faxEnabled - Whether the phone numbers can receive faxes
    * @property inLata - Limit results to a specific local access and transport area. (US/Canada only)
    * @property inLocality - Limit results to a particular locality
    * @property inPostalCode - Limit results to a particular postal code. (US/Canada only)
    * @property inRateCenter - Limit results to a specific rate center, or given a phone number search within the same rate center as that number. (US/Canada only)
    * @property inRegion - Limit results to a particular region. (US/Canada only)
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         list() guarantees never to return more than limit.
    *                         Default is no limit
    * @property mmsEnabled - Whether the phone numbers can receive MMS messages
    * @property nearLatLong - Given a latitude/longitude pair lat,long find geographically close numbers within distance miles. (US/Canada only)
    * @property nearNumber - Given a phone number, find a geographically close number within distance miles. (US/Canada only)
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no page_size is defined but a limit is defined,
    *                         list() will attempt to read the limit with the most
    *                         efficient page size, i.e. min(limit, 1000)
    * @property smsEnabled - Whether the phone numbers can receive text messages
    * @property voiceEnabled - Whether the phone numbers can receive calls.
    */
  trait VoipListInstanceOptions extends StObject {
    
    var areaCode: js.UndefOr[Double] = js.undefined
    
    var beta: js.UndefOr[Boolean] = js.undefined
    
    var contains: js.UndefOr[String] = js.undefined
    
    var distance: js.UndefOr[Double] = js.undefined
    
    var excludeAllAddressRequired: js.UndefOr[Boolean] = js.undefined
    
    var excludeForeignAddressRequired: js.UndefOr[Boolean] = js.undefined
    
    var excludeLocalAddressRequired: js.UndefOr[Boolean] = js.undefined
    
    var faxEnabled: js.UndefOr[Boolean] = js.undefined
    
    var inLata: js.UndefOr[String] = js.undefined
    
    var inLocality: js.UndefOr[String] = js.undefined
    
    var inPostalCode: js.UndefOr[String] = js.undefined
    
    var inRateCenter: js.UndefOr[String] = js.undefined
    
    var inRegion: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var mmsEnabled: js.UndefOr[Boolean] = js.undefined
    
    var nearLatLong: js.UndefOr[String] = js.undefined
    
    var nearNumber: js.UndefOr[String] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var smsEnabled: js.UndefOr[Boolean] = js.undefined
    
    var voiceEnabled: js.UndefOr[Boolean] = js.undefined
  }
  object VoipListInstanceOptions {
    
    inline def apply(): VoipListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VoipListInstanceOptions]
    }
    
    extension [Self <: VoipListInstanceOptions](x: Self) {
      
      inline def setAreaCode(value: Double): Self = StObject.set(x, "areaCode", value.asInstanceOf[js.Any])
      
      inline def setAreaCodeUndefined: Self = StObject.set(x, "areaCode", js.undefined)
      
      inline def setBeta(value: Boolean): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
      
      inline def setBetaUndefined: Self = StObject.set(x, "beta", js.undefined)
      
      inline def setContains(value: String): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      inline def setExcludeAllAddressRequired(value: Boolean): Self = StObject.set(x, "excludeAllAddressRequired", value.asInstanceOf[js.Any])
      
      inline def setExcludeAllAddressRequiredUndefined: Self = StObject.set(x, "excludeAllAddressRequired", js.undefined)
      
      inline def setExcludeForeignAddressRequired(value: Boolean): Self = StObject.set(x, "excludeForeignAddressRequired", value.asInstanceOf[js.Any])
      
      inline def setExcludeForeignAddressRequiredUndefined: Self = StObject.set(x, "excludeForeignAddressRequired", js.undefined)
      
      inline def setExcludeLocalAddressRequired(value: Boolean): Self = StObject.set(x, "excludeLocalAddressRequired", value.asInstanceOf[js.Any])
      
      inline def setExcludeLocalAddressRequiredUndefined: Self = StObject.set(x, "excludeLocalAddressRequired", js.undefined)
      
      inline def setFaxEnabled(value: Boolean): Self = StObject.set(x, "faxEnabled", value.asInstanceOf[js.Any])
      
      inline def setFaxEnabledUndefined: Self = StObject.set(x, "faxEnabled", js.undefined)
      
      inline def setInLata(value: String): Self = StObject.set(x, "inLata", value.asInstanceOf[js.Any])
      
      inline def setInLataUndefined: Self = StObject.set(x, "inLata", js.undefined)
      
      inline def setInLocality(value: String): Self = StObject.set(x, "inLocality", value.asInstanceOf[js.Any])
      
      inline def setInLocalityUndefined: Self = StObject.set(x, "inLocality", js.undefined)
      
      inline def setInPostalCode(value: String): Self = StObject.set(x, "inPostalCode", value.asInstanceOf[js.Any])
      
      inline def setInPostalCodeUndefined: Self = StObject.set(x, "inPostalCode", js.undefined)
      
      inline def setInRateCenter(value: String): Self = StObject.set(x, "inRateCenter", value.asInstanceOf[js.Any])
      
      inline def setInRateCenterUndefined: Self = StObject.set(x, "inRateCenter", js.undefined)
      
      inline def setInRegion(value: String): Self = StObject.set(x, "inRegion", value.asInstanceOf[js.Any])
      
      inline def setInRegionUndefined: Self = StObject.set(x, "inRegion", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setMmsEnabled(value: Boolean): Self = StObject.set(x, "mmsEnabled", value.asInstanceOf[js.Any])
      
      inline def setMmsEnabledUndefined: Self = StObject.set(x, "mmsEnabled", js.undefined)
      
      inline def setNearLatLong(value: String): Self = StObject.set(x, "nearLatLong", value.asInstanceOf[js.Any])
      
      inline def setNearLatLongUndefined: Self = StObject.set(x, "nearLatLong", js.undefined)
      
      inline def setNearNumber(value: String): Self = StObject.set(x, "nearNumber", value.asInstanceOf[js.Any])
      
      inline def setNearNumberUndefined: Self = StObject.set(x, "nearNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setSmsEnabled(value: Boolean): Self = StObject.set(x, "smsEnabled", value.asInstanceOf[js.Any])
      
      inline def setSmsEnabledUndefined: Self = StObject.set(x, "smsEnabled", js.undefined)
      
      inline def setVoiceEnabled(value: Boolean): Self = StObject.set(x, "voiceEnabled", value.asInstanceOf[js.Any])
      
      inline def setVoiceEnabledUndefined: Self = StObject.set(x, "voiceEnabled", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property areaCode - The area code of the phone numbers to read
    * @property beta - Whether to read phone numbers new to the Twilio platform
    * @property contains - The pattern on which to match phone numbers
    * @property distance - The search radius, in miles, for a near_ query. (US/Canada only)
    * @property excludeAllAddressRequired - Whether to exclude phone numbers that require an Address
    * @property excludeForeignAddressRequired - Whether to exclude phone numbers that require a foreign address
    * @property excludeLocalAddressRequired - Whether to exclude phone numbers that require a local address
    * @property faxEnabled - Whether the phone numbers can receive faxes
    * @property inLata - Limit results to a specific local access and transport area. (US/Canada only)
    * @property inLocality - Limit results to a particular locality
    * @property inPostalCode - Limit results to a particular postal code. (US/Canada only)
    * @property inRateCenter - Limit results to a specific rate center, or given a phone number search within the same rate center as that number. (US/Canada only)
    * @property inRegion - Limit results to a particular region. (US/Canada only)
    * @property mmsEnabled - Whether the phone numbers can receive MMS messages
    * @property nearLatLong - Given a latitude/longitude pair lat,long find geographically close numbers within distance miles. (US/Canada only)
    * @property nearNumber - Given a phone number, find a geographically close number within distance miles. (US/Canada only)
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property smsEnabled - Whether the phone numbers can receive text messages
    * @property voiceEnabled - Whether the phone numbers can receive calls.
    */
  trait VoipListInstancePageOptions extends StObject {
    
    var areaCode: js.UndefOr[Double] = js.undefined
    
    var beta: js.UndefOr[Boolean] = js.undefined
    
    var contains: js.UndefOr[String] = js.undefined
    
    var distance: js.UndefOr[Double] = js.undefined
    
    var excludeAllAddressRequired: js.UndefOr[Boolean] = js.undefined
    
    var excludeForeignAddressRequired: js.UndefOr[Boolean] = js.undefined
    
    var excludeLocalAddressRequired: js.UndefOr[Boolean] = js.undefined
    
    var faxEnabled: js.UndefOr[Boolean] = js.undefined
    
    var inLata: js.UndefOr[String] = js.undefined
    
    var inLocality: js.UndefOr[String] = js.undefined
    
    var inPostalCode: js.UndefOr[String] = js.undefined
    
    var inRateCenter: js.UndefOr[String] = js.undefined
    
    var inRegion: js.UndefOr[String] = js.undefined
    
    var mmsEnabled: js.UndefOr[Boolean] = js.undefined
    
    var nearLatLong: js.UndefOr[String] = js.undefined
    
    var nearNumber: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var smsEnabled: js.UndefOr[Boolean] = js.undefined
    
    var voiceEnabled: js.UndefOr[Boolean] = js.undefined
  }
  object VoipListInstancePageOptions {
    
    inline def apply(): VoipListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VoipListInstancePageOptions]
    }
    
    extension [Self <: VoipListInstancePageOptions](x: Self) {
      
      inline def setAreaCode(value: Double): Self = StObject.set(x, "areaCode", value.asInstanceOf[js.Any])
      
      inline def setAreaCodeUndefined: Self = StObject.set(x, "areaCode", js.undefined)
      
      inline def setBeta(value: Boolean): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
      
      inline def setBetaUndefined: Self = StObject.set(x, "beta", js.undefined)
      
      inline def setContains(value: String): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      inline def setExcludeAllAddressRequired(value: Boolean): Self = StObject.set(x, "excludeAllAddressRequired", value.asInstanceOf[js.Any])
      
      inline def setExcludeAllAddressRequiredUndefined: Self = StObject.set(x, "excludeAllAddressRequired", js.undefined)
      
      inline def setExcludeForeignAddressRequired(value: Boolean): Self = StObject.set(x, "excludeForeignAddressRequired", value.asInstanceOf[js.Any])
      
      inline def setExcludeForeignAddressRequiredUndefined: Self = StObject.set(x, "excludeForeignAddressRequired", js.undefined)
      
      inline def setExcludeLocalAddressRequired(value: Boolean): Self = StObject.set(x, "excludeLocalAddressRequired", value.asInstanceOf[js.Any])
      
      inline def setExcludeLocalAddressRequiredUndefined: Self = StObject.set(x, "excludeLocalAddressRequired", js.undefined)
      
      inline def setFaxEnabled(value: Boolean): Self = StObject.set(x, "faxEnabled", value.asInstanceOf[js.Any])
      
      inline def setFaxEnabledUndefined: Self = StObject.set(x, "faxEnabled", js.undefined)
      
      inline def setInLata(value: String): Self = StObject.set(x, "inLata", value.asInstanceOf[js.Any])
      
      inline def setInLataUndefined: Self = StObject.set(x, "inLata", js.undefined)
      
      inline def setInLocality(value: String): Self = StObject.set(x, "inLocality", value.asInstanceOf[js.Any])
      
      inline def setInLocalityUndefined: Self = StObject.set(x, "inLocality", js.undefined)
      
      inline def setInPostalCode(value: String): Self = StObject.set(x, "inPostalCode", value.asInstanceOf[js.Any])
      
      inline def setInPostalCodeUndefined: Self = StObject.set(x, "inPostalCode", js.undefined)
      
      inline def setInRateCenter(value: String): Self = StObject.set(x, "inRateCenter", value.asInstanceOf[js.Any])
      
      inline def setInRateCenterUndefined: Self = StObject.set(x, "inRateCenter", js.undefined)
      
      inline def setInRegion(value: String): Self = StObject.set(x, "inRegion", value.asInstanceOf[js.Any])
      
      inline def setInRegionUndefined: Self = StObject.set(x, "inRegion", js.undefined)
      
      inline def setMmsEnabled(value: Boolean): Self = StObject.set(x, "mmsEnabled", value.asInstanceOf[js.Any])
      
      inline def setMmsEnabledUndefined: Self = StObject.set(x, "mmsEnabled", js.undefined)
      
      inline def setNearLatLong(value: String): Self = StObject.set(x, "nearLatLong", value.asInstanceOf[js.Any])
      
      inline def setNearLatLongUndefined: Self = StObject.set(x, "nearLatLong", js.undefined)
      
      inline def setNearNumber(value: String): Self = StObject.set(x, "nearNumber", value.asInstanceOf[js.Any])
      
      inline def setNearNumberUndefined: Self = StObject.set(x, "nearNumber", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setSmsEnabled(value: Boolean): Self = StObject.set(x, "smsEnabled", value.asInstanceOf[js.Any])
      
      inline def setSmsEnabledUndefined: Self = StObject.set(x, "smsEnabled", js.undefined)
      
      inline def setVoiceEnabled(value: Boolean): Self = StObject.set(x, "voiceEnabled", value.asInstanceOf[js.Any])
      
      inline def setVoiceEnabledUndefined: Self = StObject.set(x, "voiceEnabled", js.undefined)
    }
  }
  
  trait VoipPayload
    extends StObject
       with VoipResource
       with TwilioResponsePayload
  object VoipPayload {
    
    inline def apply(
      address_requirements: String,
      beta: Boolean,
      capabilities: PhoneNumberCapabilities,
      first_page_uri: String,
      friendly_name: String,
      iso_country: String,
      lata: String,
      latitude: Double,
      locality: String,
      longitude: Double,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      phone_number: String,
      postal_code: String,
      previous_page_uri: String,
      rate_center: String,
      region: String,
      uri: String
    ): VoipPayload = {
      val __obj = js.Dynamic.literal(address_requirements = address_requirements.asInstanceOf[js.Any], beta = beta.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], iso_country = iso_country.asInstanceOf[js.Any], lata = lata.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], postal_code = postal_code.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], rate_center = rate_center.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[VoipPayload]
    }
  }
  
  trait VoipResource extends StObject {
    
    var address_requirements: String
    
    var beta: Boolean
    
    var capabilities: PhoneNumberCapabilities
    
    var friendly_name: String
    
    var iso_country: String
    
    var lata: String
    
    var latitude: Double
    
    var locality: String
    
    var longitude: Double
    
    var phone_number: String
    
    var postal_code: String
    
    var rate_center: String
    
    var region: String
  }
  object VoipResource {
    
    inline def apply(
      address_requirements: String,
      beta: Boolean,
      capabilities: PhoneNumberCapabilities,
      friendly_name: String,
      iso_country: String,
      lata: String,
      latitude: Double,
      locality: String,
      longitude: Double,
      phone_number: String,
      postal_code: String,
      rate_center: String,
      region: String
    ): VoipResource = {
      val __obj = js.Dynamic.literal(address_requirements = address_requirements.asInstanceOf[js.Any], beta = beta.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], iso_country = iso_country.asInstanceOf[js.Any], lata = lata.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], postal_code = postal_code.asInstanceOf[js.Any], rate_center = rate_center.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
      __obj.asInstanceOf[VoipResource]
    }
    
    extension [Self <: VoipResource](x: Self) {
      
      inline def setAddress_requirements(value: String): Self = StObject.set(x, "address_requirements", value.asInstanceOf[js.Any])
      
      inline def setBeta(value: Boolean): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
      
      inline def setCapabilities(value: PhoneNumberCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setIso_country(value: String): Self = StObject.set(x, "iso_country", value.asInstanceOf[js.Any])
      
      inline def setLata(value: String): Self = StObject.set(x, "lata", value.asInstanceOf[js.Any])
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
      
      inline def setPostal_code(value: String): Self = StObject.set(x, "postal_code", value.asInstanceOf[js.Any])
      
      inline def setRate_center(value: String): Self = StObject.set(x, "rate_center", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    }
  }
  
  trait VoipSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
    
    var countryCode: js.UndefOr[String] = js.undefined
  }
  object VoipSolution {
    
    inline def apply(): VoipSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VoipSolution]
    }
    
    extension [Self <: VoipSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
      
      inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
      
      inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    }
  }
}
