package typings.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessExecutionOptions extends StObject {
  
  /**
    * The current working directory of the executed program or shell.
    * If omitted the tools current workspace root is used.
    */
  var cwd: js.UndefOr[String] = js.native
  
  /**
    * The additional environment of the executed program or shell. If omitted
    * the parent process' environment is used. If provided it is merged with
    * the parent process' environment.
    */
  var env: js.UndefOr[StringDictionary[String]] = js.native
}
object ProcessExecutionOptions {
  
  @scala.inline
  def apply(): ProcessExecutionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessExecutionOptions]
  }
  
  @scala.inline
  implicit class ProcessExecutionOptionsMutableBuilder[Self <: ProcessExecutionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    @scala.inline
    def setEnv(value: StringDictionary[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
  }
}
