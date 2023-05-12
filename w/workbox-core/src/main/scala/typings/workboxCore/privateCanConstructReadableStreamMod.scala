package typings.workboxCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object privateCanConstructReadableStreamMod {
  
  @JSImport("workbox-core/_private/canConstructReadableStream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A utility function that determines whether the current browser supports
    * constructing a [`ReadableStream`](https://developer.mozilla.org/en-US/docs/Web/API/ReadableStream/ReadableStream)
    * object.
    *
    * @return {boolean} `true`, if the current browser can successfully
    *     construct a `ReadableStream`, `false` otherwise.
    *
    * @private
    */
  inline def canConstructReadableStream(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canConstructReadableStream")().asInstanceOf[Boolean]
}
