package typings.winrtUwp.global.Windows.Networking.Connectivity

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the current status information for the data plan associated with a connection. */
@JSGlobal("Windows.Networking.Connectivity.DataPlanStatus")
@js.native
abstract class DataPlanStatus ()
  extends typings.winrtUwp.Windows.Networking.Connectivity.DataPlanStatus {
  /** Gets a value indicating the maximum data transfer allowance for a connection within each billing cycle, as defined by the data plan. */
  /* CompleteClass */
  override var dataLimitInMegabytes: Double = js.native
  /** Gets a DataPlanUsage object that indicates the amount of data transferred over the connection, in megabytes, and the last time this value was refreshed. */
  /* CompleteClass */
  override var dataPlanUsage: typings.winrtUwp.Windows.Networking.Connectivity.DataPlanUsage = js.native
  /** Gets a value indicating the nominal rate of the inbound data transfer occurring on the connection. */
  /* CompleteClass */
  override var inboundBitsPerSecond: Double = js.native
  /** Gets a value indicates the maximum size of a transfer that is allowed without user consent on a metered network. */
  /* CompleteClass */
  override var maxTransferSizeInMegabytes: Double = js.native
  /** Gets a value indicating the date and time of the next billing cycle. */
  /* CompleteClass */
  override var nextBillingCycle: Date = js.native
  /** Gets a value indicating the nominal rate of the outbound data transfer. */
  /* CompleteClass */
  override var outboundBitsPerSecond: Double = js.native
}

