package typings.workboxRangeRequests

import typings.workboxCore.typesMod.WorkboxPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeRequestsPluginMod {
  
  /**
    * The range request plugin makes it easy for a request with a 'Range' header to
    * be fulfilled by a cached response.
    *
    * It does this by intercepting the `cachedResponseWillBeUsed` plugin callback
    * and returning the appropriate subset of the cached response body.
    *
    * @memberof workbox-range-requests
    */
  @JSImport("workbox-range-requests/RangeRequestsPlugin", "RangeRequestsPlugin")
  @js.native
  open class RangeRequestsPlugin ()
    extends StObject
       with WorkboxPlugin
}
