package typings.winrt.WindowsNs.StorageNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.StorageItemContentProperties
import typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.StorageItemThumbnail
import typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode
import typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStorageItemProperties extends js.Object {
  var displayName: String = js.native
  var displayType: String = js.native
  var folderRelativeId: String = js.native
  var properties: StorageItemContentProperties = js.native
  def getThumbnailAsync(mode: ThumbnailMode): IAsyncOperation[StorageItemThumbnail] = js.native
  def getThumbnailAsync(mode: ThumbnailMode, requestedSize: Double): IAsyncOperation[StorageItemThumbnail] = js.native
  def getThumbnailAsync(mode: ThumbnailMode, requestedSize: Double, options: ThumbnailOptions): IAsyncOperation[StorageItemThumbnail] = js.native
}

