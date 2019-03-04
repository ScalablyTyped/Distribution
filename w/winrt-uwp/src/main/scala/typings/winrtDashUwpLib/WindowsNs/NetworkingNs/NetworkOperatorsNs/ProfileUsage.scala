package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to update the usage of plan data. */
trait ProfileUsage extends js.Object {
  /** The last time UsageInMegabytes was updated. */
  var lastSyncTime: stdLib.Date
  /** Updates the usage in megabytes. */
  var usageInMegabytes: scala.Double
}

object ProfileUsage {
  @scala.inline
  def apply(lastSyncTime: stdLib.Date, usageInMegabytes: scala.Double): ProfileUsage = {
    val __obj = js.Dynamic.literal(lastSyncTime = lastSyncTime, usageInMegabytes = usageInMegabytes)
  
    __obj.asInstanceOf[ProfileUsage]
  }
}

