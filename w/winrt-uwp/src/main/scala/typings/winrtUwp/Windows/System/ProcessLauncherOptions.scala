package typings.winrtUwp.Windows.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessLauncherOptions extends js.Object {
  
  var standardError: js.Any = js.native
  
   /* unmapped type */ var standardInput: js.Any = js.native
  
   /* unmapped type */ var standardOutput: js.Any = js.native
  
   /* unmapped type */ var workingDirectory: js.Any = js.native
}
object ProcessLauncherOptions {
  
  @scala.inline
  def apply(standardError: js.Any, standardInput: js.Any, standardOutput: js.Any, workingDirectory: js.Any): ProcessLauncherOptions = {
    val __obj = js.Dynamic.literal(standardError = standardError.asInstanceOf[js.Any], standardInput = standardInput.asInstanceOf[js.Any], standardOutput = standardOutput.asInstanceOf[js.Any], workingDirectory = workingDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessLauncherOptions]
  }
  
  @scala.inline
  implicit class ProcessLauncherOptionsOps[Self <: ProcessLauncherOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStandardError(value: js.Any): Self = this.set("standardError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardInput(value: js.Any): Self = this.set("standardInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardOutput(value: js.Any): Self = this.set("standardOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkingDirectory(value: js.Any): Self = this.set("workingDirectory", value.asInstanceOf[js.Any])
  }
}
