package typings.tensorflowTfjsBackendWasm

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unaryKernelMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/unary_kernel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createUnaryKernelConfig(kernelName: String): KernelConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnaryKernelConfig")(kernelName.asInstanceOf[js.Any]).asInstanceOf[KernelConfig]
  inline def createUnaryKernelConfig(kernelName: String, outType: DataType): KernelConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("createUnaryKernelConfig")(kernelName.asInstanceOf[js.Any], outType.asInstanceOf[js.Any])).asInstanceOf[KernelConfig]
}
