package typings.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Destruction extends js.Object {
  def destructor(): Unit = js.native
}

object Destruction {
  @scala.inline
  def apply(destructor: () => Unit): Destruction = {
    val __obj = js.Dynamic.literal(destructor = js.Any.fromFunction0(destructor))
    __obj.asInstanceOf[Destruction]
  }
  @scala.inline
  implicit class DestructionOps[Self <: Destruction] (val x: Self) extends AnyVal {
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
    def setDestructor(value: () => Unit): Self = this.set("destructor", js.Any.fromFunction0(value))
  }
  
}

