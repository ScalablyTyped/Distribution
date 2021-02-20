package typings.winrtUwp.Windows.System

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Storage.IStorageItem
import typings.winrtUwp.Windows.UI.ViewManagement.ViewSizePreference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the options to use when launching File Explorer to display the contents of a specific folder by calling the LaunchFolderAsync(IStorageFolder, FolderLauncherOptions) method. */
@js.native
trait FolderLauncherOptions extends StObject {
  
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
  implicit class FolderLauncherOptionsMutableBuilder[Self <: FolderLauncherOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesiredRemainingView(value: ViewSizePreference): Self = StObject.set(x, "desiredRemainingView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsToSelect(value: IVector[IStorageItem]): Self = StObject.set(x, "itemsToSelect", value.asInstanceOf[js.Any])
  }
}
