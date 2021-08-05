package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonMaxSuppressionV4Attrs extends StObject {
  
  var iouThreshold: Double
  
  var maxOutputSize: Double
  
  var padToMaxOutputSize: Boolean
  
  var scoreThreshold: Double
}
object NonMaxSuppressionV4Attrs {
  
  inline def apply(iouThreshold: Double, maxOutputSize: Double, padToMaxOutputSize: Boolean, scoreThreshold: Double): NonMaxSuppressionV4Attrs = {
    val __obj = js.Dynamic.literal(iouThreshold = iouThreshold.asInstanceOf[js.Any], maxOutputSize = maxOutputSize.asInstanceOf[js.Any], padToMaxOutputSize = padToMaxOutputSize.asInstanceOf[js.Any], scoreThreshold = scoreThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonMaxSuppressionV4Attrs]
  }
  
  extension [Self <: NonMaxSuppressionV4Attrs](x: Self) {
    
    inline def setIouThreshold(value: Double): Self = StObject.set(x, "iouThreshold", value.asInstanceOf[js.Any])
    
    inline def setMaxOutputSize(value: Double): Self = StObject.set(x, "maxOutputSize", value.asInstanceOf[js.Any])
    
    inline def setPadToMaxOutputSize(value: Boolean): Self = StObject.set(x, "padToMaxOutputSize", value.asInstanceOf[js.Any])
    
    inline def setScoreThreshold(value: Double): Self = StObject.set(x, "scoreThreshold", value.asInstanceOf[js.Any])
  }
}
