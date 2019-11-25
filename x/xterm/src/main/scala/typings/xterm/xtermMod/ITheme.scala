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
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (black != null) __obj.updateDynamic("black")(black.asInstanceOf[js.Any])
    if (blue != null) __obj.updateDynamic("blue")(blue.asInstanceOf[js.Any])
    if (brightBlack != null) __obj.updateDynamic("brightBlack")(brightBlack.asInstanceOf[js.Any])
    if (brightBlue != null) __obj.updateDynamic("brightBlue")(brightBlue.asInstanceOf[js.Any])
    if (brightCyan != null) __obj.updateDynamic("brightCyan")(brightCyan.asInstanceOf[js.Any])
    if (brightGreen != null) __obj.updateDynamic("brightGreen")(brightGreen.asInstanceOf[js.Any])
    if (brightMagenta != null) __obj.updateDynamic("brightMagenta")(brightMagenta.asInstanceOf[js.Any])
    if (brightRed != null) __obj.updateDynamic("brightRed")(brightRed.asInstanceOf[js.Any])
    if (brightWhite != null) __obj.updateDynamic("brightWhite")(brightWhite.asInstanceOf[js.Any])
    if (brightYellow != null) __obj.updateDynamic("brightYellow")(brightYellow.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (cursorAccent != null) __obj.updateDynamic("cursorAccent")(cursorAccent.asInstanceOf[js.Any])
    if (cyan != null) __obj.updateDynamic("cyan")(cyan.asInstanceOf[js.Any])
    if (foreground != null) __obj.updateDynamic("foreground")(foreground.asInstanceOf[js.Any])
    if (green != null) __obj.updateDynamic("green")(green.asInstanceOf[js.Any])
    if (magenta != null) __obj.updateDynamic("magenta")(magenta.asInstanceOf[js.Any])
    if (red != null) __obj.updateDynamic("red")(red.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (white != null) __obj.updateDynamic("white")(white.asInstanceOf[js.Any])
    if (yellow != null) __obj.updateDynamic("yellow")(yellow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITheme]
  }
}

