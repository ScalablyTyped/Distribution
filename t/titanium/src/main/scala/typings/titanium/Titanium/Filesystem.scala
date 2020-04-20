package typings.titanium.Titanium

import typings.std.Date
import typings.titanium.RequestStorageAccessResult
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The top level filesystem module, used to access files and directories on the device.
	 */
@JSGlobal("Titanium.Filesystem")
@js.native
class Filesystem () extends Module

/**
	 * The top level filesystem module, used to access files and directories on the device.
	 */
/* static members */
@JSGlobal("Titanium.Filesystem")
@js.native
object Filesystem extends js.Object {
  /**
  		 * Object representing a path to a file or directory in the device's persistent storage.
  		 */
  @js.native
  class File () extends Proxy {
    /**
    			 * `true` if the file is executable.
    			 */
    val executable: Boolean = js.native
    /**
    			 * Set to `true` if the file is hidden.
    			 */
    var hidden: Boolean = js.native
    /**
    			 * Name of the file.
    			 */
    val name: String = js.native
    /**
    			 * Native path associated with this file object, as a file URL.
    			 */
    val nativePath: String = js.native
    /**
    			 * A `File` object representing the parent directory of the file identified by this object.
    			 */
    val parent: File = js.native
    /**
    			 * `true` if the file identified by this object is read-only.
    			 */
    val readonly: Boolean = js.native
    /**
    			 * Value indicating whether or not to back up to a cloud service.
    			 */
    var remoteBackup: Boolean = js.native
    /**
    			 * Size, in bytes, of the file identified by this object.
    			 */
    val size: Double = js.native
    /**
    			 * `true` if the file identified by this object is a symbolic link.
    			 */
    val symbolicLink: Boolean = js.native
    /**
    			 * `true` if the file identified by this object is writable.
    			 */
    val writable: Boolean = js.native
    /**
    			 * Appends data to the file identified by this file object.
    			 */
    def append(data: String): Boolean = js.native
    def append(data: Blob): Boolean = js.native
    def append(data: File): Boolean = js.native
    /**
    			 * Copies the file identified by this file object to a new path.
    			 */
    def copy(destinationPath: String): Boolean = js.native
    /**
    			 * Creates a directory at the path identified by this file object.
    			 */
    def createDirectory(): Boolean = js.native
    def createDirectory(recursive: Boolean): Boolean = js.native
    /**
    			 * Creates a file at the path identified by this file object.
    			 */
    def createFile(): Boolean = js.native
    /**
    			 * Returns the creation timestamp for the file identified by this file object.
    			 * @deprecated Use [createdAt](Titanium.Filesystem.File.createdAt) instead.
    			 */
    def createTimestamp(): Double = js.native
    /**
    			 * Returns the creation Date for the file identified by this file object.
    			 */
    def createdAt(): Date = js.native
    /**
    			 * Deletes the directory identified by this file object.
    			 */
    def deleteDirectory(): Boolean = js.native
    def deleteDirectory(recursive: Boolean): Boolean = js.native
    /**
    			 * Deletes the file identified by this file object.
    			 */
    def deleteFile(): Boolean = js.native
    /**
    			 * Returns `true` if the file or directory identified by this file object exists on the device.
    			 */
    def exists(): Boolean = js.native
    /**
    			 * Returns the extension for the file identified by this file object.
    			 */
    def extension(): String = js.native
    /**
    			 * Returns a listing of the directory identified by this file object, or `null`
    			 * if this object doesn't identify a directory.
    			 */
    def getDirectoryListing(): js.Array[String] = js.native
    /**
    			 * Gets the value of the <Titanium.Filesystem.File.executable> property.
    			 * @deprecated Access <Titanium.Filesystem.File.executable> instead.
    			 */
    def getExecutable(): Boolean = js.native
    /**
    			 * Gets the value of the <Titanium.Filesystem.File.hidden> property.
    			 * @deprecated Access <Titanium.Filesystem.File.hidden> instead.
    			 */
    def getHidden(): Boolean = js.native
    /**
    			 * Gets the value of the <Titanium.Filesystem.File.name> property.
    			 * @deprecated Access <Titanium.Filesystem.File.name> instead.
    			 */
    def getName(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Filesystem.File.nativePath> property.
    			 * @deprecated Access <Titanium.Filesystem.File.nativePath> instead.
    			 */
    def getNativePath(): String = js.native
    /**
    			 * Returns the path of the parent directory holding the file identified by this
    			 * file object, as a String (deprecated) **or** as a `File` object.
    			 * @deprecated Use the [Titanium.Filesystem.File.parent](Titanium.Filesystem.File.parent) property to receive a `File`
    			 * reference instead. If you wish to receive the path, use the `nativePath`
    			 * property of that reference instead.
    			 *
    			 */
    def getParent(): String | File = js.native
    /**
    			 * Returns the protection key value of this file object.
    			 * Returns `null` if there's an error.
    			 */
    def getProtectionKey(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Filesystem.File.readonly> property.
    			 * @deprecated Access <Titanium.Filesystem.File.readonly> instead.
    			 */
    def getReadonly(): Boolean = js.native
    /**
    			 * Gets the value of the <Titanium.Filesystem.File.remoteBackup> property.
    			 * @deprecated Access <Titanium.Filesystem.File.remoteBackup> instead.
    			 */
    def getRemoteBackup(): Boolean = js.native
    /**
    			 * Gets the value of the <Titanium.Filesystem.File.size> property.
    			 * @deprecated Access <Titanium.Filesystem.File.size> instead.
    			 */
    def getSize(): Double = js.native
    /**
    			 * Gets the value of the <Titanium.Filesystem.File.symbolicLink> property.
    			 * @deprecated Access <Titanium.Filesystem.File.symbolicLink> instead.
    			 */
    def getSymbolicLink(): Boolean = js.native
    /**
    			 * Gets the value of the <Titanium.Filesystem.File.writable> property.
    			 * @deprecated Access <Titanium.Filesystem.File.writable> instead.
    			 */
    def getWritable(): Boolean = js.native
    /**
    			 * Returns `true` if this file object represents a directory.
    			 */
    def isDirectory(): Boolean = js.native
    /**
    			 * Returns `true` if this file object represents an ordinary file.
    			 */
    def isFile(): Boolean = js.native
    /**
    			 * Returns the last modification time for this file.
    			 * @deprecated Use [Titanium.Filesystem.File.modifiedAt](Titanium.Filesystem.File.modifiedAt) instead.
    			 */
    def modificationTimestamp(): Double = js.native
    /**
    			 * Returns the last modification Date for the file identified by this file object.
    			 */
    def modifiedAt(): Date = js.native
    /**
    			 * Moves the file identified by this file object to another path.
    			 */
    def move(newpath: String): Boolean = js.native
    /**
    			 * Opens the file identified by this file object for random access.
    			 */
    def open(mode: Double): FileStream = js.native
    /**
    			 * Returns the contents of the file identified by this file object as a `Blob`.
    			 */
    def read(): Blob = js.native
    /**
    			 * Renames the file identified by this file object.
    			 */
    def rename(newname: String): Boolean = js.native
    /**
    			 * Returns the fully-resolved native path associated with this file object.
    			 */
    def resolve(): String = js.native
    /**
    			 * Sets the value of the <Titanium.Filesystem.File.hidden> property.
    			 * @deprecated Set the value using <Titanium.Filesystem.File.hidden> instead.
    			 */
    def setHidden(hidden: Boolean): Unit = js.native
    /**
    			 * Sets the protection key as an attribute to the file identified by this file object.
    			 */
    def setProtectionKey(fileProtectionType: String): Boolean = js.native
    /**
    			 * Sets the value of the <Titanium.Filesystem.File.remoteBackup> property.
    			 * @deprecated Set the value using <Titanium.Filesystem.File.remoteBackup> instead.
    			 */
    def setRemoteBackup(remoteBackup: Boolean): Unit = js.native
    /**
    			 * Returns the amount of free space available on the device where the file identified by this file object is stored.
    			 */
    def spaceAvailable(): Double = js.native
    /**
    			 * Writes the specified data to the file identified by this file object.
    			 */
    def write(data: String): Boolean = js.native
    def write(data: String, append: Boolean): Boolean = js.native
    def write(data: Blob): Boolean = js.native
    def write(data: Blob, append: Boolean): Boolean = js.native
    def write(data: File): Boolean = js.native
    def write(data: File, append: Boolean): Boolean = js.native
  }
  
  /**
  		 * Wrapper around `Titanium.Filesystem.File` that implements the `Titanium.IOStream` interface
  		 */
  @js.native
  class FileStream () extends IOStream
  
  /**
  		 * Constant used to set protection key to NSFileProtectionComplete in file attributes.
  		 */
  val IOS_FILE_PROTECTION_COMPLETE: String = js.native
  /**
  		 * Constant used to set protection key to NSFileProtectionCompleteUnlessOpen in file attributes.
  		 */
  val IOS_FILE_PROTECTION_COMPLETE_UNLESS_OPEN: String = js.native
  /**
  		 * Constant used to set protection key to NSFileProtectionCompleteUntilFirstUserAuthentication in file attributes.
  		 */
  val IOS_FILE_PROTECTION_COMPLETE_UNTIL_FIRST_USER_AUTHENTICATION: String = js.native
  /**
  		 * Constant used to set protection key to NSFileProtectionNone in file attributes.
  		 */
  val IOS_FILE_PROTECTION_NONE: String = js.native
  /**
  		 * Constant for append mode for file operations.
  		 */
  val MODE_APPEND: Double = js.native
  /**
  		 * Constant for read mode for file operations.
  		 */
  val MODE_READ: Double = js.native
  /**
  		 * Constant for write mode for file operations.
  		 */
  val MODE_WRITE: Double = js.native
  /**
  		 * The name of the API that this proxy corresponds to.
  		 */
  val apiName: String = js.native
  /**
  		 * Path to the application's internal cache directory.
  		 */
  val applicationCacheDirectory: String = js.native
  /**
  		 * Path to the application's data directory.
  		 */
  val applicationDataDirectory: String = js.native
  /**
  		 * Path to the iOS application directory.
  		 */
  val applicationDirectory: String = js.native
  /**
  		 * Path to the application support directory.
  		 */
  val applicationSupportDirectory: String = js.native
  /**
  		 * Indicates if the proxy will bubble an event to its parent.
  		 */
  var bubbleParent: Boolean = js.native
  /**
  		 * Path to a directory on removable storage, such as SD card.
  		 */
  val externalStorageDirectory: String = js.native
  /**
  		 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  		 */
  var lifecycleContainer: Window | TabGroup = js.native
  /**
  		 * Platform-specific line ending constant.
  		 */
  val lineEnding: String = js.native
  /**
  		 * Path to the application's raw resource directory.
  		 */
  val resRawDirectory: String = js.native
  /**
  		 * Path to the application's resource directory.
  		 */
  val resourcesDirectory: String = js.native
  /**
  		 * Platform-specific path separator constant.
  		 */
  val separator: String = js.native
  /**
  		 * Path for the application's temporary directory.
  		 */
  val tempDirectory: String = js.native
  /**
  		 * Adds the specified callback as an event listener for the named event.
  		 */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
  		 * Applies the properties to the proxy.
  		 */
  def applyProperties(props: js.Any): Unit = js.native
  /**
  		 * Creates a temporary directory and returns a [File](Titanium.Filesystem.File) object representing the new directory.
  		 */
  def createTempDirectory(): File = js.native
  /**
  		 * Creates a temporary file and returns a [File](Titanium.Filesystem.File) object representing the new file.
  		 */
  def createTempFile(): File = js.native
  /**
  		 * Returns the path to the container directory associated with the specified security application group ID.
  		 */
  def directoryForSuite(suiteName: String): String = js.native
  /**
  		 * Fires a synthesized event to any registered listeners.
  		 */
  def fireEvent(name: String): Unit = js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.apiName> property.
  		 * @deprecated Access <Titanium.Filesystem.apiName> instead.
  		 */
  def getApiName(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.applicationCacheDirectory> property.
  		 * @deprecated Access <Titanium.Filesystem.applicationCacheDirectory> instead.
  		 */
  def getApplicationCacheDirectory(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.applicationDataDirectory> property.
  		 * @deprecated Access <Titanium.Filesystem.applicationDataDirectory> instead.
  		 */
  def getApplicationDataDirectory(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.applicationDirectory> property.
  		 * @deprecated Access <Titanium.Filesystem.applicationDirectory> instead.
  		 */
  def getApplicationDirectory(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.applicationSupportDirectory> property.
  		 * @deprecated Access <Titanium.Filesystem.applicationSupportDirectory> instead.
  		 */
  def getApplicationSupportDirectory(): String = js.native
  /**
  		 * Returns a `Blob` object representing the asset catalog image identified by the path arguments.
  		 */
  def getAsset(path: String*): Blob = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.bubbleParent> property.
  		 * @deprecated Access <Titanium.Filesystem.bubbleParent> instead.
  		 */
  def getBubbleParent(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.externalStorageDirectory> property.
  		 * @deprecated Access <Titanium.Filesystem.externalStorageDirectory> instead.
  		 */
  def getExternalStorageDirectory(): String = js.native
  /**
  		 * Returns a `File` object representing the file identified by the path arguments.
  		 */
  def getFile(path: String*): File = js.native
  /**
  		 * Returns a `File` object representing the file identified by the path arguments.
  		 */
  def getFile(path: js.Array[String]): File = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.lifecycleContainer> property.
  		 * @deprecated Access <Titanium.Filesystem.lifecycleContainer> instead.
  		 */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.lineEnding> property.
  		 * @deprecated Access <Titanium.Filesystem.lineEnding> instead.
  		 */
  def getLineEnding(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.resRawDirectory> property.
  		 * @deprecated Access <Titanium.Filesystem.resRawDirectory> instead.
  		 */
  def getResRawDirectory(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.resourcesDirectory> property.
  		 * @deprecated Access <Titanium.Filesystem.resourcesDirectory> instead.
  		 */
  def getResourcesDirectory(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.separator> property.
  		 * @deprecated Access <Titanium.Filesystem.separator> instead.
  		 */
  def getSeparator(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.tempDirectory> property.
  		 * @deprecated Access <Titanium.Filesystem.tempDirectory> instead.
  		 */
  def getTempDirectory(): String = js.native
  /**
  		 * Returns `true` if the app has storage permissions.
  		 */
  def hasStoragePermissions(): Boolean = js.native
  /**
  		 * Returns `true` if the device supports external storage *and* the external storage device is mounted.
  		 */
  def isExternalStoragePresent(): Boolean = js.native
  /**
  		 * Opens file using the <Titanium.IOStream> interface.
  		 */
  def openStream(mode: Double, path: String): FileStream = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
  		 * Requests for storage permissions
  		 */
  def requestStoragePermissions(callback: js.Function1[/* param0 */ RequestStorageAccessResult, Unit]): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Filesystem.bubbleParent> property.
  		 * @deprecated Set the value using <Titanium.Filesystem.bubbleParent> instead.
  		 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Filesystem.lifecycleContainer> property.
  		 * @deprecated Set the value using <Titanium.Filesystem.lifecycleContainer> instead.
  		 */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
}

