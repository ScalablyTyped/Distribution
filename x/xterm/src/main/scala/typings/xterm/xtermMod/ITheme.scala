package typings.xterm.xtermMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITheme extends js.Object {
  /** The default background color */
  var background: js.UndefOr[String] = js.undefined
  /** ANSI black (eg. `\x1b[30m`) */
  var black: js.UndefOr[String] = js.undefined
  /** ANSI blue (eg. `\x1b[34m`) */
  var blue: js.UndefOr[String] = js.undefined
  /** ANSI bright black (eg. `\x1b[1;30m`) */
  var brightBlack: js.UndefOr[String] = js.undefined
  /** ANSI bright blue (eg. `\x1b[1;34m`) */
  var brightBlue: js.UndefOr[String] = js.undefined
  /** ANSI bright cyan (eg. `\x1b[1;36m`) */
  var brightCyan: js.UndefOr[String] = js.undefined
  /** ANSI bright green (eg. `\x1b[1;32m`) */
  var brightGreen: js.UndefOr[String] = js.undefined
  /** ANSI bright magenta (eg. `\x1b[1;35m`) */
  var brightMagenta: js.UndefOr[String] = js.undefined
  /** ANSI bright red (eg. `\x1b[1;31m`) */
  var brightRed: js.UndefOr[String] = js.undefined
  /** ANSI bright white (eg. `\x1b[1;37m`) */
  var brightWhite: js.UndefOr[String] = js.undefined
  /** ANSI bright yellow (eg. `\x1b[1;33m`) */
  var brightYellow: js.UndefOr[String] = js.undefined
  /** The cursor color */
  var cursor: js.UndefOr[String] = js.undefined
  /** The accent color of the cursor (fg color for a block cursor) */
  var cursorAccent: js.UndefOr[String] = js.undefined
  /** ANSI cyan (eg. `\x1b[36m`) */
  var cyan: js.UndefOr[String] = js.undefined
  /** The default foreground color */
  var foreground: js.UndefOr[String] = js.undefined
  /** ANSI green (eg. `\x1b[32m`) */
  var green: js.UndefOr[String] = js.undefined
  /** ANSI magenta (eg. `\x1b[35m`) */
  var magenta: js.UndefOr[String] = js.undefined
  /** ANSI red (eg. `\x1b[31m`) */
  var red: js.UndefOr[String] = js.undefined
  /** The selection background color (can be transparent) */
  var selection: js.UndefOr[String] = js.undefined
  /** ANSI white (eg. `\x1b[37m`) */
  var white: js.UndefOr[String] = js.undefined
  /** ANSI yellow (eg. `\x1b[33m`) */
  var yellow: js.UndefOr[String] = js.undefined
}

object ITheme {
  @scala.inline
  def apply(
    background: String = null,
    black: String = null,
    blue: String = null,
    brightBlack: String = null,
    brightBlue: String = null,
    brightCyan: String = null,
    brightGreen: String = null,
    brightMagenta: String = null,
    brightRed: String = null,
    brightWhite: String = null,
    brightYellow: String = null,
    cursor: String = null,
    cursorAccent: String = null,
    cyan: String = null,
    foreground: String = null,
    green: String = null,
    magenta: String = null,
    red: String = null,
    selection: String = null,
    white: String = null,
    yellow: String = null
  ): ITheme = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (black != null) __obj.updateDynamic("black")(black)
    if (blue != null) __obj.updateDynamic("blue")(blue)
    if (brightBlack != null) __obj.updateDynamic("brightBlack")(brightBlack)
    if (brightBlue != null) __obj.updateDynamic("brightBlue")(brightBlue)
    if (brightCyan != null) __obj.updateDynamic("brightCyan")(brightCyan)
    if (brightGreen != null) __obj.updateDynamic("brightGreen")(brightGreen)
    if (brightMagenta != null) __obj.updateDynamic("brightMagenta")(brightMagenta)
    if (brightRed != null) __obj.updateDynamic("brightRed")(brightRed)
    if (brightWhite != null) __obj.updateDynamic("brightWhite")(brightWhite)
    if (brightYellow != null) __obj.updateDynamic("brightYellow")(brightYellow)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (cursorAccent != null) __obj.updateDynamic("cursorAccent")(cursorAccent)
    if (cyan != null) __obj.updateDynamic("cyan")(cyan)
    if (foreground != null) __obj.updateDynamic("foreground")(foreground)
    if (green != null) __obj.updateDynamic("green")(green)
    if (magenta != null) __obj.updateDynamic("magenta")(magenta)
    if (red != null) __obj.updateDynamic("red")(red)
    if (selection != null) __obj.updateDynamic("selection")(selection)
    if (white != null) __obj.updateDynamic("white")(white)
    if (yellow != null) __obj.updateDynamic("yellow")(yellow)
    __obj.asInstanceOf[ITheme]
  }
}

