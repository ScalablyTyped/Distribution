package typings
package twilioDashSyncLib.libEntityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-sync/lib/entity", "SyncEntity")
@js.native
abstract class SyncEntity protected () extends js.Object {
  def this(services: EntityServices, removalHandler: RemovalHandler) = this()
  val _attachedListeners: js.Any = js.native
  val indexName: java.lang.String = js.native
  val lastEventId: scala.Double = js.native
  val queryString: java.lang.String = js.native
  val services: EntityServices = js.native
  val sid: java.lang.String = js.native
  var subscriptionState: js.Any = js.native
  val `type`: java.lang.String = js.native
  val uniqueName: java.lang.String = js.native
  def _advanceLastEventId(eventId: scala.Double): scala.Unit = js.native
  def _advanceLastEventId(eventId: scala.Double, revision: java.lang.String): scala.Unit = js.native
  def _setSubscriptionState(newState: SubscriptionState): scala.Unit = js.native
  /**
    * Subscribe to changes of data entity
    * @private
    */
  def _subscribe(): scala.Unit = js.native
  /**
    * Unsubscribe from changes of current data entity
    * @private
    */
  def _unsubscribe(): scala.Unit = js.native
  def _update(update: js.Any, isStrictlyOrdered: scala.Boolean): scala.Unit = js.native
  def attach(closeable: twilioDashSyncLib.libCloseableMod.Closeable): scala.Unit = js.native
  /* protected */ def broadcastEventToListeners(eventName: java.lang.String, args: js.Any): scala.Unit = js.native
  /**
    * @public
    */
  def close(): scala.Unit = js.native
  def detach(listenerUuid: java.lang.String): scala.Unit = js.native
  /* protected */ def onRemoved(locally: scala.Boolean): scala.Unit = js.native
  /* protected */ def removalHandler(`type`: java.lang.String, sid: java.lang.String, uniqueName: java.lang.String): scala.Unit = js.native
  def reportFailure(err: twilioDashSyncLib.libUtilsSyncerrorMod.SyncError): scala.Unit = js.native
}

