package typings
package atTensorflowTfjsDashLayersLib.distLayersWrappersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/wrappers", "Wrapper")
@js.native
abstract class Wrapper protected ()
  extends atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer {
  def this(args: WrapperLayerArgs) = this()
  val layer: atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/wrappers", "Wrapper")
@js.native
object Wrapper extends js.Object {
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

