package typings.workboxDashStrategies.networkOnlyMod

import typings.std.Response
import typings.workboxDashRouting.typesRouteHandlerMod.RouteHandlerObject
import typings.workboxDashStrategies.typesMakeRequestCallbackMod.MakeRequestCallback
import typings.workboxDashStrategies.typesMakeRequestCallbackMod.MakeRequestCallbackOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-strategies/NetworkOnly", "NetworkOnly")
@js.native
class NetworkOnly () extends RouteHandlerObject {
  def this(options: NetworkOnlyOptions) = this()
  @JSName("makeRequest")
  var makeRequest_Original: MakeRequestCallback = js.native
  def makeRequest(options: MakeRequestCallbackOptions): js.Promise[Response] = js.native
}

