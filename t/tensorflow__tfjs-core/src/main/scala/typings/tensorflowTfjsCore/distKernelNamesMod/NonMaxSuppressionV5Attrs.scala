package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonMaxSuppressionV5Attrs extends StObject {
  
  var iouThreshold: Double
  
  var maxOutputSize: Double
  
  var scoreThreshold: Double
  
  var softNmsSigma: Double
}
object NonMaxSuppressionV5Attrs {
  
  inline def apply(iouThreshold: Double, maxOutputSize: Double, scoreThreshold: Double, softNmsSigma: Double): NonMaxSuppressionV5Attrs = {
    val __obj = js.Dynamic.literal(iouThreshold = iouThreshold.asInstanceOf[js.Any], maxOutputSize = maxOutputSize.asInstanceOf[js.Any], scoreThreshold = scoreThreshold.asInstanceOf[js.Any], softNmsSigma = softNmsSigma.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonMaxSuppressionV5Attrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NonMaxSuppressionV5Attrs] (val x: Self) extends AnyVal {
    
    inline def setIouThreshold(value: Double): Self = StObject.set(x, "iouThreshold", value.asInstanceOf[js.Any])
    
    inline def setMaxOutputSize(value: Double): Self = StObject.set(x, "maxOutputSize", value.asInstanceOf[js.Any])
    
    inline def setScoreThreshold(value: Double): Self = StObject.set(x, "scoreThreshold", value.asInstanceOf[js.Any])
    
    inline def setSoftNmsSigma(value: Double): Self = StObject.set(x, "softNmsSigma", value.asInstanceOf[js.Any])
  }
}
