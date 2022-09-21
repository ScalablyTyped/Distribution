package typings.vscode.mod

import typings.vscode.anon.Dark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionTerminalOptions extends StObject {
  
  /**
    * The icon {@link ThemeColor} for the terminal.
    * The standard `terminal.ansi*` theme keys are
    * recommended for the best contrast and consistency across themes.
    */
  var color: js.UndefOr[ThemeColor] = js.undefined
  
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
    * A human-readable string which will be used to represent the terminal in the UI.
    */
  var name: String
  
  /**
    * An implementation of {@link Pseudoterminal} that allows an extension to
    * control a terminal.
    */
  var pty: Pseudoterminal
}
object ExtensionTerminalOptions {
  
  inline def apply(name: String, pty: Pseudoterminal): ExtensionTerminalOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pty = pty.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionTerminalOptions]
  }
  
  extension [Self <: ExtensionTerminalOptions](x: Self) {
    
    inline def setColor(value: ThemeColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setIconPath(value: Uri | Dark | ThemeIcon): Self = StObject.set(x, "iconPath", value.asInstanceOf[js.Any])
    
    inline def setIconPathUndefined: Self = StObject.set(x, "iconPath", js.undefined)
    
    inline def setIsTransient(value: Boolean): Self = StObject.set(x, "isTransient", value.asInstanceOf[js.Any])
    
    inline def setIsTransientUndefined: Self = StObject.set(x, "isTransient", js.undefined)
    
    inline def setLocation(value: TerminalLocation | TerminalEditorLocationOptions | TerminalSplitLocationOptions): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPty(value: Pseudoterminal): Self = StObject.set(x, "pty", value.asInstanceOf[js.Any])
  }
}
