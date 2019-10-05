package typings.atTensorflowTfjsDashLayers.distLayersRecurrentMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.serialization.Serializable
import typings.atTensorflowTfjsDashCore.distSerializationMod.ConfigDict
import typings.atTensorflowTfjsDashCore.distSerializationMod.SerializableConstructor
import typings.atTensorflowTfjsDashLayers.distActivationsMod.Activation
import typings.atTensorflowTfjsDashLayers.distConstraintsMod.Constraint
import typings.atTensorflowTfjsDashLayers.distInitializersMod.Initializer
import typings.atTensorflowTfjsDashLayers.distRegularizersMod.Regularizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "GRU")
@js.native
class GRU protected () extends RNN {
  def this(args: GRULayerArgs) = this()
  val activation: Activation = js.native
  val biasConstraint: Constraint = js.native
  val biasInitializer: Initializer = js.native
  val biasRegularizer: Regularizer = js.native
  val dropout: Double = js.native
  val implementation: Double = js.native
  val kernelConstraint: Constraint = js.native
  val kernelInitializer: Initializer = js.native
  val kernelRegularizer: Regularizer = js.native
  val recurrentActivation: Activation = js.native
  val recurrentConstraint: Constraint = js.native
  val recurrentDropout: Double = js.native
  val recurrentInitializer: Initializer = js.native
  val recurrentRegularizer: Regularizer = js.native
  val units: Double = js.native
  val useBias: Boolean = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "GRU")
@js.native
object GRU extends js.Object {
  /** @nocollapse */
  var className: String = js.native
  /** @nocollapse */
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
}

