package typings.tensorflowTfjsLayers.initializersMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.Tensor_
import typings.tensorflowTfjsCore.mod.serialization.Serializable
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
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
  def apply(shape: Shape): Tensor_[Rank] = js.native
  @JSName("apply")
  def apply(shape: Shape, dtype: DataType): Tensor_[Rank] = js.native
  def fromConfigUsesCustomObjects(): Boolean = js.native
}

