package typings
package winrtLib.WindowsNs.StorageNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Search.QueryOptions")
@js.native
class QueryOptions () extends IQueryOptions {
  def this(query: CommonFolderQuery) = this()
  def this(query: CommonFileQuery, fileTypeFilter: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]) = this()
  /* CompleteClass */
  override var applicationSearchFilter: java.lang.String = js.native
  /* CompleteClass */
  override var dateStackOption: DateStackOption = js.native
  /* CompleteClass */
  override var fileTypeFilter: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /* CompleteClass */
  override var folderDepth: FolderDepth = js.native
  /* CompleteClass */
  override var groupPropertyName: java.lang.String = js.native
  /* CompleteClass */
  override var indexerOption: IndexerOption = js.native
  /* CompleteClass */
  override var language: java.lang.String = js.native
  /* CompleteClass */
  override var sortOrder: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SortEntry] = js.native
  /* CompleteClass */
  override var userSearchFilter: java.lang.String = js.native
  /* CompleteClass */
  override def loadFromString(value: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def saveToString(): java.lang.String = js.native
  /* CompleteClass */
  override def setPropertyPrefetch(
    options: winrtLib.WindowsNs.StorageNs.FilePropertiesNs.PropertyPrefetchOptions,
    propertiesToRetrieve: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def setThumbnailPrefetch(
    mode: winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode,
    requestedSize: scala.Double,
    options: winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailOptions
  ): scala.Unit = js.native
}

