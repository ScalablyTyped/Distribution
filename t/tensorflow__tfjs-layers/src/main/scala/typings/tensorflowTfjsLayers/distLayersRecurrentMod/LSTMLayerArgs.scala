package typings.tensorflowTfjsLayers.distLayersRecurrentMod

import typings.tensorflowTfjsLayers.distKerasFormatActivationConfigMod.ActivationIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LSTMLayerArgs
  extends StObject
     with SimpleRNNLayerArgs {
  
  /**
    * Implementation mode, either 1 or 2.
    *   Mode 1 will structure its operations as a larger number of
    *   smaller dot products and additions, whereas mode 2 will
    *   batch them into fewer, larger operations. These modes will
    *   have different performance profiles on different hardware and
    *   for different applications.
    *
    * Note: For superior performance, TensorFlow.js always uses implementation
    * 2, regardless of the actual value of this config field.
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
    * If `true`, add 1 to the bias of the forget gate at initialization.
    * Setting it to `true` will also force `biasInitializer = 'zeros'`.
    * This is recommended in
    * [Jozefowicz et
    * al.](http://www.jmlr.org/proceedings/papers/v37/jozefowicz15.pdf)
    */
  var unitForgetBias: js.UndefOr[Boolean] = js.undefined
}
object LSTMLayerArgs {
  
  inline def apply(units: Double): LSTMLayerArgs = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[LSTMLayerArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LSTMLayerArgs] (val x: Self) extends AnyVal {
    
    inline def setImplementation(value: Double): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
    
    inline def setImplementationUndefined: Self = StObject.set(x, "implementation", js.undefined)
    
    inline def setRecurrentActivation(value: ActivationIdentifier): Self = StObject.set(x, "recurrentActivation", value.asInstanceOf[js.Any])
    
    inline def setRecurrentActivationUndefined: Self = StObject.set(x, "recurrentActivation", js.undefined)
    
    inline def setUnitForgetBias(value: Boolean): Self = StObject.set(x, "unitForgetBias", value.asInstanceOf[js.Any])
    
    inline def setUnitForgetBiasUndefined: Self = StObject.set(x, "unitForgetBias", js.undefined)
  }
}
