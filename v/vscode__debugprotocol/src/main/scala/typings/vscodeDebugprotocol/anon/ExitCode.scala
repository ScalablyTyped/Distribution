package typings.vscodeDebugprotocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExitCode extends StObject {
  
  /** The exit code returned from the debuggee. */
  var exitCode: Double
}
object ExitCode {
  
  inline def apply(exitCode: Double): ExitCode = {
    val __obj = js.Dynamic.literal(exitCode = exitCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExitCode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExitCode] (val x: Self) extends AnyVal {
    
    inline def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
  }
}
