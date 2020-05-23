package typings.winrtUwp.global.Windows.Networking.Connectivity

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents data plan specific data usage information for a connection. */
@JSGlobal("Windows.Networking.Connectivity.DataPlanUsage")
@js.native
abstract class DataPlanUsage ()
  extends typings.winrtUwp.Windows.Networking.Connectivity.DataPlanUsage {
  /** Gets a DateTime object indicating the date and time when the MegabytesUsed property was last updated. */
  /* CompleteClass */
  override var lastSyncTime: Date = js.native
  /** Gets a value indicating the total amount of data transferred, in megabytes, over the connection. */
  /* CompleteClass */
  override var megabytesUsed: Double = js.native
}

