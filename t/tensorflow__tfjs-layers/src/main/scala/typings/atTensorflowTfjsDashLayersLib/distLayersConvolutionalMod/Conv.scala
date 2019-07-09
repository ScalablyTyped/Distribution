package typings
package atTensorflowTfjsDashLayersLib.distLayersConvolutionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Conv")
@js.native
abstract class Conv protected () extends BaseConv {
  def this(rank: scala.Double, args: ConvLayerArgs) = this()
  val filters: scala.Double = js.native
  var kernel: atTensorflowTfjsDashLayersLib.distVariablesMod.LayerVariable = js.native
  val kernelConstraint: js.UndefOr[atTensorflowTfjsDashLayersLib.distConstraintsMod.Constraint] = js.native
  val kernelInitializer: js.UndefOr[atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer] = js.native
  val kernelRegularizer: js.UndefOr[atTensorflowTfjsDashLayersLib.distRegularizersMod.Regularizer] = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Conv")
@js.native
object Conv extends js.Object {
  /* protected */ def verifyArgs(args: atTensorflowTfjsDashLayersLib.distLayersConvolutionalMod.ConvLayerArgs): scala.Unit = js.native
}

