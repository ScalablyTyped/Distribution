package typings
package vueLib.typesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderContext[Props] extends js.Object {
  var children: js.Array[vueLib.typesVnodeMod.VNode]
  var data: vueLib.typesVnodeMod.VNodeData
  var injections: js.Any
  var listeners: org.scalablytyped.runtime.StringDictionary[js.Function | js.Array[js.Function]]
  var parent: vueLib.typesVueMod.Vue
  var props: Props
  var scopedSlots: org.scalablytyped.runtime.StringDictionary[vueLib.typesVnodeMod.ScopedSlot]
  def slots(): js.Any
}

object RenderContext {
  @scala.inline
  def apply[Props](
    children: js.Array[vueLib.typesVnodeMod.VNode],
    data: vueLib.typesVnodeMod.VNodeData,
    injections: js.Any,
    listeners: org.scalablytyped.runtime.StringDictionary[js.Function | js.Array[js.Function]],
    parent: vueLib.typesVueMod.Vue,
    props: Props,
    scopedSlots: org.scalablytyped.runtime.StringDictionary[vueLib.typesVnodeMod.ScopedSlot],
    slots: js.Function0[js.Any]
  ): RenderContext[Props] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("injections")(injections)
    __obj.updateDynamic("listeners")(listeners)
    __obj.updateDynamic("parent")(parent)
    __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    __obj.updateDynamic("scopedSlots")(scopedSlots)
    __obj.updateDynamic("slots")(slots)
    __obj.asInstanceOf[RenderContext[Props]]
  }
}

