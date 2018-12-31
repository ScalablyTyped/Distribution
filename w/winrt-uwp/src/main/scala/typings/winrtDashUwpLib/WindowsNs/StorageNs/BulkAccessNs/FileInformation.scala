package typings
package winrtDashUwpLib.WindowsNs.StorageNs.BulkAccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides synchronous access to the properties exposed off StorageFile and lets an app perform asynchronous file operations such as copy, delete, move, and rename. */
@JSGlobal("Windows.Storage.BulkAccess.FileInformation")
@js.native
abstract class FileInformation () extends js.Object {
  /** Gets the attributes of a file. */
  var attributes: winrtDashUwpLib.WindowsNs.StorageNs.FileAttributes = js.native
  /** Gets an object that contains the basic properties information of the file. */
  var basicProperties: winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.BasicProperties = js.native
  /** Gets a string that describes the contents of the file. */
  var contentType: java.lang.String = js.native
  /** Gets the date that the file was created. */
  var dateCreated: stdLib.Date = js.native
  /** Gets the user-friendly name of the StorageFile . */
  var displayName: java.lang.String = js.native
  /** Gets the display type of the StorageFile . */
  var displayType: java.lang.String = js.native
  /** Gets an object that provides access to the document properties of the StorageFile , such as the title, author name, and so on. */
  var documentProperties: winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.DocumentProperties = js.native
  /** Gets the file type. */
  var fileType: java.lang.String = js.native
  /** Gets the identifier that uniquely identifies the StorageFile relative to other items in the same folder. */
  var folderRelativeId: java.lang.String = js.native
  /** Gets the image properties of the StorageFile , such as the title, rating, date that the image was taken, and so on. */
  var imageProperties: winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.ImageProperties = js.native
  /** Indicates if the current file has been downloaded or can be downloaded. */
  var isAvailable: scala.Boolean = js.native
  /** Gets the music properties associated with the StorageFile , such as the album name, artist name, bit rate, and so on. */
  var musicProperties: winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.MusicProperties = js.native
  /** Gets the name of the StorageFile . */
  var name: java.lang.String = js.native
  /** Occurs when one or more of the StorageFile 's properties is updated. */
  @JSName("onpropertiesupdated")
  var onpropertiesupdated_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[IStorageItemInformation, _] = js.native
  /** Fires when the StorageFile 's thumbnail is updated or a better quality thumbnail is available. */
  @JSName("onthumbnailupdated")
  var onthumbnailupdated_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[IStorageItemInformation, _] = js.native
  /** Gets the path of the StorageFile . */
  var path: java.lang.String = js.native
  /** Gets an object for retrieving the properties of the StorageFile . */
  var properties: winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.StorageItemContentProperties = js.native
  /** Gets the StorageProvider object that contains info about the service that stores the current file. */
  var provider: winrtDashUwpLib.WindowsNs.StorageNs.StorageProvider = js.native
  /** Gets the thumbnail associated with the StorageFile . */
  var thumbnail: winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.StorageItemThumbnail = js.native
  /** Gets an object that provides access to the video properties of the StorageFile , such as the duration, rating, date released, and so on. */
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
    * Replaces the specified StorageFile with a copy of the current file.
    * @param fileToReplace The StorageFile to be replaced.
    * @return No object or value is returned when this method completes.
    */
  def copyAndReplaceAsync(fileToReplace: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Creates a copy of the StorageFile and stores it in the specified StorageFolder .
    * @param destinationFolder The folder in which to store the copied file.
    * @return When this method completes successfully, it returns the copy as a StorageFile object.
    */
  def copyAsync(destinationFolder: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFolder): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StorageFile] = js.native
  /**
    * Creates a copy of the StorageFile , gives it the specified file name, and stores it in the specified StorageFolder .
    * @param destinationFolder The folder in which to store the copied file.
    * @param desiredNewName The name of the new copy.
    * @return When this method completes successfully, it returns the copy as a StorageFile object.
    */
  def copyAsync(
    destinationFolder: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFolder,
    desiredNewName: java.lang.String
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StorageFile] = js.native
  /**
    * Creates a copy of the StorageFile , gives it the specified file name, and stores it in the specified StorageFolder . The method also specifies what to do if a file with the same name already exists in the specified folder.
    * @param destinationFolder The folder in which to store the copied file.
    * @param desiredNewName The name of the new copy.
    * @param option A value that indicates what to do if the file name already exists in the destination folder.
    * @return When this method completes successfully, it returns the copy as a StorageFile object.
    */
  def copyAsync(
    destinationFolder: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFolder,
    desiredNewName: java.lang.String,
    option: winrtDashUwpLib.WindowsNs.StorageNs.NameCollisionOption
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StorageFile] = js.native
  /**
    * Deletes a file.
    * @return No object or value is returned when this method completes.
    */
  def deleteAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Deletes a file, optionally moving the deleted file to the recycle bin.
    * @param option A value that specifies whether the deleted file is moved to the recycle bin.
    * @return No object or value is returned when this method completes.
    */
  def deleteAsync(option: winrtDashUwpLib.WindowsNs.StorageNs.StorageDeleteOption): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Retrieves the basic properties of the StorageFile .
    * @return When this method completes successfully, it returns a BasicProperties object.
    */
  def getBasicPropertiesAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.BasicProperties] = js.native
  /**
    * Gets the parent folder of the current file.
    * @return When this method completes, it returns the parent folder as a StorageFolder .
    */
  def getParentAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StorageFolder] = js.native
  /**
    * Retrieves the thumbnail that is associated with the StorageFile .
    * @param mode The thumbnail mode to retrieve.
    * @return When this method completes successfully, it returns the thumbnail image as a StorageItemThumbnail object.
    */
  def getThumbnailAsync(mode: winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.StorageItemThumbnail] = js.native
  /**
    * Retrieves the thumbnail that is associated with the StorageFile , scaling it to the specified size.
    * @param mode The thumbnail mode to retrieve.
    * @param requestedSize The requested size in pixels of thumbnail to retrieve.
    * @return When this method completes successfully, it returns the thumbnail image as a StorageItemThumbnail object.
    */
  def getThumbnailAsync(
    mode: winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode,
    requestedSize: scala.Double
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.StorageItemThumbnail] = js.native
  /**
    * Retrieves the thumbnail that is associated with the StorageFile , based on the specified options.
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
    * Indicates whether the current file is the same as the specified storage item.
    * @param item The IStorageItem object that represents a storage item to compare against.
    * @return Returns true if the current storage item is the same as the specified storage item; otherwise false.
    */
  def isEqual(item: winrtDashUwpLib.WindowsNs.StorageNs.IStorageItem): scala.Boolean = js.native
  /**
    * Determines whether the loaded StorageFile is the specified type.
    * @param type The type of item to check against.
    * @return True if the loaded StorageFile is the specified type; otherwise false.
    */
  def isOfType(`type`: winrtDashUwpLib.WindowsNs.StorageNs.StorageItemTypes): scala.Boolean = js.native
  /**
    * Moves the current StorageFile from its location and uses it to replace the specified StorageFile.
    * @param fileToReplace The StorageFile to be replaced.
    * @return An object for managing the asynchronous move and replace operation.
    */
  def moveAndReplaceAsync(fileToReplace: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Moves the StorageFile to the specified StorageFolder .
    * @param destinationFolder The destination folder.
    * @return No object or value is returned when this method completes.
    */
  def moveAsync(destinationFolder: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFolder): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Moves the StorageFile to the specified folder, and gives the file the specified file name.
    * @param destinationFolder The destination folder.
    * @param desiredNewName The new file name.
    * @return No object or value is returned when this method completes.
    */
  def moveAsync(
    destinationFolder: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFolder,
    desiredNewName: java.lang.String
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Moves the StorageFile to the specified folder and gives it the specified file name. The method also specifies what to do if a file with the same name already exists in the specified folder.
    * @param destinationFolder The destination folder.
    * @param desiredNewName The new file name.
    * @param option A value that indicates what to do if the file name already exists in the destination folder.
    * @return No object or value is returned when this method completes.
    */
  def moveAsync(
    destinationFolder: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFolder,
    desiredNewName: java.lang.String,
    option: winrtDashUwpLib.WindowsNs.StorageNs.NameCollisionOption
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /** Occurs when one or more of the StorageFile 's properties is updated. */
  def onpropertiesupdated(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[IStorageItemInformation]): scala.Unit = js.native
  /** Fires when the StorageFile 's thumbnail is updated or a better quality thumbnail is available. */
  def onthumbnailupdated(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[IStorageItemInformation]): scala.Unit = js.native
  /**
    * Opens a random-access stream with the specified options over the specified file.
    * @param accessMode One of the enumeration values that specifies the type of access to allow.
    * @return When this method completes, it returns an IRandomAccessStream that contains the requested random-access stream.
    */
  def openAsync(accessMode: winrtDashUwpLib.WindowsNs.StorageNs.FileAccessMode): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream] = js.native
  /**
    * Opens a random-access stream with the specified options over the specified file.
    * @param accessMode One of the enumeration values that specifies the type of access to allow.
    * @param options A bitwise combination of the enumeration values that specify options for opening the stream.
    * @return When this method completes, it returns an IRandomAccessStream that contains the requested random-access stream.
    */
  def openAsync(
    accessMode: winrtDashUwpLib.WindowsNs.StorageNs.FileAccessMode,
    options: winrtDashUwpLib.WindowsNs.StorageNs.StorageOpenOptions
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream] = js.native
  /**
    * Opens a read-only, random-access stream over the StorageFile .
    * @return When this method completes successfully, it returns a read-only, random-access stream (type IRandomAccessStreamWithContentType ).
    */
  def openReadAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamWithContentType] = js.native
  /**
    * Opens a read-only, sequential-access stream over the StorageFile .
    * @return When this method completes successfully, it returns a read-only, sequential-access stream (type IInputStream ).
    */
  def openSequentialReadAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IInputStream] = js.native
  /**
    * Opens a random-access stream to the file that can be used for transacted-write operations.
    * @return When this method completes, it returns a StorageStreamTransaction that contains the random-access stream and methods that can be used to complete transactions.
    */
  def openTransactedWriteAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StorageStreamTransaction] = js.native
  /**
    * Opens a random-access stream to the file that can be used for transacted-write operations with the specified options.
    * @param options A bitwise combination of the enumeration values that specify options for opening the stream.
    * @return When this method completes, it returns a StorageStreamTransaction that contains the random-access stream and methods that can be used to complete transactions.
    */
  def openTransactedWriteAsync(options: winrtDashUwpLib.WindowsNs.StorageNs.StorageOpenOptions): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StorageStreamTransaction] = js.native
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
    * Renames the StorageFile .
    * @param desiredName The new name.
    * @return No object or value is returned when this method completes.
    */
  def renameAsync(desiredName: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Renames the StorageFile , and specifies what to do if a file with the same name already exists in the current folder.
    * @param desiredName The new name.
    * @param option A value that indicates what to do if the file name already exists in the current folder.
    * @return No object or value is returned when this method completes.
    */
  def renameAsync(desiredName: java.lang.String, option: winrtDashUwpLib.WindowsNs.StorageNs.NameCollisionOption): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

