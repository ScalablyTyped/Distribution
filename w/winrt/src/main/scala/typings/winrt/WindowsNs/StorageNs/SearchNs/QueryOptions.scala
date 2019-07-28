package typings.winrt.WindowsNs.StorageNs.SearchNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IIterable
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.PropertyPrefetchOptions
import typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode
import typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Search.QueryOptions")
@js.native
class QueryOptions () extends IQueryOptions {
  def this(query: CommonFolderQuery) = this()
  def this(query: CommonFileQuery, fileTypeFilter: IIterable[String]) = this()
  /* CompleteClass */
  override var applicationSearchFilter: String = js.native
  /* CompleteClass */
  override var dateStackOption: DateStackOption = js.native
  /* CompleteClass */
  override var fileTypeFilter: IVector[String] = js.native
  /* CompleteClass */
  override var folderDepth: FolderDepth = js.native
  /* CompleteClass */
  override var groupPropertyName: String = js.native
  /* CompleteClass */
  override var indexerOption: IndexerOption = js.native
  /* CompleteClass */
  override var language: String = js.native
  /* CompleteClass */
  override var sortOrder: IVector[SortEntry] = js.native
  /* CompleteClass */
  override var userSearchFilter: String = js.native
  /* CompleteClass */
  override def loadFromString(value: String): Unit = js.native
  /* CompleteClass */
  override def saveToString(): String = js.native
  /* CompleteClass */
  override def setPropertyPrefetch(options: PropertyPrefetchOptions, propertiesToRetrieve: IIterable[String]): Unit = js.native
  /* CompleteClass */
  override def setThumbnailPrefetch(mode: ThumbnailMode, requestedSize: Double, options: ThumbnailOptions): Unit = js.native
}

