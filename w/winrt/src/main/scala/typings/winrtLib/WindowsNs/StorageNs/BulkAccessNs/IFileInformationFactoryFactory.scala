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

