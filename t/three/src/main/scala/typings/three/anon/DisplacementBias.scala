package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplacementBias extends StObject {
  
  var displacementBias: IUniform[Any]
  
  var displacementMap: IUniform[Any]
  
  var displacementScale: IUniform[Any]
}
object DisplacementBias {
  
  inline def apply(displacementBias: IUniform[Any], displacementMap: IUniform[Any], displacementScale: IUniform[Any]): DisplacementBias = {
    val __obj = js.Dynamic.literal(displacementBias = displacementBias.asInstanceOf[js.Any], displacementMap = displacementMap.asInstanceOf[js.Any], displacementScale = displacementScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplacementBias]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisplacementBias] (val x: Self) extends AnyVal {
    
    inline def setDisplacementBias(value: IUniform[Any]): Self = StObject.set(x, "displacementBias", value.asInstanceOf[js.Any])
    
    inline def setDisplacementMap(value: IUniform[Any]): Self = StObject.set(x, "displacementMap", value.asInstanceOf[js.Any])
    
    inline def setDisplacementScale(value: IUniform[Any]): Self = StObject.set(x, "displacementScale", value.asInstanceOf[js.Any])
  }
}
