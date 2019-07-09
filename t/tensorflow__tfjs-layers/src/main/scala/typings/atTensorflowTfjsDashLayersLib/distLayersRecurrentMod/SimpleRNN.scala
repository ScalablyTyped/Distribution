package typings
package atTensorflowTfjsDashLayersLib.distLayersRecurrentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "SimpleRNN")
@js.native
class SimpleRNN protected () extends RNN {
  def this(args: SimpleRNNLayerArgs) = this()
  val activation: atTensorflowTfjsDashLayersLib.distActivationsMod.Activation = js.native
  val biasConstraint: atTensorflowTfjsDashLayersLib.distConstraintsMod.Constraint = js.native
  val biasInitializer: atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer = js.native
  val biasRegularizer: atTensorflowTfjsDashLayersLib.distRegularizersMod.Regularizer = js.native
  val dropout: scala.Double = js.native
  val kernelConstraint: atTensorflowTfjsDashLayersLib.distConstraintsMod.Constraint = js.native
  val kernelInitializer: atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer = js.native
  val kernelRegularizer: atTensorflowTfjsDashLayersLib.distRegularizersMod.Regularizer = js.native
  val recurrentConstraint: atTensorflowTfjsDashLayersLib.distConstraintsMod.Constraint = js.native
  val recurrentDropout: scala.Double = js.native
  val recurrentInitializer: atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer = js.native
  val recurrentRegularizer: atTensorflowTfjsDashLayersLib.distRegularizersMod.Regularizer = js.native
  val units: scala.Double = js.native
  val useBias: scala.Boolean = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "SimpleRNN")
@js.native
object SimpleRNN extends js.Object {
  /** @nocollapse */
  var className: java.lang.String = js.native
  /** @nocollapse */
  def fromConfig[T /* <: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.serializationNs.Serializable */](
    cls: atTensorflowTfjsDashCoreLib.distSerializationMod.SerializableConstructor[T],
    config: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict
  ): T = js.native
}

