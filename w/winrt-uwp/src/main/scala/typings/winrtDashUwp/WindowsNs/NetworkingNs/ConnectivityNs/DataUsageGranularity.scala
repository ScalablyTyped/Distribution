package typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataUsageGranularity extends js.Object

/** Defines levels of granularity used when retrieving data usage statistics with GetNetworkUsageAsync . */
@JSGlobal("Windows.Networking.Connectivity.DataUsageGranularity")
@js.native
object DataUsageGranularity extends js.Object {
  /** Provide data usage per day. */
  @js.native
  sealed trait perDay extends DataUsageGranularity
  
  /** Provide data usage per hour. */
  @js.native
  sealed trait perHour extends DataUsageGranularity
  
  /** Provide data usage per minute. */
  @js.native
  sealed trait perMinute extends DataUsageGranularity
  
  /** Provide data usage overall. */
  @js.native
  sealed trait total extends DataUsageGranularity
  
  /* 2 */ val perDay: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.DataUsageGranularity.perDay with Double = js.native
  /* 1 */ val perHour: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.DataUsageGranularity.perHour with Double = js.native
  /* 0 */ val perMinute: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.DataUsageGranularity.perMinute with Double = js.native
  /* 3 */ val total: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.DataUsageGranularity.total with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DataUsageGranularity with Double] = js.native
}

