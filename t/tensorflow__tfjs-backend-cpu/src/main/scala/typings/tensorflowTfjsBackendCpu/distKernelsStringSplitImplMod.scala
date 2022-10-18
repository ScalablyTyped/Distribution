package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsStringSplitImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/StringSplit_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringSplitImpl(input: js.Array[js.typedarray.Uint8Array], delimiter: js.typedarray.Uint8Array, skipEmpty: Boolean): js.Tuple3[TypedArray, js.Array[js.typedarray.Uint8Array], js.Tuple2[Double, Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringSplitImpl")(input.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any], skipEmpty.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[TypedArray, js.Array[js.typedarray.Uint8Array], js.Tuple2[Double, Double]]]
}
