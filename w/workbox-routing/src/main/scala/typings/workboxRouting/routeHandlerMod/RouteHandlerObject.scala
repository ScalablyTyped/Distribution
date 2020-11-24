package typings.workboxRouting.routeHandlerMod

import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteHandlerObject extends js.Object {
  
  def handle(context: RouteHandlerCallbackContext): js.Promise[Response] = js.native
  @JSName("handle")
  var handle_Original: RouteHandlerCallback = js.native
}
