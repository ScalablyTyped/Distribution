package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsRangeAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Range", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def range(args: AttrsRangeAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("range")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Range", "rangeConfig")
  @js.native
  val rangeConfig: KernelConfig = js.native
}
