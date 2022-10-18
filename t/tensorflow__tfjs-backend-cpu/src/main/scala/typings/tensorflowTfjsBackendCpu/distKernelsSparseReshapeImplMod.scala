package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsSparseReshapeImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/SparseReshape_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sparseReshapeImpl(
    inputIndices: TypedArray,
    inputIndicesShape: js.Array[Double],
    inputDType: DataType,
    inputShape: js.Array[Double],
    targetShape: js.Array[Double]
  ): js.Tuple3[TypedArray, js.Array[Double], js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseReshapeImpl")(inputIndices.asInstanceOf[js.Any], inputIndicesShape.asInstanceOf[js.Any], inputDType.asInstanceOf[js.Any], inputShape.asInstanceOf[js.Any], targetShape.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[TypedArray, js.Array[Double], js.Array[Double]]]
}
