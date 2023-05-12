package typings.workboxStreams

import typings.std.HeadersInit
import typings.workboxStreams.anon.Response
import typings.workboxStreams.typesMod.StreamSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concatenateToResponseMod {
  
  @JSImport("workbox-streams/concatenateToResponse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
}
