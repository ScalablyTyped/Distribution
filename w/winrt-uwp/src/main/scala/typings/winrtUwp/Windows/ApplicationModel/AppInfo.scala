package typings.winrtUwp.Windows.ApplicationModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about an application such as it name, logo, package information, ID. */
@js.native
trait AppInfo extends js.Object {
  
  /** An identifier that uniquely identifies the app. */
  var appUserModelId: String = js.native
  
  /** Gets information that describes the application. */
  var displayInfo: AppDisplayInfo = js.native
  
  /** Gets the app identifier. */
  var id: String = js.native
  
  /** An identifier that uniquely identifies the app's package. */
  var packageFamilyName: String = js.native
}
object AppInfo {
  
  @scala.inline
  def apply(appUserModelId: String, displayInfo: AppDisplayInfo, id: String, packageFamilyName: String): AppInfo = {
    val __obj = js.Dynamic.literal(appUserModelId = appUserModelId.asInstanceOf[js.Any], displayInfo = displayInfo.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], packageFamilyName = packageFamilyName.asInstanceOf[js.Any])
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
    def setAppUserModelId(value: String): Self = this.set("appUserModelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayInfo(value: AppDisplayInfo): Self = this.set("displayInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageFamilyName(value: String): Self = this.set("packageFamilyName", value.asInstanceOf[js.Any])
  }
}
