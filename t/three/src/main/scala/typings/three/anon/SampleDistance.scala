package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SampleDistance extends StObject {
  
  var sampleDistance: IUniform[Any]
  
  var screenHeight: IUniform[Any]
  
  var screenWidth: IUniform[Any]
  
  var tDiffuse: IUniform[Any]
  
  var waveFactor: IUniform[Any]
}
object SampleDistance {
  
  inline def apply(
    sampleDistance: IUniform[Any],
    screenHeight: IUniform[Any],
    screenWidth: IUniform[Any],
    tDiffuse: IUniform[Any],
    waveFactor: IUniform[Any]
  ): SampleDistance = {
    val __obj = js.Dynamic.literal(sampleDistance = sampleDistance.asInstanceOf[js.Any], screenHeight = screenHeight.asInstanceOf[js.Any], screenWidth = screenWidth.asInstanceOf[js.Any], tDiffuse = tDiffuse.asInstanceOf[js.Any], waveFactor = waveFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SampleDistance]
  }
  
  extension [Self <: SampleDistance](x: Self) {
    
    inline def setSampleDistance(value: IUniform[Any]): Self = StObject.set(x, "sampleDistance", value.asInstanceOf[js.Any])
    
    inline def setScreenHeight(value: IUniform[Any]): Self = StObject.set(x, "screenHeight", value.asInstanceOf[js.Any])
    
    inline def setScreenWidth(value: IUniform[Any]): Self = StObject.set(x, "screenWidth", value.asInstanceOf[js.Any])
    
    inline def setTDiffuse(value: IUniform[Any]): Self = StObject.set(x, "tDiffuse", value.asInstanceOf[js.Any])
    
    inline def setWaveFactor(value: IUniform[Any]): Self = StObject.set(x, "waveFactor", value.asInstanceOf[js.Any])
  }
}
