package typings.tensorflowTfjsBackendCpu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringNGramsImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/StringNGrams_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringNGramsImpl(
    data: js.Array[js.typedarray.Uint8Array],
    dataSplits: js.typedarray.Int32Array,
    separator: String,
    nGramWidths: js.Array[Double],
    leftPad: String,
    rightPad: String,
    padWidth: Double,
    preserveShortSequences: Boolean
  ): js.Tuple2[js.Array[js.typedarray.Uint8Array], js.typedarray.Int32Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringNGramsImpl")(data.asInstanceOf[js.Any], dataSplits.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], nGramWidths.asInstanceOf[js.Any], leftPad.asInstanceOf[js.Any], rightPad.asInstanceOf[js.Any], padWidth.asInstanceOf[js.Any], preserveShortSequences.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[js.typedarray.Uint8Array], js.typedarray.Int32Array]]
}
