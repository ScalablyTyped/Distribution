package typings.twilioDashChat.libMediaMod

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
  val contentType: String = js.native
  val filename: String = js.native
  var mcsMedia: js.Any = js.native
  var services: js.Any = js.native
  val sid: String = js.native
  val size: Double = js.native
  var state: js.Any = js.native
  /**
    * Returns direct content URL for the media.
    * @returns {Promise<String>}
    */
  def getContentUrl(): js.Promise[String] = js.native
}

