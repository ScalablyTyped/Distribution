package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sync tree args
  */
trait ISyncTreeArgs extends js.Object {
  /* optional, specifies whether to set the synced node to be the active node, this will default to true if not specified*/
  var activate: Boolean
  /* optional, specifies whether to force reload the node data from the server even if it already exists in the tree currently*/
  var forceReload: Boolean
  /*the path to sync the tree to*/
  var path: String
  /*the tree alias to sync to*/
  var tree: String
}

object ISyncTreeArgs {
  @scala.inline
  def apply(activate: Boolean, forceReload: Boolean, path: String, tree: String): ISyncTreeArgs = {
    val __obj = js.Dynamic.literal(activate = activate.asInstanceOf[js.Any], forceReload = forceReload.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISyncTreeArgs]
  }
}

