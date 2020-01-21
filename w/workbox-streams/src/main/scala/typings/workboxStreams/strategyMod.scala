package typings.workboxStreams

import typings.std.HeadersInit
import typings.workboxRouting.routeHandlerMod.RouteHandlerCallback
import typings.workboxRouting.routeHandlerMod.RouteHandlerCallbackContext
import typings.workboxStreams.streamSourceMod.StreamSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-streams/strategy", JSImport.Namespace)
@js.native
object strategyMod extends js.Object {
  def strategy(sourceFunctions: js.Array[StreamsHandlerCallback]): RouteHandlerCallback = js.native
  def strategy(sourceFunctions: js.Array[StreamsHandlerCallback], headersInit: HeadersInit): RouteHandlerCallback = js.native
  type StreamsHandlerCallback = js.Function1[/* options */ RouteHandlerCallbackContext, js.Promise[StreamSource] | StreamSource]
}

