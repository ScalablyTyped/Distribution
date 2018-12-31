package typings
package winrtDashUwpLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the application data store. Application data consists of files and settings that are either local, roaming, or temporary. */
@JSGlobal("Windows.Storage.ApplicationData")
@js.native
abstract class ApplicationData () extends js.Object {
  /** Gets the folder in the local app data store where you can save files that are not included in backup and restore. */
  var localCacheFolder: StorageFolder = js.native
  /** Gets the root folder in the local app data store. */
  var localFolder: StorageFolder = js.native
  /** Gets the application settings container in the local app data store. */
  var localSettings: ApplicationDataContainer = js.native
  /** Occurs when roaming application data is synchronized. */
  @JSName("ondatachanged")
  var ondatachanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ApplicationData, _] = js.native
  /** Gets the root folder in the roaming app data store. */
  var roamingFolder: StorageFolder = js.native
  /** Gets the application settings container in the roaming app data store. */
  var roamingSettings: ApplicationDataContainer = js.native
  /** Gets the maximum size of the data that can be synchronized to the cloud from the roaming app data store. */
  var roamingStorageQuota: scala.Double = js.native
  /** Gets the root folder in the shared app data store. */
  var sharedLocalFolder: StorageFolder = js.native
  /** Gets the root folder in the temporary app data store. */
  var temporaryFolder: StorageFolder = js.native
  /** Gets the version number of the application data in the app data store. */
  var version: scala.Double = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_datachanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.datachanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ApplicationData, _]
  ): scala.Unit = js.native
  /**
    * Removes all application data from the local, roaming, and temporary app data stores.
    * @return An object that is used to manage the asynchronous clear operation.
    */
  def clearAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Removes all application data from the specified app data store.
    * @param locality One of the enumeration values.
    * @return An object that is used to manage the asynchronous clear operation.
    */
  def clearAsync(locality: ApplicationDataLocality): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Clears the files and subfolders from the specified subfolder of the shared storage folder for the publisher of the current app.
    * @param folderName The subfolder of the shared storage folder for the publisher of the current app from which to clear the files and subfolders.
    * @return Represents an asynchronous action that does not return a result and does not have progress notifications. You can use this value to get the results of the operation, or to specify a method to run when the operation completes - for example, to repopulate the shared storage folder with new data.
    */
  def clearPublisherCacheFolderAsync(folderName: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Gets the specified subfolder of the shared storage folder for the publisher of the current app.
    * @param folderName The subfolder to get from the shared storage folder for the publisher of the current app.
    * @return The specified subfolder.
    */
  def getPublisherCacheFolder(folderName: java.lang.String): StorageFolder = js.native
  /** Occurs when roaming application data is synchronized. */
  def ondatachanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[ApplicationData]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_datachanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.datachanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ApplicationData, _]
  ): scala.Unit = js.native
  /**
    * Sets the version number of the application data in the app data store.
    * @param desiredVersion The new version number.
    * @param handler The set version event handler.
    * @return An object that is used to manage the asynchronous set version operation.
    */
  def setVersionAsync(desiredVersion: scala.Double, handler: ApplicationDataSetVersionHandler): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /** Sends a DataChanged | datachanged event to all registered event handlers. */
  def signalDataChanged(): scala.Unit = js.native
}

/** Provides access to the application data store. Application data consists of files and settings that are either local, roaming, or temporary. */
@JSGlobal("Windows.Storage.ApplicationData")
@js.native
object ApplicationData extends js.Object {
  /** Provides access to the app data store associated with the app's app package. */
  var current: winrtDashUwpLib.WindowsNs.StorageNs.ApplicationData = js.native
  /**
    * Static method that returns the ApplicationData for a User .
    * @param user The User for which the ApplicationData is returned.
    * @return When this method completes, it returns the requested ApplicationData object.
    */
  def getForUserAsync(user: winrtDashUwpLib.WindowsNs.SystemNs.User): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.ApplicationData] = js.native
}

