package typings.winrt.global.Windows.Storage

import typings.winrt.Windows.Foundation.Collections.IIterator
import typings.winrt.Windows.Storage.AccessCache.AccessListEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AccessCache {
  
  @JSGlobal("Windows.Storage.AccessCache.AccessCacheOptions")
  @js.native
  object AccessCacheOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.AccessCache.AccessCacheOptions & Double] = js.native
    
    /* 1 */ val disallowUserInput: typings.winrt.Windows.Storage.AccessCache.AccessCacheOptions.disallowUserInput & Double = js.native
    
    /* 2 */ val fastLocationsOnly: typings.winrt.Windows.Storage.AccessCache.AccessCacheOptions.fastLocationsOnly & Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Storage.AccessCache.AccessCacheOptions.none & Double = js.native
    
    /* 4 */ val suppressAccessTimeUpdate: typings.winrt.Windows.Storage.AccessCache.AccessCacheOptions.suppressAccessTimeUpdate & Double = js.native
    
    /* 3 */ val useReadOnlyCachedCopy: typings.winrt.Windows.Storage.AccessCache.AccessCacheOptions.useReadOnlyCachedCopy & Double = js.native
  }
  
  @JSGlobal("Windows.Storage.AccessCache.AccessListEntryView")
  @js.native
  class AccessListEntryView ()
    extends StObject
       with typings.winrt.Windows.Storage.AccessCache.AccessListEntryView {
    
    /* CompleteClass */
    override def first(): IIterator[AccessListEntry] = js.native
  }
  
  @JSGlobal("Windows.Storage.AccessCache.ItemRemovedEventArgs")
  @js.native
  class ItemRemovedEventArgs ()
    extends StObject
       with typings.winrt.Windows.Storage.AccessCache.ItemRemovedEventArgs {
    
    /* CompleteClass */
    var removedEntry: AccessListEntry = js.native
  }
  
  @JSGlobal("Windows.Storage.AccessCache.StorageApplicationPermissions")
  @js.native
  class StorageApplicationPermissions ()
    extends StObject
       with typings.winrt.Windows.Storage.AccessCache.StorageApplicationPermissions
  /* static members */
  object StorageApplicationPermissions {
    
    @JSGlobal("Windows.Storage.AccessCache.StorageApplicationPermissions")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Storage.AccessCache.StorageApplicationPermissions.futureAccessList")
    @js.native
    def futureAccessList: typings.winrt.Windows.Storage.AccessCache.StorageItemAccessList = js.native
    inline def futureAccessList_=(x: typings.winrt.Windows.Storage.AccessCache.StorageItemAccessList): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("futureAccessList")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Storage.AccessCache.StorageApplicationPermissions.mostRecentlyUsedList")
    @js.native
    def mostRecentlyUsedList: typings.winrt.Windows.Storage.AccessCache.StorageItemMostRecentlyUsedList = js.native
    inline def mostRecentlyUsedList_=(x: typings.winrt.Windows.Storage.AccessCache.StorageItemMostRecentlyUsedList): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mostRecentlyUsedList")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Storage.AccessCache.StorageItemAccessList")
  @js.native
  class StorageItemAccessList ()
    extends StObject
       with typings.winrt.Windows.Storage.AccessCache.StorageItemAccessList
  
  @JSGlobal("Windows.Storage.AccessCache.StorageItemMostRecentlyUsedList")
  @js.native
  class StorageItemMostRecentlyUsedList ()
    extends StObject
       with typings.winrt.Windows.Storage.AccessCache.StorageItemMostRecentlyUsedList
}
