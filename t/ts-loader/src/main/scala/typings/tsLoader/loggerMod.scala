package typings.tsLoader

import org.scalablytyped.runtime.TopLevel
import typings.chalk.mod.Chalk
import typings.tsLoader.interfacesMod.LoaderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-loader/dist/logger", JSImport.Namespace)
@js.native
object loggerMod extends js.Object {
  
  def makeLogger(loaderOptions: LoaderOptions, colors: Chalk): Logger = js.native
  
  @js.native
  sealed trait LogLevel extends js.Object
  @js.native
  object LogLevel extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LogLevel with Double] = js.native
    
    @js.native
    sealed trait ERROR extends LogLevel
    /* 3 */ @js.native
    object ERROR extends TopLevel[ERROR with Double]
    
    @js.native
    sealed trait INFO extends LogLevel
    /* 1 */ @js.native
    object INFO extends TopLevel[INFO with Double]
    
    @js.native
    sealed trait WARN extends LogLevel
    /* 2 */ @js.native
    object WARN extends TopLevel[WARN with Double]
  }
  
  @js.native
  trait Logger extends js.Object {
    
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
