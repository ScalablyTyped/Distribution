package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tensorFormatMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/tensor_format", "tensorToString")
  @js.native
  def tensorToString(vals: js.Array[String], shape: js.Array[Double], dtype: DataType, verbose: Boolean): String = js.native
  @JSImport("@tensorflow/tfjs-core/dist/tensor_format", "tensorToString")
  @js.native
  def tensorToString(vals: TypedArray, shape: js.Array[Double], dtype: DataType, verbose: Boolean): String = js.native
}
