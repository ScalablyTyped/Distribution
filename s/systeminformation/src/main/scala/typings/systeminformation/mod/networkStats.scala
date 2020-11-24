package typings.systeminformation.mod

import typings.systeminformation.mod.Systeminformation.NetworkStatsData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("systeminformation", "networkStats")
@js.native
object networkStats extends js.Object {
  
  def apply(): js.Promise[js.Array[NetworkStatsData]] = js.native
  def apply(ifaces: js.UndefOr[scala.Nothing], cb: js.Function1[/* data */ js.Array[NetworkStatsData], _]): js.Promise[js.Array[NetworkStatsData]] = js.native
  def apply(ifaces: String): js.Promise[js.Array[NetworkStatsData]] = js.native
  def apply(ifaces: String, cb: js.Function1[/* data */ js.Array[NetworkStatsData], _]): js.Promise[js.Array[NetworkStatsData]] = js.native
}
