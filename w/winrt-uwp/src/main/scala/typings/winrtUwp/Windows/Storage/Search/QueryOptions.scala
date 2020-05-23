package typings.winrtUwp.Windows.Storage.Search

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Storage.FileProperties.PropertyPrefetchOptions
import typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailMode
import typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the parameters of a search query for enumerating the contents of storage folders. */
trait QueryOptions extends js.Object {
  /** Gets or sets an application-defined Advanced Query Syntax (AQS) string for filtering files by keywords or properties. This property is combined with the UserSearchFilter to create the query's search filter. */
  var applicationSearchFilter: String
  /** Gets the unit of time used to group files into folders if the QueryOptions object was created with a CommonFolderQuery based on date. For example, if CommonFolderQuery.GroupByYear is used to create a QueryOptions object, the value of this property is DateStackOption.Year . */
  var dateStackOption: DateStackOption
  /** Gets a list of file name extensions used to filter the search results. If the list is empty, the results include all file types. */
  var fileTypeFilter: IVector[String]
  /** Indicates whether the search query should produce a shallow view of the folder contents or a deep recursive view of all files and subfolder. */
  var folderDepth: FolderDepth
  /** Gets the name of the property used to group query results if the QueryOptions object was created using a CommonFolderQuery . For example, if CommonFolderQuery.GroupByYear is used to create a QueryOptions object, the value of this property is System.ItemDate . */
  var groupPropertyName: String
  /** Gets or sets a value that specifies whether the system index or the file system is used to retrieve query results. The indexer can retrieve results faster but is not available in all file locations. */
  var indexerOption: IndexerOption
  /** Gets or sets the Internet Engineering Task Force (IETF) language tag (BCP47 standard) that identifies the language associated with the query. This determines the language-specific algorithm used by the system to break the query into individual search tokens. */
  var language: String
  /** Gets the list of SortEntry structures that specify how to sort content (like files and subfolders) in query results. Use this list to customize how query results are sorted. */
  var sortOrder: IVector[SortEntry]
  /** Gets the filter for storage provider identifiers. */
  var storageProviderIdFilter: IVector[String]
  /** Gets or sets a user-defined Advanced Query Syntax (AQS) string for filtering files by keywords or properties. This property is combined with the ApplicationSearchFilter to create the query's search filter. */
  var userSearchFilter: String
  /**
    * Initializes the current instance of the QueryOptions class with search parameters specified by a string that was created by the SaveToString method.
    * @param value A string retrieved by a previous call to SaveToString .
    */
  def loadFromString(value: String): Unit
  /**
    * Converts the values of a QueryOptions object to a string that can be used to initialize the values of a QueryOptions object by calling LoadFromString .
    * @return A string representing the serialized settings of a QueryOptions instance.
    */
  def saveToString(): String
  /**
    * Specifies properties that the system should load in advance for all items in the query result set while the query is being executed (instead of retrieving them on a case-by-case basis). If many properties are specified, the query might take longer to execute, but subsequent property retrieval on query results will be faster.
    * @param options A value that specifies the set of properties to retrieve in advance.
    * @param propertiesToRetrieve A custom list of properties to retrieve in advance as an array of property names. Use the system property names to specify properties, for example "System.Copyright" and "System.Image.ColorSpace".
    */
  def setPropertyPrefetch(options: PropertyPrefetchOptions, propertiesToRetrieve: IIterable[String]): Unit
  /**
    * Specifies the type and size of thumbnails that the system should start loading immediately when items are accessed (instead of retrieving them on a case-by-case basis). This uses more resources but makes thumbnail retrieval on query results faster.
    * @param mode The enumeration value that describes the purpose of the thumbnail and determines how the thumbnail image is adjusted.
    * @param requestedSize The requested size, in pixels, of the longest edge of the thumbnail. Windows uses the requestedSize as a guide and tries to return a thumbnail image that can be scaled to the requested size without reducing the quality of the image.
    * @param options The enum value that describes the desired behavior to use to retrieve the thumbnail image. The specified behavior might affect the size and/or quality of the image and how quickly the thumbnail image is retrieved.
    */
  def setThumbnailPrefetch(mode: ThumbnailMode, requestedSize: Double, options: ThumbnailOptions): Unit
}

object QueryOptions {
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
    storageProviderIdFilter: IVector[String],
    userSearchFilter: String
  ): QueryOptions = {
    val __obj = js.Dynamic.literal(applicationSearchFilter = applicationSearchFilter.asInstanceOf[js.Any], dateStackOption = dateStackOption.asInstanceOf[js.Any], fileTypeFilter = fileTypeFilter.asInstanceOf[js.Any], folderDepth = folderDepth.asInstanceOf[js.Any], groupPropertyName = groupPropertyName.asInstanceOf[js.Any], indexerOption = indexerOption.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], loadFromString = js.Any.fromFunction1(loadFromString), saveToString = js.Any.fromFunction0(saveToString), setPropertyPrefetch = js.Any.fromFunction2(setPropertyPrefetch), setThumbnailPrefetch = js.Any.fromFunction3(setThumbnailPrefetch), sortOrder = sortOrder.asInstanceOf[js.Any], storageProviderIdFilter = storageProviderIdFilter.asInstanceOf[js.Any], userSearchFilter = userSearchFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptions]
  }
}

