package typings.winrt.WindowsNs.StorageNs.BulkAccessNs

import typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode
import typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailOptions
import typings.winrt.WindowsNs.StorageNs.SearchNs.IStorageQueryResultBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileInformationFactoryFactory extends js.Object {
  def createWithMode(queryResult: IStorageQueryResultBase, mode: ThumbnailMode): FileInformationFactory
  def createWithModeAndSize(queryResult: IStorageQueryResultBase, mode: ThumbnailMode, requestedThumbnailSize: Double): FileInformationFactory
  def createWithModeAndSizeAndOptions(
    queryResult: IStorageQueryResultBase,
    mode: ThumbnailMode,
    requestedThumbnailSize: Double,
    thumbnailOptions: ThumbnailOptions
  ): FileInformationFactory
  def createWithModeAndSizeAndOptionsAndFlags(
    queryResult: IStorageQueryResultBase,
    mode: ThumbnailMode,
    requestedThumbnailSize: Double,
    thumbnailOptions: ThumbnailOptions,
    delayLoad: Boolean
  ): FileInformationFactory
}

object IFileInformationFactoryFactory {
  @scala.inline
  def apply(
    createWithMode: (IStorageQueryResultBase, ThumbnailMode) => FileInformationFactory,
    createWithModeAndSize: (IStorageQueryResultBase, ThumbnailMode, Double) => FileInformationFactory,
    createWithModeAndSizeAndOptions: (IStorageQueryResultBase, ThumbnailMode, Double, ThumbnailOptions) => FileInformationFactory,
    createWithModeAndSizeAndOptionsAndFlags: (IStorageQueryResultBase, ThumbnailMode, Double, ThumbnailOptions, Boolean) => FileInformationFactory
  ): IFileInformationFactoryFactory = {
    val __obj = js.Dynamic.literal(createWithMode = js.Any.fromFunction2(createWithMode), createWithModeAndSize = js.Any.fromFunction3(createWithModeAndSize), createWithModeAndSizeAndOptions = js.Any.fromFunction4(createWithModeAndSizeAndOptions), createWithModeAndSizeAndOptionsAndFlags = js.Any.fromFunction5(createWithModeAndSizeAndOptionsAndFlags))
  
    __obj.asInstanceOf[IFileInformationFactoryFactory]
  }
}

