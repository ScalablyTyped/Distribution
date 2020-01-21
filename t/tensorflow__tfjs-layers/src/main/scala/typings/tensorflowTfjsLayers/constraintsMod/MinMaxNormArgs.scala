package typings.tensorflowTfjsLayers.constraintsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinMaxNormArgs extends js.Object {
  /**
    * Axis along which to calculate norms.
    * For instance, in a `Dense` layer the weight matrix
    * has shape `[inputDim, outputDim]`,
    * set `axis` to `0` to constrain each weight vector
    * of length `[inputDim,]`.
    * In a `Conv2D` layer with `dataFormat="channels_last"`,
    * the weight tensor has shape
    * `[rows, cols, inputDepth, outputDepth]`,
    * set `axis` to `[0, 1, 2]`
    * to constrain the weights of each filter tensor of size
    * `[rows, cols, inputDepth]`.
    */
  var axis: js.UndefOr[Double] = js.undefined
  /**
    * Maximum norm for incoming weights
    */
  var maxValue: js.UndefOr[Double] = js.undefined
  /**
    * Minimum norm for incoming weights
    */
  var minValue: js.UndefOr[Double] = js.undefined
  /**
    * Rate for enforcing the constraint: weights will be rescaled to yield:
    * `(1 - rate) * norm + rate * norm.clip(minValue, maxValue)`.
    * Effectively, this means that rate=1.0 stands for strict
    * enforcement of the constraint, while rate<1.0 means that
    * weights will be rescaled at each step to slowly move
    * towards a value inside the desired interval.
    */
  var rate: js.UndefOr[Double] = js.undefined
}

object MinMaxNormArgs {
  @scala.inline
  def apply(
    axis: Int | Double = null,
    maxValue: Int | Double = null,
    minValue: Int | Double = null,
    rate: Int | Double = null
  ): MinMaxNormArgs = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinMaxNormArgs]
  }
}

