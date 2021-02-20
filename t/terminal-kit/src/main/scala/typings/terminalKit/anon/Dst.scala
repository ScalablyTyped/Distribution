package typings.terminalKit.anon

import typings.terminalKit.screenBufferMod.ScreenBuffer
import typings.terminalKit.terminalMod.Terminal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dst extends StObject {
  
  var dst: Terminal | ScreenBuffer = js.native
}
object Dst {
  
  @scala.inline
  def apply(dst: Terminal | ScreenBuffer): Dst = {
    val __obj = js.Dynamic.literal(dst = dst.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dst]
  }
  
  @scala.inline
  implicit class DstMutableBuilder[Self <: Dst] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDst(value: Terminal | ScreenBuffer): Self = StObject.set(x, "dst", value.asInstanceOf[js.Any])
  }
}
