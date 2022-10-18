package typings.tsLoader

import typings.chalk.mod.Chalk
import typings.tsLoader.distInterfacesMod.LoaderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLoggerMod {
  
  @JSImport("ts-loader/dist/logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait LogLevel extends StObject
  @JSImport("ts-loader/dist/logger", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LogLevel & Double] = js.native
    
    @js.native
    sealed trait ERROR
      extends StObject
         with LogLevel
    /* 3 */ val ERROR: typings.tsLoader.distLoggerMod.LogLevel.ERROR & Double = js.native
    
    @js.native
    sealed trait INFO
      extends StObject
         with LogLevel
    /* 1 */ val INFO: typings.tsLoader.distLoggerMod.LogLevel.INFO & Double = js.native
    
    @js.native
    sealed trait WARN
      extends StObject
         with LogLevel
    /* 2 */ val WARN: typings.tsLoader.distLoggerMod.LogLevel.WARN & Double = js.native
  }
  
  inline def makeLogger(loaderOptions: LoaderOptions, colors: Chalk): Logger = (^.asInstanceOf[js.Dynamic].applyDynamic("makeLogger")(loaderOptions.asInstanceOf[js.Any], colors.asInstanceOf[js.Any])).asInstanceOf[Logger]
  
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
