package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.backendMod.KernelBackend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFactory extends js.Object {
  var priority: Double
  def factory(): KernelBackend | js.Promise[KernelBackend]
}

object AnonFactory {
  @scala.inline
  def apply(factory: () => KernelBackend | js.Promise[KernelBackend], priority: Double): AnonFactory = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory), priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFactory]
  }
}

