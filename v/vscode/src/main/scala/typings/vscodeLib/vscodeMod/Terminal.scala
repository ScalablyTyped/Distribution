package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Terminal extends js.Object {
  /**
  		 * The name of the terminal.
  		 */
  val name: java.lang.String = js.native
  /**
  		 * The process ID of the shell process.
  		 */
  val processId: vscodeLib.Thenable[scala.Double] = js.native
  /**
  		 * Dispose and free associated resources.
  		 */
  def dispose(): scala.Unit = js.native
  /**
  		 * Hide the terminal panel if this terminal is currently showing.
  		 */
  def hide(): scala.Unit = js.native
  /**
  		 * Send text to the terminal. The text is written to the stdin of the underlying pty process
  		 * (shell) of the terminal.
  		 *
  		 * @param text The text to send.
  		 * @param addNewLine Whether to add a new line to the text being sent, this is normally
  		 * required to run a command in the terminal. The character(s) added are \n or \r\n
  		 * depending on the platform. This defaults to `true`.
  		 */
  def sendText(text: java.lang.String): scala.Unit = js.native
  def sendText(text: java.lang.String, addNewLine: scala.Boolean): scala.Unit = js.native
  /**
  		 * Show the terminal panel and reveal this terminal in the UI.
  		 *
  		 * @param preserveFocus When `true` the terminal will not take focus.
  		 */
  def show(): scala.Unit = js.native
  def show(preserveFocus: scala.Boolean): scala.Unit = js.native
}

