package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitTreeDiff extends StObject {
  
  /**
    * ObjectId of the base tree of this diff.
    */
  var baseTreeId: String
  
  /**
    * List of tree entries that differ between the base and target tree.  Renames and object type changes are returned as a delete for the old object and add for the new object.  If a continuation token is returned in the response header, some tree entries are yet to be processed and may yeild more diff entries. If the continuation token is not returned all the diff entries have been included in this response.
    */
  var diffEntries: js.Array[GitTreeDiffEntry]
  
  /**
    * ObjectId of the target tree of this diff.
    */
  var targetTreeId: String
  
  /**
    * REST Url to this resource.
    */
  var url: String
}
object GitTreeDiff {
  
  inline def apply(baseTreeId: String, diffEntries: js.Array[GitTreeDiffEntry], targetTreeId: String, url: String): GitTreeDiff = {
    val __obj = js.Dynamic.literal(baseTreeId = baseTreeId.asInstanceOf[js.Any], diffEntries = diffEntries.asInstanceOf[js.Any], targetTreeId = targetTreeId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitTreeDiff]
  }
  
  extension [Self <: GitTreeDiff](x: Self) {
    
    inline def setBaseTreeId(value: String): Self = StObject.set(x, "baseTreeId", value.asInstanceOf[js.Any])
    
    inline def setDiffEntries(value: js.Array[GitTreeDiffEntry]): Self = StObject.set(x, "diffEntries", value.asInstanceOf[js.Any])
    
    inline def setDiffEntriesVarargs(value: GitTreeDiffEntry*): Self = StObject.set(x, "diffEntries", js.Array(value :_*))
    
    inline def setTargetTreeId(value: String): Self = StObject.set(x, "targetTreeId", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
