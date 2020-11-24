package typings.winrtUwp.global.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines levels of granularity used when retrieving data usage statistics with GetNetworkUsageAsync . */
@JSGlobal("Windows.Networking.Connectivity.DataUsageGranularity")
@js.native
object DataUsageGranularity extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Networking.Connectivity.DataUsageGranularity with Double
  ] = js.native
  
  /* 2 */ val perDay: typings.winrtUwp.Windows.Networking.Connectivity.DataUsageGranularity.perDay with Double = js.native
  
  /* 1 */ val perHour: typings.winrtUwp.Windows.Networking.Connectivity.DataUsageGranularity.perHour with Double = js.native
  
  /* 0 */ val perMinute: typings.winrtUwp.Windows.Networking.Connectivity.DataUsageGranularity.perMinute with Double = js.native
  
  /* 3 */ val total: typings.winrtUwp.Windows.Networking.Connectivity.DataUsageGranularity.total with Double = js.native
}
