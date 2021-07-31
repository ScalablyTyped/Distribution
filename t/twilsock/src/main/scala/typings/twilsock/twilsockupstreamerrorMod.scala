package typings.twilsock

import typings.twilsock.twilsockerrorMod.TwilsockError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object twilsockupstreamerrorMod {
  
  @JSImport("twilsock/lib/error/twilsockupstreamerror", "TwilsockUpstreamError")
  @js.native
  class TwilsockUpstreamError protected () extends TwilsockError {
    def this(status: Double, description: String) = this()
    def this(status: Double, description: String, body: js.Any) = this()
    
    val body: js.Any = js.native
    
    val description: js.Any = js.native
    
    val status: js.Any = js.native
  }
}
