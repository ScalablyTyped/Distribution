package typings.twilioDashSync

import typings.twilioDashSync.libClientInfoMod.ClientInfo
import typings.twilioDashSync.libInterfacesServicesMod.Network
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-sync/lib/services/network", JSImport.Namespace)
@js.native
object libServicesNetworkMod extends js.Object {
  /**
    * @classdesc Incapsulates network operations to make it possible to add some optimization/caching strategies
    */
  @js.native
  class NetworkService protected () extends Network {
    def this(clientInfo: ClientInfo, config: js.Any, transport: js.Any) = this()
    var backoffConfig: js.Any = js.native
    var clientInfo: ClientInfo = js.native
    var config: js.Any = js.native
    var createHeaders: js.Any = js.native
    var executeWithRetry: js.Any = js.native
    var transport: js.Any = js.native
  }
  
}

