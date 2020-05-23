package typings.winrtUwp.Windows.System

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Storage.IStorageItem
import typings.winrtUwp.Windows.UI.ViewManagement.ViewSizePreference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the options to use when launching File Explorer to display the contents of a specific folder by calling the LaunchFolderAsync(IStorageFolder, FolderLauncherOptions) method. */
trait FolderLauncherOptions extends js.Object {
  /** Specifies how much space on the screen to leave for the calling app when launching File Explorer. The calling app can take up more or less space than File Explorer, or File Explorer can fill the entire screen. */
  var desiredRemainingView: ViewSizePreference
  /** Provides the list of items to select when File Explorer displays the contents of the specified folder. */
  var itemsToSelect: IVector[IStorageItem]
}

object FolderLauncherOptions {
  @scala.inline
  def apply(desiredRemainingView: ViewSizePreference, itemsToSelect: IVector[IStorageItem]): FolderLauncherOptions = {
    val __obj = js.Dynamic.literal(desiredRemainingView = desiredRemainingView.asInstanceOf[js.Any], itemsToSelect = itemsToSelect.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderLauncherOptions]
  }
}

