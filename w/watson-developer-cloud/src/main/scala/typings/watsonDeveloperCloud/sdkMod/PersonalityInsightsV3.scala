package typings.watsonDeveloperCloud.sdkMod

import typings.watsonDeveloperCloud.v3GeneratedMod.Options
import typings.watsonDeveloperCloud.v3GeneratedMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The IBM Watson&trade; Personality Insights service enables applications to derive insights from social media, enterprise data, or other digital communications. The service uses linguistic analytics to infer individuals' intrinsic personality characteristics, including Big Five, Needs, and Values, from digital communications such as email, text messages, tweets, and forum posts.  The service can automatically infer, from potentially noisy social media, portraits of individuals that reflect their personality characteristics. The service can infer consumption preferences based on the results of its analysis and, for JSON content that is timestamped, can report temporal behavior. * For information about the meaning of the models that the service uses to describe personality characteristics, see [Personality models](https://cloud.ibm.com/docs/services/personality-insights/models.html). * For information about the meaning of the consumption preferences, see [Consumption preferences](https://cloud.ibm.com/docs/services/personality-insights/preferences.html).   **Note:** Request logging is disabled for the Personality Insights service. Regardless of whether you set the `X-Watson-Learning-Opt-Out` request header, the service does not log or retain data from requests and responses.
  */
@JSImport("watson-developer-cloud/sdk", "PersonalityInsightsV3")
@js.native
class PersonalityInsightsV3 protected () extends ^ {
  /**
    * Construct a PersonalityInsightsV3 object.
    *
    * @param {Object} options - Options for the service.
    * @param {string} options.version - The API version date to use with the service, in "YYYY-MM-DD" format. Whenever the API is changed in a backwards incompatible way, a new minor version of the API is released. The service uses the API version for the date you specify, or the most recent version before that date. Note that you should not programmatically specify the current date at runtime, in case the API has been updated since your application's release. Instead, specify a version date that is compatible with your application, and don't change it until your application is ready for a later version.
    * @param {string} [options.url] - The base url to use when contacting the service (e.g. 'https://gateway.watsonplatform.net/personality-insights/api'). The base url may differ between Bluemix regions.
    * @param {string} [options.username] - The username used to authenticate with the service. Username and password credentials are only required to run your application locally or outside of Bluemix. When running on Bluemix, the credentials will be automatically loaded from the `VCAP_SERVICES` environment variable.
    * @param {string} [options.password] - The password used to authenticate with the service. Username and password credentials are only required to run your application locally or outside of Bluemix. When running on Bluemix, the credentials will be automatically loaded from the `VCAP_SERVICES` environment variable.
    * @param {string} [options.iam_access_token] - An IAM access token fully managed by the application. Responsibility falls on the application to refresh the token, either before it expires or reactively upon receiving a 401 from the service, as any requests made with an expired token will fail.
    * @param {string} [options.iam_apikey] - An API key that can be used to request IAM tokens. If this API key is provided, the SDK will manage the token and handle the refreshing.
    * @param {string} [options.iam_url] - An optional URL for the IAM service API. Defaults to 'https://iam.bluemix.net/identity/token'.
    * @param {boolean} [options.use_unauthenticated] - Set to `true` to avoid including an authorization header. This option may be useful for requests that are proxied.
    * @param {Object} [options.headers] - Default headers that shall be included with every request to the service.
    * @param {boolean} [options.headers.X-Watson-Learning-Opt-Out] - Set to `true` to opt-out of data collection. By default, all IBM Watson services log requests and their results. Logging is done only to improve the services for future users. The logged data is not shared or made public. If you are concerned with protecting the privacy of users' personal information or otherwise do not want your requests to be logged, you can opt out of logging.
    * @constructor
    * @returns {PersonalityInsightsV3}
    * @throws {Error}
    */
  def this(options: Options) = this()
}
object PersonalityInsightsV3 {
  
  @JSImport("watson-developer-cloud/sdk", "PersonalityInsightsV3")
  @js.native
  val ^ : js.Any = js.native
  
  /** Constants for the `profileAsCsv` operation. */
  object ProfileAsCsvConstants {
    
    /** The desired language of the response. For two-character arguments, regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. You can specify any combination of languages for the input and response content. */
    @JSImport("watson-developer-cloud/sdk", "PersonalityInsightsV3.ProfileAsCsvConstants.AcceptLanguage")
    @js.native
    object AcceptLanguage extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.AcceptLanguage & String
          ] = js.native
      
      /* "ar" */ val AR: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.AcceptLanguage.AR & String = js.native
      
      /* "de" */ val DE: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.AcceptLanguage.DE & String = js.native
      
      /* "en" */ val EN: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.AcceptLanguage.EN & String = js.native
      
      /* "es" */ val ES: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.AcceptLanguage.ES & String = js.native
      
      /* "fr" */ val FR: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.AcceptLanguage.FR & String = js.native
      
      /* "it" */ val IT: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.AcceptLanguage.IT & String = js.native
      
      /* "ja" */ val JA: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.AcceptLanguage.JA & String = js.native
      
      /* "ko" */ val KO: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.AcceptLanguage.KO & String = js.native
      
      /* "pt-br" */ val PT_BR: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.AcceptLanguage.PT_BR & String = js.native
      
      /* "zh-cn" */ val ZH_CN: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.AcceptLanguage.ZH_CN & String = js.native
      
      /* "zh-tw" */ val ZH_TW: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.AcceptLanguage.ZH_TW & String = js.native
    }
    
    /** The language of the input text for the request: Arabic, English, Japanese, Korean, or Spanish. Regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. The effect of the **Content-Language** parameter depends on the **Content-Type** parameter. When **Content-Type** is `text/plain` or `text/html`, **Content-Language** is the only way to specify the language. When **Content-Type** is `application/json`, **Content-Language** overrides a language specified with the `language` parameter of a `ContentItem` object, and content items that specify a different language are ignored; omit this parameter to base the language on the specification of the content items. You can specify any combination of languages for **Content-Language** and **Accept-Language**. */
    @JSImport("watson-developer-cloud/sdk", "PersonalityInsightsV3.ProfileAsCsvConstants.ContentLanguage")
    @js.native
    object ContentLanguage extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.ContentLanguage & String
          ] = js.native
      
      /* "ar" */ val AR: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.ContentLanguage.AR & String = js.native
      
      /* "en" */ val EN: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.ContentLanguage.EN & String = js.native
      
      /* "es" */ val ES: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.ContentLanguage.ES & String = js.native
      
      /* "ja" */ val JA: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.ContentLanguage.JA & String = js.native
      
      /* "ko" */ val KO: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.ContentLanguage.KO & String = js.native
    }
    
    /** The type of the input. For more information, see **Content types** in the method description. Default: `text/plain`. */
    @JSImport("watson-developer-cloud/sdk", "PersonalityInsightsV3.ProfileAsCsvConstants.ContentType")
    @js.native
    object ContentType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.ContentType & String
          ] = js.native
      
      /* "application/json" */ val APPLICATION_JSON: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.ContentType.APPLICATION_JSON & String = js.native
      
      /* "text/html" */ val TEXT_HTML: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.ContentType.TEXT_HTML & String = js.native
      
      /* "text/plain" */ val TEXT_PLAIN: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileAsCsvConstants.ContentType.TEXT_PLAIN & String = js.native
    }
  }
  
  /** Constants for the `profile` operation. */
  object ProfileConstants {
    
    /** The desired language of the response. For two-character arguments, regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. You can specify any combination of languages for the input and response content. */
    @JSImport("watson-developer-cloud/sdk", "PersonalityInsightsV3.ProfileConstants.AcceptLanguage")
    @js.native
    object AcceptLanguage extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.v3GeneratedMod.ProfileConstants.AcceptLanguage & String
          ] = js.native
      
      /* "ar" */ val AR: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileConstants.AcceptLanguage.AR & String = js.native
      
      /* "de" */ val DE: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileConstants.AcceptLanguage.DE & String = js.native
      
      /* "en" */ val EN: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileConstants.AcceptLanguage.EN & String = js.native
      
      /* "es" */ val ES: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileConstants.AcceptLanguage.ES & String = js.native
      
      /* "fr" */ val FR: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileConstants.AcceptLanguage.FR & String = js.native
      
      /* "it" */ val IT: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileConstants.AcceptLanguage.IT & String = js.native
      
      /* "ja" */ val JA: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileConstants.AcceptLanguage.JA & String = js.native
      
      /* "ko" */ val KO: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileConstants.AcceptLanguage.KO & String = js.native
      
      /* "pt-br" */ val PT_BR: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileConstants.AcceptLanguage.PT_BR & String = js.native
      
      /* "zh-cn" */ val ZH_CN: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileConstants.AcceptLanguage.ZH_CN & String = js.native
      
      /* "zh-tw" */ val ZH_TW: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileConstants.AcceptLanguage.ZH_TW & String = js.native
    }
    
    /** The language of the input text for the request: Arabic, English, Japanese, Korean, or Spanish. Regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. The effect of the **Content-Language** parameter depends on the **Content-Type** parameter. When **Content-Type** is `text/plain` or `text/html`, **Content-Language** is the only way to specify the language. When **Content-Type** is `application/json`, **Content-Language** overrides a language specified with the `language` parameter of a `ContentItem` object, and content items that specify a different language are ignored; omit this parameter to base the language on the specification of the content items. You can specify any combination of languages for **Content-Language** and **Accept-Language**. */
    @JSImport("watson-developer-cloud/sdk", "PersonalityInsightsV3.ProfileConstants.ContentLanguage")
    @js.native
    object ContentLanguage extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.v3GeneratedMod.ProfileConstants.ContentLanguage & String
          ] = js.native
      
      /* "ar" */ val AR: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileConstants.ContentLanguage.AR & String = js.native
      
      /* "en" */ val EN: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileConstants.ContentLanguage.EN & String = js.native
      
      /* "es" */ val ES: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileConstants.ContentLanguage.ES & String = js.native
      
      /* "ja" */ val JA: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileConstants.ContentLanguage.JA & String = js.native
      
      /* "ko" */ val KO: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileConstants.ContentLanguage.KO & String = js.native
    }
    
    /** The type of the input. For more information, see **Content types** in the method description. Default: `text/plain`. */
    @JSImport("watson-developer-cloud/sdk", "PersonalityInsightsV3.ProfileConstants.ContentType")
    @js.native
    object ContentType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.v3GeneratedMod.ProfileConstants.ContentType & String
          ] = js.native
      
      /* "application/json" */ val APPLICATION_JSON: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileConstants.ContentType.APPLICATION_JSON & String = js.native
      
      /* "text/html" */ val TEXT_HTML: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileConstants.ContentType.TEXT_HTML & String = js.native
      
      /* "text/plain" */ val TEXT_PLAIN: typings.watsonDeveloperCloud.v3GeneratedMod.ProfileConstants.ContentType.TEXT_PLAIN & String = js.native
    }
  }
  
  /* static member */
  @JSImport("watson-developer-cloud/sdk", "PersonalityInsightsV3.URL")
  @js.native
  def URL: String = js.native
  inline def URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("URL")(x.asInstanceOf[js.Any])
}
