package typings.winrtUwp.Windows.Storage

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.FileProperties.BasicProperties
import typings.winrtUwp.Windows.Storage.FileProperties.StorageItemContentProperties
import typings.winrtUwp.Windows.Storage.FileProperties.StorageItemThumbnail
import typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailMode
import typings.winrtUwp.Windows.Storage.FileProperties.ThumbnailOptions
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a file. Provides information about the file and its content, and ways to manipulate them. */
@js.native
trait StorageFile extends js.Object {
  
  /** Gets the attributes of a file. */
  var attributes: FileAttributes = js.native
  
  /** Gets the MIME type of the contents of the file. */
  var contentType: String = js.native
  
  /**
    * Replaces the specified file with a copy of the current file.
    * @param fileToReplace The file to replace.
    * @return No object or value is returned when this method completes.
    */
  def copyAndReplaceAsync(fileToReplace: IStorageFile): IPromiseWithIAsyncAction = js.native
  
  /**
    * Creates a copy of the file in the specified folder.
    * @param destinationFolder The destination folder where the copy of the file is created.
    * @return When this method completes, it returns a StorageFile that represents the copy of the file created in the destinationFolder.
    */
  def copyAsync(destinationFolder: IStorageFolder): IPromiseWithIAsyncOperation[StorageFile] = js.native
  /**
    * Creates a copy of the file in the specified folder and renames the copy.
    * @param destinationFolder The destination folder where the copy of the file is created.
    * @param desiredNewName The new name for the copy of the file created in the destinationFolder.
    * @return When this method completes, it returns a StorageFile that represents the copy of the file created in the destinationFolder.
    */
  def copyAsync(destinationFolder: IStorageFolder, desiredNewName: String): IPromiseWithIAsyncOperation[StorageFile] = js.native
  /**
    * Creates a copy of the file in the specified folder and renames the copy. This method also specifies what to do if a file with the same name already exists in the destination folder.
    * @param destinationFolder The destination folder where the copy of the file is created.
    * @param desiredNewName The new name for the copy of the file created in the destinationFolder.
    * @param option One of the enumeration values that determines how to handle the collision if a file with the specified desiredNewName already exists in the destination folder.
    * @return When this method completes, it returns a StorageFile that represents the copy of the file created in the destinationFolder.
    */
  def copyAsync(destinationFolder: IStorageFolder, desiredNewName: String, option: NameCollisionOption): IPromiseWithIAsyncOperation[StorageFile] = js.native
  
  /** Gets the date and time when the current file was created. */
  var dateCreated: Date = js.native
  
  /**
    * Deletes the current file.
    * @return No object or value is returned by this method when it completes.
    */
  def deleteAsync(): IPromiseWithIAsyncAction = js.native
  /**
    * Deletes the current file, optionally deleting the item permanently.
    * @param option A value that indicates whether to delete the item permanently.
    * @return No object or value is returned by this method when it completes.
    */
  def deleteAsync(option: StorageDeleteOption): IPromiseWithIAsyncAction = js.native
  
  /** Gets a user-friendly name for the file. */
  var displayName: String = js.native
  
  /** Gets a user-friendly description of the type of the file. */
  var displayType: String = js.native
  
  /** Gets the type (file name extension) of the file. */
  var fileType: String = js.native
  
  /** Gets an identifier for the file. This ID is unique for the query result or StorageFolder that contains the file and can be used to distinguish between items that have the same name. */
  var folderRelativeId: String = js.native
  
  /**
    * Gets the basic properties of the current file.
    * @return When this method completes successfully, it returns the basic properties of the current file as a BasicProperties object.
    */
  def getBasicPropertiesAsync(): IPromiseWithIAsyncOperation[BasicProperties] = js.native
  
  /**
    * Gets the parent folder of the current file.
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
    * Retrieves an adjusted thumbnail image for the file, determined by the purpose of the thumbnail.
    * @param mode The enum value that describes the purpose of the thumbnail and determines how the thumbnail image is adjusted.
    * @return When this method completes successfully, it returns a StorageItemThumbnail that represents the thumbnail image or null if there is no thumbnail image associated with the file.
    */
  def getThumbnailAsync(mode: ThumbnailMode): IPromiseWithIAsyncOperation[StorageItemThumbnail] = js.native
  /**
    * Retrieves an adjusted thumbnail image for the file, determined by the purpose of the thumbnail and the requested size.
    * @param mode The enum value that describes the purpose of the thumbnail and determines how the thumbnail image is adjusted.
    * @param requestedSize The requested size, in pixels, of the longest edge of the thumbnail. Windows uses the requestedSize as a guide and tries to scale the thumbnail image without reducing the quality of the image.
    * @return When this method completes successfully, it returns a StorageItemThumbnail that represents the thumbnail image or null if there is no thumbnail image associated with the file.
    */
  def getThumbnailAsync(mode: ThumbnailMode, requestedSize: Double): IPromiseWithIAsyncOperation[StorageItemThumbnail] = js.native
  /**
    * Retrieves an adjusted thumbnail image for the file, determined by the purpose of the thumbnail, the requested size, and the specified options.
    * @param mode The enum value that describes the purpose of the thumbnail and determines how the thumbnail image is adjusted.
    * @param requestedSize The requested size, in pixels, of the longest edge of the thumbnail. Windows uses the requestedSize as a guide and tries to scale the thumbnail image without reducing the quality of the image.
    * @param options The enum value that describes the desired behavior to use to retrieve the thumbnail image. The specified behavior might affect the size and/or quality of the image and how quickly the thumbnail image is retrieved.
    * @return When this method completes successfully, it returns a StorageItemThumbnail that represents the thumbnail image or null if there is no thumbnail image associated with the file.
    */
  def getThumbnailAsync(mode: ThumbnailMode, requestedSize: Double, options: ThumbnailOptions): IPromiseWithIAsyncOperation[StorageItemThumbnail] = js.native
  
  /** Indicates if the file is local, is cached locally, or can be downloaded. */
  var isAvailable: Boolean = js.native
  
  /**
    * Indicates whether the current file is equal to the specified file.
    * @param item The IStorageItem object that represents a file to compare against.
    * @return Returns true if the current file is equal to the specified file; otherwise false.
    */
  def isEqual(item: IStorageItem): Boolean = js.native
  
  /**
    * Determines whether the current StorageFile matches the specified StorageItemTypes value.
    * @param type The value to match against.
    * @return True if the StorageFile matches the specified value; otherwise false.
    */
  def isOfType(`type`: StorageItemTypes): Boolean = js.native
  
  /**
    * Moves the current file to the location of the specified file and replaces the specified file in that location.
    * @param fileToReplace The file to replace.
    * @return No object or value is returned by this method.
    */
  def moveAndReplaceAsync(fileToReplace: IStorageFile): IPromiseWithIAsyncAction = js.native
  
  /**
    * Moves the current file to the specified folder.
    * @param destinationFolder The destination folder where the file is moved.
    * @return No object or value is returned by this method.
    */
  def moveAsync(destinationFolder: IStorageFolder): IPromiseWithIAsyncAction = js.native
  /**
    * Moves the current file to the specified folder and renames the file according to the desired name.
    * @param destinationFolder The destination folder where the file is moved.
    * @param desiredNewName The desired name of the file after it is moved.
    * @return No object or value is returned by this method.
    */
  def moveAsync(destinationFolder: IStorageFolder, desiredNewName: String): IPromiseWithIAsyncAction = js.native
  /**
    * Moves the current file to the specified folder and renames the file according to the desired name. This method also specifies what to do if a file with the same name already exists in the specified folder.
    * @param destinationFolder The destination folder where the file is moved.
    * @param desiredNewName The desired name of the file after it is moved.
    * @param option An enum value that determines how Windows responds if the desiredNewName is the same as the name of an existing file in the destination folder.
    * @return No object or value is returned by this method.
    */
  def moveAsync(destinationFolder: IStorageFolder, desiredNewName: String, option: NameCollisionOption): IPromiseWithIAsyncAction = js.native
  
  /** Gets the name of the file including the file name extension. */
  var name: String = js.native
  
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
    * Opens a random-access stream over the current file for reading file contents.
    * @return When this method completes, it returns the random-access stream (type IRandomAccessStreamWithContentType ).
    */
  def openReadAsync(): IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType] = js.native
  
  /**
    * Opens a sequential-access stream over the current file for reading file contents.
    * @return When this method completes, it returns the sequential-access stream (type IInputStream ).
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
  
  /** Gets the full file-system path of the current file, if the file has a path. */
  var path: String = js.native
  
  /** Gets an object that provides access to the content-related properties of the file. */
  var properties: StorageItemContentProperties = js.native
  
  /** Gets the StorageProvider object that contains info about the service that stores the current file. */
  var provider: StorageProvider = js.native
  
  /**
    * Renames the current file.
    * @param desiredName The desired, new name of the current item.
    * @return No object or value is returned by this method when it completes.
    */
  def renameAsync(desiredName: String): IPromiseWithIAsyncAction = js.native
  /**
    * Renames the current file. This method also specifies what to do if an existing item in the current file's location has the same name.
    * @param desiredName The desired, new name of the current file.
    * @param option The enum value that determines how Windows responds if the desiredName is the same as the name of an existing item in the current file's location.
    * @return No object or value is returned by this method when it completes.
    */
  def renameAsync(desiredName: String, option: NameCollisionOption): IPromiseWithIAsyncAction = js.native
}
