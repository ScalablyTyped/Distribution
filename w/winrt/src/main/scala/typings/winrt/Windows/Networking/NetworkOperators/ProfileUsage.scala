package typings.winrt.Windows.Networking.NetworkOperators

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProfileUsage extends js.Object {
  
  var lastSyncTime: Date = js.native
  
  var usageInMegabytes: Double = js.native
}
object ProfileUsage {
  
  @scala.inline
  def apply(lastSyncTime: Date, usageInMegabytes: Double): ProfileUsage = {
    val __obj = js.Dynamic.literal(lastSyncTime = lastSyncTime.asInstanceOf[js.Any], usageInMegabytes = usageInMegabytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileUsage]
  }
  
  @scala.inline
  implicit class ProfileUsageOps[Self <: ProfileUsage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLastSyncTime(value: Date): Self = this.set("lastSyncTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageInMegabytes(value: Double): Self = this.set("usageInMegabytes", value.asInstanceOf[js.Any])
  }
}
