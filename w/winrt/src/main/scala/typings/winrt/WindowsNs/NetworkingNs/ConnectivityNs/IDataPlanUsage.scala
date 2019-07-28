package typings.winrt.WindowsNs.NetworkingNs.ConnectivityNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataPlanUsage extends js.Object {
  var lastSyncTime: Date
  var megabytesUsed: Double
}

object IDataPlanUsage {
  @scala.inline
  def apply(lastSyncTime: Date, megabytesUsed: Double): IDataPlanUsage = {
    val __obj = js.Dynamic.literal(lastSyncTime = lastSyncTime, megabytesUsed = megabytesUsed)
  
    __obj.asInstanceOf[IDataPlanUsage]
  }
}

