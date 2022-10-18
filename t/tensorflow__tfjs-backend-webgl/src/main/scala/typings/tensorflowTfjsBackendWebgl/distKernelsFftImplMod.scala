package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsFftImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/FFT_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fftImpl(x: TensorInfo, inverse: Boolean, backend: MathBackendWebGL): TensorInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("fftImpl")(x.asInstanceOf[js.Any], inverse.asInstanceOf[js.Any], backend.asInstanceOf[js.Any])).asInstanceOf[TensorInfo]
}
