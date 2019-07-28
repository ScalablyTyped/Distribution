package typings.atTensorflowTfjsDashLayers.distLayersConvolutionalMod

import typings.atTensorflowTfjsDashLayers.distActivationsMod.Activation
import typings.atTensorflowTfjsDashLayers.distConstraintsMod.Constraint
import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer
import typings.atTensorflowTfjsDashLayers.distInitializersMod.Initializer
import typings.atTensorflowTfjsDashLayers.distInitializersMod.InitializerIdentifier
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.DataFormat
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.PaddingMode
import typings.atTensorflowTfjsDashLayers.distRegularizersMod.Regularizer
import typings.atTensorflowTfjsDashLayers.distVariablesMod.LayerVariable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "BaseConv")
@js.native
abstract class BaseConv protected () extends Layer {
  def this(rank: Double, args: BaseConvLayerArgs) = this()
  val DEFAULT_BIAS_INITIALIZER: InitializerIdentifier = js.native
  val DEFAULT_KERNEL_INITIALIZER: InitializerIdentifier = js.native
  val activation: Activation = js.native
  var bias: LayerVariable = js.native
  val biasConstraint: js.UndefOr[Constraint] = js.native
  val biasInitializer: js.UndefOr[Initializer] = js.native
  val biasRegularizer: js.UndefOr[Regularizer] = js.native
  val dataFormat: DataFormat = js.native
  val dilationRate: js.Array[Double] = js.native
  val kernelSize: js.Array[Double] = js.native
  val padding: PaddingMode = js.native
  val rank: Double = js.native
  val strides: js.Array[Double] = js.native
  val useBias: Boolean = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "BaseConv")
@js.native
object BaseConv extends js.Object {
  /* protected */ def verifyArgs(args: BaseConvLayerArgs): Unit = js.native
}

