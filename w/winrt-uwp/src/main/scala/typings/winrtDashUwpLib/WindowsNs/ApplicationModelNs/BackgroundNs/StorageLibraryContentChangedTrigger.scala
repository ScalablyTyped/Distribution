package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creates a trigger that will fire when a file is changed in a specified library. */
@JSGlobal("Windows.ApplicationModel.Background.StorageLibraryContentChangedTrigger")
@js.native
abstract class StorageLibraryContentChangedTrigger () extends js.Object

/** Creates a trigger that will fire when a file is changed in a specified library. */
@JSGlobal("Windows.ApplicationModel.Background.StorageLibraryContentChangedTrigger")
@js.native
object StorageLibraryContentChangedTrigger extends js.Object {
  /**
                   * Creates a trigger that will fire when a file is changed in the specified library.
                   * @param storageLibrary The location that the trigger monitors such as the music library or documents library.
                   * @return A trigger that monitors the specified location.
                   */
  def create(storageLibrary: winrtDashUwpLib.WindowsNs.StorageNs.StorageLibrary): winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.StorageLibraryContentChangedTrigger = js.native
  /**
                   * Creates a trigger that will fire when a file is changed in any of the specified libraries.
                   * @param storageLibraries The list of libraries that the trigger will monitor.
                   * @return A trigger that monitors the specified location(s).
                   */
  def createFromLibraries(
    storageLibraries: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtDashUwpLib.WindowsNs.StorageNs.StorageLibrary]
  ): winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.StorageLibraryContentChangedTrigger = js.native
}

