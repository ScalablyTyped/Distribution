package typings
package subscriptionsDashTransportDashWsLib.distServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("subscriptions-transport-ws/dist/server", "SubscriptionServer")
@js.native
class SubscriptionServer protected () extends js.Object {
  def this(options: ServerOptions, socketOptionsOrServer: wsLib.wsMod.Server) = this()
  def this(options: ServerOptions, socketOptionsOrServer: wsLib.wsMod.ServerOptions) = this()
  var closeHandler: js.Any = js.native
  var execute: js.Any = js.native
  var keepAlive: js.Any = js.native
  var loadExecutor: js.Any = js.native
  var onClose: js.Any = js.native
  var onConnect: js.Any = js.native
  var onDisconnect: js.Any = js.native
  var onMessage: js.Any = js.native
  var onOperation: js.Any = js.native
  var onOperationComplete: js.Any = js.native
  var rootValue: js.Any = js.native
  var schema: js.Any = js.native
  var sendError: js.Any = js.native
  var sendKeepAlive: js.Any = js.native
  var sendMessage: js.Any = js.native
  val server: wsLib.wsMod.Server = js.native
  var specifiedRules: js.Any = js.native
  var subscribe: js.Any = js.native
  var unsubscribe: js.Any = js.native
  var wsServer: js.Any = js.native
  def close(): scala.Unit = js.native
}

/* static members */
@JSImport("subscriptions-transport-ws/dist/server", "SubscriptionServer")
@js.native
object SubscriptionServer extends js.Object {
  def create(
    options: subscriptionsDashTransportDashWsLib.distServerMod.ServerOptions,
    socketOptionsOrServer: wsLib.wsMod.Server
  ): subscriptionsDashTransportDashWsLib.distServerMod.SubscriptionServer = js.native
  def create(
    options: subscriptionsDashTransportDashWsLib.distServerMod.ServerOptions,
    socketOptionsOrServer: wsLib.wsMod.ServerOptions
  ): subscriptionsDashTransportDashWsLib.distServerMod.SubscriptionServer = js.native
}

