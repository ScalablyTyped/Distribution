package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsLinSpaceAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsLinSpaceMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/LinSpace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def linSpace(args: AttrsLinSpaceAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("linSpace")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/LinSpace", "linSpaceConfig")
  @js.native
  val linSpaceConfig: KernelConfig = js.native
}
