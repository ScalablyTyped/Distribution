package typings.vscode.mod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Terminal extends js.Object {
  /**
  		 * The object used to initialize the terminal, this is useful for example to detecting the
  		 * shell type of when the terminal was not launched by this extension or for detecting what
  		 * folder the shell was launched in.
  		 */
  val creationOptions: TerminalOptions | ExtensionTerminalOptions = js.native
  /**
  		 * The name of the terminal.
  		 */
  val name: String = js.native
  /**
  		 * The process ID of the shell process.
  		 */
  val processId: Thenable[js.UndefOr[Double]] = js.native
  /**
  		 * Dispose and free associated resources.
  		 */
  def dispose(): Unit = js.native
  /**
  		 * Hide the terminal panel if this terminal is currently showing.
  		 */
  def hide(): Unit = js.native
  /**
  		 * Send text to the terminal. The text is written to the stdin of the underlying pty process
  		 * (shell) of the terminal.
  		 *
  		 * @param text The text to send.
  		 * @param addNewLine Whether to add a new line to the text being sent, this is normally
  		 * required to run a command in the terminal. The character(s) added are \n or \r\n
  		 * depending on the platform. This defaults to `true`.
  		 */
  def sendText(text: String): Unit = js.native
  def sendText(text: String, addNewLine: Boolean): Unit = js.native
  /**
  		 * Show the terminal panel and reveal this terminal in the UI.
  		 *
  		 * @param preserveFocus When `true` the terminal will not take focus.
  		 */
  def show(): Unit = js.native
  def show(preserveFocus: Boolean): Unit = js.native
}

