package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsRaggedGatherImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/RaggedGather_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def raggedGatherImpl(
    paramsNestedSplits: js.Array[TypedArray],
    paramsNestedSplitsShapes: js.Array[js.Array[Double]],
    paramsDenseValues: TypedArray,
    paramsDenseValuesShape: js.Array[Double],
    paramsDenseValuesDType: DataType,
    indices: TypedArray,
    indicesShape: js.Array[Double],
    outputRaggedRank: Double
  ): js.Tuple3[js.Array[TypedArray], TypedArray, js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("raggedGatherImpl")(paramsNestedSplits.asInstanceOf[js.Any], paramsNestedSplitsShapes.asInstanceOf[js.Any], paramsDenseValues.asInstanceOf[js.Any], paramsDenseValuesShape.asInstanceOf[js.Any], paramsDenseValuesDType.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], indicesShape.asInstanceOf[js.Any], outputRaggedRank.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[js.Array[TypedArray], TypedArray, js.Array[Double]]]
}
