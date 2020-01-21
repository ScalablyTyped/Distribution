package typings.twilioMcsClient.mod

import typings.node.Buffer
import typings.std.FormData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc A Client provides an interface for Media Content Service
  */
@JSImport("twilio-mcs-client", "Client")
@js.native
class Client protected () extends js.Object {
  /**
    * @param {String} token - Access token
    * @param {String} baseUrl - Base URL for Media Content Service, i.e. /v1/Services/{serviceSid}/Media
    * @param {Client#ClientOptions} [options] - Options to customize the Client
    */
  def this(token: String, baseUrl: String) = this()
  def this(token: String, baseUrl: String, options: Options) = this()
  var config: js.Any = js.native
  var network: js.Any = js.native
  var options: js.Any = js.native
  val transport: js.Any = js.native
  /**
    * Gets media from media service
    * @param {String} sid - Media's SID
    * @public
    * @returns {Promise<Media>}
    */
  def get(sid: String): js.Promise[typings.twilioMcsClient.mediaMod.Media] = js.native
  /**
    * Posts raw content to media service
    * @param {String} contentType - content type of media
    * @param {String|Buffer} media - content to post
    * @public
    * @returns {Promise<Media>}
    */
  def post(contentType: String, media: String): js.Promise[typings.twilioMcsClient.mediaMod.Media] = js.native
  def post(contentType: String, media: Buffer): js.Promise[typings.twilioMcsClient.mediaMod.Media] = js.native
  /**
    * Posts FormData to media service. Can be used only with browser engine's FormData.
    * In non-browser FormData case the method will do promise reject with
    * new TypeError("Posting FormData supported only with browser engine's FormData")
    * @param {FormData} formData - form data to post
    * @public
    * @returns {Promise<Media>}
    */
  def postFormData(formData: FormData): js.Promise[typings.twilioMcsClient.mediaMod.Media] = js.native
  /**
    * These options can be passed to Client constructor
    * @typedef {Object} Client#ClientOptions
    * @property {String} [logLevel='error'] - The level of logging to enable. Valid options
    *   (from strictest to broadest): ['silent', 'error', 'warn', 'info', 'debug', 'trace']
    */
  /**
    * Update the token used for Client operations
    * @param {String} token - The JWT string of the new token
    * @public
    * @returns {void}
    */
  def updateToken(token: String): Unit = js.native
}

/* static members */
@JSImport("twilio-mcs-client", "Client")
@js.native
object Client extends js.Object {
  val version: String = js.native
}

