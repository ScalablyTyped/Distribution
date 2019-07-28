package typings.vue.typesVnodeMod

import typings.vue.typesVueMod.Vue
import typings.vue.typesVueMod.VueConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VNodeComponentOptions extends js.Object {
  var Ctor: VueConstructor[Vue]
  var children: js.UndefOr[js.Array[VNode]] = js.undefined
  var listeners: js.UndefOr[js.Object] = js.undefined
  var propsData: js.UndefOr[js.Object] = js.undefined
  var tag: js.UndefOr[String] = js.undefined
}

object VNodeComponentOptions {
  @scala.inline
  def apply(
    Ctor: VueConstructor[Vue],
    children: js.Array[VNode] = null,
    listeners: js.Object = null,
    propsData: js.Object = null,
    tag: String = null
  ): VNodeComponentOptions = {
    val __obj = js.Dynamic.literal(Ctor = Ctor)
    if (children != null) __obj.updateDynamic("children")(children)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (propsData != null) __obj.updateDynamic("propsData")(propsData)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[VNodeComponentOptions]
  }
}

