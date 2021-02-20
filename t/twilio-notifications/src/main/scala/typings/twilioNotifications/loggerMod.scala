package typings.twilioNotifications

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @JSImport("twilio-notifications/lib/logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio-notifications/lib/logger", "Logger")
  @js.native
  class Logger () extends StObject {
    
    def debug(args: js.Any*): Unit = js.native
    
    def error(args: js.Any*): Unit = js.native
    
    def info(args: js.Any*): Unit = js.native
    
    var prefix: js.Any = js.native
    
    def setLevel(level: js.Any): Unit = js.native
    
    def trace(args: js.Any*): Unit = js.native
    
    def warn(args: js.Any*): Unit = js.native
  }
  object Logger {
    
    /* static member */
    @JSImport("twilio-notifications/lib/logger", "Logger.scope")
    @js.native
    def scope(): Logger = js.native
    @JSImport("twilio-notifications/lib/logger", "Logger.scope")
    @js.native
    def scope(prefix: String): Logger = js.native
  }
  
  @JSImport("twilio-notifications/lib/logger", "log")
  @js.native
  def log: Logger = js.native
  @scala.inline
  def log_=(x: Logger): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("log")(x.asInstanceOf[js.Any])
}
