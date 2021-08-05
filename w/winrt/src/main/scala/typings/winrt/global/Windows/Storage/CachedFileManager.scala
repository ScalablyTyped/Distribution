package typings.winrt.global.Windows.Storage

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.Windows.Storage.Provider.FileUpdateStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Storage.CachedFileManager")
@js.native
class CachedFileManager ()
  extends StObject
     with typings.winrt.Windows.Storage.CachedFileManager
/* static members */
object CachedFileManager {
  
  @JSGlobal("Windows.Storage.CachedFileManager")
  @js.native
  val ^ : js.Any = js.native
  
  inline def completeUpdatesAsync(file: IStorageFile): IAsyncOperation[FileUpdateStatus] = ^.asInstanceOf[js.Dynamic].applyDynamic("completeUpdatesAsync")(file.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[FileUpdateStatus]]
  
  inline def deferUpdates(file: IStorageFile): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deferUpdates")(file.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
