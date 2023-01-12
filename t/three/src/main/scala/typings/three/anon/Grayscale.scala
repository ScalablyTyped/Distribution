package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Grayscale extends StObject {
  
  var grayscale: IUniform[Any]
  
  var nIntensity: IUniform[Any]
  
  var sCount: IUniform[Any]
  
  var sIntensity: IUniform[Any]
  
  var tDiffuse: IUniform[Any]
  
  var time: IUniform[Any]
}
object Grayscale {
  
  inline def apply(
    grayscale: IUniform[Any],
    nIntensity: IUniform[Any],
    sCount: IUniform[Any],
    sIntensity: IUniform[Any],
    tDiffuse: IUniform[Any],
    time: IUniform[Any]
  ): Grayscale = {
    val __obj = js.Dynamic.literal(grayscale = grayscale.asInstanceOf[js.Any], nIntensity = nIntensity.asInstanceOf[js.Any], sCount = sCount.asInstanceOf[js.Any], sIntensity = sIntensity.asInstanceOf[js.Any], tDiffuse = tDiffuse.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grayscale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Grayscale] (val x: Self) extends AnyVal {
    
    inline def setGrayscale(value: IUniform[Any]): Self = StObject.set(x, "grayscale", value.asInstanceOf[js.Any])
    
    inline def setNIntensity(value: IUniform[Any]): Self = StObject.set(x, "nIntensity", value.asInstanceOf[js.Any])
    
    inline def setSCount(value: IUniform[Any]): Self = StObject.set(x, "sCount", value.asInstanceOf[js.Any])
    
    inline def setSIntensity(value: IUniform[Any]): Self = StObject.set(x, "sIntensity", value.asInstanceOf[js.Any])
    
    inline def setTDiffuse(value: IUniform[Any]): Self = StObject.set(x, "tDiffuse", value.asInstanceOf[js.Any])
    
    inline def setTime(value: IUniform[Any]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
