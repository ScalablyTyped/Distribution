package typings.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import typings.vscode.anon.Dark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminalOptions extends StObject {
  
  /**
    * The icon {@link ThemeColor} for the terminal.
    * The `terminal.ansi*` theme keys are
    * recommended for the best contrast and consistency across themes.
    */
  var color: js.UndefOr[ThemeColor] = js.undefined
  
  /**
    * A path or Uri for the current working directory to be used for the terminal.
    */
  var cwd: js.UndefOr[String | Uri] = js.undefined
  
  /**
    * Object with environment variables that will be added to the editor process.
    */
  var env: js.UndefOr[StringDictionary[js.UndefOr[String | Null]]] = js.undefined
  
  /**
    * When enabled the terminal will run the process as normal but not be surfaced to the user
    * until `Terminal.show` is called. The typical usage for this is when you need to run
    * something that may need interactivity but only want to tell the user about it when
    * interaction is needed. Note that the terminals will still be exposed to all extensions
    * as normal.
    */
  var hideFromUser: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The icon path or {@link ThemeIcon} for the terminal.
    */
  var iconPath: js.UndefOr[Uri | Dark | ThemeIcon] = js.undefined
  
  /**
    * Opt-out of the default terminal persistence on restart and reload.
    * This will only take effect when `terminal.integrated.enablePersistentSessions` is enabled.
    */
  var isTransient: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The {@link TerminalLocation} or {@link TerminalEditorLocationOptions} or {@link TerminalSplitLocationOptions} for the terminal.
    */
  var location: js.UndefOr[TerminalLocation | TerminalEditorLocationOptions | TerminalSplitLocationOptions] = js.undefined
  
  /**
    * A message to write to the terminal on first launch, note that this is not sent to the
    * process but, rather written directly to the terminal. This supports escape sequences such
    * a setting text style.
    */
  var message: js.UndefOr[String] = js.undefined
  
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
    * `terminal.integrated.env.windows` on top. When this is true, the complete environment
    * must be provided as nothing will be inherited from the process or any configuration.
    */
  var strictEnv: js.UndefOr[Boolean] = js.undefined
}
object TerminalOptions {
  
  inline def apply(): TerminalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminalOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TerminalOptions] (val x: Self) extends AnyVal {
    
    inline def setColor(value: ThemeColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCwd(value: String | Uri): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    inline def setEnv(value: StringDictionary[js.UndefOr[String | Null]]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setHideFromUser(value: Boolean): Self = StObject.set(x, "hideFromUser", value.asInstanceOf[js.Any])
    
    inline def setHideFromUserUndefined: Self = StObject.set(x, "hideFromUser", js.undefined)
    
    inline def setIconPath(value: Uri | Dark | ThemeIcon): Self = StObject.set(x, "iconPath", value.asInstanceOf[js.Any])
    
    inline def setIconPathUndefined: Self = StObject.set(x, "iconPath", js.undefined)
    
    inline def setIsTransient(value: Boolean): Self = StObject.set(x, "isTransient", value.asInstanceOf[js.Any])
    
    inline def setIsTransientUndefined: Self = StObject.set(x, "isTransient", js.undefined)
    
    inline def setLocation(value: TerminalLocation | TerminalEditorLocationOptions | TerminalSplitLocationOptions): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setShellArgs(value: js.Array[String] | String): Self = StObject.set(x, "shellArgs", value.asInstanceOf[js.Any])
    
    inline def setShellArgsUndefined: Self = StObject.set(x, "shellArgs", js.undefined)
    
    inline def setShellArgsVarargs(value: String*): Self = StObject.set(x, "shellArgs", js.Array(value*))
    
    inline def setShellPath(value: String): Self = StObject.set(x, "shellPath", value.asInstanceOf[js.Any])
    
    inline def setShellPathUndefined: Self = StObject.set(x, "shellPath", js.undefined)
    
    inline def setStrictEnv(value: Boolean): Self = StObject.set(x, "strictEnv", value.asInstanceOf[js.Any])
    
    inline def setStrictEnvUndefined: Self = StObject.set(x, "strictEnv", js.undefined)
  }
}
