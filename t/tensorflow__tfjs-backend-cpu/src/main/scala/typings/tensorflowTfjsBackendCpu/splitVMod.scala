package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsSplitVAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splitVMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/SplitV", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def splitV(args: AttrsSplitVAttrs): js.Array[TensorInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitV")(args.asInstanceOf[js.Any]).asInstanceOf[js.Array[TensorInfo]]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/SplitV", "splitVConfig")
  @js.native
  val splitVConfig: KernelConfig = js.native
}
