package typings.systeminformation.systeminformationMod

import typings.systeminformation.systeminformationMod.Systeminformation.ServicesData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("systeminformation", "services")
@js.native
object services extends js.Object {
  def apply(serviceName: String): js.Promise[js.Array[ServicesData]] = js.native
  def apply(serviceName: String, cb: js.Function1[/* data */ js.Array[ServicesData], _]): js.Promise[js.Array[ServicesData]] = js.native
}

