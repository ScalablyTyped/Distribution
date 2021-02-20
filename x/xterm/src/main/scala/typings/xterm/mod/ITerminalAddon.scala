package typings.xterm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ITerminalAddonMutableBuilder[Self <: ITerminalAddon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivate(value: Terminal => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction1(value))
  }
}
