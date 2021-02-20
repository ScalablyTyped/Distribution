package typings.winrt.Windows.Storage.Search

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions
import typings.winrt.Windows.Storage.FileProperties.ThumbnailMode
import typings.winrt.Windows.Storage.FileProperties.ThumbnailOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IQueryOptions extends StObject {
  
  var applicationSearchFilter: String = js.native
  
  var dateStackOption: DateStackOption = js.native
  
  var fileTypeFilter: IVector[String] = js.native
  
  var folderDepth: FolderDepth = js.native
  
  var groupPropertyName: String = js.native
  
  var indexerOption: IndexerOption = js.native
  
  var language: String = js.native
  
  def loadFromString(value: String): Unit = js.native
  
  def saveToString(): String = js.native
  
  def setPropertyPrefetch(options: PropertyPrefetchOptions, propertiesToRetrieve: IIterable[String]): Unit = js.native
  
  def setThumbnailPrefetch(mode: ThumbnailMode, requestedSize: Double, options: ThumbnailOptions): Unit = js.native
  
  var sortOrder: IVector[SortEntry] = js.native
  
  var userSearchFilter: String = js.native
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
  implicit class IQueryOptionsMutableBuilder[Self <: IQueryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationSearchFilter(value: String): Self = StObject.set(x, "applicationSearchFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateStackOption(value: DateStackOption): Self = StObject.set(x, "dateStackOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTypeFilter(value: IVector[String]): Self = StObject.set(x, "fileTypeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderDepth(value: FolderDepth): Self = StObject.set(x, "folderDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupPropertyName(value: String): Self = StObject.set(x, "groupPropertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexerOption(value: IndexerOption): Self = StObject.set(x, "indexerOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadFromString(value: String => Unit): Self = StObject.set(x, "loadFromString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSaveToString(value: () => String): Self = StObject.set(x, "saveToString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetPropertyPrefetch(value: (PropertyPrefetchOptions, IIterable[String]) => Unit): Self = StObject.set(x, "setPropertyPrefetch", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetThumbnailPrefetch(value: (ThumbnailMode, Double, ThumbnailOptions) => Unit): Self = StObject.set(x, "setThumbnailPrefetch", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSortOrder(value: IVector[SortEntry]): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserSearchFilter(value: String): Self = StObject.set(x, "userSearchFilter", value.asInstanceOf[js.Any])
  }
}
