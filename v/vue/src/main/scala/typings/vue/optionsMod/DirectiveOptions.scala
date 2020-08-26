package typings.vue.optionsMod

import typings.std.HTMLElement
import typings.vue.vnodeMod.VNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectiveOptions extends js.Object {
  var bind: js.UndefOr[DirectiveFunction] = js.native
  var componentUpdated: js.UndefOr[DirectiveFunction] = js.native
  var inserted: js.UndefOr[DirectiveFunction] = js.native
  var unbind: js.UndefOr[DirectiveFunction] = js.native
  var update: js.UndefOr[DirectiveFunction] = js.native
}

object DirectiveOptions {
  @scala.inline
  def apply(): DirectiveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectiveOptions]
  }
  @scala.inline
  implicit class DirectiveOptionsOps[Self <: DirectiveOptions] (val x: Self) extends AnyVal {
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
    def setBind(
      value: (/* el */ HTMLElement, /* binding */ DirectiveBinding, /* vnode */ VNode, /* oldVnode */ VNode) => Unit
    ): Self = this.set("bind", js.Any.fromFunction4(value))
    @scala.inline
    def deleteBind: Self = this.set("bind", js.undefined)
    @scala.inline
    def setComponentUpdated(
      value: (/* el */ HTMLElement, /* binding */ DirectiveBinding, /* vnode */ VNode, /* oldVnode */ VNode) => Unit
    ): Self = this.set("componentUpdated", js.Any.fromFunction4(value))
    @scala.inline
    def deleteComponentUpdated: Self = this.set("componentUpdated", js.undefined)
    @scala.inline
    def setInserted(
      value: (/* el */ HTMLElement, /* binding */ DirectiveBinding, /* vnode */ VNode, /* oldVnode */ VNode) => Unit
    ): Self = this.set("inserted", js.Any.fromFunction4(value))
    @scala.inline
    def deleteInserted: Self = this.set("inserted", js.undefined)
    @scala.inline
    def setUnbind(
      value: (/* el */ HTMLElement, /* binding */ DirectiveBinding, /* vnode */ VNode, /* oldVnode */ VNode) => Unit
    ): Self = this.set("unbind", js.Any.fromFunction4(value))
    @scala.inline
    def deleteUnbind: Self = this.set("unbind", js.undefined)
    @scala.inline
    def setUpdate(
      value: (/* el */ HTMLElement, /* binding */ DirectiveBinding, /* vnode */ VNode, /* oldVnode */ VNode) => Unit
    ): Self = this.set("update", js.Any.fromFunction4(value))
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
  
}

