package typings.winrtUwp.Windows.Networking.Connectivity

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents data plan specific data usage information for a connection. */
trait DataPlanUsage extends js.Object {
  /** Gets a DateTime object indicating the date and time when the MegabytesUsed property was last updated. */
  var lastSyncTime: Date
  /** Gets a value indicating the total amount of data transferred, in megabytes, over the connection. */
  var megabytesUsed: Double
}

object DataPlanUsage {
  @scala.inline
  def apply(lastSyncTime: Date, megabytesUsed: Double): DataPlanUsage = {
    val __obj = js.Dynamic.literal(lastSyncTime = lastSyncTime.asInstanceOf[js.Any], megabytesUsed = megabytesUsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPlanUsage]
  }
}

