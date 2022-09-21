package typings.tsLog

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ts-log", "dummyLogger")
  @js.native
  val dummyLogger: Logger = js.native
  
  @js.native
  trait Logger
    extends StObject
       with /* x */ StringDictionary[Any] {
    
    def debug(message: Any, optionalParams: Any*): Unit = js.native
    def debug(message: Unit, optionalParams: Any*): Unit = js.native
    
    def error(message: Any, optionalParams: Any*): Unit = js.native
    def error(message: Unit, optionalParams: Any*): Unit = js.native
    
    def info(message: Any, optionalParams: Any*): Unit = js.native
    def info(message: Unit, optionalParams: Any*): Unit = js.native
    
    def trace(message: Any, optionalParams: Any*): Unit = js.native
    def trace(message: Unit, optionalParams: Any*): Unit = js.native
    
    def warn(message: Any, optionalParams: Any*): Unit = js.native
    def warn(message: Unit, optionalParams: Any*): Unit = js.native
  }
}
