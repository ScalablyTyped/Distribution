package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wreckLib {
  type RequestCallback = js.Function2[/* uri */ java.lang.String, /* options */ js.Any with Anon_Payload, scala.Unit]
  type ResponseCallback = js.Function2[/* err */ js.UndefOr[js.Any], /* details */ Anon_Url, scala.Unit]
}
