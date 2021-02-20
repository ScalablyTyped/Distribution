package typings.twilioMcsClient

import typings.std.Date
import typings.twilioMcsClient.configurationMod.Configuration
import typings.twilioMcsClient.networkMod.Network
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaMod {
  
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
  class Media protected () extends StObject {
    def this(config: Configuration, network: Network, data: js.Any) = this()
    
    var _update: js.Any = js.native
    
    var config: js.Any = js.native
    
    def contentType: String = js.native
    
    def dateCreated: Date = js.native
    
    def dateUpdated: Date = js.native
    
    def fileName: String = js.native
    
    /**
      * Returns direct content URL to uploaded binary
      * @public
      * @returns {Promise<string>}
      */
    def getContentUrl(): js.Promise[String] = js.native
    
    var network: js.Any = js.native
    
    def serviceSid: String = js.native
    
    def sid: String = js.native
    
    def size: Double = js.native
    
    var state: js.Any = js.native
  }
}
