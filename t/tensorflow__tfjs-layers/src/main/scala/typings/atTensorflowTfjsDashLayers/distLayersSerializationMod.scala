package typings.atTensorflowTfjsDashLayers

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.serialization.Serializable
import typings.atTensorflowTfjsDashCore.distSerializationMod.ConfigDict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/serialization", JSImport.Namespace)
@js.native
object distLayersSerializationMod extends js.Object {
  def deserialize(config: ConfigDict): Serializable = js.native
  def deserialize(config: ConfigDict, customObjects: ConfigDict): Serializable = js.native
  def deserialize(config: ConfigDict, customObjects: ConfigDict, fastWeightInit: Boolean): Serializable = js.native
}

