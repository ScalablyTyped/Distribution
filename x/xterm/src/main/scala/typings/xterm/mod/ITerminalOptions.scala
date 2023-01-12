package typings.xterm.mod

import typings.xterm.xtermStrings.alt
import typings.xterm.xtermStrings.bar
import typings.xterm.xtermStrings.block
import typings.xterm.xtermStrings.ctrl
import typings.xterm.xtermStrings.none
import typings.xterm.xtermStrings.shift
import typings.xterm.xtermStrings.underline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITerminalOptions extends StObject {
  
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
    * If enabled, alt + click will move the prompt cursor to position
    * underneath the mouse. The default is true.
    */
  var altClickMovesCursor: js.UndefOr[Boolean] = js.undefined
  
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
    * Whether to draw custom glyphs for block element and box drawing characters instead of using
    * the font. This should typically result in better rendering with continuous lines, even when
    * line height and letter spacing is used. Note that this doesn't work with the DOM renderer
    * which renders all characters using the font. The default is true.
    */
  var customGlyphs: js.UndefOr[Boolean] = js.undefined
  
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
  var fastScrollModifier: js.UndefOr[none | alt | ctrl | shift] = js.undefined
  
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
    * The handler for OSC 8 hyperlinks. Links will use the `confirm` browser
    * API if no link handler is set. Consider the security of users when using
    * this, there should be some tooltip or prompt when hovering or activating
    * the link.
    */
  var linkHandler: js.UndefOr[ILinkHandler | Null] = js.undefined
  
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
    * The width, in pixels, of the canvas for the overview ruler. The overview
    * ruler will be hidden when not set.
    */
  var overviewRulerWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether to select the word under the cursor on right click, this is
    * standard behavior in a lot of macOS applications.
    */
  var rightClickSelectsWord: js.UndefOr[Boolean] = js.undefined
  
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
    * The duration to smoothly scroll between the origin and the target in
    * milliseconds. Set to 0 to disable smooth scrolling and scroll instantly.
    */
  var smoothScrollDuration: js.UndefOr[Double] = js.undefined
  
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
    *
    * When using conpty on Windows 11 version >= 21376, it is recommended to
    * disable this because native text wrapping sequences are output correctly
    * thanks to https://github.com/microsoft/terminal/issues/405
    */
  var windowsMode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A string containing all characters that are considered word separated by the
    * double click to select work logic.
    */
  var wordSeparator: js.UndefOr[String] = js.undefined
}
object ITerminalOptions {
  
  inline def apply(): ITerminalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITerminalOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITerminalOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowProposedApi(value: Boolean): Self = StObject.set(x, "allowProposedApi", value.asInstanceOf[js.Any])
    
    inline def setAllowProposedApiUndefined: Self = StObject.set(x, "allowProposedApi", js.undefined)
    
    inline def setAllowTransparency(value: Boolean): Self = StObject.set(x, "allowTransparency", value.asInstanceOf[js.Any])
    
    inline def setAllowTransparencyUndefined: Self = StObject.set(x, "allowTransparency", js.undefined)
    
    inline def setAltClickMovesCursor(value: Boolean): Self = StObject.set(x, "altClickMovesCursor", value.asInstanceOf[js.Any])
    
    inline def setAltClickMovesCursorUndefined: Self = StObject.set(x, "altClickMovesCursor", js.undefined)
    
    inline def setConvertEol(value: Boolean): Self = StObject.set(x, "convertEol", value.asInstanceOf[js.Any])
    
    inline def setConvertEolUndefined: Self = StObject.set(x, "convertEol", js.undefined)
    
    inline def setCursorBlink(value: Boolean): Self = StObject.set(x, "cursorBlink", value.asInstanceOf[js.Any])
    
    inline def setCursorBlinkUndefined: Self = StObject.set(x, "cursorBlink", js.undefined)
    
    inline def setCursorStyle(value: block | underline | bar): Self = StObject.set(x, "cursorStyle", value.asInstanceOf[js.Any])
    
    inline def setCursorStyleUndefined: Self = StObject.set(x, "cursorStyle", js.undefined)
    
    inline def setCursorWidth(value: Double): Self = StObject.set(x, "cursorWidth", value.asInstanceOf[js.Any])
    
    inline def setCursorWidthUndefined: Self = StObject.set(x, "cursorWidth", js.undefined)
    
    inline def setCustomGlyphs(value: Boolean): Self = StObject.set(x, "customGlyphs", value.asInstanceOf[js.Any])
    
    inline def setCustomGlyphsUndefined: Self = StObject.set(x, "customGlyphs", js.undefined)
    
    inline def setDisableStdin(value: Boolean): Self = StObject.set(x, "disableStdin", value.asInstanceOf[js.Any])
    
    inline def setDisableStdinUndefined: Self = StObject.set(x, "disableStdin", js.undefined)
    
    inline def setDrawBoldTextInBrightColors(value: Boolean): Self = StObject.set(x, "drawBoldTextInBrightColors", value.asInstanceOf[js.Any])
    
    inline def setDrawBoldTextInBrightColorsUndefined: Self = StObject.set(x, "drawBoldTextInBrightColors", js.undefined)
    
    inline def setFastScrollModifier(value: none | alt | ctrl | shift): Self = StObject.set(x, "fastScrollModifier", value.asInstanceOf[js.Any])
    
    inline def setFastScrollModifierUndefined: Self = StObject.set(x, "fastScrollModifier", js.undefined)
    
    inline def setFastScrollSensitivity(value: Double): Self = StObject.set(x, "fastScrollSensitivity", value.asInstanceOf[js.Any])
    
    inline def setFastScrollSensitivityUndefined: Self = StObject.set(x, "fastScrollSensitivity", js.undefined)
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontWeight(value: FontWeight): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightBold(value: FontWeight): Self = StObject.set(x, "fontWeightBold", value.asInstanceOf[js.Any])
    
    inline def setFontWeightBoldUndefined: Self = StObject.set(x, "fontWeightBold", js.undefined)
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
    
    inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    inline def setLinkHandler(value: ILinkHandler): Self = StObject.set(x, "linkHandler", value.asInstanceOf[js.Any])
    
    inline def setLinkHandlerNull: Self = StObject.set(x, "linkHandler", null)
    
    inline def setLinkHandlerUndefined: Self = StObject.set(x, "linkHandler", js.undefined)
    
    inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setMacOptionClickForcesSelection(value: Boolean): Self = StObject.set(x, "macOptionClickForcesSelection", value.asInstanceOf[js.Any])
    
    inline def setMacOptionClickForcesSelectionUndefined: Self = StObject.set(x, "macOptionClickForcesSelection", js.undefined)
    
    inline def setMacOptionIsMeta(value: Boolean): Self = StObject.set(x, "macOptionIsMeta", value.asInstanceOf[js.Any])
    
    inline def setMacOptionIsMetaUndefined: Self = StObject.set(x, "macOptionIsMeta", js.undefined)
    
    inline def setMinimumContrastRatio(value: Double): Self = StObject.set(x, "minimumContrastRatio", value.asInstanceOf[js.Any])
    
    inline def setMinimumContrastRatioUndefined: Self = StObject.set(x, "minimumContrastRatio", js.undefined)
    
    inline def setOverviewRulerWidth(value: Double): Self = StObject.set(x, "overviewRulerWidth", value.asInstanceOf[js.Any])
    
    inline def setOverviewRulerWidthUndefined: Self = StObject.set(x, "overviewRulerWidth", js.undefined)
    
    inline def setRightClickSelectsWord(value: Boolean): Self = StObject.set(x, "rightClickSelectsWord", value.asInstanceOf[js.Any])
    
    inline def setRightClickSelectsWordUndefined: Self = StObject.set(x, "rightClickSelectsWord", js.undefined)
    
    inline def setScreenReaderMode(value: Boolean): Self = StObject.set(x, "screenReaderMode", value.asInstanceOf[js.Any])
    
    inline def setScreenReaderModeUndefined: Self = StObject.set(x, "screenReaderMode", js.undefined)
    
    inline def setScrollSensitivity(value: Double): Self = StObject.set(x, "scrollSensitivity", value.asInstanceOf[js.Any])
    
    inline def setScrollSensitivityUndefined: Self = StObject.set(x, "scrollSensitivity", js.undefined)
    
    inline def setScrollback(value: Double): Self = StObject.set(x, "scrollback", value.asInstanceOf[js.Any])
    
    inline def setScrollbackUndefined: Self = StObject.set(x, "scrollback", js.undefined)
    
    inline def setSmoothScrollDuration(value: Double): Self = StObject.set(x, "smoothScrollDuration", value.asInstanceOf[js.Any])
    
    inline def setSmoothScrollDurationUndefined: Self = StObject.set(x, "smoothScrollDuration", js.undefined)
    
    inline def setTabStopWidth(value: Double): Self = StObject.set(x, "tabStopWidth", value.asInstanceOf[js.Any])
    
    inline def setTabStopWidthUndefined: Self = StObject.set(x, "tabStopWidth", js.undefined)
    
    inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setWindowOptions(value: IWindowOptions): Self = StObject.set(x, "windowOptions", value.asInstanceOf[js.Any])
    
    inline def setWindowOptionsUndefined: Self = StObject.set(x, "windowOptions", js.undefined)
    
    inline def setWindowsMode(value: Boolean): Self = StObject.set(x, "windowsMode", value.asInstanceOf[js.Any])
    
    inline def setWindowsModeUndefined: Self = StObject.set(x, "windowsMode", js.undefined)
    
    inline def setWordSeparator(value: String): Self = StObject.set(x, "wordSeparator", value.asInstanceOf[js.Any])
    
    inline def setWordSeparatorUndefined: Self = StObject.set(x, "wordSeparator", js.undefined)
  }
}
