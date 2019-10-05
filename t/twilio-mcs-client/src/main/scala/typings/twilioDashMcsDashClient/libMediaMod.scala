package typings.twilioDashMcsDashClient

import typings.std.Date
import typings.twilioDashMcsDashClient.libConfigurationMod.Configuration
import typings.twilioDashMcsDashClient.libServicesNetworkMod.Network
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-mcs-client/lib/media", JSImport.Namespace)
@js.native
object libMediaMod extends js.Object {
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
  @js.native
  class Media protected () extends js.Object {
    def this(config: Configuration, network: Network, data: js.Any) = this()
    var _update: js.Any = js.native
    var config: js.Any = js.native
    val contentType: String = js.native
    val dateCreated: Date = js.native
    val dateUpdated: Date = js.native
    val fileName: String = js.native
    var network: js.Any = js.native
    val serviceSid: String = js.native
    val sid: String = js.native
    val size: Double = js.native
    var state: js.Any = js.native
    /**
      * Returns direct content URL to uploaded binary
      * @public
      * @returns {Promise<string>}
      */
    def getContentUrl(): js.Promise[String] = js.native
  }
  
}

