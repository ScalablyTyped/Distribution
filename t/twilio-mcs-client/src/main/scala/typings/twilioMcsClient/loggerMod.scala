package typings.twilioMcsClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @JSImport("twilio-mcs-client/lib/logger", "Logger")
  @js.native
  class Logger protected () extends StObject {
    
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
    @JSImport("twilio-mcs-client/lib/logger", "Logger.debug")
    @js.native
    def debug(args: js.Any*): Unit = js.native
    
    /* static member */
    @JSImport("twilio-mcs-client/lib/logger", "Logger.error")
    @js.native
    def error(args: js.Any*): Unit = js.native
    
    /* static member */
    @JSImport("twilio-mcs-client/lib/logger", "Logger.info")
    @js.native
    def info(args: js.Any*): Unit = js.native
    
    /* static member */
    @JSImport("twilio-mcs-client/lib/logger", "Logger.scope")
    @js.native
    def scope(prefix: String): Logger = js.native
    
    /* static member */
    @JSImport("twilio-mcs-client/lib/logger", "Logger.setLevel")
    @js.native
    def setLevel(level: js.Any): Unit = js.native
    
    /* static member */
    @JSImport("twilio-mcs-client/lib/logger", "Logger.trace")
    @js.native
    def trace(args: js.Any*): Unit = js.native
    
    /* static member */
    @JSImport("twilio-mcs-client/lib/logger", "Logger.warn")
    @js.native
    def warn(args: js.Any*): Unit = js.native
  }
}
