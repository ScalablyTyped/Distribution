package typings.xterm.mod

import typings.std.HTMLElement
import typings.std.HTMLTextAreaElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.RegExp
import typings.std.Uint8Array
import typings.xterm.AnonCols
import typings.xterm.AnonDomEvent
import typings.xterm.AnonEnd
import typings.xterm.xtermStrings.`100`
import typings.xterm.xtermStrings.`200`
import typings.xterm.xtermStrings.`300`
import typings.xterm.xtermStrings.`400`
import typings.xterm.xtermStrings.`500`
import typings.xterm.xtermStrings.`600`
import typings.xterm.xtermStrings.`700`
import typings.xterm.xtermStrings.`800`
import typings.xterm.xtermStrings.`900`
import typings.xterm.xtermStrings.allowTransparency
import typings.xterm.xtermStrings.bar
import typings.xterm.xtermStrings.bellSound
import typings.xterm.xtermStrings.bellStyle
import typings.xterm.xtermStrings.block
import typings.xterm.xtermStrings.bold
import typings.xterm.xtermStrings.both
import typings.xterm.xtermStrings.cancelEvents
import typings.xterm.xtermStrings.colors
import typings.xterm.xtermStrings.convertEol
import typings.xterm.xtermStrings.cursorBlink
import typings.xterm.xtermStrings.cursorStyle
import typings.xterm.xtermStrings.disableStdin
import typings.xterm.xtermStrings.fontFamily
import typings.xterm.xtermStrings.fontSize
import typings.xterm.xtermStrings.fontWeight
import typings.xterm.xtermStrings.fontWeightBold
import typings.xterm.xtermStrings.handler
import typings.xterm.xtermStrings.letterSpacing
import typings.xterm.xtermStrings.lineHeight
import typings.xterm.xtermStrings.logLevel
import typings.xterm.xtermStrings.macOptionIsMeta
import typings.xterm.xtermStrings.none
import typings.xterm.xtermStrings.normal
import typings.xterm.xtermStrings.popOnBell
import typings.xterm.xtermStrings.rendererType
import typings.xterm.xtermStrings.rightClickSelectsWord
import typings.xterm.xtermStrings.screenKeys
import typings.xterm.xtermStrings.scrollback
import typings.xterm.xtermStrings.sound
import typings.xterm.xtermStrings.tabStopWidth
import typings.xterm.xtermStrings.termName
import typings.xterm.xtermStrings.theme
import typings.xterm.xtermStrings.underline
import typings.xterm.xtermStrings.useFlowControl
import typings.xterm.xtermStrings.visual
import typings.xterm.xtermStrings.visualBell
import typings.xterm.xtermStrings.windowsMode
import typings.xterm.xtermStrings.wordSeparator
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
class Terminal () extends IDisposable {
  def this(options: ITerminalOptions) = this()
  /**
    * (EXPERIMENTAL) The terminal's current buffer, this might be either the
    * normal buffer or the alt buffer depending on what's running in the
    * terminal.
    */
  val buffer: IBuffer = js.native
  /**
    * The number of columns in the terminal's viewport. Use
    * `ITerminalOptions.cols` to set this in the constructor and
    * `Terminal.resize` for when the terminal exists.
    */
  val cols: Double = js.native
  /**
    * The element containing the terminal.
    */
  val element: js.UndefOr[HTMLElement] = js.native
  /**
    * (EXPERIMENTAL) Get all markers registered against the buffer. If the alt
    * buffer is active this will always return [].
    */
  val markers: js.Array[IMarker] = js.native
  /**
    * Adds an event listener for when a binary event fires. This is used to
    * enable non UTF-8 conformant binary messages to be sent to the backend.
    * Currently this is only used for a certain type of mouse reports that
    * happen to be not UTF-8 compatible.
    * The event value is a JS string, pass it to the underlying pty as
    * binary data, e.g. `pty.write(Buffer.from(data, 'binary'))`. 
    * @returns an `IDisposable` to stop listening.
    */
  @JSName("onBinary")
  var onBinary_Original: IEvent[String] = js.native
  /**
    * Adds an event listener for the cursor moves.
    * @returns an `IDisposable` to stop listening.
    */
  @JSName("onCursorMove")
  var onCursorMove_Original: IEvent[Unit] = js.native
  /**
    * Adds an event listener for when a data event fires. This happens for
    * example when the user types or pastes into the terminal. The event value
    * is whatever `string` results, in a typical setup, this should be passed
    * on to the backing pty.
    * @returns an `IDisposable` to stop listening.
    */
  @JSName("onData")
  var onData_Original: IEvent[String] = js.native
  /**
    * Adds an event listener for when a key is pressed. The event value contains the
    * string that will be sent in the data event as well as the DOM event that
    * triggered it.
    * @returns an `IDisposable` to stop listening.
    */
  @JSName("onKey")
  var onKey_Original: IEvent[AnonDomEvent] = js.native
  /**
    * Adds an event listener for when a line feed is added.
    * @returns an `IDisposable` to stop listening.
    */
  @JSName("onLineFeed")
  var onLineFeed_Original: IEvent[Unit] = js.native
  /**
    * Adds an event listener for when rows are rendered. The event value
    * contains the start row and end rows of the rendered area (ranges from `0`
    * to `Terminal.rows - 1`).
    * @returns an `IDisposable` to stop listening.
    */
  @JSName("onRender")
  var onRender_Original: IEvent[AnonEnd] = js.native
  /**
    * Adds an event listener for when the terminal is resized. The event value
    * contains the new size.
    * @returns an `IDisposable` to stop listening.
    */
  @JSName("onResize")
  var onResize_Original: IEvent[AnonCols] = js.native
  /**
    * Adds an event listener for when a scroll occurs. The event value is the
    * new position of the viewport.
    * @returns an `IDisposable` to stop listening.
    */
  @JSName("onScroll")
  var onScroll_Original: IEvent[Double] = js.native
  /**
    * Adds an event listener for when a selection change occurs.
    * @returns an `IDisposable` to stop listening.
    */
  @JSName("onSelectionChange")
  var onSelectionChange_Original: IEvent[Unit] = js.native
  /**
    * Adds an event listener for when an OSC 0 or OSC 2 title change occurs.
    * The event value is the new title.
    * @returns an `IDisposable` to stop listening.
    */
  @JSName("onTitleChange")
  var onTitleChange_Original: IEvent[String] = js.native
  /**
    * (EXPERIMENTAL) Get the parser interface to register
    * custom escape sequence handlers.
    */
  val parser: IParser = js.native
  /**
    * The number of rows in the terminal's viewport. Use
    * `ITerminalOptions.rows` to set this in the constructor and
    * `Terminal.resize` for when the terminal exists.
    */
  val rows: Double = js.native
  /**
    * The textarea that accepts input for the terminal.
    */
  val textarea: js.UndefOr[HTMLTextAreaElement] = js.native
  /**
    * (EXPERIMENTAL) Adds a marker to the normal buffer and returns it. If the
    * alt buffer is active, undefined is returned.
    * @param cursorYOffset The y position offset of the marker from the cursor.
    */
  def addMarker(cursorYOffset: Double): IMarker = js.native
  /**
    * Attaches a custom key event handler which is run before keys are
    * processed, giving consumers of xterm.js ultimate control as to what keys
    * should be processed by the terminal and what keys should not.
    * @param customKeyEventHandler The custom KeyboardEvent handler to attach.
    * This is a function that takes a KeyboardEvent, allowing consumers to stop
    * propagation and/or prevent the default action. The function returns
    * whether the event should be processed by xterm.js.
    */
  def attachCustomKeyEventHandler(customKeyEventHandler: js.Function1[/* event */ KeyboardEvent, Boolean]): Unit = js.native
  /**
    * Unfocus the terminal.
    */
  def blur(): Unit = js.native
  /**
    * Clear the entire buffer, making the prompt line the new first line.
    */
  def clear(): Unit = js.native
  /**
    * Clears the current terminal selection.
    */
  def clearSelection(): Unit = js.native
  /**
    * (EXPERIMENTAL) Deregisters the character joiner if one was registered.
    * NOTE: character joiners are only used by the canvas renderer.
    * @param joinerId The character joiner's ID (returned after register)
    */
  def deregisterCharacterJoiner(joinerId: Double): Unit = js.native
  /**
    * (EXPERIMENTAL) Deregisters a link matcher if it has been registered.
    * @param matcherId The link matcher's ID (returned after register)
    */
  def deregisterLinkMatcher(matcherId: Double): Unit = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /**
    * Focus the terminal.
    */
  def focus(): Unit = js.native
  /**
    * Retrieves an option's value from the terminal.
    * @param key The option key.
    */
  def getOption(
    key: bellSound | bellStyle | cursorStyle | fontFamily | fontWeight | fontWeightBold | logLevel | rendererType | termName | wordSeparator
  ): String = js.native
  /**
    * Retrieves an option's value from the terminal.
    * @param key The option key.
    */
  def getOption(key: String): js.Any = js.native
  /**
    * Retrieves an option's value from the terminal.
    * @param key The option key.
    */
  @JSName("getOption")
  def getOption_Boolean(
    key: allowTransparency | cancelEvents | convertEol | cursorBlink | disableStdin | macOptionIsMeta | rightClickSelectsWord | popOnBell | screenKeys | useFlowControl | visualBell | windowsMode
  ): Boolean = js.native
  /**
    * Retrieves an option's value from the terminal.
    * @param key The option key.
    */
  @JSName("getOption")
  def getOption_colors(key: colors): js.Array[String] = js.native
  /**
    * Retrieves an option's value from the terminal.
    * @param key The option key.
    */
  @JSName("getOption")
  def getOption_cols(key: typings.xterm.xtermStrings.cols): Double = js.native
  @JSName("getOption")
  def getOption_fontSize(key: fontSize): Double = js.native
  /**
    * Retrieves an option's value from the terminal.
    * @param key The option key.
    */
  @JSName("getOption")
  def getOption_handler(key: handler): js.Function1[/* data */ String, Unit] = js.native
  @JSName("getOption")
  def getOption_letterSpacing(key: letterSpacing): Double = js.native
  @JSName("getOption")
  def getOption_lineHeight(key: lineHeight): Double = js.native
  @JSName("getOption")
  def getOption_rows(key: typings.xterm.xtermStrings.rows): Double = js.native
  @JSName("getOption")
  def getOption_scrollback(key: scrollback): Double = js.native
  @JSName("getOption")
  def getOption_tabStopWidth(key: tabStopWidth): Double = js.native
  /**
    * Gets the terminal's current selection, this is useful for implementing
    * copy behavior outside of xterm.js.
    */
  def getSelection(): String = js.native
  /**
    * Gets the selection position or undefined if there is no selection.
    */
  def getSelectionPosition(): js.UndefOr[ISelectionPosition] = js.native
  /**
    * Gets whether the terminal has an active selection.
    */
  def hasSelection(): Boolean = js.native
  /**
    * Loads an addon into this instance of xterm.js.
    * @param addon The addon to load.
    */
  def loadAddon(addon: ITerminalAddon): Unit = js.native
  /**
    * Adds an event listener for when a binary event fires. This is used to
    * enable non UTF-8 conformant binary messages to be sent to the backend.
    * Currently this is only used for a certain type of mouse reports that
    * happen to be not UTF-8 compatible.
    * The event value is a JS string, pass it to the underlying pty as
    * binary data, e.g. `pty.write(Buffer.from(data, 'binary'))`. 
    * @returns an `IDisposable` to stop listening.
    */
  def onBinary(listener: js.Function1[/* e */ String, _]): IDisposable = js.native
  /**
    * Adds an event listener for the cursor moves.
    * @returns an `IDisposable` to stop listening.
    */
  def onCursorMove(listener: js.Function1[/* e */ Unit, _]): IDisposable = js.native
  /**
    * Adds an event listener for when a data event fires. This happens for
    * example when the user types or pastes into the terminal. The event value
    * is whatever `string` results, in a typical setup, this should be passed
    * on to the backing pty.
    * @returns an `IDisposable` to stop listening.
    */
  def onData(listener: js.Function1[/* e */ String, _]): IDisposable = js.native
  /**
    * Adds an event listener for when a key is pressed. The event value contains the
    * string that will be sent in the data event as well as the DOM event that
    * triggered it.
    * @returns an `IDisposable` to stop listening.
    */
  def onKey(listener: js.Function1[/* e */ AnonDomEvent, _]): IDisposable = js.native
  /**
    * Adds an event listener for when a line feed is added.
    * @returns an `IDisposable` to stop listening.
    */
  def onLineFeed(listener: js.Function1[/* e */ Unit, _]): IDisposable = js.native
  /**
    * Adds an event listener for when rows are rendered. The event value
    * contains the start row and end rows of the rendered area (ranges from `0`
    * to `Terminal.rows - 1`).
    * @returns an `IDisposable` to stop listening.
    */
  def onRender(listener: js.Function1[/* e */ AnonEnd, _]): IDisposable = js.native
  /**
    * Adds an event listener for when the terminal is resized. The event value
    * contains the new size.
    * @returns an `IDisposable` to stop listening.
    */
  def onResize(listener: js.Function1[/* e */ AnonCols, _]): IDisposable = js.native
  /**
    * Adds an event listener for when a scroll occurs. The event value is the
    * new position of the viewport.
    * @returns an `IDisposable` to stop listening.
    */
  def onScroll(listener: js.Function1[/* e */ Double, _]): IDisposable = js.native
  /**
    * Adds an event listener for when a selection change occurs.
    * @returns an `IDisposable` to stop listening.
    */
  def onSelectionChange(listener: js.Function1[/* e */ Unit, _]): IDisposable = js.native
  /**
    * Adds an event listener for when an OSC 0 or OSC 2 title change occurs.
    * The event value is the new title.
    * @returns an `IDisposable` to stop listening.
    */
  def onTitleChange(listener: js.Function1[/* e */ String, _]): IDisposable = js.native
  /**
    * Opens the terminal within an element.
    * @param parent The element to create the terminal within. This element
    * must be visible (have dimensions) when `open` is called as several DOM-
    * based measurements need to be performed when this function is called.
    */
  def open(parent: HTMLElement): Unit = js.native
  /**
    * Writes text to the terminal, performing the necessary transformations for pasted text.
    * @param data The text to write to the terminal.
    */
  def paste(data: String): Unit = js.native
  /**
    * Tells the renderer to refresh terminal content between two rows
    * (inclusive) at the next opportunity.
    * @param start The row to start from (between 0 and this.rows - 1).
    * @param end The row to end at (between start and this.rows - 1).
    */
  def refresh(start: Double, end: Double): Unit = js.native
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
  def registerCharacterJoiner(handler: js.Function1[/* text */ String, js.Array[js.Tuple2[Double, Double]]]): Double = js.native
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
  def registerLinkMatcher(regex: RegExp, handler: js.Function2[/* event */ MouseEvent, /* uri */ String, Unit]): Double = js.native
  def registerLinkMatcher(
    regex: RegExp,
    handler: js.Function2[/* event */ MouseEvent, /* uri */ String, Unit],
    options: ILinkMatcherOptions
  ): Double = js.native
  /**
    * Perform a full reset (RIS, aka '\x1bc').
    */
  def reset(): Unit = js.native
  /**
    * Resizes the terminal. It's best practice to debounce calls to resize,
    * this will help ensure that the pty can respond to the resize event
    * before another one occurs.
    * @param x The number of columns to resize to.
    * @param y The number of rows to resize to.
    */
  def resize(columns: Double, rows: Double): Unit = js.native
  /**
    * Scroll the display of the terminal
    * @param amount The number of lines to scroll down (negative scroll up).
    */
  def scrollLines(amount: Double): Unit = js.native
  /**
    * Scroll the display of the terminal by a number of pages.
    * @param pageCount The number of pages to scroll (negative scrolls up).
    */
  def scrollPages(pageCount: Double): Unit = js.native
  /**
    * Scrolls the display of the terminal to the bottom.
    */
  def scrollToBottom(): Unit = js.native
  /**
    * Scrolls to a line within the buffer.
    * @param line The 0-based line index to scroll to.
    */
  def scrollToLine(line: Double): Unit = js.native
  /**
    * Scrolls the display of the terminal to the top.
    */
  def scrollToTop(): Unit = js.native
  /**
    * Selects text within the terminal.
    * @param column The column the selection starts at.
    * @param row The row the selection starts at.
    * @param length The length of the selection.
    */
  def select(column: Double, row: Double, length: Double): Unit = js.native
  /**
    * Selects all text within the terminal.
    */
  def selectAll(): Unit = js.native
  /**
    * Selects text in the buffer between 2 lines.
    * @param start The 0-based line index to select from (inclusive).
    * @param end The 0-based line index to select to (inclusive).
    */
  def selectLines(start: Double, end: Double): Unit = js.native
  /**
    * Sets an option on the terminal.
    * @param key The option key.
    * @param value The option value.
    */
  def setOption(
    key: allowTransparency | cancelEvents | convertEol | cursorBlink | disableStdin | macOptionIsMeta | popOnBell | rightClickSelectsWord | screenKeys | useFlowControl | visualBell | windowsMode,
    value: Boolean
  ): Unit = js.native
  /**
    * Sets an option on the terminal.
    * @param key The option key.
    * @param value The option value.
    */
  def setOption(key: String, value: js.Any): Unit = js.native
  def setOption(key: bellStyle, value: both): Unit = js.native
  def setOption(key: bellStyle, value: none): Unit = js.native
  def setOption(key: bellStyle, value: sound): Unit = js.native
  def setOption(key: bellStyle, value: visual): Unit = js.native
  def setOption(key: cursorStyle, value: bar): Unit = js.native
  def setOption(key: cursorStyle, value: block): Unit = js.native
  def setOption(key: cursorStyle, value: underline): Unit = js.native
  def setOption(
    key: fontWeightBold,
    value: normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`
  ): Unit = js.native
  def setOption(
    key: fontWeight,
    value: normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`
  ): Unit = js.native
  @JSName("setOption")
  def setOption_bellSound(key: bellSound, value: String): Unit = js.native
  /**
    * Sets an option on the terminal.
    * @param key The option key.
    * @param value The option value.
    */
  @JSName("setOption")
  def setOption_bellStyle(key: bellStyle): Unit = js.native
  /**
    * Sets an option on the terminal.
    * @param key The option key.
    * @param value The option value.
    */
  @JSName("setOption")
  def setOption_colors(key: colors, value: js.Array[String]): Unit = js.native
  /**
    * Sets an option on the terminal.
    * @param key The option key.
    * @param value The option value.
    */
  @JSName("setOption")
  def setOption_cols(key: typings.xterm.xtermStrings.cols, value: Double): Unit = js.native
  /**
    * Sets an option on the terminal.
    * @param key The option key.
    * @param value The option value.
    */
  @JSName("setOption")
  def setOption_cursorStyle(key: cursorStyle): Unit = js.native
  /**
    * Sets an option on the terminal.
    * @param key The option key.
    * @param value The option value.
    */
  @JSName("setOption")
  def setOption_fontFamily(key: fontFamily, value: String): Unit = js.native
  /**
    * Sets an option on the terminal.
    * @param key The option key.
    * @param value The option value.
    */
  @JSName("setOption")
  def setOption_fontSize(key: fontSize, value: Double): Unit = js.native
  /**
    * Sets an option on the terminal.
    * @param key The option key.
    * @param value The option value.
    */
  @JSName("setOption")
  def setOption_fontWeight(key: fontWeight): Unit = js.native
  @JSName("setOption")
  def setOption_fontWeightBold(key: fontWeightBold): Unit = js.native
  /**
    * Sets an option on the terminal.
    * @param key The option key.
    * @param value The option value.
    */
  @JSName("setOption")
  def setOption_handler(key: handler, value: js.Function1[/* data */ String, Unit]): Unit = js.native
  @JSName("setOption")
  def setOption_letterSpacing(key: letterSpacing, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_lineHeight(key: lineHeight, value: Double): Unit = js.native
  /**
    * Sets an option on the terminal.
    * @param key The option key.
    * @param value The option value.
    */
  @JSName("setOption")
  def setOption_logLevel(key: logLevel, value: LogLevel): Unit = js.native
  @JSName("setOption")
  def setOption_rows(key: typings.xterm.xtermStrings.rows, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_scrollback(key: scrollback, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_tabStopWidth(key: tabStopWidth, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_termName(key: termName, value: String): Unit = js.native
  /**
    * Sets an option on the terminal.
    * @param key The option key.
    * @param value The option value.
    */
  @JSName("setOption")
  def setOption_theme(key: theme, value: ITheme): Unit = js.native
  @JSName("setOption")
  def setOption_wordSeparator(key: wordSeparator, value: String): Unit = js.native
  /**
    * Write data to the terminal.
    * @param data The data to write to the terminal. This can either be raw
    * bytes given as Uint8Array from the pty or a string. Raw bytes will always
    * be treated as UTF-8 encoded, string data as UTF-16.
    * @param callback Optional callback that fires when the data was processed
    * by the parser.
    */
  def write(data: String): Unit = js.native
  def write(data: String, callback: js.Function0[Unit]): Unit = js.native
  def write(data: Uint8Array): Unit = js.native
  def write(data: Uint8Array, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Write UTF8 data to the terminal.
    * @param data The data to write to the terminal.
    * @param callback Optional callback when data was processed.
    * @deprecated use `write` instead
    */
  def writeUtf8(data: Uint8Array): Unit = js.native
  def writeUtf8(data: Uint8Array, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Writes data to the terminal, followed by a break line character (\n).
    * @param data The data to write to the terminal. This can either be raw
    * bytes given as Uint8Array from the pty or a string. Raw bytes will always
    * be treated as UTF-8 encoded, string data as UTF-16.
    * @param callback Optional callback that fires when the data was processed
    * by the parser.
    */
  def writeln(data: String): Unit = js.native
  def writeln(data: String, callback: js.Function0[Unit]): Unit = js.native
  def writeln(data: Uint8Array): Unit = js.native
  def writeln(data: Uint8Array, callback: js.Function0[Unit]): Unit = js.native
}

/* static members */
@JSImport("xterm", "Terminal")
@js.native
object Terminal extends js.Object {
  /**
    * Natural language strings that can be localized.
    */
  var strings: ILocalizableStrings = js.native
}

