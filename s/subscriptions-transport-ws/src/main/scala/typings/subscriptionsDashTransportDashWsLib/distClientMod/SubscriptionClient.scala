package typings
package subscriptionsDashTransportDashWsLib.distClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("subscriptions-transport-ws/dist/client", "SubscriptionClient")
@js.native
class SubscriptionClient protected () extends js.Object {
  def this(url: java.lang.String) = this()
  def this(url: java.lang.String, options: ClientOptions) = this()
  def this(url: java.lang.String, options: ClientOptions, webSocketImpl: js.Any) = this()
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
  val status: js.Any = js.native
  var tryReconnect: js.Any = js.native
  var tryReconnectTimeoutId: js.Any = js.native
  var unsentMessagesQueue: js.Any = js.native
  var unsubscribe: js.Any = js.native
  var url: js.Any = js.native
  var wasKeepAliveReceived: js.Any = js.native
  var wsImpl: js.Any = js.native
  var wsTimeout: js.Any = js.native
  def applyMiddlewares(options: OperationOptions): js.Promise[OperationOptions] = js.native
  def close(): scala.Unit = js.native
  def close(isForced: scala.Boolean): scala.Unit = js.native
  def close(isForced: scala.Boolean, closedByUser: scala.Boolean): scala.Unit = js.native
  def on(eventName: java.lang.String, callback: eventemitter3Lib.eventemitter3Mod.EventEmitterNs.ListenerFn): js.Function = js.native
  def on(
    eventName: java.lang.String,
    callback: eventemitter3Lib.eventemitter3Mod.EventEmitterNs.ListenerFn,
    context: js.Any
  ): js.Function = js.native
  def onConnected(callback: eventemitter3Lib.eventemitter3Mod.EventEmitterNs.ListenerFn): js.Function = js.native
  def onConnected(callback: eventemitter3Lib.eventemitter3Mod.EventEmitterNs.ListenerFn, context: js.Any): js.Function = js.native
  def onConnecting(callback: eventemitter3Lib.eventemitter3Mod.EventEmitterNs.ListenerFn): js.Function = js.native
  def onConnecting(callback: eventemitter3Lib.eventemitter3Mod.EventEmitterNs.ListenerFn, context: js.Any): js.Function = js.native
  def onDisconnected(callback: eventemitter3Lib.eventemitter3Mod.EventEmitterNs.ListenerFn): js.Function = js.native
  def onDisconnected(callback: eventemitter3Lib.eventemitter3Mod.EventEmitterNs.ListenerFn, context: js.Any): js.Function = js.native
  def onError(callback: eventemitter3Lib.eventemitter3Mod.EventEmitterNs.ListenerFn): js.Function = js.native
  def onError(callback: eventemitter3Lib.eventemitter3Mod.EventEmitterNs.ListenerFn, context: js.Any): js.Function = js.native
  def onReconnected(callback: eventemitter3Lib.eventemitter3Mod.EventEmitterNs.ListenerFn): js.Function = js.native
  def onReconnected(callback: eventemitter3Lib.eventemitter3Mod.EventEmitterNs.ListenerFn, context: js.Any): js.Function = js.native
  def onReconnecting(callback: eventemitter3Lib.eventemitter3Mod.EventEmitterNs.ListenerFn): js.Function = js.native
  def onReconnecting(callback: eventemitter3Lib.eventemitter3Mod.EventEmitterNs.ListenerFn, context: js.Any): js.Function = js.native
  def request(request: OperationOptions): Observable[
    graphqlLib.executionExecuteMod.ExecutionResult[graphqlLib.executionExecuteMod.ExecutionResultDataDefault]
  ] = js.native
  def unsubscribeAll(): scala.Unit = js.native
  def use(middlewares: js.Array[Middleware]): SubscriptionClient = js.native
}

