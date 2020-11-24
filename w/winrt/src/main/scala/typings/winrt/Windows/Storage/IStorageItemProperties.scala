package typings.winrt.Windows.Storage

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.FileProperties.StorageItemContentProperties
import typings.winrt.Windows.Storage.FileProperties.StorageItemThumbnail
import typings.winrt.Windows.Storage.FileProperties.ThumbnailMode
import typings.winrt.Windows.Storage.FileProperties.ThumbnailOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStorageItemProperties extends js.Object {
  
  var displayName: String = js.native
  
  var displayType: String = js.native
  
  var folderRelativeId: String = js.native
  
  def getThumbnailAsync(mode: ThumbnailMode): IAsyncOperation[StorageItemThumbnail] = js.native
  def getThumbnailAsync(mode: ThumbnailMode, requestedSize: Double): IAsyncOperation[StorageItemThumbnail] = js.native
  def getThumbnailAsync(mode: ThumbnailMode, requestedSize: Double, options: ThumbnailOptions): IAsyncOperation[StorageItemThumbnail] = js.native
  
  var properties: StorageItemContentProperties = js.native
}
