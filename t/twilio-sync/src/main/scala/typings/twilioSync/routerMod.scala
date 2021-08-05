package typings.twilioSync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routerMod {
  
  @JSImport("twilio-sync/lib/router", JSImport.Default)
  @js.native
  class default protected () extends Router {
    def this(params: js.Any) = this()
  }
  
  @JSImport("twilio-sync/lib/router", "Router")
  @js.native
  class Router protected () extends StObject {
    def this(params: js.Any) = this()
    
    /* private */ var config: js.Any = js.native
    
    /* private */ var notifications: js.Any = js.native
    
    /**
      * Handle transport establishing event
      * If we have any subscriptions - we should check object for modifications
      */
    def onConnectionStateChanged(isConnected: Boolean): Unit = js.native
    
    /**
      * Entry point for all incoming messages
      * @param {String} type - Type of incoming message
      * @param {Object} message - Message to route
      */
    def onMessage(`type`: String, message: js.Any): Unit = js.native
    
    /**
      * Subscribe for events
      */
    def subscribe(sid: String, entity: js.Any): Unit = js.native
    
    /* private */ var subscriptions: js.Any = js.native
    
    /**
      * Unsubscribe from events
      */
    def unsubscribe(sid: String): Unit = js.native
  }
}
