package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsExpandDimsAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsExpandDimsMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/ExpandDims", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def expandDims(args: AttrsExpandDimsAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("expandDims")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/ExpandDims", "expandDimsConfig")
  @js.native
  val expandDimsConfig: KernelConfig = js.native
}
