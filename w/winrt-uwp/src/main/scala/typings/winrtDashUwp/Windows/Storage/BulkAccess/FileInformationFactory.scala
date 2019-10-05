package typings.winrtDashUwp.Windows.Storage.BulkAccess

import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Storage.FileProperties.ThumbnailMode
import typings.winrtDashUwp.Windows.Storage.FileProperties.ThumbnailOptions
import typings.winrtDashUwp.Windows.Storage.Search.IStorageQueryResultBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to load information about files and folders from the results of a query and to bind these file system items to JavaScript ListView or XAML ListView and GridView controls. After information is loaded, an app can then access that information quickly using synchronous operations. */
@JSGlobal("Windows.Storage.BulkAccess.FileInformationFactory")
@js.native
class FileInformationFactory protected () extends js.Object {
  /**
    * Creates a new FileInformationFactory object that retrieves information about the StorageFile and StorageFolder objects in the specified query result.
    * @param queryResult The result of a query of files and folders on the system.
    * @param mode A value that indicates the type of thumbnail view to retrieve for the StorageFile and StorageFolder .
    */
  def this(queryResult: IStorageQueryResultBase, mode: ThumbnailMode) = this()
  /**
    * Creates a new FileInformationFactory object that retrieves information about the StorageFile and StorageFolder objects in the specified query result and that specifies the requested size for thumbnails that are retrieved for the objects.
    * @param queryResult The result of a query of files and folders on the system.
    * @param mode A value that indicates the type of thumbnail view to retrieve for the StorageFile and StorageFolder .
    * @param requestedThumbnailSize The requested minimum size, in pixels, of the StorageFile and StorageFolder thumbnails.
    */
  def this(queryResult: IStorageQueryResultBase, mode: ThumbnailMode, requestedThumbnailSize: Double) = this()
  /**
    * Creates a new FileInformationFactory object that retrieves information about the StorageFile and StorageFolder objects in the specified query result, and that specifies the requested size and options for thumbnails that are retrieved for the objects.
    * @param queryResult The result of a query of files and folders on the system.
    * @param mode A value that indicates the type of thumbnail view to retrieve for the StorageFile and StorageFolder .
    * @param requestedThumbnailSize The requested minimum size, in pixels, of the StorageFile and StorageFolder thumbnails.
    * @param thumbnailOptions The thumbnail retrieval options.
    */
  def this(
    queryResult: IStorageQueryResultBase,
    mode: ThumbnailMode,
    requestedThumbnailSize: Double,
    thumbnailOptions: ThumbnailOptions
  ) = this()
  /**
    * Creates a new FileInformationFactory object that retrieves information about the StorageFile and StorageFolder objects in the specified query result, specifies the requested size and options for thumbnails that are retrieved for the objects, and indicates whether to delay loading information.
    * @param queryResult The result of a query of files and folders on the system.
    * @param mode A value that indicates the type of thumbnail view to retrieve for the StorageFile and StorageFolder .
    * @param requestedThumbnailSize The requested minimum size, in pixels, of the StorageFile and StorageFolder thumbnails.
    * @param thumbnailOptions The thumbnail retrieval options.
    * @param delayLoad True to delay loading information; otherwise false. By default, this option is false and delay loading is not used.
    */
  def this(
    queryResult: IStorageQueryResultBase,
    mode: ThumbnailMode,
    requestedThumbnailSize: Double,
    thumbnailOptions: ThumbnailOptions,
    delayLoad: Boolean
  ) = this()
  /**
    * Retrieves a collection of FileInformation objects that contain information about all StorageFile objects in a collection.
    * @return When this method completes successfully, it returns the list (type IVectorView ) of FileInformation objects.
    */
  def getFilesAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Retrieves a collection of FileInformation objects that contain information about a range of StorageFile objects in a collection.
    * @param startIndex The zero-based index of the first StorageFile in the range.
    * @param maxItemsToRetrieve The maximum number of StorageFile objects to retrieve information for.
    * @return When this method completes successfully, it returns the list (type IVectorView ) of FileInformation objects.
    */
  def getFilesAsync(startIndex: Double, maxItemsToRetrieve: Double): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Retrieves a collection of FolderInformation objects that contain information about all StorageFolder objects in a collection.
    * @return When this method completes successfully, it returns the list (type IVectorView ) of FolderInformation objects.
    */
  def getFoldersAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Retrieves a collection of FolderInformation objects that contain information about a range of StorageFolder objects in a collection.
    * @param startIndex The zero-based index of the first StorageFolder in the range.
    * @param maxItemsToRetrieve The maximum number of StorageFolder objects to retrieve information for.
    * @return When this method completes successfully, it returns the list (type IVectorView ) of FolderInformation objects.
    */
  def getFoldersAsync(startIndex: Double, maxItemsToRetrieve: Double): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Retrieves a collection of IStorageItemInformation objects that contain information about all the items in the collection.
    * @return When this method completes successfully, it returns the list (type IVectorView ) of FileInformation and FolderInformation objects.
    */
  def getItemsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Retrieves a collection of IStorageItemInformation objects that contain information about a range of items in a collection.
    * @param startIndex The zero-based index of the first item in the range.
    * @param maxItemsToRetrieve The maximum number of items to retrieve information for.
    * @return When this method completes successfully, it returns the list (type IVectorView ) of FileInformation and FolderInformation objects.
    */
  def getItemsAsync(startIndex: Double, maxItemsToRetrieve: Double): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Gets a virtualized vector of IStorageItemInformation objects that can be bound to ListView or GridView controls in C#, C++, and VB.
    * @return The virtualized vector of IStorageItemInformation objects.
    */
  def getVirtualizedFilesVector(): js.Any = js.native
  /**
    * Gets a virtualized vector of IStorageItemInformation objects that can be bound to ListView or GridView controls in C#, C++, and VB.
    * @return The virtualized vector of IStorageItemInformation objects.
    */
  def getVirtualizedFoldersVector(): js.Any = js.native
  /**
    * Gets a virtualized vector of IStorageItemInformation objects that can be bound to ListView or GridView controls in C#, C++, and VB.
    * @return The virtualized vector of IStorageItemInformation objects.
    */
  def getVirtualizedItemsVector(): js.Any = js.native
}

