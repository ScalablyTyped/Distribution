package typings.winrtUwp.global.Windows.Storage

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages folders and their contents and provides information about them. */
@JSGlobal("Windows.Storage.StorageFolder")
@js.native
abstract class StorageFolder ()
  extends typings.winrtUwp.Windows.Storage.StorageFolder

/* static members */
@JSGlobal("Windows.Storage.StorageFolder")
@js.native
object StorageFolder extends js.Object {
  /**
    * Gets the folder that has the specified absolute path in the file system.
    * @param path The absolute path in the file system (not the Uri) of the folder to get.
    * @return When this method completes successfully, it returns a StorageFolder that represents the specified folder.
    */
  def getFolderFromPathAsync(path: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Storage.StorageFolder] = js.native
}

