package typings.tensorflowTfjsCore.mod

import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core", "getKernelsForBackend")
@js.native
object getKernelsForBackend extends js.Object {
  
  def apply(backendName: String): js.Array[KernelConfig] = js.native
}
