package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsFusedMatMulAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fusedMatMulMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/_FusedMatMul", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fusedMatMul(args: AttrsFusedMatMulAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("_fusedMatMul")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/_FusedMatMul", "_fusedMatMulConfig")
  @js.native
  val fusedMatMulConfig: KernelConfig = js.native
}
