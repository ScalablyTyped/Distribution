package typings.twilsock

import typings.node.eventsMod.EventEmitter
import typings.twilsock.libClientMod.Context
import typings.twilsock.libClientMod.TwilsockClient
import typings.twilsock.libOfflinestorageMod.OfflineProductStorage
import typings.twilsock.libServicesUpstreamMod.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock/lib/client", JSImport.Namespace)
@js.native
object libClientMod extends js.Object {
  /**
    * @alias Twilsock
    * @classdesc Client library for the Twilsock service
    * It allows to recevie service-generated updates as well as bi-directional transport
    * @fires Twilsock#message
    * @fires Twilsock#connected
    * @fires Twilsock#disconnected
    * @fires Twilsock#tokenAboutToExpire
    * @fires Twilsock#stateChanged
    * @fires Twilsock#connectionError
    */
  @js.native
  class Twilsock protected () extends TwilsockClient {
    /**
      * @param {string} token Twilio access token
      * @param {string} productId Product identifier. Should be the same as a grant name in token
      */
    def this(token: String, productId: String) = this()
    def this(token: String, productId: String, options: js.Any) = this()
  }
  
  /**
    * @alias Twilsock
    * @classdesc Client library for the Twilsock service
    * It allows to recevie service-generated updates as well as bi-directional transport
    * @fires Twilsock#message
    * @fires Twilsock#connected
    * @fires Twilsock#disconnected
    * @fires Twilsock#tokenAboutToExpire
    * @fires Twilsock#stateChanged
    * @fires Twilsock#connectionError
    */
  @js.native
  class TwilsockClient protected () extends EventEmitter {
    /**
      * @param {string} token Twilio access token
      * @param {string} productId Product identifier. Should be the same as a grant name in token
      */
    def this(token: String, productId: String) = this()
    def this(token: String, productId: String, options: js.Any) = this()
    val channel: js.Any = js.native
    val config: js.Any = js.native
    var handleStorageId: js.Any = js.native
    /**
      * Indicates if twilsock is connected now
      * @returns {Boolean}
      */
    val isConnected: Boolean = js.native
    var offlineStorageDeferred: js.Any = js.native
    val registrations: js.Any = js.native
    /**
      * Current state
      * @returns {String}
      */
    val state: String = js.native
    val upstream: js.Any = js.native
    /**
      * Connect to the server
      * @fires Twilsock#connected
      * @public
      * @returns {Promise<void>}
      */
    def connect(): Unit = js.native
    /**
      * Delete HTTP request to upstream service
      * @param {string} url Upstream service url
      * @param {headers} headers Set of custom headers
      * @returns {Promise}
      */
    def delete(url: String, headers: js.Any): js.Promise[Result] = js.native
    /**
      * Disconnect from the server
      * @fires Twilsock#disconnected
      * @public
      * @returns {Promise<void>}
      */
    def disconnect(): js.Promise[Unit] = js.native
    /**
      * Get HTTP request to upstream service
      * @param {string} url Upstream service url
      * @param {headers} headers Set of custom headers
      * @returns {Promise}
      */
    def get(url: String, headers: js.Any): js.Promise[Result] = js.native
    /**
      * Post HTTP request to upstream service
      * @param {string} url Upstream service url
      * @param {headers} headers Set of custom headers
      * @param {body} body Body to send
      * @returns {Promise}
      */
    def post(url: String, headers: js.Any, body: js.Any): js.Promise[Result] = js.native
    /**
      * Put HTTP request to upstream service
      * @param {string} url Upstream service url
      * @param {headers} headers Set of custom headers
      * @param {body} body Body to send
      * @returns {Promise}
      */
    def put(url: String, headers: js.Any, body: js.Any): js.Promise[Result] = js.native
    /**
      * Remove notification context.
      * This method shouldn't be used anyone except twilio notifications library
      * @param contextId id of notification context
      * @private
      */
    def removeNotificationsContext(contextId: String): Unit = js.native
    /**
      * Updates notification context.
      * This method shouldn't be used anyone except twilio notifications library
      * @param contextId id of notification context
      * @param context value of notification context
      * @private
      */
    def setNotificationsContext(contextId: String, context: Context): Unit = js.native
    /**
      * Get offline storage ID
      * @returns {Promise<OfflineProductStorage>}
      */
    def storageId(): js.Promise[OfflineProductStorage] = js.native
    /**
      * Update token
      * @param {String} token
      * @returns {Promise<void>}
      */
    def updateToken(token: String): js.Promise[Unit] = js.native
  }
  
  type Context = typings.twilsock.libProtocolProtocolMod.Protocol.Context
}

