package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlphaMap extends StObject {
  
  var alphaMap: IUniform[Any]
  
  var diffuse: IUniform[Any]
  
  var map: IUniform[Any]
  
  var opacity: IUniform[Any]
  
  var uv2Transform: IUniform[Any]
  
  var uvTransform: IUniform[Any]
}
object AlphaMap {
  
  inline def apply(
    alphaMap: IUniform[Any],
    diffuse: IUniform[Any],
    map: IUniform[Any],
    opacity: IUniform[Any],
    uv2Transform: IUniform[Any],
    uvTransform: IUniform[Any]
  ): AlphaMap = {
    val __obj = js.Dynamic.literal(alphaMap = alphaMap.asInstanceOf[js.Any], diffuse = diffuse.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], uv2Transform = uv2Transform.asInstanceOf[js.Any], uvTransform = uvTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlphaMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlphaMap] (val x: Self) extends AnyVal {
    
    inline def setAlphaMap(value: IUniform[Any]): Self = StObject.set(x, "alphaMap", value.asInstanceOf[js.Any])
    
    inline def setDiffuse(value: IUniform[Any]): Self = StObject.set(x, "diffuse", value.asInstanceOf[js.Any])
    
    inline def setMap(value: IUniform[Any]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: IUniform[Any]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setUv2Transform(value: IUniform[Any]): Self = StObject.set(x, "uv2Transform", value.asInstanceOf[js.Any])
    
    inline def setUvTransform(value: IUniform[Any]): Self = StObject.set(x, "uvTransform", value.asInstanceOf[js.Any])
  }
}
