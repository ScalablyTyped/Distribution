package typings.workboxRouting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object routeHandlerMod {
  type RouteHandler = typings.workboxRouting.routeHandlerMod.RouteHandlerCallback | typings.workboxRouting.routeHandlerMod.RouteHandlerObject
  type RouteHandlerCallback = js.Function1[
    /* context */ typings.workboxRouting.routeHandlerMod.RouteHandlerCallbackContext, 
    js.Promise[typings.std.Response]
  ]
}
