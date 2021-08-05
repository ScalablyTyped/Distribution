package typings.twilioSync

import typings.twilioSync.entityMod.SyncEntity
import typings.twilioSync.servicesMod.Configuration
import typings.twilioSync.servicesMod.Network
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscriptionsMod {
  
  /**
    * @class Subscriptions
    * @classdesc A manager which, in batches of varying size, continuously persists the
    *      subscription intent of the caller to the Sync backend until it achieves a
    *      converged state.
    */
  @JSImport("twilio-sync/lib/subscriptions", "Subscriptions")
  @js.native
  class Subscriptions protected () extends StObject {
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
    
    /* private */ var applyEventToSubscribedEntity: js.Any = js.native
    
    /* private */ var applyNewSubscriptionUpdateBatch: js.Any = js.native
    
    /* private */ var applySubscriptionCancelledMessage: js.Any = js.native
    
    /* private */ var applySubscriptionEstablishedMessage: js.Any = js.native
    
    /* private */ var applySubscriptionFailedMessage: js.Any = js.native
    
    /* private */ var backoff: js.Any = js.native
    
    /* private */ var getSubscriptionUpdateBatch: js.Any = js.native
    
    /* private */ var isConnected: js.Any = js.native
    
    /* private */ var latestPokeResponseArrivalTimestampByCorrelationId: js.Any = js.native
    
    /* private */ var maxBatchSize: js.Any = js.native
    
    def onConnectionStateChanged(isConnected: Boolean): Unit = js.native
    
    /* private */ var onSubscriptionTtlElapsed: js.Any = js.native
    
    /* private */ var pendingPokeReason: js.Any = js.native
    
    /* private */ var persist: js.Any = js.native
    
    /* private */ var persisted: js.Any = js.native
    
    /**
      * Prompts a playback of any missed changes made to any subscribed object. This method
      * should be invoked whenever the connectivity layer has experienced cross-cutting
      * delivery failures that would affect the entire local sync set. Any tangible result
      * of this operation will result in calls to the _update() function of subscribed
      * Sync entities.
      */
    /* private */ var poke: js.Any = js.native
    
    /* private */ var processLocalActions: js.Any = js.native
    
    /* private */ var recordActionAttemptOn: js.Any = js.native
    
    /* private */ var recordActionFailureOn: js.Any = js.native
    
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
    
    /* private */ var request: js.Any = js.native
    
    /* private */ var services: js.Any = js.native
    
    /**
      * Stops all communication, clears any subscription intent, and returns.
      */
    def shutdown(): Unit = js.native
    
    /* private */ var subscriptionTtlTimer: js.Any = js.native
    
    /* private */ var subscriptions: js.Any = js.native
    
    /* private */ var verifyPokeDelivery: js.Any = js.native
  }
  
  trait SubscriptionsServices extends StObject {
    
    var config: Configuration
    
    var network: Network
  }
  object SubscriptionsServices {
    
    inline def apply(config: Configuration, network: Network): SubscriptionsServices = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscriptionsServices]
    }
    
    extension [Self <: SubscriptionsServices](x: Self) {
      
      inline def setConfig(value: Configuration): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setNetwork(value: Network): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    }
  }
}
