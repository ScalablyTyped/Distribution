package typings.tensorflowTfjsCore.kernelNamesMod

import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvgPoolBackpropAttrs extends js.Object {
  var filterSize: (js.Tuple2[Double, Double]) | Double = js.native
  var pad: valid_ | same_ | Double = js.native
  var strides: (js.Tuple2[Double, Double]) | Double = js.native
}

object AvgPoolBackpropAttrs {
  @scala.inline
  def apply(
    filterSize: (js.Tuple2[Double, Double]) | Double,
    pad: valid_ | same_ | Double,
    strides: (js.Tuple2[Double, Double]) | Double
  ): AvgPoolBackpropAttrs = {
    val __obj = js.Dynamic.literal(filterSize = filterSize.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvgPoolBackpropAttrs]
  }
  @scala.inline
  implicit class AvgPoolBackpropAttrsOps[Self <: AvgPoolBackpropAttrs] (val x: Self) extends AnyVal {
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
  }
  
}

