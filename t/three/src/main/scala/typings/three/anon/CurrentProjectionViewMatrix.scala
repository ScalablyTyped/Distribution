package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentProjectionViewMatrix extends StObject {
  
  var currentProjectionViewMatrix: IUniform[Any]
  
  var modelMatrixPrev: IUniform[Any]
  
  var previousProjectionViewMatrix: IUniform[Any]
}
object CurrentProjectionViewMatrix {
  
  inline def apply(
    currentProjectionViewMatrix: IUniform[Any],
    modelMatrixPrev: IUniform[Any],
    previousProjectionViewMatrix: IUniform[Any]
  ): CurrentProjectionViewMatrix = {
    val __obj = js.Dynamic.literal(currentProjectionViewMatrix = currentProjectionViewMatrix.asInstanceOf[js.Any], modelMatrixPrev = modelMatrixPrev.asInstanceOf[js.Any], previousProjectionViewMatrix = previousProjectionViewMatrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentProjectionViewMatrix]
  }
  
  extension [Self <: CurrentProjectionViewMatrix](x: Self) {
    
    inline def setCurrentProjectionViewMatrix(value: IUniform[Any]): Self = StObject.set(x, "currentProjectionViewMatrix", value.asInstanceOf[js.Any])
    
    inline def setModelMatrixPrev(value: IUniform[Any]): Self = StObject.set(x, "modelMatrixPrev", value.asInstanceOf[js.Any])
    
    inline def setPreviousProjectionViewMatrix(value: IUniform[Any]): Self = StObject.set(x, "previousProjectionViewMatrix", value.asInstanceOf[js.Any])
  }
}
