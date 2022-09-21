package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsBatchMatMulAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object batchMatMulMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/BatchMatMul", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def batchMatMul(args: AttrsBatchMatMulAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("batchMatMul")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/BatchMatMul", "batchMatMulConfig")
  @js.native
  val batchMatMulConfig: KernelConfig = js.native
}
