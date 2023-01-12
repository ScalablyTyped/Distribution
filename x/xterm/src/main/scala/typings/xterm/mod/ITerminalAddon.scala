package typings.xterm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITerminalAddon
  extends StObject
     with IDisposable {
  
  /**
    * This is called when the addon is activated.
    */
  def activate(terminal: Terminal): Unit
}
object ITerminalAddon {
  
  inline def apply(activate: Terminal => Unit, dispose: () => Unit): ITerminalAddon = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1(activate), dispose = js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[ITerminalAddon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITerminalAddon] (val x: Self) extends AnyVal {
    
    inline def setActivate(value: Terminal => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction1(value))
  }
}
