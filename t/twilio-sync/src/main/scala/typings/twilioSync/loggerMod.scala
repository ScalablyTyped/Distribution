package typings.twilioSync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  object default {
    
    @JSImport("twilio-sync/lib/utils/logger", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def debug(args: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def error(args: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def info(args: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def setLevel(level: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLevel")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def trace(args: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def warn(args: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
