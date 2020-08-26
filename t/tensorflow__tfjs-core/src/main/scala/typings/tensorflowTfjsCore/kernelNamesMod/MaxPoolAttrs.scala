package typings.tensorflowTfjsCore.kernelNamesMod

import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxPoolAttrs extends js.Object {
  var dimRoundingMode: js.UndefOr[floor | round | ceil] = js.native
  var filterSize: (js.Tuple2[Double, Double]) | Double = js.native
  var pad: valid_ | same_ | Double = js.native
  var strides: (js.Tuple2[Double, Double]) | Double = js.native
}

object MaxPoolAttrs {
  @scala.inline
  def apply(
    filterSize: (js.Tuple2[Double, Double]) | Double,
    pad: valid_ | same_ | Double,
    strides: (js.Tuple2[Double, Double]) | Double
  ): MaxPoolAttrs = {
    val __obj = js.Dynamic.literal(filterSize = filterSize.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxPoolAttrs]
  }
  @scala.inline
  implicit class MaxPoolAttrsOps[Self <: MaxPoolAttrs] (val x: Self) extends AnyVal {
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
    def setFilterSize(value: (js.Tuple2[Double, Double]) | Double): Self = this.set("filterSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setPad(value: valid_ | same_ | Double): Self = this.set("pad", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrides(value: (js.Tuple2[Double, Double]) | Double): Self = this.set("strides", value.asInstanceOf[js.Any])
    @scala.inline
    def setDimRoundingMode(value: floor | round | ceil): Self = this.set("dimRoundingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimRoundingMode: Self = this.set("dimRoundingMode", js.undefined)
  }
  
}

