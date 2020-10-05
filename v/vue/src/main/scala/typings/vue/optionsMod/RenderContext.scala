package typings.vue.optionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.vue.vnodeMod.NormalizedScopedSlot
import typings.vue.vnodeMod.VNode
import typings.vue.vnodeMod.VNodeData
import typings.vue.vueMod.Vue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderContext[Props] extends js.Object {
  var children: js.Array[VNode] = js.native
  var data: VNodeData = js.native
  var injections: js.Any = js.native
  var listeners: StringDictionary[js.Function | js.Array[js.Function]] = js.native
  var parent: Vue = js.native
  var props: Props = js.native
  var scopedSlots: StringDictionary[NormalizedScopedSlot] = js.native
  def slots(): js.Any = js.native
}

object RenderContext {
  @scala.inline
  def apply[Props](
    children: js.Array[VNode],
    data: VNodeData,
    injections: js.Any,
    listeners: StringDictionary[js.Function | js.Array[js.Function]],
    parent: Vue,
    props: Props,
    scopedSlots: StringDictionary[NormalizedScopedSlot],
    slots: () => js.Any
  ): RenderContext[Props] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], injections = injections.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], scopedSlots = scopedSlots.asInstanceOf[js.Any], slots = js.Any.fromFunction0(slots))
    __obj.asInstanceOf[RenderContext[Props]]
  }
  @scala.inline
  implicit class RenderContextOps[Self <: RenderContext[_], Props] (val x: Self with RenderContext[Props]) extends AnyVal {
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
    def setChildrenVarargs(value: VNode*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[VNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: VNodeData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setInjections(value: js.Any): Self = this.set("injections", value.asInstanceOf[js.Any])
    @scala.inline
    def setListeners(value: StringDictionary[js.Function | js.Array[js.Function]]): Self = this.set("listeners", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: Vue): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setProps(value: Props): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopedSlots(value: StringDictionary[NormalizedScopedSlot]): Self = this.set("scopedSlots", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlots(value: () => js.Any): Self = this.set("slots", js.Any.fromFunction0(value))
  }
  
}

