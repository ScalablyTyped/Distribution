package typings.winrt.Windows.Networking.Connectivity

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
    val __obj = js.Dynamic.literal(lastSyncTime = lastSyncTime.asInstanceOf[js.Any], megabytesUsed = megabytesUsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataPlanUsage]
  }
}

