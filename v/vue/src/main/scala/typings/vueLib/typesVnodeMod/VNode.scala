package typings
package vueLib.typesVnodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VNode extends _ScopedSlotReturnValue {
  var children: js.UndefOr[js.Array[VNode]] = js.undefined
  var componentInstance: js.UndefOr[vueLib.typesVueMod.Vue] = js.undefined
  var componentOptions: js.UndefOr[VNodeComponentOptions] = js.undefined
  var context: js.UndefOr[vueLib.typesVueMod.Vue] = js.undefined
  var data: js.UndefOr[VNodeData] = js.undefined
  var elm: js.UndefOr[stdLib.Node] = js.undefined
  var isComment: scala.Boolean
  var isRootInsert: scala.Boolean
  var isStatic: js.UndefOr[scala.Boolean] = js.undefined
  var key: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var ns: js.UndefOr[java.lang.String] = js.undefined
  var parent: js.UndefOr[VNode] = js.undefined
  var raw: js.UndefOr[scala.Boolean] = js.undefined
  var tag: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object VNode {
  @scala.inline
  def apply(
    isComment: scala.Boolean,
    isRootInsert: scala.Boolean,
    children: js.Array[VNode] = null,
    componentInstance: vueLib.typesVueMod.Vue = null,
    componentOptions: VNodeComponentOptions = null,
    context: vueLib.typesVueMod.Vue = null,
    data: VNodeData = null,
    elm: stdLib.Node = null,
    isStatic: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String | scala.Double = null,
    ns: java.lang.String = null,
    parent: VNode = null,
    raw: js.UndefOr[scala.Boolean] = js.undefined,
    tag: java.lang.String = null,
    text: java.lang.String = null
  ): VNode = {
    val __obj = js.Dynamic.literal(isComment = isComment, isRootInsert = isRootInsert)
    if (children != null) __obj.updateDynamic("children")(children)
    if (componentInstance != null) __obj.updateDynamic("componentInstance")(componentInstance)
    if (componentOptions != null) __obj.updateDynamic("componentOptions")(componentOptions)
    if (context != null) __obj.updateDynamic("context")(context)
    if (data != null) __obj.updateDynamic("data")(data)
    if (elm != null) __obj.updateDynamic("elm")(elm)
    if (!js.isUndefined(isStatic)) __obj.updateDynamic("isStatic")(isStatic)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ns != null) __obj.updateDynamic("ns")(ns)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[VNode]
  }
}

