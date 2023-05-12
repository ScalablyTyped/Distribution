package typings.three.anon

import typings.three.srcMathMatrix3Mod.Matrix3
import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplacementBias extends StObject {
  
  var displacementBias: IUniform[Double]
  
  var displacementMap: IUniform[Any]
  
  var displacementMapTransform: IUniform[Matrix3]
  
  var displacementScale: IUniform[Double]
}
object DisplacementBias {
  
  inline def apply(
    displacementBias: IUniform[Double],
    displacementMap: IUniform[Any],
    displacementMapTransform: IUniform[Matrix3],
    displacementScale: IUniform[Double]
  ): DisplacementBias = {
    val __obj = js.Dynamic.literal(displacementBias = displacementBias.asInstanceOf[js.Any], displacementMap = displacementMap.asInstanceOf[js.Any], displacementMapTransform = displacementMapTransform.asInstanceOf[js.Any], displacementScale = displacementScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplacementBias]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisplacementBias] (val x: Self) extends AnyVal {
    
    inline def setDisplacementBias(value: IUniform[Double]): Self = StObject.set(x, "displacementBias", value.asInstanceOf[js.Any])
    
    inline def setDisplacementMap(value: IUniform[Any]): Self = StObject.set(x, "displacementMap", value.asInstanceOf[js.Any])
    
    inline def setDisplacementMapTransform(value: IUniform[Matrix3]): Self = StObject.set(x, "displacementMapTransform", value.asInstanceOf[js.Any])
    
    inline def setDisplacementScale(value: IUniform[Double]): Self = StObject.set(x, "displacementScale", value.asInstanceOf[js.Any])
  }
}
