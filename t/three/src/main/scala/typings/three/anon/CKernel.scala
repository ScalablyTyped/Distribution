package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CKernel extends StObject {
  
  var cKernel: IUniform[Any]
  
  var tDiffuse: IUniform[Any]
  
  var uImageIncrement: IUniform[Any]
}
object CKernel {
  
  inline def apply(cKernel: IUniform[Any], tDiffuse: IUniform[Any], uImageIncrement: IUniform[Any]): CKernel = {
    val __obj = js.Dynamic.literal(cKernel = cKernel.asInstanceOf[js.Any], tDiffuse = tDiffuse.asInstanceOf[js.Any], uImageIncrement = uImageIncrement.asInstanceOf[js.Any])
    __obj.asInstanceOf[CKernel]
  }
  
  extension [Self <: CKernel](x: Self) {
    
    inline def setCKernel(value: IUniform[Any]): Self = StObject.set(x, "cKernel", value.asInstanceOf[js.Any])
    
    inline def setTDiffuse(value: IUniform[Any]): Self = StObject.set(x, "tDiffuse", value.asInstanceOf[js.Any])
    
    inline def setUImageIncrement(value: IUniform[Any]): Self = StObject.set(x, "uImageIncrement", value.asInstanceOf[js.Any])
  }
}
