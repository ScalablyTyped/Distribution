package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonMaxSuppressionV3Attrs extends StObject {
  
  var iouThreshold: Double
  
  var maxOutputSize: Double
  
  var scoreThreshold: Double
}
object NonMaxSuppressionV3Attrs {
  
  @scala.inline
  def apply(iouThreshold: Double, maxOutputSize: Double, scoreThreshold: Double): NonMaxSuppressionV3Attrs = {
    val __obj = js.Dynamic.literal(iouThreshold = iouThreshold.asInstanceOf[js.Any], maxOutputSize = maxOutputSize.asInstanceOf[js.Any], scoreThreshold = scoreThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonMaxSuppressionV3Attrs]
  }
  
  @scala.inline
  implicit class NonMaxSuppressionV3AttrsMutableBuilder[Self <: NonMaxSuppressionV3Attrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIouThreshold(value: Double): Self = StObject.set(x, "iouThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxOutputSize(value: Double): Self = StObject.set(x, "maxOutputSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreThreshold(value: Double): Self = StObject.set(x, "scoreThreshold", value.asInstanceOf[js.Any])
  }
}
