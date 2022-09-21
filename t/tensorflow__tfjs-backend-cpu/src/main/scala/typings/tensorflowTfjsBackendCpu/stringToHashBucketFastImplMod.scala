package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringToHashBucketFastImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/StringToHashBucketFast_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringToHashBucketFastImpl(input: js.Array[js.typedarray.Uint8Array], numBuckets: Double): TypedArray = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToHashBucketFastImpl")(input.asInstanceOf[js.Any], numBuckets.asInstanceOf[js.Any])).asInstanceOf[TypedArray]
}
