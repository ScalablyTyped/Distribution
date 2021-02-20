package typings.tsLog

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ts-log", "dummyLogger")
  @js.native
  val dummyLogger: Logger = js.native
  
  @js.native
  trait Logger
    extends /* x */ StringDictionary[js.Any] {
    
    def debug(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
    def debug(message: js.Any, optionalParams: js.Any*): Unit = js.native
    
    def error(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
    def error(message: js.Any, optionalParams: js.Any*): Unit = js.native
    
    def info(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
    def info(message: js.Any, optionalParams: js.Any*): Unit = js.native
    
    def trace(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
    def trace(message: js.Any, optionalParams: js.Any*): Unit = js.native
    
    def warn(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
    def warn(message: js.Any, optionalParams: js.Any*): Unit = js.native
  }
}
