package typings.tensorflowTfjsLayers.coreMod

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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DenseLayerArgs extends LayerArgs {
  
  /**
    * Activation function to use.
    *
    * If unspecified, no activation is applied.
    */
  var activation: js.UndefOr[ActivationIdentifier] = js.native
  
  /**
    * Regularizer function applied to the activation.
    */
  var activityRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
  
  /**
    * Constraint for the bias vector.
    */
  var biasConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
  
  /**
    * Initializer for the bias vector.
    */
  var biasInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
  
  /**
    * Regularizer function applied to the bias vector.
    */
  var biasRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
  
  /**
    * If specified, defines inputShape as `[inputDim]`.
    */
  var inputDim: js.UndefOr[Double] = js.native
  
  /**
    * Constraint for the kernel weights.
    */
  var kernelConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
  
  /**
    * Initializer for the dense kernel weights matrix.
    */
  var kernelInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
  
  /**
    * Regularizer function applied to the dense kernel weights matrix.
    */
  var kernelRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
  
  /** Positive integer, dimensionality of the output space. */
  var units: Double = js.native
  
  /** Whether to apply a bias. */
  var useBias: js.UndefOr[Boolean] = js.native
}
object DenseLayerArgs {
  
  @scala.inline
  def apply(units: Double): DenseLayerArgs = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[DenseLayerArgs]
  }
  
  @scala.inline
  implicit class DenseLayerArgsMutableBuilder[Self <: DenseLayerArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivation(value: ActivationIdentifier): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivationUndefined: Self = StObject.set(x, "activation", js.undefined)
    
    @scala.inline
    def setActivityRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "activityRegularizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityRegularizerUndefined: Self = StObject.set(x, "activityRegularizer", js.undefined)
    
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
    def setInputDim(value: Double): Self = StObject.set(x, "inputDim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDimUndefined: Self = StObject.set(x, "inputDim", js.undefined)
    
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
    def setUnits(value: Double): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseBias(value: Boolean): Self = StObject.set(x, "useBias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseBiasUndefined: Self = StObject.set(x, "useBias", js.undefined)
  }
}
