package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonMaxSuppressionV3Attrs extends StObject {
  
  var iouThreshold: Double
  
  var maxOutputSize: Double
  
  var scoreThreshold: Double
}
object NonMaxSuppressionV3Attrs {
  
  inline def apply(iouThreshold: Double, maxOutputSize: Double, scoreThreshold: Double): NonMaxSuppressionV3Attrs = {
    val __obj = js.Dynamic.literal(iouThreshold = iouThreshold.asInstanceOf[js.Any], maxOutputSize = maxOutputSize.asInstanceOf[js.Any], scoreThreshold = scoreThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonMaxSuppressionV3Attrs]
  }
  
  extension [Self <: NonMaxSuppressionV3Attrs](x: Self) {
    
    inline def setIouThreshold(value: Double): Self = StObject.set(x, "iouThreshold", value.asInstanceOf[js.Any])
    
    inline def setMaxOutputSize(value: Double): Self = StObject.set(x, "maxOutputSize", value.asInstanceOf[js.Any])
    
    inline def setScoreThreshold(value: Double): Self = StObject.set(x, "scoreThreshold", value.asInstanceOf[js.Any])
  }
}
