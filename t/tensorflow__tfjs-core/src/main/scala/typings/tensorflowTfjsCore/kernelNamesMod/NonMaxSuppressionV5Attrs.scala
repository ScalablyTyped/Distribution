package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NonMaxSuppressionV5Attrs extends js.Object {
  
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
  implicit class NonMaxSuppressionV5AttrsOps[Self <: NonMaxSuppressionV5Attrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIouThreshold(value: Double): Self = this.set("iouThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxOutputSize(value: Double): Self = this.set("maxOutputSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreThreshold(value: Double): Self = this.set("scoreThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftNmsSigma(value: Double): Self = this.set("softNmsSigma", value.asInstanceOf[js.Any])
  }
}
