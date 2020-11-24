package typings.watsonDeveloperCloud.synthesizeStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * pipe()-able Node.js Readable stream - accepts text in the constructor and emits binary audio data in its 'message' events
  *
  * Cannot be instantiated directly, instead created by calling #synthesizeUsingWebSocket()
  *
  * Uses WebSockets under the hood.
  * @param {Object} options
  * @constructor
  */
@JSImport("watson-developer-cloud/lib/synthesize-stream", JSImport.Namespace)
@js.native
class ^ protected () extends SynthesizeStream {
  /**
    * pipe()-able Node.js Readable stream - accepts text and emits binary audio data in its 'message' events
    *
    * Uses WebSockets under the hood.
    *
    *
    * Note that the WebSocket connection is not established until the first chunk of data is recieved. This allows for IAM token request management by the SDK.
    *
    * @param {Object} options
    * @param {String} options.text - The text that us to be synthesized. Provide plain text or text that is annotated with SSML. SSML input can include the SSML <mark> element. Pass a maximum of 5 KB of text.
    * @param {String} options.accept - The requested audio format (MIME type) of the audio.
    * @param {String[]} [options.timings] - An array that specifies whether the service is to return word timing information for all strings of the input text
    * @param {String} [options.voice='en-US_MichaelVoice'] - The voice that is to be used for the synthesis.
    * @param {String} [options.customization_id] - The customization ID (GUID) of a custom voice model that is to be used for the synthesis.
    * @param {String} [options.url='wss://stream.watsonplatform.net/speech-to-text/api'] base URL for service
    * @param {String} [options.watson-token] - Auth token
    * @param {String} [options.access_token] - IAM auth token
    * @param {Object} [options.headers] - Only works in Node.js, not in browsers. Allows for custom headers to be set, including an Authorization header (preventing the need for auth tokens)
    * @param {Boolean} [options.x-watson-learning-opt-out=false] - set to true to opt-out of allowing Watson to use this request to improve it's services
    * @param {String} [options.x-watson-metadata] - Associates a customer ID with data that is passed over the connection.
    * @param {IamTokenManagerV1} [options.token_manager] - Token manager for authenticating with IAM
    * @param {Boolean} [options.rejectUnauthorized] - If true, disable SSL verification for the WebSocket connection
    *
    * @constructor
    */
  def this(options: js.Any) = this()
}
@JSImport("watson-developer-cloud/lib/synthesize-stream", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  var WEBSOCKET_CONNECTION_ERROR: String = js.native
}
