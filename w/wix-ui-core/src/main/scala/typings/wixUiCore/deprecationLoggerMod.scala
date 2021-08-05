package typings.wixUiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecationLoggerMod {
  
  @JSImport("wix-ui-core/dist/src/utils/deprecation-logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("wix-ui-core/dist/src/utils/deprecation-logger", "depLogger")
  @js.native
  def depLogger: Logger = js.native
  inline def depLogger_=(x: Logger): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("depLogger")(x.asInstanceOf[js.Any])
  
  trait Logger extends StObject {
    
    def log(msg: String): Unit
  }
  object Logger {
    
    inline def apply(log: String => Unit): Logger = {
      val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log))
      __obj.asInstanceOf[Logger]
    }
    
    extension [Self <: Logger](x: Self) {
      
      inline def setLog(value: String => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    }
  }
}
