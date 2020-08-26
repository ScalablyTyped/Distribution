package typings.subscriptionsTransportWs

import typings.subscriptionsTransportWs.clientMod.ClientOptions
import typings.subscriptionsTransportWs.serverMod.ServerOptions
import typings.ws.mod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("subscriptions-transport-ws", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class SubscriptionClient protected ()
    extends typings.subscriptionsTransportWs.clientMod.SubscriptionClient {
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
  }
  
  @js.native
  class SubscriptionServer protected ()
    extends typings.subscriptionsTransportWs.serverMod.SubscriptionServer {
    def this(options: ServerOptions, socketOptionsOrServer: Server) = this()
    def this(options: ServerOptions, socketOptionsOrServer: typings.ws.mod.ServerOptions) = this()
  }
  
  val GRAPHQL_SUBSCRIPTIONS: /* "graphql-subscriptions" */ String = js.native
  val GRAPHQL_WS: /* "graphql-ws" */ String = js.native
  /* static members */
  @js.native
  object SubscriptionServer extends js.Object {
    def create(options: ServerOptions, socketOptionsOrServer: Server): typings.subscriptionsTransportWs.serverMod.SubscriptionServer = js.native
    def create(options: ServerOptions, socketOptionsOrServer: typings.ws.mod.ServerOptions): typings.subscriptionsTransportWs.serverMod.SubscriptionServer = js.native
  }
  
}

