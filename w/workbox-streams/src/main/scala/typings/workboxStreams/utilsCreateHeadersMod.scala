package typings.workboxStreams

import typings.std.Headers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsCreateHeadersMod {
  
  @JSImport("workbox-streams/utils/createHeaders", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This is a utility method that determines whether the current browser supports
    * the features required to create streamed responses. Currently, it checks if
    * [`ReadableStream`](https://developer.mozilla.org/en-US/docs/Web/API/ReadableStream/ReadableStream)
    * is available.
    *
    * @private
    * @param {HeadersInit} [headersInit] If there's no `Content-Type` specified,
    * `'text/html'` will be used by default.
    * @return {boolean} `true`, if the current browser meets the requirements for
    * streaming responses, and `false` otherwise.
    *
    * @memberof workbox-streams
    */
  inline def createHeaders(): Headers = ^.asInstanceOf[js.Dynamic].applyDynamic("createHeaders")().asInstanceOf[Headers]
  inline def createHeaders(headersInit: js.Object): Headers = ^.asInstanceOf[js.Dynamic].applyDynamic("createHeaders")(headersInit.asInstanceOf[js.Any]).asInstanceOf[Headers]
}
