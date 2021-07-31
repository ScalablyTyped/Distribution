package typings.winrt.Windows.Storage

import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDownloadsFolderStatics extends StObject {
  
  def createFileAsync(desiredName: String): IAsyncOperation[StorageFile] = js.native
  def createFileAsync(desiredName: String, option: CreationCollisionOption): IAsyncOperation[StorageFile] = js.native
  
  def createFolderAsync(desiredName: String): IAsyncOperation[StorageFolder] = js.native
  def createFolderAsync(desiredName: String, option: CreationCollisionOption): IAsyncOperation[StorageFolder] = js.native
}
