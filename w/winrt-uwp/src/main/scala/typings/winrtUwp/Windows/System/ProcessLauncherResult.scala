package typings.winrtUwp.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessLauncherResult extends StObject {
  
  var exitCode: js.Any = js.native
}
object ProcessLauncherResult {
  
  @scala.inline
  def apply(exitCode: js.Any): ProcessLauncherResult = {
    val __obj = js.Dynamic.literal(exitCode = exitCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessLauncherResult]
  }
  
  @scala.inline
  implicit class ProcessLauncherResultMutableBuilder[Self <: ProcessLauncherResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExitCode(value: js.Any): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
  }
}
