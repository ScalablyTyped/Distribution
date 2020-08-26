package typings.tensorflowTfjsCore.mod

import typings.tensorflowTfjsCore.tensorMod.Tensor1D
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "range")
@js.native
object range_float32 extends js.Object {
  def apply(start: Double, stop: Double, step: js.UndefOr[scala.Nothing], dtype: float32): Tensor1D = js.native
  def apply(start: Double, stop: Double, step: Double, dtype: float32): Tensor1D = js.native
}

