package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitLastChangeTreeItems extends StObject {
  
  /**
    * The list of commits referenced by Items, if they were requested.
    */
  var commits: js.Array[GitCommitRef]
  
  /**
    * The last change of items.
    */
  var items: js.Array[GitLastChangeItem]
  
  /**
    * The last explored time, in case the result is not comprehensive. Null otherwise.
    */
  var lastExploredTime: js.Date
}
object GitLastChangeTreeItems {
  
  inline def apply(commits: js.Array[GitCommitRef], items: js.Array[GitLastChangeItem], lastExploredTime: js.Date): GitLastChangeTreeItems = {
    val __obj = js.Dynamic.literal(commits = commits.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], lastExploredTime = lastExploredTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitLastChangeTreeItems]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GitLastChangeTreeItems] (val x: Self) extends AnyVal {
    
    inline def setCommits(value: js.Array[GitCommitRef]): Self = StObject.set(x, "commits", value.asInstanceOf[js.Any])
    
    inline def setCommitsVarargs(value: GitCommitRef*): Self = StObject.set(x, "commits", js.Array(value*))
    
    inline def setItems(value: js.Array[GitLastChangeItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: GitLastChangeItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLastExploredTime(value: js.Date): Self = StObject.set(x, "lastExploredTime", value.asInstanceOf[js.Any])
  }
}
