package typings.twilioChat.mediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc A Media represents a media information for Message in a Channel.
  * @property {String} contentType - content type of media
  * @property {String} sid - The server-assigned unique identifier for Media
  * @property {Number} size - Size of media, bytes
  * @property {String} [filename] - file name if present, null otherwise
  */
@JSImport("twilio-chat/lib/media", "Media")
@js.native
class Media protected () extends js.Object {
  def this(data: MediaState, services: MediaServices) = this()
  var mcsMedia: js.Any = js.native
  var services: js.Any = js.native
  var state: js.Any = js.native
  def contentType: String = js.native
  def filename: String = js.native
  /**
    * Returns direct content URL for the media.
    *
    * This URL is impermanent, it will expire in several minutes and cannot be cached.
    * If the URL becomes expired, you need to request a new one.
    * Each call to this function produces a new temporary URL.
    *
    * @returns {Promise<String>}
    */
  def getContentTemporaryUrl(): js.Promise[String] = js.native
  def sid: String = js.native
  def size: Double = js.native
}

