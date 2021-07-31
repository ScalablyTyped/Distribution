package typings.tensorflowTfjsLayers.recurrentMod

import typings.tensorflowTfjsLayers.activationConfigMod.ActivationIdentifier
import typings.tensorflowTfjsLayers.constraintsMod.Constraint
import typings.tensorflowTfjsLayers.constraintsMod.ConstraintIdentifier
import typings.tensorflowTfjsLayers.initializersMod.Initializer
import typings.tensorflowTfjsLayers.initializersMod.InitializerIdentifier
import typings.tensorflowTfjsLayers.regularizersMod.Regularizer
import typings.tensorflowTfjsLayers.regularizersMod.RegularizerIdentifier
import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleRNNCellLayerArgs
  extends StObject
     with LayerArgs {
  
  /**
    * Activation function to use.
    * Default: hyperbolic tangent ('tanh').
    * If you pass `null`,  'linear' activation will be applied.
    */
  var activation: js.UndefOr[ActivationIdentifier] = js.undefined
  
  /**
    * Constraintfunction applied to the bias vector.
    */
  var biasConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.undefined
  
  /**
    * Initializer for the bias vector.
    */
  var biasInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
  
  /**
    * Regularizer function applied to the bias vector.
    */
  var biasRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
  
  /**
    * Float number between 0 and 1. Fraction of the units to drop for the linear
    * transformation of the inputs.
    */
  var dropout: js.UndefOr[Double] = js.undefined
  
  /**
    * Constraint function applied to the `kernel` weights matrix.
    */
  var kernelConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.undefined
  
  /**
    * Initializer for the `kernel` weights matrix, used for the linear
    * transformation of the inputs.
    */
  var kernelInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
  
  /**
    * Regularizer function applied to the `kernel` weights matrix.
    */
  var kernelRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
  
  /**
    * Constraint function applied to the `recurrentKernel` weights matrix.
    */
  var recurrentConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.undefined
  
  /**
    * Float number between 0 and 1. Fraction of the units to drop for the linear
    * transformation of the recurrent state.
    */
  var recurrentDropout: js.UndefOr[Double] = js.undefined
  
  /**
    * Initializer for the `recurrentKernel` weights matrix, used for
    * linear transformation of the recurrent state.
    */
  var recurrentInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
  
  /**
    * Regularizer function applied to the `recurrent_kernel` weights matrix.
    */
  var recurrentRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
  
  /**
    * units: Positive integer, dimensionality of the output space.
    */
  var units: Double
  
  /**
    * Whether the layer uses a bias vector.
    */
  var useBias: js.UndefOr[Boolean] = js.undefined
}
object SimpleRNNCellLayerArgs {
  
  @scala.inline
  def apply(units: Double): SimpleRNNCellLayerArgs = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleRNNCellLayerArgs]
  }
  
  @scala.inline
  implicit class SimpleRNNCellLayerArgsMutableBuilder[Self <: SimpleRNNCellLayerArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivation(value: ActivationIdentifier): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivationUndefined: Self = StObject.set(x, "activation", js.undefined)
    
    @scala.inline
    def setBiasConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "biasConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBiasConstraintUndefined: Self = StObject.set(x, "biasConstraint", js.undefined)
    
    @scala.inline
    def setBiasInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "biasInitializer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBiasInitializerUndefined: Self = StObject.set(x, "biasInitializer", js.undefined)
    
    @scala.inline
    def setBiasRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "biasRegularizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBiasRegularizerUndefined: Self = StObject.set(x, "biasRegularizer", js.undefined)
    
    @scala.inline
    def setDropout(value: Double): Self = StObject.set(x, "dropout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropoutUndefined: Self = StObject.set(x, "dropout", js.undefined)
    
    @scala.inline
    def setKernelConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "kernelConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelConstraintUndefined: Self = StObject.set(x, "kernelConstraint", js.undefined)
    
    @scala.inline
    def setKernelInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "kernelInitializer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelInitializerUndefined: Self = StObject.set(x, "kernelInitializer", js.undefined)
    
    @scala.inline
    def setKernelRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "kernelRegularizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelRegularizerUndefined: Self = StObject.set(x, "kernelRegularizer", js.undefined)
    
    @scala.inline
    def setRecurrentConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "recurrentConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurrentConstraintUndefined: Self = StObject.set(x, "recurrentConstraint", js.undefined)
    
    @scala.inline
    def setRecurrentDropout(value: Double): Self = StObject.set(x, "recurrentDropout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurrentDropoutUndefined: Self = StObject.set(x, "recurrentDropout", js.undefined)
    
    @scala.inline
    def setRecurrentInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "recurrentInitializer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurrentInitializerUndefined: Self = StObject.set(x, "recurrentInitializer", js.undefined)
    
    @scala.inline
    def setRecurrentRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "recurrentRegularizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurrentRegularizerUndefined: Self = StObject.set(x, "recurrentRegularizer", js.undefined)
    
    @scala.inline
    def setUnits(value: Double): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseBias(value: Boolean): Self = StObject.set(x, "useBias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseBiasUndefined: Self = StObject.set(x, "useBias", js.undefined)
  }
}
