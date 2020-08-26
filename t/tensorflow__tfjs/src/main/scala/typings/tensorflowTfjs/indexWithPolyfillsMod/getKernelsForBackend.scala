package typings.tensorflowTfjs.indexWithPolyfillsMod

import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "getKernelsForBackend")
@js.native
object getKernelsForBackend extends js.Object {
  def apply(backendName: String): js.Array[KernelConfig] = js.native
}

