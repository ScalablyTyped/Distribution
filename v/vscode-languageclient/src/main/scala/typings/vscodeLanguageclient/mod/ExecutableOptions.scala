package typings.vscodeLanguageclient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecutableOptions extends StObject {
  
  var cwd: js.UndefOr[String] = js.native
  
  var detached: js.UndefOr[Boolean] = js.native
  
  var env: js.UndefOr[js.Any] = js.native
  
  var shell: js.UndefOr[Boolean] = js.native
}
object ExecutableOptions {
  
  @scala.inline
  def apply(): ExecutableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutableOptions]
  }
  
  @scala.inline
  implicit class ExecutableOptionsMutableBuilder[Self <: ExecutableOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    @scala.inline
    def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
    
    @scala.inline
    def setEnv(value: js.Any): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    @scala.inline
    def setShell(value: Boolean): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
  }
}
