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
@JSGlobal("Windows.Storage.Search.QueryOptions")
@js.native
/** Creates an instance of the QueryOptions class for enumerating storage items, and initializes it with the following default settings: QueryOptions.FolderDepth gets FolderDepth.Shallow and QueryOptions.IndexerOption gets IndexerOption.DoNotUseIndexer . */
class QueryOptions () extends js.Object {
  /**
    * Creates an instance of the QueryOptions class for enumerating subfolders and initializes it with values based on the specified CommonFolderQuery .
    * @param query An enumeration value that specifies how to group the contents of the folder where the query is created into subfolders to enumerate. The subfolders that are retrieved using a CommonFolderQuery can be actual file system folders or virtual folders that represent groups of files (which are determined by the CommonFolderQuery value). For example, the CommonFolderQuery.GroupByArtist uses the Artist of the files in the folder (and its subfolders) to group files, creating one virtual folder (or file group) for each artist.
    */
  def this(query: CommonFolderQuery) = this()
  /**
    * Creates an instance of the QueryOptions class for enumerating files and initializes it with values provided by the specified CommonFileQuery and an optional file type filter that determines which files to include in query results.
    * @param query An enumeration value that specifies the search parameters to use to query files.
    * @param fileTypeFilter An array of file types to be included in the query results. To include all file types, supply null or an array containing a single entry of "*".
    */
  def this(query: CommonFileQuery, fileTypeFilter: IIterable[String]) = this()
  /** Gets or sets an application-defined Advanced Query Syntax (AQS) string for filtering files by keywords or properties. This property is combined with the UserSearchFilter to create the query's search filter. */
  var applicationSearchFilter: String = js.native
  /** Gets the unit of time used to group files into folders if the QueryOptions object was created with a CommonFolderQuery based on date. For example, if CommonFolderQuery.GroupByYear is used to create a QueryOptions object, the value of this property is DateStackOption.Year . */
  var dateStackOption: DateStackOption = js.native
  /** Gets a list of file name extensions used to filter the search results. If the list is empty, the results include all file types. */
  var fileTypeFilter: IVector[String] = js.native
  /** Indicates whether the search query should produce a shallow view of the folder contents or a deep recursive view of all files and subfolder. */
  var folderDepth: FolderDepth = js.native
  /** Gets the name of the property used to group query results if the QueryOptions object was created using a CommonFolderQuery . For example, if CommonFolderQuery.GroupByYear is used to create a QueryOptions object, the value of this property is System.ItemDate . */
  var groupPropertyName: String = js.native
  /** Gets or sets a value that specifies whether the system index or the file system is used to retrieve query results. The indexer can retrieve results faster but is not available in all file locations. */
  var indexerOption: IndexerOption = js.native
  /** Gets or sets the Internet Engineering Task Force (IETF) language tag (BCP47 standard) that identifies the language associated with the query. This determines the language-specific algorithm used by the system to break the query into individual search tokens. */
  var language: String = js.native
  /** Gets the list of SortEntry structures that specify how to sort content (like files and subfolders) in query results. Use this list to customize how query results are sorted. */
  var sortOrder: IVector[SortEntry] = js.native
  /** Gets the filter for storage provider identifiers. */
  var storageProviderIdFilter: IVector[String] = js.native
  /** Gets or sets a user-defined Advanced Query Syntax (AQS) string for filtering files by keywords or properties. This property is combined with the ApplicationSearchFilter to create the query's search filter. */
  var userSearchFilter: String = js.native
  /**
    * Initializes the current instance of the QueryOptions class with search parameters specified by a string that was created by the SaveToString method.
    * @param value A string retrieved by a previous call to SaveToString .
    */
  def loadFromString(value: String): Unit = js.native
  /**
    * Converts the values of a QueryOptions object to a string that can be used to initialize the values of a QueryOptions object by calling LoadFromString .
    * @return A string representing the serialized settings of a QueryOptions instance.
    */
  def saveToString(): String = js.native
  /**
    * Specifies properties that the system should load in advance for all items in the query result set while the query is being executed (instead of retrieving them on a case-by-case basis). If many properties are specified, the query might take longer to execute, but subsequent property retrieval on query results will be faster.
    * @param options A value that specifies the set of properties to retrieve in advance.
    * @param propertiesToRetrieve A custom list of properties to retrieve in advance as an array of property names. Use the system property names to specify properties, for example "System.Copyright" and "System.Image.ColorSpace".
    */
  def setPropertyPrefetch(options: PropertyPrefetchOptions, propertiesToRetrieve: IIterable[String]): Unit = js.native
  /**
    * Specifies the type and size of thumbnails that the system should start loading immediately when items are accessed (instead of retrieving them on a case-by-case basis). This uses more resources but makes thumbnail retrieval on query results faster.
    * @param mode The enumeration value that describes the purpose of the thumbnail and determines how the thumbnail image is adjusted.
    * @param requestedSize The requested size, in pixels, of the longest edge of the thumbnail. Windows uses the requestedSize as a guide and tries to return a thumbnail image that can be scaled to the requested size without reducing the quality of the image.
    * @param options The enum value that describes the desired behavior to use to retrieve the thumbnail image. The specified behavior might affect the size and/or quality of the image and how quickly the thumbnail image is retrieved.
    */
  def setThumbnailPrefetch(mode: ThumbnailMode, requestedSize: Double, options: ThumbnailOptions): Unit = js.native
}

