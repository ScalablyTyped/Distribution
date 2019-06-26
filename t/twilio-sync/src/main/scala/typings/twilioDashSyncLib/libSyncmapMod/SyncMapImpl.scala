package typings
package twilioDashSyncLib.libSyncmapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-sync/lib/syncmap", "SyncMapImpl")
@js.native
class SyncMapImpl protected ()
  extends twilioDashSyncLib.libEntityMod.SyncEntity {
  /**
    * @private
    */
  def this(services: MapServices, descriptor: MapDescriptor, removalHandler: twilioDashSyncLib.libEntityMod.RemovalHandler) = this()
  var _getItemFromServer: js.Any = js.native
  var _handleItemMutated: js.Any = js.native
  var _putItemToServer: js.Any = js.native
  var _putItemUnconditionally: js.Any = js.native
  var _putItemWithIfMatch: js.Any = js.native
  var _updateRootDateUpdated: js.Any = js.native
  val cache: js.Any = js.native
  val dateExpires: java.lang.String = js.native
  val dateUpdated: stdLib.Date = js.native
  val descriptor: js.Any = js.native
  var emitItemMutationEvent: js.Any = js.native
  val links: js.Any = js.native
  val revision: java.lang.String = js.native
  var shouldIgnoreEvent: js.Any = js.native
  val updateMergingQueue: js.Any = js.native
  val uri: java.lang.String = js.native
  /**
    * @private
    */
  /* protected */ def _handleItemRemoved(key: js.Any, eventId: js.Any, oldData: js.Any, dateUpdated: stdLib.Date, remote: scala.Boolean): scala.Unit = js.native
  /**
    * Enumerate all items in this Map.
    * This always triggers server interaction when being called for the first time on a Map; this may be latent.
    * This method not supported now and not meant to be used externally.
    * @param {Function} handler Function to handle each argument.
    * @private
    */
  def forEach(handler: js.Any): js.Promise[_] = js.native
  def get(key: java.lang.String): js.Promise[twilioDashSyncLib.libMapitemMod.MapItem] = js.native
  def getItems(): js.Promise[
    twilioDashSyncLib.libPaginatorMod.Paginator[twilioDashSyncLib.libMapitemMod.MapItem]
  ] = js.native
  def getItems(args: js.Any): js.Promise[
    twilioDashSyncLib.libPaginatorMod.Paginator[twilioDashSyncLib.libMapitemMod.MapItem]
  ] = js.native
  def mutate(key: java.lang.String, mutator: twilioDashSyncLib.libInterfacesMutatorMod.Mutator): js.Promise[twilioDashSyncLib.libMapitemMod.MapItem] = js.native
  def mutate(
    key: java.lang.String,
    mutator: twilioDashSyncLib.libInterfacesMutatorMod.Mutator,
    itemMetadataUpdates: ItemMetadata
  ): js.Promise[twilioDashSyncLib.libMapitemMod.MapItem] = js.native
  /**
    * @private
    */
  /* protected */ def queryItems(): js.Promise[
    twilioDashSyncLib.libPaginatorMod.Paginator[twilioDashSyncLib.libMapitemMod.MapItem]
  ] = js.native
  /* protected */ def queryItems(args: js.Any): js.Promise[
    twilioDashSyncLib.libPaginatorMod.Paginator[twilioDashSyncLib.libMapitemMod.MapItem]
  ] = js.native
  def remove(key: java.lang.String): js.Promise[scala.Unit] = js.native
  def removeMap(): js.Promise[scala.Unit] = js.native
  def set(key: java.lang.String, value: js.Object): js.Promise[twilioDashSyncLib.libMapitemMod.MapItem] = js.native
  def set(key: java.lang.String, value: js.Object, itemMetadataUpdates: ItemMetadata): js.Promise[twilioDashSyncLib.libMapitemMod.MapItem] = js.native
  def setItemTtl(key: java.lang.String, ttl: scala.Double): js.Promise[scala.Unit] = js.native
  def setTtl(ttl: scala.Double): js.Promise[scala.Unit] = js.native
  def update(key: java.lang.String, obj: js.Object): js.Promise[twilioDashSyncLib.libMapitemMod.MapItem] = js.native
  def update(key: java.lang.String, obj: js.Object, itemMetadataUpdates: ItemMetadata): js.Promise[twilioDashSyncLib.libMapitemMod.MapItem] = js.native
}

/* static members */
@JSImport("twilio-sync/lib/syncmap", "SyncMapImpl")
@js.native
object SyncMapImpl extends js.Object {
  val `type`: java.lang.String = js.native
}

