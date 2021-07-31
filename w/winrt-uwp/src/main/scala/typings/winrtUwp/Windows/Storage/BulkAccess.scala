package typings.winrtUwp.Windows.Storage

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Storage.FileProperties.BasicProperties
import typings.winrtUwp.Windows.Storage.FileProperties.DocumentProperties
import typings.winrtUwp.Windows.Storage.FileProperties.ImageProperties
import typings.winrtUwp.Windows.Storage.FileProperties.MusicProperties
import typings.winrtUwp.Windows.Storage.FileProperties.StorageItemContentProperties
import typings.winrtUwp.Windows.Storage.FileProperties.StorageItemThumbnail
import typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailMode
import typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailOptions
import typings.winrtUwp.Windows.Storage.FileProperties.VideoProperties
import typings.winrtUwp.Windows.Storage.Search.CommonFileQuery
import typings.winrtUwp.Windows.Storage.Search.CommonFolderQuery
import typings.winrtUwp.Windows.Storage.Search.IndexedState
import typings.winrtUwp.Windows.Storage.Search.QueryOptions
import typings.winrtUwp.Windows.Storage.Search.StorageFileQueryResult
import typings.winrtUwp.Windows.Storage.Search.StorageFolderQueryResult
import typings.winrtUwp.Windows.Storage.Search.StorageItemQueryResult
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.propertiesupdated
import typings.winrtUwp.winrtUwpStrings.thumbnailupdated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides classes for searching, accessing, managing, and retrieving information about files and folders in the storage system. */
object BulkAccess {
  
  /** Provides synchronous access to the properties exposed off StorageFile and lets an app perform asynchronous file operations such as copy, delete, move, and rename. */
  @js.native
  trait FileInformation extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_propertiesupdated(`type`: propertiesupdated, listener: TypedEventHandler[IStorageItemInformation, js.Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_thumbnailupdated(`type`: thumbnailupdated, listener: TypedEventHandler[IStorageItemInformation, js.Any]): Unit = js.native
    
    /** Gets the attributes of a file. */
    var attributes: FileAttributes = js.native
    
    /** Gets an object that contains the basic properties information of the file. */
    var basicProperties: BasicProperties = js.native
    
    /** Gets a string that describes the contents of the file. */
    var contentType: String = js.native
    
    /**
      * Replaces the specified StorageFile with a copy of the current file.
      * @param fileToReplace The StorageFile to be replaced.
      * @return No object or value is returned when this method completes.
      */
    def copyAndReplaceAsync(fileToReplace: IStorageFile): IPromiseWithIAsyncAction = js.native
    
    /**
      * Creates a copy of the StorageFile and stores it in the specified StorageFolder .
      * @param destinationFolder The folder in which to store the copied file.
      * @return When this method completes successfully, it returns the copy as a StorageFile object.
      */
    def copyAsync(destinationFolder: IStorageFolder): IPromiseWithIAsyncOperation[StorageFile] = js.native
    /**
      * Creates a copy of the StorageFile , gives it the specified file name, and stores it in the specified StorageFolder .
      * @param destinationFolder The folder in which to store the copied file.
      * @param desiredNewName The name of the new copy.
      * @return When this method completes successfully, it returns the copy as a StorageFile object.
      */
    def copyAsync(destinationFolder: IStorageFolder, desiredNewName: String): IPromiseWithIAsyncOperation[StorageFile] = js.native
    /**
      * Creates a copy of the StorageFile , gives it the specified file name, and stores it in the specified StorageFolder . The method also specifies what to do if a file with the same name already exists in the specified folder.
      * @param destinationFolder The folder in which to store the copied file.
      * @param desiredNewName The name of the new copy.
      * @param option A value that indicates what to do if the file name already exists in the destination folder.
      * @return When this method completes successfully, it returns the copy as a StorageFile object.
      */
    def copyAsync(destinationFolder: IStorageFolder, desiredNewName: String, option: NameCollisionOption): IPromiseWithIAsyncOperation[StorageFile] = js.native
    
    /** Gets the date that the file was created. */
    var dateCreated: Date = js.native
    
    /**
      * Deletes a file.
      * @return No object or value is returned when this method completes.
      */
    def deleteAsync(): IPromiseWithIAsyncAction = js.native
    /**
      * Deletes a file, optionally moving the deleted file to the recycle bin.
      * @param option A value that specifies whether the deleted file is moved to the recycle bin.
      * @return No object or value is returned when this method completes.
      */
    def deleteAsync(option: StorageDeleteOption): IPromiseWithIAsyncAction = js.native
    
    /** Gets the user-friendly name of the StorageFile . */
    var displayName: String = js.native
    
    /** Gets the display type of the StorageFile . */
    var displayType: String = js.native
    
    /** Gets an object that provides access to the document properties of the StorageFile , such as the title, author name, and so on. */
    var documentProperties: DocumentProperties = js.native
    
    /** Gets the file type. */
    var fileType: String = js.native
    
    /** Gets the identifier that uniquely identifies the StorageFile relative to other items in the same folder. */
    var folderRelativeId: String = js.native
    
    /**
      * Retrieves the basic properties of the StorageFile .
      * @return When this method completes successfully, it returns a BasicProperties object.
      */
    def getBasicPropertiesAsync(): IPromiseWithIAsyncOperation[BasicProperties] = js.native
    
    /**
      * Gets the parent folder of the current file.
      * @return When this method completes, it returns the parent folder as a StorageFolder .
      */
    def getParentAsync(): IPromiseWithIAsyncOperation[StorageFolder] = js.native
    
    /**
      * Retrieves the thumbnail that is associated with the StorageFile .
      * @param mode The thumbnail mode to retrieve.
      * @return When this method completes successfully, it returns the thumbnail image as a StorageItemThumbnail object.
      */
    def getThumbnailAsync(mode: ThumbnailMode): IPromiseWithIAsyncOperation[StorageItemThumbnail] = js.native
    /**
      * Retrieves the thumbnail that is associated with the StorageFile , scaling it to the specified size.
      * @param mode The thumbnail mode to retrieve.
      * @param requestedSize The requested size in pixels of thumbnail to retrieve.
      * @return When this method completes successfully, it returns the thumbnail image as a StorageItemThumbnail object.
      */
    def getThumbnailAsync(mode: ThumbnailMode, requestedSize: Double): IPromiseWithIAsyncOperation[StorageItemThumbnail] = js.native
    /**
      * Retrieves the thumbnail that is associated with the StorageFile , based on the specified options.
      * @param mode The thumbnail mode to retrieve.
      * @param requestedSize The requested size in pixels of thumbnail to retrieve.
      * @param options The thumbnail retrieval options.
      * @return When this method completes successfully, it returns the thumbnail image as a StorageItemThumbnail object.
      */
    def getThumbnailAsync(mode: ThumbnailMode, requestedSize: Double, options: ThumbnailOptions): IPromiseWithIAsyncOperation[StorageItemThumbnail] = js.native
    
    /** Gets the image properties of the StorageFile , such as the title, rating, date that the image was taken, and so on. */
    var imageProperties: ImageProperties = js.native
    
    /** Indicates if the current file has been downloaded or can be downloaded. */
    var isAvailable: Boolean = js.native
    
    /**
      * Indicates whether the current file is the same as the specified storage item.
      * @param item The IStorageItem object that represents a storage item to compare against.
      * @return Returns true if the current storage item is the same as the specified storage item; otherwise false.
      */
    def isEqual(item: IStorageItem): Boolean = js.native
    
    /**
      * Determines whether the loaded StorageFile is the specified type.
      * @param type The type of item to check against.
      * @return True if the loaded StorageFile is the specified type; otherwise false.
      */
    def isOfType(`type`: StorageItemTypes): Boolean = js.native
    
    /**
      * Moves the current StorageFile from its location and uses it to replace the specified StorageFile.
      * @param fileToReplace The StorageFile to be replaced.
      * @return An object for managing the asynchronous move and replace operation.
      */
    def moveAndReplaceAsync(fileToReplace: IStorageFile): IPromiseWithIAsyncAction = js.native
    
    /**
      * Moves the StorageFile to the specified StorageFolder .
      * @param destinationFolder The destination folder.
      * @return No object or value is returned when this method completes.
      */
    def moveAsync(destinationFolder: IStorageFolder): IPromiseWithIAsyncAction = js.native
    /**
      * Moves the StorageFile to the specified folder, and gives the file the specified file name.
      * @param destinationFolder The destination folder.
      * @param desiredNewName The new file name.
      * @return No object or value is returned when this method completes.
      */
    def moveAsync(destinationFolder: IStorageFolder, desiredNewName: String): IPromiseWithIAsyncAction = js.native
    /**
      * Moves the StorageFile to the specified folder and gives it the specified file name. The method also specifies what to do if a file with the same name already exists in the specified folder.
      * @param destinationFolder The destination folder.
      * @param desiredNewName The new file name.
      * @param option A value that indicates what to do if the file name already exists in the destination folder.
      * @return No object or value is returned when this method completes.
      */
    def moveAsync(destinationFolder: IStorageFolder, desiredNewName: String, option: NameCollisionOption): IPromiseWithIAsyncAction = js.native
    
    /** Gets the music properties associated with the StorageFile , such as the album name, artist name, bit rate, and so on. */
    var musicProperties: MusicProperties = js.native
    
    /** Gets the name of the StorageFile . */
    var name: String = js.native
    
    /** Occurs when one or more of the StorageFile 's properties is updated. */
    def onpropertiesupdated(ev: js.Any & WinRTEvent[IStorageItemInformation]): Unit = js.native
    /** Occurs when one or more of the StorageFile 's properties is updated. */
    @JSName("onpropertiesupdated")
    var onpropertiesupdated_Original: TypedEventHandler[IStorageItemInformation, js.Any] = js.native
    
    /** Fires when the StorageFile 's thumbnail is updated or a better quality thumbnail is available. */
    def onthumbnailupdated(ev: js.Any & WinRTEvent[IStorageItemInformation]): Unit = js.native
    /** Fires when the StorageFile 's thumbnail is updated or a better quality thumbnail is available. */
    @JSName("onthumbnailupdated")
    var onthumbnailupdated_Original: TypedEventHandler[IStorageItemInformation, js.Any] = js.native
    
    /**
      * Opens a random-access stream with the specified options over the specified file.
      * @param accessMode One of the enumeration values that specifies the type of access to allow.
      * @return When this method completes, it returns an IRandomAccessStream that contains the requested random-access stream.
      */
    def openAsync(accessMode: FileAccessMode): IPromiseWithIAsyncOperation[IRandomAccessStream] = js.native
    /**
      * Opens a random-access stream with the specified options over the specified file.
      * @param accessMode One of the enumeration values that specifies the type of access to allow.
      * @param options A bitwise combination of the enumeration values that specify options for opening the stream.
      * @return When this method completes, it returns an IRandomAccessStream that contains the requested random-access stream.
      */
    def openAsync(accessMode: FileAccessMode, options: StorageOpenOptions): IPromiseWithIAsyncOperation[IRandomAccessStream] = js.native
    
    /**
      * Opens a read-only, random-access stream over the StorageFile .
      * @return When this method completes successfully, it returns a read-only, random-access stream (type IRandomAccessStreamWithContentType ).
      */
    def openReadAsync(): IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType] = js.native
    
    /**
      * Opens a read-only, sequential-access stream over the StorageFile .
      * @return When this method completes successfully, it returns a read-only, sequential-access stream (type IInputStream ).
      */
    def openSequentialReadAsync(): IPromiseWithIAsyncOperation[IInputStream] = js.native
    
    /**
      * Opens a random-access stream to the file that can be used for transacted-write operations.
      * @return When this method completes, it returns a StorageStreamTransaction that contains the random-access stream and methods that can be used to complete transactions.
      */
    def openTransactedWriteAsync(): IPromiseWithIAsyncOperation[StorageStreamTransaction] = js.native
    /**
      * Opens a random-access stream to the file that can be used for transacted-write operations with the specified options.
      * @param options A bitwise combination of the enumeration values that specify options for opening the stream.
      * @return When this method completes, it returns a StorageStreamTransaction that contains the random-access stream and methods that can be used to complete transactions.
      */
    def openTransactedWriteAsync(options: StorageOpenOptions): IPromiseWithIAsyncOperation[StorageStreamTransaction] = js.native
    
    /** Gets the path of the StorageFile . */
    var path: String = js.native
    
    /** Gets an object for retrieving the properties of the StorageFile . */
    var properties: StorageItemContentProperties = js.native
    
    /** Gets the StorageProvider object that contains info about the service that stores the current file. */
    var provider: StorageProvider = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_propertiesupdated(`type`: propertiesupdated, listener: TypedEventHandler[IStorageItemInformation, js.Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_thumbnailupdated(`type`: thumbnailupdated, listener: TypedEventHandler[IStorageItemInformation, js.Any]): Unit = js.native
    
    /**
      * Renames the StorageFile .
      * @param desiredName The new name.
      * @return No object or value is returned when this method completes.
      */
    def renameAsync(desiredName: String): IPromiseWithIAsyncAction = js.native
    /**
      * Renames the StorageFile , and specifies what to do if a file with the same name already exists in the current folder.
      * @param desiredName The new name.
      * @param option A value that indicates what to do if the file name already exists in the current folder.
      * @return No object or value is returned when this method completes.
      */
    def renameAsync(desiredName: String, option: NameCollisionOption): IPromiseWithIAsyncAction = js.native
    
    /** Gets the thumbnail associated with the StorageFile . */
    var thumbnail: StorageItemThumbnail = js.native
    
    /** Gets an object that provides access to the video properties of the StorageFile , such as the duration, rating, date released, and so on. */
    var videoProperties: VideoProperties = js.native
  }
  
  /** Used to load information about files and folders from the results of a query and to bind these file system items to JavaScript ListView or XAML ListView and GridView controls. After information is loaded, an app can then access that information quickly using synchronous operations. */
  @js.native
  trait FileInformationFactory extends StObject {
    
    /**
      * Retrieves a collection of FileInformation objects that contain information about all StorageFile objects in a collection.
      * @return When this method completes successfully, it returns the list (type IVectorView ) of FileInformation objects.
      */
    def getFilesAsync(): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = js.native
    /**
      * Retrieves a collection of FileInformation objects that contain information about a range of StorageFile objects in a collection.
      * @param startIndex The zero-based index of the first StorageFile in the range.
      * @param maxItemsToRetrieve The maximum number of StorageFile objects to retrieve information for.
      * @return When this method completes successfully, it returns the list (type IVectorView ) of FileInformation objects.
      */
    def getFilesAsync(startIndex: Double, maxItemsToRetrieve: Double): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = js.native
    
    /**
      * Retrieves a collection of FolderInformation objects that contain information about all StorageFolder objects in a collection.
      * @return When this method completes successfully, it returns the list (type IVectorView ) of FolderInformation objects.
      */
    def getFoldersAsync(): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = js.native
    /**
      * Retrieves a collection of FolderInformation objects that contain information about a range of StorageFolder objects in a collection.
      * @param startIndex The zero-based index of the first StorageFolder in the range.
      * @param maxItemsToRetrieve The maximum number of StorageFolder objects to retrieve information for.
      * @return When this method completes successfully, it returns the list (type IVectorView ) of FolderInformation objects.
      */
    def getFoldersAsync(startIndex: Double, maxItemsToRetrieve: Double): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = js.native
    
    /**
      * Retrieves a collection of IStorageItemInformation objects that contain information about all the items in the collection.
      * @return When this method completes successfully, it returns the list (type IVectorView ) of FileInformation and FolderInformation objects.
      */
    def getItemsAsync(): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = js.native
    /**
      * Retrieves a collection of IStorageItemInformation objects that contain information about a range of items in a collection.
      * @param startIndex The zero-based index of the first item in the range.
      * @param maxItemsToRetrieve The maximum number of items to retrieve information for.
      * @return When this method completes successfully, it returns the list (type IVectorView ) of FileInformation and FolderInformation objects.
      */
    def getItemsAsync(startIndex: Double, maxItemsToRetrieve: Double): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = js.native
    
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
  
  /** Provides synchronous access to the properties exposed off StorageFolder and lets an app perform asynchronous management operations such as copy, delete, move, and rename. */
  @js.native
  trait FolderInformation extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_propertiesupdated(`type`: propertiesupdated, listener: TypedEventHandler[IStorageItemInformation, js.Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_thumbnailupdated(`type`: thumbnailupdated, listener: TypedEventHandler[IStorageItemInformation, js.Any]): Unit = js.native
    
    /**
      * Retrieves a value that indicates whether the folder supports the specified search query options.
      * @param queryOptions The search query options to test.
      * @return True if the folder supports the specified search query options; otherwise false.
      */
    def areQueryOptionsSupported(queryOptions: QueryOptions): Boolean = js.native
    
    /** Gets the attributes of a loaded folder. */
    var attributes: FileAttributes = js.native
    
    /** Gets an object that contains the basic properties information of the folder. */
    var basicProperties: BasicProperties = js.native
    
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
    
    /** Gets the date that the folder was created. */
    var dateCreated: Date = js.native
    
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
    
    /** Gets the user-friendly name of the StorageFolder . */
    var displayName: String = js.native
    
    /** Gets the display type of the StorageFolder . */
    var displayType: String = js.native
    
    /** Gets the document properties of the StorageFolder . */
    var documentProperties: DocumentProperties = js.native
    
    /** Gets the identifier that uniquely identifies the StorageFolder relative to other items in the same folder. */
    var folderRelativeId: String = js.native
    
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
    def getFilesAsync(): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = js.native
    /**
      * Retrieves files from the current folder based on a common folder query.
      * @param query The common file query.
      * @return When this method completes successfully, it returns the list (type IVectorView ) of StorageFile objects in the folder.
      */
    def getFilesAsync(query: CommonFileQuery): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = js.native
    /**
      * Retrieves a range of files from the current folder based on a common file query.
      * @param query The common file query.
      * @param startIndex The zero-based index of the first file in the range.
      * @param maxItemsToRetrieve The maximum number of files to retrieve.
      * @return When this method completes successfully, it returns the list (type IVectorView ) of StorageFile objects in the folder.
      */
    def getFilesAsync(query: CommonFileQuery, startIndex: Double, maxItemsToRetrieve: Double): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = js.native
    
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
    def getFoldersAsync(): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = js.native
    /**
      * Retrieves child folders from the current folder based on a common folder query.
      * @param query The common folder query.
      * @return When this method completes successfully, it returns the list (type IVectorView ) of child folders. Each child folder in this list is represented by a StorageFolder object.
      */
    def getFoldersAsync(query: CommonFolderQuery): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = js.native
    /**
      * Retrieves a range of child folders from the current folder based on a common folder query.
      * @param query The common folder query.
      * @param startIndex The zero-based index of the first child folder in the range.
      * @param maxItemsToRetrieve The maximum number of child folders to retrieve.
      * @return When this method completes successfully, it returns the list (type IVectorView ) of child folders. Each child folder in this list is represented by a StorageFolder object.
      */
    def getFoldersAsync(query: CommonFolderQuery, startIndex: Double, maxItemsToRetrieve: Double): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = js.native
    
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
    def getItemsAsync(): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = js.native
    /**
      * Retrieves a range of items from the current folder.
      * @param startIndex The zero-based index of the first item in the range.
      * @param maxItemsToRetrieve The maximum number of items to retrieve.
      * @return When this method completes successfully, it returns the list (type IVectorView ) of items.
      */
    def getItemsAsync(startIndex: Double, maxItemsToRetrieve: Double): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = js.native
    
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
    
    /** Gets the image properties of the StorageFolder . */
    var imageProperties: ImageProperties = js.native
    
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
    
    /** Gets the music properties associated with the StorageFolder . */
    var musicProperties: MusicProperties = js.native
    
    /** Gets the name of the StorageFolder . */
    var name: String = js.native
    
    /** Occurs when one or more of the StorageFolder 's properties is updated. */
    def onpropertiesupdated(ev: js.Any & WinRTEvent[IStorageItemInformation]): Unit = js.native
    /** Occurs when one or more of the StorageFolder 's properties is updated. */
    @JSName("onpropertiesupdated")
    var onpropertiesupdated_Original: TypedEventHandler[IStorageItemInformation, js.Any] = js.native
    
    /** Fires when the StorageFolder 's thumbnail is updated or a better quality thumbnail is available. */
    def onthumbnailupdated(ev: js.Any & WinRTEvent[IStorageItemInformation]): Unit = js.native
    /** Fires when the StorageFolder 's thumbnail is updated or a better quality thumbnail is available. */
    @JSName("onthumbnailupdated")
    var onthumbnailupdated_Original: TypedEventHandler[IStorageItemInformation, js.Any] = js.native
    
    /** Gets the path of the StorageFolder . */
    var path: String = js.native
    
    /** Gets an object for retrieving the properties of the StorageFolder . */
    var properties: StorageItemContentProperties = js.native
    
    /** Gets the StorageProvider object that contains info about the service that stores the current folder. */
    var provider: StorageProvider = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_propertiesupdated(`type`: propertiesupdated, listener: TypedEventHandler[IStorageItemInformation, js.Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_thumbnailupdated(`type`: thumbnailupdated, listener: TypedEventHandler[IStorageItemInformation, js.Any]): Unit = js.native
    
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
    
    /** Gets the thumbnail for the StorageFile . */
    var thumbnail: StorageItemThumbnail = js.native
    
    /**
      * Try to get a specific file or sub-folder from the current folder using the name of the file or folder to get.
      * @param name The name (or path relative to the current folder) of the file or sub-folder to try to retrieve.
      * @return When this method completes successfully, it returns the file or folder (type IStorageItem ).
      */
    def tryGetItemAsync(name: String): IPromiseWithIAsyncOperation[IStorageItem] = js.native
    
    /** Gets the video properties that are associated with the StorageFolder . */
    var videoProperties: VideoProperties = js.native
  }
  
  /** Provides synchronous access to the properties of a file or folder in the file system. */
  trait IStorageItemInformation extends StObject {
    
    /** Gets an object that contains the basic properties information of the item. */
    var basicProperties: BasicProperties
    
    /** Gets an object that provides access to the document properties of the item, such as the title, author name, and so on. */
    var documentProperties: DocumentProperties
    
    /** Gets an object that provides access to the image properties of the item, such as the title, rating, date that the image was taken, and so on. */
    var imageProperties: ImageProperties
    
    /** Gets an object that provides access to the music properties of the item, such as the album name, artist name, bit rate, and so on. */
    var musicProperties: MusicProperties
    
    /** Gets the thumbnail associated with the item. */
    var thumbnail: StorageItemThumbnail
    
    /** Gets an object that provides access to the video properties of the item, such as the duration, rating, date released, and so on. */
    var videoProperties: VideoProperties
  }
  object IStorageItemInformation {
    
    @scala.inline
    def apply(
      basicProperties: BasicProperties,
      documentProperties: DocumentProperties,
      imageProperties: ImageProperties,
      musicProperties: MusicProperties,
      thumbnail: StorageItemThumbnail,
      videoProperties: VideoProperties
    ): IStorageItemInformation = {
      val __obj = js.Dynamic.literal(basicProperties = basicProperties.asInstanceOf[js.Any], documentProperties = documentProperties.asInstanceOf[js.Any], imageProperties = imageProperties.asInstanceOf[js.Any], musicProperties = musicProperties.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], videoProperties = videoProperties.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStorageItemInformation]
    }
    
    @scala.inline
    implicit class IStorageItemInformationMutableBuilder[Self <: IStorageItemInformation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasicProperties(value: BasicProperties): Self = StObject.set(x, "basicProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentProperties(value: DocumentProperties): Self = StObject.set(x, "documentProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageProperties(value: ImageProperties): Self = StObject.set(x, "imageProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMusicProperties(value: MusicProperties): Self = StObject.set(x, "musicProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnail(value: StorageItemThumbnail): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoProperties(value: VideoProperties): Self = StObject.set(x, "videoProperties", value.asInstanceOf[js.Any])
    }
  }
}
