package typings.atTensorflowTfjsDashLayers.distInitializersMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.serializationNs.Serializable
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/initializers", "Initializer")
@js.native
abstract class Initializer () extends Serializable {
  /**
    * Generate an initial value.
    * @param shape
    * @param dtype
    * @return The init value.
    */
  @JSName("apply")
  def apply(shape: Shape): Tensor[Rank] = js.native
  @JSName("apply")
  def apply(shape: Shape, dtype: DataType): Tensor[Rank] = js.native
  def fromConfigUsesCustomObjects(): Boolean = js.native
}

