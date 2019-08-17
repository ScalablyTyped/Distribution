package typings.wreck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wreckMod {
  import typings.wreck.Anon_Payload
  import typings.wreck.Anon_Req

  type RequestCallback = js.Function2[/* uri */ String, /* options */ RequestOptions with Anon_Payload, Unit]
  type ResponseCallback = js.Function2[/* err */ js.UndefOr[typings.boom.boomMod.^[js.Any]], /* details */ Anon_Req, Unit]
}
