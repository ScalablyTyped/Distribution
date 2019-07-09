package typings
package atTensorflowTfjsDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Factory extends js.Object {
  var priority: scala.Double
  def factory(): atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend | js.Promise[atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend]
}

object Anon_Factory {
  @scala.inline
  def apply(
    factory: () => atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend | js.Promise[atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend],
    priority: scala.Double
  ): Anon_Factory = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory), priority = priority)
  
    __obj.asInstanceOf[Anon_Factory]
  }
}

