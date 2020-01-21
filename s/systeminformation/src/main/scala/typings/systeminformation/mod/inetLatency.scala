package typings.systeminformation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("systeminformation", "inetLatency")
@js.native
object inetLatency extends js.Object {
  def apply(): js.Promise[Double] = js.native
  def apply(host: String): js.Promise[Double] = js.native
  def apply(host: String, cb: js.Function1[/* data */ Double, _]): js.Promise[Double] = js.native
}

