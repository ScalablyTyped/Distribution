package typings.xterm.mod

import typings.xterm.xtermStrings.alt
import typings.xterm.xtermStrings.bar
import typings.xterm.xtermStrings.block
import typings.xterm.xtermStrings.ctrl
import typings.xterm.xtermStrings.none
import typings.xterm.xtermStrings.shift
import typings.xterm.xtermStrings.sound
import typings.xterm.xtermStrings.underline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITerminalOptions extends StObject {
  
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
  implicit class ITerminalOptionsMutableBuilder[Self <: ITerminalOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowProposedApi(value: Boolean): Self = StObject.set(x, "allowProposedApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowProposedApiUndefined: Self = StObject.set(x, "allowProposedApi", js.undefined)
    
    @scala.inline
    def setAllowTransparency(value: Boolean): Self = StObject.set(x, "allowTransparency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowTransparencyUndefined: Self = StObject.set(x, "allowTransparency", js.undefined)
    
    @scala.inline
    def setBellSound(value: String): Self = StObject.set(x, "bellSound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBellSoundUndefined: Self = StObject.set(x, "bellSound", js.undefined)
    
    @scala.inline
    def setBellStyle(value: none | sound): Self = StObject.set(x, "bellStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBellStyleUndefined: Self = StObject.set(x, "bellStyle", js.undefined)
    
    @scala.inline
    def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
    
    @scala.inline
    def setConvertEol(value: Boolean): Self = StObject.set(x, "convertEol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertEolUndefined: Self = StObject.set(x, "convertEol", js.undefined)
    
    @scala.inline
    def setCursorBlink(value: Boolean): Self = StObject.set(x, "cursorBlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorBlinkUndefined: Self = StObject.set(x, "cursorBlink", js.undefined)
    
    @scala.inline
    def setCursorStyle(value: block | underline | bar): Self = StObject.set(x, "cursorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorStyleUndefined: Self = StObject.set(x, "cursorStyle", js.undefined)
    
    @scala.inline
    def setCursorWidth(value: Double): Self = StObject.set(x, "cursorWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorWidthUndefined: Self = StObject.set(x, "cursorWidth", js.undefined)
    
    @scala.inline
    def setDisableStdin(value: Boolean): Self = StObject.set(x, "disableStdin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableStdinUndefined: Self = StObject.set(x, "disableStdin", js.undefined)
    
    @scala.inline
    def setDrawBoldTextInBrightColors(value: Boolean): Self = StObject.set(x, "drawBoldTextInBrightColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawBoldTextInBrightColorsUndefined: Self = StObject.set(x, "drawBoldTextInBrightColors", js.undefined)
    
    @scala.inline
    def setFastScrollModifier(value: alt | ctrl | shift): Self = StObject.set(x, "fastScrollModifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFastScrollModifierUndefined: Self = StObject.set(x, "fastScrollModifier", js.undefined)
    
    @scala.inline
    def setFastScrollSensitivity(value: Double): Self = StObject.set(x, "fastScrollSensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFastScrollSensitivityUndefined: Self = StObject.set(x, "fastScrollSensitivity", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontWeight(value: FontWeight): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightBold(value: FontWeight): Self = StObject.set(x, "fontWeightBold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightBoldUndefined: Self = StObject.set(x, "fontWeightBold", js.undefined)
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
    
    @scala.inline
    def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    @scala.inline
    def setLinkTooltipHoverDuration(value: Double): Self = StObject.set(x, "linkTooltipHoverDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkTooltipHoverDurationUndefined: Self = StObject.set(x, "linkTooltipHoverDuration", js.undefined)
    
    @scala.inline
    def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    @scala.inline
    def setMacOptionClickForcesSelection(value: Boolean): Self = StObject.set(x, "macOptionClickForcesSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacOptionClickForcesSelectionUndefined: Self = StObject.set(x, "macOptionClickForcesSelection", js.undefined)
    
    @scala.inline
    def setMacOptionIsMeta(value: Boolean): Self = StObject.set(x, "macOptionIsMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacOptionIsMetaUndefined: Self = StObject.set(x, "macOptionIsMeta", js.undefined)
    
    @scala.inline
    def setMinimumContrastRatio(value: Double): Self = StObject.set(x, "minimumContrastRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumContrastRatioUndefined: Self = StObject.set(x, "minimumContrastRatio", js.undefined)
    
    @scala.inline
    def setRendererType(value: RendererType): Self = StObject.set(x, "rendererType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendererTypeUndefined: Self = StObject.set(x, "rendererType", js.undefined)
    
    @scala.inline
    def setRightClickSelectsWord(value: Boolean): Self = StObject.set(x, "rightClickSelectsWord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightClickSelectsWordUndefined: Self = StObject.set(x, "rightClickSelectsWord", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setScreenReaderMode(value: Boolean): Self = StObject.set(x, "screenReaderMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenReaderModeUndefined: Self = StObject.set(x, "screenReaderMode", js.undefined)
    
    @scala.inline
    def setScrollSensitivity(value: Double): Self = StObject.set(x, "scrollSensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollSensitivityUndefined: Self = StObject.set(x, "scrollSensitivity", js.undefined)
    
    @scala.inline
    def setScrollback(value: Double): Self = StObject.set(x, "scrollback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbackUndefined: Self = StObject.set(x, "scrollback", js.undefined)
    
    @scala.inline
    def setTabStopWidth(value: Double): Self = StObject.set(x, "tabStopWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabStopWidthUndefined: Self = StObject.set(x, "tabStopWidth", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setWindowOptions(value: IWindowOptions): Self = StObject.set(x, "windowOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowOptionsUndefined: Self = StObject.set(x, "windowOptions", js.undefined)
    
    @scala.inline
    def setWindowsMode(value: Boolean): Self = StObject.set(x, "windowsMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowsModeUndefined: Self = StObject.set(x, "windowsMode", js.undefined)
    
    @scala.inline
    def setWordSeparator(value: String): Self = StObject.set(x, "wordSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordSeparatorUndefined: Self = StObject.set(x, "wordSeparator", js.undefined)
  }
}
