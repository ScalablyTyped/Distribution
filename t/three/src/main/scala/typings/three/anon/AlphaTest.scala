package typings.three.anon

import typings.three.srcMathMatrix3Mod.Matrix3
import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlphaTest extends StObject {
  
  var alphaMap: IUniform[Any]
  
  var alphaTest: IUniform[Double]
  
  var diffuse: IUniform[typings.three.srcMathColorMod.Color]
  
  var map: IUniform[Any]
  
  var opacity: IUniform[Double]
  
  var scale: IUniform[Double]
  
  var size: IUniform[Double]
  
  var uvTransform: IUniform[Matrix3]
}
object AlphaTest {
  
  inline def apply(
    alphaMap: IUniform[Any],
    alphaTest: IUniform[Double],
    diffuse: IUniform[typings.three.srcMathColorMod.Color],
    map: IUniform[Any],
    opacity: IUniform[Double],
    scale: IUniform[Double],
    size: IUniform[Double],
    uvTransform: IUniform[Matrix3]
  ): AlphaTest = {
    val __obj = js.Dynamic.literal(alphaMap = alphaMap.asInstanceOf[js.Any], alphaTest = alphaTest.asInstanceOf[js.Any], diffuse = diffuse.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uvTransform = uvTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlphaTest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlphaTest] (val x: Self) extends AnyVal {
    
    inline def setAlphaMap(value: IUniform[Any]): Self = StObject.set(x, "alphaMap", value.asInstanceOf[js.Any])
    
    inline def setAlphaTest(value: IUniform[Double]): Self = StObject.set(x, "alphaTest", value.asInstanceOf[js.Any])
    
    inline def setDiffuse(value: IUniform[typings.three.srcMathColorMod.Color]): Self = StObject.set(x, "diffuse", value.asInstanceOf[js.Any])
    
    inline def setMap(value: IUniform[Any]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: IUniform[Double]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setScale(value: IUniform[Double]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setSize(value: IUniform[Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setUvTransform(value: IUniform[Matrix3]): Self = StObject.set(x, "uvTransform", value.asInstanceOf[js.Any])
  }
}
