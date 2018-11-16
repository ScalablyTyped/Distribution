package typings
package winrtDashUwpLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a file. Provides information about the file and its contents, and ways to manipulate them. */
@js.native
trait IStorageFile
  extends IStorageItem
     with winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference
     with winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IInputStreamReference {
  /** Gets the MIME type of the contents of the file. */
  var contentType: java.lang.String = js.native
  /** Gets the type (file name extension) of the file. */
  var fileType: java.lang.String = js.native
  /**
               * Replaces the specified file with a copy of the current file.
               * @param fileToReplace The file to replace.
               * @return No object or value is returned when this method completes.
               */
  def copyAndReplaceAsync(fileToReplace: IStorageFile): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
               * Creates a copy of the file in the specified folder.
               * @param destinationFolder The destination folder where the copy is created.
               * @return When this method completes, it returns a StorageFile that represents the copy.
               */
  def copyAsync(destinationFolder: IStorageFolder): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[StorageFile] = js.native
  /**
               * Creates a copy of the file in the specified folder, using the desired name.
               * @param destinationFolder The destination folder where the copy is created.
               * @param desiredNewName The desired name of the copy.
               * @return When this method completes, it returns a StorageFile that represents the copy.
               */
  def copyAsync(destinationFolder: IStorageFolder, desiredNewName: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[StorageFile] = js.native
  /**
               * Creates a copy of the file in the specified folder, using the desired name. This method also specifies what to do if an existing file in the specified folder has the same name.
               * @param destinationFolder The destination folder where the copy is created.
               * @param desiredNewName The desired name of the copy.
               * @param option An enum value that determines how Windows responds if the desiredNewName is the same as the name of an existing file in the destination folder.
               * @return When this method completes, it returns a StorageFile that represents the copy.
               */
  def copyAsync(destinationFolder: IStorageFolder, desiredNewName: java.lang.String, option: NameCollisionOption): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[StorageFile] = js.native
  /**
               * Moves the current file to the location of the specified file and replaces the specified file in that location.
               * @param fileToReplace The file to replace.
               * @return No object or value is returned by this method.
               */
  def moveAndReplaceAsync(fileToReplace: IStorageFile): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
               * Moves the current file to the specified folder.
               * @param destinationFolder The destination folder where the file is moved.
               * @return No object or value is returned by this method.
               */
  def moveAsync(destinationFolder: IStorageFolder): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
               * Moves the current file to the specified folder and renames the file according to the desired name.
               * @param destinationFolder The destination folder where the file is moved.
               * @param desiredNewName The desired name of the file after it is moved.
               * @return No object or value is returned by this method.
               */
  def moveAsync(destinationFolder: IStorageFolder, desiredNewName: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
               * Moves the current file to the specified folder and renames the file according to the desired name. This method also specifies what to do if a file with the same name already exists in the specified folder.
               * @param destinationFolder The destination folder where the file is moved.
               * @param desiredNewName The desired name of the file after it is moved.
               * @param option An enum value that determines how Windows responds if the desiredNewName is the same as the name of an existing file in the destination folder.
               * @return No object or value is returned by this method.
               */
  def moveAsync(destinationFolder: IStorageFolder, desiredNewName: java.lang.String, option: NameCollisionOption): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
               * Opens a random-access stream over the file.
               * @param accessMode The type of access to allow.
               * @return When this method completes, it returns the random-access stream (type IRandomAccessStream ).
               */
  def openAsync(accessMode: FileAccessMode): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream] = js.native
  /**
               * Opens a random-access stream over the file.
               * @param accessMode One of the enumeration values that specifies the type of access to allow.
               * @param options A bitwise combination of the enumeration values that specify options for opening the stream.
               * @return When this method completes, it returns an IRandomAccessStream that contains the requested random-access stream.
               */
  def openAsync(accessMode: FileAccessMode, options: StorageOpenOptions): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream] = js.native
  /**
               * Opens a transacted, random-access stream for writing to the file.
               * @return When this method completes, it returns a StorageStreamTransaction that contains the random-access stream and methods that can be used to complete transactions.
               */
  def openTransactedWriteAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[StorageStreamTransaction] = js.native
  /**
               * Opens a random-access stream to the file that can be used for transacted-write operations with the specified options.
               * @param options A bitwise combination of the enumeration values that specify options for opening the stream.
               * @return When this method completes, it returns a StorageStreamTransaction that contains the random-access stream and methods that can be used to complete transactions.
               */
  def openTransactedWriteAsync(options: StorageOpenOptions): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[StorageStreamTransaction] = js.native
}

