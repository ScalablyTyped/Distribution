package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs

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
  sealed trait perDay
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.DataUsageGranularity
  
  /** Provide data usage per hour. */
  @js.native
  sealed trait perHour
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.DataUsageGranularity
  
  /** Provide data usage per minute. */
  @js.native
  sealed trait perMinute
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.DataUsageGranularity
  
  /** Provide data usage overall. */
  @js.native
  sealed trait total
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.DataUsageGranularity
  
  val perDay: perDay with java.lang.String = js.native
  val perHour: perHour with java.lang.String = js.native
  val perMinute: perMinute with java.lang.String = js.native
  val total: total with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.DataUsageGranularity with java.lang.String
  ] = js.native
}

