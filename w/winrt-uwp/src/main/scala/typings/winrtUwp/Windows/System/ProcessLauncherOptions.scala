package typings.winrtUwp.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessLauncherOptions extends StObject {
  
  var standardError: Any
  
  /* unmapped type */
  var standardInput: Any
  
  /* unmapped type */
  var standardOutput: Any
  
  /* unmapped type */
  var workingDirectory: Any
}
object ProcessLauncherOptions {
  
  inline def apply(standardError: Any, standardInput: Any, standardOutput: Any, workingDirectory: Any): ProcessLauncherOptions = {
    val __obj = js.Dynamic.literal(standardError = standardError.asInstanceOf[js.Any], standardInput = standardInput.asInstanceOf[js.Any], standardOutput = standardOutput.asInstanceOf[js.Any], workingDirectory = workingDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessLauncherOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProcessLauncherOptions] (val x: Self) extends AnyVal {
    
    inline def setStandardError(value: Any): Self = StObject.set(x, "standardError", value.asInstanceOf[js.Any])
    
    inline def setStandardInput(value: Any): Self = StObject.set(x, "standardInput", value.asInstanceOf[js.Any])
    
    inline def setStandardOutput(value: Any): Self = StObject.set(x, "standardOutput", value.asInstanceOf[js.Any])
    
    inline def setWorkingDirectory(value: Any): Self = StObject.set(x, "workingDirectory", value.asInstanceOf[js.Any])
  }
}
