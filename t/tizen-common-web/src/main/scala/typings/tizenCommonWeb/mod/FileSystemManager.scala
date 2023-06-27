package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemManager extends StObject {
  
  /**
    * Adds a listener to subscribe to notifications when a change in storage state occurs.
    *
    * The most common usage for this method is to watch for any additions and removals of external storages.
    *
    * When executed, it returns a subscription identifier that identifies the watch operation. After returning the identifier, the watch operation is started asynchronously. The onsuccess method will be invoked every time a storage state changes. If the attempt fails, the onerror if present will be invoked with the relevant error type.
    *
    * The watch operation must continue until the removeStorageStateChangeListener() method is called with the corresponding subscription identifier.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/filesystem.write
    *
    * @param onsuccess Callback method to be invoked when any change is made to storage state.
    * @param onerror Callback method to be invoked when an error occurs during the watch process.
    *
    * @returns Subscription identifier.
    *
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method. For more information, see [Storage privileges](#StorageRemark).
    * @throws WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def addStorageStateChangeListener(onsuccess: FileSystemStorageSuccessCallback): Double = js.native
  def addStorageStateChangeListener(onsuccess: FileSystemStorageSuccessCallback, onerror: ErrorCallback): Double = js.native
  
  /**
    * Recursively copies directory pointed by _sourcePath_ to _destinationPath_.
    *
    * The method merges content of the directory pointed by _sourcePath_ with content of the directory pointed by _destinationPath_, if exists.
    * If the directory pointed by _destinationPath_ does not exist, it is created.
    *
    * Successful directory copying invokes _successCallback_ function, if specified. In case of failure _errorCallback_ function is invoked, if specified.
    *
    * The _ErrorCallback_ is launched with these error types:
    *
    * *   IOError, if a directory with conflicting name already exists and _overwrite_ is equal to false or any of the input/output error occurs.
    * *   NotFoundError, if the _sourcePath_ does not point to an existing directory.
    *
    *
    * @since 5.0
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/filesystem.read
    * @privilegeName http://tizen.org/privilege/filesystem.write
    *
    * @param sourcePath Path to directory.
    * @param destinationPath Path for copied directory. The path must consist of path to an existing directory concatenated with '/' and the name of destination directory.
    * @param overwrite Flag indicating whether to overwrite existing content. If _overwrite_ is equal to true, the file or directory with conflicting name will be overwritten.
    * Otherwise, _errorCallback_ will be called with _IOError_.
    * By default, _overwrite_ is equal to false.
    * @param successCallback Callback function to be invoked on success.
    * @param errorCallback Callback function to be invoked when an error occurs.
    *
    * @throws WebAPIException with error type InvalidValuesError, if any of the input parameters contains an invalid value. For example, the _sourcePath_ or the _destinationPath_ is invalid.
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method or the application does not have privilege to access the storage. For more information, see [Storage privileges](#StorageRemark).
    * @throws WebAPIException with error type TypeMismatchError, if any of the input parameters is not compatible with the expected type for that parameter.
    */
  def copyDirectory(sourcePath: Path, destinationPath: Path): Unit = js.native
  def copyDirectory(sourcePath: Path, destinationPath: Path, overwrite: Boolean): Unit = js.native
  def copyDirectory(
    sourcePath: Path,
    destinationPath: Path,
    overwrite: Boolean,
    successCallback: Null,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def copyDirectory(
    sourcePath: Path,
    destinationPath: Path,
    overwrite: Boolean,
    successCallback: Unit,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def copyDirectory(sourcePath: Path, destinationPath: Path, overwrite: Boolean, successCallback: PathSuccessCallback): Unit = js.native
  def copyDirectory(
    sourcePath: Path,
    destinationPath: Path,
    overwrite: Boolean,
    successCallback: PathSuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def copyDirectory(
    sourcePath: Path,
    destinationPath: Path,
    overwrite: Unit,
    successCallback: Null,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def copyDirectory(
    sourcePath: Path,
    destinationPath: Path,
    overwrite: Unit,
    successCallback: Unit,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def copyDirectory(sourcePath: Path, destinationPath: Path, overwrite: Unit, successCallback: PathSuccessCallback): Unit = js.native
  def copyDirectory(
    sourcePath: Path,
    destinationPath: Path,
    overwrite: Unit,
    successCallback: PathSuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  
  /**
    * Copies file from location pointed by _sourcePath_ to _destinationPath_.
    *
    * Successful file copying invokes _successCallback_ function, if specified. In case of failure _errorCallback_ function is invoked, if specified.
    *
    * The _ErrorCallback_ is launched with these error types:
    *
    * *   IOError, if any of the input/output error occurs.
    * *   NotFoundError, if the _sourcePath_ does not point to an existing file.
    *
    *
    * @since 5.0
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/filesystem.read
    * @privilegeName http://tizen.org/privilege/filesystem.write
    *
    * @param sourcePath Path to file.
    * @param destinationPath Path for copied file. The path must consist of path to an existing directory concatenated with '/' and the name of new file.
    * @param overwrite Flag indicating whether to overwrite an existing file. If _overwrite_ is set to true and file pointed by _destinationPath_ already exists, the method will overwrite the file.
    * Otherwise, if a file with conflicting name already exists _errorCallback_ is called.
    * By default, _overwrite_ is equal to false.
    * @param successCallback Callback function to be invoked on success.
    * @param errorCallback Callback function to be invoked when an error occurs.
    *
    * @throws WebAPIException with error type InvalidValuesError, if any of the input parameters contains an invalid value. For example, the _sourcePath_ or the _destinationPath_ is invalid.
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method or the application does not have privilege to access the storage. For more information, see [Storage privileges](#StorageRemark).
    * @throws WebAPIException with error type TypeMismatchError, if any of the input parameters is not compatible with the expected type for that parameter.
    */
  def copyFile(sourcePath: Path, destinationPath: Path): Unit = js.native
  def copyFile(sourcePath: Path, destinationPath: Path, overwrite: Boolean): Unit = js.native
  def copyFile(
    sourcePath: Path,
    destinationPath: Path,
    overwrite: Boolean,
    successCallback: Null,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def copyFile(
    sourcePath: Path,
    destinationPath: Path,
    overwrite: Boolean,
    successCallback: Unit,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def copyFile(sourcePath: Path, destinationPath: Path, overwrite: Boolean, successCallback: PathSuccessCallback): Unit = js.native
  def copyFile(
    sourcePath: Path,
    destinationPath: Path,
    overwrite: Boolean,
    successCallback: PathSuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def copyFile(
    sourcePath: Path,
    destinationPath: Path,
    overwrite: Unit,
    successCallback: Null,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def copyFile(
    sourcePath: Path,
    destinationPath: Path,
    overwrite: Unit,
    successCallback: Unit,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def copyFile(sourcePath: Path, destinationPath: Path, overwrite: Unit, successCallback: PathSuccessCallback): Unit = js.native
  def copyFile(
    sourcePath: Path,
    destinationPath: Path,
    overwrite: Unit,
    successCallback: PathSuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  
  /**
    * Creates directory pointed by _path_.
    *
    * Successful directory creation invokes _successCallback_ function, if specified. In case of failure _errorCallback_ function is invoked, if specified.
    *
    * The _ErrorCallback_ is launched with these error types:
    *
    * *   IOError, if any of the input/output error occurs.
    * *   NotFoundError, if directory given in _path_ does not exist and _makeParents_ is set to false.
    *
    *
    * @since 5.0
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/filesystem.write
    *
    * @param path Path to directory to create.
    * @param makeParents Flag indicating whether lacking directories should be created.
    * For instance, if method is invoked with parameter _path_ equal to documents/path/to/dir and
    * there is no directory "path" in "documents" virtual root, directories "path", "to" and "dir" will be created.
    * By default, _makeParents_ is equal to true.
    * @param successCallback Callback function to be invoked on success.
    * @param errorCallback Callback function to be invoked when an error occurs.
    *
    * @throws WebAPIException with error type InvalidValuesError, if the _path_ is invalid.
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method or the application does not have privilege to access the storage. For more information, see [Storage privileges](#StorageRemark).
    * @throws WebAPIException with error type TypeMismatchError, if any of the input parameters is not compatible with the expected type for that parameter.
    */
  def createDirectory(path: Path): Unit = js.native
  def createDirectory(path: Path, makeParents: Boolean): Unit = js.native
  def createDirectory(path: Path, makeParents: Boolean, successCallback: Null, errorCallback: ErrorCallback): Unit = js.native
  def createDirectory(path: Path, makeParents: Boolean, successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
  def createDirectory(path: Path, makeParents: Boolean, successCallback: PathSuccessCallback): Unit = js.native
  def createDirectory(
    path: Path,
    makeParents: Boolean,
    successCallback: PathSuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def createDirectory(path: Path, makeParents: Unit, successCallback: Null, errorCallback: ErrorCallback): Unit = js.native
  def createDirectory(path: Path, makeParents: Unit, successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
  def createDirectory(path: Path, makeParents: Unit, successCallback: PathSuccessCallback): Unit = js.native
  def createDirectory(path: Path, makeParents: Unit, successCallback: PathSuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Deletes directory or directory tree under the current directory pointed by _path_.
    *
    * Successful directory deletion invokes _successCallback_ function, if specified. In case of failure _errorCallback_ function is invoked, if specified.
    *
    * The _ErrorCallback_ is launched with these error types:
    *
    * *   IOError, if a directory is not empty and _recursive_ is equal to false.
    * *   NotFoundError, if the _path_ does not point to an existing directory.
    *
    *
    * @since 5.0
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/filesystem.write
    *
    * @param path A path to directory.
    * @param recursive Flag indicating whether the deletion is recursive or not. If _recursive_ is set to true the method will delete content of a given directory recursively.
    * Otherwise, the method succeeds only if the directory is empty, on other cases _errorCallback_ is called.
    * By default, _recursive_ is equal to true.
    * @param successCallback Callback function to be invoked on success.
    * @param errorCallback Callback function to be invoked when an error occurs.
    *
    * @throws WebAPIException with error type InvalidValuesError, if the _path_ is invalid.
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method or the application does not have privilege to access the storage. For more information, see [Storage privileges](#StorageRemark).
    * @throws WebAPIException with error type TypeMismatchError, if any of the input parameters is not compatible with the expected type for that parameter.
    */
  def deleteDirectory(path: Path): Unit = js.native
  def deleteDirectory(path: Path, recursive: Boolean): Unit = js.native
  def deleteDirectory(path: Path, recursive: Boolean, successCallback: Null, errorCallback: ErrorCallback): Unit = js.native
  def deleteDirectory(path: Path, recursive: Boolean, successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
  def deleteDirectory(path: Path, recursive: Boolean, successCallback: PathSuccessCallback): Unit = js.native
  def deleteDirectory(path: Path, recursive: Boolean, successCallback: PathSuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  def deleteDirectory(path: Path, recursive: Unit, successCallback: Null, errorCallback: ErrorCallback): Unit = js.native
  def deleteDirectory(path: Path, recursive: Unit, successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
  def deleteDirectory(path: Path, recursive: Unit, successCallback: PathSuccessCallback): Unit = js.native
  def deleteDirectory(path: Path, recursive: Unit, successCallback: PathSuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Deletes file pointed by _path_.
    *
    * Successful file deletion invokes _successCallback_ function, if specified. In case of failure _errorCallback_ function is invoked, if specified.
    *
    * The _ErrorCallback_ is launched with these error types:
    *
    * *   IOError, if any of the input/output error occurs.
    * *   NotFoundError, if the _path_ does not point to an existing file.
    *
    *
    * @since 5.0
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/filesystem.write
    *
    * @param path Path to file.
    * @param successCallback Callback function to be invoked on success.
    * @param errorCallback Callback function to be invoked when an error occurs.
    *
    * @throws WebAPIException with error type InvalidValuesError, if the _path_ is invalid.
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method or the application does not have privilege to access the storage. For more information, see [Storage privileges](#StorageRemark).
    * @throws WebAPIException with error type TypeMismatchError, if any of the input parameters is not compatible with the expected type for that parameter.
    */
  def deleteFile(path: Path): Unit = js.native
  def deleteFile(path: Path, successCallback: Null, errorCallback: ErrorCallback): Unit = js.native
  def deleteFile(path: Path, successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
  def deleteFile(path: Path, successCallback: PathSuccessCallback): Unit = js.native
  def deleteFile(path: Path, successCallback: PathSuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Returns path to directory for given _path_.
    *
    * Strips trailing '/', then breaks _path_ into two components by last _path_ separator, returns first component.
    *
    * @since 5.0
    *
    * @remark This function does not check if _path_ is valid or exists in filesystem.
    *
    * @param path Path to file or directory.
    *
    * @returns Path to directory for given path.
    */
  def getDirName(path: String): String = js.native
  
  /**
    * Gets information about a storage based on its label.
    * For example: "MyThumbDrive", "InternalFlash".
    *
    * The _onsuccess_ method receives the data structure as an input argument containing additional information about the drive.
    *
    * The ErrorCallback is launched with these error types:
    *
    * *   InvalidValuesError - If any of the input parameters contains an invalid value.
    * *   NotFoundError - If no drive was found with the given label.
    * *   UnknownError - If any other error occurs.
    *
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/filesystem.read
    *
    * @param label Storage label.
    * @param onsuccess Callback method to be invoked when the list of storages is available, passing the storage list to the callback.
    * @param onerror Callback method to be invoked when an error occurs.
    *
    * @throws WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method. For more information, see [Storage privileges](#StorageRemark).
    */
  def getStorage(label: String, onsuccess: FileSystemStorageSuccessCallback): Unit = js.native
  def getStorage(label: String, onsuccess: FileSystemStorageSuccessCallback, onerror: ErrorCallback): Unit = js.native
  
  /**
    * Checks if given _path_ points to a directory.
    *
    * @since 5.0
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/filesystem.read
    *
    * @param path A path to be tested.
    *
    * @returns true if _path_ points to a directory, false otherwise.
    *
    * @throws WebAPIException with error type InvalidValuesError, if the _path_ is invalid.
    * @throws WebAPIException with error type IOError, if any of the input/output error occurs.
    * @throws WebAPIException with error type NotFoundError, if the _path_ does not point to an existing file or directory.
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method or the application does not have privilege to access the storage. For more information, see [Storage privileges](#StorageRemark).
    */
  def isDirectory(path: Path): Boolean = js.native
  
  /**
    * Checks if given _path_ points to a file.
    *
    * @since 5.0
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/filesystem.read
    *
    * @param path A path to be tested.
    *
    * @returns true if _path_ points to a file, false otherwise.
    *
    * @throws WebAPIException with error type InvalidValuesError, if the _path_ is invalid.
    * @throws WebAPIException with error type IOError, if any of the input/output error occurs.
    * @throws WebAPIException with error type NotFoundError, if the _path_ does not point to an existing file or directory.
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method or the application does not have privilege to access the storage. For more information, see [Storage privileges](#StorageRemark).
    */
  def isFile(path: Path): Boolean = js.native
  
  /**
    * Lists directory content located in _path_.
    *
    * Successful listing of directory content invokes _successCallback_ function, if specified. In case of failure _errorCallback_ function is invoked, if specified.
    *
    * If the filter is passed and contains valid values, only those directories or files in the directory that match the filter criteria specified in the _FileFilter_ interface are returned in successCallback method.
    * If the filter is null or undefined the implementation must return the full list of files in the directory.
    *
    * If the directory does not contain any files or directories, or the filter criteria do not match with any files or directories, the _successCallback_ is invoked with an empty array.
    *
    * The _ErrorCallback_ is launched with these error types:
    *
    * *   IOError, if any of the input/output error occurs.
    * *   NotFoundError, if the _path_ does not point to an existing directory.
    *
    *
    * @since 5.0
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/filesystem.read
    *
    * @param path A path to directory.
    * @param successCallback Callback function to be invoked on success.
    * @param errorCallback Callback function to be invoked when an error occurs.
    * @param filter Filter to restrict the listed files.
    *
    * @throws WebAPIException with error type InvalidValuesError, if any of the input parameters contains an invalid value. For example, the _path_ is invalid.
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method or the application does not have privilege to access the storage. For more information, see [Storage privileges](#StorageRemark).
    * @throws WebAPIException with error type TypeMismatchError, if any of the input parameters is not compatible with the expected type for that parameter.
    */
  def listDirectory(path: Path, successCallback: ListDirectorySuccessCallback): Unit = js.native
  def listDirectory(path: Path, successCallback: ListDirectorySuccessCallback, errorCallback: Null, filter: FileFilter): Unit = js.native
  def listDirectory(path: Path, successCallback: ListDirectorySuccessCallback, errorCallback: Unit, filter: FileFilter): Unit = js.native
  def listDirectory(path: Path, successCallback: ListDirectorySuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  def listDirectory(
    path: Path,
    successCallback: ListDirectorySuccessCallback,
    errorCallback: ErrorCallback,
    filter: FileFilter
  ): Unit = js.native
  
  /**
    * Lists the available storages (both internal and external) on a device.
    * The onsuccess method receives a list of the data structures as input argument containing additional information about each drive found.
    * It can get storages that would have a label named as "internal0", virtual roots (images, documents, ...), "removable1", "removable2".
    * "removable1" label is used to resolve sdcard and "removable2" label is used to resolve USB host, if supported.
    * The vfat filesystem used to sdcard filesystem widely is not case-sensitive.
    * If you want to handle the file on sdcard, you need to consider case-sensitive filenames are regarded as same name.
    *
    * Labels can differ depending on platform implementation.
    *
    * The ErrorCallback is launched with these error types:
    *
    * *   InvalidValuesError - If any of the input parameters contains an invalid value.
    * *   UnknownError - If any other error occurs.
    *
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/filesystem.read
    *
    * @param onsuccess Callback method to be invoked when a list of storage is available and passing the storage list to the callback.
    * @param onerror Callback method to be invoked when an error occurs.
    *
    * @throws WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method. For more information, see [Storage privileges](#StorageRemark).
    */
  def listStorages(onsuccess: FileSystemStorageArraySuccessCallback): Unit = js.native
  def listStorages(onsuccess: FileSystemStorageArraySuccessCallback, onerror: ErrorCallback): Unit = js.native
  
  /**
    * The maximum file or directory name length for the current platform.
    *
    * @since 5.0
    */
  val maxNameLength: Double = js.native
  
  /**
    * The maximum path length limit for the current platform.
    */
  val maxPathLength: Double = js.native
  
  /**
    * Recursively moves directory pointed by _sourcePath_ to _destinationPath_.
    *
    * The method merges content of the directory pointed by _sourcePath_ with content of the directory with the same name in _destinationPath_, if exists.
    *
    * Successful directory moving invokes _successCallback_ function, if specified. In case of failure _errorCallback_ function is invoked, if specified.
    *
    * The _ErrorCallback_ is launched with these error types:
    *
    * *   IOError, if a directory with conflicting name already exists and _overwrite_ is equal to false or any of the input/output error occurs.
    * *   NotFoundError, if the _sourcePath_ or _destinationPath_ does not point to an existing directory.
    *
    *
    * @since 5.0
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/filesystem.read
    * @privilegeName http://tizen.org/privilege/filesystem.write
    *
    * @param sourcePath A path to directory.
    * @param destinationPath A destination directory path to move the directory to.
    * @param overwrite Flag indicating whether to overwrite existing content. If _overwrite_ is equal to true, the file or directory with conflicting name will be overwritten.
    * Otherwise, _errorCallback_ will be called with _IOError_.
    * By default, _overwrite_ is equal to false.
    * @param successCallback Callback function to be invoked on success.
    * @param errorCallback Callback function to be invoked when an error occurs.
    *
    * @throws WebAPIException with error type InvalidValuesError, if any of the input parameters contains an invalid value. For example, the _sourcePath_ or the _destinationPath_ is invalid.
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method or the application does not have privilege to access the storage. For more information, see [Storage privileges](#StorageRemark).
    * @throws WebAPIException with error type TypeMismatchError, if any of the input parameters is not compatible with the expected type for that parameter.
    */
  def moveDirectory(sourcePath: Path, destinationPath: Path): Unit = js.native
  def moveDirectory(sourcePath: Path, destinationPath: Path, overwrite: Boolean): Unit = js.native
  def moveDirectory(
    sourcePath: Path,
    destinationPath: Path,
    overwrite: Boolean,
    successCallback: Null,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def moveDirectory(
    sourcePath: Path,
    destinationPath: Path,
    overwrite: Boolean,
    successCallback: Unit,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def moveDirectory(sourcePath: Path, destinationPath: Path, overwrite: Boolean, successCallback: PathSuccessCallback): Unit = js.native
  def moveDirectory(
    sourcePath: Path,
    destinationPath: Path,
    overwrite: Boolean,
    successCallback: PathSuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def moveDirectory(
    sourcePath: Path,
    destinationPath: Path,
    overwrite: Unit,
    successCallback: Null,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def moveDirectory(
    sourcePath: Path,
    destinationPath: Path,
    overwrite: Unit,
    successCallback: Unit,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def moveDirectory(sourcePath: Path, destinationPath: Path, overwrite: Unit, successCallback: PathSuccessCallback): Unit = js.native
  def moveDirectory(
    sourcePath: Path,
    destinationPath: Path,
    overwrite: Unit,
    successCallback: PathSuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  
  /**
    * Moves file pointed by _sourcePath_ to _destinationPath_.
    *
    * Successful file moving invokes _successCallback_ function, if specified. In case of failure _errorCallback_ function is invoked, if specified.
    *
    * The _ErrorCallback_ is launched with these error types:
    *
    * *   IOError, if a file with conflicting name already exists and _overwrite_ is equal to false or any of the input/output error occurs.
    * *   NotFoundError, if the _sourcePath_ or _destinationPath_ does not point to an existing file or directory.
    *
    *
    * @since 5.0
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/filesystem.read
    * @privilegeName http://tizen.org/privilege/filesystem.write
    *
    * @param sourcePath Path to file.
    * @param destinationPath A destination directory path to move the file to.
    * @param overwrite Flag indicating whether to overwrite an existing file. If _overwrite_ is set to true and file with the same name in _destinationPath_ already exists, the method will overwrite the file.
    * Otherwise, if a file with conflicting name already exists _errorCallback_ is called.
    * By default, _overwrite_ is equal to false.
    * @param successCallback Callback function to be invoked on success.
    * @param errorCallback Callback function to be invoked when an error occurs.
    *
    * @throws WebAPIException with error type InvalidValuesError, if any of the input parameters contains an invalid value. For example, the _sourcePath_ or the _destinationPath_ is invalid.
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method or the application does not have privilege to access the storage. For more information, see [Storage privileges](#StorageRemark).
    * @throws WebAPIException with error type TypeMismatchError, if any of the input parameters is not compatible with the expected type for that parameter.
    */
  def moveFile(sourcePath: Path, destinationPath: Path): Unit = js.native
  def moveFile(sourcePath: Path, destinationPath: Path, overwrite: Boolean): Unit = js.native
  def moveFile(
    sourcePath: Path,
    destinationPath: Path,
    overwrite: Boolean,
    successCallback: Null,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def moveFile(
    sourcePath: Path,
    destinationPath: Path,
    overwrite: Boolean,
    successCallback: Unit,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def moveFile(sourcePath: Path, destinationPath: Path, overwrite: Boolean, successCallback: PathSuccessCallback): Unit = js.native
  def moveFile(
    sourcePath: Path,
    destinationPath: Path,
    overwrite: Boolean,
    successCallback: PathSuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def moveFile(
    sourcePath: Path,
    destinationPath: Path,
    overwrite: Unit,
    successCallback: Null,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def moveFile(
    sourcePath: Path,
    destinationPath: Path,
    overwrite: Unit,
    successCallback: Unit,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def moveFile(sourcePath: Path, destinationPath: Path, overwrite: Unit, successCallback: PathSuccessCallback): Unit = js.native
  def moveFile(
    sourcePath: Path,
    destinationPath: Path,
    overwrite: Unit,
    successCallback: PathSuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  
  /**
    * Opens a file or creates a file pointed by _path_.
    *
    * If the operation succeeds, a file handle to the newly created or opened file is returned, otherwise an exception is thrown.
    *
    * Following file open modes are supported:
    *
    * *   a - append mode. File position indicator is always set to the first position after the last character of the file and cannot be modified with seek operations. Write operations always append content to the end of the file. Original file content are not modified. Read operations cannot be performed. If the file does not exist, it is created.
    * *   r - read mode. File position indicator is initially set to the beginning of the file and may be changed with seek operations. Write operations cannot be performed. Original file content may be read in this mode. If the file does not exist, NotFoundError is thrown.
    * *   rw - read and write mode. File position indicator is initially set to the beginning of the file and may be changed with seek operations. Original file content may be read or modified in this mode. If the file does not exist, NotFoundError will be thrown.
    * *   rwo - read and write mode, overwriting existing file content. File position indicator is initially set to the beginning of the file. Read and write operations may be performed. Original file content are deleted before opening the file. If the file does not exist, it is created.
    * *   w - write mode. File position indicator is initially set to the beginning of the file and may be changed with seek operations. Read operations cannot be performed. Original file content are deleted before opening the file. If the file does not exist, it is created.
    *
    *
    * @since 5.0
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/filesystem.read
    * @privilegeName http://tizen.org/privilege/filesystem.write
    *
    * @remark Write permission is needed, when file is opened in modes: a, rw, rwo and w. Read permission is needed, when file is opened in modes: r, rw and rwo.
    *
    * @param path Path to the file.
    * @param openMode Mode in which the file is to be opened.
    * @param makeParents Flag indicating whether lacking directories should be created.
    * For instance, if method is invoked with parameter _path_ equal to documents/path/to/dir/file.ext and
    * there is no directory "path" in "documents" virtual root, directories "path", "to" and "dir" will be created, as well as the new file "file.ext".
    * By default, _makeParents_ is equal to true. Its value is ignored, when _openMode_ is r or rw.
    *
    * @returns Object representing open file.
    *
    * @throws WebAPIException with error type IOError, if a file is not available for open or any other IO error occurs.
    * @throws WebAPIException with error type NotFoundError, if the _path_ does not point to an existing file.
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method or the application does not have privilege to access the storage. For more information, see [Storage privileges](#StorageRemark).
    * @throws WebAPIException with error type TypeMismatchError, if any of the input parameters is not compatible with the expected type for that parameter.
    */
  def openFile(path: Path, openMode: FileMode): FileHandle = js.native
  def openFile(path: Path, openMode: FileMode, makeParents: Boolean): FileHandle = js.native
  
  /**
    * Checks if given _path_ exists.
    *
    * @since 5.0
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/filesystem.read
    *
    * @param path A path to be tested.
    *
    * @returns true if _path_ points to a existing element, false otherwise.
    *
    * @throws WebAPIException with error type InvalidValuesError, if the _path_ is invalid.
    * @throws WebAPIException with error type IOError, if input/output error occurs.
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method or the application does not have privilege to access the storage. For more information, see [Storage privileges](#StorageRemark).
    */
  def pathExists(path: Path): Boolean = js.native
  
  /**
    * Removes a listener to unsubscribe from a storage watch operation.
    *
    * If the _watchId_ argument is valid and corresponds to a subscription already in place, the watch process will be stopped and no further callbacks will be invoked.
    * Otherwise, the method call has no effect.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/filesystem.write
    *
    * @param watchId Subscription identifier.
    *
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method. For more information, see [Storage privileges](#StorageRemark).
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def removeStorageStateChangeListener(watchId: Double): Unit = js.native
  
  /**
    * Renames file or directory located in _path_ to name _newName_.
    *
    * Successful renaming invokes _successCallback_ function, if specified. In case of failure _errorCallback_ function is invoked, if specified.
    *
    * The _ErrorCallback_ is launched with these error types:
    *
    * *   IOError, if a file or a directory with conflicting name already exists or any of the input/output error occurs.
    * *   NotFoundError, if the _path_ does not point to an existing file or directory.
    *
    *
    * @since 5.0
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/filesystem.write
    *
    * @param path A path to directory or file.
    * @param newName A new name of directory or file.
    * @param successCallback Callback function to be invoked on success.
    * @param errorCallback Callback function to be invoked when an error occurs.
    *
    * @throws WebAPIException with error type InvalidValuesError, if the _path_ or _newName_ is invalid.
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method or the application does not have privilege to access the storage. For more information, see [Storage privileges](#StorageRemark).
    * @throws WebAPIException with error type TypeMismatchError, if any of the input parameters is not compatible with the expected type for that parameter.
    */
  def rename(path: Path, newName: String): Unit = js.native
  def rename(path: Path, newName: String, successCallback: Null, errorCallback: ErrorCallback): Unit = js.native
  def rename(path: Path, newName: String, successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
  def rename(path: Path, newName: String, successCallback: PathSuccessCallback): Unit = js.native
  def rename(path: Path, newName: String, successCallback: PathSuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Resolves a location to a file handle after validating it.
    *
    * A _location_ can contain a virtual path like "documents/some\_file.txt"
    * or a file URI like "file:///my\_strange\_path/some\_file.png".
    * A _location_ is not allowed to contain the "." or ".." directory entries inside its value.
    *
    * The list of root locations that must be supported by a compliant implementation are:
    *
    * *   documents - The default folder in which text documents (such as pdf, doc...) are stored by default in a device. For example, in some platforms it corresponds to the "My Documents" folder.
    * *   images - The default folder in which still images, like pictures (in formats including jpg, gif, png, etc.), are stored in the device by default. For example, in some platforms it corresponds to the "My Images" folder.
    * *   music - The default folder in which sound clips (in formats including mp3, aac, etc.) are stored in the device by default. For example, in some platforms it corresponds to the "My Music" folder.
    * *   videos - The default folder in which video clips (in formats including avi, mp4, etc.) are stored in the device by default. For example, in some platforms it corresponds to the "My Videos" folder.
    * *   downloads - The default folder in which downloaded files (from sources including browser, e-mail client, etc.) are stored by default in the device. For example, in some platforms it corresponds to the "Downloads" folder.
    * *   ringtones - The default folder in which ringtones (such as mp3, etc.) are stored in the device.
    * *   camera - The default folder in which pictures and videos taken by a device are stored.
    * *   wgt-package - The read-only folder to which the content of a widget file is extracted.
    * *   wgt-private - The private folder in which a widget stores its information. This folder must be accessible only to the same widget and other widgets or applications must not be able to access the stored information.
    * *   wgt-private-tmp - Temporary, the private folder in which a widget can store data that is available during a widget execution cycle. Content of this folder can be removed from this directory when the widget is closed or the Web Runtime is restarted. This folder must be accessible only to the same widget and other widgets or applications must not be able to access it.
    *
    *
    * The _mode_ parameter specifies whether the resulting _File_ object has read-only access (r access), read and write access (rw access), append access (a access), or write access (w access) to the root location containing directory tree.
    * Permission for the requested access is obtained from the security framework. Once the resulting _File_ object has access, access is inherited by any other _File_ objects that are derived from this instance without any further reference to the security framework, as noted in descriptions of certain methods of _File_.
    *
    * The ErrorCallback is launched with these error types:
    *
    * *   InvalidValuesError - If any of the input parameters contains an invalid value.
    * For example, the mode is w for the read-only virtual roots (wgt-package and ringtones).
    * *   NotFoundError - If the location input argument does not correspond to a valid location.
    * *   UnknownError - If any other error occurs.
    *
    *
    * @note _deprecated_ 5.0 Since 5.0
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/filesystem.read
    *
    * @remark camera location is supported since Tizen 2.3. If a device does not support camera, NotSupportedError will be thrown.
    *
    * @param location Location to resolve that can be a virtual path or file URI.
    * @param onsuccess Callback method to be invoked when the location has been successfully resolved, passing the newly created _File_ object.
    * @param onerror Callback method to be invoked when an error has occurred.
    * @param mode Optional value to indicate the file access mode on all files and directories that can be reached from the _File_ object passed to onsuccess.
    * Default value of this parameter is rw if absent or null.
    *
    * @throws WebAPIException with error type NotSupportedError, if this feature is not supported (e.g. in the case of "camera" virtual path if the device does not support camera), or if mode has been set to "rwo", which was introduced in tizen version 5.0
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method or the application does not have privilege to access the storage. For more information, see [Storage privileges](#StorageRemark).
    * @throws WebAPIException with error type TypeMismatchError, if any of the input parameters is not compatible with the expected type for that parameter.
    */
  def resolve(location: String, onsuccess: FileSuccessCallback): Unit = js.native
  def resolve(location: String, onsuccess: FileSuccessCallback, onerror: Null, mode: FileMode): Unit = js.native
  def resolve(location: String, onsuccess: FileSuccessCallback, onerror: Unit, mode: FileMode): Unit = js.native
  def resolve(location: String, onsuccess: FileSuccessCallback, onerror: ErrorCallback): Unit = js.native
  def resolve(location: String, onsuccess: FileSuccessCallback, onerror: ErrorCallback, mode: FileMode): Unit = js.native
  
  /**
    * Converts _path_ to file URI.
    *
    * @since 5.0
    *
    * @remark The function does not check if _path_ exists in filesystem.
    *
    * @param path A path to a file or a directory.
    *
    * @returns [File URI](https://tools.ietf.org/html/rfc8089) for given path.
    *
    * @throws WebAPIException with error type InvalidValuesError, if the _path_ is invalid.
    */
  def toURI(path: Path): String = js.native
}
