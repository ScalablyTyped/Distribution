package typings.workboxStrategies.staleWhileRevalidateMod

import typings.std.Response
import typings.workboxRouting.routeHandlerMod.RouteHandlerObject
import typings.workboxStrategies.makeRequestCallbackMod.MakeRequestCallback
import typings.workboxStrategies.makeRequestCallbackMod.MakeRequestCallbackOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("workbox-strategies/StaleWhileRevalidate", "StaleWhileRevalidate")
@js.native
class StaleWhileRevalidate () extends RouteHandlerObject {
  def this(options: StaleWhileRevalidateOptions) = this()
  
  def makeRequest(options: MakeRequestCallbackOptions): js.Promise[Response] = js.native
  @JSName("makeRequest")
  var makeRequest_Original: MakeRequestCallback = js.native
}
