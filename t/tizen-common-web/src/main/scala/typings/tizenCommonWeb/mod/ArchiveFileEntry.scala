package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tizen-common-web", "ArchiveFileEntry")
@js.native
open class ArchiveFileEntry () extends StObject {
  
  /**
    * Amount of storage space used by the member file, which may be compressed, in ArchiveFile \[bytes\].
    *
    * If ArchiveFileEntry member is a folder, the attribute will be sum of the sizes of all files in this directory.
    *
    * Until a new entry is added to the archive, the compressedSize is null
    */
  val compressedSize: Double | Null = js.native
  
  /**
    * Extracts ArchiveFileEntry to the given location.
    *
    * The errorCallback is launched with these error types:
    *
    * *   NotFoundError: If the given _destinationDirectory_ does not exist
    * *   InvalidModificationError: If the file already exists and overwriting is not allowed
    * *   IOError: If destinationDirectory can not be written to
    * *   UnknownError: In case of any other error
    *
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/filesystem.write
    *
    * @param destinationDirectory Directory where extracted files will be stored
    * Given as a virtual path or a _File_ object representing a directory.
    * @param onsuccess Callback method to be invoked when an extract operation is completed.
    * @param onerror Callback method to be invoked when an error occurs.
    * @param onprogress Callback method to be invoked while the extracting is in progress
    * The onprogress callback is called at least once. It will be invoked for every extracted file.
    * @param stripName Flag which determines if directory name part of _ArchiveFileEntry_ should be removed or preserved
    * The default value is false. If it is true, use only base name (part after last slash) as a target path.
    * @param overwrite Flag which determines if it possible to overwrite files when the decompressed file already exists in this destination location
    * The default value is false.
    *
    * @returns Task ID which can be used to cancel the operation with abort().
    *
    * @throw WebAPIException with error type TypeMismatchError, if parameter is of the wrong type.
    * @throw WebAPIException with error type InvalidValuesError, if directory parameter does not represent a directory.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method or the application does not have privilege to access the storage. For more information, see [Storage privileges](#StorageRemark).
    */
  def extract(
    destinationDirectory: FileReference,
    onsuccess: js.UndefOr[SuccessCallback | Null],
    onerror: js.UndefOr[ErrorCallback | Null],
    onprogress: js.UndefOr[ArchiveFileProgressCallback | Null],
    stripName: js.UndefOr[Boolean | Null],
    overwrite: js.UndefOr[Boolean | Null]
  ): Double = js.native
  
  /**
    * Date and time stored with the member file.
    * This is usually the modification date of the file.
    */
  val modified: js.Date = js.native
  
  /**
    * Path identifying the member file of ArchiveFile.
    * This is a full path with the directory and base name of the entry.
    */
  val name: String = js.native
  
  /**
    * Original size of the member file \[bytes\].
    *
    * If the ArchiveFileEntry member is a folder, the attribute value will be the sum of sizes of all files in this directory.
    */
  val size: Double = js.native
}
