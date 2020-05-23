package typings.titanium.global.Titanium

import typings.titanium.RequestStorageAccessResult
import typings.titanium.Titanium.Event
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
class Filesystem ()
  extends typings.titanium.Titanium.Proxy

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
  class File ()
    extends typings.titanium.Titanium.Filesystem.File
  
  /**
    * Wrapper around `Titanium.Filesystem.File` that implements the `Titanium.IOStream` interface
    */
  @js.native
  class FileStream ()
    extends typings.titanium.Titanium.Filesystem.FileStream
  
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
  def createTempDirectory(): typings.titanium.Titanium.Filesystem.File = js.native
  /**
    * Creates a temporary file and returns a [File](Titanium.Filesystem.File) object representing the new file.
    */
  def createTempFile(): typings.titanium.Titanium.Filesystem.File = js.native
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
  def getAsset(path: String*): typings.titanium.Titanium.Blob = js.native
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
  def getFile(path: String*): typings.titanium.Titanium.Filesystem.File = js.native
  /**
    * Returns a `File` object representing the file identified by the path arguments.
    */
  def getFile(path: js.Array[String]): typings.titanium.Titanium.Filesystem.File = js.native
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
  def openStream(mode: Double, path: String): typings.titanium.Titanium.Filesystem.FileStream = js.native
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

