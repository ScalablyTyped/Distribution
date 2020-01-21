package typings.winrtUwp.Windows.Storage.BulkAccess

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Storage.FileAccessMode
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
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.IStorageFolder
import typings.winrtUwp.Windows.Storage.IStorageItem
import typings.winrtUwp.Windows.Storage.NameCollisionOption
import typings.winrtUwp.Windows.Storage.StorageDeleteOption
import typings.winrtUwp.Windows.Storage.StorageFile
import typings.winrtUwp.Windows.Storage.StorageFolder
import typings.winrtUwp.Windows.Storage.StorageItemTypes
import typings.winrtUwp.Windows.Storage.StorageOpenOptions
import typings.winrtUwp.Windows.Storage.StorageProvider
import typings.winrtUwp.Windows.Storage.StorageStreamTransaction
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.propertiesupdated
import typings.winrtUwp.winrtUwpStrings.thumbnailupdated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides synchronous access to the properties exposed off StorageFile and lets an app perform asynchronous file operations such as copy, delete, move, and rename. */
@JSGlobal("Windows.Storage.BulkAccess.FileInformation")
@js.native
abstract class FileInformation () extends js.Object {
  /** Gets the attributes of a file. */
  var attributes: FileAttributes = js.native
  /** Gets an object that contains the basic properties information of the file. */
  var basicProperties: BasicProperties = js.native
  /** Gets a string that describes the contents of the file. */
  var contentType: String = js.native
  /** Gets the date that the file was created. */
  var dateCreated: Date = js.native
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
  /** Gets the image properties of the StorageFile , such as the title, rating, date that the image was taken, and so on. */
  var imageProperties: ImageProperties = js.native
  /** Indicates if the current file has been downloaded or can be downloaded. */
  var isAvailable: Boolean = js.native
  /** Gets the music properties associated with the StorageFile , such as the album name, artist name, bit rate, and so on. */
  var musicProperties: MusicProperties = js.native
  /** Gets the name of the StorageFile . */
  var name: String = js.native
  /** Occurs when one or more of the StorageFile 's properties is updated. */
  @JSName("onpropertiesupdated")
  var onpropertiesupdated_Original: TypedEventHandler[IStorageItemInformation, _] = js.native
  /** Fires when the StorageFile 's thumbnail is updated or a better quality thumbnail is available. */
  @JSName("onthumbnailupdated")
  var onthumbnailupdated_Original: TypedEventHandler[IStorageItemInformation, _] = js.native
  /** Gets the path of the StorageFile . */
  var path: String = js.native
  /** Gets an object for retrieving the properties of the StorageFile . */
  var properties: StorageItemContentProperties = js.native
  /** Gets the StorageProvider object that contains info about the service that stores the current file. */
  var provider: StorageProvider = js.native
  /** Gets the thumbnail associated with the StorageFile . */
  var thumbnail: StorageItemThumbnail = js.native
  /** Gets an object that provides access to the video properties of the StorageFile , such as the duration, rating, date released, and so on. */
  var videoProperties: VideoProperties = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_propertiesupdated(`type`: propertiesupdated, listener: TypedEventHandler[IStorageItemInformation, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_thumbnailupdated(`type`: thumbnailupdated, listener: TypedEventHandler[IStorageItemInformation, _]): Unit = js.native
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
  /** Occurs when one or more of the StorageFile 's properties is updated. */
  def onpropertiesupdated(ev: js.Any with WinRTEvent[IStorageItemInformation]): Unit = js.native
  /** Fires when the StorageFile 's thumbnail is updated or a better quality thumbnail is available. */
  def onthumbnailupdated(ev: js.Any with WinRTEvent[IStorageItemInformation]): Unit = js.native
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
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_propertiesupdated(`type`: propertiesupdated, listener: TypedEventHandler[IStorageItemInformation, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_thumbnailupdated(`type`: thumbnailupdated, listener: TypedEventHandler[IStorageItemInformation, _]): Unit = js.native
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
}

