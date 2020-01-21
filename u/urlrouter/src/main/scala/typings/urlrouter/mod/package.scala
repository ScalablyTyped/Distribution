package typings.urlrouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type HttpHandler = js.Function3[
    /* req */ typings.urlrouter.mod.ServerRequest, 
    /* res */ typings.urlrouter.mod.ServerResponse, 
    /* next */ js.UndefOr[js.Function0[scala.Unit]], 
    scala.Unit
  ]
  type ServerResponse = typings.node.httpMod.ServerResponse
}
