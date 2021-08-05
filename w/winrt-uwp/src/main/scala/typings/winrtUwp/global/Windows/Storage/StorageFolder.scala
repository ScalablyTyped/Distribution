package typings.winrtUwp.global.Windows.Storage

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages folders and their contents and provides information about them. */
@JSGlobal("Windows.Storage.StorageFolder")
@js.native
abstract class StorageFolder ()
  extends StObject
     with typings.winrtUwp.Windows.Storage.StorageFolder
object StorageFolder {
  
  @JSGlobal("Windows.Storage.StorageFolder")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets the folder that has the specified absolute path in the file system.
    * @param path The absolute path in the file system (not the Uri) of the folder to get.
    * @return When this method completes successfully, it returns a StorageFolder that represents the specified folder.
    */
  /* static member */
  inline def getFolderFromPathAsync(path: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Storage.StorageFolder] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFolderFromPathAsync")(path.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Storage.StorageFolder]]
}
