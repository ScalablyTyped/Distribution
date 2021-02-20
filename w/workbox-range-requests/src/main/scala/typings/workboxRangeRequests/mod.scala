package typings.workboxRangeRequests

import typings.std.Request
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-range-requests", "Plugin")
  @js.native
  class Plugin ()
    extends typings.workboxRangeRequests.pluginMod.Plugin
  
  @JSImport("workbox-range-requests", "createPartialResponse")
  @js.native
  def createPartialResponse(request: Request, originalResponse: Response): js.Promise[Response] = js.native
}
