package typings
package atTensorflowTfjsDashLayersLib.distLayersRecurrentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "SimpleRNNCell")
@js.native
class SimpleRNNCell protected () extends RNNCell {
  def this(args: SimpleRNNCellLayerArgs) = this()
  val DEFAULT_ACTIVATION: atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersLibStrings.tanh = js.native
  val DEFAULT_BIAS_INITIALIZER: atTensorflowTfjsDashLayersLib.distInitializersMod.InitializerIdentifier = js.native
  val DEFAULT_KERNEL_INITIALIZER: atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersLibStrings.glorotNormal = js.native
  val DEFAULT_RECURRENT_INITIALIZER: atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersLibStrings.orthogonal = js.native
  val activation: atTensorflowTfjsDashLayersLib.distActivationsMod.Activation = js.native
  var bias: atTensorflowTfjsDashLayersLib.distVariablesMod.LayerVariable = js.native
  val biasConstraint: atTensorflowTfjsDashLayersLib.distConstraintsMod.Constraint = js.native
  val biasInitializer: atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer = js.native
  val biasRegularizer: atTensorflowTfjsDashLayersLib.distRegularizersMod.Regularizer = js.native
  val dropout: scala.Double = js.native
  var kernel: atTensorflowTfjsDashLayersLib.distVariablesMod.LayerVariable = js.native
  val kernelConstraint: atTensorflowTfjsDashLayersLib.distConstraintsMod.Constraint = js.native
  val kernelInitializer: atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer = js.native
  val kernelRegularizer: atTensorflowTfjsDashLayersLib.distRegularizersMod.Regularizer = js.native
  val recurrentConstraint: atTensorflowTfjsDashLayersLib.distConstraintsMod.Constraint = js.native
  val recurrentDropout: scala.Double = js.native
  val recurrentInitializer: atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer = js.native
  var recurrentKernel: atTensorflowTfjsDashLayersLib.distVariablesMod.LayerVariable = js.native
  val recurrentRegularizer: atTensorflowTfjsDashLayersLib.distRegularizersMod.Regularizer = js.native
  @JSName("stateSize")
  val stateSize_SimpleRNNCell: scala.Double = js.native
  val units: scala.Double = js.native
  val useBias: scala.Boolean = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "SimpleRNNCell")
@js.native
object SimpleRNNCell extends js.Object {
  /** @nocollapse */
  var className: java.lang.String = js.native
}

