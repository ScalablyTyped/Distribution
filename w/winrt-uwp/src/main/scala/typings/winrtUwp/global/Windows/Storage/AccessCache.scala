package typings.winrtUwp.global.Windows.Storage

import typings.winrtUwp.Windows.Storage.AccessCache.AccessListEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables and manages access to the most recently used (MRU) list of storage items, and to the list of storage items that the application has saved for efficient future access. */
object AccessCache {
  
  /** Describes the behavior to use when the app accesses an item in a list. */
  @JSGlobal("Windows.Storage.AccessCache.AccessCacheOptions")
  @js.native
  object AccessCacheOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.AccessCache.AccessCacheOptions & Double] = js.native
    
    /* 1 */ val disallowUserInput: typings.winrtUwp.Windows.Storage.AccessCache.AccessCacheOptions.disallowUserInput & Double = js.native
    
    /* 2 */ val fastLocationsOnly: typings.winrtUwp.Windows.Storage.AccessCache.AccessCacheOptions.fastLocationsOnly & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Storage.AccessCache.AccessCacheOptions.none & Double = js.native
    
    /* 4 */ val suppressAccessTimeUpdate: typings.winrtUwp.Windows.Storage.AccessCache.AccessCacheOptions.suppressAccessTimeUpdate & Double = js.native
    
    /* 3 */ val useReadOnlyCachedCopy: typings.winrtUwp.Windows.Storage.AccessCache.AccessCacheOptions.useReadOnlyCachedCopy & Double = js.native
  }
  
  /** A list of the entries that are in your app's most recently used list (MRU) (obtained from the static StorageApplicationPermissions.MostRecentlyUsedList property) and in your app's future-access list (obtained from the static StorageApplicationPermissions.FutureAccessList property). */
  @JSGlobal("Windows.Storage.AccessCache.AccessListEntryView")
  @js.native
  abstract class AccessListEntryView ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.AccessCache.AccessListEntryView
  
  /** Provides data about an ItemRemoved event. */
  @JSGlobal("Windows.Storage.AccessCache.ItemRemovedEventArgs")
  @js.native
  abstract class ItemRemovedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.AccessCache.ItemRemovedEventArgs {
    
    /** Gets information about the StorageFile or StorageFolder that was removed from the StorageItemMostRecentlyUsedList . */
    /* CompleteClass */
    var removedEntry: AccessListEntry = js.native
  }
  
  /** Describes the extent of the visibility of a storage item added to the most recently used (MRU) list. */
  @JSGlobal("Windows.Storage.AccessCache.RecentStorageItemVisibility")
  @js.native
  object RecentStorageItemVisibility extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Storage.AccessCache.RecentStorageItemVisibility & Double
      ] = js.native
    
    /* 1 */ val appAndSystem: typings.winrtUwp.Windows.Storage.AccessCache.RecentStorageItemVisibility.appAndSystem & Double = js.native
    
    /* 0 */ val appOnly: typings.winrtUwp.Windows.Storage.AccessCache.RecentStorageItemVisibility.appOnly & Double = js.native
  }
  
  /** Provides static properties for you to get your app's most recently used list (MRU) (use StorageApplicationPermissions.MostRecentlyUsedList ) and future-access list (use StorageApplicationPermissions.FutureAccessList . */
  @JSGlobal("Windows.Storage.AccessCache.StorageApplicationPermissions")
  @js.native
  abstract class StorageApplicationPermissions ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.AccessCache.StorageApplicationPermissions
  object StorageApplicationPermissions {
    
    @JSGlobal("Windows.Storage.AccessCache.StorageApplicationPermissions")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets an object that represents a list that an app maintains so that the app can store files and/or locations (like folders) and easily access these items in the future. */
    /* static member */
    @JSGlobal("Windows.Storage.AccessCache.StorageApplicationPermissions.futureAccessList")
    @js.native
    def futureAccessList: typings.winrtUwp.Windows.Storage.AccessCache.StorageItemAccessList = js.native
    @scala.inline
    def futureAccessList_=(x: typings.winrtUwp.Windows.Storage.AccessCache.StorageItemAccessList): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("futureAccessList")(x.asInstanceOf[js.Any])
    
    /** Gets an object that represents a list that an app can use to track the files and/or locations (like folders) that the app has accessed most recently. */
    /* static member */
    @JSGlobal("Windows.Storage.AccessCache.StorageApplicationPermissions.mostRecentlyUsedList")
    @js.native
    def mostRecentlyUsedList: typings.winrtUwp.Windows.Storage.AccessCache.StorageItemMostRecentlyUsedList = js.native
    @scala.inline
    def mostRecentlyUsedList_=(x: typings.winrtUwp.Windows.Storage.AccessCache.StorageItemMostRecentlyUsedList): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mostRecentlyUsedList")(x.asInstanceOf[js.Any])
  }
  
  /** Represents your app's future-access list (obtained from the static StorageApplicationPermissions.FutureAccessList property). By picking files and folders, your user grants your app permission to access items that might not be accessible otherwise. If you add these items to your future-access list then you'll retain that permission when your app wants to access those items again later. Items are stored in the future-access list as StorageFile and StorageFolder objects. */
  @JSGlobal("Windows.Storage.AccessCache.StorageItemAccessList")
  @js.native
  abstract class StorageItemAccessList ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.AccessCache.StorageItemAccessList
  
  /** Represents your app's most recently used list (MRU) (obtained from the static StorageApplicationPermissions.MostRecentlyUsedList property). You use your MRU to track items (files and/or folders) that the user has accessed most recently. Items are stored in the MRU as StorageFile and StorageFolder objects. */
  @JSGlobal("Windows.Storage.AccessCache.StorageItemMostRecentlyUsedList")
  @js.native
  abstract class StorageItemMostRecentlyUsedList ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.AccessCache.StorageItemMostRecentlyUsedList
}
