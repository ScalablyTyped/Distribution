package typings.xterm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITheme extends StObject {
  
  /** The default background color */
  var background: js.UndefOr[String] = js.native
  
  /** ANSI black (eg. `\x1b[30m`) */
  var black: js.UndefOr[String] = js.native
  
  /** ANSI blue (eg. `\x1b[34m`) */
  var blue: js.UndefOr[String] = js.native
  
  /** ANSI bright black (eg. `\x1b[1;30m`) */
  var brightBlack: js.UndefOr[String] = js.native
  
  /** ANSI bright blue (eg. `\x1b[1;34m`) */
  var brightBlue: js.UndefOr[String] = js.native
  
  /** ANSI bright cyan (eg. `\x1b[1;36m`) */
  var brightCyan: js.UndefOr[String] = js.native
  
  /** ANSI bright green (eg. `\x1b[1;32m`) */
  var brightGreen: js.UndefOr[String] = js.native
  
  /** ANSI bright magenta (eg. `\x1b[1;35m`) */
  var brightMagenta: js.UndefOr[String] = js.native
  
  /** ANSI bright red (eg. `\x1b[1;31m`) */
  var brightRed: js.UndefOr[String] = js.native
  
  /** ANSI bright white (eg. `\x1b[1;37m`) */
  var brightWhite: js.UndefOr[String] = js.native
  
  /** ANSI bright yellow (eg. `\x1b[1;33m`) */
  var brightYellow: js.UndefOr[String] = js.native
  
  /** The cursor color */
  var cursor: js.UndefOr[String] = js.native
  
  /** The accent color of the cursor (fg color for a block cursor) */
  var cursorAccent: js.UndefOr[String] = js.native
  
  /** ANSI cyan (eg. `\x1b[36m`) */
  var cyan: js.UndefOr[String] = js.native
  
  /** The default foreground color */
  var foreground: js.UndefOr[String] = js.native
  
  /** ANSI green (eg. `\x1b[32m`) */
  var green: js.UndefOr[String] = js.native
  
  /** ANSI magenta (eg. `\x1b[35m`) */
  var magenta: js.UndefOr[String] = js.native
  
  /** ANSI red (eg. `\x1b[31m`) */
  var red: js.UndefOr[String] = js.native
  
  /** The selection background color (can be transparent) */
  var selection: js.UndefOr[String] = js.native
  
  /** ANSI white (eg. `\x1b[37m`) */
  var white: js.UndefOr[String] = js.native
  
  /** ANSI yellow (eg. `\x1b[33m`) */
  var yellow: js.UndefOr[String] = js.native
}
object ITheme {
  
  @scala.inline
  def apply(): ITheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITheme]
  }
  
  @scala.inline
  implicit class IThemeMutableBuilder[Self <: ITheme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBlack(value: String): Self = StObject.set(x, "black", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlackUndefined: Self = StObject.set(x, "black", js.undefined)
    
    @scala.inline
    def setBlue(value: String): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlueUndefined: Self = StObject.set(x, "blue", js.undefined)
    
    @scala.inline
    def setBrightBlack(value: String): Self = StObject.set(x, "brightBlack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrightBlackUndefined: Self = StObject.set(x, "brightBlack", js.undefined)
    
    @scala.inline
    def setBrightBlue(value: String): Self = StObject.set(x, "brightBlue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrightBlueUndefined: Self = StObject.set(x, "brightBlue", js.undefined)
    
    @scala.inline
    def setBrightCyan(value: String): Self = StObject.set(x, "brightCyan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrightCyanUndefined: Self = StObject.set(x, "brightCyan", js.undefined)
    
    @scala.inline
    def setBrightGreen(value: String): Self = StObject.set(x, "brightGreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrightGreenUndefined: Self = StObject.set(x, "brightGreen", js.undefined)
    
    @scala.inline
    def setBrightMagenta(value: String): Self = StObject.set(x, "brightMagenta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrightMagentaUndefined: Self = StObject.set(x, "brightMagenta", js.undefined)
    
    @scala.inline
    def setBrightRed(value: String): Self = StObject.set(x, "brightRed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrightRedUndefined: Self = StObject.set(x, "brightRed", js.undefined)
    
    @scala.inline
    def setBrightWhite(value: String): Self = StObject.set(x, "brightWhite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrightWhiteUndefined: Self = StObject.set(x, "brightWhite", js.undefined)
    
    @scala.inline
    def setBrightYellow(value: String): Self = StObject.set(x, "brightYellow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrightYellowUndefined: Self = StObject.set(x, "brightYellow", js.undefined)
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorAccent(value: String): Self = StObject.set(x, "cursorAccent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorAccentUndefined: Self = StObject.set(x, "cursorAccent", js.undefined)
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setCyan(value: String): Self = StObject.set(x, "cyan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCyanUndefined: Self = StObject.set(x, "cyan", js.undefined)
    
    @scala.inline
    def setForeground(value: String): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForegroundUndefined: Self = StObject.set(x, "foreground", js.undefined)
    
    @scala.inline
    def setGreen(value: String): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreenUndefined: Self = StObject.set(x, "green", js.undefined)
    
    @scala.inline
    def setMagenta(value: String): Self = StObject.set(x, "magenta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagentaUndefined: Self = StObject.set(x, "magenta", js.undefined)
    
    @scala.inline
    def setRed(value: String): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedUndefined: Self = StObject.set(x, "red", js.undefined)
    
    @scala.inline
    def setSelection(value: String): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    
    @scala.inline
    def setWhite(value: String): Self = StObject.set(x, "white", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhiteUndefined: Self = StObject.set(x, "white", js.undefined)
    
    @scala.inline
    def setYellow(value: String): Self = StObject.set(x, "yellow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYellowUndefined: Self = StObject.set(x, "yellow", js.undefined)
  }
}
