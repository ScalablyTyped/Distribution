package typings.winrt.Windows.Storage.Search

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions
import typings.winrt.Windows.Storage.FileProperties.ThumbnailMode
import typings.winrt.Windows.Storage.FileProperties.ThumbnailOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IQueryOptions extends StObject {
  
  var applicationSearchFilter: String
  
  var dateStackOption: DateStackOption
  
  var fileTypeFilter: IVector[String]
  
  var folderDepth: FolderDepth
  
  var groupPropertyName: String
  
  var indexerOption: IndexerOption
  
  var language: String
  
  def loadFromString(value: String): Unit
  
  def saveToString(): String
  
  def setPropertyPrefetch(options: PropertyPrefetchOptions, propertiesToRetrieve: IIterable[String]): Unit
  
  def setThumbnailPrefetch(mode: ThumbnailMode, requestedSize: Double, options: ThumbnailOptions): Unit
  
  var sortOrder: IVector[SortEntry]
  
  var userSearchFilter: String
}
object IQueryOptions {
  
  inline def apply(
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
  
  extension [Self <: IQueryOptions](x: Self) {
    
    inline def setApplicationSearchFilter(value: String): Self = StObject.set(x, "applicationSearchFilter", value.asInstanceOf[js.Any])
    
    inline def setDateStackOption(value: DateStackOption): Self = StObject.set(x, "dateStackOption", value.asInstanceOf[js.Any])
    
    inline def setFileTypeFilter(value: IVector[String]): Self = StObject.set(x, "fileTypeFilter", value.asInstanceOf[js.Any])
    
    inline def setFolderDepth(value: FolderDepth): Self = StObject.set(x, "folderDepth", value.asInstanceOf[js.Any])
    
    inline def setGroupPropertyName(value: String): Self = StObject.set(x, "groupPropertyName", value.asInstanceOf[js.Any])
    
    inline def setIndexerOption(value: IndexerOption): Self = StObject.set(x, "indexerOption", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLoadFromString(value: String => Unit): Self = StObject.set(x, "loadFromString", js.Any.fromFunction1(value))
    
    inline def setSaveToString(value: () => String): Self = StObject.set(x, "saveToString", js.Any.fromFunction0(value))
    
    inline def setSetPropertyPrefetch(value: (PropertyPrefetchOptions, IIterable[String]) => Unit): Self = StObject.set(x, "setPropertyPrefetch", js.Any.fromFunction2(value))
    
    inline def setSetThumbnailPrefetch(value: (ThumbnailMode, Double, ThumbnailOptions) => Unit): Self = StObject.set(x, "setThumbnailPrefetch", js.Any.fromFunction3(value))
    
    inline def setSortOrder(value: IVector[SortEntry]): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setUserSearchFilter(value: String): Self = StObject.set(x, "userSearchFilter", value.asInstanceOf[js.Any])
  }
}
