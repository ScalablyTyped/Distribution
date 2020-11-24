package typings.twilioSync.synclistMod

import typings.std.Date
import typings.twilioSync.listitemMod.ListItem
import typings.twilioSync.mutatorMod.Mutator
import typings.twilioSync.paginatorMod.Paginator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @class
  * @alias List
  * @classdesc Represents a Sync List, which stores an ordered list of values.
  * Use the {@link Client#list} method to obtain a reference to a Sync List.
  * @property {String} sid - List unique id, immutable identifier assigned by the system.
  * @property {String} [uniqueName=null] - List unique name, immutable identifier that can be assigned to list during creation.
  * @property {Date} dateUpdated Date when the List was last updated.
  *
  * @fires List#removed
  * @fires List#itemAdded
  * @fires List#itemRemoved
  * @fires List#itemUpdated
  */
@JSImport("twilio-sync/lib/synclist", "SyncList")
@js.native
class SyncList protected ()
  extends typings.twilioSync.closeableMod.default {
  def this(syncListImpl: SyncListImpl) = this()
  
  def dateExpires: String = js.native
  
  def dateUpdated: Date = js.native
  
  /**
    * Retrieve an item by List index.
    * @param {Number} index Item index in a List.
    * @returns {Promise<ListItem>} A promise with an item containing latest known value.
    * A promise will be rejected if an item was not found.
    * @public
    * @example
    * list.get(42)
    *   .then(function(item) {
    *     console.log('List Item get() successful, item value:', item.value)
    *   })
    *   .catch(function(error) {
    *     console.error('List Item get() failed', error);
    *   });
    */
  def get(index: Double): js.Promise[ListItem] = js.native
  
  /**
    * Retrieve a List context
    * @returns {Promise<Object>} A promise with a List's context
    * @ignore
    */
  def getContext(): js.Promise[js.Object] = js.native
  
  /**
    * Query a list of items from collection.
    * @param {Object} [args] Arguments for query
    * @param {Number} [args.from] Item index, which should be used as the offset.
    * If undefined, starts from the beginning or end depending on args.order.
    * @param {Number} [args.pageSize=50] Results page size.
    * @param {'asc'|'desc'} [args.order='asc'] Numeric order of results.
    * @returns {Promise<Paginator<ListItem>>}
    * @public
    * @example
    * var pageHandler = function(paginator) {
    *   paginator.items.forEach(function(item) {
    *     console.log('Item ' + item.index + ': ', item.value);
    *   });
    *   return paginator.hasNextPage ? paginator.nextPage().then(pageHandler)
    *                                : null;
    * };
    * list.getItems({ from: 0, order: 'asc' })
    *   .then(pageHandler)
    *   .catch(function(error) {
    *     console.error('List getItems() failed', error);
    *   });
    */
  def getItems(args: js.Any): js.Promise[Paginator[ListItem]] = js.native
  
  def lastEventId: Double = js.native
  
  def links: js.Any = js.native
  
  /**
    * Modify an existing item by applying a mutation function to it.
    * @param {Number} index Index of an item to be changed.
    * @param {List~Mutator} mutator A function that outputs a new value based on the existing value.
    * @param {List#ItemMetadata} [itemMetadataUpdates] New item metadata.
    * @returns {Promise<ListItem>} Resolves with the most recent item state, the output of a successful
    *    mutation or a state that prompted graceful cancellation (mutator returned <code>null</code>). This promise
    *    will be rejected if the indicated item does not already exist.
    * @public
    * @example
    * var mutatorFunction = function(currentValue) {
    *     currentValue.viewCount = (currentValue.viewCount || 0) + 1;
    *     return currentValue;
    * };
    * list.mutate(42, mutatorFunction, { ttl: 86400 })
    *   .then(function(item) {
    *     console.log('List Item mutate() successful, new value:', item.value)
    *   })
    *   .catch(function(error) {
    *     console.error('List Item mutate() failed', error);
    *   });
    */
  def mutate(index: Double, mutator: Mutator): js.Promise[ListItem] = js.native
  def mutate(index: Double, mutator: Mutator, itemMetadataUpdates: ItemMetadata): js.Promise[ListItem] = js.native
  
  /**
    * Add a new item to the list.
    * @param {Object} value Value to be added.
    * @param {List#ItemMetadata} [itemMetadata] Item metadata.
    * @returns {Promise<ListItem>} A newly added item.
    * @public
    * @example
    * list.push({ name: 'John Smith' }, { ttl: 86400 })
    *   .then(function(item) {
    *     console.log('List Item push() successful, item index:' + item.index + ', value: ', item.value)
    *   })
    *   .catch(function(error) {
    *     console.error('List Item push() failed', error);
    *   });
    */
  def push(value: js.Any): js.Promise[ListItem] = js.native
  def push(value: js.Any, itemMetadata: ItemMetadata): js.Promise[ListItem] = js.native
  
  /**
    * Delete an item, given its index.
    * @param {Number} index Index of an item to be removed.
    * @returns {Promise<void>} A promise to remove an item.
    * A promise will be rejected if an item was not found.
    * @public
    * @example
    * list.remove(42)
    *   .then(function() {
    *     console.log('List Item remove() successful');
    *   })
    *   .catch(function(error) {
    *     console.error('List Item remove() failed', error);
    *   });
    */
  def remove(index: Double): js.Promise[Unit] = js.native
  
  /**
    * Delete this list. It will be impossible to restore it.
    * @return {Promise<void>} A promise that resolves when the list has been deleted.
    * @public
    * @example
    * list.removeList()
    *   .then(function() {
    *     console.log('List removeList() successful');
    *   })
    *   .catch(function(error) {
    *     console.error('List removeList() failed', error);
    *   });
    */
  def removeList(): js.Promise[Unit] = js.native
  
  def revision: String = js.native
  
  /**
    * Assign new value to an existing item, given its index.
    * @param {Number} index Index of the item to be updated.
    * @param {Object} value New value to be assigned to an item.
    * @param {List#ItemMetadata} [itemMetadataUpdates] New item metadata.
    * @returns {Promise<ListItem>} A promise with updated item containing latest known value.
    * The promise will be rejected if the item does not exist.
    * @public
    * @example
    * list.set(42, { name: 'John Smith' }, { ttl: 86400 })
    *   .then(function(item) {
    *     console.log('List Item set() successful, item value:', item.value)
    *   })
    *   .catch(function(error) {
    *     console.error('List Item set() failed', error);
    *   });
    */
  def set(index: Double, value: js.Object): js.Promise[ListItem] = js.native
  def set(index: Double, value: js.Object, itemMetadataUpdates: ItemMetadata): js.Promise[ListItem] = js.native
  
  /**
    * Update the time-to-live of a list item.
    * @param {Number} index Item index.
    * @param {Number} ttl Specifies the TTL in seconds after which the list item is subject to automatic deletion. The value 0 means infinity.
    * @return {Promise<void>} A promise that resolves after the TTL update was successful.
    * @public
    * @example
    * list.setItemTtl(42, 86400)
    *   .then(function() {
    *     console.log('List setItemTtl() successful');
    *   })
    *   .catch(function(error) {
    *     console.error('List setItemTtl() failed', error);
    *   });
    */
  def setItemTtl(index: Double, ttl: Double): js.Promise[Unit] = js.native
  
  /**
    * Update the time-to-live of the list.
    * @param {Number} ttl Specifies the TTL in seconds after which the list is subject to automatic deletion. The value 0 means infinity.
    * @return {Promise<void>} A promise that resolves after the TTL update was successful.
    * @public
    * @example
    * list.setTtl(3600)
    *   .then(function() {
    *     console.log('List setTtl() successful');
    *   })
    *   .catch(function(error) {
    *     console.error('List setTtl() failed', error);
    *   });
    */
  def setTtl(ttl: Double): js.Promise[Unit] = js.native
  
  def sid: String = js.native
  
  val syncListImpl: js.Any = js.native
  
  def `type`: String = js.native
  
  def uniqueName: String = js.native
  
  /**
    * Modify an existing item by appending new fields (or overwriting existing ones) with the values from Object.
    * This is equivalent to
    * <pre>
    * list.mutate(42, function(currentValue) {
    *   return Object.assign(currentValue, obj));
    * });
    * </pre>
    * @param {Number} index Index of an item to be changed.
    * @param {Object} obj Set of fields to update.
    * @param {List#ItemMetadata} [itemMetadataUpdates] New item metadata.
    * @returns {Promise<ListItem>} A promise with a modified item containing latest known value.
    * The promise will be rejected if an item was not found.
    * @public
    * @example
    * // Say, the List Item (index: 42) value is { name: 'John Smith' }
    * list.update(42, { age: 34 }, { ttl: 86400 })
    *   .then(function(item) {
    *     // Now the List Item value is { name: 'John Smith', age: 34 }
    *     console.log('List Item update() successful, new value:', item.value);
    *   })
    *   .catch(function(error) {
    *     console.error('List Item update() failed', error);
    *   });
    */
  def update(index: Double, obj: js.Object): js.Promise[ListItem] = js.native
  def update(index: Double, obj: js.Object, itemMetadataUpdates: ItemMetadata): js.Promise[ListItem] = js.native
  
  def uri: String = js.native
}
/* static members */
@JSImport("twilio-sync/lib/synclist", "SyncList")
@js.native
object SyncList extends js.Object {
  
  def `type`: String = js.native
}
