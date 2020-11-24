package typings.winrtUwp.Windows.System

import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Storage.Search.StorageFileQueryResult
import typings.winrtUwp.Windows.UI.ViewManagement.ViewSizePreference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the options used to launch the default app for a file or URI. */
@js.native
trait LauncherOptions extends js.Object {
  
  /** Gets or sets the content type that is associated with a URI that represents a file on the network. */
  var contentType: String = js.native
  
  /** Launch a target app and have the currently running source app remain on the screen by sharing the space equally with the target app or by taking up more or less space than the target app. */
  var desiredRemainingView: ViewSizePreference = js.native
  
  /** Gets or sets a value that indicates whether to display the Open With dialog whenever the association launching API is called. */
  var displayApplicationPicker: Boolean = js.native
  
  /** Gets or sets a value that represents a URI that the user should be taken to in the browser if no app exists to handle the file type or URI. */
  var fallbackUri: Uri = js.native
  
  /** Enables an app to access files that are related to the file used to activate the app. */
  var neighboringFilesQuery: StorageFileQueryResult = js.native
  
  /** Gets or sets a value that represents the display name of the app in the store that the user should install if no app exists to handle the file type or URI. */
  var preferredApplicationDisplayName: String = js.native
  
  /** Gets or sets a value that represents the package family name of the app in the Store that the user should install if no app exists to handle the file type or URI. */
  var preferredApplicationPackageFamilyName: String = js.native
  
  /** The package family name of the target package that should be used to launch a file or URI. This property is optional. */
  var targetApplicationPackageFamilyName: String = js.native
  
  /** Gets or sets a value that indicates whether the system should display a warning that the file or URI is potentially unsafe when starting the app associated with a file or URI. */
  var treatAsUntrusted: Boolean = js.native
  
  /** Gets the user interface (UI) options when starting a default app. */
  var ui: LauncherUIOptions = js.native
}
object LauncherOptions {
  
  @scala.inline
  def apply(
    contentType: String,
    desiredRemainingView: ViewSizePreference,
    displayApplicationPicker: Boolean,
    fallbackUri: Uri,
    neighboringFilesQuery: StorageFileQueryResult,
    preferredApplicationDisplayName: String,
    preferredApplicationPackageFamilyName: String,
    targetApplicationPackageFamilyName: String,
    treatAsUntrusted: Boolean,
    ui: LauncherUIOptions
  ): LauncherOptions = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], desiredRemainingView = desiredRemainingView.asInstanceOf[js.Any], displayApplicationPicker = displayApplicationPicker.asInstanceOf[js.Any], fallbackUri = fallbackUri.asInstanceOf[js.Any], neighboringFilesQuery = neighboringFilesQuery.asInstanceOf[js.Any], preferredApplicationDisplayName = preferredApplicationDisplayName.asInstanceOf[js.Any], preferredApplicationPackageFamilyName = preferredApplicationPackageFamilyName.asInstanceOf[js.Any], targetApplicationPackageFamilyName = targetApplicationPackageFamilyName.asInstanceOf[js.Any], treatAsUntrusted = treatAsUntrusted.asInstanceOf[js.Any], ui = ui.asInstanceOf[js.Any])
    __obj.asInstanceOf[LauncherOptions]
  }
  
  @scala.inline
  implicit class LauncherOptionsOps[Self <: LauncherOptions] (val x: Self) extends AnyVal {
    
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
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredRemainingView(value: ViewSizePreference): Self = this.set("desiredRemainingView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayApplicationPicker(value: Boolean): Self = this.set("displayApplicationPicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackUri(value: Uri): Self = this.set("fallbackUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeighboringFilesQuery(value: StorageFileQueryResult): Self = this.set("neighboringFilesQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredApplicationDisplayName(value: String): Self = this.set("preferredApplicationDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredApplicationPackageFamilyName(value: String): Self = this.set("preferredApplicationPackageFamilyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetApplicationPackageFamilyName(value: String): Self = this.set("targetApplicationPackageFamilyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreatAsUntrusted(value: Boolean): Self = this.set("treatAsUntrusted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUi(value: LauncherUIOptions): Self = this.set("ui", value.asInstanceOf[js.Any])
  }
}
