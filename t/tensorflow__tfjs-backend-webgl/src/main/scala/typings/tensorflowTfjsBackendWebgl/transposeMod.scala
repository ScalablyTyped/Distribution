package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsTransposeAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transposeMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Transpose", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transpose(args: AttrsTransposeAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("transpose")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Transpose", "transposeConfig")
  @js.native
  val transposeConfig: KernelConfig = js.native
}
