package typings.watsonDeveloperCloud.sdkMod

import typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.Options
import typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The IBM Watson&trade; Tone Analyzer service uses linguistic analysis to detect emotional and language tones in written text. The service can analyze tone at both the document and sentence levels. You can use the service to understand how your written communications are perceived and then to improve the tone of your communications. Businesses can use the service to learn the tone of their customers' communications and to respond to each customer appropriately, or to understand and improve their customer conversations.  **Note:** Request logging is disabled for the Tone Analyzer service. Regardless of whether you set the `X-Watson-Learning-Opt-Out` request header, the service does not log or retain data from requests and responses.
  */
@JSImport("watson-developer-cloud/sdk", "ToneAnalyzerV3")
@js.native
class ToneAnalyzerV3 protected () extends ^ {
  /**
    * Construct a ToneAnalyzerV3 object.
    *
    * @param {Object} options - Options for the service.
    * @param {string} options.version - The API version date to use with the service, in "YYYY-MM-DD" format. Whenever the API is changed in a backwards incompatible way, a new minor version of the API is released. The service uses the API version for the date you specify, or the most recent version before that date. Note that you should not programmatically specify the current date at runtime, in case the API has been updated since your application's release. Instead, specify a version date that is compatible with your application, and don't change it until your application is ready for a later version.
    * @param {string} [options.url] - The base url to use when contacting the service (e.g. 'https://gateway.watsonplatform.net/tone-analyzer/api'). The base url may differ between Bluemix regions.
    * @param {string} [options.username] - The username used to authenticate with the service. Username and password credentials are only required to run your application locally or outside of Bluemix. When running on Bluemix, the credentials will be automatically loaded from the `VCAP_SERVICES` environment variable.
    * @param {string} [options.password] - The password used to authenticate with the service. Username and password credentials are only required to run your application locally or outside of Bluemix. When running on Bluemix, the credentials will be automatically loaded from the `VCAP_SERVICES` environment variable.
    * @param {string} [options.iam_access_token] - An IAM access token fully managed by the application. Responsibility falls on the application to refresh the token, either before it expires or reactively upon receiving a 401 from the service, as any requests made with an expired token will fail.
    * @param {string} [options.iam_apikey] - An API key that can be used to request IAM tokens. If this API key is provided, the SDK will manage the token and handle the refreshing.
    * @param {string} [options.iam_url] - An optional URL for the IAM service API. Defaults to 'https://iam.bluemix.net/identity/token'.
    * @param {boolean} [options.use_unauthenticated] - Set to `true` to avoid including an authorization header. This option may be useful for requests that are proxied.
    * @param {Object} [options.headers] - Default headers that shall be included with every request to the service.
    * @param {boolean} [options.headers.X-Watson-Learning-Opt-Out] - Set to `true` to opt-out of data collection. By default, all IBM Watson services log requests and their results. Logging is done only to improve the services for future users. The logged data is not shared or made public. If you are concerned with protecting the privacy of users' personal information or otherwise do not want your requests to be logged, you can opt out of logging.
    * @constructor
    * @returns {ToneAnalyzerV3}
    * @throws {Error}
    */
  def this(options: Options) = this()
}
object ToneAnalyzerV3 {
  
  @JSImport("watson-developer-cloud/sdk", "ToneAnalyzerV3")
  @js.native
  val ^ : js.Any = js.native
  
  /** Constants for the `toneChat` operation. */
  object ToneChatConstants {
    
    /** The desired language of the response. For two-character arguments, regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. You can use different languages for **Content-Language** and **Accept-Language**. */
    @JSImport("watson-developer-cloud/sdk", "ToneAnalyzerV3.ToneChatConstants.AcceptLanguage")
    @js.native
    object AcceptLanguage extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.AcceptLanguage & String
          ] = js.native
      
      /* "ar" */ val AR: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.AcceptLanguage.AR & String = js.native
      
      /* "de" */ val DE: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.AcceptLanguage.DE & String = js.native
      
      /* "en" */ val EN: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.AcceptLanguage.EN & String = js.native
      
      /* "es" */ val ES: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.AcceptLanguage.ES & String = js.native
      
      /* "fr" */ val FR: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.AcceptLanguage.FR & String = js.native
      
      /* "it" */ val IT: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.AcceptLanguage.IT & String = js.native
      
      /* "ja" */ val JA: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.AcceptLanguage.JA & String = js.native
      
      /* "ko" */ val KO: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.AcceptLanguage.KO & String = js.native
      
      /* "pt-br" */ val PT_BR: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.AcceptLanguage.PT_BR & String = js.native
      
      /* "zh-cn" */ val ZH_CN: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.AcceptLanguage.ZH_CN & String = js.native
      
      /* "zh-tw" */ val ZH_TW: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.AcceptLanguage.ZH_TW & String = js.native
    }
    
    /** The language of the input text for the request: English or French. Regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. The input content must match the specified language. Do not submit content that contains both languages. You can use different languages for **Content-Language** and **Accept-Language**. * **`2017-09-21`:** Accepts `en` or `fr`. * **`2016-05-19`:** Accepts only `en`. */
    @JSImport("watson-developer-cloud/sdk", "ToneAnalyzerV3.ToneChatConstants.ContentLanguage")
    @js.native
    object ContentLanguage extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.ContentLanguage & String
          ] = js.native
      
      /* "en" */ val EN: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.ContentLanguage.EN & String = js.native
      
      /* "fr" */ val FR: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneChatConstants.ContentLanguage.FR & String = js.native
    }
  }
  
  /** Constants for the `tone` operation. */
  object ToneConstants {
    
    /** The desired language of the response. For two-character arguments, regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. You can use different languages for **Content-Language** and **Accept-Language**. */
    @JSImport("watson-developer-cloud/sdk", "ToneAnalyzerV3.ToneConstants.AcceptLanguage")
    @js.native
    object AcceptLanguage extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.AcceptLanguage & String
          ] = js.native
      
      /* "ar" */ val AR: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.AcceptLanguage.AR & String = js.native
      
      /* "de" */ val DE: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.AcceptLanguage.DE & String = js.native
      
      /* "en" */ val EN: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.AcceptLanguage.EN & String = js.native
      
      /* "es" */ val ES: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.AcceptLanguage.ES & String = js.native
      
      /* "fr" */ val FR: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.AcceptLanguage.FR & String = js.native
      
      /* "it" */ val IT: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.AcceptLanguage.IT & String = js.native
      
      /* "ja" */ val JA: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.AcceptLanguage.JA & String = js.native
      
      /* "ko" */ val KO: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.AcceptLanguage.KO & String = js.native
      
      /* "pt-br" */ val PT_BR: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.AcceptLanguage.PT_BR & String = js.native
      
      /* "zh-cn" */ val ZH_CN: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.AcceptLanguage.ZH_CN & String = js.native
      
      /* "zh-tw" */ val ZH_TW: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.AcceptLanguage.ZH_TW & String = js.native
    }
    
    /** The language of the input text for the request: English or French. Regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. The input content must match the specified language. Do not submit content that contains both languages. You can use different languages for **Content-Language** and **Accept-Language**. * **`2017-09-21`:** Accepts `en` or `fr`. * **`2016-05-19`:** Accepts only `en`. */
    @JSImport("watson-developer-cloud/sdk", "ToneAnalyzerV3.ToneConstants.ContentLanguage")
    @js.native
    object ContentLanguage extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.ContentLanguage & String
          ] = js.native
      
      /* "en" */ val EN: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.ContentLanguage.EN & String = js.native
      
      /* "fr" */ val FR: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.ContentLanguage.FR & String = js.native
    }
    
    /** The type of the input. A character encoding can be specified by including a `charset` parameter. For example, 'text/plain;charset=utf-8'. */
    @JSImport("watson-developer-cloud/sdk", "ToneAnalyzerV3.ToneConstants.ContentType")
    @js.native
    object ContentType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.ContentType & String
          ] = js.native
      
      /* "application/json" */ val APPLICATION_JSON: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.ContentType.APPLICATION_JSON & String = js.native
      
      /* "text/html" */ val TEXT_HTML: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.ContentType.TEXT_HTML & String = js.native
      
      /* "text/plain" */ val TEXT_PLAIN: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.ContentType.TEXT_PLAIN & String = js.native
    }
    
    /** **`2017-09-21`:** Deprecated. The service continues to accept the parameter for backward-compatibility, but the parameter no longer affects the response. **`2016-05-19`:** A comma-separated list of tones for which the service is to return its analysis of the input; the indicated tones apply both to the full document and to individual sentences of the document. You can specify one or more of the valid values. Omit the parameter to request results for all three tones. */
    @JSImport("watson-developer-cloud/sdk", "ToneAnalyzerV3.ToneConstants.Tones")
    @js.native
    object Tones extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.Tones & String
          ] = js.native
      
      /* "emotion" */ val EMOTION: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.Tones.EMOTION & String = js.native
      
      /* "language" */ val LANGUAGE: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.Tones.LANGUAGE & String = js.native
      
      /* "social" */ val SOCIAL: typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants.Tones.SOCIAL & String = js.native
    }
  }
  
  /* static member */
  @JSImport("watson-developer-cloud/sdk", "ToneAnalyzerV3.URL")
  @js.native
  def URL: String = js.native
  @scala.inline
  def URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("URL")(x.asInstanceOf[js.Any])
}
