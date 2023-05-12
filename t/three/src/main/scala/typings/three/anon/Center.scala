package typings.three.anon

import typings.three.srcMathMatrix3Mod.Matrix3
import typings.three.srcMathVector2Mod.Vector2
import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Center extends StObject {
  
  var alphaMap: IUniform[Any]
  
  var alphaTest: IUniform[Double]
  
  var center: IUniform[Vector2]
  
  var diffuse: IUniform[typings.three.srcMathColorMod.Color]
  
  var map: IUniform[Any]
  
  var mapTransform: IUniform[Matrix3]
  
  var opacity: IUniform[Double]
  
  var rotation: IUniform[Double]
}
object Center {
  
  inline def apply(
    alphaMap: IUniform[Any],
    alphaTest: IUniform[Double],
    center: IUniform[Vector2],
    diffuse: IUniform[typings.three.srcMathColorMod.Color],
    map: IUniform[Any],
    mapTransform: IUniform[Matrix3],
    opacity: IUniform[Double],
    rotation: IUniform[Double]
  ): Center = {
    val __obj = js.Dynamic.literal(alphaMap = alphaMap.asInstanceOf[js.Any], alphaTest = alphaTest.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], diffuse = diffuse.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], mapTransform = mapTransform.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Center]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Center] (val x: Self) extends AnyVal {
    
    inline def setAlphaMap(value: IUniform[Any]): Self = StObject.set(x, "alphaMap", value.asInstanceOf[js.Any])
    
    inline def setAlphaTest(value: IUniform[Double]): Self = StObject.set(x, "alphaTest", value.asInstanceOf[js.Any])
    
    inline def setCenter(value: IUniform[Vector2]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setDiffuse(value: IUniform[typings.three.srcMathColorMod.Color]): Self = StObject.set(x, "diffuse", value.asInstanceOf[js.Any])
    
    inline def setMap(value: IUniform[Any]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapTransform(value: IUniform[Matrix3]): Self = StObject.set(x, "mapTransform", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: IUniform[Double]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: IUniform[Double]): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
  }
}
