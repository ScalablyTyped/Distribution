package typings
package winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileUsage extends js.Object {
  var lastSyncTime: stdLib.Date
  var usageInMegabytes: scala.Double
}

object ProfileUsage {
  @scala.inline
  def apply(lastSyncTime: stdLib.Date, usageInMegabytes: scala.Double): ProfileUsage = {
    val __obj = js.Dynamic.literal(lastSyncTime = lastSyncTime, usageInMegabytes = usageInMegabytes)
  
    __obj.asInstanceOf[ProfileUsage]
  }
}

