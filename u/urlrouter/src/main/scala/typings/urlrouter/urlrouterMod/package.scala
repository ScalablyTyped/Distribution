package typings.urlrouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object urlrouterMod {
  type HttpHandler = js.Function3[
    /* req */ ServerRequest, 
    /* res */ ServerResponse, 
    /* next */ js.UndefOr[js.Function0[Unit]], 
    Unit
  ]
  type ServerResponse = typings.node.httpMod.ServerResponse
}
