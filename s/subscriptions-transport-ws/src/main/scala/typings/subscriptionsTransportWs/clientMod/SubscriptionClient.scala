package typings.subscriptionsTransportWs.clientMod

import org.scalablytyped.runtime.StringDictionary
import typings.eventemitter3.mod.ListenerFn
import typings.graphql.executeMod.ExecutionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("subscriptions-transport-ws/dist/client", "SubscriptionClient")
@js.native
class SubscriptionClient protected () extends js.Object {
  def this(url: String) = this()
  def this(url: String, options: ClientOptions) = this()
  def this(url: String, options: js.UndefOr[scala.Nothing], webSocketImpl: js.Any) = this()
  def this(url: String, options: ClientOptions, webSocketImpl: js.Any) = this()
  def this(
    url: String,
    options: js.UndefOr[scala.Nothing],
    webSocketImpl: js.UndefOr[scala.Nothing],
    webSocketProtocols: String
  ) = this()
  def this(
    url: String,
    options: js.UndefOr[scala.Nothing],
    webSocketImpl: js.UndefOr[scala.Nothing],
    webSocketProtocols: js.Array[String]
  ) = this()
  def this(url: String, options: js.UndefOr[scala.Nothing], webSocketImpl: js.Any, webSocketProtocols: String) = this()
  def this(
    url: String,
    options: js.UndefOr[scala.Nothing],
    webSocketImpl: js.Any,
    webSocketProtocols: js.Array[String]
  ) = this()
  def this(
    url: String,
    options: ClientOptions,
    webSocketImpl: js.UndefOr[scala.Nothing],
    webSocketProtocols: String
  ) = this()
  def this(
    url: String,
    options: ClientOptions,
    webSocketImpl: js.UndefOr[scala.Nothing],
    webSocketProtocols: js.Array[String]
  ) = this()
  def this(url: String, options: ClientOptions, webSocketImpl: js.Any, webSocketProtocols: String) = this()
  def this(url: String, options: ClientOptions, webSocketImpl: js.Any, webSocketProtocols: js.Array[String]) = this()
  var backoff: js.Any = js.native
  var buildMessage: js.Any = js.native
  var checkConnection: js.Any = js.native
  var checkConnectionIntervalId: js.Any = js.native
  var checkMaxConnectTimeout: js.Any = js.native
  var checkOperationOptions: js.Any = js.native
  var clearCheckConnectionInterval: js.Any = js.native
  var clearInactivityTimeout: js.Any = js.native
  var clearMaxConnectTimeout: js.Any = js.native
  var clearTryReconnectTimeout: js.Any = js.native
  var client: js.Any = js.native
  var closedByUser: js.Any = js.native
  var connect: js.Any = js.native
  var connectionCallback: js.Any = js.native
  var connectionParams: js.Any = js.native
  var createMaxConnectTimeGenerator: js.Any = js.native
  var eventEmitter: js.Any = js.native
  var executeOperation: js.Any = js.native
  var flushUnsentMessagesQueue: js.Any = js.native
  var formatErrors: js.Any = js.native
  var generateOperationId: js.Any = js.native
  var getConnectionParams: js.Any = js.native
  var getObserver: js.Any = js.native
  var inactivityTimeout: js.Any = js.native
  var inactivityTimeoutId: js.Any = js.native
  var `lazy`: js.Any = js.native
  var maxConnectTimeGenerator: js.Any = js.native
  var maxConnectTimeoutId: js.Any = js.native
  var middlewares: js.Any = js.native
  var nextOperationId: js.Any = js.native
  var operations: Operations = js.native
  var processReceivedData: js.Any = js.native
  var reconnect: js.Any = js.native
  var reconnecting: js.Any = js.native
  var reconnectionAttempts: js.Any = js.native
  var sendMessage: js.Any = js.native
  var sendMessageRaw: js.Any = js.native
  var setInactivityTimeout: js.Any = js.native
  var tryReconnect: js.Any = js.native
  var tryReconnectTimeoutId: js.Any = js.native
  var unsentMessagesQueue: js.Any = js.native
  var unsubscribe: js.Any = js.native
  var url: js.Any = js.native
  var wasKeepAliveReceived: js.Any = js.native
  var wsImpl: js.Any = js.native
  var wsProtocols: js.Any = js.native
  var wsTimeout: js.Any = js.native
  def applyMiddlewares(options: OperationOptions): js.Promise[OperationOptions] = js.native
  def close(): Unit = js.native
  def close(isForced: js.UndefOr[scala.Nothing], closedByUser: Boolean): Unit = js.native
  def close(isForced: Boolean): Unit = js.native
  def close(isForced: Boolean, closedByUser: Boolean): Unit = js.native
  def on(eventName: String, callback: ListenerFn[js.Array[_]]): js.Function = js.native
  def on(eventName: String, callback: ListenerFn[js.Array[_]], context: js.Any): js.Function = js.native
  def onConnected(callback: ListenerFn[js.Array[_]]): js.Function = js.native
  def onConnected(callback: ListenerFn[js.Array[_]], context: js.Any): js.Function = js.native
  def onConnecting(callback: ListenerFn[js.Array[_]]): js.Function = js.native
  def onConnecting(callback: ListenerFn[js.Array[_]], context: js.Any): js.Function = js.native
  def onDisconnected(callback: ListenerFn[js.Array[_]]): js.Function = js.native
  def onDisconnected(callback: ListenerFn[js.Array[_]], context: js.Any): js.Function = js.native
  def onError(callback: ListenerFn[js.Array[_]]): js.Function = js.native
  def onError(callback: ListenerFn[js.Array[_]], context: js.Any): js.Function = js.native
  def onReconnected(callback: ListenerFn[js.Array[_]]): js.Function = js.native
  def onReconnected(callback: ListenerFn[js.Array[_]], context: js.Any): js.Function = js.native
  def onReconnecting(callback: ListenerFn[js.Array[_]]): js.Function = js.native
  def onReconnecting(callback: ListenerFn[js.Array[_]], context: js.Any): js.Function = js.native
  def request(request: OperationOptions): Observable[ExecutionResult[StringDictionary[_], StringDictionary[_]]] = js.native
  def status: js.Any = js.native
  def unsubscribeAll(): Unit = js.native
  def use(middlewares: js.Array[Middleware]): SubscriptionClient = js.native
}

