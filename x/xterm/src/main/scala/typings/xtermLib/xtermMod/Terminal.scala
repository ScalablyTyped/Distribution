package typings
package xtermLib.xtermMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xterm", "Terminal")
@js.native
/**
  * Creates a new `Terminal` object.
  *
  * @param options An object containing a set of options.
  */
class Terminal ()
  extends IEventEmitter
     with IDisposable {
  def this(options: ITerminalOptions) = this()
  /**
    * The number of columns in the terminal's viewport.
    */
  var cols: scala.Double = js.native
  /**
    * The element containing the terminal.
    */
  var element: xtermLib.HTMLElement = js.native
  /**
    * (EXPERIMENTAL) Get all markers registered against the buffer. If the alt
    * buffer is active this will always return [].
    */
  var markers: js.Array[IMarker] = js.native
  /**
    * The number of rows in the terminal's viewport.
    */
  var rows: scala.Double = js.native
  /**
    * The textarea that accepts input for the terminal.
    */
  var textarea: xtermLib.HTMLTextAreaElement = js.native
  /**
    * (EXPERIMENTAL) Adds a handler for CSI escape sequences.
    * @param flag The flag should be one-character string, which specifies the
    * final character (e.g "m" for SGR) of the CSI sequence.
    * @param callback The function to handle the escape sequence. The callback
    * is called with the numerical params, as well as the special characters
    * (e.g. "$" for DECSCPP). Return true if the sequence was handled; false if
    * we should try a previous handler (set by addCsiHandler or setCsiHandler).
    * The most recently-added handler is tried first.
    * @return An IDisposable you can call to remove this handler.
    */
  def addCsiHandler(
    flag: java.lang.String,
    callback: js.Function2[/* params */ js.Array[scala.Double], /* collect */ java.lang.String, scala.Boolean]
  ): IDisposable = js.native
  /**
    * (EXPERIMENTAL) Adds a marker to the normal buffer and returns it. If the
    * alt buffer is active, undefined is returned.
    * @param cursorYOffset The y position offset of the marker from the cursor.
    */
  def addMarker(cursorYOffset: scala.Double): IMarker = js.native
  /**
    * (EXPERIMENTAL) Adds a handler for OSC escape sequences.
    * @param ident The number (first parameter) of the sequence.
    * @param callback The function to handle the escape sequence. The callback
    * is called with OSC data string. Return true if the sequence was handled;
    * false if we should try a previous handler (set by addOscHandler or
    * setOscHandler). The most recently-added handler is tried first.
    * @return An IDisposable you can call to remove this handler.
    */
  def addOscHandler(ident: scala.Double, callback: js.Function1[/* data */ java.lang.String, scala.Boolean]): IDisposable = js.native
  /**
    * Attaches a custom key event handler which is run before keys are
    * processed, giving consumers of xterm.js ultimate control as to what keys
    * should be processed by the terminal and what keys should not.
    * @param customKeyEventHandler The custom KeyboardEvent handler to attach.
    * This is a function that takes a KeyboardEvent, allowing consumers to stop
    * propogation and/or prevent the default action. The function returns
    * whether the event should be processed by xterm.js.
    */
  def attachCustomKeyEventHandler(customKeyEventHandler: js.Function1[/* event */ xtermLib.KeyboardEvent, scala.Boolean]): scala.Unit = js.native
  /**
    * Unfocus the terminal.
    */
  def blur(): scala.Unit = js.native
  /**
    * Clear the entire buffer, making the prompt line the new first line.
    */
  def clear(): scala.Unit = js.native
  /**
    * Clears the current terminal selection.
    */
  def clearSelection(): scala.Unit = js.native
  /**
    * (EXPERIMENTAL) Deregisters the character joiner if one was registered.
    * NOTE: character joiners are only used by the canvas renderer.
    * @param joinerId The character joiner's ID (returned after register)
    */
  def deregisterCharacterJoiner(joinerId: scala.Double): scala.Unit = js.native
  /**
    * (EXPERIMENTAL) Deregisters a link matcher if it has been registered.
    * @param matcherId The link matcher's ID (returned after register)
    */
  def deregisterLinkMatcher(matcherId: scala.Double): scala.Unit = js.native
  /**
    * Destroys the terminal and detaches it from the DOM.
    *
    * @deprecated Use dispose() instead.
    */
  def destroy(): scala.Unit = js.native
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  /**
    * Focus the terminal.
    */
  def focus(): scala.Unit = js.native
  /**
    * Retrieves an option's value from the terminal.
    * @param key The option key.
    */
  def getOption(
    key: xtermLib.xtermLibStrings.allowTransparency | xtermLib.xtermLibStrings.cancelEvents | xtermLib.xtermLibStrings.convertEol | xtermLib.xtermLibStrings.cursorBlink | xtermLib.xtermLibStrings.debug | xtermLib.xtermLibStrings.disableStdin | xtermLib.xtermLibStrings.enableBold | xtermLib.xtermLibStrings.macOptionIsMeta | xtermLib.xtermLibStrings.rightClickSelectsWord | xtermLib.xtermLibStrings.popOnBell | xtermLib.xtermLibStrings.screenKeys | xtermLib.xtermLibStrings.useFlowControl | xtermLib.xtermLibStrings.visualBell
  ): scala.Boolean = js.native
  /**
    * Retrieves an option's value from the terminal.
    * @param key The option key.
    */
  def getOption(key: java.lang.String): js.Any = js.native
  /**
    * Retrieves an option's value from the terminal.
    * @param key The option key.
    */
  @JSName("getOption")
  def getOption_bellSound(key: xtermLib.xtermLibStrings.bellSound): java.lang.String = js.native
  @JSName("getOption")
  def getOption_bellStyle(key: xtermLib.xtermLibStrings.bellStyle): java.lang.String = js.native
  /**
    * Retrieves an option's value from the terminal.
    * @param key The option key.
    */
  @JSName("getOption")
  def getOption_colors(key: xtermLib.xtermLibStrings.colors): js.Array[java.lang.String] = js.native
  /**
    * Retrieves an option's value from the terminal.
    * @param key The option key.
    */
  @JSName("getOption")
  def getOption_cols(key: xtermLib.xtermLibStrings.cols): scala.Double = js.native
  @JSName("getOption")
  def getOption_cursorStyle(key: xtermLib.xtermLibStrings.cursorStyle): java.lang.String = js.native
  @JSName("getOption")
  def getOption_fontFamily(key: xtermLib.xtermLibStrings.fontFamily): java.lang.String = js.native
  @JSName("getOption")
  def getOption_fontSize(key: xtermLib.xtermLibStrings.fontSize): scala.Double = js.native
  @JSName("getOption")
  def getOption_fontWeight(key: xtermLib.xtermLibStrings.fontWeight): java.lang.String = js.native
  @JSName("getOption")
  def getOption_fontWeightBold(key: xtermLib.xtermLibStrings.fontWeightBold): java.lang.String = js.native
  /**
    * Retrieves an option's value from the terminal.
    * @param key The option key.
    */
  @JSName("getOption")
  def getOption_handler(key: xtermLib.xtermLibStrings.handler): js.Function1[/* data */ java.lang.String, scala.Unit] = js.native
  @JSName("getOption")
  def getOption_letterSpacing(key: xtermLib.xtermLibStrings.letterSpacing): scala.Double = js.native
  @JSName("getOption")
  def getOption_lineHeight(key: xtermLib.xtermLibStrings.lineHeight): scala.Double = js.native
  @JSName("getOption")
  def getOption_rendererType(key: xtermLib.xtermLibStrings.rendererType): java.lang.String = js.native
  @JSName("getOption")
  def getOption_rows(key: xtermLib.xtermLibStrings.rows): scala.Double = js.native
  @JSName("getOption")
  def getOption_scrollback(key: xtermLib.xtermLibStrings.scrollback): scala.Double = js.native
  @JSName("getOption")
  def getOption_tabStopWidth(key: xtermLib.xtermLibStrings.tabStopWidth): scala.Double = js.native
  @JSName("getOption")
  def getOption_termName(key: xtermLib.xtermLibStrings.termName): java.lang.String = js.native
  /**
    * Gets the terminal's current selection, this is useful for implementing
    * copy behavior outside of xterm.js.
    */
  def getSelection(): java.lang.String = js.native
  /**
    * Gets whether the terminal has an active selection.
    */
  def hasSelection(): scala.Boolean = js.native
  /**
    * Deregisters an event listener.
    * @param type The type of the event.
    * @param listener The listener.
    */
  def off(
    `type`: xtermLib.xtermLibStrings.blur | xtermLib.xtermLibStrings.focus | xtermLib.xtermLibStrings.linefeed | xtermLib.xtermLibStrings.selection | xtermLib.xtermLibStrings.data | xtermLib.xtermLibStrings.key | xtermLib.xtermLibStrings.keypress | xtermLib.xtermLibStrings.keydown | xtermLib.xtermLibStrings.refresh | xtermLib.xtermLibStrings.resize | xtermLib.xtermLibStrings.scroll | xtermLib.xtermLibStrings.title | java.lang.String,
    listener: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Registers an event listener.
    * @param type The type of the event.
    * @param listener The listener.
    */
  @JSName("on")
  def on_blur(`type`: xtermLib.xtermLibStrings.blur, listener: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Registers an event listener.
    * @param type The type of the event.
    * @param listener The listener.
    */
  @JSName("on")
  def on_data(`type`: xtermLib.xtermLibStrings.data, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_focus(`type`: xtermLib.xtermLibStrings.focus, listener: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Registers an event listener.
    * @param type The type of the event.
    * @param listener The listener.
    */
  @JSName("on")
  def on_key(
    `type`: xtermLib.xtermLibStrings.key,
    listener: js.Function2[/* key */ java.lang.String, /* event */ xtermLib.KeyboardEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_keydown(
    `type`: xtermLib.xtermLibStrings.keydown,
    listener: js.Function1[/* event */ xtermLib.KeyboardEvent, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Registers an event listener.
    * @param type The type of the event.
    * @param listener The listener.
    */
  @JSName("on")
  def on_keypress(
    `type`: xtermLib.xtermLibStrings.keypress,
    listener: js.Function1[/* event */ xtermLib.KeyboardEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_linefeed(`type`: xtermLib.xtermLibStrings.linefeed, listener: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Registers an event listener.
    * @param type The type of the event.
    * @param listener The listener.
    */
  @JSName("on")
  def on_refresh(
    `type`: xtermLib.xtermLibStrings.refresh,
    listener: js.Function1[/* data */ xtermLib.Anon_Start, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Registers an event listener.
    * @param type The type of the event.
    * @param listener The listener.
    */
  @JSName("on")
  def on_resize(
    `type`: xtermLib.xtermLibStrings.resize,
    listener: js.Function1[/* data */ xtermLib.Anon_Cols, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Registers an event listener.
    * @param type The type of the event.
    * @param listener The listener.
    */
  @JSName("on")
  def on_scroll(
    `type`: xtermLib.xtermLibStrings.scroll,
    listener: js.Function1[/* ydisp */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_selection(`type`: xtermLib.xtermLibStrings.selection, listener: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Registers an event listener.
    * @param type The type of the event.
    * @param listener The listener.
    */
  @JSName("on")
  def on_title(
    `type`: xtermLib.xtermLibStrings.title,
    listener: js.Function1[/* title */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Opens the terminal within an element.
    * @param parent The element to create the terminal within. This element
    * must be visible (have dimensions) when `open` is called as several DOM-
    * based measurements need to be performed when this function is called.
    */
  def open(parent: xtermLib.HTMLElement): scala.Unit = js.native
  /**
    * Tells the renderer to refresh terminal content between two rows
    * (inclusive) at the next opportunity.
    * @param start The row to start from (between 0 and this.rows - 1).
    * @param end The row to end at (between start and this.rows - 1).
    */
  def refresh(start: scala.Double, end: scala.Double): scala.Unit = js.native
  /**
    * (EXPERIMENTAL) Registers a character joiner, allowing custom sequences of
    * characters to be rendered as a single unit. This is useful in particular
    * for rendering ligatures and graphemes, among other things.
    *
    * Each registered character joiner is called with a string of text
    * representing a portion of a line in the terminal that can be rendered as
    * a single unit. The joiner must return a sorted array, where each entry is
    * itself an array of length two, containing the start (inclusive) and end
    * (exclusive) index of a substring of the input that should be rendered as
    * a single unit. When multiple joiners are provided, the results of each
    * are collected. If there are any overlapping substrings between them, they
    * are combined into one larger unit that is drawn together.
    *
    * All character joiners that are registered get called every time a line is
    * rendered in the terminal, so it is essential for the handler function to
    * run as quickly as possible to avoid slowdowns when rendering. Similarly,
    * joiners should strive to return the smallest possible substrings to
    * render together, since they aren't drawn as optimally as individual
    * characters.
    *
    * NOTE: character joiners are only used by the canvas renderer.
    *
    * @param handler The function that determines character joins. It is called
    * with a string of text that is eligible for joining and returns an array
    * where each entry is an array containing the start (inclusive) and end
    * (exclusive) indexes of ranges that should be rendered as a single unit.
    * @return The ID of the new joiner, this can be used to deregister
    */
  def registerCharacterJoiner(
    handler: js.Function1[/* text */ java.lang.String, js.Array[js.Tuple2[scala.Double, scala.Double]]]
  ): scala.Double = js.native
  /**
    * (EXPERIMENTAL) Registers a link matcher, allowing custom link patterns to
    * be matched and handled.
    * @param regex The regular expression to search for, specifically this
    * searches the textContent of the rows. You will want to use \s to match a
    * space ' ' character for example.
    * @param handler The callback when the link is called.
    * @param options Options for the link matcher.
    * @return The ID of the new matcher, this can be used to deregister.
    */
  def registerLinkMatcher(
    regex: stdLib.RegExp,
    handler: js.Function2[/* event */ xtermLib.MouseEvent, /* uri */ java.lang.String, scala.Unit]
  ): scala.Double = js.native
  def registerLinkMatcher(
    regex: stdLib.RegExp,
    handler: js.Function2[/* event */ xtermLib.MouseEvent, /* uri */ java.lang.String, scala.Unit],
    options: ILinkMatcherOptions
  ): scala.Double = js.native
  /**
    * Perform a full reset (RIS, aka '\x1bc').
    */
  def reset(): scala.Unit = js.native
  /**
    * Resizes the terminal.
    * @param x The number of columns to resize to.
    * @param y The number of rows to resize to.
    */
  def resize(columns: scala.Double, rows: scala.Double): scala.Unit = js.native
  /**
    * Scroll the display of the terminal
    * @param amount The number of lines to scroll down (negative scroll up).
    */
  def scrollLines(amount: scala.Double): scala.Unit = js.native
  /**
    * Scroll the display of the terminal by a number of pages.
    * @param pageCount The number of pages to scroll (negative scrolls up).
    */
  def scrollPages(pageCount: scala.Double): scala.Unit = js.native
  /**
    * Scrolls the display of the terminal to the bottom.
    */
  def scrollToBottom(): scala.Unit = js.native
  /**
    * Scrolls to a line within the buffer.
    * @param line The 0-based line index to scroll to.
    */
  def scrollToLine(line: scala.Double): scala.Unit = js.native
  /**
    * Scrolls the display of the terminal to the top.
    */
  def scrollToTop(): scala.Unit = js.native
  /**
    * Selects all text within the terminal.
    */
  def selectAll(): scala.Unit = js.native
  /**
    * Selects text in the buffer between 2 lines.
    * @param start The 0-based line index to select from (inclusive).
    * @param end The 0-based line index to select to (inclusive).
    */
  def selectLines(start: scala.Double, end: scala.Double): scala.Unit = js.native
  /**
    * Sets an option on the terminal.
    * @param key The option key.
    * @param value The option value.
    */
  def setOption(
    key: xtermLib.xtermLibStrings.allowTransparency | xtermLib.xtermLibStrings.cancelEvents | xtermLib.xtermLibStrings.convertEol | xtermLib.xtermLibStrings.cursorBlink | xtermLib.xtermLibStrings.debug | xtermLib.xtermLibStrings.disableStdin | xtermLib.xtermLibStrings.enableBold | xtermLib.xtermLibStrings.macOptionIsMeta | xtermLib.xtermLibStrings.popOnBell | xtermLib.xtermLibStrings.rightClickSelectsWord | xtermLib.xtermLibStrings.screenKeys | xtermLib.xtermLibStrings.useFlowControl | xtermLib.xtermLibStrings.visualBell,
    value: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Sets an option on the terminal.
    * @param key The option key.
    * @param value The option value.
    */
  def setOption(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def setOption(key: xtermLib.xtermLibStrings.bellStyle, value: xtermLib.xtermLibStrings.both): scala.Unit = js.native
  def setOption(key: xtermLib.xtermLibStrings.bellStyle, value: xtermLib.xtermLibStrings.none): scala.Unit = js.native
  def setOption(key: xtermLib.xtermLibStrings.bellStyle, value: xtermLib.xtermLibStrings.sound): scala.Unit = js.native
  def setOption(key: xtermLib.xtermLibStrings.bellStyle, value: xtermLib.xtermLibStrings.visual): scala.Unit = js.native
  def setOption(key: xtermLib.xtermLibStrings.cursorStyle, value: xtermLib.xtermLibStrings.bar): scala.Unit = js.native
  def setOption(key: xtermLib.xtermLibStrings.cursorStyle, value: xtermLib.xtermLibStrings.block): scala.Unit = js.native
  def setOption(key: xtermLib.xtermLibStrings.cursorStyle, value: xtermLib.xtermLibStrings.underline): scala.Unit = js.native
  def setOption(
    key: xtermLib.xtermLibStrings.fontWeightBold,
    value: xtermLib.xtermLibStrings.normal | xtermLib.xtermLibStrings.bold | xtermLib.xtermLibStrings.`100` | xtermLib.xtermLibStrings.`200` | xtermLib.xtermLibStrings.`300` | xtermLib.xtermLibStrings.`400` | xtermLib.xtermLibStrings.`500` | xtermLib.xtermLibStrings.`600` | xtermLib.xtermLibStrings.`700` | xtermLib.xtermLibStrings.`800` | xtermLib.xtermLibStrings.`900`
  ): scala.Unit = js.native
  def setOption(
    key: xtermLib.xtermLibStrings.fontWeight,
    value: xtermLib.xtermLibStrings.normal | xtermLib.xtermLibStrings.bold | xtermLib.xtermLibStrings.`100` | xtermLib.xtermLibStrings.`200` | xtermLib.xtermLibStrings.`300` | xtermLib.xtermLibStrings.`400` | xtermLib.xtermLibStrings.`500` | xtermLib.xtermLibStrings.`600` | xtermLib.xtermLibStrings.`700` | xtermLib.xtermLibStrings.`800` | xtermLib.xtermLibStrings.`900`
  ): scala.Unit = js.native
  @JSName("setOption")
  def setOption_bellSound(key: xtermLib.xtermLibStrings.bellSound, value: java.lang.String): scala.Unit = js.native
  /**
    * Sets an option on the terminal.
    * @param key The option key.
    * @param value The option value.
    */
  @JSName("setOption")
  def setOption_bellStyle(key: xtermLib.xtermLibStrings.bellStyle): scala.Unit = js.native
  /**
    * Sets an option on the terminal.
    * @param key The option key.
    * @param value The option value.
    */
  @JSName("setOption")
  def setOption_colors(key: xtermLib.xtermLibStrings.colors, value: js.Array[java.lang.String]): scala.Unit = js.native
  /**
    * Sets an option on the terminal.
    * @param key The option key.
    * @param value The option value.
    */
  @JSName("setOption")
  def setOption_cols(key: xtermLib.xtermLibStrings.cols, value: scala.Double): scala.Unit = js.native
  /**
    * Sets an option on the terminal.
    * @param key The option key.
    * @param value The option value.
    */
  @JSName("setOption")
  def setOption_cursorStyle(key: xtermLib.xtermLibStrings.cursorStyle): scala.Unit = js.native
  /**
    * Sets an option on the terminal.
    * @param key The option key.
    * @param value The option value.
    */
  @JSName("setOption")
  def setOption_fontFamily(key: xtermLib.xtermLibStrings.fontFamily, value: java.lang.String): scala.Unit = js.native
  /**
    * Sets an option on the terminal.
    * @param key The option key.
    * @param value The option value.
    */
  @JSName("setOption")
  def setOption_fontSize(key: xtermLib.xtermLibStrings.fontSize, value: scala.Double): scala.Unit = js.native
  /**
    * Sets an option on the terminal.
    * @param key The option key.
    * @param value The option value.
    */
  @JSName("setOption")
  def setOption_fontWeight(key: xtermLib.xtermLibStrings.fontWeight): scala.Unit = js.native
  @JSName("setOption")
  def setOption_fontWeightBold(key: xtermLib.xtermLibStrings.fontWeightBold): scala.Unit = js.native
  /**
    * Sets an option on the terminal.
    * @param key The option key.
    * @param value The option value.
    */
  @JSName("setOption")
  def setOption_handler(
    key: xtermLib.xtermLibStrings.handler,
    value: js.Function1[/* data */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  @JSName("setOption")
  def setOption_letterSpacing(key: xtermLib.xtermLibStrings.letterSpacing, value: scala.Double): scala.Unit = js.native
  @JSName("setOption")
  def setOption_lineHeight(key: xtermLib.xtermLibStrings.lineHeight, value: scala.Double): scala.Unit = js.native
  @JSName("setOption")
  def setOption_rows(key: xtermLib.xtermLibStrings.rows, value: scala.Double): scala.Unit = js.native
  @JSName("setOption")
  def setOption_scrollback(key: xtermLib.xtermLibStrings.scrollback, value: scala.Double): scala.Unit = js.native
  @JSName("setOption")
  def setOption_tabStopWidth(key: xtermLib.xtermLibStrings.tabStopWidth, value: scala.Double): scala.Unit = js.native
  @JSName("setOption")
  def setOption_termName(key: xtermLib.xtermLibStrings.termName, value: java.lang.String): scala.Unit = js.native
  /**
    * Sets an option on the terminal.
    * @param key The option key.
    * @param value The option value.
    */
  @JSName("setOption")
  def setOption_theme(key: xtermLib.xtermLibStrings.theme, value: ITheme): scala.Unit = js.native
  /**
    * Writes text to the terminal.
    * @param data The text to write to the terminal.
    */
  def write(data: java.lang.String): scala.Unit = js.native
  /**
    * Writes text to the terminal, followed by a break line character (\n).
    * @param data The text to write to the terminal.
    */
  def writeln(data: java.lang.String): scala.Unit = js.native
}

@JSImport("xterm", "Terminal")
@js.native
object Terminal extends js.Object {
  /**
    * Natural language strings that can be localized.
    */
  var strings: xtermLib.xtermMod.ILocalizableStrings = js.native
  /**
    * Applies an addon to the Terminal prototype, making it available to all
    * newly created Terminals.
    * @param addon The addon to apply.
    */
  def applyAddon(addon: js.Any): scala.Unit = js.native
}

