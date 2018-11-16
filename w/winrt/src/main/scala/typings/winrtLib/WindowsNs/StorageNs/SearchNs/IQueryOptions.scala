package typings
package winrtLib.WindowsNs.StorageNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IQueryOptions extends js.Object {
  var applicationSearchFilter: java.lang.String
  var dateStackOption: DateStackOption
  var fileTypeFilter: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String]
  var folderDepth: FolderDepth
  var groupPropertyName: java.lang.String
  var indexerOption: IndexerOption
  var language: java.lang.String
  var sortOrder: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SortEntry]
  var userSearchFilter: java.lang.String
  def loadFromString(value: java.lang.String): scala.Unit
  def saveToString(): java.lang.String
  def setPropertyPrefetch(
    options: winrtLib.WindowsNs.StorageNs.FilePropertiesNs.PropertyPrefetchOptions,
    propertiesToRetrieve: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): scala.Unit
  def setThumbnailPrefetch(
    mode: winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode,
    requestedSize: scala.Double,
    options: winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailOptions
  ): scala.Unit
}

