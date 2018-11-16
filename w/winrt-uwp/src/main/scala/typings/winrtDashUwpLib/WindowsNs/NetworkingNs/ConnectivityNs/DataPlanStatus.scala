package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the current status information for the data plan associated with a connection. */
@JSGlobal("Windows.Networking.Connectivity.DataPlanStatus")
@js.native
abstract class DataPlanStatus () extends js.Object {
  /** Gets a value indicating the maximum data transfer allowance for a connection within each billing cycle, as defined by the data plan. */
  var dataLimitInMegabytes: scala.Double = js.native
  /** Gets a DataPlanUsage object that indicates the amount of data transferred over the connection, in megabytes, and the last time this value was refreshed. */
  var dataPlanUsage: DataPlanUsage = js.native
  /** Gets a value indicating the nominal rate of the inbound data transfer occurring on the connection. */
  var inboundBitsPerSecond: scala.Double = js.native
  /** Gets a value indicates the maximum size of a transfer that is allowed without user consent on a metered network. */
  var maxTransferSizeInMegabytes: scala.Double = js.native
  /** Gets a value indicating the date and time of the next billing cycle. */
  var nextBillingCycle: stdLib.Date = js.native
  /** Gets a value indicating the nominal rate of the outbound data transfer. */
  var outboundBitsPerSecond: scala.Double = js.native
}

