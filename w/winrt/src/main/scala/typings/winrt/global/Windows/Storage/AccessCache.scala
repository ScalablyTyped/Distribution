package typings.winrt.global.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Storage.AccessCache")
@js.native
object AccessCache extends js.Object {
  
  @js.native
  object AccessCacheOptions extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.AccessCache.AccessCacheOptions with Double] = js.native
    
    /* 1 */ val disallowUserInput: typings.winrt.Windows.Storage.AccessCache.AccessCacheOptions.disallowUserInput with Double = js.native
    
    /* 2 */ val fastLocationsOnly: typings.winrt.Windows.Storage.AccessCache.AccessCacheOptions.fastLocationsOnly with Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Storage.AccessCache.AccessCacheOptions.none with Double = js.native
    
    /* 4 */ val suppressAccessTimeUpdate: typings.winrt.Windows.Storage.AccessCache.AccessCacheOptions.suppressAccessTimeUpdate with Double = js.native
    
    /* 3 */ val useReadOnlyCachedCopy: typings.winrt.Windows.Storage.AccessCache.AccessCacheOptions.useReadOnlyCachedCopy with Double = js.native
  }
  
  @js.native
  class AccessListEntryView ()
    extends typings.winrt.Windows.Storage.AccessCache.AccessListEntryView
  
  @js.native
  class ItemRemovedEventArgs ()
    extends typings.winrt.Windows.Storage.AccessCache.ItemRemovedEventArgs
  
  @js.native
  class StorageApplicationPermissions ()
    extends typings.winrt.Windows.Storage.AccessCache.StorageApplicationPermissions
  /* static members */
  @js.native
  object StorageApplicationPermissions extends js.Object {
    
    var futureAccessList: typings.winrt.Windows.Storage.AccessCache.StorageItemAccessList = js.native
    
    var mostRecentlyUsedList: typings.winrt.Windows.Storage.AccessCache.StorageItemMostRecentlyUsedList = js.native
  }
  
  @js.native
  class StorageItemAccessList ()
    extends typings.winrt.Windows.Storage.AccessCache.StorageItemAccessList
  
  @js.native
  class StorageItemMostRecentlyUsedList ()
    extends typings.winrt.Windows.Storage.AccessCache.StorageItemMostRecentlyUsedList
}
