package typings.tensorflowTfjsCore.kernelNamesMod

import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxPoolWithArgmaxAttrs extends js.Object {
  var filterSize: (js.Tuple2[Double, Double]) | Double
  var includeBatchInIndex: Boolean
  var pad: valid_ | same_ | Double
  var strides: (js.Tuple2[Double, Double]) | Double
}

object MaxPoolWithArgmaxAttrs {
  @scala.inline
  def apply(
    filterSize: (js.Tuple2[Double, Double]) | Double,
    includeBatchInIndex: Boolean,
    pad: valid_ | same_ | Double,
    strides: (js.Tuple2[Double, Double]) | Double
  ): MaxPoolWithArgmaxAttrs = {
    val __obj = js.Dynamic.literal(filterSize = filterSize.asInstanceOf[js.Any], includeBatchInIndex = includeBatchInIndex.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxPoolWithArgmaxAttrs]
  }
}

