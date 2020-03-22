package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonMaxSuppressionV5Attrs extends js.Object {
  var iouThreshold: Double
  var maxOutputSize: Double
  var scoreThreshold: Double
  var softNmsSigma: Double
}

object NonMaxSuppressionV5Attrs {
  @scala.inline
  def apply(iouThreshold: Double, maxOutputSize: Double, scoreThreshold: Double, softNmsSigma: Double): NonMaxSuppressionV5Attrs = {
    val __obj = js.Dynamic.literal(iouThreshold = iouThreshold.asInstanceOf[js.Any], maxOutputSize = maxOutputSize.asInstanceOf[js.Any], scoreThreshold = scoreThreshold.asInstanceOf[js.Any], softNmsSigma = softNmsSigma.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NonMaxSuppressionV5Attrs]
  }
}

