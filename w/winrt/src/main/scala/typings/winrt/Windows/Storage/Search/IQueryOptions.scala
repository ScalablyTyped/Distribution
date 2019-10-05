package typings.winrt.Windows.Storage.Search

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions
import typings.winrt.Windows.Storage.FileProperties.ThumbnailMode
import typings.winrt.Windows.Storage.FileProperties.ThumbnailOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQueryOptions extends js.Object {
  var applicationSearchFilter: String
  var dateStackOption: DateStackOption
  var fileTypeFilter: IVector[String]
  var folderDepth: FolderDepth
  var groupPropertyName: String
  var indexerOption: IndexerOption
  var language: String
  var sortOrder: IVector[SortEntry]
  var userSearchFilter: String
  def loadFromString(value: String): Unit
  def saveToString(): String
  def setPropertyPrefetch(options: PropertyPrefetchOptions, propertiesToRetrieve: IIterable[String]): Unit
  def setThumbnailPrefetch(mode: ThumbnailMode, requestedSize: Double, options: ThumbnailOptions): Unit
}

object IQueryOptions {
  @scala.inline
  def apply(
    applicationSearchFilter: String,
    dateStackOption: DateStackOption,
    fileTypeFilter: IVector[String],
    folderDepth: FolderDepth,
    groupPropertyName: String,
    indexerOption: IndexerOption,
    language: String,
    loadFromString: String => Unit,
    saveToString: () => String,
    setPropertyPrefetch: (PropertyPrefetchOptions, IIterable[String]) => Unit,
    setThumbnailPrefetch: (ThumbnailMode, Double, ThumbnailOptions) => Unit,
    sortOrder: IVector[SortEntry],
    userSearchFilter: String
  ): IQueryOptions = {
    val __obj = js.Dynamic.literal(applicationSearchFilter = applicationSearchFilter, dateStackOption = dateStackOption, fileTypeFilter = fileTypeFilter, folderDepth = folderDepth, groupPropertyName = groupPropertyName, indexerOption = indexerOption, language = language, loadFromString = js.Any.fromFunction1(loadFromString), saveToString = js.Any.fromFunction0(saveToString), setPropertyPrefetch = js.Any.fromFunction2(setPropertyPrefetch), setThumbnailPrefetch = js.Any.fromFunction3(setThumbnailPrefetch), sortOrder = sortOrder, userSearchFilter = userSearchFilter)
  
    __obj.asInstanceOf[IQueryOptions]
  }
}

