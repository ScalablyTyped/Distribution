package typings
package winrtDashUwpLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Lets apps manage real-time updates to files. */
@JSGlobal("Windows.Storage.CachedFileManager")
@js.native
abstract class CachedFileManager () extends js.Object

/** Lets apps manage real-time updates to files. */
@JSGlobal("Windows.Storage.CachedFileManager")
@js.native
object CachedFileManager extends js.Object {
  /**
               * Initiates updates for the specified file. This method contacts the app that provided the file to perform the updates.
               * @param file The file to update.
               * @return When this method completes, it returns a FileUpdateStatus enum value that describes the status of the updates to the file.
               */
  def completeUpdatesAsync(file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.ProviderNs.FileUpdateStatus] = js.native
  /**
               * Lets apps defer real-time updates for a specified file.
               * @param file The file to defer updates for.
               */
  def deferUpdates(file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile): scala.Unit = js.native
}

