package typings
package virtualDashDomLib.VirtualDOMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VNode extends VTree {
  var children: js.Array[VTree]
  var count: scala.Double
  var descendantHooks: js.Array[_]
  var hasThunks: scala.Boolean
  var hasWidgets: scala.Boolean
  var hooks: js.Array[_]
  var key: js.UndefOr[java.lang.String] = js.undefined
  var namespace: js.UndefOr[java.lang.String] = js.undefined
  var properties: VProperties
  var tagName: java.lang.String
  var `type`: java.lang.String
  var version: java.lang.String
}

object VNode {
  @scala.inline
  def apply(
    children: js.Array[VTree],
    count: scala.Double,
    descendantHooks: js.Array[_],
    hasThunks: scala.Boolean,
    hasWidgets: scala.Boolean,
    hooks: js.Array[_],
    properties: VProperties,
    tagName: java.lang.String,
    `type`: java.lang.String,
    version: java.lang.String,
    key: java.lang.String = null,
    namespace: java.lang.String = null
  ): VNode = {
    val __obj = js.Dynamic.literal(children = children, count = count, descendantHooks = descendantHooks, hasThunks = hasThunks, hasWidgets = hasWidgets, hooks = hooks, properties = properties, tagName = tagName, version = version)
    __obj.updateDynamic("type")(`type`)
    if (key != null) __obj.updateDynamic("key")(key)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    __obj.asInstanceOf[VNode]
  }
}

