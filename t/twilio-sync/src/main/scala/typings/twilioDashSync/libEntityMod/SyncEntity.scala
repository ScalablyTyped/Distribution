package typings.twilioDashSync.libEntityMod

import typings.twilioDashSync.libCloseableMod.Closeable
import typings.twilioDashSync.libUtilsSyncerrorMod.SyncError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-sync/lib/entity", "SyncEntity")
@js.native
abstract class SyncEntity protected () extends js.Object {
  def this(services: EntityServices, removalHandler: RemovalHandler) = this()
  val _attachedListeners: js.Any = js.native
  val indexName: String = js.native
  val lastEventId: Double = js.native
  val queryString: String = js.native
  val services: EntityServices = js.native
  val sid: String = js.native
  var subscriptionState: js.Any = js.native
  val `type`: String = js.native
  val uniqueName: String = js.native
  def _advanceLastEventId(eventId: Double): Unit = js.native
  def _advanceLastEventId(eventId: Double, revision: String): Unit = js.native
  def _setSubscriptionState(newState: SubscriptionState): Unit = js.native
  /**
    * Subscribe to changes of data entity
    * @private
    */
  def _subscribe(): Unit = js.native
  /**
    * Unsubscribe from changes of current data entity
    * @private
    */
  def _unsubscribe(): Unit = js.native
  def _update(update: js.Any, isStrictlyOrdered: Boolean): Unit = js.native
  def attach(closeable: Closeable): Unit = js.native
  /* protected */ def broadcastEventToListeners(eventName: String, args: js.Any): Unit = js.native
  /**
    * @public
    */
  def close(): Unit = js.native
  def detach(listenerUuid: String): Unit = js.native
  /* protected */ def onRemoved(locally: Boolean): Unit = js.native
  /* protected */ def removalHandler(`type`: String, sid: String, uniqueName: String): Unit = js.native
  def reportFailure(err: SyncError): Unit = js.native
}

