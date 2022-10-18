package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTensorFormatMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/tensor_format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tensorToString(vals: js.Array[String], shape: js.Array[Double], dtype: DataType, verbose: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("tensorToString")(vals.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def tensorToString(vals: TypedArray, shape: js.Array[Double], dtype: DataType, verbose: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("tensorToString")(vals.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any])).asInstanceOf[String]
}
