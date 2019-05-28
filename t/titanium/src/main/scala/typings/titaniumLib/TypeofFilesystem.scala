package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofFilesystem extends js.Object {
  /**
  		 * Constant used to set protection key to NSFileProtectionComplete in file attributes.
  		 */
  val IOS_FILE_PROTECTION_COMPLETE: java.lang.String = js.native
  /**
  		 * Constant used to set protection key to NSFileProtectionCompleteUnlessOpen in file attributes.
  		 */
  val IOS_FILE_PROTECTION_COMPLETE_UNLESS_OPEN: java.lang.String = js.native
  /**
  		 * Constant used to set protection key to NSFileProtectionCompleteUntilFirstUserAuthentication in file attributes.
  		 */
  val IOS_FILE_PROTECTION_COMPLETE_UNTIL_FIRST_USER_AUTHENTICATION: java.lang.String = js.native
  /**
  		 * Constant used to set protection key to NSFileProtectionNone in file attributes.
  		 */
  val IOS_FILE_PROTECTION_NONE: java.lang.String = js.native
  /**
  		 * Constant for append mode for file operations.
  		 */
  val MODE_APPEND: scala.Double = js.native
  /**
  		 * Constant for read mode for file operations.
  		 */
  val MODE_READ: scala.Double = js.native
  /**
  		 * Constant for write mode for file operations.
  		 */
  val MODE_WRITE: scala.Double = js.native
  /**
  		 * The name of the API that this proxy corresponds to.
  		 */
  val apiName: java.lang.String = js.native
  /**
  		 * Path to the application's internal cache directory.
  		 */
  val applicationCacheDirectory: java.lang.String = js.native
  /**
  		 * Path to the application's data directory.
  		 */
  val applicationDataDirectory: java.lang.String = js.native
  /**
  		 * Path to the iOS application directory.
  		 */
  val applicationDirectory: java.lang.String = js.native
  /**
  		 * Path to the application support directory.
  		 */
  val applicationSupportDirectory: java.lang.String = js.native
  /**
  		 * Indicates if the proxy will bubble an event to its parent.
  		 */
  var bubbleParent: scala.Boolean = js.native
  /**
  		 * Path to a directory on removable storage, such as SD card.
  		 */
  val externalStorageDirectory: java.lang.String = js.native
  /**
  		 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  		 */
  var lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  		 * Platform-specific line ending constant.
  		 */
  val lineEnding: java.lang.String = js.native
  /**
  		 * Path to the application's raw resource directory.
  		 */
  val resRawDirectory: java.lang.String = js.native
  /**
  		 * Path to the application's resource directory.
  		 */
  val resourcesDirectory: java.lang.String = js.native
  /**
  		 * Platform-specific path separator constant.
  		 */
  val separator: java.lang.String = js.native
  /**
  		 * Path for the application's temporary directory.
  		 */
  val tempDirectory: java.lang.String = js.native
  /**
  		 * Adds the specified callback as an event listener for the named event.
  		 */
  def addEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  		 * Applies the properties to the proxy.
  		 */
  def applyProperties(props: js.Any): scala.Unit = js.native
  /**
  		 * Creates a temporary directory and returns a [File](Titanium.Filesystem.File) object representing the new directory.
  		 */
  def createTempDirectory(): titaniumLib.TitaniumNs.FilesystemNs.File = js.native
  /**
  		 * Creates a temporary file and returns a [File](Titanium.Filesystem.File) object representing the new file.
  		 */
  def createTempFile(): titaniumLib.TitaniumNs.FilesystemNs.File = js.native
  /**
  		 * Returns the path to the container directory associated with the specified security application group ID.
  		 */
  def directoryForSuite(suiteName: java.lang.String): java.lang.String = js.native
  /**
  		 * Fires a synthesized event to any registered listeners.
  		 */
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.apiName> property.
  		 */
  def getApiName(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.applicationCacheDirectory> property.
  		 */
  def getApplicationCacheDirectory(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.applicationDataDirectory> property.
  		 */
  def getApplicationDataDirectory(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.applicationDirectory> property.
  		 */
  def getApplicationDirectory(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.applicationSupportDirectory> property.
  		 */
  def getApplicationSupportDirectory(): java.lang.String = js.native
  /**
  		 * Returns a `Blob` object representing the asset catalog image identified by the path arguments.
  		 */
  def getAsset(path: java.lang.String): titaniumLib.TitaniumNs.Blob = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.bubbleParent> property.
  		 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.externalStorageDirectory> property.
  		 */
  def getExternalStorageDirectory(): java.lang.String = js.native
  /**
  		 * Returns a `File` object representing the file identified by the path arguments.
  		 */
  def getFile(paths: java.lang.String*): titaniumLib.TitaniumNs.FilesystemNs.File = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.lifecycleContainer> property.
  		 */
  def getLifecycleContainer(): titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.lineEnding> property.
  		 */
  def getLineEnding(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.resRawDirectory> property.
  		 */
  def getResRawDirectory(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.resourcesDirectory> property.
  		 */
  def getResourcesDirectory(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.separator> property.
  		 */
  def getSeparator(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Filesystem.tempDirectory> property.
  		 */
  def getTempDirectory(): java.lang.String = js.native
  /**
  		 * Returns `true` if the app has storage permissions.
  		 */
  def hasStoragePermissions(): scala.Boolean = js.native
  /**
  		 * Returns `true` if the device supports external storage *and* the external storage device is mounted.
  		 */
  def isExternalStoragePresent(): scala.Boolean = js.native
  /**
  		 * Opens file using the <Titanium.IOStream> interface.
  		 */
  def openStream(mode: scala.Double, path: java.lang.String): titaniumLib.TitaniumNs.FilesystemNs.FileStream = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  		 * Requests for storage permissions
  		 */
  def requestStoragePermissions(callback: js.Function1[/* param0 */ RequestStorageAccessResult, _]): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Filesystem.bubbleParent> property.
  		 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Filesystem.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.TabGroup): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Filesystem.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window): scala.Unit = js.native
}

