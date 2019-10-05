package typings.virtualDashDom.VirtualDOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VNode extends VTree {
  var children: js.Array[VTree]
  var count: Double
  var descendantHooks: js.Array[_]
  var hasThunks: Boolean
  var hasWidgets: Boolean
  var hooks: js.Array[_]
  var key: js.UndefOr[String] = js.undefined
  var namespace: js.UndefOr[String] = js.undefined
  var properties: VProperties
  var tagName: String
  var `type`: String
  var version: String
}

object VNode {
  @scala.inline
  def apply(
    children: js.Array[VTree],
    count: Double,
    descendantHooks: js.Array[_],
    hasThunks: Boolean,
    hasWidgets: Boolean,
    hooks: js.Array[_],
    properties: VProperties,
    tagName: String,
    `type`: String,
    version: String,
    key: String = null,
    namespace: String = null
  ): VNode = {
    val __obj = js.Dynamic.literal(children = children, count = count, descendantHooks = descendantHooks, hasThunks = hasThunks, hasWidgets = hasWidgets, hooks = hooks, properties = properties, tagName = tagName, version = version)
    __obj.updateDynamic("type")(`type`)
    if (key != null) __obj.updateDynamic("key")(key)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    __obj.asInstanceOf[VNode]
  }
}

