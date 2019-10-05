package typings.atTensorflowTfjs.atTensorflowTfjsMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.serialization.Serializable
import typings.atTensorflowTfjsDashCore.distSerializationMod.ConfigDict
import typings.atTensorflowTfjsDashCore.distSerializationMod.SerializableConstructor
import typings.atTensorflowTfjsDashLayers.distLayersRecurrentMod.RNNLayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "RNN")
@js.native
class RNN protected ()
  extends typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersMod.RNN {
  def this(args: RNNLayerArgs) = this()
}

/* static members */
@JSImport("@tensorflow/tfjs", "RNN")
@js.native
object RNN extends js.Object {
  /** @nocollapse */
  var className: String = js.native
  /** @nocollapse */
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = js.native
}

