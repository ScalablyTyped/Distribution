package typings.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShellExecutionOptions extends StObject {
  
  /**
    * The current working directory of the executed shell.
    * If omitted the tools current workspace root is used.
    */
  var cwd: js.UndefOr[String] = js.native
  
  /**
    * The additional environment of the executed shell. If omitted
    * the parent process' environment is used. If provided it is merged with
    * the parent process' environment.
    */
  var env: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The shell executable.
    */
  var executable: js.UndefOr[String] = js.native
  
  /**
    * The arguments to be passed to the shell executable used to run the task. Most shells
    * require special arguments to execute a command. For  example `bash` requires the `-c`
    * argument to execute a command, `PowerShell` requires `-Command` and `cmd` requires both
    * `/d` and `/c`.
    */
  var shellArgs: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The shell quotes supported by this shell.
    */
  var shellQuoting: js.UndefOr[ShellQuotingOptions] = js.native
}
object ShellExecutionOptions {
  
  @scala.inline
  def apply(): ShellExecutionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShellExecutionOptions]
  }
  
  @scala.inline
  implicit class ShellExecutionOptionsMutableBuilder[Self <: ShellExecutionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    @scala.inline
    def setEnv(value: StringDictionary[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    @scala.inline
    def setExecutable(value: String): Self = StObject.set(x, "executable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutableUndefined: Self = StObject.set(x, "executable", js.undefined)
    
    @scala.inline
    def setShellArgs(value: js.Array[String]): Self = StObject.set(x, "shellArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShellArgsUndefined: Self = StObject.set(x, "shellArgs", js.undefined)
    
    @scala.inline
    def setShellArgsVarargs(value: String*): Self = StObject.set(x, "shellArgs", js.Array(value :_*))
    
    @scala.inline
    def setShellQuoting(value: ShellQuotingOptions): Self = StObject.set(x, "shellQuoting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShellQuotingUndefined: Self = StObject.set(x, "shellQuoting", js.undefined)
  }
}
