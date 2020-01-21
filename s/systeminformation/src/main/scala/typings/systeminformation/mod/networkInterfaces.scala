package typings.systeminformation.mod

import typings.systeminformation.mod.Systeminformation.NetworkInterfacesData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("systeminformation", "networkInterfaces")
@js.native
object networkInterfaces extends js.Object {
  def apply(): js.Promise[js.Array[NetworkInterfacesData]] = js.native
  def apply(cb: js.Function1[/* data */ js.Array[NetworkInterfacesData], _]): js.Promise[js.Array[NetworkInterfacesData]] = js.native
}

