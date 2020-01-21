package typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ### Service Overview The IBM&reg; Text to Speech service provides APIs that use IBM's speech-synthesis capabilities to synthesize text into natural-sounding speech in a variety of languages, dialects, and voices. The service supports at least one male or female voice, sometimes both, for each language. The audio is streamed back to the client with minimal delay.   For speech synthesis, the service supports a synchronous HTTP Representational State Transfer (REST) interface. It also supports a WebSocket interface that provides both plain text and SSML input, including the SSML &lt;mark&gt; element and word timings. SSML is an XML-based markup language that provides text annotation for speech-synthesis applications.   The service also offers a customization interface. You can use the interface to define sounds-like or phonetic translations for words. A sounds-like translation consists of one or more words that, when combined, sound like the word. A phonetic translation is based on the SSML phoneme format for representing a word. You can specify a phonetic translation in standard International Phonetic Alphabet (IPA) representation or in the proprietary IBM Symbolic Phonetic Representation (SPR).
  */
@JSImport("watson-developer-cloud/text-to-speech/v1-generated", JSImport.Namespace)
@js.native
class ^ protected () extends TextToSpeechV1 {
  /**
    * Construct a TextToSpeechV1 object.
    *
    * @param {Object} options - Options for the service.
    * @param {string} [options.url] - The base url to use when contacting the service (e.g. 'https://gateway.watsonplatform.net/text-to-speech/api'). The base url may differ between Bluemix regions.
    * @param {string} [options.username] - The username used to authenticate with the service. Username and password credentials are only required to run your application locally or outside of Bluemix. When running on Bluemix, the credentials will be automatically loaded from the `VCAP_SERVICES` environment variable.
    * @param {string} [options.password] - The password used to authenticate with the service. Username and password credentials are only required to run your application locally or outside of Bluemix. When running on Bluemix, the credentials will be automatically loaded from the `VCAP_SERVICES` environment variable.
    * @param {string} [options.iam_access_token] - An IAM access token fully managed by the application. Responsibility falls on the application to refresh the token, either before it expires or reactively upon receiving a 401 from the service, as any requests made with an expired token will fail.
    * @param {string} [options.iam_apikey] - An API key that can be used to request IAM tokens. If this API key is provided, the SDK will manage the token and handle the refreshing.
    * @param {string} [options.iam_url] - An optional URL for the IAM service API. Defaults to 'https://iam.bluemix.net/identity/token'.
    * @param {boolean} [options.use_unauthenticated] - Set to `true` to avoid including an authorization header. This option may be useful for requests that are proxied.
    * @param {Object} [options.headers] - Default headers that shall be included with every request to the service.
    * @param {boolean} [options.headers.X-Watson-Learning-Opt-Out] - Set to `true` to opt-out of data collection. By default, all IBM Watson services log requests and their results. Logging is done only to improve the services for future users. The logged data is not shared or made public. If you are concerned with protecting the privacy of users' personal information or otherwise do not want your requests to be logged, you can opt out of logging.
    * @constructor
    * @returns {TextToSpeechV1}
    */
  def this(options: Options) = this()
}

@JSImport("watson-developer-cloud/text-to-speech/v1-generated", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var URL: String = js.native
}

