package typings
package twilioDashMcsDashClientLib.libMediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc A Media represents a metadata information for the media upload
  * @property {String} sid - The server-assigned unique identifier for Media
  * @property {String} serviceSid - Service instance id which Media belongs/uploaded to
  * @property {Date} dateCreated - When the Media was created
  * @property {Date} dateUpdated - When the Media was updated
  * @property {Number} size - Size of media, bytes
  * @property {String} contentType - content type of media
  * @property {String} fileName - file name, if present, null otherwise
  */
@JSImport("twilio-mcs-client/lib/media", "Media")
@js.native
class Media protected () extends js.Object {
  def this(config: twilioDashMcsDashClientLib.libConfigurationMod.Configuration, network: twilioDashMcsDashClientLib.libServicesNetworkMod.Network, data: js.Any) = this()
  var _update: js.Any = js.native
  var config: js.Any = js.native
  val contentType: java.lang.String = js.native
  val dateCreated: stdLib.Date = js.native
  val dateUpdated: stdLib.Date = js.native
  val fileName: java.lang.String = js.native
  var network: js.Any = js.native
  val serviceSid: java.lang.String = js.native
  val sid: java.lang.String = js.native
  val size: scala.Double = js.native
  var state: js.Any = js.native
  /**
    * Returns direct content URL to uploaded binary
    * @public
    * @returns {Promise<string>}
    */
  def getContentUrl(): js.Promise[java.lang.String] = js.native
}

