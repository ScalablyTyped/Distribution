package typings.twilioSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Sync list, which stores an ordered list of values.
  * Use the {@link SyncClient.list} method to obtain a reference to a Sync list.
  * Information about rate limits can be found [here](https://www.twilio.com/docs/sync/limits).
  */
@JSImport("twilio-sync", "SyncList")
@js.native
open class SyncList protected () extends Closeable {
  /**
    * @internal
    */
  def this(syncListImpl: SyncListImpl) = this()
  
  def dateExpires: String = js.native
  
  /**
    * Date when the list was last updated, given in UTC ISO 8601 format (e.g., '2018-04-26T15:23:19.732Z').
    */
  def dateUpdated: js.Date = js.native
  
  /**
    * Retrieve an item by List index.
    * @param index Item index in the list.
    * @return A promise with the item containing latest known data.
    * The promise will be rejected if the item was not found.
    * @example
    * ```typescript
    * list.get(42)
    *   .then((item) => {
    *     console.log('List Item get() successful, item data:', item.data)
    *   })
    *   .catch((error) => {
    *     console.error('List Item get() failed', error);
    *   });
    * ```
    */
  def get(index: Double): js.Promise[SyncListItem] = js.native
  
  /**
    * Retrieve a list context
    * @return A promise with the list's context
    * @internal
    */
  def getContext(): js.Promise[js.Object] = js.native
  
  /**
    * Query a list of items from collection.
    * Information about the query limits can be found {@link https://www.twilio.com/docs/sync/limits|here}.
    * @param queryOptions Query options.
    * @example
    * ```typescript
    * const pageHandler = (paginator) => {
    *   paginator.items.forEach((item) => {
    *     console.log(`Item ${item.index}:`, item.data);
    *   });
    *   return paginator.hasNextPage
    *     ? paginator.nextPage().then(pageHandler)
    *     : null;
    * };
    * list.getItems({ from: 0, order: 'asc' })
    *   .then(pageHandler)
    *   .catch((error) => {
    *     console.error('List getItems() failed', error);
    *   });
    * ```
    */
  def getItems(queryOptions: SyncListItemQueryOptions): js.Promise[Paginator[SyncListItem]] = js.native
  
  def lastEventId: Double = js.native
  
  def links: Any = js.native
  
  /**
    * Modify an existing item by applying a mutation function to it.
    * @param index Index of the item to be changed.
    * @param mutator A function that outputs a new data based on the existing data.
    * @param itemMetadataUpdates New item metadata.
    * @return Resolves with the most recent item state, the output of a successful
    * mutation or a state that prompted graceful cancellation (mutator returned `null`). This promise
    * will be rejected if the indicated item does not already exist.
    * @example
    * ```typescript
    * const mutatorFunction = (currentValue) => {
    *     currentValue.viewCount = (currentValue.viewCount || 0) + 1;
    *     return currentValue;
    * };
    * list.mutate(42, mutatorFunction, { ttl: 86400 })
    *   .then((item) => {
    *     console.log('List Item mutate() successful, new data:', item.data)
    *   })
    *   .catch((error) => {
    *     console.error('List Item mutate() failed', error);
    *   });
    * ```
    */
  def mutate(index: Double, mutator: Mutator): js.Promise[SyncListItem] = js.native
  def mutate(index: Double, mutator: Mutator, itemMetadataUpdates: SyncListItemMetadata): js.Promise[SyncListItem] = js.native
  
  /**
    * Add a new item to the list.
    * @param data Data to be added.
    * @param itemMetadata Item metadata.
    * @return The newly added item.
    * @example
    * ```typescript
    * list.push({ name: 'John Smith' }, { ttl: 86400 })
    *   .then((item) => {
    *     console.log(`List Item push() successful, item index: ${item.index}, data:`, item.data)
    *   })
    *   .catch((error) => {
    *     console.error('List Item push() failed', error);
    *   });
    * ```
    */
  def push(data: Any): js.Promise[SyncListItem] = js.native
  def push(data: Any, itemMetadata: SyncListItemMetadata): js.Promise[SyncListItem] = js.native
  
  /**
    * Delete an item given its index.
    * @param index Index of the item to be removed.
    * @return A promise to remove the item.
    * The promise will be rejected if the item was not found.
    * @example
    * ```typescript
    * list.remove(42)
    *   .then(() => {
    *     console.log('List Item remove() successful');
    *   })
    *   .catch((error) => {
    *     console.error('List Item remove() failed', error);
    *   });
    * ```
    */
  def remove(index: Double): js.Promise[Unit] = js.native
  
  /**
    * Delete this list. It will be impossible to restore it.
    * @return A promise that resolves when the list has been deleted.
    * @example
    * list.removeList()
    *   .then(() => {
    *     console.log('List removeList() successful');
    *   })
    *   .catch((error) => {
    *     console.error('List removeList() failed', error);
    *   });
    */
  def removeList(): js.Promise[Unit] = js.native
  
  def revision: String = js.native
  
  /**
    * Assign new data to an existing item, given its index.
    * @param index Index of the item to be updated.
    * @param value New data to be assigned to an item.
    * @param itemMetadataUpdates New item metadata.
    * @return A promise with the updated item containing latest known data.
    * The promise will be rejected if the item does not exist.
    * @example
    * ```typescript
    * list.set(42, { name: 'John Smith' }, { ttl: 86400 })
    *   .then((item) => {
    *     console.log('List Item set() successful, item data:', item.data)
    *   })
    *   .catch((error) => {
    *     console.error('List Item set() failed', error);
    *   });
    * ```
    */
  def set(index: Double, value: js.Object): js.Promise[SyncListItem] = js.native
  def set(index: Double, value: js.Object, itemMetadataUpdates: SyncListItemMetadata): js.Promise[SyncListItem] = js.native
  
  /**
    * Update the time-to-live of a list item.
    * @param index Item index.
    * @param ttl Specifies the TTL in seconds after which the list item is subject to automatic deletion. The value 0 means infinity.
    * @return A promise that resolves after the TTL update was successful.
    * @example
    * ```typescript
    * list.setItemTtl(42, 86400)
    *   .then(() => {
    *     console.log('List setItemTtl() successful');
    *   })
    *   .catch((error) => {
    *     console.error('List setItemTtl() failed', error);
    *   });
    * ```
    */
  def setItemTtl(index: Double, ttl: Double): js.Promise[Unit] = js.native
  
  /**
    * Update the time-to-live of the list.
    * @param ttl Specifies the TTL in seconds after which the list is subject to automatic deletion. The value 0 means infinity.
    * @return A promise that resolves after the TTL update was successful.
    * @example
    * ```typescript
    * list.setTtl(3600)
    *   .then(() => {
    *     console.log('List setTtl() successful');
    *   })
    *   .catch((error) => {
    *     console.error('List setTtl() failed', error);
    *   });
    * ```
    */
  def setTtl(ttl: Double): js.Promise[Unit] = js.native
  
  /**
    * Unique ID of the list, immutable identifier assigned by the system.
    */
  def sid: String = js.native
  
  /* private */ val syncListImpl: Any = js.native
  
  def `type`: String = js.native
  
  /**
    * Unique name of the list, immutable identifier that can be assigned to the list during creation.
    */
  def uniqueName: String = js.native
  
  /**
    * Modify an existing item by appending new fields (or overwriting existing ones) with the values from the object.
    * This is equivalent to
    * ```typescript
    * list.mutate(42, (currentValue) => Object.assign(currentValue, obj));
    * ```
    * @param index Index of an item to be changed.
    * @param obj Set of fields to update.
    * @param itemMetadataUpdates New item metadata.
    * @return A promise with a modified item containing latest known data.
    * The promise will be rejected if the item was not found.
    * @example
    * ```typescript
    * // Say, the List Item (index: 42) data is `{ name: 'John Smith' }`
    * list.update(42, { age: 34 }, { ttl: 86400 })
    *   .then((item) => {
    *     // Now the List Item data is `{ name: 'John Smith', age: 34 }`
    *     console.log('List Item update() successful, new data:', item.data);
    *   })
    *   .catch((error) => {
    *     console.error('List Item update() failed', error);
    *   });
    * ```
    */
  def update(index: Double, obj: js.Object): js.Promise[SyncListItem] = js.native
  def update(index: Double, obj: js.Object, itemMetadataUpdates: SyncListItemMetadata): js.Promise[SyncListItem] = js.native
  
  // private props
  def uri: String = js.native
}
object SyncList {
  
  /**
    * Fired when a new item appears in the list, regardless of whether its creator was local or remote.
    *
    * Parameters:
    * 1. object `args` - info object provided with the event. It has the following properties:
    *     * {@link SyncListItem} `item` - added item
    *     * boolean `isLocal` - equals true if the item was added by a local actor, false otherwise
    * @example
    * ```typescript
    * list.on('itemAdded', (args) => {
    *   console.log(`List item ${args.item.index} was added`);
    *   console.log('args.item.data:', args.item.data);
    *   console.log('args.isLocal:', args.isLocal);
    * });
    * ```
    * @event
    */
  /* static member */
  @JSImport("twilio-sync", "SyncList.itemAdded")
  @js.native
  val itemAdded: /* "itemAdded" */ String = js.native
  
  /**
    * Fired when a list item is removed, regardless of whether the remover was local or remote.
    *
    * Parameters:
    * 1. object `args` - info object provided with the event. It has the following properties:
    *     * number `index` - index of the removed item
    *     * boolean `isLocal` - equals true if the item was removed by a local actor, false otherwise
    *     * object `previousItemData` - contains a snapshot of the item data before the removal
    * @example
    * ```typescript
    * list.on('itemRemoved', (args) => {
    *   console.log(`List item ${args.index} was removed`);
    *   console.log('args.previousItemData:', args.previousItemData);
    *   console.log('args.isLocal:', args.isLocal);
    * });
    * ```
    * @event
    */
  /* static member */
  @JSImport("twilio-sync", "SyncList.itemRemoved")
  @js.native
  val itemRemoved: /* "itemRemoved" */ String = js.native
  
  /**
    * Fired when a list item is updated (not added or removed, but changed), regardless of whether the updater was local or remote.
    *
    * Parameters:
    * 1. object `args` - info object provided with the event. It has the following properties:
    *     * {@link SyncListItem} `item` - updated item
    *     * boolean `isLocal` - equals true if the item was updated by a local actor, false otherwise
    *     * object `previousItemData` - contains a snapshot of the item data before the update
    * @example
    * ```typescript
    * list.on('itemUpdated', (args) => {
    *   console.log(`List item ${args.item.index} was updated`);
    *   console.log('args.item.data:', args.item.data);
    *   console.log('args.isLocal:', args.isLocal);
    *   console.log('args.previousItemData:', args.previousItemData);
    * });
    * ```
    * @event
    */
  /* static member */
  @JSImport("twilio-sync", "SyncList.itemUpdated")
  @js.native
  val itemUpdated: /* "itemUpdated" */ String = js.native
  
  /**
    * Fired when a list is deleted entirely, by any actor local or remote.
    *
    * Parameters:
    * 1. object `args` - info object provided with the event. It has the following properties:
    *     * boolean `isLocal` - equals true if the list was removed by a local actor, false otherwise
    * @example
    * ```typescript
    * list.on('removed', (args) => {
    *   console.log(`List ${list.sid} was removed`);
    *   console.log('args.isLocal:', args.isLocal);
    * });
    * ```
    * @event
    */
  /* static member */
  @JSImport("twilio-sync", "SyncList.removed")
  @js.native
  val removed: /* "removed" */ String = js.native
}
