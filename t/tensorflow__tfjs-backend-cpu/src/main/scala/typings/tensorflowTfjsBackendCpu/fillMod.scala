package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsFillAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fillMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Fill", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fill(args: AttrsFillAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fill")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Fill", "fillConfig")
  @js.native
  val fillConfig: KernelConfig = js.native
}
