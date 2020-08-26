package typings.virtualDom.VirtualDOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VNode extends VTree {
  var children: js.Array[VTree] = js.native
  var count: Double = js.native
  var descendantHooks: js.Array[_] = js.native
  var hasThunks: Boolean = js.native
  var hasWidgets: Boolean = js.native
  var hooks: js.Array[_] = js.native
  var key: js.UndefOr[String] = js.native
  var namespace: js.UndefOr[String] = js.native
  var properties: VProperties = js.native
  var tagName: String = js.native
  var `type`: String = js.native
  var version: String = js.native
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
    version: String
  ): VNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], descendantHooks = descendantHooks.asInstanceOf[js.Any], hasThunks = hasThunks.asInstanceOf[js.Any], hasWidgets = hasWidgets.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNode]
  }
  @scala.inline
  implicit class VNodeOps[Self <: VNode] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: VTree*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[VTree]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescendantHooksVarargs(value: js.Any*): Self = this.set("descendantHooks", js.Array(value :_*))
    @scala.inline
    def setDescendantHooks(value: js.Array[_]): Self = this.set("descendantHooks", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasThunks(value: Boolean): Self = this.set("hasThunks", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasWidgets(value: Boolean): Self = this.set("hasWidgets", value.asInstanceOf[js.Any])
    @scala.inline
    def setHooksVarargs(value: js.Any*): Self = this.set("hooks", js.Array(value :_*))
    @scala.inline
    def setHooks(value: js.Array[_]): Self = this.set("hooks", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: VProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
  }
  
}

