package typings.winrt.Windows.Storage.BulkAccess

import typings.winrt.Windows.Storage.FileProperties.ThumbnailMode
import typings.winrt.Windows.Storage.FileProperties.ThumbnailOptions
import typings.winrt.Windows.Storage.Search.IStorageQueryResultBase
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

