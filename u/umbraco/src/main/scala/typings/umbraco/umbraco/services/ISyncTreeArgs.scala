package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Sync tree args
  */
trait ISyncTreeArgs extends StObject {
  
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
  
  inline def apply(activate: Boolean, forceReload: Boolean, path: String, tree: String): ISyncTreeArgs = {
    val __obj = js.Dynamic.literal(activate = activate.asInstanceOf[js.Any], forceReload = forceReload.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISyncTreeArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISyncTreeArgs] (val x: Self) extends AnyVal {
    
    inline def setActivate(value: Boolean): Self = StObject.set(x, "activate", value.asInstanceOf[js.Any])
    
    inline def setForceReload(value: Boolean): Self = StObject.set(x, "forceReload", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setTree(value: String): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
  }
}
