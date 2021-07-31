package typings.twilioSync

import typings.std.Date
import typings.twilioSync.closeableMod.Closeable
import typings.twilioSync.entityMod.EntityServices
import typings.twilioSync.entityMod.RemovalHandler
import typings.twilioSync.entityMod.SyncEntity
import typings.twilioSync.mapitemMod.MapItem
import typings.twilioSync.mapitemMod.MapItemDescriptor
import typings.twilioSync.mutatorMod.Mutator
import typings.twilioSync.paginatorMod.Paginator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syncmapMod {
  
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
  @JSImport("twilio-sync/lib/syncmap", JSImport.Default)
  @js.native
  class default protected () extends SyncMap {
    def this(syncMapImpl: SyncMapImpl) = this()
  }
  
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
  class SyncMap protected () extends Closeable {
    def this(syncMapImpl: SyncMapImpl) = this()
    
    def dateExpires: String = js.native
    
    def dateUpdated: Date = js.native
    
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
    def get(key: String): js.Promise[MapItem] = js.native
    
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
    def getItems(): js.Promise[Paginator[MapItem]] = js.native
    def getItems(args: js.Any): js.Promise[Paginator[MapItem]] = js.native
    
    def lastEventId: Double = js.native
    
    def links: js.Any = js.native
    
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
    def mutate(key: String, mutator: Mutator): js.Promise[MapItem] = js.native
    def mutate(key: String, mutator: Mutator, itemMetadataUpdates: ItemMetadata): js.Promise[MapItem] = js.native
    
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
    def remove(key: String): js.Promise[Unit] = js.native
    
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
    def removeMap(): js.Promise[Unit] = js.native
    
    def revision: String = js.native
    
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
    def set(key: String, value: js.Object): js.Promise[MapItem] = js.native
    def set(key: String, value: js.Object, itemMetadataUpdates: ItemMetadata): js.Promise[MapItem] = js.native
    
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
    def setItemTtl(key: String, ttl: Double): js.Promise[Unit] = js.native
    
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
    def setTtl(ttl: Double): js.Promise[Unit] = js.native
    
    def sid: String = js.native
    
    val syncMapImpl: js.Any = js.native
    
    def `type`: String = js.native
    
    def uniqueName: String = js.native
    
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
    def update(key: String, obj: js.Object): js.Promise[MapItem] = js.native
    def update(key: String, obj: js.Object, itemMetadataUpdates: ItemMetadata): js.Promise[MapItem] = js.native
    
    def uri: String = js.native
  }
  
  @JSImport("twilio-sync/lib/syncmap", "SyncMapImpl")
  @js.native
  class SyncMapImpl protected () extends SyncEntity {
    /**
      * @private
      */
    def this(services: MapServices, descriptor: MapDescriptor, removalHandler: RemovalHandler) = this()
    
    var _getItemFromServer: js.Any = js.native
    
    var _handleItemMutated: js.Any = js.native
    
    /**
      * @private
      */
    /* protected */ def _handleItemRemoved(key: js.Any, eventId: js.Any, oldData: js.Any, dateUpdated: Date, remote: Boolean): Unit = js.native
    
    var _putItemToServer: js.Any = js.native
    
    var _putItemUnconditionally: js.Any = js.native
    
    var _putItemWithIfMatch: js.Any = js.native
    
    var _updateRootDateUpdated: js.Any = js.native
    
    val cache: js.Any = js.native
    
    def dateExpires: String = js.native
    
    def dateUpdated: Date = js.native
    
    val descriptor: js.Any = js.native
    
    var emitItemMutationEvent: js.Any = js.native
    
    def get(key: String): js.Promise[MapItem] = js.native
    
    def getItems(): js.Promise[Paginator[MapItem]] = js.native
    def getItems(args: js.Any): js.Promise[Paginator[MapItem]] = js.native
    
    def links: js.Any = js.native
    
    def mutate(key: String, mutator: Mutator): js.Promise[MapItem] = js.native
    def mutate(key: String, mutator: Mutator, itemMetadataUpdates: ItemMetadata): js.Promise[MapItem] = js.native
    
    /**
      * @private
      */
    /* protected */ def queryItems(): js.Promise[Paginator[MapItem]] = js.native
    /* protected */ def queryItems(args: js.Any): js.Promise[Paginator[MapItem]] = js.native
    
    def remove(key: String): js.Promise[Unit] = js.native
    
    def removeMap(): js.Promise[Unit] = js.native
    
    def revision: String = js.native
    
    def set(key: String, value: js.Object): js.Promise[MapItem] = js.native
    def set(key: String, value: js.Object, itemMetadataUpdates: ItemMetadata): js.Promise[MapItem] = js.native
    
    def setItemTtl(key: String, ttl: Double): js.Promise[Unit] = js.native
    
    def setTtl(ttl: Double): js.Promise[Unit] = js.native
    
    var shouldIgnoreEvent: js.Any = js.native
    
    def update(key: String, obj: js.Object): js.Promise[MapItem] = js.native
    def update(key: String, obj: js.Object, itemMetadataUpdates: ItemMetadata): js.Promise[MapItem] = js.native
    
    val updateMergingQueue: js.Any = js.native
    
    def uri: String = js.native
  }
  
  trait ItemMetadata extends StObject {
    
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object ItemMetadata {
    
    @scala.inline
    def apply(): ItemMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemMetadata]
    }
    
    @scala.inline
    implicit class ItemMetadataMutableBuilder[Self <: ItemMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  trait MapDescriptor extends StObject {
    
    var date_expires: String
    
    var date_updated: Date
    
    var items: js.UndefOr[js.Array[MapItemDescriptor]] = js.undefined
    
    var last_event_id: Double
    
    var links: js.Any
    
    var revision: String
    
    var sid: String
    
    var unique_name: String
    
    var url: String
  }
  object MapDescriptor {
    
    @scala.inline
    def apply(
      date_expires: String,
      date_updated: Date,
      last_event_id: Double,
      links: js.Any,
      revision: String,
      sid: String,
      unique_name: String,
      url: String
    ): MapDescriptor = {
      val __obj = js.Dynamic.literal(date_expires = date_expires.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], last_event_id = last_event_id.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapDescriptor]
    }
    
    @scala.inline
    implicit class MapDescriptorMutableBuilder[Self <: MapDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate_expires(value: String): Self = StObject.set(x, "date_expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate_updated(value: Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: js.Array[MapItemDescriptor]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: MapItemDescriptor*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setLast_event_id(value: Double): Self = StObject.set(x, "last_event_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinks(value: js.Any): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type MapServices = EntityServices
}
