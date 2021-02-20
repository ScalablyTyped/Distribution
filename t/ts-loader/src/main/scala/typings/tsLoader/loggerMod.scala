package typings.tsLoader

import typings.chalk.mod.Chalk
import typings.tsLoader.interfacesMod.LoaderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @js.native
  sealed trait LogLevel extends StObject
  @JSImport("ts-loader/dist/logger", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LogLevel with Double] = js.native
    
    @js.native
    sealed trait ERROR extends LogLevel
    /* 3 */ val ERROR: typings.tsLoader.loggerMod.LogLevel.ERROR with Double = js.native
    
    @js.native
    sealed trait INFO extends LogLevel
    /* 1 */ val INFO: typings.tsLoader.loggerMod.LogLevel.INFO with Double = js.native
    
    @js.native
    sealed trait WARN extends LogLevel
    /* 2 */ val WARN: typings.tsLoader.loggerMod.LogLevel.WARN with Double = js.native
  }
  
  @JSImport("ts-loader/dist/logger", "makeLogger")
  @js.native
  def makeLogger(loaderOptions: LoaderOptions, colors: Chalk): Logger = js.native
  
  @js.native
  trait Logger extends StObject {
    
    def log(message: String): Unit = js.native
    
    def logError(message: String): Unit = js.native
    @JSName("logError")
    var logError_Original: LoggerFunc = js.native
    
    def logInfo(message: String): Unit = js.native
    @JSName("logInfo")
    var logInfo_Original: LoggerFunc = js.native
    
    def logWarning(message: String): Unit = js.native
    @JSName("logWarning")
    var logWarning_Original: LoggerFunc = js.native
    
    @JSName("log")
    var log_Original: LoggerFunc = js.native
  }
  
  type LoggerFunc = js.Function1[/* message */ String, Unit]
}
