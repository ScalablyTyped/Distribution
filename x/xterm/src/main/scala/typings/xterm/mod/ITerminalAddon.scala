package typings.xterm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITerminalAddon extends IDisposable {
  /**
    * This is called when the addon is activated.
    */
  def activate(terminal: Terminal): Unit
}

object ITerminalAddon {
  @scala.inline
  def apply(activate: Terminal => Unit, dispose: () => Unit): ITerminalAddon = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1(activate), dispose = js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[ITerminalAddon]
  }
}

