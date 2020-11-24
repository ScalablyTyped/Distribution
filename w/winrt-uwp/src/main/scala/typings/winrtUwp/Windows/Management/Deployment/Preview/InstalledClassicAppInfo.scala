package typings.winrtUwp.Windows.Management.Deployment.Preview

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstalledClassicAppInfo extends js.Object {
  
  var displayName: js.Any = js.native
  
   /* unmapped type */ var displayVersion: js.Any = js.native
}
object InstalledClassicAppInfo {
  
  @scala.inline
  def apply(displayName: js.Any, displayVersion: js.Any): InstalledClassicAppInfo = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], displayVersion = displayVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstalledClassicAppInfo]
  }
  
  @scala.inline
  implicit class InstalledClassicAppInfoOps[Self <: InstalledClassicAppInfo] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: js.Any): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayVersion(value: js.Any): Self = this.set("displayVersion", value.asInstanceOf[js.Any])
  }
}
