package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsReshapeAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reshapeMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Reshape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reshape(args: AttrsReshapeAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("reshape")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Reshape", "reshapeConfig")
  @js.native
  val reshapeConfig: KernelConfig = js.native
}
