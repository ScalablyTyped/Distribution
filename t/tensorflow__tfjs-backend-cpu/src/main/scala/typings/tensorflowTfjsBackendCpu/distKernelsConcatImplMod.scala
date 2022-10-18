package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.Shape
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsConcatImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Concat_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def concatImpl(inputs: js.Array[Shape], outShape: js.Array[Double], dtype: DataType, simplyConcat: Boolean): TypedArray | js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatImpl")(inputs.asInstanceOf[js.Any], outShape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], simplyConcat.asInstanceOf[js.Any])).asInstanceOf[TypedArray | js.Array[String]]
}
