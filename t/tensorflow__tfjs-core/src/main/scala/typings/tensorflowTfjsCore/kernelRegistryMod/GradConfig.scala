package typings.tensorflowTfjsCore.kernelRegistryMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tapeMod.NamedGradientMap
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GradConfig extends js.Object {
  @JSName("gradFunc")
  var gradFunc_Original: GradFunc = js.native
  var inputsToSave: js.UndefOr[js.Array[String]] = js.native
  var kernelName: String = js.native
  var outputsToSave: js.UndefOr[js.Array[Boolean]] = js.native
  var saveAllInputs: js.UndefOr[Boolean] = js.native
  def gradFunc(dy: js.Array[Tensor[Rank]], saved: js.Array[Tensor[Rank]], attrs: NamedAttrMap): NamedGradientMap = js.native
  def gradFunc(dy: Tensor[Rank], saved: js.Array[Tensor[Rank]], attrs: NamedAttrMap): NamedGradientMap = js.native
}

