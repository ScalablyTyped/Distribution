package typings.virtualDom.VirtualDOM

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
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], descendantHooks = descendantHooks.asInstanceOf[js.Any], hasThunks = hasThunks.asInstanceOf[js.Any], hasWidgets = hasWidgets.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNode]
  }
}

