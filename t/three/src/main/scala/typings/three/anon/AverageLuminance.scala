package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AverageLuminance extends StObject {
  
  var averageLuminance: IUniform[Any]
  
  var luminanceMap: IUniform[Any]
  
  var maxLuminance: IUniform[Any]
  
  var middleGrey: IUniform[Any]
  
  var minLuminance: IUniform[Any]
  
  var tDiffuse: IUniform[Any]
}
object AverageLuminance {
  
  inline def apply(
    averageLuminance: IUniform[Any],
    luminanceMap: IUniform[Any],
    maxLuminance: IUniform[Any],
    middleGrey: IUniform[Any],
    minLuminance: IUniform[Any],
    tDiffuse: IUniform[Any]
  ): AverageLuminance = {
    val __obj = js.Dynamic.literal(averageLuminance = averageLuminance.asInstanceOf[js.Any], luminanceMap = luminanceMap.asInstanceOf[js.Any], maxLuminance = maxLuminance.asInstanceOf[js.Any], middleGrey = middleGrey.asInstanceOf[js.Any], minLuminance = minLuminance.asInstanceOf[js.Any], tDiffuse = tDiffuse.asInstanceOf[js.Any])
    __obj.asInstanceOf[AverageLuminance]
  }
  
  extension [Self <: AverageLuminance](x: Self) {
    
    inline def setAverageLuminance(value: IUniform[Any]): Self = StObject.set(x, "averageLuminance", value.asInstanceOf[js.Any])
    
    inline def setLuminanceMap(value: IUniform[Any]): Self = StObject.set(x, "luminanceMap", value.asInstanceOf[js.Any])
    
    inline def setMaxLuminance(value: IUniform[Any]): Self = StObject.set(x, "maxLuminance", value.asInstanceOf[js.Any])
    
    inline def setMiddleGrey(value: IUniform[Any]): Self = StObject.set(x, "middleGrey", value.asInstanceOf[js.Any])
    
    inline def setMinLuminance(value: IUniform[Any]): Self = StObject.set(x, "minLuminance", value.asInstanceOf[js.Any])
    
    inline def setTDiffuse(value: IUniform[Any]): Self = StObject.set(x, "tDiffuse", value.asInstanceOf[js.Any])
  }
}
