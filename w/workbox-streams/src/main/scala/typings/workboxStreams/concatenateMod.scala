package typings.workboxStreams

import typings.workboxStreams.anon.Done
import typings.workboxStreams.typesMod.StreamSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concatenateMod {
  
  @JSImport("workbox-streams/concatenate", JSImport.Namespace)
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
}
