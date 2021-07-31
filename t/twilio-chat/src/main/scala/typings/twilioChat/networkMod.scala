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
    
    var backoffConfig: js.Any = js.native
    
    val cache: js.Any = js.native
    
    var cacheLifetime: js.Any = js.native
    
    var cleanupCache: js.Any = js.native
    
    val config: js.Any = js.native
    
    var executeWithRetry: js.Any = js.native
    
    def get(url: String): js.Promise[js.Any] = js.native
    
    var isExpired: js.Any = js.native
    
    def pokeTimer(): Unit = js.native
    
    var retryWhenThrottled: js.Any = js.native
    
    val services: js.Any = js.native
    
    var timer: js.Any = js.native
  }
  
  trait NetworkServices extends StObject {
    
    var session: Session
    
    var transport: Transport
  }
  object NetworkServices {
    
    @scala.inline
    def apply(session: Session, transport: Transport): NetworkServices = {
      val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkServices]
    }
    
    @scala.inline
    implicit class NetworkServicesMutableBuilder[Self <: NetworkServices] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransport(value: Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
}
