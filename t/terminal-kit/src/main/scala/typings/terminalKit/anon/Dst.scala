package typings.terminalKit.anon

import typings.terminalKit.screenBufferMod.ScreenBuffer
import typings.terminalKit.terminalMod.Terminal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dst extends StObject {
  
  var dst: Terminal | ScreenBuffer
}
object Dst {
  
  inline def apply(dst: Terminal | ScreenBuffer): Dst = {
    val __obj = js.Dynamic.literal(dst = dst.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dst]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dst] (val x: Self) extends AnyVal {
    
    inline def setDst(value: Terminal | ScreenBuffer): Self = StObject.set(x, "dst", value.asInstanceOf[js.Any])
  }
}
