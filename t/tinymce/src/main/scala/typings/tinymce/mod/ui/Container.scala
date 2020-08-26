package typings.tinymce.mod.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Container extends js.Object {
  def add(items: js.Any): Collection = js.native
  def items(): Collection = js.native
}

object Container {
  @scala.inline
  def apply(add: js.Any => Collection, items: () => Collection): Container = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), items = js.Any.fromFunction0(items))
    __obj.asInstanceOf[Container]
  }
  @scala.inline
  implicit class ContainerOps[Self <: Container] (val x: Self) extends AnyVal {
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
    def setAdd(value: js.Any => Collection): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def setItems(value: () => Collection): Self = this.set("items", js.Any.fromFunction0(value))
  }
  
}

