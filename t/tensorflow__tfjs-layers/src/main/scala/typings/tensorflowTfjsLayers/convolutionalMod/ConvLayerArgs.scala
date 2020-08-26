package typings.tensorflowTfjsLayers.convolutionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConvLayerArgs extends BaseConvLayerArgs {
  /**
    * The dimensionality of the output space (i.e. the number of filters in the
    * convolution).
    */
  var filters: Double = js.native
}

object ConvLayerArgs {
  @scala.inline
  def apply(filters: Double, kernelSize: Double | js.Array[Double]): ConvLayerArgs = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], kernelSize = kernelSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvLayerArgs]
  }
  @scala.inline
  implicit class ConvLayerArgsOps[Self <: ConvLayerArgs] (val x: Self) extends AnyVal {
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
    def setFilters(value: Double): Self = this.set("filters", value.asInstanceOf[js.Any])
  }
  
}

