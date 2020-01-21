package typings.twit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function3[
    /* err */ typings.std.Error, 
    /* result */ typings.twit.mod.Response, 
    /* response */ typings.node.httpMod.IncomingMessage, 
    scala.Unit
  ]
  type Response = js.Object
}
