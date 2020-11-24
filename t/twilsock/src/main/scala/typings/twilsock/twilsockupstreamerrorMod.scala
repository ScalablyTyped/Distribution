package typings.twilsock

import typings.twilsock.twilsockerrorMod.TwilsockError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilsock/lib/error/twilsockupstreamerror", JSImport.Namespace)
@js.native
object twilsockupstreamerrorMod extends js.Object {
  
  @js.native
  class TwilsockUpstreamError protected () extends TwilsockError {
    def this(status: Double, description: String) = this()
    def this(status: Double, description: String, body: js.Any) = this()
    
    val body: js.Any = js.native
    
    val description: js.Any = js.native
    
    val status: js.Any = js.native
  }
}
