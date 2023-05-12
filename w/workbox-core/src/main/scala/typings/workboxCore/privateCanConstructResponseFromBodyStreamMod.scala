package typings.workboxCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object privateCanConstructResponseFromBodyStreamMod {
  
  @JSImport("workbox-core/_private/canConstructResponseFromBodyStream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A utility function that determines whether the current browser supports
    * constructing a new `Response` from a `response.body` stream.
    *
    * @return {boolean} `true`, if the current browser can successfully
    *     construct a `Response` from a `response.body` stream, `false` otherwise.
    *
    * @private
    */
  inline def canConstructResponseFromBodyStream(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canConstructResponseFromBodyStream")().asInstanceOf[Boolean]
}
