package typings.tensorflowTfjsLayers.recurrentMod

import typings.tensorflowTfjsLayers.activationConfigMod.ActivationIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GRUCellLayerArgs
  extends StObject
     with SimpleRNNCellLayerArgs {
  
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
  var implementation: js.UndefOr[Double] = js.undefined
  
  /**
    * Activation function to use for the recurrent step.
    *
    * Defaults to hard sigmoid (`hardSigmoid`).
    *
    * If `null`, no activation is applied.
    */
  var recurrentActivation: js.UndefOr[ActivationIdentifier] = js.undefined
  
  /**
    * GRU convention (whether to apply reset gate after or before matrix
    * multiplication). false = "before", true = "after" (only false is
    * supported).
    */
  var resetAfter: js.UndefOr[Boolean] = js.undefined
}
object GRUCellLayerArgs {
  
  @scala.inline
  def apply(units: Double): GRUCellLayerArgs = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[GRUCellLayerArgs]
  }
  
  @scala.inline
  implicit class GRUCellLayerArgsMutableBuilder[Self <: GRUCellLayerArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImplementation(value: Double): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplementationUndefined: Self = StObject.set(x, "implementation", js.undefined)
    
    @scala.inline
    def setRecurrentActivation(value: ActivationIdentifier): Self = StObject.set(x, "recurrentActivation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurrentActivationUndefined: Self = StObject.set(x, "recurrentActivation", js.undefined)
    
    @scala.inline
    def setResetAfter(value: Boolean): Self = StObject.set(x, "resetAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetAfterUndefined: Self = StObject.set(x, "resetAfter", js.undefined)
  }
}
