package typings.tensorflowTfjsBackendWasm

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object binaryKernelMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/binary_kernel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBinaryKernelConfig(kernelName: String, supportsFullBroadcast: Boolean): KernelConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("createBinaryKernelConfig")(kernelName.asInstanceOf[js.Any], supportsFullBroadcast.asInstanceOf[js.Any])).asInstanceOf[KernelConfig]
  inline def createBinaryKernelConfig(kernelName: String, supportsFullBroadcast: Boolean, dtype: DataType): KernelConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("createBinaryKernelConfig")(kernelName.asInstanceOf[js.Any], supportsFullBroadcast.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[KernelConfig]
}
