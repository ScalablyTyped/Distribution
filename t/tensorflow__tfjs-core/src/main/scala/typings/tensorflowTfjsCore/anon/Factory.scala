package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.backendMod.KernelBackend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Factory extends js.Object {
  var priority: Double = js.native
  def factory(): KernelBackend | js.Promise[KernelBackend] = js.native
}

object Factory {
  @scala.inline
  def apply(factory: () => KernelBackend | js.Promise[KernelBackend], priority: Double): Factory = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory), priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[Factory]
  }
  @scala.inline
  implicit class FactoryOps[Self <: Factory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFactory(value: () => KernelBackend | js.Promise[KernelBackend]): Self = this.set("factory", js.Any.fromFunction0(value))
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
  }
  
}

