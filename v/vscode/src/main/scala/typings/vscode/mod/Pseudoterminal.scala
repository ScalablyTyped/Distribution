package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the interface of a terminal pty, enabling extensions to control a terminal.
  */
@js.native
trait Pseudoterminal extends js.Object {
  /**
    * Implement to handle incoming keystrokes in the terminal or when an extension calls
    * [Terminal.sendText](#Terminal.sendText). `data` contains the keystrokes/text serialized into
    * their corresponding VT sequence representation.
    *
    * @param data The incoming data.
    *
    * **Example:** Echo input in the terminal. The sequence for enter (`\r`) is translated to
    * CRLF to go to a new line and move the cursor to the start of the line.
    * ```typescript
    * const writeEmitter = new vscode.EventEmitter<string>();
    * const pty: vscode.Pseudoterminal = {
    *   onDidWrite: writeEmitter.event,
    *   open: () => {},
    *   close: () => {},
    *   handleInput: data => writeEmitter.fire(data === '\r' ? '\r\n' : data)
    * };
    * vscode.window.createTerminal({ name: 'Local echo', pty });
    * ```
    */
  var handleInput: js.UndefOr[js.Function1[/* data */ String, Unit]] = js.native
  /**
    * An event that when fired will signal that the pty is closed and dispose of the terminal.
    *
    * A number can be used to provide an exit code for the terminal. Exit codes must be
    * positive and a non-zero exit codes signals failure which shows a notification for a
    * regular terminal and allows dependent tasks to proceed when used with the
    * `CustomExecution` API.
    *
    * **Example:** Exit the terminal when "y" is pressed, otherwise show a notification.
    * ```typescript
    * const writeEmitter = new vscode.EventEmitter<string>();
    * const closeEmitter = new vscode.EventEmitter<vscode.TerminalDimensions>();
    * const pty: vscode.Pseudoterminal = {
    *   onDidWrite: writeEmitter.event,
    *   onDidClose: closeEmitter.event,
    *   open: () => writeEmitter.fire('Press y to exit successfully'),
    *   close: () => {},
    *   handleInput: data => {
    *     if (data !== 'y') {
    *       vscode.window.showInformationMessage('Something went wrong');
    *     }
    *     closeEmitter.fire();
    *   }
    * };
    * vscode.window.createTerminal({ name: 'Exit example', pty });
    * ```
    */
  var onDidClose: js.UndefOr[Event[Unit | Double]] = js.native
  /**
    * An event that when fired allows overriding the [dimensions](#Pseudoterminal.setDimensions) of the
    * terminal. Note that when set, the overridden dimensions will only take effect when they
    * are lower than the actual dimensions of the terminal (ie. there will never be a scroll
    * bar). Set to `undefined` for the terminal to go back to the regular dimensions (fit to
    * the size of the panel).
    *
    * **Example:** Override the dimensions of a terminal to 20 columns and 10 rows
    * ```typescript
    * const dimensionsEmitter = new vscode.EventEmitter<vscode.TerminalDimensions>();
    * const pty: vscode.Pseudoterminal = {
    *   onDidWrite: writeEmitter.event,
    *   onDidOverrideDimensions: dimensionsEmitter.event,
    *   open: () => {
    *     dimensionsEmitter.fire({
    *       columns: 20,
    *       rows: 10
    *     });
    *   },
    *   close: () => {}
    * };
    * vscode.window.createTerminal({ name: 'My terminal', pty });
    * ```
    */
  var onDidOverrideDimensions: js.UndefOr[Event[js.UndefOr[TerminalDimensions]]] = js.native
  /**
    * An event that when fired will write data to the terminal. Unlike
    * [Terminal.sendText](#Terminal.sendText) which sends text to the underlying child
    * pseudo-device (the child), this will write the text to parent pseudo-device (the
    * _terminal_ itself).
    *
    * Note writing `\n` will just move the cursor down 1 row, you need to write `\r` as well
    * to move the cursor to the left-most cell.
    *
    * **Example:** Write red text to the terminal
    * ```typescript
    * const writeEmitter = new vscode.EventEmitter<string>();
    * const pty: vscode.Pseudoterminal = {
    *   onDidWrite: writeEmitter.event,
    *   open: () => writeEmitter.fire('\x1b[31mHello world\x1b[0m'),
    *   close: () => {}
    * };
    * vscode.window.createTerminal({ name: 'My terminal', pty });
    * ```
    *
    * **Example:** Move the cursor to the 10th row and 20th column and write an asterisk
    * ```typescript
    * writeEmitter.fire('\x1b[10;20H*');
    * ```
    */
  @JSName("onDidWrite")
  var onDidWrite_Original: Event[String] = js.native
  /**
    * Implement to handle when the number of rows and columns that fit into the terminal panel
    * changes, for example when font size changes or when the panel is resized. The initial
    * state of a terminal's dimensions should be treated as `undefined` until this is triggered
    * as the size of a terminal isn't know until it shows up in the user interface.
    *
    * When dimensions are overridden by
    * [onDidOverrideDimensions](#Pseudoterminal.onDidOverrideDimensions), `setDimensions` will
    * continue to be called with the regular panel dimensions, allowing the extension continue
    * to react dimension changes.
    *
    * @param dimensions The new dimensions.
    */
  var setDimensions: js.UndefOr[js.Function1[/* dimensions */ TerminalDimensions, Unit]] = js.native
  /**
    * Implement to handle when the terminal is closed by an act of the user.
    */
  def close(): Unit = js.native
  /**
    * An event that when fired will write data to the terminal. Unlike
    * [Terminal.sendText](#Terminal.sendText) which sends text to the underlying child
    * pseudo-device (the child), this will write the text to parent pseudo-device (the
    * _terminal_ itself).
    *
    * Note writing `\n` will just move the cursor down 1 row, you need to write `\r` as well
    * to move the cursor to the left-most cell.
    *
    * **Example:** Write red text to the terminal
    * ```typescript
    * const writeEmitter = new vscode.EventEmitter<string>();
    * const pty: vscode.Pseudoterminal = {
    *   onDidWrite: writeEmitter.event,
    *   open: () => writeEmitter.fire('\x1b[31mHello world\x1b[0m'),
    *   close: () => {}
    * };
    * vscode.window.createTerminal({ name: 'My terminal', pty });
    * ```
    *
    * **Example:** Move the cursor to the 10th row and 20th column and write an asterisk
    * ```typescript
    * writeEmitter.fire('\x1b[10;20H*');
    * ```
    */
  def onDidWrite(listener: js.Function1[/* e */ String, _]): Disposable = js.native
  def onDidWrite(
    listener: js.Function1[/* e */ String, _],
    thisArgs: js.UndefOr[scala.Nothing],
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onDidWrite(listener: js.Function1[/* e */ String, _], thisArgs: js.Any): Disposable = js.native
  def onDidWrite(listener: js.Function1[/* e */ String, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  /**
    * Implement to handle when the pty is open and ready to start firing events.
    *
    * @param initialDimensions The dimensions of the terminal, this will be undefined if the
    * terminal panel has not been opened before this is called.
    */
  def open(): Unit = js.native
  def open(initialDimensions: TerminalDimensions): Unit = js.native
}

