package typings.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminalOptions extends StObject {
  
  /**
    * A path or Uri for the current working directory to be used for the terminal.
    */
  var cwd: js.UndefOr[String | Uri] = js.undefined
  
  /**
    * Object with environment variables that will be added to the VS Code process.
    */
  var env: js.UndefOr[StringDictionary[String | Null]] = js.undefined
  
  /**
    * When enabled the terminal will run the process as normal but not be surfaced to the user
    * until `Terminal.show` is called. The typical usage for this is when you need to run
    * something that may need interactivity but only want to tell the user about it when
    * interaction is needed. Note that the terminals will still be exposed to all extensions
    * as normal.
    */
  var hideFromUser: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A human-readable string which will be used to represent the terminal in the UI.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Args for the custom shell executable. A string can be used on Windows only which allows
    * specifying shell args in [command-line format](https://msdn.microsoft.com/en-au/08dfcab2-eb6e-49a4-80eb-87d4076c98c6).
    */
  var shellArgs: js.UndefOr[js.Array[String] | String] = js.undefined
  
  /**
    * A path to a custom shell executable to be used in the terminal.
    */
  var shellPath: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the terminal process environment should be exactly as provided in
    * `TerminalOptions.env`. When this is false (default), the environment will be based on the
    * window's environment and also apply configured platform settings like
    * `terminal.integrated.windows.env` on top. When this is true, the complete environment
    * must be provided as nothing will be inherited from the process or any configuration.
    */
  var strictEnv: js.UndefOr[Boolean] = js.undefined
}
object TerminalOptions {
  
  @scala.inline
  def apply(): TerminalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminalOptions]
  }
  
  @scala.inline
  implicit class TerminalOptionsMutableBuilder[Self <: TerminalOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCwd(value: String | Uri): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    @scala.inline
    def setEnv(value: StringDictionary[String | Null]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    @scala.inline
    def setHideFromUser(value: Boolean): Self = StObject.set(x, "hideFromUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideFromUserUndefined: Self = StObject.set(x, "hideFromUser", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setShellArgs(value: js.Array[String] | String): Self = StObject.set(x, "shellArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShellArgsUndefined: Self = StObject.set(x, "shellArgs", js.undefined)
    
    @scala.inline
    def setShellArgsVarargs(value: String*): Self = StObject.set(x, "shellArgs", js.Array(value :_*))
    
    @scala.inline
    def setShellPath(value: String): Self = StObject.set(x, "shellPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShellPathUndefined: Self = StObject.set(x, "shellPath", js.undefined)
    
    @scala.inline
    def setStrictEnv(value: Boolean): Self = StObject.set(x, "strictEnv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictEnvUndefined: Self = StObject.set(x, "strictEnv", js.undefined)
  }
}
