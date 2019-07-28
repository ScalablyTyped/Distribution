package typings.subscriptionsDashTransportDashWs.subscriptionsDashTransportDashWsMod

import typings.subscriptionsDashTransportDashWs.distServerMod.ServerOptions
import typings.ws.wsMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("subscriptions-transport-ws", "SubscriptionServer")
@js.native
class SubscriptionServer protected ()
  extends typings.subscriptionsDashTransportDashWs.distServerMod.SubscriptionServer {
  def this(options: ServerOptions, socketOptionsOrServer: Server) = this()
  def this(options: ServerOptions, socketOptionsOrServer: typings.ws.wsMod.ServerOptions) = this()
}

/* static members */
@JSImport("subscriptions-transport-ws", "SubscriptionServer")
@js.native
object SubscriptionServer extends js.Object {
  def create(options: ServerOptions, socketOptionsOrServer: Server): typings.subscriptionsDashTransportDashWs.distServerMod.SubscriptionServer = js.native
  def create(options: ServerOptions, socketOptionsOrServer: typings.ws.wsMod.ServerOptions): typings.subscriptionsDashTransportDashWs.distServerMod.SubscriptionServer = js.native
}

