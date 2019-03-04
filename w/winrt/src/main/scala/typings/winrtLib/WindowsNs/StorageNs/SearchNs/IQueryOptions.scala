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

object IQueryOptions {
  @scala.inline
  def apply(
    applicationSearchFilter: java.lang.String,
    dateStackOption: DateStackOption,
    fileTypeFilter: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String],
    folderDepth: FolderDepth,
    groupPropertyName: java.lang.String,
    indexerOption: IndexerOption,
    language: java.lang.String,
    loadFromString: js.Function1[java.lang.String, scala.Unit],
    saveToString: js.Function0[java.lang.String],
    setPropertyPrefetch: js.Function2[
      winrtLib.WindowsNs.StorageNs.FilePropertiesNs.PropertyPrefetchOptions, 
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String], 
      scala.Unit
    ],
    setThumbnailPrefetch: js.Function3[
      winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode, 
      scala.Double, 
      winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailOptions, 
      scala.Unit
    ],
    sortOrder: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SortEntry],
    userSearchFilter: java.lang.String
  ): IQueryOptions = {
    val __obj = js.Dynamic.literal(applicationSearchFilter = applicationSearchFilter, dateStackOption = dateStackOption, fileTypeFilter = fileTypeFilter, folderDepth = folderDepth, groupPropertyName = groupPropertyName, indexerOption = indexerOption, language = language, loadFromString = loadFromString, saveToString = saveToString, setPropertyPrefetch = setPropertyPrefetch, setThumbnailPrefetch = setThumbnailPrefetch, sortOrder = sortOrder, userSearchFilter = userSearchFilter)
  
    __obj.asInstanceOf[IQueryOptions]
  }
}

