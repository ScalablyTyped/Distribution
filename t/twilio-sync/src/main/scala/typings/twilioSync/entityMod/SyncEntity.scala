package typings.twilioSync.entityMod

import typings.twilioSync.closeableMod.Closeable
import typings.twilioSync.syncerrorMod.SyncError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-sync/lib/entity", "SyncEntity")
@js.native
abstract class SyncEntity protected () extends js.Object {
  protected def this(services: EntityServices, removalHandler: RemovalHandler) = this()
  val _attachedListeners: js.Any = js.native
  val services: EntityServices = js.native
  var subscriptionState: js.Any = js.native
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
  def indexName: String = js.native
  def lastEventId: Double = js.native
  /* protected */ def onRemoved(locally: Boolean): Unit = js.native
  def queryString: String = js.native
  /* protected */ def removalHandler(`type`: String, sid: String, uniqueName: String): Unit = js.native
  def reportFailure(err: SyncError): Unit = js.native
  def sid: String = js.native
  def `type`: String = js.native
  def uniqueName: String = js.native
}

