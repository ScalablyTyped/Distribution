package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitCommitChanges extends StObject {
  
  var changeCounts: ChangeCountDictionary = js.native
  
  var changes: js.Array[GitChange] = js.native
}
object GitCommitChanges {
  
  @scala.inline
  def apply(changeCounts: ChangeCountDictionary, changes: js.Array[GitChange]): GitCommitChanges = {
    val __obj = js.Dynamic.literal(changeCounts = changeCounts.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCommitChanges]
  }
  
  @scala.inline
  implicit class GitCommitChangesMutableBuilder[Self <: GitCommitChanges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeCounts(value: ChangeCountDictionary): Self = StObject.set(x, "changeCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChanges(value: js.Array[GitChange]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangesVarargs(value: GitChange*): Self = StObject.set(x, "changes", js.Array(value :_*))
  }
}
