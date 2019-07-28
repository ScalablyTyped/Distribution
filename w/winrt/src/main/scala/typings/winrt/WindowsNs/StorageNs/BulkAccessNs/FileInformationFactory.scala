package typings.winrt.WindowsNs.StorageNs.BulkAccessNs

import typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode
import typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailOptions
import typings.winrt.WindowsNs.StorageNs.SearchNs.IStorageQueryResultBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.BulkAccess.FileInformationFactory")
@js.native
class FileInformationFactory protected () extends IFileInformationFactory {
  def this(queryResult: IStorageQueryResultBase, mode: ThumbnailMode) = this()
  def this(queryResult: IStorageQueryResultBase, mode: ThumbnailMode, requestedThumbnailSize: Double) = this()
  def this(
    queryResult: IStorageQueryResultBase,
    mode: ThumbnailMode,
    requestedThumbnailSize: Double,
    thumbnailOptions: ThumbnailOptions
  ) = this()
  def this(
    queryResult: IStorageQueryResultBase,
    mode: ThumbnailMode,
    requestedThumbnailSize: Double,
    thumbnailOptions: ThumbnailOptions,
    delayLoad: Boolean
  ) = this()
}

