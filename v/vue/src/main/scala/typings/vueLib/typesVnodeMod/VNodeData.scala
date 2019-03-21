package typings
package vueLib.typesVnodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VNodeData extends js.Object {
  var attrs: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var `class`: js.UndefOr[js.Any] = js.undefined
  var directives: js.UndefOr[js.Array[VNodeDirective]] = js.undefined
  var domProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var hook: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Function]] = js.undefined
  var inlineTemplate: js.UndefOr[vueLib.Anon_Render] = js.undefined
  var keepAlive: js.UndefOr[scala.Boolean] = js.undefined
  var key: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var nativeOn: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Function | js.Array[js.Function]]] = js.undefined
  var on: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Function | js.Array[js.Function]]] = js.undefined
  var props: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var ref: js.UndefOr[java.lang.String] = js.undefined
  var refInFor: js.UndefOr[scala.Boolean] = js.undefined
  var scopedSlots: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.UndefOr[ScopedSlot]]] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var slot: js.UndefOr[java.lang.String] = js.undefined
  var staticClass: js.UndefOr[java.lang.String] = js.undefined
  var staticStyle: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var style: js.UndefOr[java.lang.String | js.Array[js.Object] | js.Object] = js.undefined
  var tag: js.UndefOr[java.lang.String] = js.undefined
  var transition: js.UndefOr[js.Object] = js.undefined
}

object VNodeData {
  @scala.inline
  def apply(
    attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    `class`: js.Any = null,
    directives: js.Array[VNodeDirective] = null,
    domProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    hook: org.scalablytyped.runtime.StringDictionary[js.Function] = null,
    inlineTemplate: vueLib.Anon_Render = null,
    keepAlive: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String | scala.Double = null,
    nativeOn: org.scalablytyped.runtime.StringDictionary[js.Function | js.Array[js.Function]] = null,
    on: org.scalablytyped.runtime.StringDictionary[js.Function | js.Array[js.Function]] = null,
    props: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    ref: java.lang.String = null,
    refInFor: js.UndefOr[scala.Boolean] = js.undefined,
    scopedSlots: org.scalablytyped.runtime.StringDictionary[js.UndefOr[ScopedSlot]] = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    slot: java.lang.String = null,
    staticClass: java.lang.String = null,
    staticStyle: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    style: java.lang.String | js.Array[js.Object] | js.Object = null,
    tag: java.lang.String = null,
    transition: js.Object = null
  ): VNodeData = {
    val __obj = js.Dynamic.literal()
    if (attrs != null) __obj.updateDynamic("attrs")(attrs)
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (domProps != null) __obj.updateDynamic("domProps")(domProps)
    if (hook != null) __obj.updateDynamic("hook")(hook)
    if (inlineTemplate != null) __obj.updateDynamic("inlineTemplate")(inlineTemplate)
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (nativeOn != null) __obj.updateDynamic("nativeOn")(nativeOn)
    if (on != null) __obj.updateDynamic("on")(on)
    if (props != null) __obj.updateDynamic("props")(props)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    if (!js.isUndefined(refInFor)) __obj.updateDynamic("refInFor")(refInFor)
    if (scopedSlots != null) __obj.updateDynamic("scopedSlots")(scopedSlots)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (slot != null) __obj.updateDynamic("slot")(slot)
    if (staticClass != null) __obj.updateDynamic("staticClass")(staticClass)
    if (staticStyle != null) __obj.updateDynamic("staticStyle")(staticStyle)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (transition != null) __obj.updateDynamic("transition")(transition)
    __obj.asInstanceOf[VNodeData]
  }
}

