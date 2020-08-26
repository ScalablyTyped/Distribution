package typings.xterm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITerminalAddon extends IDisposable {
  /**
    * This is called when the addon is activated.
    */
  def activate(terminal: Terminal): Unit = js.native
}

object ITerminalAddon {
  @scala.inline
  def apply(activate: Terminal => Unit, dispose: () => Unit): ITerminalAddon = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1(activate), dispose = js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[ITerminalAddon]
  }
  @scala.inline
  implicit class ITerminalAddonOps[Self <: ITerminalAddon] (val x: Self) extends AnyVal {
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
    def setActivate(value: Terminal => Unit): Self = this.set("activate", js.Any.fromFunction1(value))
  }
  
}

