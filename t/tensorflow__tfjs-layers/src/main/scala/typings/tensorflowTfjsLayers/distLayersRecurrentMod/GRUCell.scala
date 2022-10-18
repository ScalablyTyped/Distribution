package typings.tensorflowTfjsLayers.distLayersRecurrentMod

import typings.tensorflowTfjsLayers.distActivationsMod.Activation
import typings.tensorflowTfjsLayers.distConstraintsMod.Constraint
import typings.tensorflowTfjsLayers.distInitializersMod.Initializer
import typings.tensorflowTfjsLayers.distInitializersMod.InitializerIdentifier
import typings.tensorflowTfjsLayers.distKerasFormatActivationConfigMod.ActivationIdentifier
import typings.tensorflowTfjsLayers.distRegularizersMod.Regularizer
import typings.tensorflowTfjsLayers.distVariablesMod.LayerVariable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "GRUCell")
@js.native
open class GRUCell protected () extends RNNCell {
  def this(args: GRUCellLayerArgs) = this()
  
  val DEFAULT_ACTIVATION: /* "tanh" */ String = js.native
  
  val DEFAULT_BIAS_INITIALIZER: InitializerIdentifier = js.native
  
  val DEFAULT_KERNEL_INITIALIZER: /* "glorotNormal" */ String = js.native
  
  val DEFAULT_RECURRENT_ACTIVATION: ActivationIdentifier = js.native
  
  val DEFAULT_RECURRENT_INITIALIZER: /* "orthogonal" */ String = js.native
  
  val activation: Activation = js.native
  
  var bias: LayerVariable = js.native
  
  val biasConstraint: Constraint = js.native
  
  val biasInitializer: Initializer = js.native
  
  val biasRegularizer: Regularizer = js.native
  
  val dropout: Double = js.native
  
  val dropoutFunc: js.Function = js.native
  
  val implementation: Double = js.native
  
  var kernel: LayerVariable = js.native
  
  val kernelConstraint: Constraint = js.native
  
  val kernelInitializer: Initializer = js.native
  
  val kernelRegularizer: Regularizer = js.native
  
  val recurrentActivation: Activation = js.native
  
  val recurrentConstraint: Constraint = js.native
  
  val recurrentDropout: Double = js.native
  
  val recurrentInitializer: Initializer = js.native
  
  var recurrentKernel: LayerVariable = js.native
  
  val recurrentRegularizer: Regularizer = js.native
  
  @JSName("stateSize")
  val stateSize_GRUCell: Double = js.native
  
  val units: Double = js.native
  
  val useBias: Boolean = js.native
}
/* static members */
object GRUCell {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "GRUCell")
  @js.native
  val ^ : js.Any = js.native
  
  /** @nocollapse */
  @JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "GRUCell.className")
  @js.native
  def className: String = js.native
  inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
}
