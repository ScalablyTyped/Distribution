package typings
package umbracoLib.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sync tree args
  */
trait ISyncTreeArgs extends js.Object {
  /* optional, specifies whether to set the synced node to be the active node, this will default to true if not specified*/
  var activate: scala.Boolean
  /* optional, specifies whether to force reload the node data from the server even if it already exists in the tree currently*/
  var forceReload: scala.Boolean
  /*the path to sync the tree to*/
  var path: java.lang.String
  /*the tree alias to sync to*/
  var tree: java.lang.String
}

object ISyncTreeArgs {
  @scala.inline
  def apply(
    activate: scala.Boolean,
    forceReload: scala.Boolean,
    path: java.lang.String,
    tree: java.lang.String
  ): ISyncTreeArgs = {
    val __obj = js.Dynamic.literal(activate = activate, forceReload = forceReload, path = path, tree = tree)
  
    __obj.asInstanceOf[ISyncTreeArgs]
  }
}

