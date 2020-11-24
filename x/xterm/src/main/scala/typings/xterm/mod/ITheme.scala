package typings.xterm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITheme extends js.Object {
  
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
  implicit class IThemeOps[Self <: ITheme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBlack(value: String): Self = this.set("black", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlack: Self = this.set("black", js.undefined)
    
    @scala.inline
    def setBlue(value: String): Self = this.set("blue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlue: Self = this.set("blue", js.undefined)
    
    @scala.inline
    def setBrightBlack(value: String): Self = this.set("brightBlack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrightBlack: Self = this.set("brightBlack", js.undefined)
    
    @scala.inline
    def setBrightBlue(value: String): Self = this.set("brightBlue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrightBlue: Self = this.set("brightBlue", js.undefined)
    
    @scala.inline
    def setBrightCyan(value: String): Self = this.set("brightCyan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrightCyan: Self = this.set("brightCyan", js.undefined)
    
    @scala.inline
    def setBrightGreen(value: String): Self = this.set("brightGreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrightGreen: Self = this.set("brightGreen", js.undefined)
    
    @scala.inline
    def setBrightMagenta(value: String): Self = this.set("brightMagenta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrightMagenta: Self = this.set("brightMagenta", js.undefined)
    
    @scala.inline
    def setBrightRed(value: String): Self = this.set("brightRed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrightRed: Self = this.set("brightRed", js.undefined)
    
    @scala.inline
    def setBrightWhite(value: String): Self = this.set("brightWhite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrightWhite: Self = this.set("brightWhite", js.undefined)
    
    @scala.inline
    def setBrightYellow(value: String): Self = this.set("brightYellow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrightYellow: Self = this.set("brightYellow", js.undefined)
    
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    
    @scala.inline
    def setCursorAccent(value: String): Self = this.set("cursorAccent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursorAccent: Self = this.set("cursorAccent", js.undefined)
    
    @scala.inline
    def setCyan(value: String): Self = this.set("cyan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCyan: Self = this.set("cyan", js.undefined)
    
    @scala.inline
    def setForeground(value: String): Self = this.set("foreground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForeground: Self = this.set("foreground", js.undefined)
    
    @scala.inline
    def setGreen(value: String): Self = this.set("green", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreen: Self = this.set("green", js.undefined)
    
    @scala.inline
    def setMagenta(value: String): Self = this.set("magenta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMagenta: Self = this.set("magenta", js.undefined)
    
    @scala.inline
    def setRed(value: String): Self = this.set("red", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRed: Self = this.set("red", js.undefined)
    
    @scala.inline
    def setSelection(value: String): Self = this.set("selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
    
    @scala.inline
    def setWhite(value: String): Self = this.set("white", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhite: Self = this.set("white", js.undefined)
    
    @scala.inline
    def setYellow(value: String): Self = this.set("yellow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYellow: Self = this.set("yellow", js.undefined)
  }
}
