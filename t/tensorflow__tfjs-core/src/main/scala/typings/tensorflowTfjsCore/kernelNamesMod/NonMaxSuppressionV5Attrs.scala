package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NonMaxSuppressionV5Attrs extends StObject {
  
  var iouThreshold: Double = js.native
  
  var maxOutputSize: Double = js.native
  
  var scoreThreshold: Double = js.native
  
  var softNmsSigma: Double = js.native
}
object NonMaxSuppressionV5Attrs {
  
  @scala.inline
  def apply(iouThreshold: Double, maxOutputSize: Double, scoreThreshold: Double, softNmsSigma: Double): NonMaxSuppressionV5Attrs = {
    val __obj = js.Dynamic.literal(iouThreshold = iouThreshold.asInstanceOf[js.Any], maxOutputSize = maxOutputSize.asInstanceOf[js.Any], scoreThreshold = scoreThreshold.asInstanceOf[js.Any], softNmsSigma = softNmsSigma.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonMaxSuppressionV5Attrs]
  }
  
  @scala.inline
  implicit class NonMaxSuppressionV5AttrsMutableBuilder[Self <: NonMaxSuppressionV5Attrs] (val x: Self) extends AnyVal {
    
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
