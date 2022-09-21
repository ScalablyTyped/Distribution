package typings.tsconfigPathsWebpackPlugin

import typings.chalk.mod.Chalk
import typings.tsconfigPathsWebpackPlugin.optionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @JSImport("tsconfig-paths-webpack-plugin/lib/logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeLogger(options: Options, colors: Chalk): Logger = (^.asInstanceOf[js.Dynamic].applyDynamic("makeLogger")(options.asInstanceOf[js.Any], colors.asInstanceOf[js.Any])).asInstanceOf[Logger]
  
  trait Logger extends StObject {
    
    def log(message: String): Unit
    
    def logError(message: String): Unit
    @JSName("logError")
    var logError_Original: LoggerFunc
    
    def logInfo(message: String): Unit
    @JSName("logInfo")
    var logInfo_Original: LoggerFunc
    
    def logWarning(message: String): Unit
    @JSName("logWarning")
    var logWarning_Original: LoggerFunc
    
    @JSName("log")
    var log_Original: LoggerFunc
  }
  object Logger {
    
    inline def apply(
      log: /* message */ String => Unit,
      logError: /* message */ String => Unit,
      logInfo: /* message */ String => Unit,
      logWarning: /* message */ String => Unit
    ): Logger = {
      val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log), logError = js.Any.fromFunction1(logError), logInfo = js.Any.fromFunction1(logInfo), logWarning = js.Any.fromFunction1(logWarning))
      __obj.asInstanceOf[Logger]
    }
    
    extension [Self <: Logger](x: Self) {
      
      inline def setLog(value: /* message */ String => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      inline def setLogError(value: /* message */ String => Unit): Self = StObject.set(x, "logError", js.Any.fromFunction1(value))
      
      inline def setLogInfo(value: /* message */ String => Unit): Self = StObject.set(x, "logInfo", js.Any.fromFunction1(value))
      
      inline def setLogWarning(value: /* message */ String => Unit): Self = StObject.set(x, "logWarning", js.Any.fromFunction1(value))
    }
  }
  
  type LoggerFunc = js.Function1[/* message */ String, Unit]
}
