package typings.twilioMcsClient

import typings.node.Buffer
import typings.std.FormData
import typings.twilioMcsClient.configurationMod.Configuration
import typings.twilioMcsClient.networkMod.Network
import typings.twilioMcsClient.transportMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @classdesc A Client provides an interface for Media Content Service
    */
  @JSImport("twilio-mcs-client", JSImport.Default)
  @js.native
  class default protected () extends Client {
    /**
      * @param {String} token - Access token
      * @param {String} baseUrl - Base URL for Media Content Service, i.e. /v1/Services/{serviceSid}/Media
      * @param {Client#ClientOptions} [options] - Options to customize the Client
      */
    def this(token: String, baseUrl: String) = this()
    def this(token: String, baseUrl: String, options: Options) = this()
  }
  object default {
    
    /* static member */
    @JSImport("twilio-mcs-client", "default.version")
    @js.native
    val version: String = js.native
  }
  
  /**
    * @classdesc A Client provides an interface for Media Content Service
    */
  @JSImport("twilio-mcs-client", "Client")
  @js.native
  class Client protected () extends StObject {
    /**
      * @param {String} token - Access token
      * @param {String} baseUrl - Base URL for Media Content Service, i.e. /v1/Services/{serviceSid}/Media
      * @param {Client#ClientOptions} [options] - Options to customize the Client
      */
    def this(token: String, baseUrl: String) = this()
    def this(token: String, baseUrl: String, options: Options) = this()
    
    var config: js.Any = js.native
    
    /**
      * Gets media from media service
      * @param {String} sid - Media's SID
      * @public
      * @returns {Promise<Media>}
      */
    def get(sid: String): js.Promise[typings.twilioMcsClient.mediaMod.Media] = js.native
    
    var network: js.Any = js.native
    
    var options: js.Any = js.native
    
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
    
    val transport: js.Any = js.native
    
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
  object Client {
    
    /* static member */
    @JSImport("twilio-mcs-client", "Client.version")
    @js.native
    val version: String = js.native
  }
  
  /**
    * @classdesc A Client provides an interface for Media Content Service
    */
  @JSImport("twilio-mcs-client", "McsClient")
  @js.native
  class McsClient protected () extends Client {
    /**
      * @param {String} token - Access token
      * @param {String} baseUrl - Base URL for Media Content Service, i.e. /v1/Services/{serviceSid}/Media
      * @param {Client#ClientOptions} [options] - Options to customize the Client
      */
    def this(token: String, baseUrl: String) = this()
    def this(token: String, baseUrl: String, options: Options) = this()
  }
  object McsClient {
    
    /* static member */
    @JSImport("twilio-mcs-client", "McsClient.version")
    @js.native
    val version: String = js.native
  }
  
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
  @JSImport("twilio-mcs-client", "McsMedia")
  @js.native
  class McsMedia protected ()
    extends typings.twilioMcsClient.mediaMod.Media {
    def this(config: Configuration, network: Network, data: js.Any) = this()
  }
  
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
  @JSImport("twilio-mcs-client", "Media")
  @js.native
  class Media protected ()
    extends typings.twilioMcsClient.mediaMod.Media {
    def this(config: Configuration, network: Network, data: js.Any) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilioMcsClient.twilioMcsClientStrings.trace
    - typings.twilioMcsClient.twilioMcsClientStrings.debug
    - typings.twilioMcsClient.twilioMcsClientStrings.info
    - typings.twilioMcsClient.twilioMcsClientStrings.warn
    - typings.twilioMcsClient.twilioMcsClientStrings.error
    - typings.twilioMcsClient.twilioMcsClientStrings.silent
    - scala.Null
  */
  type LogLevel = _LogLevel | Null
  
  trait Options extends StObject {
    
    var logLevel: js.UndefOr[LogLevel] = js.undefined
    
    var region: js.UndefOr[String] = js.undefined
    
    var transport: js.UndefOr[Transport] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogLevelNull: Self = StObject.set(x, "logLevel", null)
      
      @scala.inline
      def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      @scala.inline
      def setTransport(value: Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    }
  }
  
  trait _LogLevel extends StObject
}
