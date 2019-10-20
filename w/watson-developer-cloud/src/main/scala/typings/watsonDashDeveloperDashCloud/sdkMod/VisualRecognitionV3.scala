package typings.watsonDashDeveloperDashCloud.sdkMod

import typings.watsonDashDeveloperDashCloud.visualDashRecognitionV3DashGeneratedMod.Options
import typings.watsonDashDeveloperDashCloud.visualDashRecognitionV3DashGeneratedMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The IBM Watson&trade; Visual Recognition service uses deep learning algorithms to identify scenes, objects, and faces  in images you upload to the service. You can create and train a custom classifier to identify subjects that suit your needs.
  */
@JSImport("watson-developer-cloud/sdk", "VisualRecognitionV3")
@js.native
class VisualRecognitionV3 protected () extends ^ {
  /**
    * Construct a VisualRecognitionV3 object.
    *
    * @param {Object} options - Options for the service.
    * @param {string} options.version - The API version date to use with the service, in "YYYY-MM-DD" format. Whenever the API is changed in a backwards incompatible way, a new minor version of the API is released. The service uses the API version for the date you specify, or the most recent version before that date. Note that you should not programmatically specify the current date at runtime, in case the API has been updated since your application's release. Instead, specify a version date that is compatible with your application, and don't change it until your application is ready for a later version.
    * @param {string} [options.url] - The base url to use when contacting the service (e.g. 'https://gateway.watsonplatform.net/visual-recognition/api'). The base url may differ between Bluemix regions.
    * @param {string} [options.iam_access_token] - An IAM access token fully managed by the application. Responsibility falls on the application to refresh the token, either before it expires or reactively upon receiving a 401 from the service, as any requests made with an expired token will fail.
    * @param {string} [options.iam_apikey] - An API key that can be used to request IAM tokens. If this API key is provided, the SDK will manage the token and handle the refreshing.
    * @param {string} [options.iam_url] - An optional URL for the IAM service API. Defaults to 'https://iam.bluemix.net/identity/token'.
    * @param {boolean} [options.use_unauthenticated] - Set to `true` to avoid including an authorization header. This option may be useful for requests that are proxied.
    * @param {Object} [options.headers] - Default headers that shall be included with every request to the service.
    * @param {boolean} [options.headers.X-Watson-Learning-Opt-Out] - Set to `true` to opt-out of data collection. By default, all IBM Watson services log requests and their results. Logging is done only to improve the services for future users. The logged data is not shared or made public. If you are concerned with protecting the privacy of users' personal information or otherwise do not want your requests to be logged, you can opt out of logging.
    * @constructor
    * @returns {VisualRecognitionV3}
    * @throws {Error}
    */
  def this(options: Options) = this()
}

/* static members */
@JSImport("watson-developer-cloud/sdk", "VisualRecognitionV3")
@js.native
object VisualRecognitionV3 extends js.Object {
  var URL: String = js.native
  /** Constants for the `classify` operation. */
  @js.native
  object ClassifyConstants extends js.Object {
    /** The desired language of parts of the response. See the response for details. */
    @js.native
    object AcceptLanguage extends js.Object {
      /* "ar" */ val AR: typings.watsonDashDeveloperDashCloud.visualDashRecognitionV3DashGeneratedMod.ClassifyConstants.AcceptLanguage.AR with String = js.native
      /* "de" */ val DE: typings.watsonDashDeveloperDashCloud.visualDashRecognitionV3DashGeneratedMod.ClassifyConstants.AcceptLanguage.DE with String = js.native
      /* "en" */ val EN: typings.watsonDashDeveloperDashCloud.visualDashRecognitionV3DashGeneratedMod.ClassifyConstants.AcceptLanguage.EN with String = js.native
      /* "es" */ val ES: typings.watsonDashDeveloperDashCloud.visualDashRecognitionV3DashGeneratedMod.ClassifyConstants.AcceptLanguage.ES with String = js.native
      /* "fr" */ val FR: typings.watsonDashDeveloperDashCloud.visualDashRecognitionV3DashGeneratedMod.ClassifyConstants.AcceptLanguage.FR with String = js.native
      /* "it" */ val IT: typings.watsonDashDeveloperDashCloud.visualDashRecognitionV3DashGeneratedMod.ClassifyConstants.AcceptLanguage.IT with String = js.native
      /* "ja" */ val JA: typings.watsonDashDeveloperDashCloud.visualDashRecognitionV3DashGeneratedMod.ClassifyConstants.AcceptLanguage.JA with String = js.native
      /* "ko" */ val KO: typings.watsonDashDeveloperDashCloud.visualDashRecognitionV3DashGeneratedMod.ClassifyConstants.AcceptLanguage.KO with String = js.native
      /* "pt-br" */ val PT_BR: typings.watsonDashDeveloperDashCloud.visualDashRecognitionV3DashGeneratedMod.ClassifyConstants.AcceptLanguage.PT_BR with String = js.native
      /* "zh-cn" */ val ZH_CN: typings.watsonDashDeveloperDashCloud.visualDashRecognitionV3DashGeneratedMod.ClassifyConstants.AcceptLanguage.ZH_CN with String = js.native
      /* "zh-tw" */ val ZH_TW: typings.watsonDashDeveloperDashCloud.visualDashRecognitionV3DashGeneratedMod.ClassifyConstants.AcceptLanguage.ZH_TW with String = js.native
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDashDeveloperDashCloud.visualDashRecognitionV3DashGeneratedMod.ClassifyConstants.AcceptLanguage with String
          ] = js.native
    }
    
  }
  
  /** Constants for the `detectFaces` operation. */
  @js.native
  object DetectFacesConstants extends js.Object {
    /** The desired language of parts of the response. See the response for details. */
    @js.native
    object AcceptLanguage extends js.Object {
      /* "ar" */ val AR: typings.watsonDashDeveloperDashCloud.visualDashRecognitionV3DashGeneratedMod.DetectFacesConstants.AcceptLanguage.AR with String = js.native
      /* "de" */ val DE: typings.watsonDashDeveloperDashCloud.visualDashRecognitionV3DashGeneratedMod.DetectFacesConstants.AcceptLanguage.DE with String = js.native
      /* "en" */ val EN: typings.watsonDashDeveloperDashCloud.visualDashRecognitionV3DashGeneratedMod.DetectFacesConstants.AcceptLanguage.EN with String = js.native
      /* "es" */ val ES: typings.watsonDashDeveloperDashCloud.visualDashRecognitionV3DashGeneratedMod.DetectFacesConstants.AcceptLanguage.ES with String = js.native
      /* "fr" */ val FR: typings.watsonDashDeveloperDashCloud.visualDashRecognitionV3DashGeneratedMod.DetectFacesConstants.AcceptLanguage.FR with String = js.native
      /* "it" */ val IT: typings.watsonDashDeveloperDashCloud.visualDashRecognitionV3DashGeneratedMod.DetectFacesConstants.AcceptLanguage.IT with String = js.native
      /* "ja" */ val JA: typings.watsonDashDeveloperDashCloud.visualDashRecognitionV3DashGeneratedMod.DetectFacesConstants.AcceptLanguage.JA with String = js.native
      /* "ko" */ val KO: typings.watsonDashDeveloperDashCloud.visualDashRecognitionV3DashGeneratedMod.DetectFacesConstants.AcceptLanguage.KO with String = js.native
      /* "pt-br" */ val PT_BR: typings.watsonDashDeveloperDashCloud.visualDashRecognitionV3DashGeneratedMod.DetectFacesConstants.AcceptLanguage.PT_BR with String = js.native
      /* "zh-cn" */ val ZH_CN: typings.watsonDashDeveloperDashCloud.visualDashRecognitionV3DashGeneratedMod.DetectFacesConstants.AcceptLanguage.ZH_CN with String = js.native
      /* "zh-tw" */ val ZH_TW: typings.watsonDashDeveloperDashCloud.visualDashRecognitionV3DashGeneratedMod.DetectFacesConstants.AcceptLanguage.ZH_TW with String = js.native
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.watsonDashDeveloperDashCloud.visualDashRecognitionV3DashGeneratedMod.DetectFacesConstants.AcceptLanguage with String
          ] = js.native
    }
    
  }
  
}

