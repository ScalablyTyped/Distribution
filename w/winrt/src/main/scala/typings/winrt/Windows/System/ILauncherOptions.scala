package typings.winrt.Windows.System

import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.UI.ViewManagement.ViewSizePreference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILauncherOptions extends StObject {
  
  var contentType: String
  
  var desiredRemainingView: ViewSizePreference
  
  var displayApplicationPicker: Boolean
  
  var fallbackUri: Uri
  
  var preferredApplicationDisplayName: String
  
  var preferredApplicationPackageFamilyName: String
  
  var treatAsUntrusted: Boolean
  
  var uI: LauncherUIOptions
}
object ILauncherOptions {
  
  @scala.inline
  def apply(
    contentType: String,
    desiredRemainingView: ViewSizePreference,
    displayApplicationPicker: Boolean,
    fallbackUri: Uri,
    preferredApplicationDisplayName: String,
    preferredApplicationPackageFamilyName: String,
    treatAsUntrusted: Boolean,
    uI: LauncherUIOptions
  ): ILauncherOptions = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], desiredRemainingView = desiredRemainingView.asInstanceOf[js.Any], displayApplicationPicker = displayApplicationPicker.asInstanceOf[js.Any], fallbackUri = fallbackUri.asInstanceOf[js.Any], preferredApplicationDisplayName = preferredApplicationDisplayName.asInstanceOf[js.Any], preferredApplicationPackageFamilyName = preferredApplicationPackageFamilyName.asInstanceOf[js.Any], treatAsUntrusted = treatAsUntrusted.asInstanceOf[js.Any], uI = uI.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILauncherOptions]
  }
  
  @scala.inline
  implicit class ILauncherOptionsMutableBuilder[Self <: ILauncherOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredRemainingView(value: ViewSizePreference): Self = StObject.set(x, "desiredRemainingView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayApplicationPicker(value: Boolean): Self = StObject.set(x, "displayApplicationPicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackUri(value: Uri): Self = StObject.set(x, "fallbackUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredApplicationDisplayName(value: String): Self = StObject.set(x, "preferredApplicationDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredApplicationPackageFamilyName(value: String): Self = StObject.set(x, "preferredApplicationPackageFamilyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreatAsUntrusted(value: Boolean): Self = StObject.set(x, "treatAsUntrusted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUI(value: LauncherUIOptions): Self = StObject.set(x, "uI", value.asInstanceOf[js.Any])
  }
}
