package typings.winrtUwp.Windows.System

import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Storage.Search.StorageFileQueryResult
import typings.winrtUwp.Windows.UI.ViewManagement.ViewSizePreference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the options used to launch the default app for a file or URI. */
@JSGlobal("Windows.System.LauncherOptions")
@js.native
/** Creates and initializes a new instance of the launcher options object. */
class LauncherOptions () extends js.Object {
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

