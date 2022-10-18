package typings.tensorflowTfjsLayers.distLayersRecurrentMod

import typings.tensorflowTfjsLayers.distConstraintsMod.Constraint
import typings.tensorflowTfjsLayers.distConstraintsMod.ConstraintIdentifier
import typings.tensorflowTfjsLayers.distInitializersMod.Initializer
import typings.tensorflowTfjsLayers.distInitializersMod.InitializerIdentifier
import typings.tensorflowTfjsLayers.distKerasFormatActivationConfigMod.ActivationIdentifier
import typings.tensorflowTfjsLayers.distRegularizersMod.Regularizer
import typings.tensorflowTfjsLayers.distRegularizersMod.RegularizerIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleRNNLayerArgs
  extends StObject
     with BaseRNNLayerArgs {
  
  /**
    * Activation function to use.
    *
    * Defaults to  hyperbolic tangent (`tanh`)
    *
    * If you pass `null`, no activation will be applied.
    */
  var activation: js.UndefOr[ActivationIdentifier] = js.undefined
  
  /**
    * Constraint function applied to the bias vector.
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
    * Number between 0 and 1. Fraction of the units to drop for the linear
    * transformation of the inputs.
    */
  var dropout: js.UndefOr[Double] = js.undefined
  
  /**
    * This is added for test DI purpose.
    */
  var dropoutFunc: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Constraint function applied to the kernel weights matrix.
    */
  var kernelConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.undefined
  
  /**
    * Initializer for the `kernel` weights matrix, used for the linear
    * transformation of the inputs.
    */
  var kernelInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
  
  /**
    * Regularizer function applied to the kernel weights matrix.
    */
  var kernelRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
  
  /**
    * Constraint function applied to the recurrentKernel weights matrix.
    */
  var recurrentConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.undefined
  
  /**
    * Number between 0 and 1. Fraction of the units to drop for the linear
    * transformation of the recurrent state.
    */
  var recurrentDropout: js.UndefOr[Double] = js.undefined
  
  /**
    * Initializer for the `recurrentKernel` weights matrix, used for
    * linear transformation of the recurrent state.
    */
  var recurrentInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
  
  /**
    * Regularizer function applied to the recurrentKernel weights matrix.
    */
  var recurrentRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
  
  /**
    * Positive integer, dimensionality of the output space.
    */
  var units: Double
  
  /**
    * Whether the layer uses a bias vector.
    */
  var useBias: js.UndefOr[Boolean] = js.undefined
}
object SimpleRNNLayerArgs {
  
  inline def apply(units: Double): SimpleRNNLayerArgs = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleRNNLayerArgs]
  }
  
  extension [Self <: SimpleRNNLayerArgs](x: Self) {
    
    inline def setActivation(value: ActivationIdentifier): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
    
    inline def setActivationUndefined: Self = StObject.set(x, "activation", js.undefined)
    
    inline def setBiasConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "biasConstraint", value.asInstanceOf[js.Any])
    
    inline def setBiasConstraintUndefined: Self = StObject.set(x, "biasConstraint", js.undefined)
    
    inline def setBiasInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "biasInitializer", value.asInstanceOf[js.Any])
    
    inline def setBiasInitializerUndefined: Self = StObject.set(x, "biasInitializer", js.undefined)
    
    inline def setBiasRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "biasRegularizer", value.asInstanceOf[js.Any])
    
    inline def setBiasRegularizerUndefined: Self = StObject.set(x, "biasRegularizer", js.undefined)
    
    inline def setDropout(value: Double): Self = StObject.set(x, "dropout", value.asInstanceOf[js.Any])
    
    inline def setDropoutFunc(value: js.Function): Self = StObject.set(x, "dropoutFunc", value.asInstanceOf[js.Any])
    
    inline def setDropoutFuncUndefined: Self = StObject.set(x, "dropoutFunc", js.undefined)
    
    inline def setDropoutUndefined: Self = StObject.set(x, "dropout", js.undefined)
    
    inline def setKernelConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "kernelConstraint", value.asInstanceOf[js.Any])
    
    inline def setKernelConstraintUndefined: Self = StObject.set(x, "kernelConstraint", js.undefined)
    
    inline def setKernelInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "kernelInitializer", value.asInstanceOf[js.Any])
    
    inline def setKernelInitializerUndefined: Self = StObject.set(x, "kernelInitializer", js.undefined)
    
    inline def setKernelRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "kernelRegularizer", value.asInstanceOf[js.Any])
    
    inline def setKernelRegularizerUndefined: Self = StObject.set(x, "kernelRegularizer", js.undefined)
    
    inline def setRecurrentConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "recurrentConstraint", value.asInstanceOf[js.Any])
    
    inline def setRecurrentConstraintUndefined: Self = StObject.set(x, "recurrentConstraint", js.undefined)
    
    inline def setRecurrentDropout(value: Double): Self = StObject.set(x, "recurrentDropout", value.asInstanceOf[js.Any])
    
    inline def setRecurrentDropoutUndefined: Self = StObject.set(x, "recurrentDropout", js.undefined)
    
    inline def setRecurrentInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "recurrentInitializer", value.asInstanceOf[js.Any])
    
    inline def setRecurrentInitializerUndefined: Self = StObject.set(x, "recurrentInitializer", js.undefined)
    
    inline def setRecurrentRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "recurrentRegularizer", value.asInstanceOf[js.Any])
    
    inline def setRecurrentRegularizerUndefined: Self = StObject.set(x, "recurrentRegularizer", js.undefined)
    
    inline def setUnits(value: Double): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    inline def setUseBias(value: Boolean): Self = StObject.set(x, "useBias", value.asInstanceOf[js.Any])
    
    inline def setUseBiasUndefined: Self = StObject.set(x, "useBias", js.undefined)
  }
}
