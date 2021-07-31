package typings.winrtUwp.Windows.ApplicationModel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about an application such as it name, logo, package information, ID. */
trait AppInfo extends StObject {
  
  /** An identifier that uniquely identifies the app. */
  var appUserModelId: String
  
  /** Gets information that describes the application. */
  var displayInfo: AppDisplayInfo
  
  /** Gets the app identifier. */
  var id: String
  
  /** An identifier that uniquely identifies the app's package. */
  var packageFamilyName: String
}
object AppInfo {
  
  @scala.inline
  def apply(appUserModelId: String, displayInfo: AppDisplayInfo, id: String, packageFamilyName: String): AppInfo = {
    val __obj = js.Dynamic.literal(appUserModelId = appUserModelId.asInstanceOf[js.Any], displayInfo = displayInfo.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], packageFamilyName = packageFamilyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppInfo]
  }
  
  @scala.inline
  implicit class AppInfoMutableBuilder[Self <: AppInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppUserModelId(value: String): Self = StObject.set(x, "appUserModelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayInfo(value: AppDisplayInfo): Self = StObject.set(x, "displayInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageFamilyName(value: String): Self = StObject.set(x, "packageFamilyName", value.asInstanceOf[js.Any])
  }
}
