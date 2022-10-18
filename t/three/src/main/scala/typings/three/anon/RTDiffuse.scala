package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTDiffuse extends StObject {
  
  var r: IUniform[Any]
  
  var tDiffuse: IUniform[Any]
  
  var v: IUniform[Any]
}
object RTDiffuse {
  
  inline def apply(r: IUniform[Any], tDiffuse: IUniform[Any], v: IUniform[Any]): RTDiffuse = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], tDiffuse = tDiffuse.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTDiffuse]
  }
  
  extension [Self <: RTDiffuse](x: Self) {
    
    inline def setR(value: IUniform[Any]): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setTDiffuse(value: IUniform[Any]): Self = StObject.set(x, "tDiffuse", value.asInstanceOf[js.Any])
    
    inline def setV(value: IUniform[Any]): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}
