package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Diffuse extends StObject {
  
  var diffuse: IUniform
  
  var map: IUniform
  
  var opacity: IUniform
  
  var scale: IUniform
  
  var size: IUniform
  
  var uvTransform: IUniform
}
object Diffuse {
  
  inline def apply(
    diffuse: IUniform,
    map: IUniform,
    opacity: IUniform,
    scale: IUniform,
    size: IUniform,
    uvTransform: IUniform
  ): Diffuse = {
    val __obj = js.Dynamic.literal(diffuse = diffuse.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uvTransform = uvTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diffuse]
  }
  
  extension [Self <: Diffuse](x: Self) {
    
    inline def setDiffuse(value: IUniform): Self = StObject.set(x, "diffuse", value.asInstanceOf[js.Any])
    
    inline def setMap(value: IUniform): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: IUniform): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setScale(value: IUniform): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setSize(value: IUniform): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setUvTransform(value: IUniform): Self = StObject.set(x, "uvTransform", value.asInstanceOf[js.Any])
  }
}
