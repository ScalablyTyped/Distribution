package typings.tensorflowTfjsBackendWasm

import typings.tensorflowTfjsBackendCpu.anon.Shape
import typings.tensorflowTfjsBackendWasm.tensorflowTfjsBackendWasmStrings.float32
import typings.tensorflowTfjsBackendWasm.tensorflowTfjsBackendWasmStrings.int32
import typings.tensorflowTfjsCore.distTypesMod.BackendValues
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharedMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernel_utils/shared", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def concatImplCPU(inputs: js.Array[Shape], outShape: js.Array[Double], dtype: DataType, simplyConcat: Boolean): TypedArray | js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatImplCPU")(inputs.asInstanceOf[js.Any], outShape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], simplyConcat.asInstanceOf[js.Any])).asInstanceOf[TypedArray | js.Array[String]]
  
  inline def rangeImplCPU(start: Double, stop: Double, step: Double, dtype: float32 | int32): js.typedarray.Float32Array | js.typedarray.Int32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("rangeImplCPU")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array | js.typedarray.Int32Array]
  
  inline def sliceImplCPU(
    vals: BackendValues,
    begin: js.Array[Double],
    size: js.Array[Double],
    shape: js.Array[Double],
    dtype: DataType
  ): BackendValues = (^.asInstanceOf[js.Dynamic].applyDynamic("sliceImplCPU")(vals.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], size.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[BackendValues]
  
  inline def stringNGramsImplCPU(
    data: js.Array[js.typedarray.Uint8Array],
    dataSplits: js.typedarray.Int32Array,
    separator: String,
    nGramWidths: js.Array[Double],
    leftPad: String,
    rightPad: String,
    padWidth: Double,
    preserveShortSequences: Boolean
  ): js.Tuple2[js.Array[js.typedarray.Uint8Array], js.typedarray.Int32Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringNGramsImplCPU")(data.asInstanceOf[js.Any], dataSplits.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], nGramWidths.asInstanceOf[js.Any], leftPad.asInstanceOf[js.Any], rightPad.asInstanceOf[js.Any], padWidth.asInstanceOf[js.Any], preserveShortSequences.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[js.typedarray.Uint8Array], js.typedarray.Int32Array]]
  
  inline def stringSplitImplCPU(input: js.Array[js.typedarray.Uint8Array], delimiter: js.typedarray.Uint8Array, skipEmpty: Boolean): js.Tuple3[TypedArray, js.Array[js.typedarray.Uint8Array], js.Tuple2[Double, Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringSplitImplCPU")(input.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any], skipEmpty.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[TypedArray, js.Array[js.typedarray.Uint8Array], js.Tuple2[Double, Double]]]
  
  inline def stringToHashBucketFastImplCPU(input: js.Array[js.typedarray.Uint8Array], numBuckets: Double): TypedArray = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToHashBucketFastImplCPU")(input.asInstanceOf[js.Any], numBuckets.asInstanceOf[js.Any])).asInstanceOf[TypedArray]
}
