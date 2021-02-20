package typings.workboxStreams

import typings.std.HeadersInit
import typings.workboxRouting.routeHandlerMod.RouteHandlerCallback
import typings.workboxStreams.concatenateMod.ConcatenateReturn
import typings.workboxStreams.concatenateToResponseMod.ConcatenateToResponseReturn
import typings.workboxStreams.strategyMod.StreamsHandlerCallback
import typings.workboxStreams.streamSourceMod.StreamSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-streams", "concatenate")
  @js.native
  def concatenate(sourcePromises: js.Array[js.Promise[StreamSource]]): ConcatenateReturn = js.native
  
  @JSImport("workbox-streams", "concatenateToResponse")
  @js.native
  def concatenateToResponse(sourcePromises: js.Array[js.Promise[StreamSource]]): ConcatenateToResponseReturn = js.native
  @JSImport("workbox-streams", "concatenateToResponse")
  @js.native
  def concatenateToResponse(sourcePromises: js.Array[js.Promise[StreamSource]], headersInit: HeadersInit): ConcatenateToResponseReturn = js.native
  
  @JSImport("workbox-streams", "isSupported")
  @js.native
  def isSupported(): Boolean = js.native
  
  @JSImport("workbox-streams", "strategy")
  @js.native
  def strategy(sourceFunctions: js.Array[StreamsHandlerCallback]): RouteHandlerCallback = js.native
  @JSImport("workbox-streams", "strategy")
  @js.native
  def strategy(sourceFunctions: js.Array[StreamsHandlerCallback], headersInit: HeadersInit): RouteHandlerCallback = js.native
}
