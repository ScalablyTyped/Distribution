package typings.terminalKit.anon

import typings.terminalKit.terminalMod.Terminal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shrink extends StObject {
  
  var shrink: js.UndefOr[Height] = js.undefined
  
  def terminal(): Terminal
  def terminal(args: js.Any*): Terminal
  def terminal(str: String): Terminal
  @JSName("terminal")
  var terminal_Original: Terminal
}
object Shrink {
  
  @scala.inline
  def apply(terminal: Terminal): Shrink = {
    val __obj = js.Dynamic.literal(terminal = terminal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shrink]
  }
  
  @scala.inline
  implicit class ShrinkMutableBuilder[Self <: Shrink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShrink(value: Height): Self = StObject.set(x, "shrink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShrinkUndefined: Self = StObject.set(x, "shrink", js.undefined)
    
    @scala.inline
    def setTerminal(value: Terminal): Self = StObject.set(x, "terminal", value.asInstanceOf[js.Any])
  }
}
