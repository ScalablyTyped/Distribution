package typings
package twilioDashSyncLib.libSyncmapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @alias Map
  * @classdesc Represents a Sync Map, which stores an unordered set of key:value pairs.
  * Use the {@link Client#map} method to obtain a reference to a Sync Map.
  * @property {String} sid An immutable identifier (a SID) assigned by the system on creation.
  * @property {String} [uniqueName=null] - An optional immutable identifier that may be assigned by the
  * programmer to this map on creation. Unique among other Maps.
  * @property {Date} dateUpdated Date when the Map was last updated.
  *
  * @fires Map#removed
  * @fires Map#itemAdded
  * @fires Map#itemRemoved
  * @fires Map#itemUpdated
  */
@JSImport("twilio-sync/lib/syncmap", "SyncMap")
@js.native
class SyncMap protected ()
  extends twilioDashSyncLib.libCloseableMod.Closeable {
  def this(syncMapImpl: SyncMapImpl) = this()
  val dateExpires: java.lang.String = js.native
  val dateUpdated: stdLib.Date = js.native
  val lastEventId: scala.Double = js.native
  val links: js.Any = js.native
  val revision: java.lang.String = js.native
  val sid: java.lang.String = js.native
  val syncMapImpl: js.Any = js.native
  val `type`: java.lang.String = js.native
  val uniqueName: java.lang.String = js.native
  val uri: java.lang.String = js.native
  /**
    * Enumerate all items in this Map.
    * This always triggers server interaction when being called for the first time on a Map; this may be latent.
    * This method not supported now and not meant to be used externally.
    * @param {Function} handler Function to handle each argument.
    * @private
    */
  def forEach(handler: js.Any): scala.Unit = js.native
  /**
    * Retrieve an item by key.
    * @param {String} key Identifies the desired item.
    * @returns {Promise<MapItem>} A promise that resolves when the item has been fetched.
    * This promise will be rejected if item was not found.
    * @public
    * @example
    * map.get('myKey')
    *   .then(function(item) {
    *     console.log('Map Item get() successful, item value:', item.value)
    *   })
    *   .catch(function(error) {
    *     console.error('Map Item get() failed', error);
    *   });
    */
  def get(key: java.lang.String): js.Promise[twilioDashSyncLib.libMapitemMod.MapItem] = js.native
  /**
    * Get a complete list of items from the map.
    * @param {Object} [args] Arguments for query.
    * @param {String} [args.from] Item key, which should be used as the offset. If undefined, starts from the beginning or end depending on args.order.
    * @param {Number} [args.pageSize=50] Result page size.
    * @param {'asc'|'desc'} [args.order='asc'] Lexicographical order of results.
    * @return {Promise<Paginator<MapItem>>}
    * @public
    * @example
    * var pageHandler = function(paginator) {
    *   paginator.items.forEach(function(item) {
    *     console.log('Item ' + item.key + ': ', item.value);
    *   });
    *   return paginator.hasNextPage ? paginator.nextPage().then(pageHandler)
    *                                : null;
    * };
    * map.getItems({ from: 'myKey', order: 'asc' })
    *   .then(pageHandler)
    *   .catch(function(error) {
    *     console.error('Map getItems() failed', error);
    *   });
    */
  def getItems(): js.Promise[
    twilioDashSyncLib.libPaginatorMod.Paginator[twilioDashSyncLib.libMapitemMod.MapItem]
  ] = js.native
  def getItems(args: js.Any): js.Promise[
    twilioDashSyncLib.libPaginatorMod.Paginator[twilioDashSyncLib.libMapitemMod.MapItem]
  ] = js.native
  /**
    * Schedules a modification to this Map Item that will apply a mutation function.
    * If no Item with the given key exists, it will first be created, having the default value (<code>{}</code>).
    * @param {String} key Selects the map item to be mutated.
    * @param {Map~Mutator} mutator A function that outputs a new value based on the existing value.
    * May be called multiple times, particularly if this Map Item is modified concurrently by remote code.
    * If the mutation ultimately succeeds, the Map Item will have made the particular transition described
    * by this function.
    * @param {Map#ItemMetadata} [itemMetadataUpdates] New item metadata.
    * @returns {Promise<MapItem>} Resolves with the most recent item state, the output of a successful
    * mutation or a state that prompted graceful cancellation (mutator returned <code>null</code>).
    * @public
    * @example
    * var mutatorFunction = function(currentValue) {
    *     currentValue.viewCount = (currentValue.viewCount || 0) + 1;
    *     return currentValue;
    * };
    * map.mutate('myKey', mutatorFunction, { ttl: 86400 })
    *   .then(function(item) {
    *     console.log('Map Item mutate() successful, new value:', item.value)
    *   })
    *   .catch(function(error) {
    *     console.error('Map Item mutate() failed', error);
    *   });
    */
  def mutate(key: java.lang.String, mutator: twilioDashSyncLib.libInterfacesMutatorMod.Mutator): js.Promise[twilioDashSyncLib.libMapitemMod.MapItem] = js.native
  def mutate(
    key: java.lang.String,
    mutator: twilioDashSyncLib.libInterfacesMutatorMod.Mutator,
    itemMetadataUpdates: ItemMetadata
  ): js.Promise[twilioDashSyncLib.libMapitemMod.MapItem] = js.native
  /**
    * Delete an item, given its key.
    * @param {String} key Selects the item to delete.
    * @returns {Promise<void>} A promise to remove an item.
    * The promise will be rejected if 'key' is undefined or an item was not found.
    * @public
    * @example
    * map.remove('myKey')
    *   .then(function() {
    *     console.log('Map Item remove() successful');
    *   })
    *   .catch(function(error) {
    *     console.error('Map Item remove() failed', error);
    *   });
    */
  def remove(key: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Delete this map. It will be impossible to restore it.
    * @return {Promise<void>} A promise that resolves when the map has been deleted.
    * @public
    * @example
    * map.removeMap()
    *   .then(function() {
    *     console.log('Map removeMap() successful');
    *   })
    *   .catch(function(error) {
    *     console.error('Map removeMap() failed', error);
    *   });
    */
  def removeMap(): js.Promise[scala.Unit] = js.native
  /**
    * Add a new item to the map with the given key:value pair. Overwrites any value that might already exist at that key.
    * @param {String} key Unique item identifier.
    * @param {Object} value Value to be set.
    * @param {Map#ItemMetadata} [itemMetadataUpdates] New item metadata.
    * @returns {Promise<MapItem>} Newly added item, or modified one if already exists, with the latest known value.
    * @public
    * @example
    * map.set('myKey', { name: 'John Smith' }, { ttl: 86400 })
    *   .then(function(item) {
    *     console.log('Map Item set() successful, item value:', item.value);
    *   })
    *   .catch(function(error) {
    *     console.error('Map Item set() failed', error);
    *   });
    */
  def set(key: java.lang.String, value: js.Object): js.Promise[twilioDashSyncLib.libMapitemMod.MapItem] = js.native
  def set(key: java.lang.String, value: js.Object, itemMetadataUpdates: ItemMetadata): js.Promise[twilioDashSyncLib.libMapitemMod.MapItem] = js.native
  /**
    * Update the time-to-live of a map item.
    * @param {Number} key Item key.
    * @param {Number} ttl Specifies the TTL in seconds after which the map item is subject to automatic deletion. The value 0 means infinity.
    * @return {Promise<void>} A promise that resolves after the TTL update was successful.
    * @public
    * @example
    * map.setItemTtl('myKey', 86400)
    *   .then(function() {
    *     console.log('Map setItemTtl() successful');
    *   })
    *   .catch(function(error) {
    *     console.error('Map setItemTtl() failed', error);
    *   });
    */
  def setItemTtl(key: java.lang.String, ttl: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Update the time-to-live of the map.
    * @param {Number} ttl Specifies the TTL in seconds after which the map is subject to automatic deletion. The value 0 means infinity.
    * @return {Promise<void>} A promise that resolves after the TTL update was successful.
    * @public
    * @example
    * map.setTtl(3600)
    *   .then(function() {
    *     console.log('Map setTtl() successful');
    *   })
    *   .catch(function(error) {
    *     console.error('Map setTtl() failed', error);
    *   });
    */
  def setTtl(ttl: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Modify a map item by appending new fields (or by overwriting existing ones) with the values from
    * the provided Object. Creates a new item if no item by this key exists, copying all given fields and values
    * into it.
    * This is equivalent to
    * <pre>
    * map.mutate('myKey', function(currentValue) {
    *   return Object.assign(currentValue, obj));
    * });
    * </pre>
    * @param {String} key Selects the map item to update.
    * @param {Object} obj Specifies the particular (top-level) attributes that will receive new values.
    * @param {Map#ItemMetadata} [itemMetadataUpdates] New item metadata.
    * @returns {Promise<MapItem>} A promise resolving to the modified item in its new state.
    * @public
    * @example
    * // Say, the Map Item (key: 'myKey') value is { name: 'John Smith' }
    * map.update('myKey', { age: 34 }, { ttl: 86400 })
    *   .then(function(item) {
    *     // Now the Map Item value is { name: 'John Smith', age: 34 }
    *     console.log('Map Item update() successful, new value:', item.value);
    *   })
    *   .catch(function(error) {
    *     console.error('Map Item update() failed', error);
    *   });
    */
  def update(key: java.lang.String, obj: js.Object): js.Promise[twilioDashSyncLib.libMapitemMod.MapItem] = js.native
  def update(key: java.lang.String, obj: js.Object, itemMetadataUpdates: ItemMetadata): js.Promise[twilioDashSyncLib.libMapitemMod.MapItem] = js.native
}

/* static members */
@JSImport("twilio-sync/lib/syncmap", "SyncMap")
@js.native
object SyncMap extends js.Object {
  val `type`: java.lang.String = js.native
}

