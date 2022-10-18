package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsRaggedRangeImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/RaggedRange_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def raggedRangeImpl(
    starts: TypedArray,
    startsShape: js.Array[Double],
    startsDType: DataType,
    limits: TypedArray,
    limitsShape: js.Array[Double],
    deltas: TypedArray,
    deltasShape: js.Array[Double]
  ): js.Tuple2[TypedArray, TypedArray] = (^.asInstanceOf[js.Dynamic].applyDynamic("raggedRangeImpl")(starts.asInstanceOf[js.Any], startsShape.asInstanceOf[js.Any], startsDType.asInstanceOf[js.Any], limits.asInstanceOf[js.Any], limitsShape.asInstanceOf[js.Any], deltas.asInstanceOf[js.Any], deltasShape.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[TypedArray, TypedArray]]
}
