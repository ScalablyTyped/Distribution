package typings
package atTensorflowTfjsDashLayersLib.distRegularizersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/regularizers", "Regularizer")
@js.native
abstract class Regularizer ()
  extends atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.serializationNs.Serializable {
  @JSName("apply")
  def apply(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Scalar = js.native
}

