package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import typings.three.srcThreeMod.Texture
import typings.three.srcThreeMod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpacityResolution extends StObject {
  
  var opacity: IUniform[Double]
  
  var resolution: IUniform[Vector2]
  
  var tDiffuse: IUniform[Texture | Null]
}
object OpacityResolution {
  
  inline def apply(opacity: IUniform[Double], resolution: IUniform[Vector2], tDiffuse: IUniform[Texture | Null]): OpacityResolution = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], tDiffuse = tDiffuse.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpacityResolution]
  }
  
  extension [Self <: OpacityResolution](x: Self) {
    
    inline def setOpacity(value: IUniform[Double]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setResolution(value: IUniform[Vector2]): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setTDiffuse(value: IUniform[Texture | Null]): Self = StObject.set(x, "tDiffuse", value.asInstanceOf[js.Any])
  }
}
