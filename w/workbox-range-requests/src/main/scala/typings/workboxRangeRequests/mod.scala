package typings.workboxRangeRequests

import typings.std.Request
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("workbox-range-requests", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def createPartialResponse(request: Request, originalResponse: Response): js.Promise[Response] = js.native
  
  @js.native
  class Plugin ()
    extends typings.workboxRangeRequests.pluginMod.Plugin
}
