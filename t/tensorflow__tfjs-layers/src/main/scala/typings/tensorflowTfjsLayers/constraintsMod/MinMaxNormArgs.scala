package typings.tensorflowTfjsLayers.constraintsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  var axis: js.UndefOr[Double] = js.native
  
  /**
    * Maximum norm for incoming weights
    */
  var maxValue: js.UndefOr[Double] = js.native
  
  /**
    * Minimum norm for incoming weights
    */
  var minValue: js.UndefOr[Double] = js.native
  
  /**
    * Rate for enforcing the constraint: weights will be rescaled to yield:
    * `(1 - rate) * norm + rate * norm.clip(minValue, maxValue)`.
    * Effectively, this means that rate=1.0 stands for strict
    * enforcement of the constraint, while rate<1.0 means that
    * weights will be rescaled at each step to slowly move
    * towards a value inside the desired interval.
    */
  var rate: js.UndefOr[Double] = js.native
}
object MinMaxNormArgs {
  
  @scala.inline
  def apply(): MinMaxNormArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinMaxNormArgs]
  }
  
  @scala.inline
  implicit class MinMaxNormArgsOps[Self <: MinMaxNormArgs] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    
    @scala.inline
    def setRate(value: Double): Self = this.set("rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRate: Self = this.set("rate", js.undefined)
  }
}
