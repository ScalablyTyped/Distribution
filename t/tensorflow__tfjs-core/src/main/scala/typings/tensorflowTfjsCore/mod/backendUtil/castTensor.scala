package typings.tensorflowTfjsCore.mod.backendUtil

import typings.tensorflowTfjsCore.backendMod.KernelBackend
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "backend_util.castTensor")
@js.native
object castTensor extends js.Object {
  def apply[T /* <: Tensor[Rank] */](x: T, dtype: DataType, backend: KernelBackend): T = js.native
}

