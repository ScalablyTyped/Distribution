package typings.titanium.global.Titanium

import typings.titanium.RequestStorageAccessResult
import typings.titanium.Titanium.Event
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object Filesystem {
  
  @JSGlobal("Titanium.Filesystem")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Object representing a path to a file or directory in the device's persistent storage.
    */
  @JSGlobal("Titanium.Filesystem.File")
  @js.native
  class File ()
    extends typings.titanium.Titanium.Filesystem.File
  
  /**
    * Wrapper around `Titanium.Filesystem.File` that implements the `Titanium.IOStream` interface
    */
  @JSGlobal("Titanium.Filesystem.FileStream")
  @js.native
  class FileStream ()
    extends typings.titanium.Titanium.Filesystem.FileStream
  
  /**
    * Constant used to set protection key to NSFileProtectionComplete in file attributes.
    */
  @JSGlobal("Titanium.Filesystem.IOS_FILE_PROTECTION_COMPLETE")
  @js.native
  val IOS_FILE_PROTECTION_COMPLETE: String = js.native
  
  /**
    * Constant used to set protection key to NSFileProtectionCompleteUnlessOpen in file attributes.
    */
  @JSGlobal("Titanium.Filesystem.IOS_FILE_PROTECTION_COMPLETE_UNLESS_OPEN")
  @js.native
  val IOS_FILE_PROTECTION_COMPLETE_UNLESS_OPEN: String = js.native
  
  /**
    * Constant used to set protection key to NSFileProtectionCompleteUntilFirstUserAuthentication in file attributes.
    */
  @JSGlobal("Titanium.Filesystem.IOS_FILE_PROTECTION_COMPLETE_UNTIL_FIRST_USER_AUTHENTICATION")
  @js.native
  val IOS_FILE_PROTECTION_COMPLETE_UNTIL_FIRST_USER_AUTHENTICATION: String = js.native
  
  /**
    * Constant used to set protection key to NSFileProtectionNone in file attributes.
    */
  @JSGlobal("Titanium.Filesystem.IOS_FILE_PROTECTION_NONE")
  @js.native
  val IOS_FILE_PROTECTION_NONE: String = js.native
  
  /**
    * Constant for append mode for file operations.
    */
  @JSGlobal("Titanium.Filesystem.MODE_APPEND")
  @js.native
  val MODE_APPEND: Double = js.native
  
  /**
    * Constant for read mode for file operations.
    */
  @JSGlobal("Titanium.Filesystem.MODE_READ")
  @js.native
  val MODE_READ: Double = js.native
  
  /**
    * Constant for write mode for file operations.
    */
  @JSGlobal("Titanium.Filesystem.MODE_WRITE")
  @js.native
  val MODE_WRITE: Double = js.native
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.addEventListener")
  @js.native
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  
  /**
    * The name of the API that this proxy corresponds to.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.apiName")
  @js.native
  val apiName: String = js.native
  
  /**
    * Path to the application's internal cache directory.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.applicationCacheDirectory")
  @js.native
  val applicationCacheDirectory: String = js.native
  
  /**
    * Path to the application's data directory.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.applicationDataDirectory")
  @js.native
  val applicationDataDirectory: String = js.native
  
  /**
    * Path to the iOS application directory.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.applicationDirectory")
  @js.native
  val applicationDirectory: String = js.native
  
  /**
    * Path to the application support directory.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.applicationSupportDirectory")
  @js.native
  val applicationSupportDirectory: String = js.native
  
  /**
    * Applies the properties to the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.applyProperties")
  @js.native
  def applyProperties(props: js.Any): Unit = js.native
  
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.bubbleParent")
  @js.native
  def bubbleParent: Boolean = js.native
  @scala.inline
  def bubbleParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bubbleParent")(x.asInstanceOf[js.Any])
  
  /**
    * Creates a temporary directory and returns a [File](Titanium.Filesystem.File) object representing the new directory.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.createTempDirectory")
  @js.native
  def createTempDirectory(): typings.titanium.Titanium.Filesystem.File = js.native
  
  /**
    * Creates a temporary file and returns a [File](Titanium.Filesystem.File) object representing the new file.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.createTempFile")
  @js.native
  def createTempFile(): typings.titanium.Titanium.Filesystem.File = js.native
  
  /**
    * Returns the path to the container directory associated with the specified security application group ID.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.directoryForSuite")
  @js.native
  def directoryForSuite(suiteName: String): String = js.native
  
  /**
    * Path to a directory on removable storage, such as SD card.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.externalStorageDirectory")
  @js.native
  val externalStorageDirectory: String = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.fireEvent")
  @js.native
  def fireEvent(name: String): Unit = js.native
  @JSGlobal("Titanium.Filesystem.fireEvent")
  @js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.Filesystem.apiName> property.
    * @deprecated Access <Titanium.Filesystem.apiName> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.getApiName")
  @js.native
  def getApiName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Filesystem.applicationCacheDirectory> property.
    * @deprecated Access <Titanium.Filesystem.applicationCacheDirectory> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.getApplicationCacheDirectory")
  @js.native
  def getApplicationCacheDirectory(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Filesystem.applicationDataDirectory> property.
    * @deprecated Access <Titanium.Filesystem.applicationDataDirectory> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.getApplicationDataDirectory")
  @js.native
  def getApplicationDataDirectory(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Filesystem.applicationDirectory> property.
    * @deprecated Access <Titanium.Filesystem.applicationDirectory> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.getApplicationDirectory")
  @js.native
  def getApplicationDirectory(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Filesystem.applicationSupportDirectory> property.
    * @deprecated Access <Titanium.Filesystem.applicationSupportDirectory> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.getApplicationSupportDirectory")
  @js.native
  def getApplicationSupportDirectory(): String = js.native
  
  /**
    * Returns a `Blob` object representing the asset catalog image identified by the path arguments.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.getAsset")
  @js.native
  def getAsset(path: String*): typings.titanium.Titanium.Blob = js.native
  
  /**
    * Gets the value of the <Titanium.Filesystem.bubbleParent> property.
    * @deprecated Access <Titanium.Filesystem.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.getBubbleParent")
  @js.native
  def getBubbleParent(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Filesystem.externalStorageDirectory> property.
    * @deprecated Access <Titanium.Filesystem.externalStorageDirectory> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.getExternalStorageDirectory")
  @js.native
  def getExternalStorageDirectory(): String = js.native
  
  /**
    * Returns a `File` object representing the file identified by the path arguments.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.getFile")
  @js.native
  def getFile(path: String*): typings.titanium.Titanium.Filesystem.File = js.native
  /**
    * Returns a `File` object representing the file identified by the path arguments.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.getFile")
  @js.native
  def getFile(path: js.Array[String]): typings.titanium.Titanium.Filesystem.File = js.native
  
  /**
    * Gets the value of the <Titanium.Filesystem.lifecycleContainer> property.
    * @deprecated Access <Titanium.Filesystem.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.getLifecycleContainer")
  @js.native
  def getLifecycleContainer(): Window | TabGroup = js.native
  
  /**
    * Gets the value of the <Titanium.Filesystem.lineEnding> property.
    * @deprecated Access <Titanium.Filesystem.lineEnding> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.getLineEnding")
  @js.native
  def getLineEnding(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Filesystem.resRawDirectory> property.
    * @deprecated Access <Titanium.Filesystem.resRawDirectory> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.getResRawDirectory")
  @js.native
  def getResRawDirectory(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Filesystem.resourcesDirectory> property.
    * @deprecated Access <Titanium.Filesystem.resourcesDirectory> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.getResourcesDirectory")
  @js.native
  def getResourcesDirectory(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Filesystem.separator> property.
    * @deprecated Access <Titanium.Filesystem.separator> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.getSeparator")
  @js.native
  def getSeparator(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Filesystem.tempDirectory> property.
    * @deprecated Access <Titanium.Filesystem.tempDirectory> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.getTempDirectory")
  @js.native
  def getTempDirectory(): String = js.native
  
  /**
    * Returns `true` if the app has storage permissions.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.hasStoragePermissions")
  @js.native
  def hasStoragePermissions(): Boolean = js.native
  
  /**
    * Returns `true` if the device supports external storage *and* the external storage device is mounted.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.isExternalStoragePresent")
  @js.native
  def isExternalStoragePresent(): Boolean = js.native
  
  /**
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.lifecycleContainer")
  @js.native
  def lifecycleContainer: Window | TabGroup = js.native
  @scala.inline
  def lifecycleContainer_=(x: Window | TabGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lifecycleContainer")(x.asInstanceOf[js.Any])
  
  /**
    * Platform-specific line ending constant.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.lineEnding")
  @js.native
  val lineEnding: String = js.native
  
  /**
    * Opens file using the <Titanium.IOStream> interface.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.openStream")
  @js.native
  def openStream(mode: Double, path: String): typings.titanium.Titanium.Filesystem.FileStream = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.removeEventListener")
  @js.native
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  
  /**
    * Requests for storage permissions
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.requestStoragePermissions")
  @js.native
  def requestStoragePermissions(callback: js.Function1[/* param0 */ RequestStorageAccessResult, Unit]): Unit = js.native
  
  /**
    * Path to the application's raw resource directory.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.resRawDirectory")
  @js.native
  val resRawDirectory: String = js.native
  
  /**
    * Path to the application's resource directory.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.resourcesDirectory")
  @js.native
  val resourcesDirectory: String = js.native
  
  /**
    * Platform-specific path separator constant.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.separator")
  @js.native
  val separator: String = js.native
  
  /**
    * Sets the value of the <Titanium.Filesystem.bubbleParent> property.
    * @deprecated Set the value using <Titanium.Filesystem.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.setBubbleParent")
  @js.native
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  
  @JSGlobal("Titanium.Filesystem.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
    * Sets the value of the <Titanium.Filesystem.lifecycleContainer> property.
    * @deprecated Set the value using <Titanium.Filesystem.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  
  /**
    * Path for the application's temporary directory.
    */
  /* static member */
  @JSGlobal("Titanium.Filesystem.tempDirectory")
  @js.native
  val tempDirectory: String = js.native
}
