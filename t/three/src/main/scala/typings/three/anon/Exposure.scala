package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import typings.three.srcThreeMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exposure extends StObject {
  
  var exposure: IUniform[Double]
  
  var tDiffuse: IUniform[Texture]
}
object Exposure {
  
  inline def apply(exposure: IUniform[Double], tDiffuse: IUniform[Texture]): Exposure = {
    val __obj = js.Dynamic.literal(exposure = exposure.asInstanceOf[js.Any], tDiffuse = tDiffuse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exposure]
  }
  
  extension [Self <: Exposure](x: Self) {
    
    inline def setExposure(value: IUniform[Double]): Self = StObject.set(x, "exposure", value.asInstanceOf[js.Any])
    
    inline def setTDiffuse(value: IUniform[Texture]): Self = StObject.set(x, "tDiffuse", value.asInstanceOf[js.Any])
  }
}
