package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsSearchSortedAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsSearchSortedMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/SearchSorted", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def searchSorted(args: AttrsSearchSortedAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("searchSorted")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/SearchSorted", "searchSortedConfig")
  @js.native
  val searchSortedConfig: KernelConfig = js.native
}
