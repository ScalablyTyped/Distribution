package typings.twilioMcsClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configurationMod {
  
  @JSImport("twilio-mcs-client/lib/configuration", "Configuration")
  @js.native
  class Configuration protected () extends StObject {
    def this(token: String, baseUrl: String, options: js.Any) = this()
    
    val backoffConfigOverride: js.Any = js.native
    
    val baseUrl: String = js.native
    
    var region: js.Any = js.native
    
    val retryWhenThrottledOverride: Boolean = js.native
    
    var token: String = js.native
    
    def updateToken(token: String): Unit = js.native
  }
}
