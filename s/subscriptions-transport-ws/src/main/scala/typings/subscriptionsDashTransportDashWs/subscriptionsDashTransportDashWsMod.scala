package typings.subscriptionsDashTransportDashWs

import typings.subscriptionsDashTransportDashWs.distClientMod.ClientOptions
import typings.subscriptionsDashTransportDashWs.distServerMod.ServerOptions
import typings.subscriptionsDashTransportDashWs.subscriptionsDashTransportDashWsStrings.`graphql-subscriptions`
import typings.subscriptionsDashTransportDashWs.subscriptionsDashTransportDashWsStrings.`graphql-ws`
import typings.ws.wsMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("subscriptions-transport-ws", JSImport.Namespace)
@js.native
object subscriptionsDashTransportDashWsMod extends js.Object {
  @js.native
  class SubscriptionClient protected ()
    extends typings.subscriptionsDashTransportDashWs.distClientMod.SubscriptionClient {
    def this(url: String) = this()
    def this(url: String, options: ClientOptions) = this()
    def this(url: String, options: ClientOptions, webSocketImpl: js.Any) = this()
    def this(url: String, options: ClientOptions, webSocketImpl: js.Any, webSocketProtocols: String) = this()
    def this(url: String, options: ClientOptions, webSocketImpl: js.Any, webSocketProtocols: js.Array[String]) = this()
  }
  
  @js.native
  class SubscriptionServer protected ()
    extends typings.subscriptionsDashTransportDashWs.distServerMod.SubscriptionServer {
    def this(options: ServerOptions, socketOptionsOrServer: Server) = this()
    def this(options: ServerOptions, socketOptionsOrServer: typings.ws.wsMod.ServerOptions) = this()
  }
  
  val GRAPHQL_SUBSCRIPTIONS: `graphql-subscriptions` = js.native
  val GRAPHQL_WS: `graphql-ws` = js.native
  /* static members */
  @js.native
  object SubscriptionServer extends js.Object {
    def create(options: ServerOptions, socketOptionsOrServer: Server): typings.subscriptionsDashTransportDashWs.distServerMod.SubscriptionServer = js.native
    def create(options: ServerOptions, socketOptionsOrServer: typings.ws.wsMod.ServerOptions): typings.subscriptionsDashTransportDashWs.distServerMod.SubscriptionServer = js.native
  }
  
}

