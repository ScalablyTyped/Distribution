package typings.atTensorflowTfjsDashCore.distKernelUnderscoreRegistryMod

import org.scalablytyped.runtime.StringDictionary
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GradConfig extends js.Object {
  @JSName("gradFunc")
  var gradFunc_Original: GradFunc = js.native
  var kernelName: String = js.native
  def gradFunc(dy: js.Array[Tensor[Rank]], saved: js.Array[Tensor[Rank]]): StringDictionary[js.Function0[Tensor[Rank]]] = js.native
  def gradFunc(dy: Tensor[Rank], saved: js.Array[Tensor[Rank]]): StringDictionary[js.Function0[Tensor[Rank]]] = js.native
}

