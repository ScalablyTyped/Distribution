package typings.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugAdapterExecutableOptions extends StObject {
  
  /**
  		 * The current working directory for the executed debug adapter.
  		 */
  var cwd: js.UndefOr[String] = js.undefined
  
  /**
  		 * The additional environment of the executed program or shell. If omitted
  		 * the parent process' environment is used. If provided it is merged with
  		 * the parent process' environment.
  		 */
  var env: js.UndefOr[StringDictionary[String]] = js.undefined
}
object DebugAdapterExecutableOptions {
  
  inline def apply(): DebugAdapterExecutableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugAdapterExecutableOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DebugAdapterExecutableOptions] (val x: Self) extends AnyVal {
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    inline def setEnv(value: StringDictionary[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
  }
}
