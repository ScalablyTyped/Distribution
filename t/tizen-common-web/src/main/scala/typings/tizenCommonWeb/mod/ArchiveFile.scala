package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tizen-common-web", "ArchiveFile")
@js.native
open class ArchiveFile () extends StObject {
  
  /**
    * Adds a new member file to _ArchiveFile_.
    *
    * If _sourceFile_ refers to a directory,
    * the directory and its content will be added to ArchiveFile.
    *
    * The errorCallback is launched with these error types:
    *
    * *   NotFoundError: If the given _sourceFile_ does not exist
    * *   IOError: If archiveFile can not be written due the lack of access permission
    * *   InvalidModificationError: If the operation results in a name conflict in the archive
    * i.e. two entries in the archive with the same name (including directory names).
    * *   UnknownError: In any case of any other error
    *
    *
    * Name stored for new entries is constructed from _sourceFile_ according to the
    * [stripSourceDirectory](#ArchiveFileEntryOptions::stripSourceDirectory) and [destination](#ArchiveFileEntryOptions::destination) options. Names are constructed as follows:
    *
    * | source file | destination | stripSourceDirectory | resulting entry name |
    * | ----- | ----- | ----- | ----- |
    * | documents/subdir/second/justName.ext | _(empty)_ | false | subdir/second/justName.ext |
    * | documents/subdir/second/justName.ext | _(empty)_ | true | justName.ext |
    * | documents/subdir/justName.ext | "report3" | false | report3/subdir/justName.ext |
    * | documents/subdir/justName.ext | "report3" | true | report3/justName.ext |
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/filesystem.write
    *
    * @param sourceFile File or directory to be added to archive.
    * @param onsuccess Callback method to be invoked when this operation is completed successfully.
    * @param onerror Callback method to be invoked when an error occurs.
    * @param onprogress Callback method to be invoked to notify about operation progress
    * It is called every time a single source file has been completely added.
    * If the source file is big then the callback can also be called while the file is being processed.
    * @param options Additional options used to control how the sourceFile will be compressed and stored in the archive.
    *
    * @returns Task ID which can be used to cancel the operation with abort().
    *
    * @throws WebAPIException with error type TypeMismatchError, if parameter is of the wrong type.
    * @throws WebAPIException with error type InvalidStateError, if ArchiveFile is not open.
    * @throws WebAPIException with error type InvalidAccessError, if the file mode is "r".
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method or the application does not have privilege to access the storage. For more information, see [Storage privileges](#StorageRemark).
    */
  def add(
    sourceFile: FileReference,
    onsuccess: js.UndefOr[SuccessCallback | Null],
    onerror: js.UndefOr[ErrorCallback | Null],
    onprogress: js.UndefOr[ArchiveFileProgressCallback | Null],
    options: js.UndefOr[ArchiveFileEntryOptions | Null]
  ): Double = js.native
  
  /**
    * Closes the _ArchiveFile_.
    *
    * Call this method when the archive file is not used any more. Once you call this method, the archive file object will not be available and any further operation attempt results in an _InvalidStateError_.
    * Calling _close()_ on an archive file object which is already closed does not raise any exception.
    *
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def close(): Unit = js.native
  
  /**
    * Size of all the files included in the archive after decompression.
    *
    * The size is null until the archive is opened.
    */
  val decompressedSize: Double | Null = js.native
  
  /**
    * Extracts every file from this _ArchiveFile_ to a given directory.
    *
    * All extracted files will be located in the given directory.
    *
    * The overwrite attribute determines whether extracted files can overwrite existing files.
    *
    * The errorCallback is launched with these error types:
    *
    * *   NotFoundError: If the given _destinationDirectory_ does not exist
    * *   IOError: If destinationDirectory can not be written to (e.g due to insufficient permissions)
    * *   InvalidModificationError: If during extracting it is detected that an existing file would
    * have to be overwritten and the _overwrite_ argument is false
    * *   UnknownError: In any other error case
    *
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/filesystem.write
    *
    * @param destinationDirectory Directory where extracted files will be stored
    * Specified as a virtual path or a _File_ object representing a directory.
    * @param onsuccess Callback method to be invoked when an archive is extracted successfully.
    * @param onerror Callback method to be invoked when an error occurs.
    * @param onprogress Callback method to be invoked while the extracting is in progress
    * The onprogress callback is called at least once. It will be invoked for every extracted file.
    * @param overwrite Flag indicating whether to overwrite or keep the existing files with the same name in the destinationDirectory location when extracting an archive
    * By default, this attribute is set to false.
    *
    * @returns Task ID which can be used to cancel the operation with abort().
    *
    * @throws WebAPIException with error type TypeMismatchError, if parameter is of the wrong type.
    * @throws WebAPIException with error type InvalidStateError, if ArchiveFile is not open.
    * @throws WebAPIException with error type InvalidAccessError, if the file mode is "w" or "a".
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method or the application does not have privilege to access the storage. For more information, see [Storage privileges](#StorageRemark).
    */
  def extractAll(
    destinationDirectory: FileReference,
    onsuccess: js.UndefOr[SuccessCallback | Null],
    onerror: js.UndefOr[ErrorCallback | Null],
    onprogress: js.UndefOr[ArchiveFileProgressCallback | Null],
    overwrite: js.UndefOr[Boolean | Null]
  ): Double = js.native
  
  /**
    * Retrieves information about the member files in _ArchiveFile_.
    *
    * The errorCallback is launched with these error types:
    *
    * *   UnknownError: In case of any error
    *
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/filesystem.read
    *
    * @param onsuccess Callback method to be invoked when information about all the files in the archive is successfully retrieved.
    * @param onerror Callback method to be invoked when an error occurs.
    *
    * @returns Task ID which can be used to cancel the operation with abort().
    *
    * @throws WebAPIException with error type TypeMismatchError, if parameter is of the wrong type.
    * @throws WebAPIException with error type InvalidStateError, if ArchiveFile is not open.
    * @throws WebAPIException with error type InvalidAccessError, if the file mode is "w" or "a".
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method or the application does not have privilege to access the storage. For more information, see [Storage privileges](#StorageRemark).
    */
  def getEntries(onsuccess: ArchiveFileEntryArraySuccessCallback): Double = js.native
  def getEntries(onsuccess: ArchiveFileEntryArraySuccessCallback, onerror: ErrorCallback): Double = js.native
  
  /**
    * Retrieves information about _ArchiveFileEntry_ with the specified name in _ArchiveFile_.
    *
    * The errorCallback is launched with these error types:
    *
    * *   NotFoundError: If _ArchiveFileEntry_ with the specific name does not exist
    * *   UnknownError: In case of any other error
    *
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/filesystem.read
    *
    * @param name Name of _ArchiveFileEntry_ to extract.
    * @param onsuccess Callback method to be invoked when a file matched with the given name is found.
    * @param onerror Callback method to be invoked when an error occurs.
    *
    * @returns Task ID which can be used to cancel the operation with abort().
    *
    * @throws WebAPIException with error type TypeMismatchError, if parameter is of the wrong type.
    * @throws WebAPIException with error type InvalidStateError, if ArchiveFile is not opened.
    * @throws WebAPIException with error type InvalidAccessError, if the file mode is "w" or "a".
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method or the application does not have privilege to access the storage. For more information, see [Storage privileges](#StorageRemark).
    */
  def getEntryByName(name: String, onsuccess: ArchiveFileEntrySuccessCallback): Double = js.native
  def getEntryByName(name: String, onsuccess: ArchiveFileEntrySuccessCallback, onerror: ErrorCallback): Double = js.native
  
  /**
    * Describes the mode the file is opened with.
    */
  val mode: FileMode = js.native
}
