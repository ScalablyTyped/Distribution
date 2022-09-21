package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object verificationAttemptsSummaryMod {
  
  @JSImport("twilio/lib/rest/verify/v2/verificationAttemptsSummary", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/verify/v2/verificationAttemptsSummary", "VerificationAttemptsSummaryContext")
  @js.native
  open class VerificationAttemptsSummaryContext protected () extends StObject {
    /**
      * Initialize the VerificationAttemptsSummaryContext
      *
      * @param version - Version of the resource
      */
    def this(version: typings.twilio.verifyV2Mod.^) = this()
    
    /**
      * fetch a VerificationAttemptsSummaryInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[VerificationAttemptsSummaryInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ VerificationAttemptsSummaryInstance, Any]
    ): js.Promise[VerificationAttemptsSummaryInstance] = js.native
    def fetch(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ VerificationAttemptsSummaryInstance, Any]
    ): js.Promise[VerificationAttemptsSummaryInstance] = js.native
    def fetch(opts: VerificationAttemptsSummaryInstanceFetchOptions): js.Promise[VerificationAttemptsSummaryInstance] = js.native
    def fetch(
      opts: VerificationAttemptsSummaryInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ VerificationAttemptsSummaryInstance, Any]
    ): js.Promise[VerificationAttemptsSummaryInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/verify/v2/verificationAttemptsSummary", "VerificationAttemptsSummaryInstance")
  @js.native
  open class VerificationAttemptsSummaryInstance protected () extends SerializableClass {
    /**
      * Initialize the VerificationAttemptsSummaryContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      */
    def this(version: typings.twilio.verifyV2Mod.^, payload: VerificationAttemptsSummaryPayload) = this()
    
    /* private */ var _proxy: VerificationAttemptsSummaryContext = js.native
    
    var conversionRatePercentage: Double = js.native
    
    /**
      * fetch a VerificationAttemptsSummaryInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[VerificationAttemptsSummaryInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[VerificationAttemptsSummaryInstance] = js.native
    def fetch(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[VerificationAttemptsSummaryInstance] = js.native
    def fetch(opts: VerificationAttemptsSummaryInstanceFetchOptions): js.Promise[VerificationAttemptsSummaryInstance] = js.native
    def fetch(
      opts: VerificationAttemptsSummaryInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[VerificationAttemptsSummaryInstance] = js.native
    
    var totalAttempts: Double = js.native
    
    var totalConverted: Double = js.native
    
    var totalUnconverted: Double = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the VerificationAttemptsSummaryList
    *
    * @param version - Version of the resource
    */
  inline def VerificationAttemptsSummaryList(version: typings.twilio.verifyV2Mod.^): VerificationAttemptsSummaryListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("VerificationAttemptsSummaryList")(version.asInstanceOf[js.Any]).asInstanceOf[VerificationAttemptsSummaryListInstance]
  
  @JSImport("twilio/lib/rest/verify/v2/verificationAttemptsSummary", "VerificationAttemptsSummaryPage")
  @js.native
  open class VerificationAttemptsSummaryPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.verifyV2Mod.^, 
          VerificationAttemptsSummaryPayload, 
          VerificationAttemptsSummaryResource, 
          VerificationAttemptsSummaryInstance
        ] {
    /**
      * Initialize the VerificationAttemptsSummaryPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.verifyV2Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: VerificationAttemptsSummarySolution
    ) = this()
    
    /**
      * Build an instance of VerificationAttemptsSummaryInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: VerificationAttemptsSummaryPayload): VerificationAttemptsSummaryInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.sms
    - typings.twilio.twilioStrings.call
    - typings.twilio.twilioStrings.email
    - typings.twilio.twilioStrings.whatsapp
  */
  trait VerificationAttemptsSummaryChannels extends StObject
  object VerificationAttemptsSummaryChannels {
    
    inline def call: typings.twilio.twilioStrings.call = "call".asInstanceOf[typings.twilio.twilioStrings.call]
    
    inline def email: typings.twilio.twilioStrings.email = "email".asInstanceOf[typings.twilio.twilioStrings.email]
    
    inline def sms: typings.twilio.twilioStrings.sms = "sms".asInstanceOf[typings.twilio.twilioStrings.sms]
    
    inline def whatsapp: typings.twilio.twilioStrings.whatsapp = "whatsapp".asInstanceOf[typings.twilio.twilioStrings.whatsapp]
  }
  
  /**
    * Options to pass to fetch
    *
    * @property channel - Filter verification attempts considered on the summary by communication channel.
    * @property country - Filter verification attempts considered on the summary by destination country.
    * @property dateCreatedAfter - Consider verification attempts create after this date on the summary.
    * @property dateCreatedBefore - Consider verification attempts created before this date on the summary.
    * @property destinationPrefix - Filters the attempts considered on the summary by destination prefix.
    * @property verifyServiceSid - Filter the verification attempts considered on the summary by verify service.
    */
  trait VerificationAttemptsSummaryInstanceFetchOptions extends StObject {
    
    var channel: js.UndefOr[VerificationAttemptsSummaryChannels] = js.undefined
    
    var country: js.UndefOr[String] = js.undefined
    
    var dateCreatedAfter: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedBefore: js.UndefOr[js.Date] = js.undefined
    
    var destinationPrefix: js.UndefOr[String] = js.undefined
    
    var verifyServiceSid: js.UndefOr[String] = js.undefined
  }
  object VerificationAttemptsSummaryInstanceFetchOptions {
    
    inline def apply(): VerificationAttemptsSummaryInstanceFetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerificationAttemptsSummaryInstanceFetchOptions]
    }
    
    extension [Self <: VerificationAttemptsSummaryInstanceFetchOptions](x: Self) {
      
      inline def setChannel(value: VerificationAttemptsSummaryChannels): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setDateCreatedAfter(value: js.Date): Self = StObject.set(x, "dateCreatedAfter", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedAfterUndefined: Self = StObject.set(x, "dateCreatedAfter", js.undefined)
      
      inline def setDateCreatedBefore(value: js.Date): Self = StObject.set(x, "dateCreatedBefore", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedBeforeUndefined: Self = StObject.set(x, "dateCreatedBefore", js.undefined)
      
      inline def setDestinationPrefix(value: String): Self = StObject.set(x, "destinationPrefix", value.asInstanceOf[js.Any])
      
      inline def setDestinationPrefixUndefined: Self = StObject.set(x, "destinationPrefix", js.undefined)
      
      inline def setVerifyServiceSid(value: String): Self = StObject.set(x, "verifyServiceSid", value.asInstanceOf[js.Any])
      
      inline def setVerifyServiceSidUndefined: Self = StObject.set(x, "verifyServiceSid", js.undefined)
    }
  }
  
  @js.native
  trait VerificationAttemptsSummaryListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): VerificationAttemptsSummaryContext = js.native
    
    /**
      * Constructs a verification_attempts_summary
      */
    def get(): VerificationAttemptsSummaryContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait VerificationAttemptsSummaryPayload
    extends StObject
       with VerificationAttemptsSummaryResource
       with TwilioResponsePayload
  object VerificationAttemptsSummaryPayload {
    
    inline def apply(
      conversion_rate_percentage: Double,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      total_attempts: Double,
      total_converted: Double,
      total_unconverted: Double,
      uri: String,
      url: String
    ): VerificationAttemptsSummaryPayload = {
      val __obj = js.Dynamic.literal(conversion_rate_percentage = conversion_rate_percentage.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], total_attempts = total_attempts.asInstanceOf[js.Any], total_converted = total_converted.asInstanceOf[js.Any], total_unconverted = total_unconverted.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerificationAttemptsSummaryPayload]
    }
  }
  
  trait VerificationAttemptsSummaryResource extends StObject {
    
    var conversion_rate_percentage: Double
    
    var total_attempts: Double
    
    var total_converted: Double
    
    var total_unconverted: Double
    
    var url: String
  }
  object VerificationAttemptsSummaryResource {
    
    inline def apply(
      conversion_rate_percentage: Double,
      total_attempts: Double,
      total_converted: Double,
      total_unconverted: Double,
      url: String
    ): VerificationAttemptsSummaryResource = {
      val __obj = js.Dynamic.literal(conversion_rate_percentage = conversion_rate_percentage.asInstanceOf[js.Any], total_attempts = total_attempts.asInstanceOf[js.Any], total_converted = total_converted.asInstanceOf[js.Any], total_unconverted = total_unconverted.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerificationAttemptsSummaryResource]
    }
    
    extension [Self <: VerificationAttemptsSummaryResource](x: Self) {
      
      inline def setConversion_rate_percentage(value: Double): Self = StObject.set(x, "conversion_rate_percentage", value.asInstanceOf[js.Any])
      
      inline def setTotal_attempts(value: Double): Self = StObject.set(x, "total_attempts", value.asInstanceOf[js.Any])
      
      inline def setTotal_converted(value: Double): Self = StObject.set(x, "total_converted", value.asInstanceOf[js.Any])
      
      inline def setTotal_unconverted(value: Double): Self = StObject.set(x, "total_unconverted", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait VerificationAttemptsSummarySolution extends StObject
}
