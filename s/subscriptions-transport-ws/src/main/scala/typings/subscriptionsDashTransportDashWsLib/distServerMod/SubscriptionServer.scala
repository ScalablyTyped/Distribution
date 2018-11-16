package typings
package subscriptionsDashTransportDashWsLib.distServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("subscriptions-transport-ws/dist/server", "SubscriptionServer")
@js.native
class SubscriptionServer protected () extends js.Object {
  def this(options: ServerOptions, socketOptions: wsLib.wsMod.WebSocketNs.ServerOptions) = this()
  var closeHandler: js.Any = js.native
  var execute: js.Any = js.native
  var keepAlive: js.Any = js.native
  var onConnect: js.Any = js.native
  var onDisconnect: js.Any = js.native
  var onOperation: js.Any = js.native
  var onOperationComplete: js.Any = js.native
  var rootValue: js.Any = js.native
  var schema: js.Any = js.native
  val server: wsLib.wsMod.Server = js.native
  var specifiedRules: js.Any = js.native
  var subscribe: js.Any = js.native
  var wsServer: js.Any = js.native
  def close(): scala.Unit = js.native
  /* private */ def loadExecutor(options: js.Any): js.Any = js.native
  /* private */ def onClose(connectionContext: js.Any): js.Any = js.native
  /* private */ def onMessage(connectionContext: js.Any): js.Any = js.native
  /* private */ def sendError(connectionContext: js.Any, opId: js.Any, errorPayload: js.Any): js.Any = js.native
  /* private */ def sendError(connectionContext: js.Any, opId: js.Any, errorPayload: js.Any, overrideDefaultErrorType: js.Any): js.Any = js.native
  /* private */ def sendKeepAlive(connectionContext: js.Any): js.Any = js.native
  /* private */ def sendMessage(connectionContext: js.Any, opId: js.Any, `type`: js.Any, payload: js.Any): js.Any = js.native
  /* private */ def unsubscribe(connectionContext: js.Any, opId: js.Any): js.Any = js.native
}

@JSImport("subscriptions-transport-ws/dist/server", "SubscriptionServer")
@js.native
object SubscriptionServer extends js.Object {
  def create(
    options: subscriptionsDashTransportDashWsLib.distServerMod.ServerOptions,
    socketOptions: wsLib.wsMod.WebSocketNs.ServerOptions
  ): subscriptionsDashTransportDashWsLib.distServerMod.SubscriptionServer = js.native
}

