package typings
package winrtDashUwpLib.WindowsNs.SystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the options to use when launching File Explorer to display the contents of a specific folder by calling the LaunchFolderAsync(IStorageFolder, FolderLauncherOptions) method. */
@JSGlobal("Windows.System.FolderLauncherOptions")
@js.native
class FolderLauncherOptions () extends js.Object {
  /** Specifies how much space on the screen to leave for the calling app when launching File Explorer. The calling app can take up more or less space than File Explorer, or File Explorer can fill the entire screen. */
  var desiredRemainingView: winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ViewSizePreference = js.native
  /** Provides the list of items to select when File Explorer displays the contents of the specified folder. */
  var itemsToSelect: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtDashUwpLib.WindowsNs.StorageNs.IStorageItem] = js.native
}

