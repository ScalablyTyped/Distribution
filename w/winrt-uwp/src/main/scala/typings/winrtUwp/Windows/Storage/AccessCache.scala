package typings.winrtUwp.Windows.Storage

import typings.std.Array
import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.anon.Index
import typings.winrtUwp.anon.ItemsAccessListEntry
import typings.winrtUwp.winrtUwpStrings.itemremoved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables and manages access to the most recently used (MRU) list of storage items, and to the list of storage items that the application has saved for efficient future access. */
object AccessCache {
  
  @js.native
  sealed trait AccessCacheOptions extends StObject
  /** Describes the behavior to use when the app accesses an item in a list. */
  @JSGlobal("Windows.Storage.AccessCache.AccessCacheOptions")
  @js.native
  object AccessCacheOptions extends StObject {
    
    /** When the app accesses the item, the user is prevented from entering information. */
    @js.native
    sealed trait disallowUserInput
      extends StObject
         with AccessCacheOptions
    
    /** When the app accesses the item, it is retrieved from a fast location like the local file system. */
    @js.native
    sealed trait fastLocationsOnly
      extends StObject
         with AccessCacheOptions
    
    /** Default. */
    @js.native
    sealed trait none
      extends StObject
         with AccessCacheOptions
    
    /** When the app accesses the item in the StorageItemMostRecentlyUsedList , Windows preserves the item's current position in the MRU and does not update the access time of the item. */
    @js.native
    sealed trait suppressAccessTimeUpdate
      extends StObject
         with AccessCacheOptions
    
    /** When the app accesses the item, the app retrieves a cached, read-only version of the file. This version of the file might not be the most recent. */
    @js.native
    sealed trait useReadOnlyCachedCopy
      extends StObject
         with AccessCacheOptions
  }
  
  @js.native
  sealed trait RecentStorageItemVisibility extends StObject
  /** Describes the extent of the visibility of a storage item added to the most recently used (MRU) list. */
  @JSGlobal("Windows.Storage.AccessCache.RecentStorageItemVisibility")
  @js.native
  object RecentStorageItemVisibility extends StObject {
    
    /** The storage item is visible in the MRU list for the app and the system. */
    @js.native
    sealed trait appAndSystem
      extends StObject
         with RecentStorageItemVisibility
    
    /** The storage item is visible in the MRU list for the app only. */
    @js.native
    sealed trait appOnly
      extends StObject
         with RecentStorageItemVisibility
  }
  
  /** Represents a list entry that contains the identifier and metadata for a StorageFile or StorageFolder object in a list. */
  trait AccessListEntry extends StObject {
    
    /** Optional app-specified metadata associated with the StorageFile or StorageFolder in the list. */
    var metadata: String
    
    /** The identifier of the StorageFile or StorageFolder in the list. */
    var token: String
  }
  object AccessListEntry {
    
    inline def apply(metadata: String, token: String): AccessListEntry = {
      val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessListEntry]
    }
    
    extension [Self <: AccessListEntry](x: Self) {
      
      inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  /** A list of the entries that are in your app's most recently used list (MRU) (obtained from the static StorageApplicationPermissions.MostRecentlyUsedList property) and in your app's future-access list (obtained from the static StorageApplicationPermissions.FutureAccessList property). */
  @js.native
  trait AccessListEntryView
    extends StObject
       with Array[AccessListEntry] {
    
    /**
      * Retrieves the first storage item from the access list or most recently used (MRU) list.
      * @return The first item.
      */
    def first(): IIterator[AccessListEntry] = js.native
    
    /**
      * Retrieves the storage item at the specified index in the access list or most recently used (MRU) list.
      * @param index The zero-based index of the storage item to retrieve.
      * @return The storage item.
      */
    def getAt(index: Double): AccessListEntry = js.native
    
    /**
      * Retrieves the storage items that start at the specified index in the access list or most recently used (MRU) list.
      * @param startIndex The zero-based index of the start of the items in the collection to retrieve.
      */
    def getMany(startIndex: Double): ItemsAccessListEntry = js.native
    
    def indexOf(value: AccessListEntry, extra: js.Any*): Index = js.native
    /* hack */
    @JSName("indexOf")
    def indexOf_Double(searchElement: AccessListEntry): Double = js.native
    
    /** Gets the number of storage items in the access list or most recently used (MRU) list. */
    var size: Double = js.native
  }
  
  /** Provides data about an ItemRemoved event. */
  trait ItemRemovedEventArgs extends StObject {
    
    /** Gets information about the StorageFile or StorageFolder that was removed from the StorageItemMostRecentlyUsedList . */
    var removedEntry: AccessListEntry
  }
  object ItemRemovedEventArgs {
    
    inline def apply(removedEntry: AccessListEntry): ItemRemovedEventArgs = {
      val __obj = js.Dynamic.literal(removedEntry = removedEntry.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemRemovedEventArgs]
    }
    
    extension [Self <: ItemRemovedEventArgs](x: Self) {
      
      inline def setRemovedEntry(value: AccessListEntry): Self = StObject.set(x, "removedEntry", value.asInstanceOf[js.Any])
    }
  }
  
  /** Provides static properties for you to get your app's most recently used list (MRU) (use StorageApplicationPermissions.MostRecentlyUsedList ) and future-access list (use StorageApplicationPermissions.FutureAccessList . */
  trait StorageApplicationPermissions extends StObject
  
  /** Represents your app's future-access list (obtained from the static StorageApplicationPermissions.FutureAccessList property). By picking files and folders, your user grants your app permission to access items that might not be accessible otherwise. If you add these items to your future-access list then you'll retain that permission when your app wants to access those items again later. Items are stored in the future-access list as StorageFile and StorageFolder objects. */
  @js.native
  trait StorageItemAccessList extends StObject {
    
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
    
    /** Gets an object for retrieving storage items from the access list. */
    var entries: AccessListEntryView = js.native
    
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
    
    /** Gets the maximum number of storage items that the access list can contain. */
    var maximumItemsAllowed: Double = js.native
    
    /**
      * Removes the specified storage item from the access list.
      * @param token The token of the storage item to remove.
      */
    def remove(token: String): Unit = js.native
  }
  
  /** Represents your app's most recently used list (MRU) (obtained from the static StorageApplicationPermissions.MostRecentlyUsedList property). You use your MRU to track items (files and/or folders) that the user has accessed most recently. Items are stored in the MRU as StorageFile and StorageFolder objects. */
  @js.native
  trait StorageItemMostRecentlyUsedList extends StObject {
    
    /**
      * Adds a new storage item to the most recently used (MRU) list.
      * @param file The storage item to add.
      * @return A token that the app can use later to retrieve the storage item.
      */
    def add(file: IStorageItem): String = js.native
    /**
      * Adds a new storage item and accompanying metadata to the most recently used (MRU) list.
      * @param file The storage item to add.
      * @param metadata Optional metadata to associate with the storage item.
      * @return A token that the app can use later to retrieve the storage item.
      */
    def add(file: IStorageItem, metadata: String): String = js.native
    /**
      * Adds a new storage item and accompanying metadata to the most recently used (MRU) list, specifying the extent of its visibility in the list.
      * @param file The storage item to add.
      * @param metadata Optional metadata to associate with the storage item.
      * @param visibility The extent of the visibility of the storage item in the list.
      * @return A token that the app can use later to retrieve the storage item.
      */
    def add(file: IStorageItem, metadata: String, visibility: RecentStorageItemVisibility): String = js.native
    
    def addEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_itemremoved(
      `type`: itemremoved,
      listener: TypedEventHandler[StorageItemMostRecentlyUsedList, ItemRemovedEventArgs]
    ): Unit = js.native
    
    /**
      * Adds a new storage item to the most recently used (MRU) list, or replaces the specified item if it already exists in the list.
      * @param token The token associated with the new storage item. If the access list already contains a storage item that has this token, the new item replaces the existing one.
      * @param file The storage item to add or replace.
      */
    def addOrReplace(token: String, file: IStorageItem): Unit = js.native
    /**
      * Adds a new storage item and accompanying metadata to the most recently used (MRU) list, or replaces the specified item if it already exists in the list.
      * @param token The token associated with the new storage item. If the access list already contains a storage item that has this token, the new item replaces the existing one.
      * @param file The storage item to add or replace.
      * @param metadata Optional metadata to associate with the storage item.
      */
    def addOrReplace(token: String, file: IStorageItem, metadata: String): Unit = js.native
    /**
      * Adds a new storage item and accompanying metadata to the most recently used (MRU) list, or replaces the specified item if it already exists in the list. Also specifies the extent of its visibility in the list.
      * @param token The token associated with the new storage item. If the access list already contains a storage item that has this token, the new item replaces the existing one.
      * @param file The storage item to add or replace.
      * @param metadata Optional metadata to associate with the storage item.
      * @param visibility The extent of the visibility of the storage item in the list.
      */
    def addOrReplace(token: String, file: IStorageItem, metadata: String, visibility: RecentStorageItemVisibility): Unit = js.native
    
    /**
      * Determines whether the app has access to the specified storage item in the most recently used (MRU) list.
      * @param file The storage item to check for access.
      * @return True if the app can access the storage item; otherwise false.
      */
    def checkAccess(file: IStorageItem): Boolean = js.native
    
    /** Removes all storage items from the most recently used (MRU) list. */
    def clear(): Unit = js.native
    
    /**
      * Determines whether the most recently used (MRU) list contains the specified storage item.
      * @param token The token of the storage item to look for.
      * @return True if the MRU list contains the specified storage item; false otherwise.
      */
    def containsItem(token: String): Boolean = js.native
    
    /** Gets an object for retrieving storage items from the most recently used (MRU) list. */
    var entries: AccessListEntryView = js.native
    
    /**
      * Retrieves the specified storageFile from the most recently used (MRU) list.
      * @param token The token of the storageFile to retrieve.
      * @return When this method completes successfully, it returns the storageFile that is associated with the specified token.
      */
    def getFileAsync(token: String): IPromiseWithIAsyncOperation[StorageFile] = js.native
    /**
      * Retrieves the specified storageFile from the most recently used (MRU) list using the specified options.
      * @param token The token of the storageFile to retrieve.
      * @param options The enum value that describes the behavior to use when the app accesses the item.
      * @return When this method completes successfully, it returns the storageFile that is associated with the specified token.
      */
    def getFileAsync(token: String, options: AccessCacheOptions): IPromiseWithIAsyncOperation[StorageFile] = js.native
    
    /**
      * Retrieves the specified StorageFolder from the most recently used (MRU) list.
      * @param token The token of the StorageFolder to retrieve.
      * @return When this method completes successfully, it returns the StorageFolder that is associated with the specified token.
      */
    def getFolderAsync(token: String): IPromiseWithIAsyncOperation[StorageFolder] = js.native
    /**
      * Retrieves the specified StorageFolder from the most recently used (MRU) list using the specified options.
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
      * Retrieves the specified item (like a file or folder) from the most recently used (MRU) list using the specified options.
      * @param token The token of the item to retrieve.
      * @param options The enum value that describes the behavior to use when the app accesses the item.
      * @return When this method completes successfully, it returns the item (type IStorageItem ) that is associated with the specified token.
      */
    def getItemAsync(token: String, options: AccessCacheOptions): IPromiseWithIAsyncOperation[IStorageItem] = js.native
    
    /** Gets the maximum number of storage items that the most recently used (MRU) list can contain. */
    var maximumItemsAllowed: Double = js.native
    
    /** Fires when a storage item is removed from the most recently used (MRU) list. */
    def onitemremoved(ev: ItemRemovedEventArgs & WinRTEvent[StorageItemMostRecentlyUsedList]): Unit = js.native
    /** Fires when a storage item is removed from the most recently used (MRU) list. */
    @JSName("onitemremoved")
    var onitemremoved_Original: TypedEventHandler[StorageItemMostRecentlyUsedList, ItemRemovedEventArgs] = js.native
    
    /**
      * Removes the specified storage item from the most recently used (MRU) list.
      * @param token The token of the storage item to remove.
      */
    def remove(token: String): Unit = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_itemremoved(
      `type`: itemremoved,
      listener: TypedEventHandler[StorageItemMostRecentlyUsedList, ItemRemovedEventArgs]
    ): Unit = js.native
  }
}
