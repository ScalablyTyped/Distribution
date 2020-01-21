package typings.tensorflowTfjsNode.mod

import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "getKernelsForBackend")
@js.native
object getKernelsForBackend extends js.Object {
  def apply(backendName: String): js.Array[KernelConfig] = js.native
}

