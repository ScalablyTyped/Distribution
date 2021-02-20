package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maxImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Max_impl", "maxImpl")
  @js.native
  def maxImpl(
    x: TensorInfo,
    reduceShape: js.Array[Double],
    outShape: js.Array[Double],
    backend: MathBackendWebGL
  ): TensorInfo = js.native
}
