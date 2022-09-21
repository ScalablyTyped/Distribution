package typings.xterm.mod

import typings.std.HTMLElement
import typings.std.HTMLTextAreaElement
import typings.std.KeyboardEvent
import typings.xterm.anon.Cols
import typings.xterm.anon.DomEvent
import typings.xterm.anon.End
import typings.xterm.anon.RequiredITerminalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xterm", "Terminal")
@js.native
/**
  * Creates a new `Terminal` object.
  *
  * @param options An object containing a set of options.
  */
open class Terminal ()
  extends StObject
     with IDisposable {
  def this(options: ITerminalOptions & ITerminalInitOnlyOptions) = this()
  
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
    * Access to the terminal's normal and alt buffer.
    */
  val buffer: IBufferNamespace = js.native
  
  /**
    * Clear the entire buffer, making the prompt line the new first line.
    */
  def clear(): Unit = js.native
  
  /**
    * Clears the current terminal selection.
    */
  def clearSelection(): Unit = js.native
  
  /**
    * Clears the texture atlas of the canvas renderer if it's active. Doing this will force a
    * redraw of all glyphs which can workaround issues causing the texture to become corrupt, for
    * example Chromium/Nvidia has an issue where the texture gets messed up when resuming the OS
    * from sleep.
    */
  def clearTextureAtlas(): Unit = js.native
  
  /**
    * The number of columns in the terminal's viewport. Use
    * `ITerminalOptions.cols` to set this in the constructor and
    * `Terminal.resize` for when the terminal exists.
    */
  val cols: Double = js.native
  
  /**
    * (EXPERIMENTAL) Deregisters the character joiner if one was registered.
    * NOTE: character joiners are only used by the canvas renderer.
    * @param joinerId The character joiner's ID (returned after register)
    */
  def deregisterCharacterJoiner(joinerId: Double): Unit = js.native
  
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /**
    * The element containing the terminal.
    */
  val element: js.UndefOr[HTMLElement] = js.native
  
  /**
    * Focus the terminal.
    */
  def focus(): Unit = js.native
  
  /**
    * Gets the terminal's current selection, this is useful for implementing
    * copy behavior outside of xterm.js.
    */
  def getSelection(): String = js.native
  
  /**
    * Gets the selection position or undefined if there is no selection.
    */
  def getSelectionPosition(): js.UndefOr[IBufferRange] = js.native
  
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
    * (EXPERIMENTAL) Get all markers registered against the buffer. If the alt
    * buffer is active this will always return [].
    */
  val markers: js.Array[IMarker] = js.native
  
  /**
    * Gets the terminal modes as set by SM/DECSET.
    */
  val modes: IModes = js.native
  
  /**
    * Adds an event listener for when the bell is triggered.
    * @returns an `IDisposable` to stop listening.
    */
  def onBell(listener: js.Function2[/* arg1 */ Unit, /* arg2 */ Unit, Any]): IDisposable = js.native
  /**
    * Adds an event listener for when the bell is triggered.
    * @returns an `IDisposable` to stop listening.
    */
  @JSName("onBell")
  var onBell_Original: IEvent[Unit, Unit] = js.native
  
  /**
    * Adds an event listener for when a binary event fires. This is used to
    * enable non UTF-8 conformant binary messages to be sent to the backend.
    * Currently this is only used for a certain type of mouse reports that
    * happen to be not UTF-8 compatible.
    * The event value is a JS string, pass it to the underlying pty as
    * binary data, e.g. `pty.write(Buffer.from(data, 'binary'))`.
    * @returns an `IDisposable` to stop listening.
    */
  def onBinary(listener: js.Function2[/* arg1 */ String, /* arg2 */ Unit, Any]): IDisposable = js.native
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
  var onBinary_Original: IEvent[String, Unit] = js.native
  
  /**
    * Adds an event listener for the cursor moves.
    * @returns an `IDisposable` to stop listening.
    */
  def onCursorMove(listener: js.Function2[/* arg1 */ Unit, /* arg2 */ Unit, Any]): IDisposable = js.native
  /**
    * Adds an event listener for the cursor moves.
    * @returns an `IDisposable` to stop listening.
    */
  @JSName("onCursorMove")
  var onCursorMove_Original: IEvent[Unit, Unit] = js.native
  
  /**
    * Adds an event listener for when a data event fires. This happens for
    * example when the user types or pastes into the terminal. The event value
    * is whatever `string` results, in a typical setup, this should be passed
    * on to the backing pty.
    * @returns an `IDisposable` to stop listening.
    */
  def onData(listener: js.Function2[/* arg1 */ String, /* arg2 */ Unit, Any]): IDisposable = js.native
  /**
    * Adds an event listener for when a data event fires. This happens for
    * example when the user types or pastes into the terminal. The event value
    * is whatever `string` results, in a typical setup, this should be passed
    * on to the backing pty.
    * @returns an `IDisposable` to stop listening.
    */
  @JSName("onData")
  var onData_Original: IEvent[String, Unit] = js.native
  
  /**
    * Adds an event listener for when a key is pressed. The event value contains the
    * string that will be sent in the data event as well as the DOM event that
    * triggered it.
    * @returns an `IDisposable` to stop listening.
    */
  def onKey(listener: js.Function2[/* arg1 */ DomEvent, /* arg2 */ Unit, Any]): IDisposable = js.native
  /**
    * Adds an event listener for when a key is pressed. The event value contains the
    * string that will be sent in the data event as well as the DOM event that
    * triggered it.
    * @returns an `IDisposable` to stop listening.
    */
  @JSName("onKey")
  var onKey_Original: IEvent[DomEvent, Unit] = js.native
  
  /**
    * Adds an event listener for when a line feed is added.
    * @returns an `IDisposable` to stop listening.
    */
  def onLineFeed(listener: js.Function2[/* arg1 */ Unit, /* arg2 */ Unit, Any]): IDisposable = js.native
  /**
    * Adds an event listener for when a line feed is added.
    * @returns an `IDisposable` to stop listening.
    */
  @JSName("onLineFeed")
  var onLineFeed_Original: IEvent[Unit, Unit] = js.native
  
  /**
    * Adds an event listener for when rows are rendered. The event value
    * contains the start row and end rows of the rendered area (ranges from `0`
    * to `Terminal.rows - 1`).
    * @returns an `IDisposable` to stop listening.
    */
  def onRender(listener: js.Function2[/* arg1 */ End, /* arg2 */ Unit, Any]): IDisposable = js.native
  /**
    * Adds an event listener for when rows are rendered. The event value
    * contains the start row and end rows of the rendered area (ranges from `0`
    * to `Terminal.rows - 1`).
    * @returns an `IDisposable` to stop listening.
    */
  @JSName("onRender")
  var onRender_Original: IEvent[End, Unit] = js.native
  
  /**
    * Adds an event listener for when the terminal is resized. The event value
    * contains the new size.
    * @returns an `IDisposable` to stop listening.
    */
  def onResize(listener: js.Function2[/* arg1 */ Cols, /* arg2 */ Unit, Any]): IDisposable = js.native
  /**
    * Adds an event listener for when the terminal is resized. The event value
    * contains the new size.
    * @returns an `IDisposable` to stop listening.
    */
  @JSName("onResize")
  var onResize_Original: IEvent[Cols, Unit] = js.native
  
  /**
    * Adds an event listener for when a scroll occurs. The event value is the
    * new position of the viewport.
    * @returns an `IDisposable` to stop listening.
    */
  def onScroll(listener: js.Function2[/* arg1 */ Double, /* arg2 */ Unit, Any]): IDisposable = js.native
  /**
    * Adds an event listener for when a scroll occurs. The event value is the
    * new position of the viewport.
    * @returns an `IDisposable` to stop listening.
    */
  @JSName("onScroll")
  var onScroll_Original: IEvent[Double, Unit] = js.native
  
  /**
    * Adds an event listener for when a selection change occurs.
    * @returns an `IDisposable` to stop listening.
    */
  def onSelectionChange(listener: js.Function2[/* arg1 */ Unit, /* arg2 */ Unit, Any]): IDisposable = js.native
  /**
    * Adds an event listener for when a selection change occurs.
    * @returns an `IDisposable` to stop listening.
    */
  @JSName("onSelectionChange")
  var onSelectionChange_Original: IEvent[Unit, Unit] = js.native
  
  /**
    * Adds an event listener for when an OSC 0 or OSC 2 title change occurs.
    * The event value is the new title.
    * @returns an `IDisposable` to stop listening.
    */
  def onTitleChange(listener: js.Function2[/* arg1 */ String, /* arg2 */ Unit, Any]): IDisposable = js.native
  /**
    * Adds an event listener for when an OSC 0 or OSC 2 title change occurs.
    * The event value is the new title.
    * @returns an `IDisposable` to stop listening.
    */
  @JSName("onTitleChange")
  var onTitleChange_Original: IEvent[String, Unit] = js.native
  
  /**
    * Adds an event listener for when data has been parsed by the terminal,
    * after {@link write} is called. This event is useful to listen for any
    * changes in the buffer.
    *
    * This fires at most once per frame, after data parsing completes. Note
    * that this can fire when there are still writes pending if there is a lot
    * of data.
    */
  def onWriteParsed(listener: js.Function2[/* arg1 */ Unit, /* arg2 */ Unit, Any]): IDisposable = js.native
  /**
    * Adds an event listener for when data has been parsed by the terminal,
    * after {@link write} is called. This event is useful to listen for any
    * changes in the buffer.
    *
    * This fires at most once per frame, after data parsing completes. Note
    * that this can fire when there are still writes pending if there is a lot
    * of data.
    */
  @JSName("onWriteParsed")
  var onWriteParsed_Original: IEvent[Unit, Unit] = js.native
  
  /**
    * Opens the terminal within an element.
    * @param parent The element to create the terminal within. This element
    * must be visible (have dimensions) when `open` is called as several DOM-
    * based measurements need to be performed when this function is called.
    */
  def open(parent: HTMLElement): Unit = js.native
  
  /**
    * Gets or sets the terminal options. This supports setting multiple options.
    *
    * @example Get a single option
    * ```typescript
    * console.log(terminal.options.fontSize);
    * ```
    */
  def options: RequiredITerminalOptions = js.native
  /**
    * Gets or sets the terminal options. This supports setting multiple options.
    *
    * @example Set a single option
    * ```typescript
    * terminal.options.fontSize = 12;
    * ```
    *
    * @example Set multiple options
    * ```typescript
    * terminal.options = {
    *   fontSize: 12,
    *   fontFamily: 'Arial',
    * };
    * ```
    */
  def options_=(options: ITerminalOptions): Unit = js.native
  
  /**
    * Get the parser interface to register custom escape sequence handlers.
    */
  val parser: IParser = js.native
  
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
    * (EXPERIMENTAL) Adds a decoration to the terminal using
    *  @param decorationOptions, which takes a marker and an optional anchor,
    *  width, height, and x offset from the anchor. Returns the decoration or
    *  undefined if the alt buffer is active or the marker has already been disposed of.
    *  @throws when options include a negative x offset.
    */
  def registerDecoration(decorationOptions: IDecorationOptions): js.UndefOr[IDecoration] = js.native
  
  /**
    * Registers a link provider, allowing a custom parser to be used to match
    * and handle links. Multiple link providers can be used, they will be asked
    * in the order in which they are registered.
    * @param linkProvider The link provider to use to detect links.
    */
  def registerLinkProvider(linkProvider: ILinkProvider): IDisposable = js.native
  
  /**
    * Adds a marker to the normal buffer and returns it. If the alt buffer is
    * active, undefined is returned.
    * @param cursorYOffset The y position offset of the marker from the cursor.
    * @returns The new marker or undefined.
    */
  def registerMarker(): js.UndefOr[IMarker] = js.native
  def registerMarker(cursorYOffset: Double): js.UndefOr[IMarker] = js.native
  
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
    * The number of rows in the terminal's viewport. Use
    * `ITerminalOptions.rows` to set this in the constructor and
    * `Terminal.resize` for when the terminal exists.
    */
  val rows: Double = js.native
  
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
    * The textarea that accepts input for the terminal.
    */
  val textarea: js.UndefOr[HTMLTextAreaElement] = js.native
  
  /**
    * (EXPERIMENTAL) Get the Unicode handling interface
    * to register and switch Unicode version.
    */
  val unicode: IUnicodeHandling = js.native
  
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
  def write(data: js.typedarray.Uint8Array): Unit = js.native
  def write(data: js.typedarray.Uint8Array, callback: js.Function0[Unit]): Unit = js.native
  
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
  def writeln(data: js.typedarray.Uint8Array): Unit = js.native
  def writeln(data: js.typedarray.Uint8Array, callback: js.Function0[Unit]): Unit = js.native
}
/* static members */
object Terminal {
  
  @JSImport("xterm", "Terminal")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Natural language strings that can be localized.
    */
  @JSImport("xterm", "Terminal.strings")
  @js.native
  def strings: ILocalizableStrings = js.native
  inline def strings_=(x: ILocalizableStrings): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("strings")(x.asInstanceOf[js.Any])
}
