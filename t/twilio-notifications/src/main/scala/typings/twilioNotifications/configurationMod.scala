package typings.twilioNotifications

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configurationMod {
  
  @JSImport("twilio-notifications/lib/configuration", "Configuration")
  @js.native
  class Configuration protected () extends StObject {
    def this(token: String) = this()
    def this(token: String, options: js.Any) = this()
    
    /* private */ var _token: js.Any = js.native
    
    val registrarUrl: String = js.native
    
    def token: String = js.native
    
    def updateToken(token: String): Unit = js.native
  }
}
