package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/range", "range")
  @js.native
  def range(start: Double, stop: Double): Tensor1D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/range", "range")
  @js.native
  def range(start: Double, stop: Double, step: Double): Tensor1D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/range", "range")
  @js.native
  def range_float32(start: Double, stop: Double, step: js.UndefOr[scala.Nothing], dtype: float32): Tensor1D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/range", "range")
  @js.native
  def range_float32(start: Double, stop: Double, step: Double, dtype: float32): Tensor1D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/range", "range")
  @js.native
  def range_int32(start: Double, stop: Double, step: js.UndefOr[scala.Nothing], dtype: int32): Tensor1D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/range", "range")
  @js.native
  def range_int32(start: Double, stop: Double, step: Double, dtype: int32): Tensor1D = js.native
}
