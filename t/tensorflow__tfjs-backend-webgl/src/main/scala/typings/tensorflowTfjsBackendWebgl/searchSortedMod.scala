package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsSearchSortedAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchSortedMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/SearchSorted", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def searchSorted(args: AttrsSearchSortedAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("searchSorted")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/SearchSorted", "searchSortedConfig")
  @js.native
  val searchSortedConfig: KernelConfig = js.native
}
