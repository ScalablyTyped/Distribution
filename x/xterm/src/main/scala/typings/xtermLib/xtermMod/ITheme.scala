package typings
package xtermLib.xtermMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITheme extends js.Object {
  /** The default background color */
  var background: js.UndefOr[java.lang.String] = js.undefined
  /** ANSI black (eg. `\x1b[30m`) */
  var black: js.UndefOr[java.lang.String] = js.undefined
  /** ANSI blue (eg. `\x1b[34m`) */
  var blue: js.UndefOr[java.lang.String] = js.undefined
  /** ANSI bright black (eg. `\x1b[1;30m`) */
  var brightBlack: js.UndefOr[java.lang.String] = js.undefined
  /** ANSI bright blue (eg. `\x1b[1;34m`) */
  var brightBlue: js.UndefOr[java.lang.String] = js.undefined
  /** ANSI bright cyan (eg. `\x1b[1;36m`) */
  var brightCyan: js.UndefOr[java.lang.String] = js.undefined
  /** ANSI bright green (eg. `\x1b[1;32m`) */
  var brightGreen: js.UndefOr[java.lang.String] = js.undefined
  /** ANSI bright magenta (eg. `\x1b[1;35m`) */
  var brightMagenta: js.UndefOr[java.lang.String] = js.undefined
  /** ANSI bright red (eg. `\x1b[1;31m`) */
  var brightRed: js.UndefOr[java.lang.String] = js.undefined
  /** ANSI bright white (eg. `\x1b[1;37m`) */
  var brightWhite: js.UndefOr[java.lang.String] = js.undefined
  /** ANSI bright yellow (eg. `\x1b[1;33m`) */
  var brightYellow: js.UndefOr[java.lang.String] = js.undefined
  /** The cursor color */
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  /** The accent color of the cursor (used as the foreground color for a block cursor) */
  var cursorAccent: js.UndefOr[java.lang.String] = js.undefined
  /** ANSI cyan (eg. `\x1b[36m`) */
  var cyan: js.UndefOr[java.lang.String] = js.undefined
  /** The default foreground color */
  var foreground: js.UndefOr[java.lang.String] = js.undefined
  /** ANSI green (eg. `\x1b[32m`) */
  var green: js.UndefOr[java.lang.String] = js.undefined
  /** ANSI magenta (eg. `\x1b[35m`) */
  var magenta: js.UndefOr[java.lang.String] = js.undefined
  /** ANSI red (eg. `\x1b[31m`) */
  var red: js.UndefOr[java.lang.String] = js.undefined
  /** The selection color (can be transparent) */
  var selection: js.UndefOr[java.lang.String] = js.undefined
  /** ANSI white (eg. `\x1b[37m`) */
  var white: js.UndefOr[java.lang.String] = js.undefined
  /** ANSI yellow (eg. `\x1b[33m`) */
  var yellow: js.UndefOr[java.lang.String] = js.undefined
}

object ITheme {
  @scala.inline
  def apply(
    background: java.lang.String = null,
    black: java.lang.String = null,
    blue: java.lang.String = null,
    brightBlack: java.lang.String = null,
    brightBlue: java.lang.String = null,
    brightCyan: java.lang.String = null,
    brightGreen: java.lang.String = null,
    brightMagenta: java.lang.String = null,
    brightRed: java.lang.String = null,
    brightWhite: java.lang.String = null,
    brightYellow: java.lang.String = null,
    cursor: java.lang.String = null,
    cursorAccent: java.lang.String = null,
    cyan: java.lang.String = null,
    foreground: java.lang.String = null,
    green: java.lang.String = null,
    magenta: java.lang.String = null,
    red: java.lang.String = null,
    selection: java.lang.String = null,
    white: java.lang.String = null,
    yellow: java.lang.String = null
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

