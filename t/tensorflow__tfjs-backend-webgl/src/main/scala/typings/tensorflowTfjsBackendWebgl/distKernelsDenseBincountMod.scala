package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsDenseBincountAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsDenseBincountMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/DenseBincount", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def denseBincount(args: AttrsDenseBincountAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("denseBincount")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/DenseBincount", "denseBincountConfig")
  @js.native
  val denseBincountConfig: KernelConfig = js.native
}
