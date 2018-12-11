package typings
package xtermLib.xtermMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ITerminalOptions extends js.Object {
  /**
       * Whether background should support non-opaque color. It must be set before
       * executing open() method and can't be changed later without excuting it again.
       * Warning: Enabling this option can reduce performances somewhat.
       */
  var allowTransparency: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * A data uri of the sound to use for the bell (needs bellStyle = 'sound').
       */
  var bellSound: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The type of the bell notification the terminal will use.
       */
  var bellStyle: js.UndefOr[xtermLib.xtermLibStrings.none | xtermLib.xtermLibStrings.sound] = js.undefined
  /**
       * The number of columns in the terminal.
       */
  var cols: js.UndefOr[scala.Double] = js.undefined
  /**
       * When enabled the cursor will be set to the beginning of the next line
       * with every new line. This equivalent to sending '\r\n' for each '\n'.
       * Normally the termios settings of the underlying PTY deals with the
       * translation of '\n' to '\r\n' and this setting should not be used. If you
       * deal with data from a non-PTY related source, this settings might be
       * useful.
       */
  var convertEol: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether the cursor blinks.
       */
  var cursorBlink: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The style of the cursor.
       */
  var cursorStyle: js.UndefOr[
    xtermLib.xtermLibStrings.block | xtermLib.xtermLibStrings.underline | xtermLib.xtermLibStrings.bar
  ] = js.undefined
  /**
       * Whether input should be disabled.
       */
  var disableStdin: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether to draw bold text in bright colors. The default is true.
       */
  var drawBoldTextInBrightColors: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether to enable the rendering of bold text.
       *
       * @deprecated Use fontWeight and fontWeightBold instead.
       */
  var enableBold: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * (EXPERIMENTAL) Defines which implementation to use for buffer lines.
       *
       * - 'JsArray': The default/stable implementation.
       * - 'TypedArray': The new experimental implementation based on TypedArrays that is expected to
       *   significantly boost performance and memory consumption. Use at your own risk.
       *
       * @deprecated This option will be removed in the future.
       */
  var experimentalBufferLineImpl: js.UndefOr[xtermLib.xtermLibStrings.JsArray | xtermLib.xtermLibStrings.TypedArray] = js.undefined
  /**
       * What character atlas implementation to use. The character atlas caches drawn characters,
       * speeding up rendering significantly. However, it can introduce some minor rendering
       * artifacts.
       *
       * - 'none': Don't use an atlas.
       * - 'static': Generate an atlas when the terminal starts or is reconfigured. This atlas will
       *   only contain ASCII characters in 16 colors.
       * - 'dynamic': Generate an atlas using a LRU cache as characters are requested. Limited to
       *   ASCII characters (for now), but supports 256 colors. For characters covered by the static
       *   cache, it's slightly slower in comparison, since there's more overhead involved in
       *   managing the cache.
       *
       * Currently defaults to 'static'. This option may be removed in the future. If it is, passed
       * parameters will be ignored.
       */
  var experimentalCharAtlas: js.UndefOr[
    xtermLib.xtermLibStrings.none | xtermLib.xtermLibStrings.static | xtermLib.xtermLibStrings.dynamic
  ] = js.undefined
  /**
       * The font family used to render text.
       */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The font size used to render text.
       */
  var fontSize: js.UndefOr[scala.Double] = js.undefined
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
  var letterSpacing: js.UndefOr[scala.Double] = js.undefined
  /**
       * The line height used to render text.
       */
  var lineHeight: js.UndefOr[scala.Double] = js.undefined
  /**
       * Whether holding a modifier key will force normal selection behavior,
       * regardless of whether the terminal is in mouse events mode. This will
       * also prevent mouse events from being emitted by the terminal. For example,
       * this allows you to use xterm.js' regular selection inside tmux with
       * mouse mode enabled.
       */
  var macOptionClickForcesSelection: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether to treat option as the meta key.
       */
  var macOptionIsMeta: js.UndefOr[scala.Boolean] = js.undefined
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
  var rightClickSelectsWord: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The number of rows in the terminal.
       */
  var rows: js.UndefOr[scala.Double] = js.undefined
  /**
       * Whether screen reader support is enabled. When on this will expose
       * supporting elements in the DOM to support NVDA on Windows and VoiceOver
       * on macOS.
       */
  var screenReaderMode: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The amount of scrollback in the terminal. Scrollback is the amount of rows
       * that are retained when lines are scrolled beyond the initial viewport.
       */
  var scrollback: js.UndefOr[scala.Double] = js.undefined
  /**
       * The size of tab stops in the terminal.
       */
  var tabStopWidth: js.UndefOr[scala.Double] = js.undefined
  /**
       * The color theme of the terminal.
       */
  var theme: js.UndefOr[ITheme] = js.undefined
}

