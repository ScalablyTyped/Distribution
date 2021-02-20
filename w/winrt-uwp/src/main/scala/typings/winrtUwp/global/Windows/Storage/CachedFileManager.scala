package typings.winrtUwp.global.Windows.Storage

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.Provider.FileUpdateStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Lets apps manage real-time updates to files. */
@JSGlobal("Windows.Storage.CachedFileManager")
@js.native
abstract class CachedFileManager ()
  extends typings.winrtUwp.Windows.Storage.CachedFileManager
object CachedFileManager {
  
  /**
    * Initiates updates for the specified file. This method contacts the app that provided the file to perform the updates.
    * @param file The file to update.
    * @return When this method completes, it returns a FileUpdateStatus enum value that describes the status of the updates to the file.
    */
  /* static member */
  @JSGlobal("Windows.Storage.CachedFileManager.completeUpdatesAsync")
  @js.native
  def completeUpdatesAsync(file: IStorageFile): IPromiseWithIAsyncOperation[FileUpdateStatus] = js.native
  
  /**
    * Lets apps defer real-time updates for a specified file.
    * @param file The file to defer updates for.
    */
  /* static member */
  @JSGlobal("Windows.Storage.CachedFileManager.deferUpdates")
  @js.native
  def deferUpdates(file: IStorageFile): Unit = js.native
}
