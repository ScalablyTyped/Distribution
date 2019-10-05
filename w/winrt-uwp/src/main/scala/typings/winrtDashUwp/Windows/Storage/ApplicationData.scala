package typings.winrtDashUwp.Windows.Storage

import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typings.winrtDashUwp.Windows.System.User
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.datachanged
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
  var ondatachanged_Original: TypedEventHandler[ApplicationData, _] = js.native
  /** Gets the root folder in the roaming app data store. */
  var roamingFolder: StorageFolder = js.native
  /** Gets the application settings container in the roaming app data store. */
  var roamingSettings: ApplicationDataContainer = js.native
  /** Gets the maximum size of the data that can be synchronized to the cloud from the roaming app data store. */
  var roamingStorageQuota: Double = js.native
  /** Gets the root folder in the shared app data store. */
  var sharedLocalFolder: StorageFolder = js.native
  /** Gets the root folder in the temporary app data store. */
  var temporaryFolder: StorageFolder = js.native
  /** Gets the version number of the application data in the app data store. */
  var version: Double = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_datachanged(`type`: datachanged, listener: TypedEventHandler[ApplicationData, _]): Unit = js.native
  /**
    * Removes all application data from the local, roaming, and temporary app data stores.
    * @return An object that is used to manage the asynchronous clear operation.
    */
  def clearAsync(): IPromiseWithIAsyncAction = js.native
  /**
    * Removes all application data from the specified app data store.
    * @param locality One of the enumeration values.
    * @return An object that is used to manage the asynchronous clear operation.
    */
  def clearAsync(locality: ApplicationDataLocality): IPromiseWithIAsyncAction = js.native
  /**
    * Clears the files and subfolders from the specified subfolder of the shared storage folder for the publisher of the current app.
    * @param folderName The subfolder of the shared storage folder for the publisher of the current app from which to clear the files and subfolders.
    * @return Represents an asynchronous action that does not return a result and does not have progress notifications. You can use this value to get the results of the operation, or to specify a method to run when the operation completes - for example, to repopulate the shared storage folder with new data.
    */
  def clearPublisherCacheFolderAsync(folderName: String): IPromiseWithIAsyncAction = js.native
  /**
    * Gets the specified subfolder of the shared storage folder for the publisher of the current app.
    * @param folderName The subfolder to get from the shared storage folder for the publisher of the current app.
    * @return The specified subfolder.
    */
  def getPublisherCacheFolder(folderName: String): StorageFolder = js.native
  /** Occurs when roaming application data is synchronized. */
  def ondatachanged(ev: js.Any with WinRTEvent[ApplicationData]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_datachanged(`type`: datachanged, listener: TypedEventHandler[ApplicationData, _]): Unit = js.native
  /**
    * Sets the version number of the application data in the app data store.
    * @param desiredVersion The new version number.
    * @param handler The set version event handler.
    * @return An object that is used to manage the asynchronous set version operation.
    */
  def setVersionAsync(desiredVersion: Double, handler: ApplicationDataSetVersionHandler): IPromiseWithIAsyncAction = js.native
  /** Sends a DataChanged | datachanged event to all registered event handlers. */
  def signalDataChanged(): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Storage.ApplicationData")
@js.native
object ApplicationData extends js.Object {
  /** Provides access to the app data store associated with the app's app package. */
  var current: ApplicationData = js.native
  /**
    * Static method that returns the ApplicationData for a User .
    * @param user The User for which the ApplicationData is returned.
    * @return When this method completes, it returns the requested ApplicationData object.
    */
  def getForUserAsync(user: User): IPromiseWithIAsyncOperation[ApplicationData] = js.native
}

