package typings.systeminformation.systeminformationMod

import typings.systeminformation.systeminformationMod.Systeminformation.NetConnectionsData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("systeminformation", "networkConnections")
@js.native
object networkConnections extends js.Object {
  def apply(): js.Promise[js.Array[NetConnectionsData]] = js.native
  def apply(cb: js.Function1[/* data */ js.Array[NetConnectionsData], _]): js.Promise[js.Array[NetConnectionsData]] = js.native
}

