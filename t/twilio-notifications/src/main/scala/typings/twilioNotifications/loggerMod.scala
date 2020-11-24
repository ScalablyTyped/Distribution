package typings.twilioNotifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-notifications/lib/logger", JSImport.Namespace)
@js.native
object loggerMod extends js.Object {
  
  var log: Logger = js.native
  
  @js.native
  class Logger () extends js.Object {
    
    def debug(args: js.Any*): Unit = js.native
    
    def error(args: js.Any*): Unit = js.native
    
    def info(args: js.Any*): Unit = js.native
    
    var prefix: js.Any = js.native
    
    def setLevel(level: js.Any): Unit = js.native
    
    def trace(args: js.Any*): Unit = js.native
    
    def warn(args: js.Any*): Unit = js.native
  }
  /* static members */
  @js.native
  object Logger extends js.Object {
    
    def scope(): Logger = js.native
    def scope(prefix: String): Logger = js.native
  }
}
