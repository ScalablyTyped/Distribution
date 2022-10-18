package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CameraNear extends StObject {
  
  var cameraFar: IUniform[Any]
  
  var cameraNear: IUniform[Any]
  
  var tDepth: IUniform[Any]
}
object CameraNear {
  
  inline def apply(cameraFar: IUniform[Any], cameraNear: IUniform[Any], tDepth: IUniform[Any]): CameraNear = {
    val __obj = js.Dynamic.literal(cameraFar = cameraFar.asInstanceOf[js.Any], cameraNear = cameraNear.asInstanceOf[js.Any], tDepth = tDepth.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraNear]
  }
  
  extension [Self <: CameraNear](x: Self) {
    
    inline def setCameraFar(value: IUniform[Any]): Self = StObject.set(x, "cameraFar", value.asInstanceOf[js.Any])
    
    inline def setCameraNear(value: IUniform[Any]): Self = StObject.set(x, "cameraNear", value.asInstanceOf[js.Any])
    
    inline def setTDepth(value: IUniform[Any]): Self = StObject.set(x, "tDepth", value.asInstanceOf[js.Any])
  }
}
