package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import typings.three.srcThreeMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TDepth extends StObject {
  
  var cameraFar: IUniform[Double]
  
  var cameraNear: IUniform[Double]
  
  var tDepth: IUniform[Texture | Null]
}
object TDepth {
  
  inline def apply(cameraFar: IUniform[Double], cameraNear: IUniform[Double], tDepth: IUniform[Texture | Null]): TDepth = {
    val __obj = js.Dynamic.literal(cameraFar = cameraFar.asInstanceOf[js.Any], cameraNear = cameraNear.asInstanceOf[js.Any], tDepth = tDepth.asInstanceOf[js.Any])
    __obj.asInstanceOf[TDepth]
  }
  
  extension [Self <: TDepth](x: Self) {
    
    inline def setCameraFar(value: IUniform[Double]): Self = StObject.set(x, "cameraFar", value.asInstanceOf[js.Any])
    
    inline def setCameraNear(value: IUniform[Double]): Self = StObject.set(x, "cameraNear", value.asInstanceOf[js.Any])
    
    inline def setTDepth(value: IUniform[Texture | Null]): Self = StObject.set(x, "tDepth", value.asInstanceOf[js.Any])
  }
}
