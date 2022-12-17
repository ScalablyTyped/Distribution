package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Derivatives extends StObject {
  
  var derivatives: js.UndefOr[Boolean] = js.undefined
  
  var drawBuffers: js.UndefOr[Boolean] = js.undefined
  
  var fragDepth: js.UndefOr[Boolean] = js.undefined
  
  var shaderTextureLOD: js.UndefOr[Boolean] = js.undefined
}
object Derivatives {
  
  inline def apply(): Derivatives = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Derivatives]
  }
  
  extension [Self <: Derivatives](x: Self) {
    
    inline def setDerivatives(value: Boolean): Self = StObject.set(x, "derivatives", value.asInstanceOf[js.Any])
    
    inline def setDerivativesUndefined: Self = StObject.set(x, "derivatives", js.undefined)
    
    inline def setDrawBuffers(value: Boolean): Self = StObject.set(x, "drawBuffers", value.asInstanceOf[js.Any])
    
    inline def setDrawBuffersUndefined: Self = StObject.set(x, "drawBuffers", js.undefined)
    
    inline def setFragDepth(value: Boolean): Self = StObject.set(x, "fragDepth", value.asInstanceOf[js.Any])
    
    inline def setFragDepthUndefined: Self = StObject.set(x, "fragDepth", js.undefined)
    
    inline def setShaderTextureLOD(value: Boolean): Self = StObject.set(x, "shaderTextureLOD", value.asInstanceOf[js.Any])
    
    inline def setShaderTextureLODUndefined: Self = StObject.set(x, "shaderTextureLOD", js.undefined)
  }
}
