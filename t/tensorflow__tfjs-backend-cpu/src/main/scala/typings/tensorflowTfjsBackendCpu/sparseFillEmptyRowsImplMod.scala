package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sparseFillEmptyRowsImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/SparseFillEmptyRows_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sparseFillEmptyRowsImpl(
    indices: TypedArray,
    indicesShape: js.Array[Double],
    indicesDType: DataType,
    values: TypedArray,
    valuesDType: DataType,
    denseShape: TypedArray,
    defaultValue: Double
  ): js.Tuple5[TypedArray, js.Array[Double], TypedArray, js.Array[Boolean], js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseFillEmptyRowsImpl")(indices.asInstanceOf[js.Any], indicesShape.asInstanceOf[js.Any], indicesDType.asInstanceOf[js.Any], values.asInstanceOf[js.Any], valuesDType.asInstanceOf[js.Any], denseShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple5[TypedArray, js.Array[Double], TypedArray, js.Array[Boolean], js.Array[Double]]]
}
