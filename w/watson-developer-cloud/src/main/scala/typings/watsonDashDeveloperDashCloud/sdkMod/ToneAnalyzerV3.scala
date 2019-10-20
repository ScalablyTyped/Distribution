package typings.watsonDashDeveloperDashCloud.sdkMod

import typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.Options
import typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

/* static members */
@JSImport("watson-developer-cloud/sdk", "ToneAnalyzerV3")
@js.native
object ToneAnalyzerV3 extends js.Object {
  var URL: String = js.native
  /** Constants for the `toneChat` operation. */
  @js.native
  object ToneChatConstants extends js.Object {
    /** The desired language of the response. For two-character arguments, regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. You can use different languages for **Content-Language** and **Accept-Language**. */
    @js.native
    object AcceptLanguage extends js.Object {
      /* "ar" */ val AR: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneChatConstants.AcceptLanguage.AR with String = js.native
      /* "de" */ val DE: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneChatConstants.AcceptLanguage.DE with String = js.native
      /* "en" */ val EN: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneChatConstants.AcceptLanguage.EN with String = js.native
      /* "es" */ val ES: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneChatConstants.AcceptLanguage.ES with String = js.native
      /* "fr" */ val FR: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneChatConstants.AcceptLanguage.FR with String = js.native
      /* "it" */ val IT: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneChatConstants.AcceptLanguage.IT with String = js.native
      /* "ja" */ val JA: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneChatConstants.AcceptLanguage.JA with String = js.native
      /* "ko" */ val KO: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneChatConstants.AcceptLanguage.KO with String = js.native
      /* "pt-br" */ val PT_BR: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneChatConstants.AcceptLanguage.PT_BR with String = js.native
      /* "zh-cn" */ val ZH_CN: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneChatConstants.AcceptLanguage.ZH_CN with String = js.native
      /* "zh-tw" */ val ZH_TW: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneChatConstants.AcceptLanguage.ZH_TW with String = js.native
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneChatConstants.AcceptLanguage with String
          ] = js.native
    }
    
    /** The language of the input text for the request: English or French. Regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. The input content must match the specified language. Do not submit content that contains both languages. You can use different languages for **Content-Language** and **Accept-Language**. * **`2017-09-21`:** Accepts `en` or `fr`. * **`2016-05-19`:** Accepts only `en`. */
    @js.native
    object ContentLanguage extends js.Object {
      /* "en" */ val EN: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneChatConstants.ContentLanguage.EN with String = js.native
      /* "fr" */ val FR: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneChatConstants.ContentLanguage.FR with String = js.native
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneChatConstants.ContentLanguage with String
          ] = js.native
    }
    
  }
  
  /** Constants for the `tone` operation. */
  @js.native
  object ToneConstants extends js.Object {
    /** The desired language of the response. For two-character arguments, regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. You can use different languages for **Content-Language** and **Accept-Language**. */
    @js.native
    object AcceptLanguage extends js.Object {
      /* "ar" */ val AR: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.AcceptLanguage.AR with String = js.native
      /* "de" */ val DE: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.AcceptLanguage.DE with String = js.native
      /* "en" */ val EN: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.AcceptLanguage.EN with String = js.native
      /* "es" */ val ES: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.AcceptLanguage.ES with String = js.native
      /* "fr" */ val FR: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.AcceptLanguage.FR with String = js.native
      /* "it" */ val IT: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.AcceptLanguage.IT with String = js.native
      /* "ja" */ val JA: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.AcceptLanguage.JA with String = js.native
      /* "ko" */ val KO: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.AcceptLanguage.KO with String = js.native
      /* "pt-br" */ val PT_BR: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.AcceptLanguage.PT_BR with String = js.native
      /* "zh-cn" */ val ZH_CN: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.AcceptLanguage.ZH_CN with String = js.native
      /* "zh-tw" */ val ZH_TW: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.AcceptLanguage.ZH_TW with String = js.native
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.AcceptLanguage with String
          ] = js.native
    }
    
    /** The language of the input text for the request: English or French. Regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. The input content must match the specified language. Do not submit content that contains both languages. You can use different languages for **Content-Language** and **Accept-Language**. * **`2017-09-21`:** Accepts `en` or `fr`. * **`2016-05-19`:** Accepts only `en`. */
    @js.native
    object ContentLanguage extends js.Object {
      /* "en" */ val EN: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.ContentLanguage.EN with String = js.native
      /* "fr" */ val FR: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.ContentLanguage.FR with String = js.native
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.ContentLanguage with String
          ] = js.native
    }
    
    /** The type of the input. A character encoding can be specified by including a `charset` parameter. For example, 'text/plain;charset=utf-8'. */
    @js.native
    object ContentType extends js.Object {
      /* "application/json" */ val APPLICATION_JSON: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.ContentType.APPLICATION_JSON with String = js.native
      /* "text/html" */ val TEXT_HTML: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.ContentType.TEXT_HTML with String = js.native
      /* "text/plain" */ val TEXT_PLAIN: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.ContentType.TEXT_PLAIN with String = js.native
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.ContentType with String
          ] = js.native
    }
    
    /** **`2017-09-21`:** Deprecated. The service continues to accept the parameter for backward-compatibility, but the parameter no longer affects the response. **`2016-05-19`:** A comma-separated list of tones for which the service is to return its analysis of the input; the indicated tones apply both to the full document and to individual sentences of the document. You can specify one or more of the valid values. Omit the parameter to request results for all three tones. */
    @js.native
    object Tones extends js.Object {
      /* "emotion" */ val EMOTION: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.Tones.EMOTION with String = js.native
      /* "language" */ val LANGUAGE: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.Tones.LANGUAGE with String = js.native
      /* "social" */ val SOCIAL: typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.Tones.SOCIAL with String = js.native
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod.ToneConstants.Tones with String
          ] = js.native
    }
    
  }
  
}

