package typings
package winrtLib.WindowsNs.StorageNs.BulkAccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileInformationFactoryFactory extends js.Object {
  def createWithMode(
    queryResult: winrtLib.WindowsNs.StorageNs.SearchNs.IStorageQueryResultBase,
    mode: winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode
  ): FileInformationFactory
  def createWithModeAndSize(
    queryResult: winrtLib.WindowsNs.StorageNs.SearchNs.IStorageQueryResultBase,
    mode: winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode,
    requestedThumbnailSize: scala.Double
  ): FileInformationFactory
  def createWithModeAndSizeAndOptions(
    queryResult: winrtLib.WindowsNs.StorageNs.SearchNs.IStorageQueryResultBase,
    mode: winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode,
    requestedThumbnailSize: scala.Double,
    thumbnailOptions: winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailOptions
  ): FileInformationFactory
  def createWithModeAndSizeAndOptionsAndFlags(
    queryResult: winrtLib.WindowsNs.StorageNs.SearchNs.IStorageQueryResultBase,
    mode: winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode,
    requestedThumbnailSize: scala.Double,
    thumbnailOptions: winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailOptions,
    delayLoad: scala.Boolean
  ): FileInformationFactory
}

object IFileInformationFactoryFactory {
  @scala.inline
  def apply(
    createWithMode: (winrtLib.WindowsNs.StorageNs.SearchNs.IStorageQueryResultBase, winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode) => FileInformationFactory,
    createWithModeAndSize: (winrtLib.WindowsNs.StorageNs.SearchNs.IStorageQueryResultBase, winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode, scala.Double) => FileInformationFactory,
    createWithModeAndSizeAndOptions: (winrtLib.WindowsNs.StorageNs.SearchNs.IStorageQueryResultBase, winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode, scala.Double, winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailOptions) => FileInformationFactory,
    createWithModeAndSizeAndOptionsAndFlags: (winrtLib.WindowsNs.StorageNs.SearchNs.IStorageQueryResultBase, winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode, scala.Double, winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailOptions, scala.Boolean) => FileInformationFactory
  ): IFileInformationFactoryFactory = {
    val __obj = js.Dynamic.literal(createWithMode = js.Any.fromFunction2(createWithMode), createWithModeAndSize = js.Any.fromFunction3(createWithModeAndSize), createWithModeAndSizeAndOptions = js.Any.fromFunction4(createWithModeAndSizeAndOptions), createWithModeAndSizeAndOptionsAndFlags = js.Any.fromFunction5(createWithModeAndSizeAndOptionsAndFlags))
  
    __obj.asInstanceOf[IFileInformationFactoryFactory]
  }
}

