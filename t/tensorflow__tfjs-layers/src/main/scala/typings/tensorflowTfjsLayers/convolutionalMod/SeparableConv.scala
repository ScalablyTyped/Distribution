package typings.tensorflowTfjsLayers.convolutionalMod

import typings.tensorflowTfjsLayers.constraintsMod.Constraint
import typings.tensorflowTfjsLayers.initializersMod.Initializer
import typings.tensorflowTfjsLayers.initializersMod.InitializerIdentifier
import typings.tensorflowTfjsLayers.regularizersMod.Regularizer
import typings.tensorflowTfjsLayers.variablesMod.LayerVariable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "SeparableConv")
@js.native
class SeparableConv protected () extends Conv {
  def this(rank: Double) = this()
  def this(rank: Double, config: SeparableConvLayerArgs) = this()
  val DEFAULT_DEPTHWISE_INITIALIZER: InitializerIdentifier = js.native
  val DEFAULT_POINTWISE_INITIALIZER: InitializerIdentifier = js.native
  val depthMultiplier: Double = js.native
  val depthwiseConstraint: js.UndefOr[Constraint] = js.native
  val depthwiseInitializer: js.UndefOr[Initializer] = js.native
  var depthwiseKernel: LayerVariable = js.native
  val depthwiseRegularizer: js.UndefOr[Regularizer] = js.native
  val pointwiseConstraint: js.UndefOr[Constraint] = js.native
  val pointwiseInitializer: js.UndefOr[Initializer] = js.native
  var pointwiseKernel: LayerVariable = js.native
  val pointwiseRegularizer: js.UndefOr[Regularizer] = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "SeparableConv")
@js.native
object SeparableConv extends js.Object {
  /** @nocollapse */
  var className: String = js.native
}

