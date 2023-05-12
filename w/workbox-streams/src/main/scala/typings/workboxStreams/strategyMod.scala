package typings.workboxStreams

import typings.std.HeadersInit
import typings.workboxCore.typesMod.RouteHandlerCallback
import typings.workboxCore.typesMod.RouteHandlerCallbackOptions
import typings.workboxStreams.typesMod.StreamSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object strategyMod {
  
  @JSImport("workbox-streams/strategy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A shortcut to create a strategy that could be dropped-in to Workbox's router.
    *
    * On browsers that do not support constructing new `ReadableStream`s, this
    * strategy will automatically wait for all the `sourceFunctions` to complete,
    * and create a final response that concatenates their values together.
    *
    * @param {Array<function({event, request, url, params})>} sourceFunctions
    * An array of functions similar to {@link workbox-routing~handlerCallback}
    * but that instead return a {@link workbox-streams.StreamSource} (or a
    * Promise which resolves to one).
    * @param {HeadersInit} [headersInit] If there's no `Content-Type` specified,
    * `'text/html'` will be used by default.
    * @return {workbox-routing~handlerCallback}
    * @memberof workbox-streams
    */
  inline def strategy(sourceFunctions: js.Array[StreamsHandlerCallback], headersInit: HeadersInit): RouteHandlerCallback = (^.asInstanceOf[js.Dynamic].applyDynamic("strategy")(sourceFunctions.asInstanceOf[js.Any], headersInit.asInstanceOf[js.Any])).asInstanceOf[RouteHandlerCallback]
  
  type StreamsHandlerCallback = js.Function1[/* param0 */ RouteHandlerCallbackOptions, js.Promise[StreamSource] | StreamSource]
}
