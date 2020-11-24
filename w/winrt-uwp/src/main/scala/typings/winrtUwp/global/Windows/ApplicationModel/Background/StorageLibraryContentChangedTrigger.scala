package typings.winrtUwp.global.Windows.ApplicationModel.Background

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Storage.StorageLibrary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Creates a trigger that will fire when a file is changed in a specified library. */
@JSGlobal("Windows.ApplicationModel.Background.StorageLibraryContentChangedTrigger")
@js.native
abstract class StorageLibraryContentChangedTrigger ()
  extends typings.winrtUwp.Windows.ApplicationModel.Background.StorageLibraryContentChangedTrigger
/* static members */
@JSGlobal("Windows.ApplicationModel.Background.StorageLibraryContentChangedTrigger")
@js.native
object StorageLibraryContentChangedTrigger extends js.Object {
  
  /**
    * Creates a trigger that will fire when a file is changed in the specified library.
    * @param storageLibrary The location that the trigger monitors such as the music library or documents library.
    * @return A trigger that monitors the specified location.
    */
  def create(storageLibrary: StorageLibrary): typings.winrtUwp.Windows.ApplicationModel.Background.StorageLibraryContentChangedTrigger = js.native
  
  /**
    * Creates a trigger that will fire when a file is changed in any of the specified libraries.
    * @param storageLibraries The list of libraries that the trigger will monitor.
    * @return A trigger that monitors the specified location(s).
    */
  def createFromLibraries(storageLibraries: IIterable[StorageLibrary]): typings.winrtUwp.Windows.ApplicationModel.Background.StorageLibraryContentChangedTrigger = js.native
}
