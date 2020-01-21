package typings.tensorflowTfjsLayers.convolutionalMod

import typings.tensorflowTfjsLayers.constraintsMod.Constraint
import typings.tensorflowTfjsLayers.initializersMod.Initializer
import typings.tensorflowTfjsLayers.regularizersMod.Regularizer
import typings.tensorflowTfjsLayers.variablesMod.LayerVariable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Conv")
@js.native
abstract class Conv protected () extends BaseConv {
  def this(rank: Double, args: ConvLayerArgs) = this()
  val filters: Double = js.native
  var kernel: LayerVariable = js.native
  val kernelConstraint: js.UndefOr[Constraint] = js.native
  val kernelInitializer: js.UndefOr[Initializer] = js.native
  val kernelRegularizer: js.UndefOr[Regularizer] = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Conv")
@js.native
object Conv extends js.Object {
  /* protected */ def verifyArgs(args: ConvLayerArgs): Unit = js.native
}

