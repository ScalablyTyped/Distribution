package typings.tensorflowTfjsCore.backendUtilMod

import typings.tensorflowTfjsCore.distTypesMod.Rank.R1
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/backend_util", "linspaceImpl")
@js.native
object linspaceImpl extends js.Object {
  def apply(start: Double, stop: Double, num: Double): Tensor[R1] = js.native
}

