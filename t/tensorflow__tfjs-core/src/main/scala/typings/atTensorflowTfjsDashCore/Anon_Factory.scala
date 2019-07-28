package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distBackendsBackendMod.KernelBackend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Factory extends js.Object {
  var priority: Double
  def factory(): KernelBackend | js.Promise[KernelBackend]
}

object Anon_Factory {
  @scala.inline
  def apply(factory: () => KernelBackend | js.Promise[KernelBackend], priority: Double): Anon_Factory = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory), priority = priority)
  
    __obj.asInstanceOf[Anon_Factory]
  }
}

