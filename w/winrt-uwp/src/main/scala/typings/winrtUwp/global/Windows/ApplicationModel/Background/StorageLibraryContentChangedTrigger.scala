package typings.winrtUwp.global.Windows.ApplicationModel.Background

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Storage.StorageLibrary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Creates a trigger that will fire when a file is changed in a specified library. */
@JSGlobal("Windows.ApplicationModel.Background.StorageLibraryContentChangedTrigger")
@js.native
abstract class StorageLibraryContentChangedTrigger ()
  extends typings.winrtUwp.Windows.ApplicationModel.Background.StorageLibraryContentChangedTrigger
object StorageLibraryContentChangedTrigger {
  
  /**
    * Creates a trigger that will fire when a file is changed in the specified library.
    * @param storageLibrary The location that the trigger monitors such as the music library or documents library.
    * @return A trigger that monitors the specified location.
    */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Background.StorageLibraryContentChangedTrigger.create")
  @js.native
  def create(storageLibrary: StorageLibrary): typings.winrtUwp.Windows.ApplicationModel.Background.StorageLibraryContentChangedTrigger = js.native
  
  /**
    * Creates a trigger that will fire when a file is changed in any of the specified libraries.
    * @param storageLibraries The list of libraries that the trigger will monitor.
    * @return A trigger that monitors the specified location(s).
    */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Background.StorageLibraryContentChangedTrigger.createFromLibraries")
  @js.native
  def createFromLibraries(storageLibraries: IIterable[StorageLibrary]): typings.winrtUwp.Windows.ApplicationModel.Background.StorageLibraryContentChangedTrigger = js.native
}
