package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsMultinomialAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsMultinomialMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Multinomial", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def multinomial(args: AttrsMultinomialAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("multinomial")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Multinomial", "multinomialConfig")
  @js.native
  val multinomialConfig: KernelConfig = js.native
}
