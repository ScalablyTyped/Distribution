package typings.atTensorflowTfjs.atTensorflowTfjsMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.serialization.Serializable
import typings.atTensorflowTfjsDashCore.distSerializationMod.ConfigDict
import typings.atTensorflowTfjsDashCore.distSerializationMod.SerializableConstructor
import typings.atTensorflowTfjsDashLayers.distModelsMod.SequentialArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "Sequential")
@js.native
class Sequential ()
  extends typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersMod.Sequential {
  def this(args: SequentialArgs) = this()
}

/* static members */
@JSImport("@tensorflow/tfjs", "Sequential")
@js.native
object Sequential extends js.Object {
  /** @nocollapse */
  var className: String = js.native
  /** @nocollapse */
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = js.native
  def fromConfig[T /* <: Serializable */](
    cls: SerializableConstructor[T],
    config: ConfigDict,
    customObjects: ConfigDict,
    fastWeightInit: Boolean
  ): T = js.native
}

@JSImport("@tensorflow/tfjs", "sequential")
@js.native
object sequential extends js.Object {
  def apply(): typings.atTensorflowTfjsDashLayers.distModelsMod.Sequential = js.native
  def apply(config: SequentialArgs): typings.atTensorflowTfjsDashLayers.distModelsMod.Sequential = js.native
}

