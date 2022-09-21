package typings.workboxRangeRequests

import typings.std.Request
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-range-requests", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("workbox-range-requests", "Plugin")
  @js.native
  open class Plugin ()
    extends typings.workboxRangeRequests.pluginMod.Plugin
  
  inline def createPartialResponse(request: Request, originalResponse: Response): js.Promise[Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPartialResponse")(request.asInstanceOf[js.Any], originalResponse.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
}
