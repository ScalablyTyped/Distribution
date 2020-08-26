package typings.winrtUwp.Windows.System

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Storage.IStorageItem
import typings.winrtUwp.Windows.UI.ViewManagement.ViewSizePreference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the options to use when launching File Explorer to display the contents of a specific folder by calling the LaunchFolderAsync(IStorageFolder, FolderLauncherOptions) method. */
@js.native
trait FolderLauncherOptions extends js.Object {
  /** Specifies how much space on the screen to leave for the calling app when launching File Explorer. The calling app can take up more or less space than File Explorer, or File Explorer can fill the entire screen. */
  var desiredRemainingView: ViewSizePreference = js.native
  /** Provides the list of items to select when File Explorer displays the contents of the specified folder. */
  var itemsToSelect: IVector[IStorageItem] = js.native
}

object FolderLauncherOptions {
  @scala.inline
  def apply(desiredRemainingView: ViewSizePreference, itemsToSelect: IVector[IStorageItem]): FolderLauncherOptions = {
    val __obj = js.Dynamic.literal(desiredRemainingView = desiredRemainingView.asInstanceOf[js.Any], itemsToSelect = itemsToSelect.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderLauncherOptions]
  }
  @scala.inline
  implicit class FolderLauncherOptionsOps[Self <: FolderLauncherOptions] (val x: Self) extends AnyVal {
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
    def setDesiredRemainingView(value: ViewSizePreference): Self = this.set("desiredRemainingView", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsToSelect(value: IVector[IStorageItem]): Self = this.set("itemsToSelect", value.asInstanceOf[js.Any])
  }
  
}

