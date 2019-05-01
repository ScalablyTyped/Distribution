package typings
package twilioDashChatLib.libMediaMod

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
  val contentType: java.lang.String = js.native
  val filename: java.lang.String = js.native
  var mcsMedia: js.Any = js.native
  var services: js.Any = js.native
  val sid: java.lang.String = js.native
  val size: scala.Double = js.native
  var state: js.Any = js.native
  /**
    * Returns direct content URL for the media.
    * @returns {Promise<String>}
    */
  def getContentUrl(): js.Promise[java.lang.String] = js.native
}

