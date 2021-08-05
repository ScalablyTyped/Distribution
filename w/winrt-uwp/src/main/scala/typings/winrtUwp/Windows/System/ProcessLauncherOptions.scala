package typings.winrtUwp.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessLauncherOptions extends StObject {
  
  var standardError: js.Any
  
  /* unmapped type */
  var standardInput: js.Any
  
  /* unmapped type */
  var standardOutput: js.Any
  
  /* unmapped type */
  var workingDirectory: js.Any
}
object ProcessLauncherOptions {
  
  inline def apply(standardError: js.Any, standardInput: js.Any, standardOutput: js.Any, workingDirectory: js.Any): ProcessLauncherOptions = {
    val __obj = js.Dynamic.literal(standardError = standardError.asInstanceOf[js.Any], standardInput = standardInput.asInstanceOf[js.Any], standardOutput = standardOutput.asInstanceOf[js.Any], workingDirectory = workingDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessLauncherOptions]
  }
  
  extension [Self <: ProcessLauncherOptions](x: Self) {
    
    inline def setStandardError(value: js.Any): Self = StObject.set(x, "standardError", value.asInstanceOf[js.Any])
    
    inline def setStandardInput(value: js.Any): Self = StObject.set(x, "standardInput", value.asInstanceOf[js.Any])
    
    inline def setStandardOutput(value: js.Any): Self = StObject.set(x, "standardOutput", value.asInstanceOf[js.Any])
    
    inline def setWorkingDirectory(value: js.Any): Self = StObject.set(x, "workingDirectory", value.asInstanceOf[js.Any])
  }
}
