package typings.tensorflowTfjsLayers.constraintsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnitNormArgs extends js.Object {
  /**
    * Axis along which to calculate norms.
    *
    * For instance, in a `Dense` layer the weight matrix
    * has shape `[inputDim, outputDim]`,
    * set `axis` to `0` to constrain each weight vector
    * of length `[inputDim,]`.
    * In a `Conv2D` layer with `dataFormat="channels_last"`,
    * the weight tensor has shape
    * [rows, cols, inputDepth, outputDepth]`,
    * set `axis` to `[0, 1, 2]`
    * to constrain the weights of each filter tensor of size
    * `[rows, cols, inputDepth]`.
    */
  var axis: js.UndefOr[Double] = js.native
}

object UnitNormArgs {
  @scala.inline
  def apply(): UnitNormArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnitNormArgs]
  }
  @scala.inline
  implicit class UnitNormArgsOps[Self <: UnitNormArgs] (val x: Self) extends AnyVal {
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
    def setAxis(value: Double): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
  }
  
}

