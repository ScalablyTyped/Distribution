package typings.systeminformation.systeminformationMod

import typings.systeminformation.systeminformationMod.Systeminformation.NetInterfacesData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("systeminformation", "networkInterfaces")
@js.native
object networkInterfaces extends js.Object {
  def apply(): js.Promise[js.Array[NetInterfacesData]] = js.native
  def apply(cb: js.Function1[/* data */ js.Array[NetInterfacesData], _]): js.Promise[js.Array[NetInterfacesData]] = js.native
}

