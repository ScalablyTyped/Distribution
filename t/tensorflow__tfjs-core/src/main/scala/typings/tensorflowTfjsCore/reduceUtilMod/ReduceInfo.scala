package typings.tensorflowTfjsCore.reduceUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReduceInfo extends js.Object {
  var batchSize: Double
  var inSize: Double
  var windowSize: Double
}

object ReduceInfo {
  @scala.inline
  def apply(batchSize: Double, inSize: Double, windowSize: Double): ReduceInfo = {
    val __obj = js.Dynamic.literal(batchSize = batchSize.asInstanceOf[js.Any], inSize = inSize.asInstanceOf[js.Any], windowSize = windowSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReduceInfo]
  }
}

