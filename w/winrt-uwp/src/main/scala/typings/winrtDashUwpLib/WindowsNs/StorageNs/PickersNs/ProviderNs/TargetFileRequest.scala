package typings
package winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Lets an app that provides a save location specify the storageFile that represents the file to save and get a deferral so the app can respond asynchronously to a targetFileRequested event. */
@JSGlobal("Windows.Storage.Pickers.Provider.TargetFileRequest")
@js.native
abstract class TargetFileRequest () extends js.Object {
  /** Gets or sets the IStorageFile object that is provided to represent the file to save by the app that is providing the save location. */
  var targetFile: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile = js.native
  /**
    * Gets a targetFileRequestDeferral that the app providing the save location can use to respond asynchronously to a targetfilerequested event.
    * @return The targetFileRequestDeferral that the providing app can use asynchronously to indicate that it is finished responding to a targetfilerequested event.
    */
  def getDeferral(): TargetFileRequestDeferral = js.native
}

