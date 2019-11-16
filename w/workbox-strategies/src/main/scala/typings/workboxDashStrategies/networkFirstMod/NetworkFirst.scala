package typings.workboxDashStrategies.networkFirstMod

import typings.std.Response
import typings.workboxDashRouting.typesRouteHandlerMod.RouteHandlerObject
import typings.workboxDashStrategies.typesMakeRequestCallbackMod.MakeRequestCallback
import typings.workboxDashStrategies.typesMakeRequestCallbackMod.MakeRequestCallbackOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-strategies/NetworkFirst", "NetworkFirst")
@js.native
class NetworkFirst () extends RouteHandlerObject {
  def this(options: NetworkFirstOptions) = this()
  @JSName("makeRequest")
  var makeRequest_Original: MakeRequestCallback = js.native
  def makeRequest(options: MakeRequestCallbackOptions): js.Promise[Response] = js.native
}

