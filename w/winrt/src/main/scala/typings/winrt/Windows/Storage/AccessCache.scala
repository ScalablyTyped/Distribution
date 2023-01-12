package typings.winrt.Windows.Storage

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AccessCache {
  
  @js.native
  sealed trait AccessCacheOptions extends StObject
  @JSGlobal("Windows.Storage.AccessCache.AccessCacheOptions")
  @js.native
  object AccessCacheOptions extends StObject {
    
    @js.native
    sealed trait disallowUserInput
      extends StObject
         with AccessCacheOptions
    
    @js.native
    sealed trait fastLocationsOnly
      extends StObject
         with AccessCacheOptions
    
    @js.native
    sealed trait none
      extends StObject
         with AccessCacheOptions
    
    @js.native
    sealed trait suppressAccessTimeUpdate
      extends StObject
         with AccessCacheOptions
    
    @js.native
    sealed trait useReadOnlyCachedCopy
      extends StObject
         with AccessCacheOptions
  }
  
  trait AccessListEntry extends StObject {
    
    var metadata: String
    
    var token: String
  }
  object AccessListEntry {
    
    inline def apply(metadata: String, token: String): AccessListEntry = {
      val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessListEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccessListEntry] (val x: Self) extends AnyVal {
      
      inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AccessListEntryView
    extends StObject
       with IVectorView[AccessListEntry]
  
  trait IItemRemovedEventArgs extends StObject {
    
    var removedEntry: AccessListEntry
  }
  object IItemRemovedEventArgs {
    
    inline def apply(removedEntry: AccessListEntry): IItemRemovedEventArgs = {
      val __obj = js.Dynamic.literal(removedEntry = removedEntry.asInstanceOf[js.Any])
      __obj.asInstanceOf[IItemRemovedEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IItemRemovedEventArgs] (val x: Self) extends AnyVal {
      
      inline def setRemovedEntry(value: AccessListEntry): Self = StObject.set(x, "removedEntry", value.asInstanceOf[js.Any])
    }
  }
  
  trait IStorageApplicationPermissionsStatics extends StObject {
    
    var futureAccessList: StorageItemAccessList
    
    var mostRecentlyUsedList: StorageItemMostRecentlyUsedList
  }
  object IStorageApplicationPermissionsStatics {
    
    inline def apply(futureAccessList: StorageItemAccessList, mostRecentlyUsedList: StorageItemMostRecentlyUsedList): IStorageApplicationPermissionsStatics = {
      val __obj = js.Dynamic.literal(futureAccessList = futureAccessList.asInstanceOf[js.Any], mostRecentlyUsedList = mostRecentlyUsedList.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStorageApplicationPermissionsStatics]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IStorageApplicationPermissionsStatics] (val x: Self) extends AnyVal {
      
      inline def setFutureAccessList(value: StorageItemAccessList): Self = StObject.set(x, "futureAccessList", value.asInstanceOf[js.Any])
      
      inline def setMostRecentlyUsedList(value: StorageItemMostRecentlyUsedList): Self = StObject.set(x, "mostRecentlyUsedList", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IStorageItemAccessList extends StObject {
    
    def add(file: IStorageItem): String = js.native
    def add(file: IStorageItem, metadata: String): String = js.native
    
    def addOrReplace(token: String, file: IStorageItem): Unit = js.native
    def addOrReplace(token: String, file: IStorageItem, metadata: String): Unit = js.native
    
    def checkAccess(file: IStorageItem): Boolean = js.native
    
    def clear(): Unit = js.native
    
    def containsItem(token: String): Boolean = js.native
    
    var entries: AccessListEntryView = js.native
    
    def getFileAsync(token: String): IAsyncOperation[StorageFile] = js.native
    def getFileAsync(token: String, options: AccessCacheOptions): IAsyncOperation[StorageFile] = js.native
    
    def getFolderAsync(token: String): IAsyncOperation[StorageFolder] = js.native
    def getFolderAsync(token: String, options: AccessCacheOptions): IAsyncOperation[StorageFolder] = js.native
    
    def getItemAsync(token: String): IAsyncOperation[IStorageItem] = js.native
    def getItemAsync(token: String, options: AccessCacheOptions): IAsyncOperation[IStorageItem] = js.native
    
    var maximumItemsAllowed: Double = js.native
    
    def remove(token: String): Unit = js.native
  }
  
  @js.native
  trait IStorageItemMostRecentlyUsedList
    extends StObject
       with IStorageItemAccessList {
    
    var onitemremoved: Any = js.native
  }
  
  trait ItemRemovedEventArgs
    extends StObject
       with IItemRemovedEventArgs
  object ItemRemovedEventArgs {
    
    inline def apply(removedEntry: AccessListEntry): ItemRemovedEventArgs = {
      val __obj = js.Dynamic.literal(removedEntry = removedEntry.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemRemovedEventArgs]
    }
  }
  
  trait StorageApplicationPermissions extends StObject
  
  @js.native
  trait StorageItemAccessList
    extends StObject
       with IStorageItemAccessList
  
  @js.native
  trait StorageItemMostRecentlyUsedList
    extends StObject
       with IStorageItemMostRecentlyUsedList
}
