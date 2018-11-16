package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStorageItemProperties extends js.Object {
  var displayName: java.lang.String = js.native
  var displayType: java.lang.String = js.native
  var folderRelativeId: java.lang.String = js.native
  var properties: winrtLib.WindowsNs.StorageNs.FilePropertiesNs.StorageItemContentProperties = js.native
  def getThumbnailAsync(mode: winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.FilePropertiesNs.StorageItemThumbnail] = js.native
  def getThumbnailAsync(mode: winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode, requestedSize: scala.Double): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.FilePropertiesNs.StorageItemThumbnail] = js.native
  def getThumbnailAsync(
    mode: winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode,
    requestedSize: scala.Double,
    options: winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailOptions
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.FilePropertiesNs.StorageItemThumbnail] = js.native
}

