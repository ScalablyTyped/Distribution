package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelNamesMod.ConcatInputs
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concatImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Concat_impl", "concatImpl")
  @js.native
  def concatImpl(inputs: ConcatInputs, axis: Double, backend: MathBackendWebGL): TensorInfo = js.native
}
