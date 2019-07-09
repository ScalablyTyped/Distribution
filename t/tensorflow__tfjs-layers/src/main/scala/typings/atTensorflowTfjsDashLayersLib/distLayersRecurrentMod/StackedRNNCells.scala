package typings
package atTensorflowTfjsDashLayersLib.distLayersRecurrentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "StackedRNNCells")
@js.native
class StackedRNNCells protected () extends RNNCell {
  def this(args: StackedRNNCellsArgs) = this()
  var cells: js.Array[RNNCell] = js.native
  @JSName("stateSize")
  val stateSize_StackedRNNCells: js.Array[scala.Double] = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "StackedRNNCells")
@js.native
object StackedRNNCells extends js.Object {
  /** @nocollapse */
  var className: java.lang.String = js.native
  /** @nocollapse */
  def fromConfig[T /* <: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.serializationNs.Serializable */](
    cls: atTensorflowTfjsDashCoreLib.distSerializationMod.SerializableConstructor[T],
    config: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict
  ): T = js.native
  def fromConfig[T /* <: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.serializationNs.Serializable */](
    cls: atTensorflowTfjsDashCoreLib.distSerializationMod.SerializableConstructor[T],
    config: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict,
    customObjects: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict
  ): T = js.native
}

