package typings.workboxDashSw.workboxDashSwMod._Global_.workbox

import typings.std.HeadersInit
import typings.workboxDashRouting.typesRouteHandlerMod.RouteHandlerCallback
import typings.workboxDashStreams.concatenateMod.ConcatenateReturn
import typings.workboxDashStreams.concatenateToResponseMod.ConcatenateToResponseReturn
import typings.workboxDashStreams.strategyMod.StreamsHandlerCallback
import typings.workboxDashStreams.typesStreamSourceMod.StreamSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("workbox.streams")
@js.native
object streams extends js.Object {
  def concatenate(sourcePromises: js.Array[js.Promise[StreamSource]]): ConcatenateReturn = js.native
  def concatenateToResponse(sourcePromises: js.Array[js.Promise[StreamSource]]): ConcatenateToResponseReturn = js.native
  def concatenateToResponse(sourcePromises: js.Array[js.Promise[StreamSource]], headersInit: HeadersInit): ConcatenateToResponseReturn = js.native
  def isSupported(): Boolean = js.native
  def strategy(sourceFunctions: js.Array[StreamsHandlerCallback]): RouteHandlerCallback = js.native
  def strategy(sourceFunctions: js.Array[StreamsHandlerCallback], headersInit: HeadersInit): RouteHandlerCallback = js.native
}

