package typings.tensorflowTfjsCore.kernelNamesMod

import typings.tensorflowTfjsCore.convUtilMod.ExplicitPadding
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCHW
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NHWC
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Conv2DBackpropInputAttrs extends js.Object {
  var dataFormat: NHWC | NCHW = js.native
  var dimRoundingMode: js.UndefOr[floor | round | ceil] = js.native
  var pad: valid_ | same_ | Double | ExplicitPadding = js.native
  var strides: (js.Tuple2[Double, Double]) | Double = js.native
}

object Conv2DBackpropInputAttrs {
  @scala.inline
  def apply(
    dataFormat: NHWC | NCHW,
    pad: valid_ | same_ | Double | ExplicitPadding,
    strides: (js.Tuple2[Double, Double]) | Double
  ): Conv2DBackpropInputAttrs = {
    val __obj = js.Dynamic.literal(dataFormat = dataFormat.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conv2DBackpropInputAttrs]
  }
  @scala.inline
  implicit class Conv2DBackpropInputAttrsOps[Self <: Conv2DBackpropInputAttrs] (val x: Self) extends AnyVal {
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
    def setDataFormat(value: NHWC | NCHW): Self = this.set("dataFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setPad(value: valid_ | same_ | Double | ExplicitPadding): Self = this.set("pad", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrides(value: (js.Tuple2[Double, Double]) | Double): Self = this.set("strides", value.asInstanceOf[js.Any])
    @scala.inline
    def setDimRoundingMode(value: floor | round | ceil): Self = this.set("dimRoundingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimRoundingMode: Self = this.set("dimRoundingMode", js.undefined)
  }
  
}

