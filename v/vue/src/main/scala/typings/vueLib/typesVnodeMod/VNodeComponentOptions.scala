package typings
package vueLib.typesVnodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VNodeComponentOptions extends js.Object {
  var Ctor: vueLib.typesVueMod.VueConstructor[vueLib.typesVueMod.Vue]
  var children: js.UndefOr[js.Array[VNode]] = js.undefined
  var listeners: js.UndefOr[js.Object] = js.undefined
  var propsData: js.UndefOr[js.Object] = js.undefined
  var tag: js.UndefOr[java.lang.String] = js.undefined
}

object VNodeComponentOptions {
  @scala.inline
  def apply(
    Ctor: vueLib.typesVueMod.VueConstructor[vueLib.typesVueMod.Vue],
    children: js.Array[VNode] = null,
    listeners: js.Object = null,
    propsData: js.Object = null,
    tag: java.lang.String = null
  ): VNodeComponentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Ctor")(Ctor)
    if (children != null) __obj.updateDynamic("children")(children)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (propsData != null) __obj.updateDynamic("propsData")(propsData)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[VNodeComponentOptions]
  }
}

