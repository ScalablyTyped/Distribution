package typings.twilioSync.synclistMod

import typings.std.Date
import typings.twilioSync.entityMod.RemovalHandler
import typings.twilioSync.entityMod.SyncEntity
import typings.twilioSync.listitemMod.ListItem
import typings.twilioSync.mutatorMod.Mutator
import typings.twilioSync.paginatorMod.Paginator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-sync/lib/synclist", "SyncListImpl")
@js.native
class SyncListImpl protected () extends SyncEntity {
  /**
    * @private
    */
  def this(services: ListServices, descriptor: ListDescriptor, removalHandler: RemovalHandler) = this()
  var _addOrUpdateItemOnServer: js.Any = js.native
  var _getItemFromServer: js.Any = js.native
  /**
    * @private
    */
  var _handleContextUpdate: js.Any = js.native
  var _handleItemMutated: js.Any = js.native
  /**
    * @private
    */
  var _handleItemRemoved: js.Any = js.native
  /**
    * @private
    */
  var _updateContextIfRequired: js.Any = js.native
  var _updateItemUnconditionally: js.Any = js.native
  var _updateItemWithIfMatch: js.Any = js.native
  var _updateRootDateUpdated: js.Any = js.native
  var cache: js.Any = js.native
  var context: js.Any = js.native
  var contextEventId: js.Any = js.native
  val dateExpires: String = js.native
  val dateUpdated: Date = js.native
  var descriptor: js.Any = js.native
  /**
    * @private
    */
  var emitItemMutationEvent: js.Any = js.native
  val links: js.Any = js.native
  val revision: String = js.native
  var shouldIgnoreEvent: js.Any = js.native
  var updateMergingQueue: js.Any = js.native
  val uri: String = js.native
  def get(index: Double): js.Promise[ListItem] = js.native
  /**
    * @return {Promise<Object>} Context of List
    * @private
    */
  def getContext(): js.Promise[js.Object] = js.native
  def getItems(args: js.Any): js.Promise[Paginator[ListItem]] = js.native
  def mutate(index: Double, mutator: Mutator): js.Promise[ListItem] = js.native
  def mutate(index: Double, mutator: Mutator, itemMetadataUpdates: ItemMetadata): js.Promise[ListItem] = js.native
  def push(value: js.Any): js.Promise[ListItem] = js.native
  def push(value: js.Any, itemMetadata: ItemMetadata): js.Promise[ListItem] = js.native
  /**
    * Query items from the List
    * @private
    */
  /* protected */ def queryItems(arg: js.Any): js.Promise[Paginator[ListItem]] = js.native
  def remove(index: Double): js.Promise[Unit] = js.native
  def removeList(): js.Promise[Unit] = js.native
  def set(index: Double, value: js.Object): js.Promise[ListItem] = js.native
  def set(index: Double, value: js.Object, itemMetadataUpdates: ItemMetadata): js.Promise[ListItem] = js.native
  def setItemTtl(index: Double, ttl: Double): js.Promise[Unit] = js.native
  def setTtl(ttl: Double): js.Promise[Unit] = js.native
  def update(index: Double, obj: js.Object): js.Promise[ListItem] = js.native
  def update(index: Double, obj: js.Object, itemMetadataUpdates: ItemMetadata): js.Promise[ListItem] = js.native
}

/* static members */
@JSImport("twilio-sync/lib/synclist", "SyncListImpl")
@js.native
object SyncListImpl extends js.Object {
  val `type`: String = js.native
}

