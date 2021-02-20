package typings.winrt.global.Windows.Storage

import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Storage.DownloadsFolder")
@js.native
class DownloadsFolder ()
  extends typings.winrt.Windows.Storage.DownloadsFolder
/* static members */
object DownloadsFolder {
  
  @JSGlobal("Windows.Storage.DownloadsFolder.createFileAsync")
  @js.native
  def createFileAsync(desiredName: String): IAsyncOperation[typings.winrt.Windows.Storage.StorageFile] = js.native
  @JSGlobal("Windows.Storage.DownloadsFolder.createFileAsync")
  @js.native
  def createFileAsync(desiredName: String, option: typings.winrt.Windows.Storage.CreationCollisionOption): IAsyncOperation[typings.winrt.Windows.Storage.StorageFile] = js.native
  
  @JSGlobal("Windows.Storage.DownloadsFolder.createFolderAsync")
  @js.native
  def createFolderAsync(desiredName: String): IAsyncOperation[typings.winrt.Windows.Storage.StorageFolder] = js.native
  @JSGlobal("Windows.Storage.DownloadsFolder.createFolderAsync")
  @js.native
  def createFolderAsync(desiredName: String, option: typings.winrt.Windows.Storage.CreationCollisionOption): IAsyncOperation[typings.winrt.Windows.Storage.StorageFolder] = js.native
}
