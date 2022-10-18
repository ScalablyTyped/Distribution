package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FGodRayIntensity extends StObject {
  
  var fGodRayIntensity: IUniform[Any]
  
  var tColors: IUniform[Any]
  
  var tGodRays: IUniform[Any]
}
object FGodRayIntensity {
  
  inline def apply(fGodRayIntensity: IUniform[Any], tColors: IUniform[Any], tGodRays: IUniform[Any]): FGodRayIntensity = {
    val __obj = js.Dynamic.literal(fGodRayIntensity = fGodRayIntensity.asInstanceOf[js.Any], tColors = tColors.asInstanceOf[js.Any], tGodRays = tGodRays.asInstanceOf[js.Any])
    __obj.asInstanceOf[FGodRayIntensity]
  }
  
  extension [Self <: FGodRayIntensity](x: Self) {
    
    inline def setFGodRayIntensity(value: IUniform[Any]): Self = StObject.set(x, "fGodRayIntensity", value.asInstanceOf[js.Any])
    
    inline def setTColors(value: IUniform[Any]): Self = StObject.set(x, "tColors", value.asInstanceOf[js.Any])
    
    inline def setTGodRays(value: IUniform[Any]): Self = StObject.set(x, "tGodRays", value.asInstanceOf[js.Any])
  }
}
