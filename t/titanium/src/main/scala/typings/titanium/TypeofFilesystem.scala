package typings.titanium

import typings.titanium.TitaniumNs.Blob
import typings.titanium.TitaniumNs.FilesystemNs.File
import typings.titanium.TitaniumNs.FilesystemNs.FileStream
import typings.titanium.TitaniumNs.UINs.TabGroup
import typings.titanium.TitaniumNs.UINs.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofFilesystem extends js.Object {
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
  def addEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
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
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.apiName> property.
  		 */
  def getApiName(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.applicationCacheDirectory> property.
  		 */
  def getApplicationCacheDirectory(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.applicationDataDirectory> property.
  		 */
  def getApplicationDataDirectory(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.applicationDirectory> property.
  		 */
  def getApplicationDirectory(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.applicationSupportDirectory> property.
  		 */
  def getApplicationSupportDirectory(): String = js.native
  /**
  		 * Returns a `Blob` object representing the asset catalog image identified by the path arguments.
  		 */
  def getAsset(path: String): Blob = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.bubbleParent> property.
  		 */
  def getBubbleParent(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.externalStorageDirectory> property.
  		 */
  def getExternalStorageDirectory(): String = js.native
  /**
  		 * Returns a `File` object representing the file identified by the path arguments.
  		 */
  def getFile(paths: String*): File = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.lifecycleContainer> property.
  		 */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.lineEnding> property.
  		 */
  def getLineEnding(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.resRawDirectory> property.
  		 */
  def getResRawDirectory(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.resourcesDirectory> property.
  		 */
  def getResourcesDirectory(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.separator> property.
  		 */
  def getSeparator(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.tempDirectory> property.
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
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  		 * Requests for storage permissions
  		 */
  def requestStoragePermissions(callback: js.Function1[/* param0 */ RequestStorageAccessResult, _]): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Filesystem.bubbleParent> property.
  		 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Filesystem.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Filesystem.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
}

