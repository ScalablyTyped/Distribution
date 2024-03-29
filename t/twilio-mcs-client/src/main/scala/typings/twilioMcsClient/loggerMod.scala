package typings.twilioMcsClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @JSImport("twilio-mcs-client/lib/logger", "Logger")
  @js.native
  /* private */ class Logger () extends StObject {
    
    def debug(args: js.Any*): Unit = js.native
    
    def error(args: js.Any*): Unit = js.native
    
    def info(args: js.Any*): Unit = js.native
    
    /* private */ var prefix: js.Any = js.native
    
    def setLevel(level: js.Any): Unit = js.native
    
    def trace(args: js.Any*): Unit = js.native
    
    def warn(args: js.Any*): Unit = js.native
  }
  object Logger {
    
    @JSImport("twilio-mcs-client/lib/logger", "Logger")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def debug(args: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def error(args: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def info(args: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def scope(prefix: String): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("scope")(prefix.asInstanceOf[js.Any]).asInstanceOf[Logger]
    
    /* static member */
    inline def setLevel(level: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLevel")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def trace(args: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def warn(args: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
