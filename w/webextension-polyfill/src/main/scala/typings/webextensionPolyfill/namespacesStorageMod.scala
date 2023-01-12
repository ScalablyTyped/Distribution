package typings.webextensionPolyfill

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.webextensionPolyfill.namespacesEventsMod.Events.Event
import typings.webextensionPolyfill.webextensionPolyfillInts.`102400`
import typings.webextensionPolyfill.webextensionPolyfillInts.`120`
import typings.webextensionPolyfill.webextensionPolyfillInts.`1800`
import typings.webextensionPolyfill.webextensionPolyfillInts.`512`
import typings.webextensionPolyfill.webextensionPolyfillInts.`5242880`
import typings.webextensionPolyfill.webextensionPolyfillInts.`8192`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesStorageMod {
  
  object Storage {
    
    @js.native
    trait LocalStorageArea
      extends StObject
         with StorageArea {
      
      /**
        * The maximum amount (in bytes) of data that can be stored in local storage, as measured by the JSON stringification of
        * every value plus every key's length. This value will be ignored if the extension has the <code>unlimitedStorage</code>
        * permission. Updates that would cause this limit to be exceeded fail immediately and set $(ref:runtime.lastError).
        */
      var QUOTA_BYTES: `5242880` = js.native
    }
    
    @js.native
    trait ManagedStorageArea
      extends StObject
         with StorageArea {
      
      /**
        * The maximum size (in bytes) of the managed storage JSON manifest file. Files larger than this limit will fail to load.
        */
      var QUOTA_BYTES: `5242880` = js.native
    }
    
    trait Static extends StObject {
      
      var local: LocalStorageArea
      
      var managed: ManagedStorageArea
      
      /**
        * Fired when one or more items change.
        *
        * @param changes Object mapping each key that changed to its corresponding $(ref:storage.StorageChange) for that item.
        * @param areaName The name of the storage area (<code>"sync"</code>, <code>"local"</code> or <code>"managed"</code>)
        * the changes are for.
        */
      var onChanged: Event[
            js.Function2[/* changes */ Record[String, StorageChange], /* areaName */ String, Unit]
          ]
      
      var sync: SyncStorageAreaSync
    }
    object Static {
      
      inline def apply(
        local: LocalStorageArea,
        managed: ManagedStorageArea,
        onChanged: Event[
              js.Function2[/* changes */ Record[String, StorageChange], /* areaName */ String, Unit]
            ],
        sync: SyncStorageAreaSync
      ): Static = {
        val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], managed = managed.asInstanceOf[js.Any], onChanged = onChanged.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any])
        __obj.asInstanceOf[Static]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Static] (val x: Self) extends AnyVal {
        
        inline def setLocal(value: LocalStorageArea): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
        
        inline def setManaged(value: ManagedStorageArea): Self = StObject.set(x, "managed", value.asInstanceOf[js.Any])
        
        inline def setOnChanged(
          value: Event[
                  js.Function2[/* changes */ Record[String, StorageChange], /* areaName */ String, Unit]
                ]
        ): Self = StObject.set(x, "onChanged", value.asInstanceOf[js.Any])
        
        inline def setSync(value: SyncStorageAreaSync): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait StorageArea extends StObject {
      
      /**
        * Removes all items from storage.
        *
        * @returns Callback on success, or on failure (in which case $(ref:runtime.lastError) will be set).
        */
      def clear(): js.Promise[Unit] = js.native
      
      /**
        * Gets one or more items from storage.
        *
        * @param keys Optional. A single key to get, list of keys to get, or a dictionary specifying default values (see
        * description of the object).  An empty list or object will return an empty result object.  Pass in <code>null</code>
        * to get the entire contents of storage.
        * @returns Callback with storage items, or on failure (in which case $(ref:runtime.lastError) will be set).
        */
      def get(): js.Promise[Record[String, Any]] = js.native
      def get(keys: String): js.Promise[Record[String, Any]] = js.native
      def get(keys: js.Array[String]): js.Promise[Record[String, Any]] = js.native
      def get(keys: Record[String, Any]): js.Promise[Record[String, Any]] = js.native
      
      /**
        * Fired when one or more items change.
        *
        * @param changes Object mapping each key that changed to its corresponding $(ref:storage.StorageChange) for that item.
        */
      var onChanged: Event[js.Function1[/* changes */ StorageAreaOnChangedChangesType, Unit]] = js.native
      
      /**
        * Removes one or more items from storage.
        *
        * @param keys A single key or a list of keys for items to remove.
        * @returns Callback on success, or on failure (in which case $(ref:runtime.lastError) will be set).
        */
      def remove(keys: String): js.Promise[Unit] = js.native
      def remove(keys: js.Array[String]): js.Promise[Unit] = js.native
      
      /**
        * Sets multiple items.
        *
        * @param items <p>An object which gives each key/value pair to update storage with. Any other key/value pairs in storage
        * will not be affected.</p><p>Primitive values such as numbers will serialize as expected. Values with a <code>
        * typeof</code> <code>"object"</code> and <code>"function"</code> will typically serialize to <code>{}</code>,
        * with the exception of <code>Array</code> (serializes as expected), <code>Date</code>, and <code>Regex</code>
        * (serialize using their <code>String</code> representation).</p>
        * @returns Callback on success, or on failure (in which case $(ref:runtime.lastError) will be set).
        */
      def set(items: Record[String, Any]): js.Promise[Unit] = js.native
    }
    
    /**
      * Object mapping each key that changed to its corresponding $(ref:storage.StorageChange) for that item.
      */
    trait StorageAreaOnChangedChangesType
      extends StObject
         with StorageChange
         with /* s */ StringDictionary[Any]
    object StorageAreaOnChangedChangesType {
      
      inline def apply(): StorageAreaOnChangedChangesType = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StorageAreaOnChangedChangesType]
      }
    }
    
    @js.native
    trait StorageAreaSync extends StObject {
      
      /**
        * Removes all items from storage.
        *
        * @returns Callback on success, or on failure (in which case $(ref:runtime.lastError) will be set).
        */
      def clear(): js.Promise[Unit] = js.native
      
      /**
        * Gets one or more items from storage.
        *
        * @param keys Optional. A single key to get, list of keys to get, or a dictionary specifying default values (see
        * description of the object).  An empty list or object will return an empty result object.  Pass in <code>null</code>
        * to get the entire contents of storage.
        * @returns Callback with storage items, or on failure (in which case $(ref:runtime.lastError) will be set).
        */
      def get(): js.Promise[Record[String, Any]] = js.native
      def get(keys: String): js.Promise[Record[String, Any]] = js.native
      def get(keys: js.Array[String]): js.Promise[Record[String, Any]] = js.native
      def get(keys: Record[String, Any]): js.Promise[Record[String, Any]] = js.native
      
      /**
        * Gets the amount of space (in bytes) being used by one or more items.
        *
        * @param keys Optional. A single key or list of keys to get the total usage for. An empty list will return 0.
        * Pass in <code>null</code> to get the total usage of all of storage.
        * @returns Callback with the amount of space being used by storage, or on failure (in which case $(ref:runtime.lastError)
        * will be set).
        */
      def getBytesInUse(): js.Promise[Double] = js.native
      def getBytesInUse(keys: String): js.Promise[Double] = js.native
      def getBytesInUse(keys: js.Array[String]): js.Promise[Double] = js.native
      
      /**
        * Fired when one or more items change.
        *
        * @param changes Object mapping each key that changed to its corresponding $(ref:storage.StorageChange) for that item.
        */
      var onChanged: Event[js.Function1[/* changes */ StorageAreaSyncOnChangedChangesType, Unit]] = js.native
      
      /**
        * Removes one or more items from storage.
        *
        * @param keys A single key or a list of keys for items to remove.
        * @returns Callback on success, or on failure (in which case $(ref:runtime.lastError) will be set).
        */
      def remove(keys: String): js.Promise[Unit] = js.native
      def remove(keys: js.Array[String]): js.Promise[Unit] = js.native
      
      /**
        * Sets multiple items.
        *
        * @param items <p>An object which gives each key/value pair to update storage with. Any other key/value pairs in storage
        * will not be affected.</p><p>Primitive values such as numbers will serialize as expected. Values with a <code>
        * typeof</code> <code>"object"</code> and <code>"function"</code> will typically serialize to <code>{}</code>,
        * with the exception of <code>Array</code> (serializes as expected), <code>Date</code>, and <code>Regex</code>
        * (serialize using their <code>String</code> representation).</p>
        * @returns Callback on success, or on failure (in which case $(ref:runtime.lastError) will be set).
        */
      def set(items: Record[String, Any]): js.Promise[Unit] = js.native
    }
    
    /**
      * Object mapping each key that changed to its corresponding $(ref:storage.StorageChange) for that item.
      */
    trait StorageAreaSyncOnChangedChangesType
      extends StObject
         with StorageChange
         with /* s */ StringDictionary[Any]
    object StorageAreaSyncOnChangedChangesType {
      
      inline def apply(): StorageAreaSyncOnChangedChangesType = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StorageAreaSyncOnChangedChangesType]
      }
    }
    
    trait StorageChange extends StObject {
      
      /**
        * The new value of the item, if there is a new value.
        * Optional.
        */
      var newValue: js.UndefOr[Any] = js.undefined
      
      /**
        * The old value of the item, if there was an old value.
        * Optional.
        */
      var oldValue: js.UndefOr[Any] = js.undefined
    }
    object StorageChange {
      
      inline def apply(): StorageChange = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StorageChange]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: StorageChange] (val x: Self) extends AnyVal {
        
        inline def setNewValue(value: Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
        
        inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
        
        inline def setOldValue(value: Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
        
        inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
      }
    }
    
    @js.native
    trait SyncStorageAreaSync
      extends StObject
         with StorageAreaSync {
      
      /**
        * The maximum number of items that can be stored in sync storage. Updates that would cause this limit to be exceeded will
        * fail immediately and set $(ref:runtime.lastError).
        */
      var MAX_ITEMS: `512` = js.native
      
      /**
        * <p>The maximum number of <code>set</code>, <code>remove</code>, or <code>clear</code>
        * operations that can be performed each hour. This is 1 every 2 seconds, a lower ceiling than the short term higher
        * writes-per-minute limit.</p><p>Updates that would cause this limit to be exceeded fail immediately and set $(ref:runtime.
        * lastError).</p>
        */
      var MAX_WRITE_OPERATIONS_PER_HOUR: `1800` = js.native
      
      /**
        * <p>The maximum number of <code>set</code>, <code>remove</code>, or <code>clear</code>
        * operations that can be performed each minute. This is 2 per second, providing higher throughput than writes-per-hour
        * over a shorter period of time.</p><p>Updates that would cause this limit to be exceeded fail immediately and set
        * $(ref:runtime.lastError).</p>
        */
      var MAX_WRITE_OPERATIONS_PER_MINUTE: `120` = js.native
      
      /**
        * The maximum total amount (in bytes) of data that can be stored in sync storage, as measured by the JSON stringification
        * of every value plus every key's length. Updates that would cause this limit to be exceeded fail immediately and set
        * $(ref:runtime.lastError).
        */
      var QUOTA_BYTES: `102400` = js.native
      
      /**
        * The maximum size (in bytes) of each individual item in sync storage, as measured by the JSON stringification of its
        * value plus its key length. Updates containing items larger than this limit will fail immediately and set $(ref:runtime.
        * lastError).
        */
      var QUOTA_BYTES_PER_ITEM: `8192` = js.native
    }
  }
}
