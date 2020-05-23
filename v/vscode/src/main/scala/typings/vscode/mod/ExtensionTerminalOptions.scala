package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionTerminalOptions extends js.Object {
  /**
    * A human-readable string which will be used to represent the terminal in the UI.
    */
  var name: String
  /**
    * An implementation of [Pseudoterminal](#Pseudoterminal) that allows an extension to
    * control a terminal.
    */
  var pty: Pseudoterminal
}

object ExtensionTerminalOptions {
  @scala.inline
  def apply(name: String, pty: Pseudoterminal): ExtensionTerminalOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pty = pty.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionTerminalOptions]
  }
}

