package typings.terminalKit.anon

import typings.terminalKit.screenBufferHDMod.IsBlending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Blending extends StObject {
  
  var blending: IsBlending
}
object Blending {
  
  inline def apply(blending: IsBlending): Blending = {
    val __obj = js.Dynamic.literal(blending = blending.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blending]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Blending] (val x: Self) extends AnyVal {
    
    inline def setBlending(value: IsBlending): Self = StObject.set(x, "blending", value.asInstanceOf[js.Any])
  }
}
