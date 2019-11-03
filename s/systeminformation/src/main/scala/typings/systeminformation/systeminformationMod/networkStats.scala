package typings.systeminformation.systeminformationMod

import typings.systeminformation.systeminformationMod.Systeminformation.NetworkStatsData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("systeminformation", "networkStats")
@js.native
object networkStats extends js.Object {
  def apply(): js.Promise[js.Array[NetworkStatsData]] = js.native
  def apply(ifaces: String): js.Promise[js.Array[NetworkStatsData]] = js.native
  def apply(ifaces: String, cb: js.Function1[/* data */ js.Array[NetworkStatsData], _]): js.Promise[js.Array[NetworkStatsData]] = js.native
}

