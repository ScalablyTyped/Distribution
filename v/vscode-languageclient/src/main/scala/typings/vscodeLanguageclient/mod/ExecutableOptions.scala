package typings.vscodeLanguageclient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutableOptions extends StObject {
  
  var cwd: js.UndefOr[String] = js.undefined
  
  var detached: js.UndefOr[Boolean] = js.undefined
  
  var env: js.UndefOr[js.Any] = js.undefined
  
  var shell: js.UndefOr[Boolean] = js.undefined
}
object ExecutableOptions {
  
  inline def apply(): ExecutableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutableOptions]
  }
  
  extension [Self <: ExecutableOptions](x: Self) {
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    inline def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
    
    inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
    
    inline def setEnv(value: js.Any): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setShell(value: Boolean): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    
    inline def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
  }
}
