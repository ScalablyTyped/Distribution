package typings.winrt.global.Windows.Storage

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.Windows.Storage.Provider.FileUpdateStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Storage.CachedFileManager")
@js.native
class CachedFileManager ()
  extends typings.winrt.Windows.Storage.CachedFileManager
/* static members */
object CachedFileManager {
  
  @JSGlobal("Windows.Storage.CachedFileManager.completeUpdatesAsync")
  @js.native
  def completeUpdatesAsync(file: IStorageFile): IAsyncOperation[FileUpdateStatus] = js.native
  
  @JSGlobal("Windows.Storage.CachedFileManager.deferUpdates")
  @js.native
  def deferUpdates(file: IStorageFile): Unit = js.native
}
