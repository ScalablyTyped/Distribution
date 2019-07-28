package typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileUsage extends js.Object {
  var lastSyncTime: Date
  var usageInMegabytes: Double
}

object ProfileUsage {
  @scala.inline
  def apply(lastSyncTime: Date, usageInMegabytes: Double): ProfileUsage = {
    val __obj = js.Dynamic.literal(lastSyncTime = lastSyncTime, usageInMegabytes = usageInMegabytes)
  
    __obj.asInstanceOf[ProfileUsage]
  }
}

