package typings.wreck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type RequestCallback = js.Function2[
    /* uri */ java.lang.String, 
    /* options */ typings.wreck.mod.RequestOptions with typings.wreck.AnonPayload, 
    scala.Unit
  ]
  type ResponseCallback = js.Function2[
    /* err */ js.UndefOr[typings.boom.mod.^[js.Any]], 
    /* details */ typings.wreck.AnonReq, 
    scala.Unit
  ]
}
