package typings.twilioSync

import typings.twilioSync.clientInfoMod.ClientInfo
import typings.twilioSync.servicesMod.Network
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkMod {
  
  /**
    * @classdesc Incapsulates network operations to make it possible to add some optimization/caching strategies
    */
  @JSImport("twilio-sync/lib/services/network", "NetworkService")
  @js.native
  class NetworkService protected ()
    extends StObject
       with Network {
    def this(clientInfo: ClientInfo, config: js.Any, transport: js.Any) = this()
    
    /* private */ var backoffConfig: js.Any = js.native
    
    var clientInfo: ClientInfo = js.native
    
    var config: js.Any = js.native
    
    /* private */ var createHeaders: js.Any = js.native
    
    /* private */ var executeWithRetry: js.Any = js.native
    
    var transport: js.Any = js.native
  }
}
