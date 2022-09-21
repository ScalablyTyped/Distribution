package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.Backend
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object absMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Abs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def abs(args: Backend): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("abs")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Abs", "absConfig")
  @js.native
  val absConfig: KernelConfig = js.native
}
