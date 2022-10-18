package typings.tslint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libErrorMod {
  
  @JSImport("tslint/lib/error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tslint/lib/error", "Error")
  @js.native
  open class Error () extends StObject {
    def this(message: String) = this()
    
    var message: String = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var stack: js.UndefOr[String] = js.native
  }
  
  @JSImport("tslint/lib/error", "FatalError")
  @js.native
  open class FatalError protected () extends Error {
    def this(message: String) = this()
    def this(message: String, innerError: Error) = this()
    
    var innerError: js.UndefOr[Error] = js.native
  }
  /* static members */
  object FatalError {
    
    @JSImport("tslint/lib/error", "FatalError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/error", "FatalError.NAME")
    @js.native
    def NAME: String = js.native
    inline def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
  }
  
  inline def isError(possibleError: Any): /* is tslint.tslint/lib/error.Error */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isError")(possibleError.asInstanceOf[js.Any]).asInstanceOf[/* is tslint.tslint/lib/error.Error */ Boolean]
  
  inline def showRuleCrashWarning(message: String, ruleName: String, fileName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showRuleCrashWarning")(message.asInstanceOf[js.Any], ruleName.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def showWarningOnce(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showWarningOnce")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
