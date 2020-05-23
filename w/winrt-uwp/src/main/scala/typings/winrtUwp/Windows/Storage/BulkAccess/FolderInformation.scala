package typings.winrtUwp.Windows.Storage.BulkAccess

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Storage.CreationCollisionOption
import typings.winrtUwp.Windows.Storage.FileAttributes
import typings.winrtUwp.Windows.Storage.FileProperties.BasicProperties
import typings.winrtUwp.Windows.Storage.FileProperties.DocumentProperties
import typings.winrtUwp.Windows.Storage.FileProperties.ImageProperties
import typings.winrtUwp.Windows.Storage.FileProperties.MusicProperties
import typings.winrtUwp.Windows.Storage.FileProperties.StorageItemContentProperties
import typings.winrtUwp.Windows.Storage.FileProperties.StorageItemThumbnail
import typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailMode
import typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailOptions
import typings.winrtUwp.Windows.Storage.FileProperties.VideoProperties
import typings.winrtUwp.Windows.Storage.IStorageItem
import typings.winrtUwp.Windows.Storage.NameCollisionOption
import typings.winrtUwp.Windows.Storage.Search.CommonFileQuery
import typings.winrtUwp.Windows.Storage.Search.CommonFolderQuery
import typings.winrtUwp.Windows.Storage.Search.IndexedState
import typings.winrtUwp.Windows.Storage.Search.QueryOptions
import typings.winrtUwp.Windows.Storage.Search.StorageFileQueryResult
import typings.winrtUwp.Windows.Storage.Search.StorageFolderQueryResult
import typings.winrtUwp.Windows.Storage.Search.StorageItemQueryResult
import typings.winrtUwp.Windows.Storage.StorageDeleteOption
import typings.winrtUwp.Windows.Storage.StorageFile
import typings.winrtUwp.Windows.Storage.StorageFolder
import typings.winrtUwp.Windows.Storage.StorageItemTypes
import typings.winrtUwp.Windows.Storage.StorageProvider
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.propertiesupdated
import typings.winrtUwp.winrtUwpStrings.thumbnailupdated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides synchronous access to the properties exposed off StorageFolder and lets an app perform asynchronous management operations such as copy, delete, move, and rename. */
@js.native
trait FolderInformation extends js.Object {
  /** Gets the attributes of a loaded folder. */
  var attributes: FileAttributes = js.native
  /** Gets an object that contains the basic properties information of the folder. */
  var basicProperties: BasicProperties = js.native
  /** Gets the date that the folder was created. */
  var dateCreated: Date = js.native
  /** Gets the user-friendly name of the StorageFolder . */
  var displayName: String = js.native
  /** Gets the display type of the StorageFolder . */
  var displayType: String = js.native
  /** Gets the document properties of the StorageFolder . */
  var documentProperties: DocumentProperties = js.native
  /** Gets the identifier that uniquely identifies the StorageFolder relative to other items in the same folder. */
  var folderRelativeId: String = js.native
  /** Gets the image properties of the StorageFolder . */
  var imageProperties: ImageProperties = js.native
  /** Gets the music properties associated with the StorageFolder . */
  var musicProperties: MusicProperties = js.native
  /** Gets the name of the StorageFolder . */
  var name: String = js.native
  /** Occurs when one or more of the StorageFolder 's properties is updated. */
  @JSName("onpropertiesupdated")
  var onpropertiesupdated_Original: TypedEventHandler[IStorageItemInformation, _] = js.native
  /** Fires when the StorageFolder 's thumbnail is updated or a better quality thumbnail is available. */
  @JSName("onthumbnailupdated")
  var onthumbnailupdated_Original: TypedEventHandler[IStorageItemInformation, _] = js.native
  /** Gets the path of the StorageFolder . */
  var path: String = js.native
  /** Gets an object for retrieving the properties of the StorageFolder . */
  var properties: StorageItemContentProperties = js.native
  /** Gets the StorageProvider object that contains info about the service that stores the current folder. */
  var provider: StorageProvider = js.native
  /** Gets the thumbnail for the StorageFile . */
  var thumbnail: StorageItemThumbnail = js.native
  /** Gets the video properties that are associated with the StorageFolder . */
  var videoProperties: VideoProperties = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_propertiesupdated(`type`: propertiesupdated, listener: TypedEventHandler[IStorageItemInformation, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_thumbnailupdated(`type`: thumbnailupdated, listener: TypedEventHandler[IStorageItemInformation, _]): Unit = js.native
  /**
    * Retrieves a value that indicates whether the folder supports the specified search query options.
    * @param queryOptions The search query options to test.
    * @return True if the folder supports the specified search query options; otherwise false.
    */
  def areQueryOptionsSupported(queryOptions: QueryOptions): Boolean = js.native
  /**
    * Creates a new file in the current folder.
    * @param desiredName The name of the new file.
    * @return When this method completes successfully, it returns a StorageFile that represents the new file.
    */
  def createFileAsync(desiredName: String): IPromiseWithIAsyncOperation[StorageFile] = js.native
  /**
    * Creates a new file in the current folder, and specifies what to do if a file with the same name already exists in the current folder.
    * @param desiredName The name of the new file.
    * @param options A value that indicates what to do if the file name already exists in the current folder.
    * @return When this method completes successfully, it returns a StorageFile that represents the new file.
    */
  def createFileAsync(desiredName: String, options: CreationCollisionOption): IPromiseWithIAsyncOperation[StorageFile] = js.native
  /**
    * Creates an object for performing filtered search queries for StorageFile in the current folder.
    * @return An object for managing the search queries and accessing the results.
    */
  def createFileQuery(): StorageFileQueryResult = js.native
  /**
    * Creates an object for performing filtered search queries for StorageFile objects in the current folder. Search results are grouped based on the specified file attribute.
    * @param query A value that specifies the folder attribute to use to group the search results.
    * @return An object for managing the search queries and accessing the results.
    */
  def createFileQuery(query: CommonFileQuery): StorageFileQueryResult = js.native
  /**
    * Creates an object used to perform filtered search queries for StorageFile objects in the folder. The object is initialized with the specified query options.
    * @param queryOptions The initial query options.
    * @return An object for managing the search queries and accessing the results.
    */
  def createFileQueryWithOptions(queryOptions: QueryOptions): StorageFileQueryResult = js.native
  /**
    * Creates a new child folder of the current folder.
    * @param desiredName The name of the new folder.
    * @return When this method completes successfully, it returns a StorageFolder that represents the new file.
    */
  def createFolderAsync(desiredName: String): IPromiseWithIAsyncOperation[StorageFolder] = js.native
  /**
    * Creates a new child folder of the current folder, and specifies what to do if a folder with the same name already exists in the current folder.
    * @param desiredName The name of the new folder.
    * @param options A value that indicates what to do if the child folder already exists in the current folder.
    * @return When this method completes successfully, it returns a StorageFolder that represents the new file.
    */
  def createFolderAsync(desiredName: String, options: CreationCollisionOption): IPromiseWithIAsyncOperation[StorageFolder] = js.native
  /**
    * Creates an object for performing filtered search queries for child StorageFolder objects of the current folder.
    * @return An object for managing the search queries and accessing the results.
    */
  def createFolderQuery(): StorageFolderQueryResult = js.native
  /**
    * Creates an object for performing filtered search queries for child StorageFolder objects of the current folder. Search results are grouped based on the specified folder attribute.
    * @param query A value that specifies the folder attribute to use to group the search results.
    * @return An object for managing the search queries and accessing the results.
    */
  def createFolderQuery(query: CommonFolderQuery): StorageFolderQueryResult = js.native
  /**
    * Creates an object used to perform filtered search queries for child StorageFolder objects of the current folder. The object is initialized with the specified query options.
    * @param queryOptions The initial query options.
    * @return An object for managing the search queries and accessing the results.
    */
  def createFolderQueryWithOptions(queryOptions: QueryOptions): StorageFolderQueryResult = js.native
  /**
    * Creates an object used to perform filtered search queries for items in the folder.
    * @return An object for managing the search queries and accessing the results.
    */
  def createItemQuery(): StorageItemQueryResult = js.native
  /**
    * Creates an object used to perform filtered search queries for items in the folder. The object is initialized with the specified query options.
    * @param queryOptions The initial query options.
    * @return An object for managing the search queries and accessing the results.
    */
  def createItemQueryWithOptions(queryOptions: QueryOptions): StorageItemQueryResult = js.native
  /**
    * Deletes the current folder.
    * @return No object or value is returned when this method completes.
    */
  def deleteAsync(): IPromiseWithIAsyncAction = js.native
  /**
    * Deletes the current folder, optionally moving the deleted folder to the recycle bin.
    * @param option A value that specifies whether to move the deleted folder to the recycle bin.
    * @return No object or value is returned when this method completes.
    */
  def deleteAsync(option: StorageDeleteOption): IPromiseWithIAsyncAction = js.native
  /**
    * Retrieves the basic properties of the StorageFolder object.
    * @return When this method completes successfully, it returns a BasicProperties object.
    */
  def getBasicPropertiesAsync(): IPromiseWithIAsyncOperation[BasicProperties] = js.native
  /**
    * Retrieves a file from the current folder.
    * @param name The name of the file to retrieve.
    * @return When this method completes successfully, it returns a StorageFile .
    */
  def getFileAsync(name: String): IPromiseWithIAsyncOperation[StorageFile] = js.native
  /**
    * Retrieves all files from the current folder.
    * @return When this method completes successfully, it returns the list (type IVectorView ) of StorageFile objects in the folder.
    */
  def getFilesAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Retrieves files from the current folder based on a common folder query.
    * @param query The common file query.
    * @return When this method completes successfully, it returns the list (type IVectorView ) of StorageFile objects in the folder.
    */
  def getFilesAsync(query: CommonFileQuery): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Retrieves a range of files from the current folder based on a common file query.
    * @param query The common file query.
    * @param startIndex The zero-based index of the first file in the range.
    * @param maxItemsToRetrieve The maximum number of files to retrieve.
    * @return When this method completes successfully, it returns the list (type IVectorView ) of StorageFile objects in the folder.
    */
  def getFilesAsync(query: CommonFileQuery, startIndex: Double, maxItemsToRetrieve: Double): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Retrieves the specified child folder from the current folder.
    * @param name The name of the child folder to retrieve.
    * @return When this method completes successfully, it returns a StorageFolder that represents the specified child folder.
    */
  def getFolderAsync(name: String): IPromiseWithIAsyncOperation[StorageFolder] = js.native
  /**
    * Retrieves all child folders from the current folder.
    * @return When this method completes successfully, it returns the list (type IVectorView ) of child folders. Each child folder in this list is represented by a StorageFolder object.
    */
  def getFoldersAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Retrieves child folders from the current folder based on a common folder query.
    * @param query The common folder query.
    * @return When this method completes successfully, it returns the list (type IVectorView ) of child folders. Each child folder in this list is represented by a StorageFolder object.
    */
  def getFoldersAsync(query: CommonFolderQuery): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Retrieves a range of child folders from the current folder based on a common folder query.
    * @param query The common folder query.
    * @param startIndex The zero-based index of the first child folder in the range.
    * @param maxItemsToRetrieve The maximum number of child folders to retrieve.
    * @return When this method completes successfully, it returns the list (type IVectorView ) of child folders. Each child folder in this list is represented by a StorageFolder object.
    */
  def getFoldersAsync(query: CommonFolderQuery, startIndex: Double, maxItemsToRetrieve: Double): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Retrieves the indexed state of the folder.
    * @return When this method completes successfully, it returns an IndexedState enumeration value.
    */
  def getIndexedStateAsync(): IPromiseWithIAsyncOperation[IndexedState] = js.native
  /**
    * Retrieves an item from the folder.
    * @param name The name of the item to retrieve.
    * @return When this method completes successfully, it returns the item (type IStorageItem ).
    */
  def getItemAsync(name: String): IPromiseWithIAsyncOperation[IStorageItem] = js.native
  /**
    * Retrieves all items from the current folder.
    * @return When this method completes successfully, it returns the list (type IVectorView ) of items.
    */
  def getItemsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Retrieves a range of items from the current folder.
    * @param startIndex The zero-based index of the first item in the range.
    * @param maxItemsToRetrieve The maximum number of items to retrieve.
    * @return When this method completes successfully, it returns the list (type IVectorView ) of items.
    */
  def getItemsAsync(startIndex: Double, maxItemsToRetrieve: Double): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Gets the parent folder of the current folder.
    * @return When this method completes, it returns the parent folder as a StorageFolder .
    */
  def getParentAsync(): IPromiseWithIAsyncOperation[StorageFolder] = js.native
  /**
    * Retrieves the thumbnail that is associated with the StorageFolder .
    * @param mode The thumbnail mode to retrieve.
    * @return When this method completes successfully, it returns the thumbnail image as a StorageItemThumbnail object.
    */
  def getThumbnailAsync(mode: ThumbnailMode): IPromiseWithIAsyncOperation[StorageItemThumbnail] = js.native
  /**
    * Retrieves the thumbnail that is associated with the StorageFolder , scaling it to the specified size.
    * @param mode The thumbnail mode to retrieve.
    * @param requestedSize The requested size in pixels of thumbnail to retrieve.
    * @return When this method completes successfully, it returns the thumbnail image as a StorageItemThumbnail object.
    */
  def getThumbnailAsync(mode: ThumbnailMode, requestedSize: Double): IPromiseWithIAsyncOperation[StorageItemThumbnail] = js.native
  /**
    * Retrieves the thumbnail that is associated with the StorageFolder , based on the specified options.
    * @param mode The thumbnail mode to retrieve.
    * @param requestedSize The requested size in pixels of thumbnail to retrieve.
    * @param options The thumbnail retrieval options.
    * @return When this method completes successfully, it returns the thumbnail image as a StorageItemThumbnail object.
    */
  def getThumbnailAsync(mode: ThumbnailMode, requestedSize: Double, options: ThumbnailOptions): IPromiseWithIAsyncOperation[StorageItemThumbnail] = js.native
  /**
    * Retrieves a value that indicates whether the current folder supports the specified common file query.
    * @param query The common file query to test.
    * @return True if the folder supports the specified common file query; otherwise false.
    */
  def isCommonFileQuerySupported(query: CommonFileQuery): Boolean = js.native
  /**
    * Retrieves a value that indicates whether the current folder supports the specified common folder query.
    * @param query The common folder query to test.
    * @return True if the folder supports the specified common folder query; otherwise false.
    */
  def isCommonFolderQuerySupported(query: CommonFolderQuery): Boolean = js.native
  /**
    * Indicates whether the current folder is equal to the specified folder.
    * @param item The IStorageItem object that represents the folder to compare against.
    * @return Returns true if the current folder is equal to the specified folder; otherwise false.
    */
  def isEqual(item: IStorageItem): Boolean = js.native
  /**
    * Determines whether the loaded StorageFolder is the specified type.
    * @param type The type of item to check against.
    * @return True if the loaded StorageFolder is the specified type; otherwise false.
    */
  def isOfType(`type`: StorageItemTypes): Boolean = js.native
  /** Occurs when one or more of the StorageFolder 's properties is updated. */
  def onpropertiesupdated(ev: js.Any with WinRTEvent[IStorageItemInformation]): Unit = js.native
  /** Fires when the StorageFolder 's thumbnail is updated or a better quality thumbnail is available. */
  def onthumbnailupdated(ev: js.Any with WinRTEvent[IStorageItemInformation]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_propertiesupdated(`type`: propertiesupdated, listener: TypedEventHandler[IStorageItemInformation, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_thumbnailupdated(`type`: thumbnailupdated, listener: TypedEventHandler[IStorageItemInformation, _]): Unit = js.native
  /**
    * Renames the StorageFolder .
    * @param desiredName The new name.
    * @return No object or value is returned when this method completes.
    */
  def renameAsync(desiredName: String): IPromiseWithIAsyncAction = js.native
  /**
    * Renames the StorageFolder , and specifies what to do if a folder with the same name already exists.
    * @param desiredName The new name.
    * @param option A value that indicates what to do if a folder with desiredName already exists.
    * @return No object or value is returned when this method completes.
    */
  def renameAsync(desiredName: String, option: NameCollisionOption): IPromiseWithIAsyncAction = js.native
  /**
    * Try to get a specific file or sub-folder from the current folder using the name of the file or folder to get.
    * @param name The name (or path relative to the current folder) of the file or sub-folder to try to retrieve.
    * @return When this method completes successfully, it returns the file or folder (type IStorageItem ).
    */
  def tryGetItemAsync(name: String): IPromiseWithIAsyncOperation[IStorageItem] = js.native
}

