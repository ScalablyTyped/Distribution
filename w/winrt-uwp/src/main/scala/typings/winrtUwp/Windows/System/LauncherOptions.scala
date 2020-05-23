package typings.winrtUwp.Windows.System

import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Storage.Search.StorageFileQueryResult
import typings.winrtUwp.Windows.UI.ViewManagement.ViewSizePreference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the options used to launch the default app for a file or URI. */
trait LauncherOptions extends js.Object {
  /** Gets or sets the content type that is associated with a URI that represents a file on the network. */
  var contentType: String
  /** Launch a target app and have the currently running source app remain on the screen by sharing the space equally with the target app or by taking up more or less space than the target app. */
  var desiredRemainingView: ViewSizePreference
  /** Gets or sets a value that indicates whether to display the Open With dialog whenever the association launching API is called. */
  var displayApplicationPicker: Boolean
  /** Gets or sets a value that represents a URI that the user should be taken to in the browser if no app exists to handle the file type or URI. */
  var fallbackUri: Uri
  /** Enables an app to access files that are related to the file used to activate the app. */
  var neighboringFilesQuery: StorageFileQueryResult
  /** Gets or sets a value that represents the display name of the app in the store that the user should install if no app exists to handle the file type or URI. */
  var preferredApplicationDisplayName: String
  /** Gets or sets a value that represents the package family name of the app in the Store that the user should install if no app exists to handle the file type or URI. */
  var preferredApplicationPackageFamilyName: String
  /** The package family name of the target package that should be used to launch a file or URI. This property is optional. */
  var targetApplicationPackageFamilyName: String
  /** Gets or sets a value that indicates whether the system should display a warning that the file or URI is potentially unsafe when starting the app associated with a file or URI. */
  var treatAsUntrusted: Boolean
  /** Gets the user interface (UI) options when starting a default app. */
  var ui: LauncherUIOptions
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
}

