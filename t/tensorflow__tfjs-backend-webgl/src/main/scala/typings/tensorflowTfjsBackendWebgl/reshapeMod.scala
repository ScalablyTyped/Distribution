package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsReshapeAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reshapeMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Reshape", "reshape")
  @js.native
  def reshape(args: AttrsReshapeAttrs): TensorInfo = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Reshape", "reshapeConfig")
  @js.native
  val reshapeConfig: KernelConfig = js.native
}
