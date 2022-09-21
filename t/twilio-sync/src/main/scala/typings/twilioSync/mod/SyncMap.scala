package typings.twilioSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Sync map, which is a data structure that stores an unordered set of key-value pairs.
  * Use the {@link SyncClient.map} method to obtain a reference to a Sync map.
  * Information about rate limits can be found [here](https://www.twilio.com/docs/sync/limits).
  */
@JSImport("twilio-sync", "SyncMap")
@js.native
open class SyncMap protected () extends Closeable {
  /**
    * @internal
    */
  def this(syncMapImpl: SyncMapImpl) = this()
  
  def dateExpires: String = js.native
  
  /**
    * Date when the map was last updated.
    */
  def dateUpdated: js.Date = js.native
  
  /**
    * Retrieve an item by key.
    * @param key Identifies the desired item.
    * @return A promise that resolves when the item has been fetched.
    * This promise will be rejected if item was not found.
    * @example
    * ```typescript
    * map.get('myKey')
    *   .then((item) => {
    *     console.log('Map SyncMapItem get() successful, item data:', item.data)
    *   })
    *   .catch((error) => {
    *     console.error('Map SyncMapItem get() failed', error);
    *   });
    * ```
    */
  def get(key: String): js.Promise[SyncMapItem] = js.native
  
  /**
    * Get a complete list of items from the map.
    * Information about the query limits can be found [here](https://www.twilio.com/docs/sync/limits).
    * @param queryOptions Query options.
    * @example
    * ```typescript
    * const pageHandler = (paginator) => {
    *   paginator.items.forEach((item) => {
    *     console.log(`SyncMapItem ${item.key}: `, item.data);
    *   });
    *   return paginator.hasNextPage
    *     ? paginator.nextPage().then(pageHandler)
    *     : null;
    * };
    * map.getItems({ from: 'myKey', order: 'asc' })
    *   .then(pageHandler)
    *   .catch((error) => {
    *     console.error('Map getItems() failed', error);
    *   });
    * ```
    */
  def getItems(): js.Promise[Paginator[SyncMapItem]] = js.native
  def getItems(queryOptions: SyncMapItemQueryOptions): js.Promise[Paginator[SyncMapItem]] = js.native
  
  def lastEventId: Double = js.native
  
  def links: Any = js.native
  
  /**
    * Schedules a modification to this Map SyncMapItem that will apply a mutation function.
    * If no SyncMapItem with the given key exists, it will first be created, having the default data (`{}`).
    * @param key Selects the map item to be mutated.
    * @param mutator A function that outputs a new data based on the existing data.
    * May be called multiple times, particularly if this Map SyncMapItem is modified concurrently by remote code.
    * If the mutation ultimately succeeds, the Map SyncMapItem will have made the particular transition described
    * by this function.
    * @param itemMetadataUpdates New item metadata.
    * @return Resolves with the most recent item state, the output of a successful
    * mutation or a state that prompted graceful cancellation (mutator returned `null`).
    * @example
    * ```typescript
    * const mutatorFunction = (currentData) => {
    *     currentData.viewCount = (currentData.viewCount || 0) + 1;
    *     return currentData;
    * };
    * map.mutate('myKey', mutatorFunction, { ttl: 86400 })
    *   .then((item) => {
    *     console.log('Map SyncMapItem mutate() successful, new data:', item.data)
    *   })
    *   .catch((error) => {
    *     console.error('Map SyncMapItem mutate() failed', error);
    *   });
    * ```
    */
  def mutate(key: String, mutator: Mutator): js.Promise[SyncMapItem] = js.native
  def mutate(key: String, mutator: Mutator, itemMetadataUpdates: SyncMapItemMetadata): js.Promise[SyncMapItem] = js.native
  
  /**
    * Delete an item, given its key.
    * @param key Selects the item to delete.
    * @return A promise to remove an item.
    * The promise will be rejected if 'key' is undefined or an item was not found.
    * @example
    * ```typescript
    * map.remove('myKey')
    *   .then(() => {
    *     console.log('Map SyncMapItem remove() successful');
    *   })
    *   .catch((error) => {
    *     console.error('Map SyncMapItem remove() failed', error);
    *   });
    * ```
    */
  def remove(key: String): js.Promise[Unit] = js.native
  
  /**
    * Delete this map. It will be impossible to restore it.
    * @return A promise that resolves when the map has been deleted.
    * @example
    * ```typescript
    * map.removeMap()
    *   .then(() => {
    *     console.log('Map removeMap() successful');
    *   })
    *   .catch((error) => {
    *     console.error('Map removeMap() failed', error);
    *   });
    * ```
    */
  def removeMap(): js.Promise[Unit] = js.native
  
  def revision: String = js.native
  
  /**
    * Add a new item to the map with the given key-value pair. Overwrites any data that might already exist with that key.
    * @param key Unique item identifier.
    * @param data Data to be set.
    * @param itemMetadataUpdates New item metadata.
    * @return Newly added item, or modified one if already exists, with the latest known data.
    * @example
    * ```typescript
    * map.set('myKey', { name: 'John Smith' }, { ttl: 86400 })
    *   .then((item) => {
    *     console.log('Map SyncMapItem set() successful, item data:', item.data);
    *   })
    *   .catch((error) => {
    *     console.error('Map SyncMapItem set() failed', error);
    *   });
    * ```
    */
  def set(key: String, data: js.Object): js.Promise[SyncMapItem] = js.native
  def set(key: String, data: js.Object, itemMetadataUpdates: SyncMapItemMetadata): js.Promise[SyncMapItem] = js.native
  
  /**
    * Update the time-to-live of a map item.
    * @param key SyncMapItem key.
    * @param ttl Specifies the TTL in seconds after which the map item is subject to automatic deletion. The value 0 means infinity.
    * @return A promise that resolves after the TTL update was successful.
    * @example
    * ```typescript
    * map.setItemTtl('myKey', 86400)
    *   .then(() => {
    *     console.log('Map setItemTtl() successful');
    *   })
    *   .catch((error) => {
    *     console.error('Map setItemTtl() failed', error);
    *   });
    * ```
    */
  def setItemTtl(key: String, ttl: Double): js.Promise[Unit] = js.native
  
  /**
    * Update the time-to-live of the map.
    * @param ttl Specifies the TTL in seconds after which the map is subject to automatic deletion. The value 0 means infinity.
    * @return A promise that resolves after the TTL update was successful.
    * @example
    * ```typescript
    * map.setTtl(3600)
    *   .then(() => {
    *     console.log('Map setTtl() successful');
    *   })
    *   .catch((error) => {
    *     console.error('Map setTtl() failed', error);
    *   });
    * ```
    */
  def setTtl(ttl: Double): js.Promise[Unit] = js.native
  
  /**
    * An immutable identifier (a SID) assigned by the system on creation.
    */
  def sid: String = js.native
  
  /* private */ val syncMapImpl: Any = js.native
  
  def `type`: String = js.native
  
  /**
    * An optional immutable identifier that may be assigned by the
    * programmer to this map on creation. Unique among other Maps.
    */
  def uniqueName: String = js.native
  
  /**
    * Modify a map item by appending new fields (or by overwriting existing ones) with the values from
    * the provided Object. Creates a new item if no item by this key exists, copying all given fields and values
    * into it.
    * This is equivalent to
    * ```typescript
    * map.mutate('myKey', (currentData) => Object.assign(currentData, obj));
    * ```
    * @param key Selects the map item to update.
    * @param obj Specifies the particular (top-level) attributes that will receive new values.
    * @param itemMetadataUpdates New item metadata.
    * @return A promise resolving to the modified item in its new state.
    * @example
    * ```typescript
    * // Say, the Map SyncMapItem (key: `'myKey'`) data is `{ name: 'John Smith' }`
    * map.update('myKey', { age: 34 }, { ttl: 86400 })
    *   .then((item) => {
    *     // Now the Map SyncMapItem data is `{ name: 'John Smith', age: 34 }`
    *     console.log('Map SyncMapItem update() successful, new data:', item.data);
    *   })
    *   .catch((error) => {
    *     console.error('Map SyncMapItem update() failed', error);
    *   });
    * ```
    */
  def update(key: String, obj: js.Object): js.Promise[SyncMapItem] = js.native
  def update(key: String, obj: js.Object, itemMetadataUpdates: SyncMapItemMetadata): js.Promise[SyncMapItem] = js.native
  
  // private props
  def uri: String = js.native
}
object SyncMap {
  
  /**
    * Fired when a new item appears in the map, regardless of whether its creator was local or remote.
    *
    * Parameters:
    * 1. object `args` - info object provided with the event. It has the following properties:
    *     * {@link SyncMapItem} `item` - added item
    *     * boolean `isLocal` - equals true if the item was added by a local actor, false otherwise
    * @example
    * ```typescript
    * map.on('itemAdded', (args) => {
    *   console.log(`Map item ${args.item.key} was added`);
    *   console.log('args.item.data:', args.item.data);
    *   console.log('args.isLocal:', args.isLocal);
    * });
    * ```
    * @event
    */
  /* static member */
  @JSImport("twilio-sync", "SyncMap.itemAdded")
  @js.native
  val itemAdded: /* "itemAdded" */ String = js.native
  
  /**
    * Fired when a map item is removed, regardless of whether the remover was local or remote.
    *
    * Parameters:
    * 1. object `args` - info object provided with the event. It has the following properties:
    *     * string `key` - the key of the removed item
    *     * boolean `isLocal` - equals true if the item was added by a local actor, false otherwise
    *     * object `previousItemData` - contains a snapshot of the item data before removal
    * @example
    * ```typescript
    * map.on('itemRemoved', (args) => {
    *   console.log(`Map item ${args.key} was removed`);
    *   console.log('args.previousItemData:', args.previousItemData);
    *   console.log('args.isLocal:', args.isLocal);
    * });
    * ```
    * @event
    */
  /* static member */
  @JSImport("twilio-sync", "SyncMap.itemRemoved")
  @js.native
  val itemRemoved: /* "itemRemoved" */ String = js.native
  
  /**
    * Fired when a map item is updated (not added or removed, but changed), regardless of whether the updater was local or remote.
    *
    * Parameters:
    * 1. object `args` - info object provided with the event. It has the following properties:
    *     * {@link SyncMapItem} `item` - updated item
    *     * boolean `isLocal` - equals true if the item was updated by a local actor, false otherwise
    *     * object `previousItemData` - contains a snapshot of the item data before the update
    * @example
    * ```typescript
    * map.on('itemUpdated', (args) => {
    *   console.log(`Map item ${args.item.key} was updated`);
    *   console.log('args.item.data:', args.item.data);
    *   console.log('args.isLocal:', args.isLocal);
    *   console.log('args.previousItemData:', args.previousItemData);
    * });
    * ```
    * @event
    */
  /* static member */
  @JSImport("twilio-sync", "SyncMap.itemUpdated")
  @js.native
  val itemUpdated: /* "itemUpdated" */ String = js.native
  
  /**
    * Fired when a map is deleted entirely, by any actor local or remote.
    *
    * Parameters:
    * 1. object `args` - info object provided with the event. It has the following properties:
    *     * boolean `isLocal` - equals true if the map was removed by a local actor, false otherwise
    * @example
    * ```typescript
    * map.on('removed', (args) => {
    *   console.log(`Map ${map.sid} was removed`);
    *   console.log('args.isLocal:', args.isLocal);
    * });
    * ```
    * @event
    */
  /* static member */
  @JSImport("twilio-sync", "SyncMap.removed")
  @js.native
  val removed: /* "removed" */ String = js.native
}
