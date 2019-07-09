package typings
package atTensorflowTfjsDashLayersLib.distInitializersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/initializers", "Initializer")
@js.native
abstract class Initializer ()
  extends atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.serializationNs.Serializable {
  /**
    * Generate an initial value.
    * @param shape
    * @param dtype
    * @return The init value.
    */
  @JSName("apply")
  def apply(shape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape): atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  @JSName("apply")
  def apply(
    shape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def fromConfigUsesCustomObjects(): scala.Boolean = js.native
}

