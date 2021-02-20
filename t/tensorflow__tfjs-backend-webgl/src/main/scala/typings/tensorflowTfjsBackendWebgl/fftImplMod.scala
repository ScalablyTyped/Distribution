package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fftImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/FFT_impl", "fftImpl")
  @js.native
  def fftImpl(x: TensorInfo, inverse: Boolean, backend: MathBackendWebGL): TensorInfo = js.native
}
