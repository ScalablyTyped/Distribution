package typings.winrtUwp.global.Windows.System

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Storage.IStorageItem
import typings.winrtUwp.Windows.UI.ViewManagement.ViewSizePreference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the options to use when launching File Explorer to display the contents of a specific folder by calling the LaunchFolderAsync(IStorageFolder, FolderLauncherOptions) method. */
@JSGlobal("Windows.System.FolderLauncherOptions")
@js.native
/** Initializes a new instance of the FolderLauncherOptions class. */
class FolderLauncherOptions ()
  extends StObject
     with typings.winrtUwp.Windows.System.FolderLauncherOptions {
  
  /** Specifies how much space on the screen to leave for the calling app when launching File Explorer. The calling app can take up more or less space than File Explorer, or File Explorer can fill the entire screen. */
  /* CompleteClass */
  var desiredRemainingView: ViewSizePreference = js.native
  
  /** Provides the list of items to select when File Explorer displays the contents of the specified folder. */
  /* CompleteClass */
  var itemsToSelect: IVector[IStorageItem] = js.native
}
