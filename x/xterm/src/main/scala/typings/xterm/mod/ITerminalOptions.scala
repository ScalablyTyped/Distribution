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

@js.native
trait ITerminalOptions extends js.Object {
  /**
    * Whether to allow the use of proposed API. When false, any usage of APIs
    * marked as experimental/proposed will throw an error. This defaults to
    * true currently, but will change to false in v5.0.
    */
  var allowProposedApi: js.UndefOr[Boolean] = js.native
  /**
    * Whether background should support non-opaque color. It must be set before
    * executing the `Terminal.open()` method and can't be changed later without
    * executing it again. Note that enabling this can negatively impact
    * performance.
    */
  var allowTransparency: js.UndefOr[Boolean] = js.native
  /**
    * A data uri of the sound to use for the bell when `bellStyle = 'sound'`.
    */
  var bellSound: js.UndefOr[String] = js.native
  /**
    * The type of the bell notification the terminal will use.
    */
  var bellStyle: js.UndefOr[none | sound] = js.native
  /**
    * The number of columns in the terminal.
    */
  var cols: js.UndefOr[Double] = js.native
  /**
    * When enabled the cursor will be set to the beginning of the next line
    * with every new line. This is equivalent to sending '\r\n' for each '\n'.
    * Normally the termios settings of the underlying PTY deals with the
    * translation of '\n' to '\r\n' and this setting should not be used. If you
    * deal with data from a non-PTY related source, this settings might be
    * useful.
    */
  var convertEol: js.UndefOr[Boolean] = js.native
  /**
    * Whether the cursor blinks.
    */
  var cursorBlink: js.UndefOr[Boolean] = js.native
  /**
    * The style of the cursor.
    */
  var cursorStyle: js.UndefOr[block | underline | bar] = js.native
  /**
    * The width of the cursor in CSS pixels when `cursorStyle` is set to 'bar'.
    */
  var cursorWidth: js.UndefOr[Double] = js.native
  /**
    * Whether input should be disabled.
    */
  var disableStdin: js.UndefOr[Boolean] = js.native
  /**
    * Whether to draw bold text in bright colors. The default is true.
    */
  var drawBoldTextInBrightColors: js.UndefOr[Boolean] = js.native
  /**
    * The modifier key hold to multiply scroll speed.
    */
  var fastScrollModifier: js.UndefOr[alt | ctrl | shift] = js.native
  /**
    * The scroll speed multiplier used for fast scrolling.
    */
  var fastScrollSensitivity: js.UndefOr[Double] = js.native
  /**
    * The font family used to render text.
    */
  var fontFamily: js.UndefOr[String] = js.native
  /**
    * The font size used to render text.
    */
  var fontSize: js.UndefOr[Double] = js.native
  /**
    * The font weight used to render non-bold text.
    */
  var fontWeight: js.UndefOr[FontWeight] = js.native
  /**
    * The font weight used to render bold text.
    */
  var fontWeightBold: js.UndefOr[FontWeight] = js.native
  /**
    * The spacing in whole pixels between characters.
    */
  var letterSpacing: js.UndefOr[Double] = js.native
  /**
    * The line height used to render text.
    */
  var lineHeight: js.UndefOr[Double] = js.native
  /**
    * The duration in milliseconds before link tooltip events fire when
    * hovering on a link.
    * @deprecated This will be removed when the link matcher API is removed.
    */
  var linkTooltipHoverDuration: js.UndefOr[Double] = js.native
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
  var logLevel: js.UndefOr[LogLevel] = js.native
  /**
    * Whether holding a modifier key will force normal selection behavior,
    * regardless of whether the terminal is in mouse events mode. This will
    * also prevent mouse events from being emitted by the terminal. For
    * example, this allows you to use xterm.js' regular selection inside tmux
    * with mouse mode enabled.
    */
  var macOptionClickForcesSelection: js.UndefOr[Boolean] = js.native
  /**
    * Whether to treat option as the meta key.
    */
  var macOptionIsMeta: js.UndefOr[Boolean] = js.native
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
  var minimumContrastRatio: js.UndefOr[Double] = js.native
  /**
    * The type of renderer to use, this allows using the fallback DOM renderer
    * when canvas is too slow for the environment. The following features do
    * not work when the DOM renderer is used:
    *
    * - Letter spacing
    * - Cursor blink
    */
  var rendererType: js.UndefOr[RendererType] = js.native
  /**
    * Whether to select the word under the cursor on right click, this is
    * standard behavior in a lot of macOS applications.
    */
  var rightClickSelectsWord: js.UndefOr[Boolean] = js.native
  /**
    * The number of rows in the terminal.
    */
  var rows: js.UndefOr[Double] = js.native
  /**
    * Whether screen reader support is enabled. When on this will expose
    * supporting elements in the DOM to support NVDA on Windows and VoiceOver
    * on macOS.
    */
  var screenReaderMode: js.UndefOr[Boolean] = js.native
  /**
    * The scrolling speed multiplier used for adjusting normal scrolling speed.
    */
  var scrollSensitivity: js.UndefOr[Double] = js.native
  /**
    * The amount of scrollback in the terminal. Scrollback is the amount of
    * rows that are retained when lines are scrolled beyond the initial
    * viewport.
    */
  var scrollback: js.UndefOr[Double] = js.native
  /**
    * The size of tab stops in the terminal.
    */
  var tabStopWidth: js.UndefOr[Double] = js.native
  /**
    * The color theme of the terminal.
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * Enable various window manipulation and report features.
    * All features are disabled by default for security reasons.
    */
  var windowOptions: js.UndefOr[IWindowOptions] = js.native
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
  var windowsMode: js.UndefOr[Boolean] = js.native
  /**
    * A string containing all characters that are considered word separated by the
    * double click to select work logic.
    */
  var wordSeparator: js.UndefOr[String] = js.native
}

object ITerminalOptions {
  @scala.inline
  def apply(): ITerminalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITerminalOptions]
  }
  @scala.inline
  implicit class ITerminalOptionsOps[Self <: ITerminalOptions] (val x: Self) extends AnyVal {
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
    def setAllowProposedApi(value: Boolean): Self = this.set("allowProposedApi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowProposedApi: Self = this.set("allowProposedApi", js.undefined)
    @scala.inline
    def setAllowTransparency(value: Boolean): Self = this.set("allowTransparency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowTransparency: Self = this.set("allowTransparency", js.undefined)
    @scala.inline
    def setBellSound(value: String): Self = this.set("bellSound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBellSound: Self = this.set("bellSound", js.undefined)
    @scala.inline
    def setBellStyle(value: none | sound): Self = this.set("bellStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBellStyle: Self = this.set("bellStyle", js.undefined)
    @scala.inline
    def setCols(value: Double): Self = this.set("cols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCols: Self = this.set("cols", js.undefined)
    @scala.inline
    def setConvertEol(value: Boolean): Self = this.set("convertEol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConvertEol: Self = this.set("convertEol", js.undefined)
    @scala.inline
    def setCursorBlink(value: Boolean): Self = this.set("cursorBlink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursorBlink: Self = this.set("cursorBlink", js.undefined)
    @scala.inline
    def setCursorStyle(value: block | underline | bar): Self = this.set("cursorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursorStyle: Self = this.set("cursorStyle", js.undefined)
    @scala.inline
    def setCursorWidth(value: Double): Self = this.set("cursorWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursorWidth: Self = this.set("cursorWidth", js.undefined)
    @scala.inline
    def setDisableStdin(value: Boolean): Self = this.set("disableStdin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableStdin: Self = this.set("disableStdin", js.undefined)
    @scala.inline
    def setDrawBoldTextInBrightColors(value: Boolean): Self = this.set("drawBoldTextInBrightColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawBoldTextInBrightColors: Self = this.set("drawBoldTextInBrightColors", js.undefined)
    @scala.inline
    def setFastScrollModifier(value: alt | ctrl | shift): Self = this.set("fastScrollModifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFastScrollModifier: Self = this.set("fastScrollModifier", js.undefined)
    @scala.inline
    def setFastScrollSensitivity(value: Double): Self = this.set("fastScrollSensitivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFastScrollSensitivity: Self = this.set("fastScrollSensitivity", js.undefined)
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setFontWeight(value: FontWeight): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    @scala.inline
    def setFontWeightBold(value: FontWeight): Self = this.set("fontWeightBold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeightBold: Self = this.set("fontWeightBold", js.undefined)
    @scala.inline
    def setLetterSpacing(value: Double): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLetterSpacing: Self = this.set("letterSpacing", js.undefined)
    @scala.inline
    def setLineHeight(value: Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    @scala.inline
    def setLinkTooltipHoverDuration(value: Double): Self = this.set("linkTooltipHoverDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkTooltipHoverDuration: Self = this.set("linkTooltipHoverDuration", js.undefined)
    @scala.inline
    def setLogLevel(value: LogLevel): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    @scala.inline
    def setMacOptionClickForcesSelection(value: Boolean): Self = this.set("macOptionClickForcesSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMacOptionClickForcesSelection: Self = this.set("macOptionClickForcesSelection", js.undefined)
    @scala.inline
    def setMacOptionIsMeta(value: Boolean): Self = this.set("macOptionIsMeta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMacOptionIsMeta: Self = this.set("macOptionIsMeta", js.undefined)
    @scala.inline
    def setMinimumContrastRatio(value: Double): Self = this.set("minimumContrastRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumContrastRatio: Self = this.set("minimumContrastRatio", js.undefined)
    @scala.inline
    def setRendererType(value: RendererType): Self = this.set("rendererType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRendererType: Self = this.set("rendererType", js.undefined)
    @scala.inline
    def setRightClickSelectsWord(value: Boolean): Self = this.set("rightClickSelectsWord", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightClickSelectsWord: Self = this.set("rightClickSelectsWord", js.undefined)
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setScreenReaderMode(value: Boolean): Self = this.set("screenReaderMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenReaderMode: Self = this.set("screenReaderMode", js.undefined)
    @scala.inline
    def setScrollSensitivity(value: Double): Self = this.set("scrollSensitivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollSensitivity: Self = this.set("scrollSensitivity", js.undefined)
    @scala.inline
    def setScrollback(value: Double): Self = this.set("scrollback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollback: Self = this.set("scrollback", js.undefined)
    @scala.inline
    def setTabStopWidth(value: Double): Self = this.set("tabStopWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabStopWidth: Self = this.set("tabStopWidth", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setWindowOptions(value: IWindowOptions): Self = this.set("windowOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowOptions: Self = this.set("windowOptions", js.undefined)
    @scala.inline
    def setWindowsMode(value: Boolean): Self = this.set("windowsMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowsMode: Self = this.set("windowsMode", js.undefined)
    @scala.inline
    def setWordSeparator(value: String): Self = this.set("wordSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWordSeparator: Self = this.set("wordSeparator", js.undefined)
  }
  
}

