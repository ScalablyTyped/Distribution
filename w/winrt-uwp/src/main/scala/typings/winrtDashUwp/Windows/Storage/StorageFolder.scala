package typings.winrtDashUwp.Windows.Storage

import typings.std.Date
import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Storage.FileProperties.BasicProperties
import typings.winrtDashUwp.Windows.Storage.FileProperties.StorageItemContentProperties
import typings.winrtDashUwp.Windows.Storage.FileProperties.StorageItemThumbnail
import typings.winrtDashUwp.Windows.Storage.FileProperties.ThumbnailMode
import typings.winrtDashUwp.Windows.Storage.FileProperties.ThumbnailOptions
import typings.winrtDashUwp.Windows.Storage.Search.CommonFileQuery
import typings.winrtDashUwp.Windows.Storage.Search.CommonFolderQuery
import typings.winrtDashUwp.Windows.Storage.Search.IndexedState
import typings.winrtDashUwp.Windows.Storage.Search.QueryOptions
import typings.winrtDashUwp.Windows.Storage.Search.StorageFileQueryResult
import typings.winrtDashUwp.Windows.Storage.Search.StorageFolderQueryResult
import typings.winrtDashUwp.Windows.Storage.Search.StorageItemQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages folders and their contents and provides information about them. */
@JSGlobal("Windows.Storage.StorageFolder")
@js.native
abstract class StorageFolder () extends js.Object {
  /** Gets the attributes of the current folder. */
  var attributes: FileAttributes = js.native
  /** Gets the date and time that the current folder was created. */
  var dateCreated: Date = js.native
  /** Gets the user-friendly name of the current folder. */
  var displayName: String = js.native
  /** Gets the user-friendly description of the type of the folder; for example, JPEG image. */
  var displayType: String = js.native
  /** Gets an identifier for the current folder. This ID is unique for the query result or StorageFolder that contains the current folder or file group, and can be used to distinguish between items that have the same name. */
  var folderRelativeId: String = js.native
  /** Gets the name of the current folder. */
  var name: String = js.native
  /** Gets the full path of the current folder in the file system, if the path is available. */
  var path: String = js.native
  /** Gets an object that provides access to the content-related properties of the current folder. */
  var properties: StorageItemContentProperties = js.native
  /** Gets the StorageProvider object that contains info about the service that stores the current folder. */
  var provider: StorageProvider = js.native
  /**
    * Indicates whether the current folder supports the specified QueryOptions .
    * @param queryOptions The QueryOptions to check.
    * @return True if the folder or file group supports the specified QueryOptions ; otherwise false.
    */
  def areQueryOptionsSupported(queryOptions: QueryOptions): Boolean = js.native
  /**
    * Creates a new file with the specified name in the current folder.
    * @param desiredName The name of the new file to create in the current folder.
    * @return When this method completes, it returns a StorageFile that represents the new file.
    */
  def createFileAsync(desiredName: String): IPromiseWithIAsyncOperation[StorageFile] = js.native
  /**
    * Creates a new file in the current folder. This method also specifies what to do if a file with the same name already exists in the current folder.
    * @param desiredName The name of the new file to create in the current folder.
    * @param options One of the enumeration values that determines how to handle the collision if a file with the specified desiredName already exists in the current folder.
    * @return When this method completes, it returns a StorageFile that represents the new file.
    */
  def createFileAsync(desiredName: String, options: CreationCollisionOption): IPromiseWithIAsyncOperation[StorageFile] = js.native
  /**
    * Gets a query result object that contains the files in the current folder.
    * @return A query result object. Call the GetFilesAsync method of the query result to get the flat list of files. This method returns a list of type IReadOnlyList< StorageFile >. Each file is represented by an item of type StorageFile.
    */
  def createFileQuery(): StorageFileQueryResult = js.native
  /**
    * Gets a query result object that contains the files in the current folder. Also gets the files from the subfolders of the current folder when the value of the query argument is something other than CommonFileQuery.DefaultQuery . Files are sorted based on the specified CommonFileQuery.
    * @param query One of the enumeration values that specifies how to sort the files and determines whether the query is shallow or deep.
    * @return A query result object. Call the GetFilesAsync method of the query result to get the flat list of files, sorted as specified by query. This method returns a list of type IReadOnlyList< StorageFile >. Each file is represented by an item of type StorageFile.
    */
  def createFileQuery(query: CommonFileQuery): StorageFileQueryResult = js.native
  /**
    * Gets a query result object that contains the files in the current folder and, optionally, in the subfolders of the current folder. The results are based on the specified QueryOptions .
    * @param queryOptions The criteria that are applied to the query.
    * @return A query result object that contains the files in the current folder and, optionally, in the subfolders of the current folder, filtered and sorted based on the specified QueryOptions . Call the GetFilesAsync method of the query result to get the flat list of files, sorted as specified by queryOptions. This method returns a list of type IReadOnlyList< StorageFile >. Each file is represented by an item of type StorageFile.
    */
  def createFileQueryWithOptions(queryOptions: QueryOptions): StorageFileQueryResult = js.native
  /**
    * Creates a new subfolder with the specified name in the current folder.
    * @param desiredName The name of the new subfolder to create in the current folder.
    * @return When this method completes, it returns a StorageFolder that represents the new subfolder.
    */
  def createFolderAsync(desiredName: String): IPromiseWithIAsyncOperation[StorageFolder] = js.native
  /**
    * Creates a new subfolder with the specified name in the current folder. This method also specifies what to do if a subfolder with the same name already exists in the current folder.
    * @param desiredName The name of the new subfolder to create in the current folder.
    * @param options One of the enumeration values that determines how to handle the collision if a subfolder with the specified desiredName already exists in the current folder.
    * @return When this method completes, it returns a StorageFolder that represents the new subfolder.
    */
  def createFolderAsync(desiredName: String, options: CreationCollisionOption): IPromiseWithIAsyncOperation[StorageFolder] = js.native
  /**
    * Gets a query result object that contains the subfolders in the current folder.
    * @return A query result object. Call the GetFoldersAsync method of the query result to get the subfolders in the current folder. This method returns a list of type IReadOnlyList< StorageFolder >. Each file or folder is represented by an item of type StorageFolder.
    */
  def createFolderQuery(): StorageFolderQueryResult = js.native
  /**
    * Gets a query result object that contains the subfolders in the current folder. When the value of the query argument is something other than CommonFolderQuery.DefaultQuery , gets a list of virtual folders that represent containers for groups of files in the subfolders of the current folder. Files are grouped into folders based on the specified value from the CommonFolderQuery enumeration.
    * @param query One of the enumeration values that specifies how to group the files into folders and determines whether the query is shallow or deep.
    * @return A query result object. Call the GetFoldersAsync method of the query result to get the subfolders in the current folder. When the value of the query argument is something other than CommonFolderQuery.DefaultQuery , the query result object contains a list of virtual folders that represent containers for groups of files in the subfolders of the current folder. (Files from the current folder are not included.) The files are grouped as specified by query. The list is of type IReadOnlyList< StorageFolder >. Each folder in the list is represented by a StorageFolder object.
    */
  def createFolderQuery(query: CommonFolderQuery): StorageFolderQueryResult = js.native
  /**
    * Gets a query result object that contains the subfolders in the current folder and, optionally, nested subfolders. The results are based on the specified QueryOptions .
    * @param queryOptions The criteria that are applied to the query.
    * @return A query result object. Call the GetFoldersAsync method of the query result to get the subfolders in the current folder. If you provided a CommonFolderQuery value other than CommonFolderQuery.DefaultQuery when you instantiated the QueryOptions , the query result object contains a list of virtual folders that represent containers for groups of files in the subfolders of the current folder. (Files from the current folder are not included.) The files are grouped as specified by queryOptions. The list is of type IReadOnlyList< StorageFolder >. Each folder in the list is represented by a StorageFolder object.
    */
  def createFolderQueryWithOptions(queryOptions: QueryOptions): StorageFolderQueryResult = js.native
  /**
    * Gets a query result object that contains the files and subfolders in the current folder.
    * @return A query result object. Call the GetItemsAsync method of the query result to get the files and subfolders in the current folder. This method returns a list of type IReadOnlyList< IStorageItem >. Each file or folder is represented by an item of type IStorageItem.
    */
  def createItemQuery(): StorageItemQueryResult = js.native
  /**
    * Gets a query result object that contains the files and subfolders in the current folder and, optionally, in the subfolders of the current folder. The results are based on the specified QueryOptions .
    * @param queryOptions The criteria that are applied to the query.
    * @return A query result object. Call the GetItemsAsync method of the query result to get the files and subfolders in the current folder and, optionally, in the subfolders of the current folder, filtered and sorted based on the specified QueryOptions . This method returns a list of type IReadOnlyList< IStorageItem >. Each file or folder is represented by an item of type IStorageItem.
    */
  def createItemQueryWithOptions(queryOptions: QueryOptions): StorageItemQueryResult = js.native
  /**
    * Deletes the current folder.
    * @return No object or value is returned by this method when it completes.
    */
  def deleteAsync(): IPromiseWithIAsyncAction = js.native
  /**
    * Deletes the current folder. This method also specifies whether to delete the folder permanently.
    * @param option One of the enumeration values that specifies whether to delete the folder permanently.
    * @return No object or value is returned by this method when it completes.
    */
  def deleteAsync(option: StorageDeleteOption): IPromiseWithIAsyncAction = js.native
  /**
    * Gets the basic properties of the current folder or file group.
    * @return When this method completes successfully, it returns the basic properties of the current folder or file group as a BasicProperties object.
    */
  def getBasicPropertiesAsync(): IPromiseWithIAsyncOperation[BasicProperties] = js.native
  /**
    * Gets the file with the specified name from the current folder.
    * @param name The name (or path relative to the current folder) of the file to get.
    * @return When this method completes successfully, it returns a StorageFile that represents the specified file.
    */
  def getFileAsync(name: String): IPromiseWithIAsyncOperation[StorageFile] = js.native
  /**
    * Gets the files in the current folder.
    * @return When this method completes successfully, it returns a list of the files in the current folder. The list is of type IReadOnlyList< StorageFile >. Each file in the list is represented by a StorageFile object.
    */
  def getFilesAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Gets the files in the current folder. Also gets the files from the subfolders of the current folder when the value of the query argument is something other than CommonFileQuery.DefaultQuery . Files are sorted based on the specified value from the CommonFileQuery enumeration.
    * @param query One of the enumeration values that specifies how to sort the files and determines whether the query is shallow or deep.
    * @return When this method completes successfully, it returns a flat list of files, sorted as specified by query. The list is of type IReadOnlyList< StorageFile >. Each file in the list is represented by a StorageFile object.
    */
  def getFilesAsync(query: CommonFileQuery): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Gets an index-based range of files from the list of all files in the current folder. Also gets the files from the subfolders of the current folder when the value of the query argument is something other than CommonFileQuery.DefaultQuery . Files are sorted based on the specified value from the CommonFileQuery enumeration.
    * @param query One of the enumeration values that specifies how to sort the files and determines whether the query is shallow or deep.
    * @param startIndex The zero-based index of the first file in the range to retrieve.
    * @param maxItemsToRetrieve The maximum number of files to retrieve.
    * @return When this method completes successfully, it returns a flat list of files sorted as specified by query. The list is of type IReadOnlyList< StorageFile >. Each file in the list is represented by a StorageFile object.
    */
  def getFilesAsync(query: CommonFileQuery, startIndex: Double, maxItemsToRetrieve: Double): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Gets the subfolder with the specified name from the current folder.
    * @param name The name (or path relative to the current folder) of the subfolder to get.
    * @return When this method completes successfully, it returns a StorageFolder that represents the specified subfolder.
    */
  def getFolderAsync(name: String): IPromiseWithIAsyncOperation[StorageFolder] = js.native
  /**
    * Gets the subfolders in the current folder.
    * @return When this method completes successfully, it returns a list of the subfolders in the current folder. The list is of type IReadOnlyList< StorageFolder >. Each folder in the list is represented by a StorageFolder object.
    */
  def getFoldersAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Gets the subfolders in the current folder. When the value of the query argument is something other than CommonFolderQuery.DefaultQuery , gets a list of virtual folders that represent containers for groups of files in the subfolders of the current folder. Files are grouped into folders based on the specified value from the CommonFolderQuery enumeration.
    * @param query One of the enumeration values that specifies how to group the files into folders and determines whether the query is shallow or deep.
    * @return When this method completes successfully, it returns a list of subfolders. When the value of the query argument is something other than CommonFolderQuery.DefaultQuery , this method returns a list of virtual folders that represent containers for groups of files in the subfolders of the current folder. (Files from the current folder are not included.) The files are grouped as specified by query. The list is of type IReadOnlyList< StorageFolder >. Each folder in the list is represented by a StorageFolder object.
    */
  def getFoldersAsync(query: CommonFolderQuery): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Gets an index-based range of folders from the list of all subfolders in the current folder. When the value of the query argument is something other than CommonFolderQuery.DefaultQuery , gets a list of virtual folders that represent containers for groups of files in the subfolders of the current folder. Files are grouped into folders based on the specified value from the CommonFolderQuery enumeration.
    * @param query One of the enumeration values that specifies how to group the files into folders and determines whether the query is shallow or deep.
    * @param startIndex The zero-based index of the first folder in the range to retrieve.
    * @param maxItemsToRetrieve The maximum number of folders to retrieve.
    * @return When this method completes successfully, it returns a list of subfolders. When the value of the query argument is something other than CommonFolderQuery.DefaultQuery , this method returns a list of virtual folders that represent containers for groups of files in the subfolders of the current folder. (Files from the current folder are not included.) The files are grouped as specified by query. The list is of type IReadOnlyList< StorageFolder >. Each folder in the list is represented by a StorageFolder object.
    */
  def getFoldersAsync(query: CommonFolderQuery, startIndex: Double, maxItemsToRetrieve: Double): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Gets the indexed state of the current folder.
    * @return When this method completes successfully, it returns an IndexedState enum value that describes the state of the folder.
    */
  def getIndexedStateAsync(): IPromiseWithIAsyncOperation[IndexedState] = js.native
  /**
    * Gets the file or folder with the specified name from the current folder.
    * @param name The name (or path relative to the current folder) of the file or folder to get.
    * @return When this method completes successfully, it returns an IStorageItem that represents the specified file or folder.
    */
  def getItemAsync(name: String): IPromiseWithIAsyncOperation[IStorageItem] = js.native
  /**
    * Gets the files and subfolders in the current folder.
    * @return When this method completes successfully, it returns a list of the files and folders in the current folder. The list is of type IReadOnlyList< IStorageItem >. Each item in the list is represented by an IStorageItem object.
    */
  def getItemsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Gets an index-based range of files and folders from the list of all files and subfolders in the current folder.
    * @param startIndex The zero-based index of the first item in the range to get.
    * @param maxItemsToRetrieve The maximum number of items to get.
    * @return When this method completes successfully, it returns a list of the files and subfolders in the current folder. The list is of type IReadOnlyList< IStorageItem >. Each item in the list is represented by an IStorageItem object.
    */
  def getItemsAsync(startIndex: Double, maxItemsToRetrieve: Double): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Gets the parent folder of the current folder.
    * @return When this method completes, it returns the parent folder as a StorageFolder .
    */
  def getParentAsync(): IPromiseWithIAsyncOperation[StorageFolder] = js.native
  /**
    * Gets a scaled image as a thumbnail, determined by the purpose of the thumbnail.
    * @param mode The enum value that describes the purpose of the thumbnail and determines how the thumbnail image is adjusted.
    * @return When this method completes successfully, it returns a StorageItemThumbnail that represents the thumbnail image or null if there is no thumbnail image associated with the item.
    */
  def getScaledImageAsThumbnailAsync(mode: ThumbnailMode): IPromiseWithIAsyncOperation[StorageItemThumbnail] = js.native
  /**
    * Gets a scaled image as a thumbnail, determined by the purpose of the thumbnail and the requested size.
    * @param mode The enum value that describes the purpose of the thumbnail and determines how the thumbnail image is adjusted.
    * @param requestedSize The requested size, in pixels, of the longest edge of the thumbnail. Windows uses the requestedSize as a guide and tries to scale the thumbnail image without reducing the quality of the image.
    * @return When this method completes successfully, it returns a StorageItemThumbnail that represents the thumbnail image or null if there is no thumbnail image associated with the item.
    */
  def getScaledImageAsThumbnailAsync(mode: ThumbnailMode, requestedSize: Double): IPromiseWithIAsyncOperation[StorageItemThumbnail] = js.native
  /**
    * Gets a scaled image as a thumbnail, determined by the purpose of the thumbnail, the requested size, and the specified options
    * @param mode The enum value that describes the purpose of the thumbnail and determines how the thumbnail image is adjusted.
    * @param requestedSize The requested size, in pixels, of the longest edge of the thumbnail. Windows uses the requestedSize as a guide and tries to scale the thumbnail image without reducing the quality of the image.
    * @param options The enum value that describes the desired behavior to use to retrieve the thumbnail image. The specified behavior might affect the size and/or quality of the image and how quickly the thumbnail image is retrieved.
    * @return When this method completes successfully, it returns a StorageItemThumbnail that represents the thumbnail image or null if there is no thumbnail image associated with the item.
    */
  def getScaledImageAsThumbnailAsync(mode: ThumbnailMode, requestedSize: Double, options: ThumbnailOptions): IPromiseWithIAsyncOperation[StorageItemThumbnail] = js.native
  /**
    * Gets a thumbnail image for the current folder, sized for the specified purpose of the thumbnail.
    * @param mode A value from the enumeration that describes the purpose of the thumbnail and determines how the thumbnail image is adjusted.
    * @return When this method completes successfully, it returns a StorageItemThumbnail that represents the thumbnail image, or null if there is no thumbnail image associated with the folder.
    */
  def getThumbnailAsync(mode: ThumbnailMode): IPromiseWithIAsyncOperation[StorageItemThumbnail] = js.native
  /**
    * Gets a thumbnail image for the current folder, sized for the specified purpose of the thumbnail and adjusted to the requested size.
    * @param mode A value from the enumeration that describes the purpose of the thumbnail and determines how the thumbnail image is adjusted.
    * @param requestedSize The requested size, in pixels, of the longest edge of the thumbnail. This method uses the requestedSize as a guide and tries to scale the thumbnail image without reducing the quality of the image.
    * @return When this method completes successfully, it returns a StorageItemThumbnail that represents the thumbnail image, or null if there is no thumbnail image associated with the folder.
    */
  def getThumbnailAsync(mode: ThumbnailMode, requestedSize: Double): IPromiseWithIAsyncOperation[StorageItemThumbnail] = js.native
  /**
    * Gets a thumbnail image for the current folder, sized for the specified purpose of the thumbnail and adjusted to the requested size with the specified options.
    * @param mode A value from the enumeration that describes the purpose of the thumbnail and determines how the thumbnail image is adjusted.
    * @param requestedSize The requested size, in pixels, of the longest edge of the thumbnail. This method uses the requestedSize as a guide and tries to scale the thumbnail image without reducing the quality of the image.
    * @param options A value from the enumeration that specifies how to retrieve and size the image. The default value, UseCurrentScale, is suitable for most apps.
    * @return When this method completes successfully, it returns a StorageItemThumbnail that represents the thumbnail image, or null if there is no thumbnail image associated with the folder.
    */
  def getThumbnailAsync(mode: ThumbnailMode, requestedSize: Double, options: ThumbnailOptions): IPromiseWithIAsyncOperation[StorageItemThumbnail] = js.native
  /**
    * Indicates whether the current folder supports the specified CommonFileQuery .
    * @param query The value to test.
    * @return True if the folder supports the specified CommonFileQuery ; otherwise, false.
    */
  def isCommonFileQuerySupported(query: CommonFileQuery): Boolean = js.native
  /**
    * Indicates whether the current folder supports the specified CommonFolderQuery .
    * @param query The value to test.
    * @return True if the folder supports the specified CommonFolderQuery ; otherwise, false.
    */
  def isCommonFolderQuerySupported(query: CommonFolderQuery): Boolean = js.native
  /**
    * Indicates whether the current folder is equal to the specified folder.
    * @param item The IStorageItem object that represents the folder to compare against.
    * @return Returns true if the current folder is equal to the specified folder; otherwise false.
    */
  def isEqual(item: IStorageItem): Boolean = js.native
  /**
    * Indicates whether the current StorageFolder matches the specified StorageItemTypes value.
    * @param type The enum value that determines the object type to match against.
    * @return True if the StorageFolder matches the specified StorageItemTypes value; otherwise false.
    */
  def isOfType(`type`: StorageItemTypes): Boolean = js.native
  /**
    * Renames the current folder.
    * @param desiredName The desired, new name for the current folder.
    * @return No object or value is returned by this method when it completes.
    */
  def renameAsync(desiredName: String): IPromiseWithIAsyncAction = js.native
  /**
    * Renames the current folder and specifies what to do if a folder with the same name already exists.
    * @param desiredName The desired, new name for the current folder.
    * @param option The enum value that determines how Windows responds if the desiredName is the same as the name of an existing item in the current folder's location.
    * @return No object or value is returned by this method when it completes.
    */
  def renameAsync(desiredName: String, option: NameCollisionOption): IPromiseWithIAsyncAction = js.native
  /**
    * Tries to get the file or folder with the specified name from the current folder. Returns null instead of raising an exception if the specified file or folder is not found.
    * @param name The name (or path relative to the current folder) of the file or folder to get.
    * @return When this method completes successfully, it returns an IStorageItem that represents the specified file or folder. If the specified file or folder is not found, this method returns null instead of raising an exception.
    */
  def tryGetItemAsync(name: String): IPromiseWithIAsyncOperation[IStorageItem] = js.native
}

/* static members */
@JSGlobal("Windows.Storage.StorageFolder")
@js.native
object StorageFolder extends js.Object {
  /**
    * Gets the folder that has the specified absolute path in the file system.
    * @param path The absolute path in the file system (not the Uri) of the folder to get.
    * @return When this method completes successfully, it returns a StorageFolder that represents the specified folder.
    */
  def getFolderFromPathAsync(path: String): IPromiseWithIAsyncOperation[StorageFolder] = js.native
}

