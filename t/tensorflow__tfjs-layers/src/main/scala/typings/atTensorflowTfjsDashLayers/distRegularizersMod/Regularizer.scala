package typings.atTensorflowTfjsDashLayers.distRegularizersMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.serializationNs.Serializable
import typings.atTensorflowTfjsDashCore.distTensorMod.Scalar
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/regularizers", "Regularizer")
@js.native
abstract class Regularizer () extends Serializable {
  @JSName("apply")
  def apply(x: Tensor[Rank]): Scalar = js.native
}

