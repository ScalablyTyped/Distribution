package typings.systeminformation.systeminformationMod

import typings.systeminformation.systeminformationMod.Systeminformation.NetStatsData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("systeminformation", "networkStats")
@js.native
object networkStats extends js.Object {
  def apply(): js.Promise[NetStatsData] = js.native
  def apply(iface: String): js.Promise[NetStatsData] = js.native
  def apply(iface: String, cb: js.Function1[/* data */ NetStatsData, _]): js.Promise[NetStatsData] = js.native
}

