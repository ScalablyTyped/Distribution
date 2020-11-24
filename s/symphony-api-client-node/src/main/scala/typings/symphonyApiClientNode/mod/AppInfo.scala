package typings.symphonyApiClientNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppInfo extends js.Object {
  
  var appId: String = js.native
  
  var appToken: String = js.native
}
object AppInfo {
  
  @scala.inline
  def apply(appId: String, appToken: String): AppInfo = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], appToken = appToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppInfo]
  }
  
  @scala.inline
  implicit class AppInfoOps[Self <: AppInfo] (val x: Self) extends AnyVal {
    
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
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppToken(value: String): Self = this.set("appToken", value.asInstanceOf[js.Any])
  }
}
