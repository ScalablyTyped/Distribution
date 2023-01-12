package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Diffuse extends StObject {
  
  var diffuse: IUniform[Any]
  
  var map: IUniform[Any]
  
  var opacity: IUniform[Any]
  
  var scale: IUniform[Any]
  
  var size: IUniform[Any]
  
  var uvTransform: IUniform[Any]
}
object Diffuse {
  
  inline def apply(
    diffuse: IUniform[Any],
    map: IUniform[Any],
    opacity: IUniform[Any],
    scale: IUniform[Any],
    size: IUniform[Any],
    uvTransform: IUniform[Any]
  ): Diffuse = {
    val __obj = js.Dynamic.literal(diffuse = diffuse.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uvTransform = uvTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diffuse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Diffuse] (val x: Self) extends AnyVal {
    
    inline def setDiffuse(value: IUniform[Any]): Self = StObject.set(x, "diffuse", value.asInstanceOf[js.Any])
    
    inline def setMap(value: IUniform[Any]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: IUniform[Any]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setScale(value: IUniform[Any]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setSize(value: IUniform[Any]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setUvTransform(value: IUniform[Any]): Self = StObject.set(x, "uvTransform", value.asInstanceOf[js.Any])
  }
}
