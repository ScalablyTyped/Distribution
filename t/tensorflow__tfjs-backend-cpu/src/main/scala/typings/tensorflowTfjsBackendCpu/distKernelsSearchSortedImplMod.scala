package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.tensorflowTfjsBackendCpuStrings.left
import typings.tensorflowTfjsBackendCpu.tensorflowTfjsBackendCpuStrings.right
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsSearchSortedImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/SearchSorted_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def searchSortedImpl(
    sortedInputs: TypedArray,
    values: TypedArray,
    batchSize: Double,
    numInputs: Double,
    numValues: Double,
    side: left | right
  ): TypedArray = (^.asInstanceOf[js.Dynamic].applyDynamic("searchSortedImpl")(sortedInputs.asInstanceOf[js.Any], values.asInstanceOf[js.Any], batchSize.asInstanceOf[js.Any], numInputs.asInstanceOf[js.Any], numValues.asInstanceOf[js.Any], side.asInstanceOf[js.Any])).asInstanceOf[TypedArray]
}
