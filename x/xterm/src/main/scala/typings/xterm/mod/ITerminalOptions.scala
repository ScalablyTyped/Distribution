package typings.xterm.mod

import typings.xterm.xtermStrings.alt
import typings.xterm.xtermStrings.bar
import typings.xterm.xtermStrings.block
import typings.xterm.xtermStrings.ctrl
import typings.xterm.xtermStrings.none
import typings.xterm.xtermStrings.shift
import typings.xterm.xtermStrings.sound
import typings.xterm.xtermStrings.underline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITerminalOptions extends js.Object {
  /**
    * Whether background should support non-opaque color. It must be set before
    * executing the `Terminal.open()` method and can't be changed later without
    * executing it again. Note that enabling this can negatively impact
    * performance.
    */
  var allowTransparency: js.UndefOr[Boolean] = js.undefined
  /**
    * A data uri of the sound to use for the bell when `bellStyle = 'sound'`.
    */
  var bellSound: js.UndefOr[String] = js.undefined
  /**
    * The type of the bell notification the terminal will use.
    */
  var bellStyle: js.UndefOr[none | sound] = js.undefined
  /**
    * The number of columns in the terminal.
    */
  var cols: js.UndefOr[Double] = js.undefined
  /**
    * When enabled the cursor will be set to the beginning of the next line
    * with every new line. This is equivalent to sending '\r\n' for each '\n'.
    * Normally the termios settings of the underlying PTY deals with the
    * translation of '\n' to '\r\n' and this setting should not be used. If you
    * deal with data from a non-PTY related source, this settings might be
    * useful.
    */
  var convertEol: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the cursor blinks.
    */
  var cursorBlink: js.UndefOr[Boolean] = js.undefined
  /**
    * The style of the cursor.
    */
  var cursorStyle: js.UndefOr[block | underline | bar] = js.undefined
  /**
    * Whether input should be disabled.
    */
  var disableStdin: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to draw bold text in bright colors. The default is true.
    */
  var drawBoldTextInBrightColors: js.UndefOr[Boolean] = js.undefined
  /**
    * The modifier key hold to multiply scroll speed.
    */
  var fastScrollModifier: js.UndefOr[alt | ctrl | shift] = js.undefined
  /**
    * The scroll speed multiplier used for fast scrolling.
    */
  var fastScrollSensitivity: js.UndefOr[Double] = js.undefined
  /**
    * The font family used to render text.
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /**
    * The font size used to render text.
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  /**
    * The font weight used to render non-bold text.
    */
  var fontWeight: js.UndefOr[FontWeight] = js.undefined
  /**
    * The font weight used to render bold text.
    */
  var fontWeightBold: js.UndefOr[FontWeight] = js.undefined
  /**
    * The spacing in whole pixels between characters..
    */
  var letterSpacing: js.UndefOr[Double] = js.undefined
  /**
    * The line height used to render text.
    */
  var lineHeight: js.UndefOr[Double] = js.undefined
  /**
    * What log level to use, this will log for all levels below and including
    * what is set:
    *
    * 1. debug
    * 2. info (default)
    * 3. warn
    * 4. error
    * 5. off
    */
  var logLevel: js.UndefOr[LogLevel] = js.undefined
  /**
    * Whether holding a modifier key will force normal selection behavior,
    * regardless of whether the terminal is in mouse events mode. This will
    * also prevent mouse events from being emitted by the terminal. For
    * example, this allows you to use xterm.js' regular selection inside tmux
    * with mouse mode enabled.
    */
  var macOptionClickForcesSelection: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to treat option as the meta key.
    */
  var macOptionIsMeta: js.UndefOr[Boolean] = js.undefined
  /**
    * The minimum contrast ratio for text in the terminal, setting this will
    * change the foreground color dynamically depending on whether the contrast
    * ratio is met. Example values:
    *
    * - 1: The default, do nothing.
    * - 4.5: Minimum for WCAG AA compliance.
    * - 7: Minimum for WCAG AAA compliance.
    * - 21: White on black or black on white.
    */
  var minimumContrastRatio: js.UndefOr[Double] = js.undefined
  /**
    * The type of renderer to use, this allows using the fallback DOM renderer
    * when canvas is too slow for the environment. The following features do
    * not work when the DOM renderer is used:
    *
    * - Letter spacing
    * - Cursor blink
    */
  var rendererType: js.UndefOr[RendererType] = js.undefined
  /**
    * Whether to select the word under the cursor on right click, this is
    * standard behavior in a lot of macOS applications.
    */
  var rightClickSelectsWord: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of rows in the terminal.
    */
  var rows: js.UndefOr[Double] = js.undefined
  /**
    * Whether screen reader support is enabled. When on this will expose
    * supporting elements in the DOM to support NVDA on Windows and VoiceOver
    * on macOS.
    */
  var screenReaderMode: js.UndefOr[Boolean] = js.undefined
  /**
    * The scrolling speed multiplier used for adjusting normal scrolling speed.
    */
  var scrollSensitivity: js.UndefOr[Double] = js.undefined
  /**
    * The amount of scrollback in the terminal. Scrollback is the amount of
    * rows that are retained when lines are scrolled beyond the initial
    * viewport.
    */
  var scrollback: js.UndefOr[Double] = js.undefined
  /**
    * The size of tab stops in the terminal.
    */
  var tabStopWidth: js.UndefOr[Double] = js.undefined
  /**
    * The color theme of the terminal.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * Whether "Windows mode" is enabled. Because Windows backends winpty and
    * conpty operate by doing line wrapping on their side, xterm.js does not
    * have access to wrapped lines. When Windows mode is enabled the following
    * changes will be in effect:
    *
    * - Reflow is disabled.
    * - Lines are assumed to be wrapped if the last character of the line is
    *   not whitespace.
    */
  var windowsMode: js.UndefOr[Boolean] = js.undefined
  /**
    * A string containing all characters that are considered word separated by the
    * double click to select work logic.
    */
  var wordSeparator: js.UndefOr[String] = js.undefined
}

object ITerminalOptions {
  @scala.inline
  def apply(
    allowTransparency: js.UndefOr[Boolean] = js.undefined,
    bellSound: String = null,
    bellStyle: none | sound = null,
    cols: Int | Double = null,
    convertEol: js.UndefOr[Boolean] = js.undefined,
    cursorBlink: js.UndefOr[Boolean] = js.undefined,
    cursorStyle: block | underline | bar = null,
    disableStdin: js.UndefOr[Boolean] = js.undefined,
    drawBoldTextInBrightColors: js.UndefOr[Boolean] = js.undefined,
    fastScrollModifier: alt | ctrl | shift = null,
    fastScrollSensitivity: Int | Double = null,
    fontFamily: String = null,
    fontSize: Int | Double = null,
    fontWeight: FontWeight = null,
    fontWeightBold: FontWeight = null,
    letterSpacing: Int | Double = null,
    lineHeight: Int | Double = null,
    logLevel: LogLevel = null,
    macOptionClickForcesSelection: js.UndefOr[Boolean] = js.undefined,
    macOptionIsMeta: js.UndefOr[Boolean] = js.undefined,
    minimumContrastRatio: Int | Double = null,
    rendererType: RendererType = null,
    rightClickSelectsWord: js.UndefOr[Boolean] = js.undefined,
    rows: Int | Double = null,
    screenReaderMode: js.UndefOr[Boolean] = js.undefined,
    scrollSensitivity: Int | Double = null,
    scrollback: Int | Double = null,
    tabStopWidth: Int | Double = null,
    theme: ITheme = null,
    windowsMode: js.UndefOr[Boolean] = js.undefined,
    wordSeparator: String = null
  ): ITerminalOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowTransparency)) __obj.updateDynamic("allowTransparency")(allowTransparency.asInstanceOf[js.Any])
    if (bellSound != null) __obj.updateDynamic("bellSound")(bellSound.asInstanceOf[js.Any])
    if (bellStyle != null) __obj.updateDynamic("bellStyle")(bellStyle.asInstanceOf[js.Any])
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (!js.isUndefined(convertEol)) __obj.updateDynamic("convertEol")(convertEol.asInstanceOf[js.Any])
    if (!js.isUndefined(cursorBlink)) __obj.updateDynamic("cursorBlink")(cursorBlink.asInstanceOf[js.Any])
    if (cursorStyle != null) __obj.updateDynamic("cursorStyle")(cursorStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStdin)) __obj.updateDynamic("disableStdin")(disableStdin.asInstanceOf[js.Any])
    if (!js.isUndefined(drawBoldTextInBrightColors)) __obj.updateDynamic("drawBoldTextInBrightColors")(drawBoldTextInBrightColors.asInstanceOf[js.Any])
    if (fastScrollModifier != null) __obj.updateDynamic("fastScrollModifier")(fastScrollModifier.asInstanceOf[js.Any])
    if (fastScrollSensitivity != null) __obj.updateDynamic("fastScrollSensitivity")(fastScrollSensitivity.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (fontWeightBold != null) __obj.updateDynamic("fontWeightBold")(fontWeightBold.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(macOptionClickForcesSelection)) __obj.updateDynamic("macOptionClickForcesSelection")(macOptionClickForcesSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(macOptionIsMeta)) __obj.updateDynamic("macOptionIsMeta")(macOptionIsMeta.asInstanceOf[js.Any])
    if (minimumContrastRatio != null) __obj.updateDynamic("minimumContrastRatio")(minimumContrastRatio.asInstanceOf[js.Any])
    if (rendererType != null) __obj.updateDynamic("rendererType")(rendererType.asInstanceOf[js.Any])
    if (!js.isUndefined(rightClickSelectsWord)) __obj.updateDynamic("rightClickSelectsWord")(rightClickSelectsWord.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (!js.isUndefined(screenReaderMode)) __obj.updateDynamic("screenReaderMode")(screenReaderMode.asInstanceOf[js.Any])
    if (scrollSensitivity != null) __obj.updateDynamic("scrollSensitivity")(scrollSensitivity.asInstanceOf[js.Any])
    if (scrollback != null) __obj.updateDynamic("scrollback")(scrollback.asInstanceOf[js.Any])
    if (tabStopWidth != null) __obj.updateDynamic("tabStopWidth")(tabStopWidth.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsMode)) __obj.updateDynamic("windowsMode")(windowsMode.asInstanceOf[js.Any])
    if (wordSeparator != null) __obj.updateDynamic("wordSeparator")(wordSeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITerminalOptions]
  }
}

