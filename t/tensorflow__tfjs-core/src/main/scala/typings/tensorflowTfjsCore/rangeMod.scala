package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/range", JSImport.Namespace)
@js.native
object rangeMod extends js.Object {
  
  def range(start: Double, stop: Double): Tensor1D = js.native
  def range(start: Double, stop: Double, step: Double): Tensor1D = js.native
  @JSName("range")
  def range_float32(start: Double, stop: Double, step: js.UndefOr[scala.Nothing], dtype: float32): Tensor1D = js.native
  @JSName("range")
  def range_float32(start: Double, stop: Double, step: Double, dtype: float32): Tensor1D = js.native
  @JSName("range")
  def range_int32(start: Double, stop: Double, step: js.UndefOr[scala.Nothing], dtype: int32): Tensor1D = js.native
  @JSName("range")
  def range_int32(start: Double, stop: Double, step: Double, dtype: int32): Tensor1D = js.native
}
