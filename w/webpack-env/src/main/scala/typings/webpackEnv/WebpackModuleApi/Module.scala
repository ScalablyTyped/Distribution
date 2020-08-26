package typings.webpackEnv.WebpackModuleApi

import typings.node.NodeModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Module extends js.Object {
  var children: js.Array[NodeModule] = js.native
  var exports: js.Any = js.native
  var filename: String = js.native
  var hot: js.UndefOr[Hot] = js.native
  var id: String = js.native
  var loaded: Boolean = js.native
  var parent: NodeModule | Null = js.native
}

object Module {
  @scala.inline
  def apply(children: js.Array[NodeModule], exports: js.Any, filename: String, id: String, loaded: Boolean): Module = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
  @scala.inline
  implicit class ModuleOps[Self <: Module] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: NodeModule*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[NodeModule]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setExports(value: js.Any): Self = this.set("exports", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoaded(value: Boolean): Self = this.set("loaded", value.asInstanceOf[js.Any])
    @scala.inline
    def setHot(value: Hot): Self = this.set("hot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHot: Self = this.set("hot", js.undefined)
    @scala.inline
    def setParent(value: NodeModule): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentNull: Self = this.set("parent", null)
  }
  
}

