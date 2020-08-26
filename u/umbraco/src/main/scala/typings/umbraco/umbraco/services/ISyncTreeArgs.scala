package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sync tree args
  */
@js.native
trait ISyncTreeArgs extends js.Object {
  /* optional, specifies whether to set the synced node to be the active node, this will default to true if not specified*/
  var activate: Boolean = js.native
  /* optional, specifies whether to force reload the node data from the server even if it already exists in the tree currently*/
  var forceReload: Boolean = js.native
  /*the path to sync the tree to*/
  var path: String = js.native
  /*the tree alias to sync to*/
  var tree: String = js.native
}

object ISyncTreeArgs {
  @scala.inline
  def apply(activate: Boolean, forceReload: Boolean, path: String, tree: String): ISyncTreeArgs = {
    val __obj = js.Dynamic.literal(activate = activate.asInstanceOf[js.Any], forceReload = forceReload.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISyncTreeArgs]
  }
  @scala.inline
  implicit class ISyncTreeArgsOps[Self <: ISyncTreeArgs] (val x: Self) extends AnyVal {
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
    def setActivate(value: Boolean): Self = this.set("activate", value.asInstanceOf[js.Any])
    @scala.inline
    def setForceReload(value: Boolean): Self = this.set("forceReload", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setTree(value: String): Self = this.set("tree", value.asInstanceOf[js.Any])
  }
  
}

