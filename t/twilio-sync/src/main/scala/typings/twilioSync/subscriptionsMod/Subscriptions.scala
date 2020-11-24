package typings.twilioSync.subscriptionsMod

import typings.twilioSync.entityMod.SyncEntity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @class Subscriptions
  * @classdesc A manager which, in batches of varying size, continuously persists the
  *      subscription intent of the caller to the Sync backend until it achieves a
  *      converged state.
  */
@JSImport("twilio-sync/lib/subscriptions", "Subscriptions")
@js.native
class Subscriptions protected () extends js.Object {
  /**
    * @constructor
    * Prepares a new Subscriptions manager object with zero subscribed or persisted subscriptions.
    *
    * @param {object} config may include a key 'backoffConfig', wherein any of the parameters
    *      of Backoff.exponential (from npm 'backoff') are valid and will override the defaults.
    *
    * @param {Network} must be a viable running Sync Network object, useful for routing requests.
    */
  def this(services: SubscriptionsServices) = this()
  
  /**
    * The point of ingestion for remote incoming messages (e.g. new data was written to a map
    * to which we are subscribed).
    *
    * @param {object} message is the full, unaltered body of the incoming notification.
    *
    * @return undefined
    */
  def acceptMessage(message: js.Any, isStrictlyOrdered: Boolean): Unit = js.native
  
  /**
    * Establishes intent to be subscribed to this entity. That subscription will be effected
    * asynchronously.
    * If subscription to the given sid already exists, it will be overwritten.
    *
    * @param {String} sid should be a well-formed SID, uniquely identifying a single instance of a Sync entity.
    * @param {Object} entity should represent the (singular) local representation of this entity.
    *      Incoming events and modifications to the entity will be directed at the _update() function
    *      of this provided reference.
    *
    * @return undefined
    */
  def add(sid: String, entity: SyncEntity): Unit = js.native
  
  var applyEventToSubscribedEntity: js.Any = js.native
  
  var applyNewSubscriptionUpdateBatch: js.Any = js.native
  
  var applySubscriptionCancelledMessage: js.Any = js.native
  
  var applySubscriptionEstablishedMessage: js.Any = js.native
  
  var applySubscriptionFailedMessage: js.Any = js.native
  
  var backoff: js.Any = js.native
  
  var getSubscriptionUpdateBatch: js.Any = js.native
  
  var isConnected: js.Any = js.native
  
  var latestPokeResponseArrivalTimestampByCorrelationId: js.Any = js.native
  
  var maxBatchSize: js.Any = js.native
  
  def onConnectionStateChanged(isConnected: Boolean): Unit = js.native
  
  var onSubscriptionTtlElapsed: js.Any = js.native
  
  var pendingPokeReason: js.Any = js.native
  
  var persist: js.Any = js.native
  
  var persisted: js.Any = js.native
  
  /**
    * Prompts a playback of any missed changes made to any subscribed object. This method
    * should be invoked whenever the connectivity layer has experienced cross-cutting
    * delivery failures that would affect the entire local sync set. Any tangible result
    * of this operation will result in calls to the _update() function of subscribed
    * Sync entities.
    */
  var poke: js.Any = js.native
  
  var processLocalActions: js.Any = js.native
  
  var recordActionAttemptOn: js.Any = js.native
  
  var recordActionFailureOn: js.Any = js.native
  
  /**
    * Establishes the caller's intent to no longer be subscribed to this entity. Following this
    * call, no further events shall be routed to the local representation of the entity, even
    * though a server-side subscription may take more time to actually terminate.
    *
    * @param {string} sid should be any well-formed SID, uniquely identifying a Sync entity.
    *      This call only has meaningful effect if that entity is subscribed at the
    *      time of call. Otherwise does nothing.
    *
    * @return undefined
    */
  def remove(sid: String): Unit = js.native
  
  var request: js.Any = js.native
  
  var services: js.Any = js.native
  
  /**
    * Stops all communication, clears any subscription intent, and returns.
    */
  def shutdown(): Unit = js.native
  
  var subscriptionTtlTimer: js.Any = js.native
  
  var subscriptions: js.Any = js.native
  
  var verifyPokeDelivery: js.Any = js.native
}
