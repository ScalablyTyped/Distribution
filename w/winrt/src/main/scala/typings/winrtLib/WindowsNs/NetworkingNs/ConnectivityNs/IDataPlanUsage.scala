package typings
package winrtLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataPlanUsage extends js.Object {
  var lastSyncTime: stdLib.Date
  var megabytesUsed: scala.Double
}

object IDataPlanUsage {
  @scala.inline
  def apply(lastSyncTime: stdLib.Date, megabytesUsed: scala.Double): IDataPlanUsage = {
    val __obj = js.Dynamic.literal(lastSyncTime = lastSyncTime, megabytesUsed = megabytesUsed)
  
    __obj.asInstanceOf[IDataPlanUsage]
  }
}

