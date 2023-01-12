package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.anon.Error
import typings.tensorflowTfjsCore.distBackendsBackendMod.BackendTimer
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorTypesMod.NamedTensorMap
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distProfilerMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/profiler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/profiler", "Logger")
  @js.native
  open class Logger () extends StObject {
    
    def logKernelProfile(name: String, result: Tensor[Rank], vals: TypedArray, timeMs: Double, inputs: NamedTensorMap): Unit = js.native
    def logKernelProfile(
      name: String,
      result: Tensor[Rank],
      vals: TypedArray,
      timeMs: Double,
      inputs: NamedTensorMap,
      extraInfo: String
    ): Unit = js.native
    def logKernelProfile(name: String, result: Tensor[Rank], vals: TypedArray, timeMs: Error, inputs: NamedTensorMap): Unit = js.native
    def logKernelProfile(
      name: String,
      result: Tensor[Rank],
      vals: TypedArray,
      timeMs: Error,
      inputs: NamedTensorMap,
      extraInfo: String
    ): Unit = js.native
  }
  
  @JSImport("@tensorflow/tfjs-core/dist/profiler", "Profiler")
  @js.native
  open class Profiler protected () extends StObject {
    def this(backendTimer: BackendTimer) = this()
    def this(backendTimer: BackendTimer, logger: Logger) = this()
    
    /* private */ var backendTimer: Any = js.native
    
    def logKernelProfile(kernelProfile: KernelProfile): Unit = js.native
    
    /* private */ var logger: Any = js.native
    
    def profileKernel(kernelName: String, inputs: NamedTensorMap, f: js.Function0[js.Array[Tensor[Rank]]]): KernelProfile = js.native
  }
  
  inline def checkComputationForErrors_bool(vals: js.typedarray.Uint8Array, dtype: bool, kernelName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkComputationForErrors")(vals.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], kernelName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def checkComputationForErrors_complex64(vals: js.typedarray.Float32Array, dtype: complex64, kernelName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkComputationForErrors")(vals.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], kernelName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def checkComputationForErrors_float32(vals: js.typedarray.Float32Array, dtype: float32, kernelName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkComputationForErrors")(vals.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], kernelName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def checkComputationForErrors_int32(vals: js.typedarray.Int32Array, dtype: int32, kernelName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkComputationForErrors")(vals.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], kernelName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def checkComputationForErrors_string(vals: js.Array[String], dtype: string, kernelName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkComputationForErrors")(vals.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], kernelName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait KernelProfile extends StObject {
    
    var extraInfo: js.Promise[String]
    
    var inputs: NamedTensorMap
    
    var kernelName: String
    
    var outputs: js.Array[Tensor[Rank]]
    
    var timeMs: js.Promise[Double | Error]
  }
  object KernelProfile {
    
    inline def apply(
      extraInfo: js.Promise[String],
      inputs: NamedTensorMap,
      kernelName: String,
      outputs: js.Array[Tensor[Rank]],
      timeMs: js.Promise[Double | Error]
    ): KernelProfile = {
      val __obj = js.Dynamic.literal(extraInfo = extraInfo.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], kernelName = kernelName.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], timeMs = timeMs.asInstanceOf[js.Any])
      __obj.asInstanceOf[KernelProfile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KernelProfile] (val x: Self) extends AnyVal {
      
      inline def setExtraInfo(value: js.Promise[String]): Self = StObject.set(x, "extraInfo", value.asInstanceOf[js.Any])
      
      inline def setInputs(value: NamedTensorMap): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setKernelName(value: String): Self = StObject.set(x, "kernelName", value.asInstanceOf[js.Any])
      
      inline def setOutputs(value: js.Array[Tensor[Rank]]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      inline def setOutputsVarargs(value: Tensor[Rank]*): Self = StObject.set(x, "outputs", js.Array(value*))
      
      inline def setTimeMs(value: js.Promise[Double | Error]): Self = StObject.set(x, "timeMs", value.asInstanceOf[js.Any])
    }
  }
}
