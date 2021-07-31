package typings.winrtUwp.global.Windows.ApplicationModel.Background

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Storage.StorageLibrary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Creates a trigger that will fire when a file is changed in a specified library. */
@JSGlobal("Windows.ApplicationModel.Background.StorageLibraryContentChangedTrigger")
@js.native
abstract class StorageLibraryContentChangedTrigger ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Background.StorageLibraryContentChangedTrigger
object StorageLibraryContentChangedTrigger {
  
  @JSGlobal("Windows.ApplicationModel.Background.StorageLibraryContentChangedTrigger")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a trigger that will fire when a file is changed in the specified library.
    * @param storageLibrary The location that the trigger monitors such as the music library or documents library.
    * @return A trigger that monitors the specified location.
    */
  /* static member */
  @scala.inline
  def create(storageLibrary: StorageLibrary): typings.winrtUwp.Windows.ApplicationModel.Background.StorageLibraryContentChangedTrigger = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(storageLibrary.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.ApplicationModel.Background.StorageLibraryContentChangedTrigger]
  
  /**
    * Creates a trigger that will fire when a file is changed in any of the specified libraries.
    * @param storageLibraries The list of libraries that the trigger will monitor.
    * @return A trigger that monitors the specified location(s).
    */
  /* static member */
  @scala.inline
  def createFromLibraries(storageLibraries: IIterable[StorageLibrary]): typings.winrtUwp.Windows.ApplicationModel.Background.StorageLibraryContentChangedTrigger = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromLibraries")(storageLibraries.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.ApplicationModel.Background.StorageLibraryContentChangedTrigger]
}
