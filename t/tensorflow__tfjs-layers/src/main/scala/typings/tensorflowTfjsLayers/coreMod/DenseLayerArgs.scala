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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DenseLayerArgs
  extends StObject
     with LayerArgs {
  
  /**
    * Activation function to use.
    *
    * If unspecified, no activation is applied.
    */
  var activation: js.UndefOr[ActivationIdentifier] = js.undefined
  
  /**
    * Regularizer function applied to the activation.
    */
  var activityRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
  
  /**
    * Constraint for the bias vector.
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
    * If specified, defines inputShape as `[inputDim]`.
    */
  var inputDim: js.UndefOr[Double] = js.undefined
  
  /**
    * Constraint for the kernel weights.
    */
  var kernelConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.undefined
  
  /**
    * Initializer for the dense kernel weights matrix.
    */
  var kernelInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
  
  /**
    * Regularizer function applied to the dense kernel weights matrix.
    */
  var kernelRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
  
  /** Positive integer, dimensionality of the output space. */
  var units: Double
  
  /** Whether to apply a bias. */
  var useBias: js.UndefOr[Boolean] = js.undefined
}
object DenseLayerArgs {
  
  inline def apply(units: Double): DenseLayerArgs = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[DenseLayerArgs]
  }
  
  extension [Self <: DenseLayerArgs](x: Self) {
    
    inline def setActivation(value: ActivationIdentifier): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
    
    inline def setActivationUndefined: Self = StObject.set(x, "activation", js.undefined)
    
    inline def setActivityRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "activityRegularizer", value.asInstanceOf[js.Any])
    
    inline def setActivityRegularizerUndefined: Self = StObject.set(x, "activityRegularizer", js.undefined)
    
    inline def setBiasConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "biasConstraint", value.asInstanceOf[js.Any])
    
    inline def setBiasConstraintUndefined: Self = StObject.set(x, "biasConstraint", js.undefined)
    
    inline def setBiasInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "biasInitializer", value.asInstanceOf[js.Any])
    
    inline def setBiasInitializerUndefined: Self = StObject.set(x, "biasInitializer", js.undefined)
    
    inline def setBiasRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "biasRegularizer", value.asInstanceOf[js.Any])
    
    inline def setBiasRegularizerUndefined: Self = StObject.set(x, "biasRegularizer", js.undefined)
    
    inline def setInputDim(value: Double): Self = StObject.set(x, "inputDim", value.asInstanceOf[js.Any])
    
    inline def setInputDimUndefined: Self = StObject.set(x, "inputDim", js.undefined)
    
    inline def setKernelConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "kernelConstraint", value.asInstanceOf[js.Any])
    
    inline def setKernelConstraintUndefined: Self = StObject.set(x, "kernelConstraint", js.undefined)
    
    inline def setKernelInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "kernelInitializer", value.asInstanceOf[js.Any])
    
    inline def setKernelInitializerUndefined: Self = StObject.set(x, "kernelInitializer", js.undefined)
    
    inline def setKernelRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "kernelRegularizer", value.asInstanceOf[js.Any])
    
    inline def setKernelRegularizerUndefined: Self = StObject.set(x, "kernelRegularizer", js.undefined)
    
    inline def setUnits(value: Double): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    inline def setUseBias(value: Boolean): Self = StObject.set(x, "useBias", value.asInstanceOf[js.Any])
    
    inline def setUseBiasUndefined: Self = StObject.set(x, "useBias", js.undefined)
  }
}
