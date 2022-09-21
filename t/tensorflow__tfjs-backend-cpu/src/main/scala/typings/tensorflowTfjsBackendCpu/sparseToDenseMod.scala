package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsSparseToDenseAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sparseToDenseMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/SparseToDense", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sparseToDense(args: AttrsSparseToDenseAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/SparseToDense", "sparseToDenseConfig")
  @js.native
  val sparseToDenseConfig: KernelConfig = js.native
}
