package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TDudv extends StObject {
  
  var color: IUniform[Any]
  
  var tDiffuse: IUniform[Any]
  
  var tDudv: IUniform[Any]
  
  var textureMatrix: IUniform[Any]
  
  var time: IUniform[Any]
}
object TDudv {
  
  inline def apply(
    color: IUniform[Any],
    tDiffuse: IUniform[Any],
    tDudv: IUniform[Any],
    textureMatrix: IUniform[Any],
    time: IUniform[Any]
  ): TDudv = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], tDiffuse = tDiffuse.asInstanceOf[js.Any], tDudv = tDudv.asInstanceOf[js.Any], textureMatrix = textureMatrix.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[TDudv]
  }
  
  extension [Self <: TDudv](x: Self) {
    
    inline def setColor(value: IUniform[Any]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setTDiffuse(value: IUniform[Any]): Self = StObject.set(x, "tDiffuse", value.asInstanceOf[js.Any])
    
    inline def setTDudv(value: IUniform[Any]): Self = StObject.set(x, "tDudv", value.asInstanceOf[js.Any])
    
    inline def setTextureMatrix(value: IUniform[Any]): Self = StObject.set(x, "textureMatrix", value.asInstanceOf[js.Any])
    
    inline def setTime(value: IUniform[Any]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
