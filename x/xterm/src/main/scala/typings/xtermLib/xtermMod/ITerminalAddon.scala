package typings
package xtermLib.xtermMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITerminalAddon extends IDisposable {
  /**
    * (EXPERIMENTAL) This is called when the addon is activated within xterm.js.
    */
  def activate(terminal: Terminal): scala.Unit
}

object ITerminalAddon {
  @scala.inline
  def apply(activate: Terminal => scala.Unit, dispose: () => scala.Unit): ITerminalAddon = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1(activate), dispose = js.Any.fromFunction0(dispose))
  
    __obj.asInstanceOf[ITerminalAddon]
  }
}

