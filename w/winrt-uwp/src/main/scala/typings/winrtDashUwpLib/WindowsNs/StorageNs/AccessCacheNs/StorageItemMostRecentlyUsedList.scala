package typings
package winrtDashUwpLib.WindowsNs.StorageNs.AccessCacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents your app's most recently used list (MRU) (obtained from the static StorageApplicationPermissions.MostRecentlyUsedList property). You use your MRU to track items (files and/or folders) that the user has accessed most recently. Items are stored in the MRU as StorageFile and StorageFolder objects. */
@JSGlobal("Windows.Storage.AccessCache.StorageItemMostRecentlyUsedList")
@js.native
abstract class StorageItemMostRecentlyUsedList () extends js.Object {
  /** Gets an object for retrieving storage items from the most recently used (MRU) list. */
  var entries: AccessListEntryView = js.native
  /** Gets the maximum number of storage items that the most recently used (MRU) list can contain. */
  var maximumItemsAllowed: scala.Double = js.native
  /** Fires when a storage item is removed from the most recently used (MRU) list. */
  @JSName("onitemremoved")
  var onitemremoved_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[StorageItemMostRecentlyUsedList, ItemRemovedEventArgs] = js.native
  /**
    * Adds a new storage item to the most recently used (MRU) list.
    * @param file The storage item to add.
    * @return A token that the app can use later to retrieve the storage item.
    */
  def add(file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageItem): java.lang.String = js.native
  /**
    * Adds a new storage item and accompanying metadata to the most recently used (MRU) list.
    * @param file The storage item to add.
    * @param metadata Optional metadata to associate with the storage item.
    * @return A token that the app can use later to retrieve the storage item.
    */
  def add(file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageItem, metadata: java.lang.String): java.lang.String = js.native
  /**
    * Adds a new storage item and accompanying metadata to the most recently used (MRU) list, specifying the extent of its visibility in the list.
    * @param file The storage item to add.
    * @param metadata Optional metadata to associate with the storage item.
    * @param visibility The extent of the visibility of the storage item in the list.
    * @return A token that the app can use later to retrieve the storage item.
    */
  def add(
    file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageItem,
    metadata: java.lang.String,
    visibility: RecentStorageItemVisibility
  ): java.lang.String = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_itemremoved(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.itemremoved,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[StorageItemMostRecentlyUsedList, ItemRemovedEventArgs]
  ): scala.Unit = js.native
  /**
    * Adds a new storage item to the most recently used (MRU) list, or replaces the specified item if it already exists in the list.
    * @param token The token associated with the new storage item. If the access list already contains a storage item that has this token, the new item replaces the existing one.
    * @param file The storage item to add or replace.
    */
  def addOrReplace(token: java.lang.String, file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageItem): scala.Unit = js.native
  /**
    * Adds a new storage item and accompanying metadata to the most recently used (MRU) list, or replaces the specified item if it already exists in the list.
    * @param token The token associated with the new storage item. If the access list already contains a storage item that has this token, the new item replaces the existing one.
    * @param file The storage item to add or replace.
    * @param metadata Optional metadata to associate with the storage item.
    */
  def addOrReplace(
    token: java.lang.String,
    file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageItem,
    metadata: java.lang.String
  ): scala.Unit = js.native
  /**
    * Adds a new storage item and accompanying metadata to the most recently used (MRU) list, or replaces the specified item if it already exists in the list. Also specifies the extent of its visibility in the list.
    * @param token The token associated with the new storage item. If the access list already contains a storage item that has this token, the new item replaces the existing one.
    * @param file The storage item to add or replace.
    * @param metadata Optional metadata to associate with the storage item.
    * @param visibility The extent of the visibility of the storage item in the list.
    */
  def addOrReplace(
    token: java.lang.String,
    file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageItem,
    metadata: java.lang.String,
    visibility: RecentStorageItemVisibility
  ): scala.Unit = js.native
  /**
    * Determines whether the app has access to the specified storage item in the most recently used (MRU) list.
    * @param file The storage item to check for access.
    * @return True if the app can access the storage item; otherwise false.
    */
  def checkAccess(file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageItem): scala.Boolean = js.native
  /** Removes all storage items from the most recently used (MRU) list. */
  def clear(): scala.Unit = js.native
  /**
    * Determines whether the most recently used (MRU) list contains the specified storage item.
    * @param token The token of the storage item to look for.
    * @return True if the MRU list contains the specified storage item; false otherwise.
    */
  def containsItem(token: java.lang.String): scala.Boolean = js.native
  /**
    * Retrieves the specified storageFile from the most recently used (MRU) list.
    * @param token The token of the storageFile to retrieve.
    * @return When this method completes successfully, it returns the storageFile that is associated with the specified token.
    */
  def getFileAsync(token: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StorageFile] = js.native
  /**
    * Retrieves the specified storageFile from the most recently used (MRU) list using the specified options.
    * @param token The token of the storageFile to retrieve.
    * @param options The enum value that describes the behavior to use when the app accesses the item.
    * @return When this method completes successfully, it returns the storageFile that is associated with the specified token.
    */
  def getFileAsync(token: java.lang.String, options: AccessCacheOptions): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StorageFile] = js.native
  /**
    * Retrieves the specified StorageFolder from the most recently used (MRU) list.
    * @param token The token of the StorageFolder to retrieve.
    * @return When this method completes successfully, it returns the StorageFolder that is associated with the specified token.
    */
  def getFolderAsync(token: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StorageFolder] = js.native
  /**
    * Retrieves the specified StorageFolder from the most recently used (MRU) list using the specified options.
    * @param token The token of the StorageFolder to retrieve.
    * @param options The enum value that describes the behavior to use when the app accesses the item.
    * @return When this method completes successfully, it returns the StorageFolder that is associated with the specified token.
    */
  def getFolderAsync(token: java.lang.String, options: AccessCacheOptions): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StorageFolder] = js.native
  /**
    * Retrieves the specified item (like a file or folder) from the most recently used (MRU) list.
    * @param token The token of the item to retrieve.
    * @return When this method completes successfully, it returns the item (type IStorageItem ) that is associated with the specified token.
    */
  def getItemAsync(token: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.IStorageItem] = js.native
  /**
    * Retrieves the specified item (like a file or folder) from the most recently used (MRU) list using the specified options.
    * @param token The token of the item to retrieve.
    * @param options The enum value that describes the behavior to use when the app accesses the item.
    * @return When this method completes successfully, it returns the item (type IStorageItem ) that is associated with the specified token.
    */
  def getItemAsync(token: java.lang.String, options: AccessCacheOptions): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.IStorageItem] = js.native
  /** Fires when a storage item is removed from the most recently used (MRU) list. */
  def onitemremoved(
    ev: ItemRemovedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[StorageItemMostRecentlyUsedList]
  ): scala.Unit = js.native
  /**
    * Removes the specified storage item from the most recently used (MRU) list.
    * @param token The token of the storage item to remove.
    */
  def remove(token: java.lang.String): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_itemremoved(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.itemremoved,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[StorageItemMostRecentlyUsedList, ItemRemovedEventArgs]
  ): scala.Unit = js.native
}

