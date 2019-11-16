package typings.workboxDashRouting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesRouteHandlerMod {
  import typings.std.Response

  type RouteHandler = RouteHandlerCallback | RouteHandlerObject
  type RouteHandlerCallback = js.Function1[/* context */ RouteHandlerCallbackContext, js.Promise[Response]]
}
