package typings.workboxStreams

import typings.std.HeadersInit
import typings.workboxRouting.typesRouteHandlerMod.RouteHandlerCallback
import typings.workboxRouting.typesRouteHandlerMod.RouteHandlerCallbackContext
import typings.workboxStreams.typesStreamSourceMod.StreamSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object strategyMod {
  
  @JSImport("workbox-streams/strategy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def strategy(sourceFunctions: js.Array[StreamsHandlerCallback]): RouteHandlerCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("strategy")(sourceFunctions.asInstanceOf[js.Any]).asInstanceOf[RouteHandlerCallback]
  inline def strategy(sourceFunctions: js.Array[StreamsHandlerCallback], headersInit: HeadersInit): RouteHandlerCallback = (^.asInstanceOf[js.Dynamic].applyDynamic("strategy")(sourceFunctions.asInstanceOf[js.Any], headersInit.asInstanceOf[js.Any])).asInstanceOf[RouteHandlerCallback]
  
  type StreamsHandlerCallback = js.Function1[/* options */ RouteHandlerCallbackContext, js.Promise[StreamSource] | StreamSource]
}
