package typings.systeminformation.mod

import typings.systeminformation.mod.Systeminformation.NetworkConnectionsData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("systeminformation", "networkConnections")
@js.native
object networkConnections extends js.Object {
  def apply(): js.Promise[js.Array[NetworkConnectionsData]] = js.native
  def apply(cb: js.Function1[/* data */ js.Array[NetworkConnectionsData], _]): js.Promise[js.Array[NetworkConnectionsData]] = js.native
}

