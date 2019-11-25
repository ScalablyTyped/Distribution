package typings.vue.typesVnodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.vue.Anon_Render
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VNodeData extends js.Object {
  var attrs: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var `class`: js.UndefOr[js.Any] = js.undefined
  var directives: js.UndefOr[js.Array[VNodeDirective]] = js.undefined
  var domProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var hook: js.UndefOr[StringDictionary[js.Function]] = js.undefined
  var inlineTemplate: js.UndefOr[Anon_Render] = js.undefined
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[String | Double] = js.undefined
  var nativeOn: js.UndefOr[StringDictionary[js.Function | js.Array[js.Function]]] = js.undefined
  var on: js.UndefOr[StringDictionary[js.Function | js.Array[js.Function]]] = js.undefined
  var props: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var ref: js.UndefOr[String] = js.undefined
  var refInFor: js.UndefOr[Boolean] = js.undefined
  var scopedSlots: js.UndefOr[StringDictionary[js.UndefOr[ScopedSlot]]] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var slot: js.UndefOr[String] = js.undefined
  var staticClass: js.UndefOr[String] = js.undefined
  var staticStyle: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var style: js.UndefOr[String | js.Array[js.Object] | js.Object] = js.undefined
  var tag: js.UndefOr[String] = js.undefined
  var transition: js.UndefOr[js.Object] = js.undefined
}

object VNodeData {
  @scala.inline
  def apply(
    attrs: StringDictionary[js.Any] = null,
    `class`: js.Any = null,
    directives: js.Array[VNodeDirective] = null,
    domProps: StringDictionary[js.Any] = null,
    hook: StringDictionary[js.Function] = null,
    inlineTemplate: Anon_Render = null,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    key: String | Double = null,
    nativeOn: StringDictionary[js.Function | js.Array[js.Function]] = null,
    on: StringDictionary[js.Function | js.Array[js.Function]] = null,
    props: StringDictionary[js.Any] = null,
    ref: String = null,
    refInFor: js.UndefOr[Boolean] = js.undefined,
    scopedSlots: StringDictionary[js.UndefOr[ScopedSlot]] = null,
    show: js.UndefOr[Boolean] = js.undefined,
    slot: String = null,
    staticClass: String = null,
    staticStyle: StringDictionary[js.Any] = null,
    style: String | js.Array[js.Object] | js.Object = null,
    tag: String = null,
    transition: js.Object = null
  ): VNodeData = {
    val __obj = js.Dynamic.literal()
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (domProps != null) __obj.updateDynamic("domProps")(domProps.asInstanceOf[js.Any])
    if (hook != null) __obj.updateDynamic("hook")(hook.asInstanceOf[js.Any])
    if (inlineTemplate != null) __obj.updateDynamic("inlineTemplate")(inlineTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (nativeOn != null) __obj.updateDynamic("nativeOn")(nativeOn.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(refInFor)) __obj.updateDynamic("refInFor")(refInFor.asInstanceOf[js.Any])
    if (scopedSlots != null) __obj.updateDynamic("scopedSlots")(scopedSlots.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (staticClass != null) __obj.updateDynamic("staticClass")(staticClass.asInstanceOf[js.Any])
    if (staticStyle != null) __obj.updateDynamic("staticStyle")(staticStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNodeData]
  }
}

