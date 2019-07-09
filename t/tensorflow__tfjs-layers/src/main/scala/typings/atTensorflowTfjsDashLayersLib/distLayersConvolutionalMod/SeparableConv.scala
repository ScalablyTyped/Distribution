package typings
package atTensorflowTfjsDashLayersLib.distLayersConvolutionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "SeparableConv")
@js.native
class SeparableConv protected () extends Conv {
  def this(rank: scala.Double) = this()
  def this(rank: scala.Double, config: SeparableConvLayerArgs) = this()
  val DEFAULT_DEPTHWISE_INITIALIZER: atTensorflowTfjsDashLayersLib.distInitializersMod.InitializerIdentifier = js.native
  val DEFAULT_POINTWISE_INITIALIZER: atTensorflowTfjsDashLayersLib.distInitializersMod.InitializerIdentifier = js.native
  val depthMultiplier: scala.Double = js.native
  val depthwiseConstraint: js.UndefOr[atTensorflowTfjsDashLayersLib.distConstraintsMod.Constraint] = js.native
  val depthwiseInitializer: js.UndefOr[atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer] = js.native
  var depthwiseKernel: atTensorflowTfjsDashLayersLib.distVariablesMod.LayerVariable = js.native
  val depthwiseRegularizer: js.UndefOr[atTensorflowTfjsDashLayersLib.distRegularizersMod.Regularizer] = js.native
  val pointwiseConstraint: js.UndefOr[atTensorflowTfjsDashLayersLib.distConstraintsMod.Constraint] = js.native
  val pointwiseInitializer: js.UndefOr[atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer] = js.native
  var pointwiseKernel: atTensorflowTfjsDashLayersLib.distVariablesMod.LayerVariable = js.native
  val pointwiseRegularizer: js.UndefOr[atTensorflowTfjsDashLayersLib.distRegularizersMod.Regularizer] = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "SeparableConv")
@js.native
object SeparableConv extends js.Object {
  /** @nocollapse */
  var className: java.lang.String = js.native
}

