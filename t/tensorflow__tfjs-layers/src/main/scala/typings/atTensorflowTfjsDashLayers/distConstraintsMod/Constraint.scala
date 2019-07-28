package typings.atTensorflowTfjsDashLayers.distConstraintsMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.serializationNs.Serializable
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/constraints", "Constraint")
@js.native
abstract class Constraint () extends Serializable {
  @JSName("apply")
  def apply(w: Tensor[Rank]): Tensor[Rank] = js.native
}

