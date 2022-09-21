package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArchiveManager extends StObject {
  
  /**
    * Cancels an operation with the given identifier.
    *
    * @param operationIdentifier Task ID returned by an asynchronous function from this module.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  def abort(operationIdentifier: Double): Unit = js.native
  
  /**
    * Opens the archive file. After this operation, it is possible to add or get files to and from the archive.
    *
    * The errorCallback is launched with these error types:
    *
    * *   InvalidValuesError: If archiveFile format is not recognized
    * *   NotFoundError: If the _mode_ is "r" and the _file_ does not exist, or the _mode_ is not "r" and the _file_ cannot be created because the path of the file after excluding its file name does not exist
    * *   IOError: If the access is denied due to insufficient permissions
    * *   UnknownError: In case of any other error
    *
    *
    * Use _mode_ depending on which operation are intended:
    *
    *
    * | Mode | Description |
    * | ----- | ----- |
    * | r | Use this mode for extracting or getting information about the contents of an archive file. <br>    _file_ must exist. If the _file_ does not exist, _onerror_ will be invoked (_NotFoundError_).<br>    When an archive file is opened in this mode, _add()_ will not be available. (_IOError_ will be thrown.) |
    * | w | Use this mode to create an archive file and add files to the archive file. <br> If _file_ does not exist, it will be created. <br> If _file_ exists and the _overwrite_ option is <var>true</var>, the existing file will be overwritten with empty archive. <br> If _file_ exists and the _overwrite_ option is <var>false</var>, _onerror_ callback will be invoked (_InvalidModificationError_). <br> When an archive file is opened in this mode, _getEntries()_, _getEntryByName()_, and _extractAll()_ are not available. (_IOError_ will be thrown.) |
    * | rw | Use this mode for archive zipping/unzipping. <br> If _file_ does not exist, it will be created. <br> If _file_ exists and the _overwrite_ option is <var>true</var>, the existing file will be overwritten with an empty archive. <br> If _file_ exists and the _overwrite_ option is <var>false</var>, the existing contents are preserved. Both adding and extracting will be available. <br>|
    * | a | Use this mode to add new files to an archive file. <br> If _file_ does not exist, it will be created. <br> If _file_ exists, then the previous contents of the archive file are preserved and new files can be added to the archive file. In this mode, _getEntries()_, _getEntryByName()_, and _extractAll()_ are not available. (_IOError_ will be thrown.)|
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/filesystem.write
    *
    * @param file File to open.
    * @param mode File mode for the opened archive. Determines which operations are available.
    * @param onsuccess Callback method to be invoked when archive is opened successfully.
    * @param onerror Callback method to be invoked when an error occurs.
    * @param options Additional options for initializing the ArchiveFile instance.
    *
    * @returns Task ID which can be used to cancel the operation with abort().
    *
    * @throw WebAPIException with error type TypeMismatchError, if parameter type does not match.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method or the application does not have privilege to access the storage. For more information, see [Storage privileges](#StorageRemark).
    */
  def open(file: FileReference, mode: FileMode, onsuccess: ArchiveFileSuccessCallback): Double = js.native
  def open(
    file: FileReference,
    mode: FileMode,
    onsuccess: ArchiveFileSuccessCallback,
    onerror: Null,
    options: ArchiveFileOptions
  ): Double = js.native
  def open(
    file: FileReference,
    mode: FileMode,
    onsuccess: ArchiveFileSuccessCallback,
    onerror: Unit,
    options: ArchiveFileOptions
  ): Double = js.native
  def open(file: FileReference, mode: FileMode, onsuccess: ArchiveFileSuccessCallback, onerror: ErrorCallback): Double = js.native
  def open(
    file: FileReference,
    mode: FileMode,
    onsuccess: ArchiveFileSuccessCallback,
    onerror: ErrorCallback,
    options: ArchiveFileOptions
  ): Double = js.native
}
