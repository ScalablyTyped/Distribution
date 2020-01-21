package typings.winrtUwp.Windows.Storage

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Provider.FileUpdateStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Lets apps manage real-time updates to files. */
@JSGlobal("Windows.Storage.CachedFileManager")
@js.native
abstract class CachedFileManager () extends js.Object

/* static members */
@JSGlobal("Windows.Storage.CachedFileManager")
@js.native
object CachedFileManager extends js.Object {
  /**
    * Initiates updates for the specified file. This method contacts the app that provided the file to perform the updates.
    * @param file The file to update.
    * @return When this method completes, it returns a FileUpdateStatus enum value that describes the status of the updates to the file.
    */
  def completeUpdatesAsync(file: IStorageFile): IPromiseWithIAsyncOperation[FileUpdateStatus] = js.native
  /**
    * Lets apps defer real-time updates for a specified file.
    * @param file The file to defer updates for.
    */
  def deferUpdates(file: IStorageFile): Unit = js.native
}

