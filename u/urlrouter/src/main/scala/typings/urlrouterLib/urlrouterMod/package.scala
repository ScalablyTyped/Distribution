package typings
package urlrouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object urlrouterMod {
  type HttpHandler = js.Function3[
    /* req */ ServerRequest, 
    /* res */ ServerResponse, 
    /* next */ js.UndefOr[js.Function0[scala.Unit]], 
    scala.Unit
  ]
  type ServerResponse = nodeLib.httpMod.ServerResponse
}
