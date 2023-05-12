package typings.workboxStreams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isSupportedMod {
  
  @JSImport("workbox-streams/isSupported", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
}
