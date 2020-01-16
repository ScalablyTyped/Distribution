package typings.webpackDashEnv.__WebpackModuleApi

import typings.node.NodeModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Module extends js.Object {
  var children: js.Array[NodeModule]
  var exports: js.Any
  var filename: String
  var hot: js.UndefOr[Hot] = js.undefined
  var id: String
  var loaded: Boolean
  var parent: NodeModule | Null
}

object Module {
  @scala.inline
  def apply(
    children: js.Array[NodeModule],
    exports: js.Any,
    filename: String,
    id: String,
    loaded: Boolean,
    hot: Hot = null,
    parent: NodeModule = null
  ): Module = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any])
    if (hot != null) __obj.updateDynamic("hot")(hot.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
}

