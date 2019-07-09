package typings
package atTensorflowTfjsDashLayersLib.distConstraintsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var axis: js.UndefOr[scala.Double] = js.undefined
}

object UnitNormArgs {
  @scala.inline
  def apply(axis: scala.Int | scala.Double = null): UnitNormArgs = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnitNormArgs]
  }
}

