package typings.tensorflowTfjsCore.baseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/base", "findBackendFactory")
@js.native
object findBackendFactory extends js.Object {
  
  def apply(name: String): js.Function0[
    typings.tensorflowTfjsCore.backendMod.KernelBackend | js.Promise[typings.tensorflowTfjsCore.backendMod.KernelBackend]
  ] = js.native
}
