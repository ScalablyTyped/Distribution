package typings.vue.typesOptionsMod

import typings.std.HTMLElement
import typings.vue.typesVnodeMod.VNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectiveOptions extends js.Object {
  var bind: js.UndefOr[DirectiveFunction] = js.undefined
  var componentUpdated: js.UndefOr[DirectiveFunction] = js.undefined
  var inserted: js.UndefOr[DirectiveFunction] = js.undefined
  var unbind: js.UndefOr[DirectiveFunction] = js.undefined
  var update: js.UndefOr[DirectiveFunction] = js.undefined
}

object DirectiveOptions {
  @scala.inline
  def apply(
    bind: (/* el */ HTMLElement, /* binding */ DirectiveBinding, /* vnode */ VNode, /* oldVnode */ VNode) => Unit = null,
    componentUpdated: (/* el */ HTMLElement, /* binding */ DirectiveBinding, /* vnode */ VNode, /* oldVnode */ VNode) => Unit = null,
    inserted: (/* el */ HTMLElement, /* binding */ DirectiveBinding, /* vnode */ VNode, /* oldVnode */ VNode) => Unit = null,
    unbind: (/* el */ HTMLElement, /* binding */ DirectiveBinding, /* vnode */ VNode, /* oldVnode */ VNode) => Unit = null,
    update: (/* el */ HTMLElement, /* binding */ DirectiveBinding, /* vnode */ VNode, /* oldVnode */ VNode) => Unit = null
  ): DirectiveOptions = {
    val __obj = js.Dynamic.literal()
    if (bind != null) __obj.updateDynamic("bind")(js.Any.fromFunction4(bind))
    if (componentUpdated != null) __obj.updateDynamic("componentUpdated")(js.Any.fromFunction4(componentUpdated))
    if (inserted != null) __obj.updateDynamic("inserted")(js.Any.fromFunction4(inserted))
    if (unbind != null) __obj.updateDynamic("unbind")(js.Any.fromFunction4(unbind))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction4(update))
    __obj.asInstanceOf[DirectiveOptions]
  }
}

