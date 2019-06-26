package typings
package twilioDashSyncLib.libSynclistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-sync/lib/synclist", "SyncListImpl")
@js.native
class SyncListImpl protected ()
  extends twilioDashSyncLib.libEntityMod.SyncEntity {
  /**
    * @private
    */
  def this(services: ListServices, descriptor: ListDescriptor, removalHandler: twilioDashSyncLib.libEntityMod.RemovalHandler) = this()
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
  val dateExpires: java.lang.String = js.native
  val dateUpdated: stdLib.Date = js.native
  var descriptor: js.Any = js.native
  /**
    * @private
    */
  var emitItemMutationEvent: js.Any = js.native
  val links: js.Any = js.native
  val revision: java.lang.String = js.native
  var shouldIgnoreEvent: js.Any = js.native
  var updateMergingQueue: js.Any = js.native
  val uri: java.lang.String = js.native
  def get(index: scala.Double): js.Promise[twilioDashSyncLib.libListitemMod.ListItem] = js.native
  /**
    * @return {Promise<Object>} Context of List
    * @private
    */
  def getContext(): js.Promise[js.Object] = js.native
  def getItems(args: js.Any): js.Promise[
    twilioDashSyncLib.libPaginatorMod.Paginator[twilioDashSyncLib.libListitemMod.ListItem]
  ] = js.native
  def mutate(index: scala.Double, mutator: twilioDashSyncLib.libInterfacesMutatorMod.Mutator): js.Promise[twilioDashSyncLib.libListitemMod.ListItem] = js.native
  def mutate(
    index: scala.Double,
    mutator: twilioDashSyncLib.libInterfacesMutatorMod.Mutator,
    itemMetadataUpdates: ItemMetadata
  ): js.Promise[twilioDashSyncLib.libListitemMod.ListItem] = js.native
  def push(value: js.Any): js.Promise[twilioDashSyncLib.libListitemMod.ListItem] = js.native
  def push(value: js.Any, itemMetadata: ItemMetadata): js.Promise[twilioDashSyncLib.libListitemMod.ListItem] = js.native
  /**
    * Query items from the List
    * @private
    */
  /* protected */ def queryItems(arg: js.Any): js.Promise[
    twilioDashSyncLib.libPaginatorMod.Paginator[twilioDashSyncLib.libListitemMod.ListItem]
  ] = js.native
  def remove(index: scala.Double): js.Promise[scala.Unit] = js.native
  def removeList(): js.Promise[scala.Unit] = js.native
  def set(index: scala.Double, value: js.Object): js.Promise[twilioDashSyncLib.libListitemMod.ListItem] = js.native
  def set(index: scala.Double, value: js.Object, itemMetadataUpdates: ItemMetadata): js.Promise[twilioDashSyncLib.libListitemMod.ListItem] = js.native
  def setItemTtl(index: scala.Double, ttl: scala.Double): js.Promise[scala.Unit] = js.native
  def setTtl(ttl: scala.Double): js.Promise[scala.Unit] = js.native
  def update(index: scala.Double, obj: js.Object): js.Promise[twilioDashSyncLib.libListitemMod.ListItem] = js.native
  def update(index: scala.Double, obj: js.Object, itemMetadataUpdates: ItemMetadata): js.Promise[twilioDashSyncLib.libListitemMod.ListItem] = js.native
}

/* static members */
@JSImport("twilio-sync/lib/synclist", "SyncListImpl")
@js.native
object SyncListImpl extends js.Object {
  val `type`: java.lang.String = js.native
}

