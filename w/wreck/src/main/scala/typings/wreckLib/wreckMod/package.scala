package typings
package wreckLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wreckMod {
  type RequestCallback = js.Function2[
    /* uri */ java.lang.String, 
    /* options */ RequestOptions with wreckLib.Anon_Payload, 
    scala.Unit
  ]
  type ResponseCallback = js.Function2[
    /* err */ js.UndefOr[boomLib.boomMod.^[js.Any]], 
    /* details */ wreckLib.Anon_Req, 
    scala.Unit
  ]
}
