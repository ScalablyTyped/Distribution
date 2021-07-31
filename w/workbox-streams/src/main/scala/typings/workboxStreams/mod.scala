package typings.workboxStreams

import typings.std.HeadersInit
import typings.workboxRouting.routeHandlerMod.RouteHandlerCallback
import typings.workboxStreams.concatenateMod.ConcatenateReturn
import typings.workboxStreams.concatenateToResponseMod.ConcatenateToResponseReturn
import typings.workboxStreams.strategyMod.StreamsHandlerCallback
import typings.workboxStreams.streamSourceMod.StreamSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-streams", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def concatenate(sourcePromises: js.Array[js.Promise[StreamSource]]): ConcatenateReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("concatenate")(sourcePromises.asInstanceOf[js.Any]).asInstanceOf[ConcatenateReturn]
  
  @scala.inline
  def concatenateToResponse(sourcePromises: js.Array[js.Promise[StreamSource]]): ConcatenateToResponseReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("concatenateToResponse")(sourcePromises.asInstanceOf[js.Any]).asInstanceOf[ConcatenateToResponseReturn]
  @scala.inline
  def concatenateToResponse(sourcePromises: js.Array[js.Promise[StreamSource]], headersInit: HeadersInit): ConcatenateToResponseReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("concatenateToResponse")(sourcePromises.asInstanceOf[js.Any], headersInit.asInstanceOf[js.Any])).asInstanceOf[ConcatenateToResponseReturn]
  
  @scala.inline
  def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
  
  @scala.inline
  def strategy(sourceFunctions: js.Array[StreamsHandlerCallback]): RouteHandlerCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("strategy")(sourceFunctions.asInstanceOf[js.Any]).asInstanceOf[RouteHandlerCallback]
  @scala.inline
  def strategy(sourceFunctions: js.Array[StreamsHandlerCallback], headersInit: HeadersInit): RouteHandlerCallback = (^.asInstanceOf[js.Dynamic].applyDynamic("strategy")(sourceFunctions.asInstanceOf[js.Any], headersInit.asInstanceOf[js.Any])).asInstanceOf[RouteHandlerCallback]
}
