package typings.tensorflowTfjsCore.opsForConverterMod

import typings.std.Uint8Array
import typings.tensorflowTfjsCore.distTensorMod.Scalar
import typings.tensorflowTfjsCore.distTypesMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "scalar")
@js.native
object scalar extends js.Object {
  
  def apply(value: String): Scalar = js.native
  def apply(value: String, dtype: DataType): Scalar = js.native
  def apply(value: Boolean): Scalar = js.native
  def apply(value: Boolean, dtype: DataType): Scalar = js.native
  def apply(value: Double): Scalar = js.native
  def apply(value: Double, dtype: DataType): Scalar = js.native
  def apply(value: Uint8Array): Scalar = js.native
  def apply(value: Uint8Array, dtype: DataType): Scalar = js.native
}
