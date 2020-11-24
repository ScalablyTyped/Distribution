package typings.tensorflowTfjsLayers.recurrentMod

import typings.tensorflowTfjsLayers.activationConfigMod.ActivationIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GRUCellLayerArgs extends SimpleRNNCellLayerArgs {
  
  /**
    * Implementation mode, either 1 or 2.
    *
    * Mode 1 will structure its operations as a larger number of
    *   smaller dot products and additions.
    *
    * Mode 2 will batch them into fewer, larger operations. These modes will
    * have different performance profiles on different hardware and
    * for different applications.
    *
    * Note: For superior performance, TensorFlow.js always uses implementation
    * 2, regardless of the actual value of this configuration field.
    */
  var implementation: js.UndefOr[Double] = js.native
  
  /**
    * Activation function to use for the recurrent step.
    *
    * Defaults to hard sigmoid (`hardSigmoid`).
    *
    * If `null`, no activation is applied.
    */
  var recurrentActivation: js.UndefOr[ActivationIdentifier] = js.native
  
  /**
    * GRU convention (whether to apply reset gate after or before matrix
    * multiplication). false = "before", true = "after" (only false is
    * supported).
    */
  var resetAfter: js.UndefOr[Boolean] = js.native
}
object GRUCellLayerArgs {
  
  @scala.inline
  def apply(units: Double): GRUCellLayerArgs = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[GRUCellLayerArgs]
  }
  
  @scala.inline
  implicit class GRUCellLayerArgsOps[Self <: GRUCellLayerArgs] (val x: Self) extends AnyVal {
    
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
    def setImplementation(value: Double): Self = this.set("implementation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImplementation: Self = this.set("implementation", js.undefined)
    
    @scala.inline
    def setRecurrentActivation(value: ActivationIdentifier): Self = this.set("recurrentActivation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurrentActivation: Self = this.set("recurrentActivation", js.undefined)
    
    @scala.inline
    def setResetAfter(value: Boolean): Self = this.set("resetAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResetAfter: Self = this.set("resetAfter", js.undefined)
  }
}
