package typings.workboxStreams

import typings.std.HeadersInit
import typings.workboxCore.typesMod.RouteHandlerCallback
import typings.workboxStreams.anon.Done
import typings.workboxStreams.anon.Response
import typings.workboxStreams.strategyMod.StreamsHandlerCallback
import typings.workboxStreams.typesMod.StreamSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-streams", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Takes multiple source Promises, each of which could resolve to a Response, a
    * ReadableStream, or a [BodyInit](https://fetch.spec.whatwg.org/#bodyinit).
    *
    * Returns an object exposing a ReadableStream with each individual stream's
    * data returned in sequence, along with a Promise which signals when the
    * stream is finished (useful for passing to a FetchEvent's waitUntil()).
    *
    * @param {Array<Promise<workbox-streams.StreamSource>>} sourcePromises
    * @return {Object<{done: Promise, stream: ReadableStream}>}
    *
    * @memberof workbox-streams
    */
  inline def concatenate(sourcePromises: js.Array[js.Promise[StreamSource]]): Done = ^.asInstanceOf[js.Dynamic].applyDynamic("concatenate")(sourcePromises.asInstanceOf[js.Any]).asInstanceOf[Done]
  
  /**
    * Takes multiple source Promises, each of which could resolve to a Response, a
    * ReadableStream, or a [BodyInit](https://fetch.spec.whatwg.org/#bodyinit),
    * along with a
    * [HeadersInit](https://fetch.spec.whatwg.org/#typedefdef-headersinit).
    *
    * Returns an object exposing a Response whose body consists of each individual
    * stream's data returned in sequence, along with a Promise which signals when
    * the stream is finished (useful for passing to a FetchEvent's waitUntil()).
    *
    * @param {Array<Promise<workbox-streams.StreamSource>>} sourcePromises
    * @param {HeadersInit} [headersInit] If there's no `Content-Type` specified,
    * `'text/html'` will be used by default.
    * @return {Object<{done: Promise, response: Response}>}
    *
    * @memberof workbox-streams
    */
  inline def concatenateToResponse(sourcePromises: js.Array[js.Promise[StreamSource]], headersInit: HeadersInit): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("concatenateToResponse")(sourcePromises.asInstanceOf[js.Any], headersInit.asInstanceOf[js.Any])).asInstanceOf[Response]
  
  /**
    * This is a utility method that determines whether the current browser supports
    * the features required to create streamed responses. Currently, it checks if
    * [`ReadableStream`](https://developer.mozilla.org/en-US/docs/Web/API/ReadableStream/ReadableStream)
    * can be created.
    *
    * @return {boolean} `true`, if the current browser meets the requirements for
    * streaming responses, and `false` otherwise.
    *
    * @memberof workbox-streams
    */
  inline def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
  
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
}
