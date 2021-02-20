package typings.tensorflowTfjsCore

import typings.std.Float32Array
import typings.std.Int32Array
import typings.std.Uint8Array
import typings.tensorflowTfjsCore.anon.Error
import typings.tensorflowTfjsCore.backendMod.BackendTimer
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object profilerMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/profiler", "Logger")
  @js.native
  class Logger () extends StObject {
    
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
  class Profiler protected () extends StObject {
    def this(backendTimer: BackendTimer) = this()
    def this(backendTimer: BackendTimer, logger: Logger) = this()
    
    var backendTimer: js.Any = js.native
    
    def logKernelProfile(kernelProfile: KernelProfile): Unit = js.native
    
    var logger: js.Any = js.native
    
    def profileKernel(kernelName: String, inputs: NamedTensorMap, f: js.Function0[js.Array[Tensor[Rank]]]): KernelProfile = js.native
  }
  
  @JSImport("@tensorflow/tfjs-core/dist/profiler", "checkComputationForErrors")
  @js.native
  def checkComputationForErrors_bool(vals: Uint8Array, dtype: bool, kernelName: String): Boolean = js.native
  @JSImport("@tensorflow/tfjs-core/dist/profiler", "checkComputationForErrors")
  @js.native
  def checkComputationForErrors_complex64(vals: Float32Array, dtype: complex64, kernelName: String): Boolean = js.native
  @JSImport("@tensorflow/tfjs-core/dist/profiler", "checkComputationForErrors")
  @js.native
  def checkComputationForErrors_float32(vals: Float32Array, dtype: float32, kernelName: String): Boolean = js.native
  @JSImport("@tensorflow/tfjs-core/dist/profiler", "checkComputationForErrors")
  @js.native
  def checkComputationForErrors_int32(vals: Int32Array, dtype: int32, kernelName: String): Boolean = js.native
  @JSImport("@tensorflow/tfjs-core/dist/profiler", "checkComputationForErrors")
  @js.native
  def checkComputationForErrors_string(vals: js.Array[String], dtype: string, kernelName: String): Boolean = js.native
  
  @js.native
  trait KernelProfile extends StObject {
    
    var extraInfo: js.Promise[String] = js.native
    
    var inputs: NamedTensorMap = js.native
    
    var kernelName: String = js.native
    
    var outputs: js.Array[Tensor[Rank]] = js.native
    
    var timeMs: js.Promise[Double | Error] = js.native
  }
  object KernelProfile {
    
    @scala.inline
    def apply(
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
    implicit class KernelProfileMutableBuilder[Self <: KernelProfile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtraInfo(value: js.Promise[String]): Self = StObject.set(x, "extraInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputs(value: NamedTensorMap): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernelName(value: String): Self = StObject.set(x, "kernelName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputs(value: js.Array[Tensor[Rank]]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputsVarargs(value: Tensor[Rank]*): Self = StObject.set(x, "outputs", js.Array(value :_*))
      
      @scala.inline
      def setTimeMs(value: js.Promise[Double | Error]): Self = StObject.set(x, "timeMs", value.asInstanceOf[js.Any])
    }
  }
}
