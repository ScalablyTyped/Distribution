package typings.winrt.global.Windows.Storage

import typings.winrt.Windows.Foundation.Collections.IIterator
import typings.winrt.Windows.Storage.AccessCache.AccessListEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.AccessCache")
@js.native
object AccessCache extends js.Object {
  @js.native
  class AccessListEntryView ()
    extends typings.winrt.Windows.Storage.AccessCache.AccessListEntryView {
    /* CompleteClass */
    override def first(): IIterator[AccessListEntry] = js.native
  }
  
  @js.native
  class ItemRemovedEventArgs ()
    extends typings.winrt.Windows.Storage.AccessCache.ItemRemovedEventArgs {
    /* CompleteClass */
    override var removedEntry: AccessListEntry = js.native
  }
  
  @js.native
  class StorageApplicationPermissions ()
    extends typings.winrt.Windows.Storage.AccessCache.StorageApplicationPermissions
  
  @js.native
  class StorageItemAccessList ()
    extends typings.winrt.Windows.Storage.AccessCache.StorageItemAccessList
  
  @js.native
  class StorageItemMostRecentlyUsedList ()
    extends typings.winrt.Windows.Storage.AccessCache.StorageItemMostRecentlyUsedList
  
  @js.native
  object AccessCacheOptions extends js.Object {
    /* 1 */ val disallowUserInput: typings.winrt.Windows.Storage.AccessCache.AccessCacheOptions.disallowUserInput with Double = js.native
    /* 2 */ val fastLocationsOnly: typings.winrt.Windows.Storage.AccessCache.AccessCacheOptions.fastLocationsOnly with Double = js.native
    /* 0 */ val none: typings.winrt.Windows.Storage.AccessCache.AccessCacheOptions.none with Double = js.native
    /* 4 */ val suppressAccessTimeUpdate: typings.winrt.Windows.Storage.AccessCache.AccessCacheOptions.suppressAccessTimeUpdate with Double = js.native
    /* 3 */ val useReadOnlyCachedCopy: typings.winrt.Windows.Storage.AccessCache.AccessCacheOptions.useReadOnlyCachedCopy with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.AccessCache.AccessCacheOptions with Double] = js.native
  }
  
  /* static members */
  @js.native
  object StorageApplicationPermissions extends js.Object {
    var futureAccessList: typings.winrt.Windows.Storage.AccessCache.StorageItemAccessList = js.native
    var mostRecentlyUsedList: typings.winrt.Windows.Storage.AccessCache.StorageItemMostRecentlyUsedList = js.native
  }
  
}

