package typings.winrtDashUwp.Windows.Networking.NetworkOperators

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to update the usage of plan data. */
trait ProfileUsage extends js.Object {
  /** The last time UsageInMegabytes was updated. */
  var lastSyncTime: Date
  /** Updates the usage in megabytes. */
  var usageInMegabytes: Double
}

object ProfileUsage {
  @scala.inline
  def apply(lastSyncTime: Date, usageInMegabytes: Double): ProfileUsage = {
    val __obj = js.Dynamic.literal(lastSyncTime = lastSyncTime, usageInMegabytes = usageInMegabytes)
  
    __obj.asInstanceOf[ProfileUsage]
  }
}

