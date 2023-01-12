package typings.webglExt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OESTextureFloatLinear extends StObject {
  
  val __OES_texture_float_linear: Unit
}
object OESTextureFloatLinear {
  
  inline def apply(__OES_texture_float_linear: Unit): OESTextureFloatLinear = {
    val __obj = js.Dynamic.literal(__OES_texture_float_linear = __OES_texture_float_linear.asInstanceOf[js.Any])
    __obj.asInstanceOf[OESTextureFloatLinear]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OESTextureFloatLinear] (val x: Self) extends AnyVal {
    
    inline def set__OES_texture_float_linear(value: Unit): Self = StObject.set(x, "__OES_texture_float_linear", value.asInstanceOf[js.Any])
  }
}
