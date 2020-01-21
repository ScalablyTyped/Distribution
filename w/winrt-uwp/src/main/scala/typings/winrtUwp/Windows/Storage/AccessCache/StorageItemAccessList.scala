package typings.winrtUwp.Windows.Storage.AccessCache

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.IStorageItem
import typings.winrtUwp.Windows.Storage.StorageFile
import typings.winrtUwp.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents your app's future-access list (obtained from the static StorageApplicationPermissions.FutureAccessList property). By picking files and folders, your user grants your app permission to access items that might not be accessible otherwise. If you add these items to your future-access list then you'll retain that permission when your app wants to access those items again later. Items are stored in the future-access list as StorageFile and StorageFolder objects. */
@JSGlobal("Windows.Storage.AccessCache.StorageItemAccessList")
@js.native
abstract class StorageItemAccessList () extends js.Object {
  /** Gets an object for retrieving storage items from the access list. */
  var entries: AccessListEntryView = js.native
  /** Gets the maximum number of storage items that the access list can contain. */
  var maximumItemsAllowed: Double = js.native
  /**
    * Adds a new storage item to the access list.
    * @param file The storage item to add.
    * @return A token that the app can use later to retrieve the storage item.
    */
  def add(file: IStorageItem): String = js.native
  /**
    * Adds a new storage item and accompanying metadata to the access list.
    * @param file The storage item to add.
    * @param metadata Optional metadata to associate with the storage item.
    * @return A token that the app can use later to retrieve the storage item.
    */
  def add(file: IStorageItem, metadata: String): String = js.native
  /**
    * Adds a new storage item to the access list, or replaces the specified item if it already exists in the list.
    * @param token The token associated with the new storage item. If the access list already contains a storage item that has this token, the new item replaces the existing one.
    * @param file The storage item to add or replace.
    */
  def addOrReplace(token: String, file: IStorageItem): Unit = js.native
  /**
    * Adds a new storage item and accompanying metadata to the access list, or replaces the specified item if it already exists in the list.
    * @param token A token that the app can use later to retrieve this storage item.
    * @param file The storage item to add or replace.
    * @param metadata Optional metadata to associate with the storage item.
    */
  def addOrReplace(token: String, file: IStorageItem, metadata: String): Unit = js.native
  /**
    * Determines whether the app has access to the specified storage item in the access list.
    * @param file The storage item to check for access.
    * @return True if the app can access the storage item; otherwise false.
    */
  def checkAccess(file: IStorageItem): Boolean = js.native
  /** Removes all storage items from the access list. */
  def clear(): Unit = js.native
  /**
    * Determines whether the access list contains the specified storage item.
    * @param token The token of the storage item to look for.
    * @return True if the access list contains the specified storage item; false otherwise.
    */
  def containsItem(token: String): Boolean = js.native
  /**
    * Retrieves the specified StorageFile from the list.
    * @param token The token of the StorageFile to retrieve.
    * @return When this method completes successfully, it returns the StorageFile that is associated with the specified token.
    */
  def getFileAsync(token: String): IPromiseWithIAsyncOperation[StorageFile] = js.native
  /**
    * Retrieves the StorageFile from the list using the specified options.
    * @param token The token of the StorageFile to retrieve.
    * @param options The enum value that describes the behavior to use when the app accesses the item.
    * @return When this method completes successfully, it returns the StorageFile that is associated with the specified token.
    */
  def getFileAsync(token: String, options: AccessCacheOptions): IPromiseWithIAsyncOperation[StorageFile] = js.native
  /**
    * Retrieves the specified StorageFolder from the list.
    * @param token The token of the StorageFolder to retrieve.
    * @return When this method completes successfully, it returns the StorageFolder that is associated with the specified token.
    */
  def getFolderAsync(token: String): IPromiseWithIAsyncOperation[StorageFolder] = js.native
  /**
    * Retrieves the specified StorageFolder from the list using the specified options.
    * @param token The token of the StorageFolder to retrieve.
    * @param options The enum value that describes the behavior to use when the app accesses the item.
    * @return When this method completes successfully, it returns the StorageFolder that is associated with the specified token.
    */
  def getFolderAsync(token: String, options: AccessCacheOptions): IPromiseWithIAsyncOperation[StorageFolder] = js.native
  /**
    * Retrieves the specified item (like a file or folder) from the most recently used (MRU) list.
    * @param token The token of the item to retrieve.
    * @return When this method completes successfully, it returns the item (type IStorageItem ) that is associated with the specified token.
    */
  def getItemAsync(token: String): IPromiseWithIAsyncOperation[IStorageItem] = js.native
  /**
    * Retrieves the specified item (like a file or folder) from the list using the specified options.
    * @param token The token of the item to retrieve.
    * @param options The enum value that describes the behavior to use when the app accesses the item.
    * @return When this method completes successfully, it returns the item (type IStorageItem ) that is associated with the specified token.
    */
  def getItemAsync(token: String, options: AccessCacheOptions): IPromiseWithIAsyncOperation[IStorageItem] = js.native
  /**
    * Removes the specified storage item from the access list.
    * @param token The token of the storage item to remove.
    */
  def remove(token: String): Unit = js.native
}

