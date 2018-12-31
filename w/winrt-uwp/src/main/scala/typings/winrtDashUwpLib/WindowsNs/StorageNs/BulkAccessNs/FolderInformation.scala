package typings
package winrtDashUwpLib.WindowsNs.StorageNs.BulkAccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides synchronous access to the properties exposed off StorageFolder and lets an app perform asynchronous management operations such as copy, delete, move, and rename. */
@JSGlobal("Windows.Storage.BulkAccess.FolderInformation")
@js.native
abstract class FolderInformation () extends js.Object {
  /** Gets the attributes of a loaded folder. */
  var attributes: winrtDashUwpLib.WindowsNs.StorageNs.FileAttributes = js.native
  /** Gets an object that contains the basic properties information of the folder. */
  var basicProperties: winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.BasicProperties = js.native
  /** Gets the date that the folder was created. */
  var dateCreated: stdLib.Date = js.native
  /** Gets the user-friendly name of the StorageFolder . */
  var displayName: java.lang.String = js.native
  /** Gets the display type of the StorageFolder . */
  var displayType: java.lang.String = js.native
  /** Gets the document properties of the StorageFolder . */
  var documentProperties: winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.DocumentProperties = js.native
  /** Gets the identifier that uniquely identifies the StorageFolder relative to other items in the same folder. */
  var folderRelativeId: java.lang.String = js.native
  /** Gets the image properties of the StorageFolder . */
  var imageProperties: winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.ImageProperties = js.native
  /** Gets the music properties associated with the StorageFolder . */
  var musicProperties: winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.MusicProperties = js.native
  /** Gets the name of the StorageFolder . */
  var name: java.lang.String = js.native
  /** Occurs when one or more of the StorageFolder 's properties is updated. */
  @JSName("onpropertiesupdated")
  var onpropertiesupdated_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[IStorageItemInformation, _] = js.native
  /** Fires when the StorageFolder 's thumbnail is updated or a better quality thumbnail is available. */
  @JSName("onthumbnailupdated")
  var onthumbnailupdated_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[IStorageItemInformation, _] = js.native
  /** Gets the path of the StorageFolder . */
  var path: java.lang.String = js.native
  /** Gets an object for retrieving the properties of the StorageFolder . */
  var properties: winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.StorageItemContentProperties = js.native
  /** Gets the StorageProvider object that contains info about the service that stores the current folder. */
  var provider: winrtDashUwpLib.WindowsNs.StorageNs.StorageProvider = js.native
  /** Gets the thumbnail for the StorageFile . */
  var thumbnail: winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.StorageItemThumbnail = js.native
  /** Gets the video properties that are associated with the StorageFolder . */
  var videoProperties: winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.VideoProperties = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_propertiesupdated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.propertiesupdated,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[IStorageItemInformation, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_thumbnailupdated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.thumbnailupdated,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[IStorageItemInformation, _]
  ): scala.Unit = js.native
  /**
    * Retrieves a value that indicates whether the folder supports the specified search query options.
    * @param queryOptions The search query options to test.
    * @return True if the folder supports the specified search query options; otherwise false.
    */
  def areQueryOptionsSupported(queryOptions: winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.QueryOptions): scala.Boolean = js.native
  /**
    * Creates a new file in the current folder.
    * @param desiredName The name of the new file.
    * @return When this method completes successfully, it returns a StorageFile that represents the new file.
    */
  def createFileAsync(desiredName: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StorageFile] = js.native
  /**
    * Creates a new file in the current folder, and specifies what to do if a file with the same name already exists in the current folder.
    * @param desiredName The name of the new file.
    * @param options A value that indicates what to do if the file name already exists in the current folder.
    * @return When this method completes successfully, it returns a StorageFile that represents the new file.
    */
  def createFileAsync(
    desiredName: java.lang.String,
    options: winrtDashUwpLib.WindowsNs.StorageNs.CreationCollisionOption
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StorageFile] = js.native
  /**
    * Creates an object for performing filtered search queries for StorageFile in the current folder.
    * @return An object for managing the search queries and accessing the results.
    */
  def createFileQuery(): winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.StorageFileQueryResult = js.native
  /**
    * Creates an object for performing filtered search queries for StorageFile objects in the current folder. Search results are grouped based on the specified file attribute.
    * @param query A value that specifies the folder attribute to use to group the search results.
    * @return An object for managing the search queries and accessing the results.
    */
  def createFileQuery(query: winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.CommonFileQuery): winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.StorageFileQueryResult = js.native
  /**
    * Creates an object used to perform filtered search queries for StorageFile objects in the folder. The object is initialized with the specified query options.
    * @param queryOptions The initial query options.
    * @return An object for managing the search queries and accessing the results.
    */
  def createFileQueryWithOptions(queryOptions: winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.QueryOptions): winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.StorageFileQueryResult = js.native
  /**
    * Creates a new child folder of the current folder.
    * @param desiredName The name of the new folder.
    * @return When this method completes successfully, it returns a StorageFolder that represents the new file.
    */
  def createFolderAsync(desiredName: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StorageFolder] = js.native
  /**
    * Creates a new child folder of the current folder, and specifies what to do if a folder with the same name already exists in the current folder.
    * @param desiredName The name of the new folder.
    * @param options A value that indicates what to do if the child folder already exists in the current folder.
    * @return When this method completes successfully, it returns a StorageFolder that represents the new file.
    */
  def createFolderAsync(
    desiredName: java.lang.String,
    options: winrtDashUwpLib.WindowsNs.StorageNs.CreationCollisionOption
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StorageFolder] = js.native
  /**
    * Creates an object for performing filtered search queries for child StorageFolder objects of the current folder.
    * @return An object for managing the search queries and accessing the results.
    */
  def createFolderQuery(): winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.StorageFolderQueryResult = js.native
  /**
    * Creates an object for performing filtered search queries for child StorageFolder objects of the current folder. Search results are grouped based on the specified folder attribute.
    * @param query A value that specifies the folder attribute to use to group the search results.
    * @return An object for managing the search queries and accessing the results.
    */
  def createFolderQuery(query: winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.CommonFolderQuery): winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.StorageFolderQueryResult = js.native
  /**
    * Creates an object used to perform filtered search queries for child StorageFolder objects of the current folder. The object is initialized with the specified query options.
    * @param queryOptions The initial query options.
    * @return An object for managing the search queries and accessing the results.
    */
  def createFolderQueryWithOptions(queryOptions: winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.QueryOptions): winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.StorageFolderQueryResult = js.native
  /**
    * Creates an object used to perform filtered search queries for items in the folder.
    * @return An object for managing the search queries and accessing the results.
    */
  def createItemQuery(): winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.StorageItemQueryResult = js.native
  /**
    * Creates an object used to perform filtered search queries for items in the folder. The object is initialized with the specified query options.
    * @param queryOptions The initial query options.
    * @return An object for managing the search queries and accessing the results.
    */
  def createItemQueryWithOptions(queryOptions: winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.QueryOptions): winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.StorageItemQueryResult = js.native
  /**
    * Deletes the current folder.
    * @return No object or value is returned when this method completes.
    */
  def deleteAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Deletes the current folder, optionally moving the deleted folder to the recycle bin.
    * @param option A value that specifies whether to move the deleted folder to the recycle bin.
    * @return No object or value is returned when this method completes.
    */
  def deleteAsync(option: winrtDashUwpLib.WindowsNs.StorageNs.StorageDeleteOption): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Retrieves the basic properties of the StorageFolder object.
    * @return When this method completes successfully, it returns a BasicProperties object.
    */
  def getBasicPropertiesAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.BasicProperties] = js.native
  /**
    * Retrieves a file from the current folder.
    * @param name The name of the file to retrieve.
    * @return When this method completes successfully, it returns a StorageFile .
    */
  def getFileAsync(name: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StorageFile] = js.native
  /**
    * Retrieves all files from the current folder.
    * @return When this method completes successfully, it returns the list (type IVectorView ) of StorageFile objects in the folder.
    */
  def getFilesAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
    * Retrieves files from the current folder based on a common folder query.
    * @param query The common file query.
    * @return When this method completes successfully, it returns the list (type IVectorView ) of StorageFile objects in the folder.
    */
  def getFilesAsync(query: winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.CommonFileQuery): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
    * Retrieves a range of files from the current folder based on a common file query.
    * @param query The common file query.
    * @param startIndex The zero-based index of the first file in the range.
    * @param maxItemsToRetrieve The maximum number of files to retrieve.
    * @return When this method completes successfully, it returns the list (type IVectorView ) of StorageFile objects in the folder.
    */
  def getFilesAsync(
    query: winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.CommonFileQuery,
    startIndex: scala.Double,
    maxItemsToRetrieve: scala.Double
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
    * Retrieves the specified child folder from the current folder.
    * @param name The name of the child folder to retrieve.
    * @return When this method completes successfully, it returns a StorageFolder that represents the specified child folder.
    */
  def getFolderAsync(name: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StorageFolder] = js.native
  /**
    * Retrieves all child folders from the current folder.
    * @return When this method completes successfully, it returns the list (type IVectorView ) of child folders. Each child folder in this list is represented by a StorageFolder object.
    */
  def getFoldersAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
    * Retrieves child folders from the current folder based on a common folder query.
    * @param query The common folder query.
    * @return When this method completes successfully, it returns the list (type IVectorView ) of child folders. Each child folder in this list is represented by a StorageFolder object.
    */
  def getFoldersAsync(query: winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.CommonFolderQuery): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
    * Retrieves a range of child folders from the current folder based on a common folder query.
    * @param query The common folder query.
    * @param startIndex The zero-based index of the first child folder in the range.
    * @param maxItemsToRetrieve The maximum number of child folders to retrieve.
    * @return When this method completes successfully, it returns the list (type IVectorView ) of child folders. Each child folder in this list is represented by a StorageFolder object.
    */
  def getFoldersAsync(
    query: winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.CommonFolderQuery,
    startIndex: scala.Double,
    maxItemsToRetrieve: scala.Double
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
    * Retrieves the indexed state of the folder.
    * @return When this method completes successfully, it returns an IndexedState enumeration value.
    */
  def getIndexedStateAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.IndexedState] = js.native
  /**
    * Retrieves an item from the folder.
    * @param name The name of the item to retrieve.
    * @return When this method completes successfully, it returns the item (type IStorageItem ).
    */
  def getItemAsync(name: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.IStorageItem] = js.native
  /**
    * Retrieves all items from the current folder.
    * @return When this method completes successfully, it returns the list (type IVectorView ) of items.
    */
  def getItemsAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
    * Retrieves a range of items from the current folder.
    * @param startIndex The zero-based index of the first item in the range.
    * @param maxItemsToRetrieve The maximum number of items to retrieve.
    * @return When this method completes successfully, it returns the list (type IVectorView ) of items.
    */
  def getItemsAsync(startIndex: scala.Double, maxItemsToRetrieve: scala.Double): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
    * Gets the parent folder of the current folder.
    * @return When this method completes, it returns the parent folder as a StorageFolder .
    */
  def getParentAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StorageFolder] = js.native
  /**
    * Retrieves the thumbnail that is associated with the StorageFolder .
    * @param mode The thumbnail mode to retrieve.
    * @return When this method completes successfully, it returns the thumbnail image as a StorageItemThumbnail object.
    */
  def getThumbnailAsync(mode: winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.StorageItemThumbnail] = js.native
  /**
    * Retrieves the thumbnail that is associated with the StorageFolder , scaling it to the specified size.
    * @param mode The thumbnail mode to retrieve.
    * @param requestedSize The requested size in pixels of thumbnail to retrieve.
    * @return When this method completes successfully, it returns the thumbnail image as a StorageItemThumbnail object.
    */
  def getThumbnailAsync(
    mode: winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode,
    requestedSize: scala.Double
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.StorageItemThumbnail] = js.native
  /**
    * Retrieves the thumbnail that is associated with the StorageFolder , based on the specified options.
    * @param mode The thumbnail mode to retrieve.
    * @param requestedSize The requested size in pixels of thumbnail to retrieve.
    * @param options The thumbnail retrieval options.
    * @return When this method completes successfully, it returns the thumbnail image as a StorageItemThumbnail object.
    */
  def getThumbnailAsync(
    mode: winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode,
    requestedSize: scala.Double,
    options: winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailOptions
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.StorageItemThumbnail] = js.native
  /**
    * Retrieves a value that indicates whether the current folder supports the specified common file query.
    * @param query The common file query to test.
    * @return True if the folder supports the specified common file query; otherwise false.
    */
  def isCommonFileQuerySupported(query: winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.CommonFileQuery): scala.Boolean = js.native
  /**
    * Retrieves a value that indicates whether the current folder supports the specified common folder query.
    * @param query The common folder query to test.
    * @return True if the folder supports the specified common folder query; otherwise false.
    */
  def isCommonFolderQuerySupported(query: winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.CommonFolderQuery): scala.Boolean = js.native
  /**
    * Indicates whether the current folder is equal to the specified folder.
    * @param item The IStorageItem object that represents the folder to compare against.
    * @return Returns true if the current folder is equal to the specified folder; otherwise false.
    */
  def isEqual(item: winrtDashUwpLib.WindowsNs.StorageNs.IStorageItem): scala.Boolean = js.native
  /**
    * Determines whether the loaded StorageFolder is the specified type.
    * @param type The type of item to check against.
    * @return True if the loaded StorageFolder is the specified type; otherwise false.
    */
  def isOfType(`type`: winrtDashUwpLib.WindowsNs.StorageNs.StorageItemTypes): scala.Boolean = js.native
  /** Occurs when one or more of the StorageFolder 's properties is updated. */
  def onpropertiesupdated(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[IStorageItemInformation]): scala.Unit = js.native
  /** Fires when the StorageFolder 's thumbnail is updated or a better quality thumbnail is available. */
  def onthumbnailupdated(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[IStorageItemInformation]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_propertiesupdated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.propertiesupdated,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[IStorageItemInformation, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_thumbnailupdated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.thumbnailupdated,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[IStorageItemInformation, _]
  ): scala.Unit = js.native
  /**
    * Renames the StorageFolder .
    * @param desiredName The new name.
    * @return No object or value is returned when this method completes.
    */
  def renameAsync(desiredName: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Renames the StorageFolder , and specifies what to do if a folder with the same name already exists.
    * @param desiredName The new name.
    * @param option A value that indicates what to do if a folder with desiredName already exists.
    * @return No object or value is returned when this method completes.
    */
  def renameAsync(desiredName: java.lang.String, option: winrtDashUwpLib.WindowsNs.StorageNs.NameCollisionOption): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Try to get a specific file or sub-folder from the current folder using the name of the file or folder to get.
    * @param name The name (or path relative to the current folder) of the file or sub-folder to try to retrieve.
    * @return When this method completes successfully, it returns the file or folder (type IStorageItem ).
    */
  def tryGetItemAsync(name: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.IStorageItem] = js.native
}

