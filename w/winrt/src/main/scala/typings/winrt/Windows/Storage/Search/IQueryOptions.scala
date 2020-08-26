package typings.winrt.Windows.Storage.Search

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions
import typings.winrt.Windows.Storage.FileProperties.ThumbnailMode
import typings.winrt.Windows.Storage.FileProperties.ThumbnailOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQueryOptions extends js.Object {
  var applicationSearchFilter: String = js.native
  var dateStackOption: DateStackOption = js.native
  var fileTypeFilter: IVector[String] = js.native
  var folderDepth: FolderDepth = js.native
  var groupPropertyName: String = js.native
  var indexerOption: IndexerOption = js.native
  var language: String = js.native
  var sortOrder: IVector[SortEntry] = js.native
  var userSearchFilter: String = js.native
  def loadFromString(value: String): Unit = js.native
  def saveToString(): String = js.native
  def setPropertyPrefetch(options: PropertyPrefetchOptions, propertiesToRetrieve: IIterable[String]): Unit = js.native
  def setThumbnailPrefetch(mode: ThumbnailMode, requestedSize: Double, options: ThumbnailOptions): Unit = js.native
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
    val __obj = js.Dynamic.literal(applicationSearchFilter = applicationSearchFilter.asInstanceOf[js.Any], dateStackOption = dateStackOption.asInstanceOf[js.Any], fileTypeFilter = fileTypeFilter.asInstanceOf[js.Any], folderDepth = folderDepth.asInstanceOf[js.Any], groupPropertyName = groupPropertyName.asInstanceOf[js.Any], indexerOption = indexerOption.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], loadFromString = js.Any.fromFunction1(loadFromString), saveToString = js.Any.fromFunction0(saveToString), setPropertyPrefetch = js.Any.fromFunction2(setPropertyPrefetch), setThumbnailPrefetch = js.Any.fromFunction3(setThumbnailPrefetch), sortOrder = sortOrder.asInstanceOf[js.Any], userSearchFilter = userSearchFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQueryOptions]
  }
  @scala.inline
  implicit class IQueryOptionsOps[Self <: IQueryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplicationSearchFilter(value: String): Self = this.set("applicationSearchFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateStackOption(value: DateStackOption): Self = this.set("dateStackOption", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileTypeFilter(value: IVector[String]): Self = this.set("fileTypeFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def setFolderDepth(value: FolderDepth): Self = this.set("folderDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupPropertyName(value: String): Self = this.set("groupPropertyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndexerOption(value: IndexerOption): Self = this.set("indexerOption", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadFromString(value: String => Unit): Self = this.set("loadFromString", js.Any.fromFunction1(value))
    @scala.inline
    def setSaveToString(value: () => String): Self = this.set("saveToString", js.Any.fromFunction0(value))
    @scala.inline
    def setSetPropertyPrefetch(value: (PropertyPrefetchOptions, IIterable[String]) => Unit): Self = this.set("setPropertyPrefetch", js.Any.fromFunction2(value))
    @scala.inline
    def setSetThumbnailPrefetch(value: (ThumbnailMode, Double, ThumbnailOptions) => Unit): Self = this.set("setThumbnailPrefetch", js.Any.fromFunction3(value))
    @scala.inline
    def setSortOrder(value: IVector[SortEntry]): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserSearchFilter(value: String): Self = this.set("userSearchFilter", value.asInstanceOf[js.Any])
  }
  
}

