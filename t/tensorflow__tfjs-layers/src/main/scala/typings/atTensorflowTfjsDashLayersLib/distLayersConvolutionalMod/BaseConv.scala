package typings
package atTensorflowTfjsDashLayersLib.distLayersConvolutionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "BaseConv")
@js.native
abstract class BaseConv protected ()
  extends atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer {
  def this(rank: scala.Double, args: BaseConvLayerArgs) = this()
  val DEFAULT_BIAS_INITIALIZER: atTensorflowTfjsDashLayersLib.distInitializersMod.InitializerIdentifier = js.native
  val DEFAULT_KERNEL_INITIALIZER: atTensorflowTfjsDashLayersLib.distInitializersMod.InitializerIdentifier = js.native
  val activation: atTensorflowTfjsDashLayersLib.distActivationsMod.Activation = js.native
  var bias: atTensorflowTfjsDashLayersLib.distVariablesMod.LayerVariable = js.native
  val biasConstraint: js.UndefOr[atTensorflowTfjsDashLayersLib.distConstraintsMod.Constraint] = js.native
  val biasInitializer: js.UndefOr[atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer] = js.native
  val biasRegularizer: js.UndefOr[atTensorflowTfjsDashLayersLib.distRegularizersMod.Regularizer] = js.native
  val dataFormat: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.DataFormat = js.native
  val dilationRate: js.Array[scala.Double] = js.native
  val kernelSize: js.Array[scala.Double] = js.native
  val padding: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.PaddingMode = js.native
  val rank: scala.Double = js.native
  val strides: js.Array[scala.Double] = js.native
  val useBias: scala.Boolean = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "BaseConv")
@js.native
object BaseConv extends js.Object {
  /* protected */ def verifyArgs(args: atTensorflowTfjsDashLayersLib.distLayersConvolutionalMod.BaseConvLayerArgs): scala.Unit = js.native
}

