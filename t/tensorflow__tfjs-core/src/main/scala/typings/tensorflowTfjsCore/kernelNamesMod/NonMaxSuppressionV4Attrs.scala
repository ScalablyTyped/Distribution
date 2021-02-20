package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NonMaxSuppressionV4Attrs extends StObject {
  
  var iouThreshold: Double = js.native
  
  var maxOutputSize: Double = js.native
  
  var padToMaxOutputSize: Boolean = js.native
  
  var scoreThreshold: Double = js.native
}
object NonMaxSuppressionV4Attrs {
  
  @scala.inline
  def apply(iouThreshold: Double, maxOutputSize: Double, padToMaxOutputSize: Boolean, scoreThreshold: Double): NonMaxSuppressionV4Attrs = {
    val __obj = js.Dynamic.literal(iouThreshold = iouThreshold.asInstanceOf[js.Any], maxOutputSize = maxOutputSize.asInstanceOf[js.Any], padToMaxOutputSize = padToMaxOutputSize.asInstanceOf[js.Any], scoreThreshold = scoreThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonMaxSuppressionV4Attrs]
  }
  
  @scala.inline
  implicit class NonMaxSuppressionV4AttrsMutableBuilder[Self <: NonMaxSuppressionV4Attrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIouThreshold(value: Double): Self = StObject.set(x, "iouThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxOutputSize(value: Double): Self = StObject.set(x, "maxOutputSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadToMaxOutputSize(value: Boolean): Self = StObject.set(x, "padToMaxOutputSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreThreshold(value: Double): Self = StObject.set(x, "scoreThreshold", value.asInstanceOf[js.Any])
  }
}
