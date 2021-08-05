package typings.twilioChat

import typings.twilioChat.sessionMod.Session
import typings.twilioChat.transportMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkMod {
  
  @JSImport("twilio-chat/lib/services/network", "Network")
  @js.native
  class Network protected () extends StObject {
    def this(config: js.Any, services: js.Any) = this()
    
    /* private */ var backoffConfig: js.Any = js.native
    
    /* private */ val cache: js.Any = js.native
    
    /* private */ var cacheLifetime: js.Any = js.native
    
    /* private */ var cleanupCache: js.Any = js.native
    
    /* private */ val config: js.Any = js.native
    
    /* private */ var executeWithRetry: js.Any = js.native
    
    def get(url: String): js.Promise[js.Any] = js.native
    
    /* private */ var isExpired: js.Any = js.native
    
    def pokeTimer(): Unit = js.native
    
    /* private */ var retryWhenThrottled: js.Any = js.native
    
    /* private */ val services: js.Any = js.native
    
    /* private */ var timer: js.Any = js.native
  }
  
  trait NetworkServices extends StObject {
    
    var session: Session
    
    var transport: Transport
  }
  object NetworkServices {
    
    inline def apply(session: Session, transport: Transport): NetworkServices = {
      val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkServices]
    }
    
    extension [Self <: NetworkServices](x: Self) {
      
      inline def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setTransport(value: Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
}
