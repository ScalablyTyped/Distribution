package typings.winrtUwp.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessLauncherResult extends StObject {
  
  var exitCode: Any
}
object ProcessLauncherResult {
  
  inline def apply(exitCode: Any): ProcessLauncherResult = {
    val __obj = js.Dynamic.literal(exitCode = exitCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessLauncherResult]
  }
  
  extension [Self <: ProcessLauncherResult](x: Self) {
    
    inline def setExitCode(value: Any): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
  }
}
