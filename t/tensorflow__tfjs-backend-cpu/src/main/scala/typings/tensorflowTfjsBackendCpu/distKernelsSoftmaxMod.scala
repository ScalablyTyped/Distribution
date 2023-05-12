package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsSoftmaxAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsSoftmaxMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Softmax", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def softmax(args: AttrsSoftmaxAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("softmax")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Softmax", "softmaxConfig")
  @js.native
  val softmaxConfig: KernelConfig = js.native
}
