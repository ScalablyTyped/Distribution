package typings.tinajsTina.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentLifecycles extends js.Object {
  def attached(): Unit = js.native
  def created(): Unit = js.native
  def detached(): Unit = js.native
  def moved(): Unit = js.native
  def ready(): Unit = js.native
}

object ComponentLifecycles {
  @scala.inline
  def apply(
    attached: () => Unit,
    created: () => Unit,
    detached: () => Unit,
    moved: () => Unit,
    ready: () => Unit
  ): ComponentLifecycles = {
    val __obj = js.Dynamic.literal(attached = js.Any.fromFunction0(attached), created = js.Any.fromFunction0(created), detached = js.Any.fromFunction0(detached), moved = js.Any.fromFunction0(moved), ready = js.Any.fromFunction0(ready))
    __obj.asInstanceOf[ComponentLifecycles]
  }
  @scala.inline
  implicit class ComponentLifecyclesOps[Self <: ComponentLifecycles] (val x: Self) extends AnyVal {
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
    def setAttached(value: () => Unit): Self = this.set("attached", js.Any.fromFunction0(value))
    @scala.inline
    def setCreated(value: () => Unit): Self = this.set("created", js.Any.fromFunction0(value))
    @scala.inline
    def setDetached(value: () => Unit): Self = this.set("detached", js.Any.fromFunction0(value))
    @scala.inline
    def setMoved(value: () => Unit): Self = this.set("moved", js.Any.fromFunction0(value))
    @scala.inline
    def setReady(value: () => Unit): Self = this.set("ready", js.Any.fromFunction0(value))
  }
  
}

