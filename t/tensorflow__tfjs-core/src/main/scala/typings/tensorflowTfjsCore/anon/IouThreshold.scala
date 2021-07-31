package typings.tensorflowTfjsCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IouThreshold extends StObject {
  
  var iouThreshold: Double
  
  var maxOutputSize: Double
  
  var scoreThreshold: Double
  
  var softNmsSigma: Double
}
object IouThreshold {
  
  @scala.inline
  def apply(iouThreshold: Double, maxOutputSize: Double, scoreThreshold: Double, softNmsSigma: Double): IouThreshold = {
    val __obj = js.Dynamic.literal(iouThreshold = iouThreshold.asInstanceOf[js.Any], maxOutputSize = maxOutputSize.asInstanceOf[js.Any], scoreThreshold = scoreThreshold.asInstanceOf[js.Any], softNmsSigma = softNmsSigma.asInstanceOf[js.Any])
    __obj.asInstanceOf[IouThreshold]
  }
  
  @scala.inline
  implicit class IouThresholdMutableBuilder[Self <: IouThreshold] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIouThreshold(value: Double): Self = StObject.set(x, "iouThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxOutputSize(value: Double): Self = StObject.set(x, "maxOutputSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreThreshold(value: Double): Self = StObject.set(x, "scoreThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftNmsSigma(value: Double): Self = StObject.set(x, "softNmsSigma", value.asInstanceOf[js.Any])
  }
}
