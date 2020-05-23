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
    * Whether to allow the use of proposed API. When false, any usage of APIs
    * marked as experimental/proposed will throw an error. This defaults to
    * true currently, but will change to false in v5.0.
    */
  var allowProposedApi: js.UndefOr[Boolean] = js.undefined
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
    * The width of the cursor in CSS pixels when `cursorStyle` is set to 'bar'.
    */
  var cursorWidth: js.UndefOr[Double] = js.undefined
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
    * The spacing in whole pixels between characters.
    */
  var letterSpacing: js.UndefOr[Double] = js.undefined
  /**
    * The line height used to render text.
    */
  var lineHeight: js.UndefOr[Double] = js.undefined
  /**
    * The duration in milliseconds before link tooltip events fire when
    * hovering on a link.
    * @deprecated This will be removed when the link matcher API is removed.
    */
  var linkTooltipHoverDuration: js.UndefOr[Double] = js.undefined
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
    * Enable various window manipulation and report features.
    * All features are disabled by default for security reasons.
    */
  var windowOptions: js.UndefOr[IWindowOptions] = js.undefined
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
    allowProposedApi: js.UndefOr[Boolean] = js.undefined,
    allowTransparency: js.UndefOr[Boolean] = js.undefined,
    bellSound: String = null,
    bellStyle: none | sound = null,
    cols: js.UndefOr[Double] = js.undefined,
    convertEol: js.UndefOr[Boolean] = js.undefined,
    cursorBlink: js.UndefOr[Boolean] = js.undefined,
    cursorStyle: block | underline | bar = null,
    cursorWidth: js.UndefOr[Double] = js.undefined,
    disableStdin: js.UndefOr[Boolean] = js.undefined,
    drawBoldTextInBrightColors: js.UndefOr[Boolean] = js.undefined,
    fastScrollModifier: alt | ctrl | shift = null,
    fastScrollSensitivity: js.UndefOr[Double] = js.undefined,
    fontFamily: String = null,
    fontSize: js.UndefOr[Double] = js.undefined,
    fontWeight: FontWeight = null,
    fontWeightBold: FontWeight = null,
    letterSpacing: js.UndefOr[Double] = js.undefined,
    lineHeight: js.UndefOr[Double] = js.undefined,
    linkTooltipHoverDuration: js.UndefOr[Double] = js.undefined,
    logLevel: LogLevel = null,
    macOptionClickForcesSelection: js.UndefOr[Boolean] = js.undefined,
    macOptionIsMeta: js.UndefOr[Boolean] = js.undefined,
    minimumContrastRatio: js.UndefOr[Double] = js.undefined,
    rendererType: RendererType = null,
    rightClickSelectsWord: js.UndefOr[Boolean] = js.undefined,
    rows: js.UndefOr[Double] = js.undefined,
    screenReaderMode: js.UndefOr[Boolean] = js.undefined,
    scrollSensitivity: js.UndefOr[Double] = js.undefined,
    scrollback: js.UndefOr[Double] = js.undefined,
    tabStopWidth: js.UndefOr[Double] = js.undefined,
    theme: ITheme = null,
    windowOptions: IWindowOptions = null,
    windowsMode: js.UndefOr[Boolean] = js.undefined,
    wordSeparator: String = null
  ): ITerminalOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowProposedApi)) __obj.updateDynamic("allowProposedApi")(allowProposedApi.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowTransparency)) __obj.updateDynamic("allowTransparency")(allowTransparency.get.asInstanceOf[js.Any])
    if (bellSound != null) __obj.updateDynamic("bellSound")(bellSound.asInstanceOf[js.Any])
    if (bellStyle != null) __obj.updateDynamic("bellStyle")(bellStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(cols)) __obj.updateDynamic("cols")(cols.get.asInstanceOf[js.Any])
    if (!js.isUndefined(convertEol)) __obj.updateDynamic("convertEol")(convertEol.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cursorBlink)) __obj.updateDynamic("cursorBlink")(cursorBlink.get.asInstanceOf[js.Any])
    if (cursorStyle != null) __obj.updateDynamic("cursorStyle")(cursorStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(cursorWidth)) __obj.updateDynamic("cursorWidth")(cursorWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStdin)) __obj.updateDynamic("disableStdin")(disableStdin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawBoldTextInBrightColors)) __obj.updateDynamic("drawBoldTextInBrightColors")(drawBoldTextInBrightColors.get.asInstanceOf[js.Any])
    if (fastScrollModifier != null) __obj.updateDynamic("fastScrollModifier")(fastScrollModifier.asInstanceOf[js.Any])
    if (!js.isUndefined(fastScrollSensitivity)) __obj.updateDynamic("fastScrollSensitivity")(fastScrollSensitivity.get.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (fontWeightBold != null) __obj.updateDynamic("fontWeightBold")(fontWeightBold.asInstanceOf[js.Any])
    if (!js.isUndefined(letterSpacing)) __obj.updateDynamic("letterSpacing")(letterSpacing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineHeight)) __obj.updateDynamic("lineHeight")(lineHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(linkTooltipHoverDuration)) __obj.updateDynamic("linkTooltipHoverDuration")(linkTooltipHoverDuration.get.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(macOptionClickForcesSelection)) __obj.updateDynamic("macOptionClickForcesSelection")(macOptionClickForcesSelection.get.asInstanceOf[js.Any])
    if (!js.isUndefined(macOptionIsMeta)) __obj.updateDynamic("macOptionIsMeta")(macOptionIsMeta.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumContrastRatio)) __obj.updateDynamic("minimumContrastRatio")(minimumContrastRatio.get.asInstanceOf[js.Any])
    if (rendererType != null) __obj.updateDynamic("rendererType")(rendererType.asInstanceOf[js.Any])
    if (!js.isUndefined(rightClickSelectsWord)) __obj.updateDynamic("rightClickSelectsWord")(rightClickSelectsWord.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(screenReaderMode)) __obj.updateDynamic("screenReaderMode")(screenReaderMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollSensitivity)) __obj.updateDynamic("scrollSensitivity")(scrollSensitivity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollback)) __obj.updateDynamic("scrollback")(scrollback.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tabStopWidth)) __obj.updateDynamic("tabStopWidth")(tabStopWidth.get.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (windowOptions != null) __obj.updateDynamic("windowOptions")(windowOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsMode)) __obj.updateDynamic("windowsMode")(windowsMode.get.asInstanceOf[js.Any])
    if (wordSeparator != null) __obj.updateDynamic("wordSeparator")(wordSeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITerminalOptions]
  }
}

