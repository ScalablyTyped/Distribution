package typings.twilsock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @JSImport("twilsock/lib/logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilsock/lib/logger", "Logger")
  @js.native
  class Logger protected () extends StObject {
    def this(prefix: String) = this()
    
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
    @JSImport("twilsock/lib/logger", "Logger.debug")
    @js.native
    def debug(args: js.Any*): Unit = js.native
    
    /* static member */
    @JSImport("twilsock/lib/logger", "Logger.error")
    @js.native
    def error(args: js.Any*): Unit = js.native
    
    /* static member */
    @JSImport("twilsock/lib/logger", "Logger.info")
    @js.native
    def info(args: js.Any*): Unit = js.native
    
    /* static member */
    @JSImport("twilsock/lib/logger", "Logger.setLevel")
    @js.native
    def setLevel(level: js.Any): Unit = js.native
    
    /* static member */
    @JSImport("twilsock/lib/logger", "Logger.trace")
    @js.native
    def trace(args: js.Any*): Unit = js.native
    
    /* static member */
    @JSImport("twilsock/lib/logger", "Logger.warn")
    @js.native
    def warn(args: js.Any*): Unit = js.native
  }
  
  @JSImport("twilsock/lib/logger", "log")
  @js.native
  def log: Logger = js.native
  @scala.inline
  def log_=(x: Logger): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("log")(x.asInstanceOf[js.Any])
}
