package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionTerminalOptions extends js.Object {
  /**
    * A human-readable string which will be used to represent the terminal in the UI.
    */
  var name: String = js.native
  /**
    * An implementation of [Pseudoterminal](#Pseudoterminal) that allows an extension to
    * control a terminal.
    */
  var pty: Pseudoterminal = js.native
}

object ExtensionTerminalOptions {
  @scala.inline
  def apply(name: String, pty: Pseudoterminal): ExtensionTerminalOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pty = pty.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionTerminalOptions]
  }
  @scala.inline
  implicit class ExtensionTerminalOptionsOps[Self <: ExtensionTerminalOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPty(value: Pseudoterminal): Self = this.set("pty", value.asInstanceOf[js.Any])
  }
  
}

