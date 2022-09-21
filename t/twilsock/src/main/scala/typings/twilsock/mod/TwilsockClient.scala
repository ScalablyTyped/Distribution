package typings.twilsock.mod

import typings.node.eventsMod.EventEmitter
import typings.std.Record
import typings.twilsock.anon.PartialClientOptionsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @alias Twilsock
  * @classdesc Client library for the Twilsock service
  * It allows to recevie service-generated updates as well as bi-directional transport
  * @fires Twilsock#message
  * @fires Twilsock#connected
  * @fires Twilsock#disconnected
  * @fires Twilsock#tokenAboutToExpire
  * @fires Twilsock#tokenExpired
  * @fires Twilsock#stateChanged
  * @fires Twilsock#connectionError
  */
@JSImport("twilsock", "TwilsockClient")
@js.native
open class TwilsockClient protected () extends EventEmitter {
  /**
    * @param {string} token Twilio access token
    * @param {string} productId Product identifier. Should be the same as a grant name in token
    * @param {object} options Twilsock configuration options
    */
  def this(token: String, productId: String, options: PartialClientOptionsType) = this()
  
  /**
    * Submits internal telemetry event. Not to be used for any customer and/or sensitive data.
    * @param {TelemetryEventDescription} event Event details.
    * @param {string} eventKey Unique event key.
    * @param {TelemetryPoint} point Is this partial event for start or end of measurement.
    * @returns {void}
    */
  def addPartialTelemetryEvent(event: TelemetryEventDescription, eventKey: String, point: TelemetryPoint): Unit = js.native
  
  /**
    * Submits internal telemetry event. Not to be used for any customer and/or sensitive data.
    * @param {TelemetryEventDescription} event Event details.
    * @returns {void}
    */
  def addTelemetryEvent(event: TelemetryEventDescription): Unit = js.native
  
  /* private */ val channel: Any = js.native
  
  /* private */ val config: Any = js.native
  
  /**
    * Connect to the server
    * @fires Twilsock#connected
    * @public
    * @returns {void}
    */
  def connect(): Unit = js.native
  
  /**
    * Delete HTTP request to upstream service
    * @param {string} url Upstream service url
    * @param {headers} headers Set of custom headers
    * @param {body} body Body to send
    * @param {string} [grant] The product grant
    * @returns {Promise}
    */
  def delete[T /* <: Record[String, Any] */](url: String, headers: Headers): js.Promise[Result[Context[T]]] = js.native
  def delete[T /* <: Record[String, Any] */](url: String, headers: Headers, body: String): js.Promise[Result[Context[T]]] = js.native
  def delete[T /* <: Record[String, Any] */](url: String, headers: Headers, body: String, grant: String): js.Promise[Result[Context[T]]] = js.native
  def delete[T /* <: Record[String, Any] */](url: String, headers: Headers, body: Unit, grant: String): js.Promise[Result[Context[T]]] = js.native
  def delete[T /* <: Record[String, Any] */](url: String, headers: Headers, body: Context[Record[String, Any]]): js.Promise[Result[Context[T]]] = js.native
  def delete[T /* <: Record[String, Any] */](url: String, headers: Headers, body: Context[Record[String, Any]], grant: String): js.Promise[Result[Context[T]]] = js.native
  
  /**
    * Disconnect from the server
    * @fires Twilsock#disconnected
    * @public
    * @returns {Promise}
    */
  def disconnect(): js.Promise[Unit] = js.native
  
  /**
    * Get HTTP request to upstream service
    * @param {string} url Upstream service url
    * @param {headers} headers Set of custom headers
    * @param {string} [grant] The product grant
    * @returns {Promise}
    */
  def get(url: String, headers: Headers): js.Promise[Result[Context[Record[String, Any]]]] = js.native
  def get(url: String, headers: Headers, grant: String): js.Promise[Result[Context[Record[String, Any]]]] = js.native
  
  /* private */ var handleStorageId: Any = js.native
  
  /**
    * Indicates if twilsock is connected now
    * @returns {Boolean}
    */
  def isConnected: Boolean = js.native
  
  /* private */ var offlineStorageDeferred: Any = js.native
  
  def post[T /* <: Record[String, Any] */](url: String, headers: Headers, body: String): js.Promise[Result[Context[T]]] = js.native
  def post[T /* <: Record[String, Any] */](url: String, headers: Headers, body: String, grant: String): js.Promise[Result[Context[T]]] = js.native
  /**
    * Post HTTP request to upstream service
    * @param {string} url Upstream service url
    * @param {headers} headers Set of custom headers
    * @param {body} body Body to send
    * @param {string} [grant] The product grant
    * @returns {Promise}
    */
  def post[T /* <: Record[String, Any] */](url: String, headers: Headers, body: Context[Record[String, Any]]): js.Promise[Result[Context[T]]] = js.native
  def post[T /* <: Record[String, Any] */](url: String, headers: Headers, body: Context[Record[String, Any]], grant: String): js.Promise[Result[Context[T]]] = js.native
  
  def put[T /* <: Record[String, Any] */](url: String, headers: Headers, body: String): js.Promise[Result[Context[T]]] = js.native
  def put[T /* <: Record[String, Any] */](url: String, headers: Headers, body: String, grant: String): js.Promise[Result[Context[T]]] = js.native
  /**
    * Put HTTP request to upstream service
    * @param {string} url Upstream service url
    * @param {headers} headers Set of custom headers
    * @param {body} body Body to send
    * @param {string} [grant] The product grant
    * @returns {Promise}
    */
  def put[T /* <: Record[String, Any] */](url: String, headers: Headers, body: Context[Record[String, Any]]): js.Promise[Result[Context[T]]] = js.native
  def put[T /* <: Record[String, Any] */](url: String, headers: Headers, body: Context[Record[String, Any]], grant: String): js.Promise[Result[Context[T]]] = js.native
  
  /* private */ val registrations: Any = js.native
  
  /**
    * Remove notification context.
    * This method shouldn't be used anyone except twilio notifications library
    * @param contextId id of notification context
    * @private
    */
  def removeNotificationsContext(contextId: String): js.Promise[Unit] = js.native
  
  /**
    * Updates notification context.
    * This method shouldn't be used anyone except twilio notifications library
    * @param contextId id of notification context
    * @param context value of notification context
    * @private
    */
  def setNotificationsContext(contextId: String, context: Context[Record[String, Any]]): js.Promise[Unit] = js.native
  
  /**
    * Current state
    * @returns {ConnectionState}
    */
  def state: ConnectionState = js.native
  
  /**
    * Get offline storage ID
    * @returns {Promise}
    */
  def storageId(): js.Promise[OfflineProductStorage] = js.native
  
  /* private */ val telemetryTracker: Any = js.native
  
  /**
    * Update token
    * @param {String} token
    * @returns {Promise}
    */
  def updateToken(token: String): js.Promise[Unit] = js.native
  
  /* private */ val upstream: Any = js.native
  
  val version: String = js.native
}
