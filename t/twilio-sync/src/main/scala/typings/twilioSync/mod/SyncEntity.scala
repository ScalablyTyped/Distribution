package typings.twilioSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncEntity extends StObject {
  
  def _advanceLastEventId(eventId: Double): Unit = js.native
  def _advanceLastEventId(eventId: Double, revision: String): Unit = js.native
  
  /* private */ val _attachedListeners: Any = js.native
  
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
  
  def _update(update: Any, isStrictlyOrdered: Boolean): Unit = js.native
  
  def attach(closeable: Closeable): Unit = js.native
  
  /* protected */ def broadcastEventToListeners(eventName: String, args: Any): Unit = js.native
  
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
  
  /* protected */ val services: EntityServices = js.native
  
  def sid: String = js.native
  
  /* private */ var subscriptionState: Any = js.native
  
  def `type`: String = js.native
  
  def uniqueName: String = js.native
}
