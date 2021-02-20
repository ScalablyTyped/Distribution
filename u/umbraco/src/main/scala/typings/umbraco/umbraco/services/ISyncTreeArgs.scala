package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Sync tree args
  */
@js.native
trait ISyncTreeArgs extends StObject {
  
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
  implicit class ISyncTreeArgsMutableBuilder[Self <: ISyncTreeArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivate(value: Boolean): Self = StObject.set(x, "activate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceReload(value: Boolean): Self = StObject.set(x, "forceReload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTree(value: String): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
  }
}
